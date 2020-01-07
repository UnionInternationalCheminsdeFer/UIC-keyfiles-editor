package BarCodeKeyExchange.preferences;

import org.eclipse.jface.preference.IPreferenceStore;

import BarCodeKeyExchange.presentation.BarCodeKeyExchangeEditorPlugin;

public class PreferenceHelper {
	
	/**
	 * Get boolean from preference store. Default is false.
	 *
	 * @param key the key
	 * @return the bool from preference store
	 */
	public static boolean getBoolFromPreferenceStore(final String key) {
		IPreferenceStore store = BarCodeKeyExchangeEditorPlugin.getPlugin().getPreferenceStore();
		boolean val = store.getBoolean(key);
		return val;
	}

	/**
	 * Get string from preference store.
	 *
	 * @param key the key
	 * @return the string from preference store
	 */
	public static String getStringFromPreferenceStore(final String key) {
		IPreferenceStore store = BarCodeKeyExchangeEditorPlugin.getPlugin().getPreferenceStore();
		String val = store.getString(key);
		return val;
	}



	/**
	 * Insert or update string in preference store
	 *
	 *
	 * @param key the key
	 * @param val the val
	 */
	public static void putStringToPreferenceStore(final String key, final String val) {
		IPreferenceStore store = BarCodeKeyExchangeEditorPlugin.getPlugin().getPreferenceStore();
		store.putValue(key,val);
	}


}
