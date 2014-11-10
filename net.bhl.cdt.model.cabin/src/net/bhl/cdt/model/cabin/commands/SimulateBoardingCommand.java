<<<<<<< HEAD
package net.bhl.cdt.model.cabin.commands;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.testing.TestableObject;

import matlabcontrol.MatlabConnectionException;
import matlabcontrol.MatlabInvocationException;
import matlabcontrol.MatlabProxy;
import matlabcontrol.MatlabProxyFactory;
import matlabcontrol.MatlabProxyFactoryOptions;
import model.CabinGenerator;
import model.TestAStar;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.Cabin;

public class SimulateBoardingCommand extends CDTCommand {

	private Cabin cabin;
	private static int port = 2100;

	public SimulateBoardingCommand(Shell shell, Cabin cabin) {
		this.cabin=cabin;
	}


	@Override
	protected void doRun() {
		CabinGenerator generator = new CabinGenerator(45, 8, 15, 2, 2);
		TestAStar simulation = new TestAStar(
				generator.createObstacleMap(generator.generateCabin()),
				(int) generator.getCabinWidth(),
				(int) generator.getCabinLength()).run();
	


		
	}

}
=======
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
		}

		// TestAStar(obstacleMap, mapWidth, mapHeight, agentID, agentStartX, agentStartY, agentGoalX, agentGoalY).run();

	}

}
>>>>>>> branch 'master' of file:///T:\Git\boarding-simulation
