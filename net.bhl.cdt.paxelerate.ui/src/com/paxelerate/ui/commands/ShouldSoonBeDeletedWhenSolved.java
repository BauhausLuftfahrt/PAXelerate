package com.paxelerate.ui.commands;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import com.paxelerate.ui.views.CabinViewPart;
import com.paxelerate.ui.views.PropertyViewPart;

public class ShouldSoonBeDeletedWhenSolved {
	public static PropertyViewPart getPropertyView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		
		return (PropertyViewPart) page.findView("net.bhl.cdt.paxelerate.ui.propertyview");
	}

	public static CabinViewPart getCabinView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		
		return (CabinViewPart) page
				.findView("net.bhl.cdt.paxelerate.ui.views.cabinview");
	}
}
