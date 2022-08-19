/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.paxelerate.core.simulation.astar.Areamap;
import com.paxelerate.execution.init.BoardingDelayCalculator;
import com.paxelerate.model.Model;
import com.paxelerate.model.ModelFactory;
import com.paxelerate.model.enums.DoorSelection;
import com.paxelerate.model.enums.SeatType;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.SortingScheme;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.PassengerPropertiesExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.settings.SettingsFactory;

import Cpacs.CpacsType;
import net.bhl.opensource.cpacs.functions.CPACSInitializer;
import net.bhl.opensource.cpacs.functions.CPACSWriter;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;
import paxelerate.PaxelerateFactory;
import paxelerate.PaxelerateType;
import paxelerate.StudyType;

/**
 * This interface runs a batch simulation by loading data from a CPACS and
 * performing the loops.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 */

public interface BatchSimulationAction {

	/**
	 * Load the CPACS file and execute the batch simulation
	 *
	 * @param fileName
	 */
	static void run(File cpacsFile) {

		Log.startWithNoEnd("Initializing");
		StopWatch time = new StopWatch();

		PaxelerateType tool = PaxelerateFactory.eINSTANCE.createPaxelerateType();

		// Initialize the CPACS model
		CpacsType cpacs = CPACSInitializer.runWithToolspecific(cpacsFile, tool);

		System.out.println(CPACSWriter.toString(cpacs));

		// Loop through the tool specific input studies
		for (StudyType study : tool.getInput().getStudies().getStudy()) {

			// Initialize model
			Model model = ModelFactory.eINSTANCE.createModel();
			InitializeFromCPACSAction.run(cpacs, model);

			// Initialize settings
			model.setSettings(SettingsFactory.eINSTANCE.createSettings());
			model.getSettings().setLuggageProperties(SettingsFactory.eINSTANCE.createLuggageProperties());
			model.getSettings().setPassengerProperties(PassengerPropertiesExtensions.create());

			// Set values from the CPACS input here
			model.getSettings().setSimulationType(SimulationType.get(study.getSimulationType().getValue()));
			model.getSettings().setSeatType(SeatType.get(study.getSeatType().getValue()));
			model.getSettings().setSimulationGridResolution(study.getSimulationGridResolution());
			model.getSettings().setSimulationSpeedFactor((int) study.getSimulationSpeedFactor());

			model.getSettings().getPassengerProperties()
					.setDoorSelection(DoorSelection.get(study.getDoorSelection().getValue()));

			// Number of iterations
			int iterations = study.getIterations();

			// Match data from CSV to EMF model and load passenger distribution
			Map<TravelClass, Integer> amounts = new HashMap<>();

			for (TravelClass tc : DeckExtensions.getExistingClasses(model.getDeck())) {
				amounts.put(tc,
						(int) Math.round(study.getLoadFactor() * DeckExtensions.getSeatPerClass(model.getDeck(), tc)));
			}

			// Read the door IDs into a integer list.
			List<Integer> activeDoors = Arrays.asList(String.valueOf(study.getActiveDoorUIDs()).split(";")).stream()
					.mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());

			// Loop through all the doors and look for the door IDs.
			for (Door door : model.getDeck().getDoors()) {
				door.setActive(activeDoors.contains(door.getId()));
			}

			// Create the area map
			Areamap map = new Areamap(model.getDeck());

			// Loop through the iterations of the same simulation variant
			for (int i = 1; i <= iterations; i++) {

				System.out.println(Log.DIVIDER);

				Log.startWithNoEnd("Loop " + i + "/" + iterations + " of '" + study.getUID() + "'");

				StopWatch simTimer = new StopWatch();

				// Generate the passengers
				GeneratePassengersAction.run(model.getDeck(), amounts, study);

				// Sort the passengers
				SortPassengersAction.sort(model.getDeck(),
						SortingScheme.get(study.getPassengerSortingScheme().getValue()));

				// Apply delay to all passengers
				BoardingDelayCalculator.calculateDelay(model.getDeck().getDoors(), model.getDeck().getPassengers());

				// Run the simulation
				new SimulateBoardingAction(model.getDeck(), i, map, cpacsFile.getName(), study, iterations);

				simTimer.stop();
				Log.endWithNoStart(simTimer);
			}
			System.out.println(Log.DIVIDER);
		}

		time.stop();
		Log.start("All Completed");
		Log.end(time);
	}
}
