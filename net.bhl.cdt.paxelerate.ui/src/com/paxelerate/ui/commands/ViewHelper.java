package com.paxelerate.ui.commands;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import com.paxelerate.ui.views.CabinViewPart;
import com.paxelerate.ui.views.PropertyViewPart;

/**
 * 
 * @author marc.engelmann
 *
 */

public class ViewHelper {
	
	/**
	 * 
	 * @author marc.engelmann
	 *
	 */
	enum ViewType {
		CABIN_LAYOUT,PROPERTY_VIEW;
	}
	
	/**
	 * This method returns the requested viewpart.
	 * @param type type the desired viewpart
	 * @return the viewpart
	 */
	public static ViewPart getView(ViewType type) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		switch(type) {
		case CABIN_LAYOUT:
			return (CabinViewPart) page.findView("net.bhl.cdt.paxelerate.ui.propertyview");
		case PROPERTY_VIEW:
			return (PropertyViewPart) page.findView("net.bhl.cdt.paxelerate.ui.cabinview");
		default:
			return null;
		}	
	}
}
