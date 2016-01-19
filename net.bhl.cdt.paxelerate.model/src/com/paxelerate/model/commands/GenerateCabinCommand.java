/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.commands;

import net.bhl.cdt.commands.CDTCommand;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.paxelerate.model.BusinessClass;
import com.paxelerate.model.Cabin;
import com.paxelerate.model.EconomyClass;
import com.paxelerate.model.EmergencyExit;
import com.paxelerate.model.FirstClass;
import com.paxelerate.model.Galley;
import com.paxelerate.model.Lavatory;
import com.paxelerate.model.MainDoor;
import com.paxelerate.model.PremiumEconomyClass;
import com.paxelerate.model.StandardDoor;
import com.paxelerate.model.ui.CabinViewPart;
import com.paxelerate.model.ui.InfoViewPart;
import com.paxelerate.model.util.ConstructionLibrary;
import com.paxelerate.model.util.ShouldSoonBeDeletedWhenSolved;
import com.paxelerate.util.Func;

/**
 * 
 * This script is used to build up the cabin according to predefined settings.
 * 
 * @author marc.engelmann
 * @version 1.3
 *
 */

public class GenerateCabinCommand extends CDTCommand {

	private Cabin cabin;
	private CabinViewPart cabinViewPart;
	private ILog logger;
	private ConstructionLibrary constructor;

	/**
	 * Creates a cabin.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public GenerateCabinCommand(Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.paxelerate.model"));
		cabin.getSimulationSettings().setSimulationSpeedFactor(1);
		if (cabin.isUsePresetSettings()) {
			switch (cabin.getAircraftType()) {
			case REGIONAL:
				cabin.setCabinWidth(300);
				cabin.setCabinLength(2000);
				break;
			case CONTINENTAL:
				cabin.setCabinWidth(364);
				cabin.setCabinLength(2460);
				break;
			case INTERCONTINENTAL:
				cabin.setCabinWidth(650);
				cabin.setCabinLength(4440);
				break;
			default:
				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.paxelerate.model",
						"Error defining aircraft width."));
				break;
			}
		}
	}

	/**
	 * This method generates the cabin structure with the help of the
	 * construction library. This is the main function of the generate cabin
	 * command.
	 */
	@Override
	protected void doRun() {
		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
				"Initializing cabin generation ..."));

		/*************** Get the CabinView *******************/
		cabinViewPart = ShouldSoonBeDeletedWhenSolved.getCabinView();
		cabinViewPart.unsyncViewer();
		/*****************************************************/

		/* ------------------------------------------------- */
		/* ------- Cabin Construction starts here! --------- */
		/* ------------------------------------------------- */
		constructor = new ConstructionLibrary(cabin);
		constructor.clearCabin(); // clear the predecessor cabin (if existent)
		constructor.createDoor(EmergencyExit.class, true, 3, 935);
		constructor.createDoor(EmergencyExit.class, true, 4, 1228);
		constructor.createPhysicalObject(Lavatory.class, 100);
		constructor.createDoor(MainDoor.class, true, 1, -1);
		constructor.createPhysicalObject(Galley.class, 100);
		constructor.createClass(FirstClass.class);
		constructor.createClass(BusinessClass.class);
		constructor.createClass(PremiumEconomyClass.class);
		constructor.createClass(EconomyClass.class);
		constructor.createPhysicalObject(Galley.class, 100);
		constructor.createDoor(StandardDoor.class, true, 2, -1);
		constructor.createPhysicalObject(Lavatory.class, 100);
		cabin = constructor.getCabin(); // sync cabins
		cabin.setUsePresetSettings(false);
		/* ------------------------------------------------- */
		/* ------- Cabin Construction ends here! ----------- */
		/* ------------------------------------------------- */

		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
				"Cabin generation completed"));
		try {
			cabinViewPart.setCabin(cabin);
			cabinViewPart.syncViewer();
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.paxelerate.model",
					"The cabin or info view is not visible."));
		}

	}

}
