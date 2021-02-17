/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.core.actions;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.paxelerate.core.init.BoardingDelayCalculator;
import com.paxelerate.core.keys.DataKeys;
import com.paxelerate.core.keys.ImportKeys;
import com.paxelerate.core.sim.astar.Areamap;
import com.paxelerate.model.Model;
import com.paxelerate.model.enums.TravelClass;

import net.bhl.opensource.toolbox.io.CSVImport;
import net.bhl.opensource.toolbox.io.DataSet;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.time.StopWatch;

/**
 * This interface runs a batch simulation by loading data from a CSV file and
 * performing the loops.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 */

public interface BatchSimulationAction {

	/**
	 * Load a CSV file named as the parameter 'fileName' at the given path and
	 * simulate the boarding processes.
	 *
	 * @param fileName
	 */
	static void run(String fileName) {

		DataKeys.IMPORT_FILE_NAME = fileName;
		DataKeys.RESULT_FILE_NAME = "results_" + DataKeys.IMPORT_FILE_NAME;

		Log.startWithNoEnd("Initializing");
		StopWatch time = new StopWatch();

		List<DataSet> dataSets = CSVImport.importAll(DataKeys.IMPORT_FILE_NAME, DataKeys.IMPORT_PATH);

		// Load all simulation data and loop through the variants
		for (DataSet parameters : dataSets) {

			// Number of iterations
			int iterations = parameters.getInteger(ImportKeys.NUMBER_OF_LOOPS).orElse(0);

			// Skip this data set if the number of iterationss is zero.
			if (iterations == 0) {
				Log.startWithNoEnd("DataSet " + (dataSets.indexOf(parameters) + 1) + " skipped due to 0 iterations");
				continue;
			}

			DataKeys.EXPORT_PATH = DataKeys.IMPORT_PATH + "\\" + dataSets.indexOf(parameters) + "_"
					+ DataKeys.IMPORT_FILE_NAME + "_" + parameters.getString("passengerSortingScheme").get() + "_"
					+ parameters.get("ActiveDoorIDs") + "\\";

			System.out.println(parameters);

			// Import the cabin from CPACS file
			Model model = ImportCPACSAction.run(
					new File(DataKeys.IMPORT_PATH + parameters.getString(ImportKeys.CPACS_MODEL_NAME).get() + ".xml"));

			// Match data from CSV to EMF model and load passenger distribution
			Map<TravelClass, Integer> amounts = MatchDataAction.run(model, parameters);

			// Create the area map
			Areamap map = new Areamap(model.getDeck());

			// Loop through the iterations of the same simulation variant
			for (int i = 1; i <= iterations; i++) {

				System.out.println(Log.DIVIDER);

				Log.startWithNoEnd("Loop " + i + "/" + iterations + " of '"
						+ parameters.getString(ImportKeys.CPACS_MODEL_NAME).get() + "'");

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
		}

		time.stop();
		Log.start("All Completed");
		Log.end(time);
	}
}
