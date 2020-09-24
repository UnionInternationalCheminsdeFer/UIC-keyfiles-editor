package BarCodeKeyExchange.application;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import BarCodeKeyExchange.ImagetypeType;
import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.TestbarcodeType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;




public class AddTestBarcodeAction extends BaseSelectionListenerAction {
	


	public AddTestBarcodeAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_AddTestBarCode);		
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
		
		Shell shell = Display.getDefault().getActiveShell();
        FileDialog fd = new FileDialog(shell, SWT.READ_ONLY);
        fd.setText(LocalLanguageSupport._Action_SelectTestBarcodeFile);
        fd.setText(this.getText());
        String[] filterExt = {"*.jpg;*.png;*.bmp" }; //$NON-NLS-1$
        fd.setFilterExtensions(filterExt);
        String path = fd.open();
            
        if (path== null || path.length() < 1) {
           return;
        }
			
        try {
			loadImage(key, path);
		} catch (IOException e) {
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_CouldNotLoadImageFile + path + '\n' + e.getMessage());										
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}
		
	}

	public void loadImage(KeyType key, String fileName) throws FileNotFoundException {
		
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(fileName);

			try {
		
				ByteArrayOutputStream buffer = new ByteArrayOutputStream();

				int nRead;
				byte[] data = new byte[16384];

				while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
				  buffer.write(data, 0, nRead);
				}
				updateKey(key, fileName,buffer.toByteArray());					
			} catch (IOException e) {
				MessageDialog.openError(
						Display.getDefault().getActiveShell(),
						LocalLanguageSupport._Generic_Error,
						LocalLanguageSupport._Error_CouldNotReadImageFile + fileName + '\n' + e.getMessage());										
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
			}
		} catch (FileNotFoundException e) {
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_CouldNotAccessImageFile + fileName + '\n' + e.getMessage());										
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
		}
	}
	

	
	private void updateKey(KeyType key, String fileName, byte[] value) {
		EditingDomain domain = EditingUtils.getActiveDomain();
		
	
		TestbarcodeType testbarcode = BarCodeKeyExchange.BarCodeKeyExchangeFactory.eINSTANCE.createTestbarcodeType();
		testbarcode.setImagedata(value);
		
		if (fileName.endsWith("jpg") || fileName.endsWith("JPG")){ //$NON-NLS-1$ //$NON-NLS-2$
			testbarcode.setImagetype(ImagetypeType.JPG);
		} else {
			if (fileName.endsWith("png") || fileName.endsWith("PNG")){ //$NON-NLS-1$//$NON-NLS-2$
				testbarcode.setImagetype(ImagetypeType.PNG);
			} else {
				if (fileName.endsWith("bmp") || fileName.endsWith("BMP")){//$NON-NLS-1$//$NON-NLS-2$
					testbarcode.setImagetype(ImagetypeType.BMP);
				} 
			}
		}
		
		
		Command com = SetCommand.create(domain, key, BarCodeKeyExchange.BarCodeKeyExchangePackage.Literals.KEY_TYPE__TESTBARCODE, testbarcode);

		if (com.canExecute()) {
			domain.getCommandStack().execute(com);
		}		
	}
	


}
