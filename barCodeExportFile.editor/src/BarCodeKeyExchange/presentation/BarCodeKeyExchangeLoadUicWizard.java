/**
 */
package BarCodeKeyExchange.presentation;


import java.util.List;
import java.util.MissingResourceException;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

import org.eclipse.jface.viewers.IStructuredSelection;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.ModifyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import BarCodeKeyExchange.application.LocalLanguageSupport;
import BarCodeKeyExchange.preferences.PreferenceConstants;
import BarCodeKeyExchange.preferences.PreferenceHelper;
import BarCodeKeyExchange.provider.BarCodeKeyExchangeEditPlugin;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;


/**
 * This is a simple wizard for loading a new model file from the UIC web site.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BarCodeKeyExchangeLoadUicWizard extends Wizard implements INewWizard {
	
	private String keysDownloadUrl = "https://railpublickey.uic.org/download.php";

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarCodeKeyExchangeLoadUicWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the features representing global elements.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Load_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(BarCodeKeyExchangeEditorPlugin.INSTANCE.getImage("full/wizban/NewBarCodeKeyExchange")));
	}


	
	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Get the URI of the model file.
			//
			final URI fileURI = getModelURI();
			if (new File(fileURI.toFileString()).exists()) {
				if (!MessageDialog.openQuestion
						(getShell(),
						 BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Question_title"),
						 BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_WARN_FileConflict", new String []{ fileURI.toFileString() }))) {
					initialObjectCreationPage.selectFileField();
					return false;
				}
			}
			
			// Do the work within an operation.
			//
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
								return;
							}
							try {
								con.getResponseCode();
							} catch (Exception e) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_ConnectionNotEstablished + keysDownloadUrl + e.getMessage());									
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
								con.disconnect();
								return;
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
											LocalLanguageSupport._Error_ConnectionNotEstablished + keysDownloadUrl + " - " + e.getMessage());									
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
								con.disconnect();
								return;
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
								outputFile = new File(fileURI.toFileString());
								outputFile.createNewFile();
							} catch (Exception e) {
								MessageDialog.openError(
										Display.getDefault().getActiveShell(),
										LocalLanguageSupport._Generic_Error,
										LocalLanguageSupport._Error_CouldNotWriteKeysFile + fileURI.toFileString() + '\n' + e.getMessage());										
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
										LocalLanguageSupport._Error_CouldNotWriteKeysFile + fileURI.toFileString() + '\n' + e.getMessage());										
								BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
								return;
							} finally {
							    fos.close();
							}
						
							BarCodeKeyExchangeEditorAdvisor.openEditor(workbench, fileURI);									
							
						}
						catch (Exception e) {
							MessageDialog.openError(
									Display.getDefault().getActiveShell(),
									LocalLanguageSupport._Generic_Error,
									LocalLanguageSupport._Error_CouldNotWriteKeysFile + fileURI.toFileString() + '\n' + e.getMessage());										
							BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);
                            return;								
						} finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);
			return true;
	
		}
		catch (Exception exception) {
			BarCodeKeyExchangeEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}

	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class BarCodeKeyExchangeLoadUicWizardInitialObjectCreationPage extends WizardPage {
		
		protected BarCodeKeyExchangeLoadUicWizardInitialObjectCreationPage() {
			super(LocalLanguageSupport._Action_DownloadKeys);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Text fileField;


		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 22;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}
			
			Label resourceURILabel = new Label(composite, SWT.LEFT);
			{
				resourceURILabel.setText(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_File_label"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				resourceURILabel.setLayoutData(data);
			}

			Composite fileComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.END;
				fileComposite.setLayoutData(data);

				GridLayout layout = new GridLayout();
				data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 2;
				fileComposite.setLayout(layout);
			}

			fileField = new Text(fileComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;				
				data.grabExcessHorizontalSpace = true;
				data.widthHint = 400;
				data.horizontalSpan = 1;
				fileField.setLayoutData(data);
			}

			fileField.addModifyListener(validator);

			Button resourceURIBrowseFileSystemButton = new Button(fileComposite, SWT.PUSH);
			resourceURIBrowseFileSystemButton.setText(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Browse_label"));

			resourceURIBrowseFileSystemButton.addSelectionListener
				(new SelectionAdapter() {
					 @Override
					 public void widgetSelected(SelectionEvent event) {
						 String[] filters = BarCodeKeyExchangeEditor.FILE_EXTENSION_FILTERS.toArray(new String[BarCodeKeyExchangeEditor.FILE_EXTENSION_FILTERS.size()]);
						 String[] files = BarCodeKeyExchangeEditorAdvisor.openFilePathDialog(getShell(), SWT.SAVE, filters);
						 if (files.length > 0) {
							 fileField.setText(files[0]);
						 }
					 }
				 });

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			URI fileURI = getFileURI();
			if (fileURI == null || fileURI.isEmpty()) {
				setErrorMessage(null);
				return false;
			}

			setErrorMessage(null);
			return true;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				fileField.setFocus();
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public URI getFileURI() {
			try {
				String path = "";
				if (fileField.getText().endsWith(".xml")){
					path = fileField.getText();
				} else {
					path = fileField.getText() + ".xml";
				}
				
				return URI.createFileURI(path);
			}
			catch (Exception exception) {
				// Ignore
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void selectFileField() {
				fileField.selectAll();
				fileField.setFocus();
		}

		/**
		 * Returns the label for the specified feature name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String featureName) {
			try {
				return BarCodeKeyExchangeEditPlugin.INSTANCE.getString("_UI_DocumentRoot_" + featureName + "_feature");
			}
			catch(MissingResourceException mre) {
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(mre);
			}
			return featureName;
		}

	}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void addPages() {
		initialObjectCreationPage = new BarCodeKeyExchangeLoadUicWizardInitialObjectCreationPage();
		initialObjectCreationPage.setTitle(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_BarCodeKeyExchangeLoadUicWizard_label"));
		initialObjectCreationPage.setDescription(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the URI from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URI getModelURI() {
		return initialObjectCreationPage.getFileURI();
	}


}
