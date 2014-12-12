package net.bhl.cdt.model.cabin.ui;

import net.bhl.cdt.cabin.ui.Activator;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * This class initializes the cabin preference page with reasonable values.
 * 
 * @author martin.glas
 */
public class CabinViewInitializer extends AbstractPreferenceInitializer {

	/**
	 * This method is the constructor.
	 */
	public CabinViewInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault("CabinViewFPS", 5);
		store.setDefault("CabinViewScale", 10);

	}

}