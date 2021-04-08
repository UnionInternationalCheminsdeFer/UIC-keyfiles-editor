package BarCodeKeyExchange.application;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.security.PublicKey;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.BaseSelectionListenerAction;


import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.PublicKeyType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;
import BarCodeKeyExchange.utils.SecurityUtils;


public class ExportPublicKeyToPemAction extends BaseSelectionListenerAction {
	


	public ExportPublicKeyToPemAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_ExportPublicKeyAsPemFile);
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
		if (selection == null) return false;
    	if (selection.size() == 0)   return false;
    	if (selection.size() > 1)   return false;    	
    	if (!(selection.getFirstElement() instanceof KeyType || 
    		  selection.getFirstElement() instanceof PublicKeyType)) return false;
    	
    	KeyType key = null;
    	PublicKeyType publicKey = null;
    	if (selection.getFirstElement() instanceof KeyType) {
    		key = (KeyType) selection.getFirstElement();
    		publicKey = key.getPublicKey();    		
    	} else {
        	if (selection.getFirstElement() instanceof PublicKeyType) {
        		publicKey = (PublicKeyType) selection.getFirstElement();
        	}
    	}
    	
    	if (publicKey == null){
    		return false;
    	}
		byte[] securityFeature = publicKey.getValue();		
		
		boolean isCertificate = SecurityUtils.testForCertificate(securityFeature);
		boolean isPublicKey = SecurityUtils.testForPublicKey(securityFeature);
		
		if (!isCertificate && !isPublicKey) {
			return false;
		}    	
    	
		return true;
	}
	

	public void runExternal (IStructuredSelection selection)
	{
		if (!checkSelection(selection)) return;
		run (selection);
	}

	public void run (IStructuredSelection selection)
	{

		if (!checkSelection(selection)) return;
			
		PublicKeyType publicKey = null; 
    	if (selection.getFirstElement() instanceof KeyType){
    		KeyType xmlKey = (KeyType) selection.getFirstElement();
    		publicKey = xmlKey.getPublicKey();    		
    	} else if (selection.getFirstElement() instanceof PublicKeyType){
    		publicKey = (PublicKeyType) selection.getFirstElement();
    	} else {
    		return;
    	}
		
		try {
				Shell shell = Display.getDefault().getActiveShell();
	            FileDialog fd = new FileDialog(shell, SWT.SAVE);
	            fd.setText(this.getText());
	            String[] filterExt = {"*.pem" };
	            fd.setFilterExtensions(filterExt);
	            String path = fd.open();
	            
	            if (path== null || path.length() < 1) {
	           	 return;
	            }
	            
	            String s = convertToPem(publicKey);

	    		FileOutputStream outputStream = new FileOutputStream(path);
	    		outputStream.write(s.getBytes());
	    		outputStream.close();		            

		} catch (Exception e){
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Generic_FileCreate +'\n'+e.getMessage());
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}

	}
	
	protected static String convertToPem(PublicKeyType publicKey){
		
		 byte[] securityFeature = publicKey.getValue();	
		 
		 boolean isPublicKey = SecurityUtils.testForPublicKey(securityFeature);	
		 
		 if (isPublicKey) {
			 return SecurityUtils.convertToPem(securityFeature);
		 }
		 
		 ByteArrayInputStream is = new ByteArrayInputStream(securityFeature);		

		 CertificateFactory fact;
		 try {
				fact = CertificateFactory.getInstance("X.509");
				X509Certificate cer = (X509Certificate) fact.generateCertificate(is);
				PublicKey key = cer.getPublicKey();		
				if (key != null){
					securityFeature = key.getEncoded();
					return SecurityUtils.convertToPem(key.getEncoded());
				}
		} catch (CertificateException e) {
				return null;
		}
		return null;

	}

	

}
