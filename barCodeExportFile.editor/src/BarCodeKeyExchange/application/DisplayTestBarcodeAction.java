package BarCodeKeyExchange.application;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;

public class DisplayTestBarcodeAction  extends BaseSelectionListenerAction {

	
	public DisplayTestBarcodeAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_DisplayTestBarcode);	
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
    	
    	if (key.getTestbarcode() == null) return false;
    	
    	if (key.getTestbarcode().getImagedata() == null) return false;    	
    	
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
	    
    	if (key.getTestbarcode() == null) return;
    	
    	if (key.getTestbarcode().getImagedata() == null) return;
    	
    	try {
   		
    		DisplayTestBarcodeDialog dlg = new DisplayTestBarcodeDialog(key.getTestbarcode(),LocalLanguageSupport._Action_DisplayTestBarCodeHeader);
    		if( dlg.open() == Dialog.OK ) {
    				
    		}	
    		
    	} catch (Exception e){
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_CouldNotExtractImage + '\n' + e.getMessage());
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
    	}
	}
	


	
}
