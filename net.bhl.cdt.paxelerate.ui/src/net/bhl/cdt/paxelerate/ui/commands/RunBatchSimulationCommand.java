/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
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

	private SimulationProperties simSettings;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param cabin
	 *            the cabin object
	 */
	public RunBatchSimulationCommand(Cabin cabin) {
		//this.cabin = EcoreUtil.copy(cabin);
		//this.simSettings = this.cabin.getSimulationSettings();
		this.cabin = cabin;
		this.simSettings = cabin.getSimulationSettings();
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

		// 10 	50	30	10
		// 10	30	40	20
		// 0	20	30	50

		simSettings.setSimulationSpeedFactor(2);
		simSettings.setNumberOfSimulationLoops(30);
		simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(10);
		simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(50);
		simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(30);
		simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(10);
		simSettings.setLayoutConcept(LayoutConcept.SIDWAYS_FOLDABLE_SEAT);

		Display.getDefault().syncExec(new Runnable() {
			@Override
			public void run() {
				new DrawCabinCommand(cabin).doRun();
			}
		});
		// 70 - 126
		// 90 - 162
		for (TravelClass travelclass : cabin.getClasses()) {
			travelclass.setPassengers(127);
		}

		for (int simulationLoopIndex = 1; simulationLoopIndex <= cabin.getSimulationSettings()
				.getNumberOfSimulationLoops(); simulationLoopIndex++) {
			
			new GeneratePassengersCommand(cabin).doRun();
			new SimulateBoardingCommand(cabin).doRun();

		}
	}
}
