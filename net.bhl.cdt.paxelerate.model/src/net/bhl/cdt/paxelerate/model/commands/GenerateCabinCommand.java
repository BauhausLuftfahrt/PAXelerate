/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.BusinessClass;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.EconomyClass;
import net.bhl.cdt.paxelerate.model.EmergencyExit;
import net.bhl.cdt.paxelerate.model.FirstClass;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.MainDoor;
import net.bhl.cdt.paxelerate.model.PremiumEconomyClass;
import net.bhl.cdt.paxelerate.model.StandardDoor;
import net.bhl.cdt.paxelerate.model.ui.CabinViewPart;
import net.bhl.cdt.paxelerate.model.util.ConstructionLibrary;
import net.bhl.cdt.paxelerate.model.util.ShouldSoonBeDeletedWhenSolved;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

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
	private ConstructionLibrary constructor;

	/**
	 * Creates a cabin.
	 * 
	 * @param cabin
	 *            is the input cabin
	 */
	public GenerateCabinCommand(Cabin cabin) {
		this.cabin = cabin;
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
				Log.add(this, "Error defining aircraft width.");
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
		Log.add(this, "Initializing cabin generation ...");

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

		Log.add(this, "Cabin generation completed");
		try {
			cabinViewPart.setCabin(cabin);
			cabinViewPart.syncViewer();
		} catch (NullPointerException e) {
			Log.add(this, "The cabin or info view is not visible.");
		}

	}

}
