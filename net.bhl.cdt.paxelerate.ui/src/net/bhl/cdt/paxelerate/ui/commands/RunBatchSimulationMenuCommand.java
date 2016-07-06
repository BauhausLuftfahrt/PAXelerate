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

	/** The number of iterations. */
	private static int numberOfIterations = 10;

	/**
	 * This is the constructor method of the RunBatchSimulationMenuCommand.
	 */
	public RunBatchSimulationMenuCommand() {

	}

	/**
	 * Import csv study.
	 *
	 * @return the string[][]
	 */
	public ArrayList<ArrayList> importCSVStudy() {
		ArrayList<ArrayList> data = null;
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

		Log.add(this, "Batch simulation command ...");

		ArrayList<ArrayList> data = importCSVStudy();

		// first value is the number of studies
		for (ArrayList<ArrayList> study : data) {
			for (int simulationLoopIndex = 1; simulationLoopIndex <= numberOfIterations; simulationLoopIndex++) {
				new ECPModelImporter().doRun();
				new DefineBatchSimulationInput(study).doRun();
				new GeneratePassengersCommand().execute();
				new SimulateBoardingCommand(simulationLoopIndex).execute();
			}
		}

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
