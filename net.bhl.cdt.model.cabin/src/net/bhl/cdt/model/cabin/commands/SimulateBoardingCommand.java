
package net.bhl.cdt.model.cabin.commands;

import java.util.List;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.PassengerClass;

import org.eclipse.swt.widgets.Shell;

/**
 * This command starts the cabin boarding simulation.
 * 
 * @author martin.glas
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
	private static int port = 2100;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param shell the shell where the command was triggered
	 * @param cabin the cabin object
	 */
	public SimulateBoardingCommand(Shell shell, Cabin cabin) {
		this.cabin = cabin;
	}

	@Override
	protected void doRun() {
		List<PassengerClass> passengerClasses = cabin.getClasses();
		if (!passengerClasses.isEmpty()) {
			PassengerClass passengerClass = passengerClasses.get(0);
			passengerClass.getRows();
		}

		// TestAStar(obstacleMap, mapWidth, mapHeight, agentID, agentStartX, agentStartY, agentGoalX, agentGoalY).run();

	}

}

