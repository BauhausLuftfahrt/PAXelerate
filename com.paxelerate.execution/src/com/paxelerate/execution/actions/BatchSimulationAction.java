/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.io.File;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.paxelerate.core.sim.astar.Areamap;
import com.paxelerate.execution.init.BoardingDelayCalculator;
import com.paxelerate.execution.keys.DataKeys;
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
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;
import toolspecific.PaxelerateInputType;
import toolspecific.ToolspecificFactory;

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

		// Initialize the CPACS model
		CpacsType cpacs = CPACSInitializer.runWithToolspecific(cpacsFile,
				ToolspecificFactory.eINSTANCE.createPaxelerateType());

		// Get the tool specific input
		PaxelerateInputType input;

		try {
			input = EObjectHelper.getFilteredChildren(cpacs.getToolspecific(), PaxelerateInputType.class,
					e -> e.getIterations() != null).get(0);

		} catch (IndexOutOfBoundsException e) {

			// If there is no tool-specfic input, apply default values instead.
			input = ToolspecificFactory.eINSTANCE.createPaxelerateInputType();

			input.setIterations(ToolspecificFactory.eINSTANCE.createIntegerBaseType());
			input.getIterations().setValue(BigInteger.valueOf(1));
			input.setLoadFactor(ToolspecificFactory.eINSTANCE.createDoubleBaseType());
			input.getLoadFactor().setValue(1);
			input.setActiveDoorUIDs(ToolspecificFactory.eINSTANCE.createStringVectorBaseType());
			input.getActiveDoorUIDs().setValue("1");

		}

		// Initialize model
		Model model = ModelFactory.eINSTANCE.createModel();

		// Initialize settings
		model.setSettings(SettingsFactory.eINSTANCE.createSettings());
		model.getSettings().setLuggageProperties(SettingsFactory.eINSTANCE.createLuggageProperties());
		model.getSettings().setPassengerProperties(PassengerPropertiesExtensions.create());

		// Set all values from the CPACS input here
		// TODO: Remove values from model and use CPACS object values instead
		model.getSettings().setSimulationType(SimulationType.get(input.getSimulationType().getValue()));
		model.getSettings().setDisplaySimulation(input.getDisplaySimulation().isValue());
		model.getSettings().setSeatType(SeatType.get(input.getSeatType().getValue()));
//		model.getSettings().setLuggageModel(null);
		model.getSettings().setSimulationGridResolution(input.getSimulationGridResolution().getValue());
		model.getSettings().setSimulationSpeedFactor((int) input.getSimulationSpeedFactor().getValue());
		model.getSettings().setPassengerSortingScheme(SortingScheme.get(input.getPassengerSortingScheme().getValue()));

		// TODO: fix share being an integer here
		model.getSettings().getPassengerProperties()
				.setPassengerAggressiveMoodShare((int) (input.getPassengerAgressiveMoodShare().getValue() * 100.0));
		model.getSettings().getPassengerProperties()
				.setSeatInterferenceProcessTimeMean(input.getSeatInterferenceProcessTimeMean().getValue());
		model.getSettings().getPassengerProperties()
				.setSeatInterferenceProcessTimeDeviation(input.getSeatInterferenceProcessTimeDeviation().getValue());
		model.getSettings().getPassengerProperties()
				.setDoorSelection(DoorSelection.get(input.getDoorSelection().getValue()));

		model.getSettings().getLuggageProperties()
				.setPercentageOfPassengersWithJacket(input.getPercentageOfPassengersWithJackets().getValue());
		model.getSettings().getLuggageProperties()
				.setPercentageOfPassengersWithSmallBag(input.getPercentageOfPassengersWithSmallBags().getValue());
		model.getSettings().getLuggageProperties()
				.setPercentageOfPassengersWithMediumBag(input.getPercentageOfPassengersWithMediumBags().getValue());
		model.getSettings().getLuggageProperties()
				.setPercentageOfPassengersWithLargeBag(input.getPercentageOfPassengersWithLargeBags().getValue());

		InitializeFromCPACSAction.run(cpacs, model);

		DataKeys.RESULT_FILE_NAME = "results_" + DataKeys.IMPORT_FILE_NAME;

		// Number of iterations
		int iterations = input.getIterations().getValue().intValue();
		double loadFactor = input.getLoadFactor().getValue();
		String activeDoorIDs = input.getActiveDoorUIDs().getValue();

		SortingScheme passengerSortingScheme = SortingScheme.RANDOM;

		DataKeys.EXPORT_PATH = DataKeys.IMPORT_PATH + "\\" + model.getName() + "_" + passengerSortingScheme + "_doors_"
				+ activeDoorIDs + "\\";

		// Match data from CSV to EMF model and load passenger distribution
		Map<TravelClass, Integer> amounts = new HashMap<>();

		for (TravelClass tc : DeckExtensions.getExistingClasses(model.getDeck())) {
			amounts.put(tc, (int) Math.round(loadFactor * DeckExtensions.getSeatPerClass(model.getDeck(), tc)));
		}

		// Read the door IDs into a integer list.
		List<Integer> activeDoors = Arrays.asList(String.valueOf(activeDoorIDs).split(";")).stream()
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

			Log.startWithNoEnd("Loop " + i + "/" + iterations + " of '" + model.getName() + "'");

			StopWatch simTimer = new StopWatch();

			// Generate the passengers
			GeneratePassengersAction.run(model.getDeck(), amounts);

			// Sort the passengers
			SortPassengersAction.sort(model.getDeck(), model.getSettings().getPassengerSortingScheme());

			// Apply delay to all passengers
			BoardingDelayCalculator.calculateDelay(model.getDeck().getDoors(), model.getDeck().getPassengers());

			// Run the simulation
			new SimulateBoardingAction(model.getDeck(), i, map);

			simTimer.stop();
			Log.endWithNoStart(simTimer);
		}
		System.out.println(Log.DIVIDER);

		time.stop();
		Log.start("All Completed");
		Log.end(time);
	}
}
