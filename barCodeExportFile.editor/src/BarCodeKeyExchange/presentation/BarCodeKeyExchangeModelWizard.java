/**
 */
package BarCodeKeyExchange.presentation;


import java.util.MissingResourceException;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;

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

import BarCodeKeyExchange.provider.BarCodeKeyExchangeEditPlugin;


import java.io.File;
import java.io.FileWriter;

import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Text;


/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class BarCodeKeyExchangeModelWizard extends Wizard implements INewWizard {



	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BarCodeKeyExchangeModelWizardInitialObjectCreationPage initialObjectCreationPage;

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
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(BarCodeKeyExchangeEditorPlugin.INSTANCE.getImage("full/wizban/NewBarCodeKeyExchange")));
	}


	
	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
			
			File file = new File(fileURI.toFileString());
			
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
			
			return BarCodeKeyExchangeEditorAdvisor.openEditor(workbench, fileURI);			
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
	 * @generated NOT
	 */
	public class BarCodeKeyExchangeModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Text fileField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
		 */
		public BarCodeKeyExchangeModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated NOT
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
				data.widthHint = 400;
				data.grabExcessHorizontalSpace = true;
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
						 String[] filters  = {"*.xml"};
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
		 * @generated NOT
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
		 * @generated NOT
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
		 * @generated NOT
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
		 * @generated NOT
		 */
		public URI getFileURI() {
			String path = "";
			try {
				if (fileField.getText().endsWith(".xml")){
					path = fileField.getText();
				} else {
					path = fileField.getText() + ".xml";
				}
				
				return URI.createFileURI(path);
			}
			catch (Exception e) {
				MessageDialog.openError(
						Display.getDefault().getActiveShell(),
						"Error:",
						"Could not create new file:" + fileField.getText() + '\n' + e.getMessage());										
				BarCodeKeyExchangeEditorPlugin.INSTANCE.log(e);	
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
		initialObjectCreationPage = new BarCodeKeyExchangeModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(BarCodeKeyExchangeEditorPlugin.INSTANCE.getString("_UI_BarCodeKeyExchangeModelWizard_label"));
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
