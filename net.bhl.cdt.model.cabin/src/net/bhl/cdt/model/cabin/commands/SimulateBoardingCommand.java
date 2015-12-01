/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.model.cabin.commands;

import java.util.ArrayList;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.astar.ObstacleMap;
import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.Seat;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.SimulationView;
import net.bhl.cdt.model.cabin.util.OS;
import net.bhl.cdt.model.cabin.util.ShouldSoonBeDeletedWhenSolved;
import net.bhl.cdt.model.cabin.util.SimulationResultLogger;
import net.bhl.cdt.model.util.ModelHelper;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;

import com.paxelerate.storage.Exporter;
import com.paxelerate.util.Func;
import com.paxelerate.util.input.Input;
import com.paxelerate.util.input.Input.WindowType;
import com.paxelerate.util.math.Vector2D;

/**
 * This command starts the boarding simulation.
 * 
 * @author marc.engelmann
 */

public class SimulateBoardingCommand extends CDTCommand {

	private Cabin cabin;
	private static ArrayList<Passenger> alreadySeatedList = new ArrayList<Passenger>();
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
		cabin.getSimulationSettings().setRandomSortBetweenLoops(false);

		SimulationResultLogger results = new SimulationResultLogger();

		DrawCabinCommand drawCom = new DrawCabinCommand(cabin);
		drawCom.doRun();

		/********** Get CabinView and ConsoleView ***************/

		CabinViewPart cabinViewPart = ShouldSoonBeDeletedWhenSolved
				.getCabinView();
		/********************************************************/

		for (int i = 0; i < cabin.getSimulationSettings()
				.getNumberOfSimulationLoops(); i++) {

			if (cabin.getSimulationSettings().isRandomSortBetweenLoops()) {
				SortPassengersCommand sort = new SortPassengersCommand(cabin);
				sort.setPropertiesManually(false, 0);
				sort.doRun();
				cabin = sort.returnCabin();

				SortPassengersCommand sort2 = new SortPassengersCommand(cabin);
				int value = 0;
				switch (cabin.getSimulationSettings().getSorting()) {
				case RANDOM:
					value = 0;
				case WINDOW_TO_AISLE:
					value = 3;
				case REAR_TO_FRONT:
					value = 1;
				}
				if (value != 0) {
					sort2.setPropertiesManually(false, value);
					sort2.doRun();
					cabin = sort2.returnCabin();
				}
			}

			// reset simulation in case of previous existing objects.
			SimulationHandler.reset();

			// reset the passenger properties.
			for (Passenger passenger : cabin.getPassengers()) {
				passenger.setIsSeated(false);
				passenger.setBoardingTime(0);
			}

			for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
				seat.setOccupied(false);
			}

			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"Initializing new boarding simulation ..."));

			if (cabin.getPassengers().isEmpty()) {
				Input input = new Input(
						WindowType.GET_BOOLEAN,
						"You did not create any passengers. Random passeners are now created.",
						IMessageProvider.ERROR);
				if (input.getBooleanValue()) {
					GeneratePassengersCommand pax = new GeneratePassengersCommand(
							cabin);
					pax.doRun();
					System.out.println("PAX created!");
				}
			}
			if (!cabin.getPassengers().isEmpty()) {
				ObstacleMap obstaclemap = new ObstacleMap(cabin);

				SimulationHandler handler = new SimulationHandler(obstaclemap,
						new Vector2D((int) (cabin.getCabinWidth() / cabin
								.getScale()),
								(int) (cabin.getCabinLength() / cabin
										.getScale())), cabin);

				while (!SimulationHandler.isSimulationDone()) {
					// try {
					for (Passenger pax : ModelHelper.getChildrenByClass(
							handler.getPassengerLocations(), Passenger.class)) {
						if (pax.isIsSeated()
								&& !alreadySeatedList.contains(pax)) {
							alreadySeatedList.add(pax);
						}
					}
					if (OS.isMac()) {
						cabinViewPart.submitPassengerCoordinates(cabin);
					}
				}
				if (SimulationHandler.isSimulationDone()) {

					if (Exporter.generateHeatmapFile("Heat Map",
							SimulationHandler.getMap())) {
						logger.log(new Status(IStatus.ERROR,
								"net.bhl.cdt.model.cabin",
								"Heat map saved successfully!"));
					}

					if (Exporter.generateInterruptmapFile("Interrupt Map",
							SimulationHandler.getMap())) {
						logger.log(new Status(IStatus.ERROR,
								"net.bhl.cdt.model.cabin",
								"Interrupt map saved successfully!"));
					}

					for (Passenger pax : ModelHelper.getChildrenByClass(
							handler.getPassengerLocations(), Passenger.class)) {
						if (pax.isIsSeated()
								&& !alreadySeatedList.contains(pax)) {
							alreadySeatedList.add(pax);
							try {
							} catch (NullPointerException e) {
								logger.log(new Status(IStatus.ERROR,
										"net.bhl.cdt.model.cabin",
										"Info view is not visible."));
							}
						}
					}

					SimulationView.getWatch().stop();

					if (!obstaclemap.equals(null)) {
						Image image = cabinViewPart
								.submitObstacleMap(obstaclemap.getMap());
						obstaclemap.printObstacleMap();
						cabinViewPart.printObstacleMap(image);

						logger.log(new Status(IStatus.INFO,
								"net.bhl.cdt.model.cabin",
								"Heat map generation succeeded"));
					}

					if (!SimulationHandler.getAgentList().isEmpty()) {
						cabinViewPart.submitAgents(SimulationHandler
								.getAgentList());
						logger.log(new Status(IStatus.INFO,
								"net.bhl.cdt.model.cabin",
								"Paths printed successfully"));
					}
					logger.log(new Status(IStatus.INFO,
							"net.bhl.cdt.model.cabin",
							"Boarding simulation completed"));
				}
			} else {
				logger.log(new Status(IStatus.ERROR, "net.bhl.cdt.model.cabin",
						"No boarding possible! Please create passengers!"));
			}
			results.getSimulationData(
					SimulationHandler.getCabin(),
					i + 1,
					Func.round(
							(SimulationView.getWatch().getElapsedTimeSecs() * (double) cabin
									.getSimulationSettings()
									.getSimulationSpeedFactor()), 2));
		}
		results.printSimulationData();
		cabinViewPart.clearCache();
	}
}
