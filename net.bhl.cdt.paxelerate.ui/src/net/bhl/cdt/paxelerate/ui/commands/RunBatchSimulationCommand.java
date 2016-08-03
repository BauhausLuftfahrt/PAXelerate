/*******************************************************************************
* <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
* materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
* and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.io.IOException;
import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.ui.helper.DefineBatchSimulationInput;
import net.bhl.cdt.paxelerate.ui.helper.ECPModelImporter;
import net.bhl.cdt.paxelerate.ui.preferences.PAXeleratePreferencePage;
import net.bhl.cdt.paxelerate.ui.helper.DefineBatchSimulationInput.HandLuggageCase;
import net.bhl.cdt.paxelerate.util.input.CSVImport;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class RunBatchSimulationMenuCommand.
 *
 * @author michael.schmidt
 * @version 0.8
 * @since 0.7
 */

public class RunBatchSimulationCommand extends CDTCommand {

	/** The stopwatch. */
	private StopWatch stopwatch = new StopWatch();

	/** The iteration completed. */
	private int iterationCompleted;

	/** The iteration failed. */
	private int iterationFailed;

	/**
	 * This is the constructor method of the RunBatchSimulationMenuCommand.
	 */
	public RunBatchSimulationCommand() {

	}

	/**
	 * Import csv study.
	 *
	 * @return the ArrayList<ArrayList<String>>
	 */
	public ArrayList<ArrayList<String>> importCSVStudy() {
		ArrayList<ArrayList<String>> data = null;
		try {
			CSVImport importer = new CSVImport(PAXeleratePreferencePage.DEFAULT_IMPORT_FILE_NAME,
					PAXeleratePreferencePage.DEFAULT_IMPORT_PATH);
			importer.openSpecificFile();
			data = importer.readData();
			importer.closeFile();
			Log.add(this, "Study data import completed");
			return data;
		} catch (IOException e) {
			Log.add(this, "IOException: Data import failed!");
			return null;
		}
		
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected final void doRun() {

		Log.add(this, "Start batch simulation ...");

		stopwatch.start();

		ArrayList<ArrayList<String>> data = importCSVStudy();

		int studyNumb = 1;
		int iterationNumb = 1;

		if (data != null) {
			for (ArrayList<String> study : data) {
				for (int simulationLoopIndex = 1; simulationLoopIndex <= (Integer
						.parseInt(study.get(1))); simulationLoopIndex++) {
					new ECPModelImporter(study.get(10)).doRun();
					new DefineBatchSimulationInput(study).doRun();
					new GeneratePassengersCommand().execute();
					SimulateBoardingCommand simulation = new SimulateBoardingCommand(simulationLoopIndex);
					simulation.execute();
					if (simulation.getSimulationStatus()) {
						iterationCompleted++;
					} else {
						iterationFailed++;
					}
					Log.add(this, "Iteration " + simulationLoopIndex + "/" + Integer.parseInt(study.get(1)) + " Study "
							+ studyNumb + "/" + data.size());
					iterationNumb++;
				}
				studyNumb++;
			}
			stopwatch.stop();
			Log.add(this, "... batch simulation completed: " + Math.round(stopwatch.getElapsedTimeMins()) + " mins, "
					+ iterationNumb + " iterations in " + data.size() + " studies.");
			Log.add(this, "Iterations: " + iterationCompleted + " completed / " + iterationFailed + " failed");
		}
	}
}
