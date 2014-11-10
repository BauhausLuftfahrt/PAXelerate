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
