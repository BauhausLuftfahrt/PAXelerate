/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.ui.commands;


import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * 
 * @author michael.schmidt
 */

public class RunBatchSimulationCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param cabin
	 *            the cabin object
	 */
	public RunBatchSimulationCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected void doRun() {

		Log.add(this, "Initializing batch simulation ...");

		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				new DrawCabinCommand(cabin).doRun();
			}
		});

		cabin.getSimulationSettings().setSimulationSpeedFactor(5);
		cabin.getSimulationSettings().setNumberOfSimulationLoops(10);
		cabin.getSimulationSettings().getLuggageProperties().setPercentageOfPassengersWithNoLuggage(10);
		cabin.getSimulationSettings().getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(50);
		cabin.getSimulationSettings().getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(30);
		cabin.getSimulationSettings().getLuggageProperties().setPercentageOfPassengersWithBigLuggage(10);

		for (TravelClass travelclass : cabin.getClasses()) {
			travelclass.setPassengers(180);
		}

		for (int simulationLoopIndex = 1; simulationLoopIndex <= cabin.getSimulationSettings()
				.getNumberOfSimulationLoops(); simulationLoopIndex++) {
		
			new GeneratePassengersCommand(cabin).doRun();		
			new SimulateBoardingCommand(cabin).doRun();			
			
		}



	}

}
