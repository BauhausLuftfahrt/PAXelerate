/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.ui;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.explorereditorbridge.internal.EditorModelElementOpener;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.commands.DrawCabinCommand;

// TODO: rework without reference to EditorModelElementOpener
@SuppressWarnings("restriction")
public class CabinOpener extends EditorModelElementOpener {

	public CabinOpener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void openModelElement(Object element, ECPProject ecpProject) {
		new DrawCabinCommand((Cabin) element).execute();
		super.openModelElement(element, ecpProject);

	}

}
