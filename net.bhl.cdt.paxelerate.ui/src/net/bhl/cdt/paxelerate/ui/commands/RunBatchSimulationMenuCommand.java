/*******************************************************************************
* <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
* materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
* and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.io.IOException;

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
	 * @param fileName the file name
	 * @return the string[][]
	 */
	public String[][] importCSVStudy() { 
		String[][] data = null;
		try {
			CSVImport importer = new CSVImport ("study_import", PAXeleratePreferencePage.DEFAULT_EXPORT_PATH);
			importer.openSpecificFile();
			data = importer.readData();
			importer.closeFile();
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
		
		String[][] data = importCSVStudy();
		
		int i=1;
		/* first value is the number of studies */
		while (data[i][0] != null) {

				for (int simulationLoopIndex = 1; simulationLoopIndex <= numberOfIterations; simulationLoopIndex++) {
					new ECPModelImporter().doRun();
					new DefineBatchSimulationInput().doRun();
					new GeneratePassengersCommand().execute();
					new SimulateBoardingCommand(simulationLoopIndex).execute();
				}
			i++;
		}
		

		/*for (HandLuggageCase handLuggageCase : HandLuggageCase.values()) {
			for (int loadFactorIndex = 80; loadFactorIndex <= 100; loadFactorIndex += 10) {
				for (int simulationLoopIndex = 1; simulationLoopIndex <= numberOfIterations; simulationLoopIndex++) {
					new ECPModelImporter().doRun();
					new DefineBatchSimulationInput(HandLuggageCase.BULKY_HL, loadFactorIndex).doRun();
					new GeneratePassengersCommand().execute();
					new SimulateBoardingCommand(simulationLoopIndex).execute();
				}
			}
		}*/
	}
}
