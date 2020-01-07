package BarCodeKeyExchange.application;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import BarCodeKeyExchange.KeyType;
import BarCodeKeyExchange.PublicKeyType;


public class DisplayBinaryContentAction extends BaseSelectionListenerAction {
	

	public DisplayBinaryContentAction(String text)
	{
		super(text);
		this.setText(LocalLanguageSupport._Action_DisplayPublicKeyContent);		
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
    	
		PublicKeyType publicKey = null; 
    	if (selection.getFirstElement() instanceof KeyType){
    		KeyType xmlKey = (KeyType) selection.getFirstElement();
    		publicKey = xmlKey.getPublicKey();    		
    	} else if (selection.getFirstElement() instanceof PublicKeyType){
    		publicKey = (PublicKeyType) selection.getFirstElement();
    	} else {
    		return false;
    	}    	
		
		if (publicKey == null || publicKey.getValue() == null || publicKey.getValue().length == 0) {
			return false;
		}
    	
		return true;
	}
	


	public void run (IStructuredSelection selection)
	{
		if (!checkSelection(selection)) return;

		KeyType key = null;
		PublicKeyType publicKey = null; 
    	if (selection.getFirstElement() instanceof KeyType){
    		key = (KeyType) selection.getFirstElement();
    		publicKey = key.getPublicKey();    		
    	} else if (selection.getFirstElement() instanceof PublicKeyType){
    		publicKey = (PublicKeyType) selection.getFirstElement();
    	} else {
    		return;
    	}    	
    	
    	
    	String title = "";
		if (key != null) {
			title = key.getPublicKey().getKeytype() + " " + key.getIssuerName();
		} else {
			title = publicKey.getKeytype();
		}

		DisplayBinaryContentDialog dlg = new DisplayBinaryContentDialog(publicKey.getValue(), title);
		if( dlg.open() == Dialog.OK ) {
				
		}		
	}
	
	
	
}
