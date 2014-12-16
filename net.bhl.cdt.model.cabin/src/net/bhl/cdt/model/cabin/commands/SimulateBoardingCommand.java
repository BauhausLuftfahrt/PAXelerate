/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.astar.ObstacleMap;
import net.bhl.cdt.model.astar.RunAStar;
import net.bhl.cdt.model.astar.StopWatch;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.InfoViewPart;
import net.bhl.cdt.model.cabin.util.Vector;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * This command starts the cabin boarding simulation.
 * 
 * @author marc.engelmann
 */

/********************How to add a new right click command to openCDT***********************/
/**                                                                                      **/
/** (1) Create a new "newCommand.java" in "net.bhl.cdt.model.cabin.commands"             **/
/**     - Best practice: copy an existing command.                                       **/
/**     - Be sure to not modify the constructor, "this.cabin = cabin" should stay intact **/
/**                                                                                      **/
/** (2) Create a new "newCommandHandler.java" in "net.bhl.cdt.model.cabin.handlers"      **/
/**     - Best practice: copy an existing handler file.                        		     **/
/**     - Tip: Do not modify this file, only check for correct naming         			 **/
/**                         															 **/
/** (3) Open "plugin.xml" and go to "org.eclipse.ui.commands"                			 **/
/**     - Create a new command by right-clicking.                                        **/
/**     - Fill in the id, name and default handler. (Caution: case sensitive!)           **/
/**                                                        								 **/
/** (4) Go to "org.eclipse.ui.menus" in "plugin.xml"                                     **/
/**     - Expand the "popup:org.eclipse.(...)" entry.                                    **/
/**     - Add a new command by right-clicking.                                           **/
/**     - Fill in the correct commandID and your desired label name.                     **/
/**     - Add a new parameter by right-clicking.                                         **/
/**     - Set the parameter to "false (visible when)".      							 **/
/**     - Add a parameter within called "iterate".            						     **/
/**     - Add a parameter within called "instanceOf" and choose "cabin". 			     **/
/**                                            											 **/
/******************************************************************************************/

public class SimulateBoardingCommand extends CDTCommand {

	private Cabin cabin;
	private static ArrayList<Passenger> alreadySeatedList = new ArrayList<Passenger>();
	private static StopWatch s = new StopWatch();
	private ILog logger;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param shell
	 *            the shell where the command was triggered
	 * @param cabin
	 *            the cabin object
	 */
	public SimulateBoardingCommand(Shell shell, Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
	}
	
	/**
	 * Returns the list with seated passengers.
	 * @return the passenger list
	 */
	public static ArrayList<Passenger> getSeatedPassengers() {
		return alreadySeatedList;
	}

	@Override
	protected void doRun() {

		cabin.setFramesPerSecond(10);
		
		/********************************** Get CabinView and ConsoleView ***************************************/
		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		CabinViewPart cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
		InfoViewPart infoViewPart = (InfoViewPart) page
				.findView("net.bhl.cdt.model.cabin.infoview");
		/********************************************************************************************************/

		logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
				"Initializing the boarding simulation ..."));
		s.start();
		if (!cabin.getPassengers().isEmpty()) {
			ObstacleMap obstaclemap = new ObstacleMap(cabin);
			RunAStar astar = new RunAStar(obstaclemap, new Vector(
					(int) (cabin.getCabinWidth() / cabin.getScale()),
					(int) (cabin.getCabinLength() / cabin.getScale())), cabin);
			while (!RunAStar.getSimulationDone()) {
				try {
					for (Passenger pax : ModelHelper.getChildrenByClass(
							astar.getPassengerLocations(), Passenger.class)) {
						if (pax.isIsSeated()
								&& !alreadySeatedList.contains(pax)) {
							logger.log(new Status(IStatus.INFO,
									"net.bhl.cdt.model.cabin", "Passenger "
											+ pax.getName() + " is now seated!"));
							alreadySeatedList.add(pax);
						}
					}
					cabinViewPart.submitPassengerCoordinates(astar
							.getPassengerLocations());
					infoViewPart.update(cabin);
					Thread.sleep((int) (1000 / cabin.getFramesPerSecond()));
				} catch (InterruptedException e) {
					logger.log(new Status(IStatus.ERROR,
							"net.bhl.cdt.model.cabin",
							"An error occured during simulation."));
					e.printStackTrace();
				}
			}
			if (RunAStar.getSimulationDone()) {
				for (Passenger pax : ModelHelper.getChildrenByClass(
						astar.getPassengerLocations(), Passenger.class)) {
					if (pax.isIsSeated() && !alreadySeatedList.contains(pax)) {

						logger.log(new Status(IStatus.INFO,
								"net.bhl.cdt.model.cabin", "Passenger "
										+ pax.getName() + " is now seated!"));
						alreadySeatedList.add(pax);
					}
				}

				s.stop();
				logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
						"Elapsed time for boarding: " + s.getElapsedTimeSecs()
								+ " seconds"));

				if (!obstaclemap.equals(null)) {
					cabinViewPart.submitObstacleMap(obstaclemap.getMap());
					
					logger.log(new Status(IStatus.INFO,
							"net.bhl.cdt.model.cabin",
							"Heat map generation succeeded"));
				}

				if (!RunAStar.getPathList().isEmpty()) {
					cabinViewPart.submitPath(RunAStar.getPathList());
					logger.log(new Status(IStatus.INFO,
							"net.bhl.cdt.model.cabin",
							"Paths printed successfully"));
				}
				logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
						"Boarding simulation completed"));
			}
		} else {
			logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
					"No boarding possible! Please create passengers!"));
		}

	}
}
