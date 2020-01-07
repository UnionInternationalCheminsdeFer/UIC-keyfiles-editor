/**
 */
package BarCodeKeyExchange.application;


import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.core.runtime.IProgressMonitor;

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
import BarCodeKeyExchange.preferences.PreferenceConstants;
import BarCodeKeyExchange.preferences.PreferenceHelper;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorAdvisor;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import org.eclipse.jface.operation.IRunnableWithProgress;


/**
 * This is a simple wizard for loading a new model file from the UIC web site.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoadUICBarCodeKeyExchangeAction extends BaseSelectionListenerAction {
	
	private String keysDownloadUrl = "https://railpublickey.uic.org/download.php";

	public LoadUICBarCodeKeyExchangeAction(String text)
	{
		super(text);
		this.setText(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Load_Wizard_label"));	
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
    	
    	loadAndSave(filePath);
    	
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
	public void loadAndSave(final String filePath) {
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
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor progressMonitor) {
						try {
					
							keysDownloadUrl = PreferenceHelper.getStringFromPreferenceStore(PreferenceConstants.P_UIC_PKMW_URL);
							if (keysDownloadUrl == null || keysDownloadUrl.length() < 1) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Action_DownloadPKMWmissing);		
								return;
							}							
							
					
							/** load UIC keys */			
							URL uicKeysUrl = new URL(keysDownloadUrl);

							final HttpsURLConnection con = (HttpsURLConnection) uicKeysUrl.openConnection();
							if (con == null){
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_ConnectionNotEstablished + keysDownloadUrl );																	
								return;
							}
							
							
							con.setDoInput(true);

							// Request method
							con.setRequestMethod("GET");//$NON-NLS-1$
							try {
								con.connect();
							} catch (Exception e) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_ConnectionNotEstablished + keysDownloadUrl + " - " + e.getMessage());									
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
							}
							try {
								con.getResponseCode();
							} catch (Exception e) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_ConnectionNotEstablished + keysDownloadUrl + LocalLanguageSupport._Error_HttpReplyCode + e.getMessage());									
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
							} finally {
								con.disconnect();
							}
							
								
							InputStream  inputStream = null;
							/** Read response */
							try {
								//con.wait(1000);
								inputStream = con.getInputStream();
							} catch (Exception e ) {
								MessageDialog.openError(
											Display.getDefault().getActiveShell(),
											LocalLanguageSupport._Generic_Error,
											LocalLanguageSupport._Error_DownloadError + keysDownloadUrl + " - " + e.getMessage());									
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
								return;
							} finally {
								con.disconnect();
							}
							
							ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
							
				            int bytesRead = -1;
				            byte[] buffer = new byte[2048];
				            while ((bytesRead = inputStream.read(buffer)) != -1) {
				                outputStream.write(buffer, 0, bytesRead);
				            }				      
							inputStream.close();
							con.disconnect();	
							
							File outputFile = null;
							try {
								outputFile = new File(filePath);
								outputFile.createNewFile();
							} catch (Exception e) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_KeyFileCreation + filePath + '\n' + e.getMessage());										
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
                                return;								
							}
							FileOutputStream fos = null;
							try {
							    fos = new FileOutputStream (outputFile);
							    outputStream.writeTo(fos);
							} catch(IOException e) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_CouldNotWriteKeysFile + filePath + '\n' + e.getMessage());										
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
								return;
							} finally {
							    fos.close();
							}
							
							IWorkbench workbench = PlatformUI.getWorkbench();
							
							BarCodeKeyExchangeEditorAdvisor.openEditor(workbench, URI.createFileURI(filePath));									
							
						}
						catch (Exception e) {
							MessageDialog.openError(
									Display.getDefault().getActiveShell(),
									LocalLanguageSupport._Generic_Error,
									LocalLanguageSupport._Error_KeysFileNotReadable + filePath + '\n' + e.getMessage());										
							BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
                            return;								
						}
						finally {
							progressMonitor.done();
						}
					}
				};
				
		} catch (Exception e){
			MessageDialog.openError(
					Display.getDefault().getActiveShell(),
					LocalLanguageSupport._Generic_Error,
					LocalLanguageSupport._Error_DownloadFailed + '\n' + e.getMessage());										
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);			
		}

	}


}
