/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.io.File;
import java.util.ArrayList;
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
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.PassengerPropertiesExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.settings.SettingsFactory;

import Cpacs.CpacsFactory;
import Cpacs.CpacsType;
import net.bhl.opensource.cpacs.functions.CPACSInitializer;
import net.bhl.opensource.cpacs.functions.CPACSWriter;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;
import paxelerate.BoardingTimePerDoorType;
import paxelerate.PaxelerateFactory;
import paxelerate.PaxelerateType;
import paxelerate.StudyIterationOutputType;
import paxelerate.StudyOutputType;
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

		PaxelerateType tool = PaxelerateFactory.eINSTANCE.createPaxelerateType();
		CpacsType cpacs = CPACSInitializer.runWithToolspecific(cpacsFile, tool);
		run(cpacs, tool, cpacsFile.getName());
		Log.startWithNoEnd("Exporting to input file location.");
		CPACSWriter.run(cpacsFile.getAbsolutePath().replace(".xml", "") + "_out.xml", cpacs);

	}

	static void run(CpacsType cpacs, PaxelerateType tool, String exportFolderName) {

		Log.startWithNoEnd("Initializing");
		StopWatch time = new StopWatch();

		// Add output structure
		tool.setOutput(PaxelerateFactory.eINSTANCE.createPaxelerateOutputType());
		tool.getOutput().setStudiesOutput(PaxelerateFactory.eINSTANCE.createStudiesOutputType());

		// Loop through the tool specific input studies
		for (StudyType study : tool.getInput().getStudies().getStudy()) {

			StudyOutputType studyOutput = PaxelerateFactory.eINSTANCE.createStudyOutputType();
			studyOutput.setLinkedStudyUID(study.getUID());
			studyOutput.setStudyIterationsOutput(PaxelerateFactory.eINSTANCE.createStudyIterationsOutputType());
			studyOutput.setAverageBoardingTimesPerDoor(PaxelerateFactory.eINSTANCE.createBoardingTimesPerDoorType());
			tool.getOutput().getStudiesOutput().getStudyOutput().add(studyOutput);

			// Initialize model
			Model model = ModelFactory.eINSTANCE.createModel();
			InitializeFromCPACSAction.run(cpacs, model, study.getTargetDeckUID());

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
			List<String> activeDoors = Arrays.asList(String.valueOf(study.getActiveDoorUIDs()).split(";")).stream()
					.collect(Collectors.toList());

			// Loop through all the doors and look for the door IDs.
			for (Door door : model.getDeck().getDoors()) {
				door.setActive(activeDoors.contains(door.getId()));
			}

			// Create the area map
			Areamap map = new Areamap(model.getDeck());

//			System.out.println(map.toString());

			List<Double> boardingTimes = new ArrayList<>();
			Map<String, List<Double>> boardingTimesPerDoorMap = new HashMap<>();

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
				SimulateBoardingAction simulation = new SimulateBoardingAction(model.getDeck(), i, map,
						exportFolderName, study, iterations, tool.getSettings().isDisplaySimulation());

				simTimer.stop();
				Log.endWithNoStart(simTimer);

				StudyIterationOutputType studyIterationOutput = PaxelerateFactory.eINSTANCE
						.createStudyIterationOutputType();
				studyIterationOutput.setBoardingTime(simulation.boardingTime);
				boardingTimes.add(simulation.boardingTime);

				studyOutput.getStudyIterationsOutput().getStudyIterationOutput().add(studyIterationOutput);

				for (Door door : DoorExtensions.getActiveDoors(model.getDeck())) {

					if (boardingTimesPerDoorMap.get(door.getId()) == null) {
						boardingTimesPerDoorMap.put(door.getId(), new ArrayList<>());
					}

					boardingTimesPerDoorMap.get(door.getId()).add(door.getTimeInUse());
				}
			}

			studyOutput.setAverageBoardingTime(boardingTimes.stream().mapToDouble(t -> t).average().getAsDouble());
			for (Door door : DoorExtensions.getActiveDoors(model.getDeck())) {
				BoardingTimePerDoorType boardingTimePerDoor = PaxelerateFactory.eINSTANCE
						.createBoardingTimePerDoorType();
				boardingTimePerDoor.setTime(
						boardingTimesPerDoorMap.get(door.getId()).stream().mapToDouble(t -> t).average().getAsDouble());
				boardingTimePerDoor.setDoorUID(door.getId());
				studyOutput.getAverageBoardingTimesPerDoor().getBoardingTimePerDoor().add(boardingTimePerDoor);
			}

			System.out.println(Log.DIVIDER);

		}

		time.stop();
		Log.start("All Completed");
		Log.end(time);

	}

	static void main(String[] args) {

		PaxelerateType toolInitial = PaxelerateFactory.eINSTANCE.createPaxelerateType();

		CpacsType cpacsInitial = CPACSInitializer
				.runWithToolspecific(new File("C:\\Users\\marc.engelmann\\desktop\\example.xml"), toolInitial);

		String cpacsStr = CPACSWriter.toString(cpacsInitial);

		CpacsType cpacs = CpacsFactory.eINSTANCE.createCpacsType();

		PaxelerateType tool = PaxelerateFactory.eINSTANCE.createPaxelerateType();
		CPACSInitializer.initFromStringWithToolspecific(cpacs, cpacsStr, tool);
		BatchSimulationAction.run(cpacs, tool, null);
	}
}
