package net.bhl.cdt.model.cabin.commands;

import java.util.List;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.PassengerClass;

import org.eclipse.swt.widgets.Shell;

public class SimulateBoardingCommand extends CDTCommand {

	private Cabin cabin;
	private static int port = 2100;

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
