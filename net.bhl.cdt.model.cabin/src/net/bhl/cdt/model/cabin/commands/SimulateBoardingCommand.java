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
			cabin.getDocumentInWikipedia();
		}

		// TestAStar(obstacleMap, mapWidth, mapHeight, agentID, agentStartX, agentStartY, agentGoalX, agentGoalY).run();

	}

}
