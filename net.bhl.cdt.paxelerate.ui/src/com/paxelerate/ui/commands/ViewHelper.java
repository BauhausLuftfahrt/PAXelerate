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
	 * This method returns the requested ViewPart.
	 * @param type type the desired ViewPart
	 * @return the ViewPart
	 */
	public static ViewPart getView(ViewType type) {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		switch(type) {
		case CABIN_LAYOUT:
			return (CabinViewPart) page.findView("com.paxelerate.ui.views.cabinview");
		case PROPERTY_VIEW:
			return (PropertyViewPart) page.findView("com.paxelerate.ui.propertyview");
		default:
			return null;
		}	
	}
}
