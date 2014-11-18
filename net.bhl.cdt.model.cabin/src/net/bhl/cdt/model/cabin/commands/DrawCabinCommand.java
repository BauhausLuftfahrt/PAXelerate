package net.bhl.cdt.model.cabin.commands;



import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;

import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;



public class DrawCabinCommand extends CDTCommand {
	
	private Cabin cabin;
	CabinViewPart cabinViewPart;
	ConsoleViewPart consoleViewPart;
	public DrawCabinCommand(Cabin cabin) {
		this.cabin=cabin;
			
	}

	@Override
	protected void doRun() {
		
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page.findView("net.bhl.cdt.model.cabin.cabinview");
		//System.out.print(cabinViewPart.getTitle());	
		cabinViewPart.submitCabin(cabin);
		
		consoleViewPart = (ConsoleViewPart) page.findView("net.bhl.cdt.model.cabin.consoleview");
		consoleViewPart.printText("cabin view updated");
	}
}