package net.bhl.cdt.model.cabin.ui;

import net.bhl.cdt.cabin.ui.Activator;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

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
