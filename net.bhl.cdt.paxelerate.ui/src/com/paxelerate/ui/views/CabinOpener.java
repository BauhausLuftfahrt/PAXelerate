/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.ui.views;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.explorereditorbridge.internal.EditorModelElementOpener;

import com.paxelerate.model.Cabin;
import com.paxelerate.ui.commands.DrawCabinCommand;

// UNUSED CLASS?
@Deprecated
public class CabinOpener extends EditorModelElementOpener {

	public CabinOpener() {
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("restriction")
	@Override
	public void openModelElement(Object element, ECPProject ecpProject) {
		new DrawCabinCommand((Cabin) element).execute();
		super.openModelElement(element, ecpProject);

	}

}
