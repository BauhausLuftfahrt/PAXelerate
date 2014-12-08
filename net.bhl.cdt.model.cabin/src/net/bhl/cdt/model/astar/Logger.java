package net.bhl.cdt.model.astar;

import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Logger {
	/**
	 * This method adds a string to the log.
	 * 
	 * @param s
	 *            is the string which is submitted to the log
	 */
	public void addToLog(String s) {
		/********** Get CabinView and ConsoleView ************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		ConsoleViewPart consoleViewPart = (ConsoleViewPart) page
				.findView("net.bhl.cdt.model.cabin.consoleview");
		/***************************************************/
		consoleViewPart.printText(s);
	}
}
