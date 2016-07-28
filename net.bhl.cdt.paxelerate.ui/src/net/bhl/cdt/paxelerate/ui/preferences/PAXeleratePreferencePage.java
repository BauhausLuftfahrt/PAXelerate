/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.ui.preferences;

import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import net.bhl.cdt.paxelerate.ui.Activator;

/**
 * This is the PreferencePage of PAXelerate.
 *
 * @author michael.schmidt
 * @version 0.8
 * @since 0.5
 */
public class PAXeleratePreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/** The Constant PROJECT_NAME_PREFERENCE. */
	// The identifiers for the preferences
	public static final String PROJECT_NAME_PREFERENCE = "projectName";

	/** The Constant XMI_FILE_PREFERENCE. */
	public static final String XMI_FILE_PREFERENCE = "xmiFile";

	/** The Constant RESULT_FILE_NAME_PREFERENCE. */
	public static final String RESULT_FILE_NAME_PREFERENCE = "resultFile";

	/** The Constant EXPORT_PATH_PREFERENCE. */
	public static final String EXPORT_PATH_PREFERENCE = "exportPath";

	/** The Constant DEFAULT_PROJECT_NAME. */
	// The default values for the preferences
	public static final String DEFAULT_PROJECT_NAME = "reference";

	/** The Constant DEFAULT_XMI_FILE. */
	public static String DEFAULT_XMI_FILE = "Reference_Cabin_v2";

	/** The Constant DEFAULT_XMI_FOLDER. */
	public static final String DEFAULT_XMI_FOLDER = System.getProperty("user.home") + "/Documents/paxelerate/";

	/** The Constant DEFAULT_RESULT_FILE_NAME. */
	public static final String DEFAULT_RESULT_FILE_NAME = "results_0179";

	/** The Constant DEFAULT_EXPORT_PATH. */
	public static final String DEFAULT_EXPORT_PATH = System.getProperty("user.home") + "/Documents/paxelerate/";

	/** The Constant DEFAULT_IMPORT_FILE_NAME. */
	public static final String DEFAULT_IMPORT_FILE_NAME = "study_import";

	/** The Constant DEFAULT_IMPORT_PATH. */
	public static final String DEFAULT_IMPORT_PATH = System.getProperty("user.home") + "/Documents/paxelerate/";

	/**
	 * The constructor of the PreferencePage.
	 */
	public PAXeleratePreferencePage() {
		super(GRID);
		/* Set the preference store for the preference page. */
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		setPreferenceStore(store);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.PreferencePage#doGetPreferenceStore()
	 */
	protected IPreferenceStore doGetPreferenceStore() {
		return Activator.getDefault().getPreferenceStore();
	}

	/**
	 * This method creates the editor fields for the PAXelerate file path.
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage
	 * #createFieldEditors()
	 */
	@Override
	public void createFieldEditors() {
		// TODO: export file name costmap, obstacle map

		StringFieldEditor project = new StringFieldEditor(PROJECT_NAME_PREFERENCE, "&Default project name:",
				getFieldEditorParent());
		addField(project);

		DirectoryFieldEditor xmiFile = new DirectoryFieldEditor(XMI_FILE_PREFERENCE, "&Cabin xmi file location:",
				getFieldEditorParent());
		addField(xmiFile);

		StringFieldEditor resultFile = new StringFieldEditor(RESULT_FILE_NAME_PREFERENCE, "&Result file name:",
				getFieldEditorParent());
		addField(resultFile);

		DirectoryFieldEditor exportPath = new DirectoryFieldEditor(EXPORT_PATH_PREFERENCE, "&Default export path:",
				getFieldEditorParent());
		addField(exportPath);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Default values for file names and paths");
	}

}
