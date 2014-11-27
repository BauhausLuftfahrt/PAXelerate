package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;
import model.CabinGenerator;
import model.TestAStar;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.ConsoleViewPart;
import net.bhl.cdt.model.util.ModelHelper;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * This command starts the cabin boarding simulation.
 * 
 * @author marc.engelmann
 */

/********************How to add a new right click command to openCDT***********************/
/**                                                                                      **/
/** (1) Create a new "newCommand.java" in "net.bhl.cdt.model.cabin.commands"             **/
/**     - Best practice: copy an existing command.                                       **/
/**     - Be sure to not modify the constructor, "this.cabin = cabin" should stay intact **/
/**                                                                                      **/
/** (2) Create a new "newCommandHandler.java" in "net.bhl.cdt.model.cabin.handlers"      **/
/**     - Best practice: copy an existing handler file.                        		     **/
/**     - Tip: Do not modify this file, only check for correct naming         			 **/
/**                         															 **/
/** (3) Open "plugin.xml" and go to "org.eclipse.ui.commands"                			 **/
/**     - Create a new command by right-clicking.                                        **/
/**     - Fill in the id, name and default handler. (Caution: case sensitive!)           **/
/**                                                        								 **/
/** (4) Go to "org.eclipse.ui.menus" in "plugin.xml"                                     **/
/**     - Expand the "popup:org.eclipse.(...)" entry.                                    **/
/**     - Add a new command by right-clicking.                                           **/
/**     - Fill in the correct commandID and your desired label name.                     **/
/**     - Add a new parameter by right-clicking.                                         **/
/**     - Set the parameter to "false (visible when)".      							 **/
/**     - Add a parameter within called "iterate".            						     **/
/**     - Add a parameter within called "instanceOf" and choose "cabin". 			     **/
/**                                            											 **/
/******************************************************************************************/

public class SimulateBoardingCommand extends CDTCommand {

	private Cabin cabin;
	private CabinGenerator generator;
	private ArrayList<Passenger> alreadySeatedList = new ArrayList<Passenger>();
	private int[][] obstacleMap = null;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param shell
	 *            the shell where the command was triggered
	 * @param cabin
	 *            the cabin object
	 */
	public SimulateBoardingCommand(Shell shell, Cabin cabin) {
		this.cabin = cabin;
	}

	@Override
	protected void doRun() {
		/********** Get CabinView and ConsoleView ************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		CabinViewPart cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		ConsoleViewPart consoleViewPart = (ConsoleViewPart) page
				.findView("net.bhl.cdt.model.cabin.consoleview");
		/***************************************************/

		consoleViewPart.printText("Initializing the boarding simulation...");

		if (!cabin.getPassengers().isEmpty()) {
			generator = new CabinGenerator(cabin);
			obstacleMap = generator.createObstacleMap();
			
			for (int i = 0; i<(int) (cabin.getCabinWidth() / cabin.getScale());i++) {
				for(int j = 0; j <(int) (cabin.getCabinLength() / cabin.getScale()); j++)  {
					if(obstacleMap[i][j]==100000) {
						System.out.print("X");
					}
					else if(obstacleMap[i][j]==0) {
						System.out.print("-");
					}else
					System.out.print(obstacleMap[i][j]);
				}
				System.out.println();
			}
			
//			TestAStar astar = new TestAStar(obstacleMap,
//					(int) (cabin.getCabinWidth() / cabin.getScale()),
//					(int) (cabin.getCabinLength() / cabin.getScale()), cabin);
//			
//			while (!TestAStar.getSimulationDone()) {
//				try {
//					for(Passenger pax:ModelHelper.getChildrenByClass(astar.getPassengerLocations(), Passenger.class)) {
//						if(pax.isIsSeated()&&!alreadySeatedList.contains(pax)) {
//							consoleViewPart.printText("Passenger "+pax.getName()+" is now seated!");
//							alreadySeatedList.add(pax);							
//						}
//					}	
//					cabinViewPart.submitPassengerCoordinates(astar.getPassengerLocations());
//					Thread.sleep((int)(1000/cabin.getFramesPerSecond()));
//				} catch (InterruptedException e) {
//					consoleViewPart.printText("An error occured during simulation.");
//					e.printStackTrace();
//				}
//			}
//			if (TestAStar.simulationDone) {
//				for(Passenger pax:ModelHelper.getChildrenByClass(astar.getPassengerLocations(), Passenger.class)) {
//					if(pax.isIsSeated()&&!alreadySeatedList.contains(pax)) {
//						consoleViewPart.printText("Passenger "+pax.getName()+" is now seated!");
//						alreadySeatedList.add(pax);							
//					}
//				}
//				
//				if(!obstacleMap.equals(null)) {
//					cabinViewPart.submitObstacleMap(obstacleMap);
//					consoleViewPart.printText("Heat map generation succeeded.");
//				}
//				if(!TestAStar.pathList.isEmpty()) {
//					cabinViewPart.submitPath(TestAStar.getPathList());
//					consoleViewPart.printText("Paths printed successfully.");
//				}
//				consoleViewPart.printText("Boarding completed!");			
//			}
			
		} 
		else {
			consoleViewPart.printText("No boarding possible! Please create passengers.");
		 }

	}

}
