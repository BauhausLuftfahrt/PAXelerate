package net.bhl.cdt.paxelerate.model.util;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.paxelerate.model.ui.CabinViewPart;
import net.bhl.cdt.paxelerate.model.ui.PropertyViewPart;

public class ShouldSoonBeDeletedWhenSolved {
	public static PropertyViewPart getPropertyView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (PropertyViewPart) page.findView("net.bhl.cdt.paxelerate.model.ui.propertyview");
	}

	public static CabinViewPart getCabinView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (CabinViewPart) page
				.findView("net.bhl.cdt.paxelerate.model.ui.cabinview");
	}
}
