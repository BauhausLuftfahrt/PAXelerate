package net.bhl.cdt.model.cabin.adapters;

import net.bhl.cdt.model.cabin.Cabin;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.ui.views.properties.IPropertySource;

public class CabinAdapterFactory implements IAdapterFactory {

	@Override
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IPropertySource.class && adaptableObject instanceof Cabin) {
			return new CabinPropertySource((Cabin) adaptableObject);
		}
		return null;
	}

	@Override
	public Class[] getAdapterList() {
		// TODO Auto-generated method stub
		return null;
	}

}
