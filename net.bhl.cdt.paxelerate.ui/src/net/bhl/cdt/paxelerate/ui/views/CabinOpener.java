/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.views;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.explorereditorbridge.internal.EditorModelElementOpener;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.ui.commands.DrawCabinCommand;

/**
 * The Class CabinOpener.
 */
public class CabinOpener extends EditorModelElementOpener {

	/**
	 * Instantiates a new cabin opener.
	 */
	public CabinOpener() {
		// Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.eclipse.emf.ecp.explorereditorbridge.internal.EditorModelElementOpener#openModelElement(java.lang.Object, org.eclipse.emf.ecp.core.ECPProject)
	 */
	@SuppressWarnings("restriction")
	@Override
	public final void openModelElement(final Object element, final ECPProject ecpProject) {
		new DrawCabinCommand((Cabin) element).execute();
		super.openModelElement(element, ecpProject);
	}
}