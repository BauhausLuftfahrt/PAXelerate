/*******************************************************************************
* <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
* materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
* and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.ui.helper.DefineBatchSimulationInput;
import net.bhl.cdt.paxelerate.ui.helper.ECPModelImporter;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class RunBatchSimulationMenuCommand.
 *
 * @author michael.schmidt
 */

public class RunBatchSimulationMenuCommand extends CDTCommand {

	private static int numberOfIterations = 30;
	
	/**
	 * This is the constructor method of the RunBatchSimulationMenuCommand.
	 */
	public RunBatchSimulationMenuCommand() {

	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected final void doRun() {

		Log.add(this, "Batch simulation command ...");

		for (int simulationLoopIndex = 1; simulationLoopIndex <= numberOfIterations; simulationLoopIndex++) {

			new ECPModelImporter().doRun();
			new DefineBatchSimulationInput().doRun();
			new GeneratePassengersCommand().execute();
			new SimulateBoardingCommand().execute();
		}

	}
}
