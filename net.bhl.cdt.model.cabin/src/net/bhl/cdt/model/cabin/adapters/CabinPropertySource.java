package net.bhl.cdt.model.cabin.adapters;

import net.bhl.cdt.model.cabin.Cabin;

import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

public class CabinPropertySource implements IPropertySource {

	private final Cabin cabin;

	public CabinPropertySource(Cabin cabin) {
		this.cabin = cabin;
	}

	@Override
	public boolean isPropertySet(Object id) {
		return false;
	}

	@Override
	public Object getEditableValue() {
		return this;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {

		return new IPropertyDescriptor[] { new TextPropertyDescriptor("summary", "Summary"),
			new TextPropertyDescriptor("description", "Description") };
	}

	@Override
	public Object getPropertyValue(Object id) {
		if (id.equals("summary")) {
			return cabin.getName();
		}
		if (id.equals("description")) {
			return cabin.getName();
		}
		return null;
	}

	@Override
	public void resetPropertyValue(Object id) {

	}

	@Override
	public void setPropertyValue(Object id, Object value) {
		String s = (String) value;
		if (id.equals("summary")) {
			cabin.setName(s);
		}
		if (id.equals("description")) {
			cabin.setName(s);
		}
	}

}