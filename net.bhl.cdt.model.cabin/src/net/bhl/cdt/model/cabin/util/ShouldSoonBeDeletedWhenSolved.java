package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.PropertyViewPart;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class ShouldSoonBeDeletedWhenSolved {
	public static PropertyViewPart getPropertyView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (PropertyViewPart) page.findView("com.paxelerate.propertyview");
	}

	public static CabinViewPart getCabinView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
	}
}
