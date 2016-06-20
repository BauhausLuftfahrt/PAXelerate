/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/

package net.bhl.cdt.paxelerate.ui.commands;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.agent.Agent.AgentMode;
import net.bhl.cdt.paxelerate.model.astar.Costmap;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.util.SimulationResultLogger;
import net.bhl.cdt.paxelerate.ui.export.FileSaver;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.SimulationView;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.exchange.ExcelExport;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This command starts the boarding simulation.
 * 
 * @author marc.engelmann, michael.schmidt
 */

public class SimulateBoardingCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The simulation frame. */
	private JFrame simulationFrame;

	final JobScheduleRule jobRule = new JobScheduleRule();

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param cabin
	 *            the cabin object
	 */
	public SimulateBoardingCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	public SimulateBoardingCommand() {
		if (ECPUtil.getECPProjectManager().getProjects() != null) {
			Cabin cabinModel = (Cabin) ECPUtil.getECPProjectManager().getProject("reference").getContents().get(0);
			this.cabin = EcoreUtil.copy(cabinModel);
			}
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected void doRun() {

		// Create separate thread
		Job job = new Job("Simulate Boarding Thread") {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
			 * IProgressMonitor)
			 */
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				
				int simulationLoopIndex = 1;
				Log.add(this, "Initializing new simulation run ...");

				CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();
				

				new GeneratePassengersCommand(cabin).doRun();

				if (cabin.getSimulationSettings().isSortPassengerBetweenLoops()) {

					// sorts the passenger according to selected method
					SortPassengersCommand sort = new SortPassengersCommand(cabin);
					sort.setPropertiesManually(false, 0);
					sort.doRun();
					cabin = sort.returnCabin();

					SortPassengersCommand sort2 = new SortPassengersCommand(cabin);
					int value = 0;
					switch (cabin.getSimulationSettings().getSorting()) {
					case RANDOM:
						value = 0;
						break;
					case WINDOW_TO_AISLE:
						value = 3;
						break;
					case REAR_TO_FRONT:
						value = 1;
						break;
					}
					if (value != 0) {
						sort2.setPropertiesManually(false, value);
						sort2.doRun();
						cabin = sort2.returnCabin();
					}
				}

				/* reset simulation in case of previous existing objects. */
				SimulationHandler.reset();

				/* reset the passenger properties */
				for (Passenger passenger : cabin.getPassengers()) {
					passenger.setIsSeated(false);
					passenger.setBoardingTime(0);
				}

				for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
					seat.setOccupied(false);
				}

				if (cabin.getPassengers().isEmpty()) {
					Input input = new Input(WindowType.GET_BOOLEAN,
							"You did not create any passengers. Random passeners are now created.",
							IMessageProvider.ERROR);
					if (input.getBooleanValue()) {
						new GeneratePassengersCommand(cabin).doRun();
						Log.add(this, "PAX created!");
					}
				}

				Vector dimensions = new Vector2D(cabin.getXDimension(), cabin.getYDimension(),
						cabin.getSimulationSettings().getScale());

				new SimulationHandler(dimensions, cabin, simulationLoopIndex);

				// WIP
				FileSaver.saveObstacleToFile(SimulationHandler.getMap(), dimensions);

				// Show WIP simulation view
				if(!cabin.getSimulationSettings().isSimulateWithoutUI()) {
					runAreaMapWindow();
				}				

				// TODO: INSERT PAX LOCATION SUBMIT TO CABINVIEWPART
				// HERE

				while (!SimulationHandler.isSimulationDone()) {

					/* wait for completion! */
					try {
						// TODO: send UI update to ViewPart

						System.out.println("sleep check");

						for (Passenger sleepyPassenger : cabin.getPassengers()) {

							long timestamp = SimulationHandler.getAgentByPassenger(sleepyPassenger)
									.getLastMoveTimestamp();

							if (!sleepyPassenger.isIsSeated() && timestamp != 0 && SimulationHandler
									.getAgentByPassenger(sleepyPassenger).getAgentMode() != AgentMode.MAKE_WAY) {
								if ((System.currentTimeMillis() - SimulationHandler.getAgentByPassenger(sleepyPassenger)
										.getLastMoveTimestamp()) > (60 * 1000)) {
									System.out.println(sleepyPassenger.getName() + "has caused interuption!");

									SimulationHandler.setSimulationStatus(true);
									SimulationHandler.reset();
									
									if(!cabin.getSimulationSettings().isSimulateWithoutUI()) {
										simulationFrame.dispose();
									}									

									Log.add(this, "SIMULATION TERMINATED! Passenger " + sleepyPassenger.getName()
											+ " did not react.");

									return Status.CANCEL_STATUS;
								}
							}
						}

						Thread.sleep(50000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} catch (NullPointerException e) {
						e.printStackTrace();
					}
				}

				/* closes the simulation view after completion */
				if(!cabin.getSimulationSettings().isSimulateWithoutUI()) {
					simulationFrame.dispose();
				}					

				SimulationResultLogger results = new SimulationResultLogger();

				results.getSimulationData(cabin, simulationLoopIndex,
						SimulationHandler.getMasterBoardingTime().getElapsedTime() / 1000
								* cabin.getSimulationSettings().getSimulationSpeedFactor(),
						SimulationHandler.getNumberWaymakingSkipped(), SimulationHandler.getNumberWaymakingCompleted());

				if (cabin.getSimulationSettings().isDataExport()) {

					// Exporting data
					try {

						/*ExcelExport exporter = new ExcelExport("iteration" + simulationLoopIndex);
						exporter.createFile();
						ExportDataCommand exportData = new ExportDataCommand(cabin, exporter);
						exportData.generateDistributionFile();
						exportData.getPassengerData();
						exportData.getSimulationPropertiesData();
						exporter.closeFile();*/

						ExcelExport exporterResults = new ExcelExport("results_michi");
						exporterResults.createFile();
						ExportDataCommand exportDataResults = new ExportDataCommand(cabin, exporterResults);
						exportDataResults.getStudySettings();
						exportDataResults.getResultData();
						exporterResults.closeFile();

					} catch (FileNotFoundException e) {
						Log.add(this, "Data export failed! - FileNotFoundException ");
					} catch (IOException e) {
						Log.add(this, "Data export failed! - IOException");
					}

					Map<Integer, Costmap> costmaps = SimulationHandler.getUsedCostmaps();

					int index = 0;

					for (Costmap costmap : costmaps.values()) {

						// save the CostMap to the local file system
						FileSaver.saveCostmapToFile(costmap, dimensions, Integer.toString(index));

						index++;
					}

					FileSaver.saveObstacleToFile(SimulationHandler.getMap(), dimensions);

				}

				/*
				 * display the agent path and cost map in the Cabin UI view
				 */
				if (cabin.getSimulationSettings().isDisplayMap()) {
					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							Image image = cabinViewPart
									.submitObstacleMap(SimulationHandler.getAreamapHandler().getObstaclemap());
							cabinViewPart.printObstacleMap(image);
							cabinViewPart.submitAgents(SimulationHandler.getAgentList());
						}
					});
				}

				/* Clear the cache! */
				cabinViewPart.clearCache();
				SimulationHandler.reset();
			
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

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK())
					Log.add(this, "Simulation run completed");
				else
					Log.add(this, "Simulation run failed!");
			}
		});

		job.setRule(jobRule);
		// Start the Job
		job.schedule();
	}

	/**
	 * Run area map window.
	 */
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
						simulationView.resetSimulationView();
						SimulationHandler.reset();
					}
				};
				simulationFrame.addWindowListener(exitListener);
			}
		});
	}
}
