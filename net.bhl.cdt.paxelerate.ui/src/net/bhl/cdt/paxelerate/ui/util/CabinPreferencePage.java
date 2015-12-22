/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.util;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import net.bhl.cdt.paxelerate.ui.Activator;

/**
 * This is the PreferencePage of the Cabin view .
 * 
 * @author martin.glas
 */
public class CabinPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	/**
	 * The constructor of the PreferencePage.
	 */
	public CabinPreferencePage() {
		super(GRID);
	}

	/**
	 * This method creates the editor fields for the cabin viewer.
	 */
	public void createFieldEditors() {
		addField(new IntegerFieldEditor("CabinViewFPS", "&Frames per second:", getFieldEditorParent()));

		addField(new IntegerFieldEditor("CabinViewScale", "&Scale:", getFieldEditorParent()));
	}

	@Override
	public void init(IWorkbench workbench) {
		setPreferenceStore(Activator.getDefault().getPreferenceStore());
		setDescription("Cabin viewer settings");
	}
}
