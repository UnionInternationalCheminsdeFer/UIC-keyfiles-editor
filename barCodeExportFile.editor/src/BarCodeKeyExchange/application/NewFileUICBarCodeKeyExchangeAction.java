/**
 */
package BarCodeKeyExchange.application;


import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

import BarCodeKeyExchange.KeysType;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorAdvisor;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;
import java.io.File;
import java.io.FileWriter;


/**
 * This is a simple wizard for loading a new model file from the UIC web site.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NewFileUICBarCodeKeyExchangeAction extends BaseSelectionListenerAction {
	
	private String urlKeysDefault = "https://railpublickey.uic.org/download.php";

	public NewFileUICBarCodeKeyExchangeAction(String text)
	{
		super(text);
		this.setText(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));	
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
	    	KeysType keys = null;
	    	if (selection.getFirstElement() instanceof EObject) {	
	    		EObject current = (EObject) selection.getFirstElement();
	    		while (keys ==  null && current != null) {
	    			if (current instanceof KeysType){
	    				keys = (KeysType) current;
	    			} else {
	    				current = current.eContainer();
	    			}
	    		}  
	    	}
	    	if (keys == null) return false;
	    	
			return true;
		}
		



	public void run (IStructuredSelection selection)	{
	
		if (selection == null) return;
    	if (selection.size() == 0)   return;	
    	KeysType keys = null;
    	if (selection.getFirstElement() instanceof EObject) {	
    		EObject current = (EObject) selection.getFirstElement();
    		while (keys ==  null && current != null) {
    			if (current instanceof KeysType){
    				keys = (KeysType) current;
    			} else {
    				current = current.eContainer();
    			}
    		}  
    	}
    	if (keys == null) return;
    	
    	String filePath = getFile();
    	
    	save(filePath);
    	
	}

	
	private String getFile() {
		Shell shell = BarCodeKeyExchangeEditorPlugin.getPlugin().getWorkbench().getActiveWorkbenchWindow().getShell();
	    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
	    dialog.setText(LocalLanguageSupport._Generic_LocalFileSelect);
	    dialog.setFilterExtensions(new String[] {"*.xml"}); 
	    dialog.setFilterPath("c:\\"); // Windows path
        String path = dialog.open();
            
        if (path== null || path.length() < 1) {
           return null;
        }	
        return path;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void save(final String filePath) {
		
		try {
			// Get the URI of the model file.
			if (new File(filePath).exists()) {
				if (!MessageDialog.openQuestion
						(Display.getDefault().getActiveShell(),
						 BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Question_title"),
						 BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_WARN_FileConflict", new String []{filePath}))) {
					return;
				}
			}
			
			// Do the work within an operation.
			File file = new File(filePath);
			
			FileWriter fw = new FileWriter(file);
			
			fw.append("<?xml version=");
			fw.append('"');
			fw.append("1.0");
			fw.append('"');		
			fw.append(" encoding=");
			fw.append('"');					
			fw.append("UTF-8");
			fw.append('"');					
			fw.append("?>");
			fw.append('\n');
			fw.append("<keys/>");
			
			fw.flush();
			

			IWorkbench workbench = PlatformUI.getWorkbench();
							
			BarCodeKeyExchangeEditorAdvisor.openEditor(workbench, URI.createFileURI(filePath));									
							
		
		} catch (Exception e){
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Generic_FileCreate + filePath + '\n' + e.getMessage());										
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);			
		}

	}


}
