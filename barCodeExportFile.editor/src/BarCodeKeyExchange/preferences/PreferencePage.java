package BarCodeKeyExchange.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;

public class PreferencePage extends FieldEditorPreferencePage  implements IWorkbenchPreferencePage {

	/**
	 * Instantiates a new preference page.
	 */
	public PreferencePage() {
		super(GRID);
		setPreferenceStore(BarCodeKeyExchangeEditorPlugin.getPlugin().getPreferenceStore());
		this.setTitle("Preferences");
		this.setDescription("UIC PKMW Preferences");
	}

	/**
	 * Creates the field editors. Field editors are abstractions of
	 * the common GUI blocks needed to manipulate various types
	 *	of preferences. Each field editor knows how to save and
	 * restore itself.
	 */
	public void createFieldEditors() {

		//set help context
		//IWorkbenchHelpSystem helpSystem = PlatformUI.getWorkbench().getHelpSystem();
		//helpSystem.setHelp(this.getControl(), " ");//$NON-NLS-1$

		
		StringFieldEditor uicUrlEditor = new StringFieldEditor(PreferenceConstants.P_UIC_PKMW_URL, "UIC PKMW download link", getFieldEditorParent());
		uicUrlEditor.setEmptyStringAllowed(false);
		addField(uicUrlEditor);
		
	}




	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	public void init(IWorkbench workbench) {

	}

}