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
	 * 
	 * @return the passenger list
	 */
	public static ArrayList<Passenger> getSeatedPassengers() {
		return alreadySeatedList;
	}

	/**
	 * This method runs the simulate boarding command.
	 */
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
							try {
								infoViewPart.update(cabin);
							} catch (NullPointerException e) {
								logger.log(new Status(IStatus.ERROR,
										"net.bhl.cdt.model.cabin",
										"Info view is not visible."));
							}
						}
					}
					try {
						cabinViewPart.submitPassengerCoordinates(astar
								.getPassengerLocations());
					} catch (NullPointerException e) {
						logger.log(new Status(IStatus.ERROR,
								"net.bhl.cdt.model.cabin",
								"cabin view is not visible."));
					}
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
						try {
							infoViewPart.update(cabin);
						} catch (NullPointerException e) {
							logger.log(new Status(IStatus.ERROR,
									"net.bhl.cdt.model.cabin",
									"Info view is not visible."));
						}
					}
				}

				s.stop();
				logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
						"Elapsed time for boarding: " + s.getElapsedTimeSecs()
								+ " seconds"));

				if (!obstaclemap.equals(null)) {
					Image image = cabinViewPart.submitObstacleMap(obstaclemap
							.getMap());
					cabinViewPart.printObstacleMap(image);

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
