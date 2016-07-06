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
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class RunBatchSimulationMenuCommand.
 *
 * @author michael.schmidt
 * @version 1.0
 * @since 0.7
 */

public class RunBatchSimulationMenuCommand extends CDTCommand {

	/**
	 * This is the constructor method of the RunBatchSimulationMenuCommand.
	 */
	public RunBatchSimulationMenuCommand() {

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
		} catch (IOException e) {
			Log.add(this, "Data import failed!");
		}
		return data;
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected final void doRun() {

		Log.add(this, "Start batch simulation ...");

		ArrayList<ArrayList<String>> data = importCSVStudy();

		int i = 1;
		int y = 1;

		for (ArrayList<String> study : data) {
			for (int simulationLoopIndex = 1; simulationLoopIndex <= (Integer
					.parseInt(study.get(1))); simulationLoopIndex++) {
				new ECPModelImporter(study.get(10)).doRun();
				new DefineBatchSimulationInput(study).doRun();
				new GeneratePassengersCommand().execute();
				new SimulateBoardingCommand(simulationLoopIndex).execute();
				Log.add(this, "Iteration " + simulationLoopIndex + "/" + Integer.parseInt(study.get(1))
						+ " completed. Study " + i + "/" + data.size());
				y++;
			}
			i++;
		}
		Log.add(this, "... batch simulation completed: " + y + " iterations in " + data.size() + " studies.");

		/*
		 * //for (HandLuggageCase handLuggageCase : HandLuggageCase.values()) {
		 * for (int loadFactorIndex = 60; loadFactorIndex <= 100;
		 * loadFactorIndex += 10) { for (int simulationLoopIndex = 1;
		 * simulationLoopIndex <= numberOfIterations; simulationLoopIndex++) {
		 * new ECPModelImporter().doRun(); new
		 * DefineBatchSimulationInput(HandLuggageCase.BULKY_HL,
		 * loadFactorIndex).doRun(); new GeneratePassengersCommand().execute();
		 * new SimulateBoardingCommand(simulationLoopIndex).execute(); } } //}
		 */ }
}
