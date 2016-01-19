/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.ui.util;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import com.paxelerate.ui.Activator;

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