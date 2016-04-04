/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.ui.commands;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.storage.Exporter;
import net.bhl.cdt.paxelerate.model.util.SimulationResultLogger;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.SimulationView;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.math.DecimalHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;
import net.bhl.cdt.paxelerate.util.toOpenCDT.OS;

/**
 * This command starts the boarding simulation.
 * 
 * @author marc.engelmann
 */

public class SimulateBoardingCommand extends CDTCommand {

	private Cabin cabin;
	private static ArrayList<Passenger> alreadySeatedList = new ArrayList<Passenger>();
	private JFrame simulationFrame;
	private SimulationHandler simulationhandler;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param shell
	 *            the shell where the command was triggered
	 * @param cabin
	 *            the cabin object
	 */
	public SimulateBoardingCommand(Cabin cabin) {
		this.cabin = cabin;
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
		// Create separate thread
		Job job = new Job("Simulate Boarding Thread") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				cabin.getSimulationSettings().setRandomSortBetweenLoops(false);

				SimulationResultLogger results = new SimulationResultLogger();

				DrawCabinCommand drawCom = new DrawCabinCommand(cabin);
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						drawCom.doRun();
					}
				});

				CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();

				for (int i = 0; i < cabin.getSimulationSettings().getNumberOfSimulationLoops(); i++) {

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

					Log.add(this, "Initializing new boarding simulation ...");

					if (cabin.getPassengers().isEmpty()) {
						Input input = new Input(WindowType.GET_BOOLEAN,
								"You did not create any passengers. Random passeners are now created.",
								IMessageProvider.ERROR);
						if (input.getBooleanValue()) {
							GeneratePassengersCommand pax = new GeneratePassengersCommand(cabin);
							pax.doRun();
							System.out.println("PAX created!");
						}
					}

					Vector dimensions = new Vector2D(cabin.getXDimension(), cabin.getYDimension(), cabin.getSimulationSettings().getScale());
					simulationhandler = new SimulationHandler(dimensions, cabin);

					// Show WIP simulation view
					runAreaMapWindow();

					while (!SimulationHandler.isSimulationDone()) {
						for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
							if (pax.isIsSeated() && !alreadySeatedList.contains(pax)) {
								alreadySeatedList.add(pax);
							}
						}
						if (OS.isMac()) {
							// cabinViewPart.submitPassengerCoordinates(cabin);
						}
					}
					if (SimulationHandler.isSimulationDone()) {

						/* closes the simulation view after completion */
						simulationFrame.dispose();

						if (Exporter.generateHeatmapFile("Heat Map", SimulationHandler.getMap())) {
							Log.add(this, "Heat map saved successfully!");
						}

						if (Exporter.generateInterruptmapFile("Interrupt Map", SimulationHandler.getMap())) {
							Log.add(this, "Interrupt map saved successfully!");
						}

						for (Passenger pax : ModelHelper.getChildrenByClass(simulationhandler.getPassengerLocations(),
								Passenger.class)) {
							if (pax.isIsSeated() && !alreadySeatedList.contains(pax)) {
								alreadySeatedList.add(pax);
								try {
								} catch (NullPointerException e) {
									Log.add(this, "Info view is not visible.");
								}
							}
						}

						SimulationView.getWatch().stop();

						Display.getDefault().syncExec(new Runnable() {
							@Override
							public void run() {
								Image image = cabinViewPart
										.submitObstacleMap(SimulationHandler.getMap().getObstacleMap().getMap());
								cabinViewPart.printObstacleMap(image);
								cabinViewPart.submitAgents(SimulationHandler.getAgentList());
							}
						});

						Log.add(this, "Boarding simulation completed");
					}

					// TODO do not round results, rounding should ONLY happen
					// for
					// displaying (not for internal calculations)
					results.getSimulationData(SimulationHandler.getCabin(), i + 1,
							DecimalHelper.round((SimulationView.getWatch().getElapsedTimeSecs()
									* (double) cabin.getSimulationSettings().getSimulationSpeedFactor()), 2));
				}
				results.printSimulationData();

				/* Clear the cache! */
				cabinViewPart.clearCache();

				// PUBLISH
				Log.add(this, "Updating GUI...");
				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {

					}
				});

				// report finished
				return Status.OK_STATUS;
			}
		};

		// Start the Job
		job.schedule();
	}

	private void runAreaMapWindow() {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				simulationFrame = new JFrame("Simulation Detail View");
				SimulationView simulationView = new SimulationView();
				simulationView.setAreamap(SimulationHandler.getMap());
				simulationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				simulationFrame.setContentPane(simulationView);
				simulationFrame.pack();
				simulationFrame.setVisible(true);

				WindowListener exitListener = new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						simulationhandler.stopSimulation();
					}
				};
				simulationFrame.addWindowListener(exitListener);
			}
		});
	}
}
