package model;

import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;


public class Logger {
        public void addToLog(String s) {
        	/**********Get CabinView and ConsoleView************/
    		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
    		ConsoleViewPart consoleViewPart = (ConsoleViewPart) page.findView("net.bhl.cdt.model.cabin.consoleview");
    		/***************************************************/
        	consoleViewPart.printText(s);
                //System.out.println(s);
        }
}
