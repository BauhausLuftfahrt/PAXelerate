/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.cabin.commands;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.BusinessClass;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.EconomyClass;
import net.bhl.cdt.model.cabin.EmergencyExit;
import net.bhl.cdt.model.cabin.FirstClass;
import net.bhl.cdt.model.cabin.MainDoor;
import net.bhl.cdt.model.cabin.PremiumEconomyClass;
import net.bhl.cdt.model.cabin.StandardDoor;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.InfoViewPart;
import net.bhl.cdt.model.cabin.util.ConstructionLibrary;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

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
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
	}

	@Override
	/**
	 * This method generates the cabin structure with the help 
	 * of the construction library. This is  the main function 
	 * of the generate cabin command. Please note the following:
	 * 
	 *  - Emergency Exits must be generated at first.
	 *  - Only create one main door.
	 *  - Create all other objects in the order they appear within
	 *    the cabin (from front to rear).
	 */
	protected void doRun() {
		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"Initializing cabin generation ..."));

		/*************** Get the CabinView *******************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		InfoViewPart infoViewPart = (InfoViewPart) page
				.findView("net.bhl.cdt.model.cabin.infoview");
		cabinViewPart.unsyncViewer();
		/*****************************************************/

		/* ------------------------------- */
		/* Cabin Construction starts here! */
		/* ------------------------------- */
		constructor = new ConstructionLibrary(cabin);
		constructor.clearCabin(); // clear the predecessor cabin (if existent)
		constructor.createDoor(EmergencyExit.class, true, 3, 935);
		constructor.createDoor(EmergencyExit.class, true, 4, 1228);
		//constructor.createLavatory(100);
		constructor.createDoor(MainDoor.class, true, 1, -1);
		constructor.createGalley(100);
		constructor.createClass(FirstClass.class);
		constructor.createClass(BusinessClass.class);
		constructor.createClass(PremiumEconomyClass.class);
		constructor.createClass(EconomyClass.class);
		constructor.createGalley(100);
		constructor.createDoor(StandardDoor.class, true, 2, -1);
		//constructor.createLavatory(100);
		cabin = constructor.getCabin(); // sync cabin with constructed cabin
		/* ----------------------------- */
		/* Cabin Construction ends here! */
		/* ----------------------------- */

		if (constructor.getGlobalSeatPositionY() > cabin.getCabinLength()) {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"Out of bounds! Cabin too short."));
		}

		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"Cabin generation completed"));
		try {
			cabinViewPart.setCabin(cabin);
			infoViewPart.update(cabin);
			cabinViewPart.syncViewer();
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"The cabin view is not visible or you did not generate one."));
		}

	}

}
