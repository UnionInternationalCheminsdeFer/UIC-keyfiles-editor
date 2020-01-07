package BarCodeKeyExchange.application;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.TestbarcodeType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;


public class SaveTestBarcodeAction extends BaseSelectionListenerAction {
	


	public SaveTestBarcodeAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_SaveTestBarcode);	
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
    	KeyType key = null;
    	if (selection.getFirstElement() instanceof EObject) {	
    		EObject current = (EObject) selection.getFirstElement();
    		while (key ==  null && current != null) {
    			if (current instanceof KeyType){
    				key = (KeyType) current;
    			} else {
    				current = current.eContainer();
    			}
    		}  
    	}
    	if (key == null) return false;
    	
    	if (key.getTestbarcode() == null ||
    		key.getTestbarcode().getImagedata() == null ||
    		key.getTestbarcode().getImagedata().length == 0) {
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
	
		KeyType key = null;
    		
    	if (selection.getFirstElement() instanceof EObject) {	
    		EObject current = (EObject) selection.getFirstElement();
    		while (key ==  null && current != null) {
    			if (current instanceof KeyType) {
    				key = (KeyType) current;
    			} else {
    				current = current.eContainer();
    			}
    		}  
    	}

	    if (key == null) return;
	    
	    TestbarcodeType testBarcode = key.getTestbarcode();
	    
	    String suffix = testBarcode.getImagetype().getLiteral();
	    if (suffix == null || 
	    	suffix.length() < 3) {
	    	suffix = "png";
	    }
	    
	    String fileName = "TestBarCode" 
	    				+ "_" + key.getIssuerName() 
	    		        + "_" + key.getVersionType() 
	    		        + "_" + key.getBarcodeVersion() 
	    		        + "_" + key.getStartDate().toString();	    
	    
		Shell shell = BarCodeKeyExchangeEditorPlugin.getPlugin().getWorkbench().getActiveWorkbenchWindow().getShell();
	    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
	    dialog.setText(LocalLanguageSupport._Action_SaveTestBarcodeFileName);
	    dialog.setFilterExtensions(new String[] { "*."+suffix, "*.*" }); 
	    dialog.setFilterPath("c:\\"); // Windows path
	    dialog.setFileName(fileName + "." + suffix);   
        String path = dialog.open();
            
        if (path== null || path.length() < 1) {
           return;
        }	    
	    
    
	    InputStream input = new ByteArrayInputStream(testBarcode.getImagedata());

		BufferedImage image = null;
		try {
			image = ImageIO.read(input);
		} catch (IOException e) {
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_CouldNotExtractImage +'\n'+ e.getMessage());
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
			return;
		}

		File outputfile = null;
	    try {
	    	outputfile = new File(path);
			outputfile.createNewFile();
		} catch (IOException e) {
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Generic_FileCreate +'\n'+e.getMessage());
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}
	    try {
			ImageIO.write(image, suffix, outputfile);
		} catch (IOException e) {
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_CouldNotSaveImage +'\n'+e.getMessage());
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}
		

		
	}




}
