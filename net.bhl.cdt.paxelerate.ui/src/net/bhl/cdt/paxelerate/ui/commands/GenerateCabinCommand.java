/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.EmergencyExit;
import net.bhl.cdt.paxelerate.model.Galley;
import net.bhl.cdt.paxelerate.model.Lavatory;
import net.bhl.cdt.paxelerate.model.MainDoor;
import net.bhl.cdt.paxelerate.model.StandardDoor;
import net.bhl.cdt.paxelerate.model.TravelOption;
import net.bhl.cdt.paxelerate.model.util.ConstructionLibrary;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
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
		if (cabin.isUsePresetSettings()) {
			switch (cabin.getAircraftType()) {
			case REGIONAL:
				cabin.setYDimension(300);
				cabin.setXDimension(2000);
				break;
			case NARROWBODY:
				cabin.setYDimension(364);
				cabin.setXDimension(2460);
				break;
			case WIDEBODY:
				cabin.setYDimension(650);
				cabin.setXDimension(4440);
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

		cabinViewPart = ViewPartHelper.getCabinView();

		Input input = new Input(WindowType.GET_BOOLEAN, "Warning! The existing cabin will be deleted. Continue?",
				IMessageProvider.WARNING);

		if (input.getBooleanValue()) {

			/* ------- Cabin Construction starts here! --------- */
			constructor = new ConstructionLibrary(cabin);
			constructor.clearCabin();
			constructor.createDoor(EmergencyExit.class, true, 3, 935);
			constructor.createDoor(EmergencyExit.class, true, 4, 1228);
			constructor.createPhysicalObject(Lavatory.class, 100);
			constructor.createDoor(MainDoor.class, true, 1, -1);
			constructor.createPhysicalObject(Galley.class, 100);

			/*
			 * Note that the classes are generated in the order that they are
			 * defined in in the enum
			 */
			for (TravelOption option : TravelOption.VALUES) {
				constructor.createClass(option);
			}

			constructor.createPhysicalObject(Galley.class, 100);
			constructor.createDoor(StandardDoor.class, true, 2, -1);
			constructor.createPhysicalObject(Lavatory.class, 100);
			cabin = constructor.getCabin();
			cabin.setUsePresetSettings(false);
			/* ------- Cabin Construction ends here! ----------- */

			Log.add(this, "Cabin generation completed");
			try {
				cabinViewPart.setCabin(cabin);
				cabinViewPart.syncViewer();
			} catch (NullPointerException e) {
				Log.add(this, "The cabin or info view is not visible.");
			}
		} else {
			Log.add(this, "Cabin generation aborted");
		}
	}

}
