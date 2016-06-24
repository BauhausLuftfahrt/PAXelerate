/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.ui.views;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * The Class ViewPartHelper.
 */
public class ViewPartHelper {

	/**
	 * Gets the cabin view.
	 *
	 * @return the cabin view
	 */
	public static CabinViewPart getCabinView() {
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (IWorkbenchWindow window : windows) {
			IWorkbenchPage page = window.getActivePage();
			CabinViewPart found = (CabinViewPart) page.findView("net.bhl.cdt.paxelerate.ui.views.cabinview");
			if (found != null) {
				return found;
			}
		}
		return null;
	}

	/**
	 * Gets the heat map view.
	 *
	 * @return the heat map view
	 */
	public static HeatmapPart getHeatView() {
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (IWorkbenchWindow window : windows) {
			IWorkbenchPage page = window.getActivePage();
			HeatmapPart found = (HeatmapPart) page.findView("net.bhl.cdt.paxelerate.ui.heatmap");
			if (found != null) {
				return found;
			}
		}
		return null;
	}

	/**
	 * Gets the property view.
	 *
	 * @return the property view
	 */
	public static PropertyViewPart getPropertyView() {
		IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
		for (IWorkbenchWindow window : windows) {
			IWorkbenchPage page = window.getActivePage();
			PropertyViewPart found = (PropertyViewPart) page.findView("net.bhl.cdt.paxelerate.ui.propertyview");
			if (found != null) {
				return found;
			}
		}
		return null;
	}
}
