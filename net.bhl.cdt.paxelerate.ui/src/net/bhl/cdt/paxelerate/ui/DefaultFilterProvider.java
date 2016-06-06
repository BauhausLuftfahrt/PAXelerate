/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 *  materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 *  and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecp.core.util.ECPFilterProvider;

/**
 * Filter all EPackages not associated with .cdt.paxelerate.
 * Used by ExtensionPoint filter.
 * 
 * @author David Otter, michael.schmidt, raoul.rothfeld
 *
 */
public class DefaultFilterProvider implements ECPFilterProvider {

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecp.core.util.ECPFilterProvider#getHiddenPackages()
	 */
	@Override
	public Set<String> getHiddenPackages() {
		Set<String> relevantURIs = new HashSet<String>(Registry.INSTANCE.keySet());
				
		relevantURIs.remove("http://net.bhl.cdt.paxelerate.model/");
		
		return relevantURIs;
	}

}
