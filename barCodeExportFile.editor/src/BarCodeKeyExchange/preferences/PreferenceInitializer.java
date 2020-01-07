package BarCodeKeyExchange.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;

public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		
		IPreferenceStore store = BarCodeKeyExchangeEditorPlugin.getPlugin().getPreferenceStore();
		
		store.setDefault(PreferenceConstants.P_UIC_PKMW_URL,"https://railpublickey.uic.org/download.php");
	}
}
