/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.ui.helper;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;

/**
 * The Class ViewPartHelper.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 * 
 */
public class ViewPartHelper {

	/**
	 * Gets the cabin view.
	 *
	 * @return the cabin view
	 */
	public static CabinViewPart getCabinView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (CabinViewPart) page.findView("net.bhl.cdt.paxelerate.ui.views.cabinview");
	}
}
