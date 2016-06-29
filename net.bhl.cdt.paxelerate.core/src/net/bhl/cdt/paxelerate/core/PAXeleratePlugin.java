/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.core;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle.
 */
public class PAXeleratePlugin extends AbstractUIPlugin {

	// The identifiers for the preferences
	public static final String PROJECT_NAME_PREFERENCE = "projectName";
	public static final String XMI_FILE_PREFERENCE = "xmiFile";
	public static final String RESULT_FILE_NAME_PREFERENCE = "resultFile";
	public static final String EXPORT_PATH_PREFERENCE = "exportPath";

	// The default values for the preferences
	public static final String DEFAULT_PROJECT_NAME = "reference";
	public static final String DEFAULT_XMI_FILE = "Reference_Cabin_v2.xmi";
	public static final String DEFAULT_RESULT_FILE_NAME = "reference";
	public static final String DEFAULT_EXPORT_PATH = System.getProperty("user.home") + "/Documents/paxelerate/";

	/** The Constant PLUGIN_ID. */
	// The plug-in ID
	public static final String PLUGIN_ID = "net.bhl.cdt.paxelerate"; //$NON-NLS-1$

	/** The plugin. */
	// The shared instance
	private static PAXeleratePlugin plugin;

	/**
	 * The constructor.
	 */
	public PAXeleratePlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance.
	 *
	 * @return the shared instance
	 */
	public static PAXeleratePlugin getDefault() {
		return plugin;
	}

	/**
	 * Initializes a preference store with default preference values for this
	 * plug-in.
	 * 
	 * @param store
	 *            the preference store to fill
	 */
	protected void initializeDefaultPreferences(IPreferenceStore store) {
		store.setDefault(PROJECT_NAME_PREFERENCE, DEFAULT_PROJECT_NAME);
		store.setDefault(XMI_FILE_PREFERENCE, DEFAULT_XMI_FILE);
		store.setDefault(RESULT_FILE_NAME_PREFERENCE, DEFAULT_RESULT_FILE_NAME);
		store.setDefault(EXPORT_PATH_PREFERENCE, DEFAULT_EXPORT_PATH);

	}

}
