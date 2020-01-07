package BarCodeKeyExchange.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import barcode.barCodeData.SecurityUtils;

import BarCodeKeyExchange.DocumentRoot;
import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.KeysType;
import BarCodeKeyExchange.PublicKeyType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditor;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;


public class ExportAllKeysToPemAction extends BaseSelectionListenerAction {
	


	public ExportAllKeysToPemAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_ExportAllToPem);
		this.setToolTipText(this.getText());			
	}


    public boolean updateSelection (IStructuredSelection selection)
    {
  		this.setEnabled(false);

  		if (checkSelection(selection)) 	{
  			this.setEnabled(true);
  			return true;
  		}
  		return false;
    }

	public void run() {
		run( this.getStructuredSelection() );
		return;
	}

	private boolean checkSelection(IStructuredSelection selection)
	{
		EObject root = null;

		try {
			IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			BarCodeKeyExchangeEditor editor = (BarCodeKeyExchangeEditor) editorPart;
			TransactionalEditingDomain domain = (TransactionalEditingDomain) editor.getEditingDomain();
			root  = (EObject) domain.getResourceSet().getResources().get(0).getContents().get(0).eContents().get(0);
		} catch (Exception e){
			return false;
		}
		
		
		if (root == null && selection.getFirstElement() instanceof EObject) {
			root = (EObject) selection.getFirstElement();
		}

		if (root == null) return false;

    	KeysType keys =  null;
    	EObject eObject = null;
    	if (root instanceof KeysType) {
    		keys = (KeysType) root;    
    	} else if (root instanceof DocumentRoot)  {    	
    		keys = ((DocumentRoot)root).getKeys();
    	} else  {
    		eObject = (EObject) root;
    		while (!(eObject instanceof KeysType) || eObject == null) {
    			eObject = eObject.eContainer();
    		}
    	} 
    	if (keys ==  null && eObject instanceof KeysType){
    		keys = (KeysType) eObject;
    	}     	
    	   	
    	if (keys == null) {
    		return false;
    	}
    	
		if (keys.getKey().isEmpty()) {
			return false;
		}    	
    	
    	for (KeyType key : keys.getKey()){
    		
    		if (key.getPublicKey() != null){
    		
    		
    			PublicKeyType  publicKey = key.getPublicKey();
    		
    		   		
    			byte[] securityFeature = publicKey.getValue();		
    		
    			if (securityFeature != null){

    				boolean isCertificate = SecurityUtils.testForCertificate(securityFeature);
    				boolean isPublicKey = SecurityUtils.testForPublicKey(securityFeature);
    		
    				if (isCertificate || isPublicKey) {
    					return true;
    				}      
    			}
    		}
    		
    		
    	}
    	
		return false;
	}
	

	public void runExternal (IStructuredSelection selection)
	{
		if (!checkSelection(selection)) return;
		run (selection);
	}

	public void run (IStructuredSelection selection)
	{

			
		if (!checkSelection(selection)) return;
		
		EObject root = null;

		try {
			IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			BarCodeKeyExchangeEditor editor = (BarCodeKeyExchangeEditor) editorPart;
			TransactionalEditingDomain domain = (TransactionalEditingDomain) editor.getEditingDomain();
			root  = (EObject) domain.getResourceSet().getResources().get(0).getContents().get(0).eContents().get(0);
		} catch (Exception e){
			return;
		}
		
		
		if (root == null && selection.getFirstElement() instanceof EObject) {
			root = (EObject) selection.getFirstElement();
		}
      	
      	KeysType keys =  null;
      	EObject eObject = null;
      	if (root instanceof KeysType) {
      		keys = (KeysType) root;    
      	} else if (root instanceof DocumentRoot)  {    	
      		keys = ((DocumentRoot)root).getKeys();
      	} else  {
      		eObject = (EObject) root;
      		while (!(eObject instanceof KeysType) || eObject == null) {
      			eObject = eObject.eContainer();
      		}
      	} 
      	if (keys ==  null && eObject instanceof KeysType){
      		keys = (KeysType) eObject;
      	}     	
    	   	
    	if (keys == null) {
    		return;
    	}

    	String path = "";
		
		try {
				Shell shell = BarCodeKeyExchangeEditorPlugin.getPlugin().getWorkbench().getActiveWorkbenchWindow().getShell();
				DirectoryDialog fd = new DirectoryDialog(shell);
	            fd.setText(this.getText());
	            path = fd.open();
	            
	            if (path== null || path.length() < 1) {
	           	 return;
	            }
	            

		} catch (Exception e){
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Generic_FileCreate +'\n'+e.getMessage());
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}

    	
    	for (KeyType key : keys.getKey()){
    		PublicKeyType  publicKey = key.getPublicKey();
    		
            String s = convertToPem(publicKey);
            
            String filename = path + File.separator + String.format("%04d%05d.pem", key.getIssuerCode(), key.getId());
            

    		FileOutputStream outputStream;
			try {
				outputStream = new FileOutputStream(filename);
				outputStream.write(s.getBytes());
				outputStream.close();
			} catch (FileNotFoundException e) {
				MessageDialog.openError(
						Display.getDefault().getActiveShell(),
						LocalLanguageSupport._Generic_Error,
						LocalLanguageSupport._Generic_FileCreate +'\n'+e.getMessage());
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);				
			} catch (IOException e) {
				MessageDialog.openError(
						Display.getDefault().getActiveShell(),
						LocalLanguageSupport._Generic_Error,
						LocalLanguageSupport._Generic_FileCreate +'\n'+e.getMessage());
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);	
			}

    	}

		
	}
	
	protected static String convertToPem(PublicKeyType publicKey){
		 byte[] securityFeature = publicKey.getValue();			 
		 return SecurityUtils.convertToPem(securityFeature);
		 
	}


}
