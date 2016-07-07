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
import net.bhl.cdt.paxelerate.model.agent.enums.AgentMode;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.util.SimulationResultLogger;
import net.bhl.cdt.paxelerate.ui.helper.Input;
import net.bhl.cdt.paxelerate.ui.helper.Input.WindowType;
import net.bhl.cdt.paxelerate.ui.preferences.PAXeleratePreferencePage;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.SimulationView;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.output.ExcelExport;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This command starts the boarding simulation.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 * @since 0.5
 */

public class SimulateBoardingCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The dimensions. */
	private Vector dimensions;

	/** The simulation loop. */
	private int simulationLoop;

	/** The simulation frame. */
	private JFrame simulationFrame;

	/** The developer mode. */
	private boolean developerMode;

	protected boolean runSuccessful;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param cabin
	 *            the cabin object
	 */
	public SimulateBoardingCommand(final Cabin cabin) {
		this.cabin = cabin;
		this.developerMode = cabin.getSimulationSettings().isDeveloperMode();
		this.simulationLoop = 1;
	}

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 *
	 * @param simulationLoop
	 *            the simulation loop
	 */
	public SimulateBoardingCommand(int simulationLoop) {
		if (ECPUtil.getECPProjectManager().getProjects() != null) {
			/* retrieves first model element of selected project */
			Cabin cabinModel = (Cabin) ECPUtil.getECPProjectManager()
					.getProject(PAXeleratePreferencePage.DEFAULT_PROJECT_NAME).getContents().get(0);
			/* saves a local copy of the cabin */
			this.cabin = EcoreUtil.copy(cabinModel);
			this.developerMode = this.cabin.getSimulationSettings().isDeveloperMode();
			this.simulationLoop = simulationLoop;

			/*
			 * IPreferenceStore preferenceStore =
			 * Activator.getDefault().getPreferenceStore();
			 * preferenceStore.getString(PluginPreferencesPage.FIELD_STRING_ID);
			 */
		}
	}
	
	/**
	 * Gets the simulation status.
	 *
	 * @return the simulation status
	 */
	public boolean getSimulationStatus() {
		return runSuccessful;
	}

	/**
	 * Agent sleep check.
	 *
	 * @return true, if successful
	 * @throws InterruptedException
	 *             the interrupted exception
	 * @throws NullPointerException
	 *             the null pointer exception
	 */
	private boolean agentSleepCheck() throws InterruptedException, NullPointerException {
		// TODO: send UI update to ViewPart
		System.out.println("sleep check");

		for (Passenger sleepyPassenger : cabin.getPassengers()) {

			long timestamp = SimulationHandler.getAgentByPassenger(sleepyPassenger).getLastMoveTimestamp();

			if (!sleepyPassenger.isIsSeated() && timestamp != 0
					&& SimulationHandler.getAgentByPassenger(sleepyPassenger).getAgentMode() != AgentMode.MAKE_WAY) {
				if ((System.currentTimeMillis()
						- SimulationHandler.getAgentByPassenger(sleepyPassenger).getLastMoveTimestamp()) > (60
								* 1000)) {
					System.out.println(sleepyPassenger.getName() + "has caused interuption!");

					Log.add(this, "SIMULATION TERMINATED! Passenger " + sleepyPassenger.getName() + " did not react.");

					/* records the failed simulation run */
					if (developerMode) {
						SimulationResultLogger results = new SimulationResultLogger();
						results.getSimulationData(cabin, simulationLoop, 0, 0, 0);

						try {
							exportResultData();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}

					SimulationHandler.setSimulationStatus(true);
					SimulationHandler.reset();

					if (!cabin.getSimulationSettings().isSimulateWithoutUI()) {
						simulationFrame.dispose();
					}

					return true;
				}
			}
		}
		Thread.sleep(50000);
		return false;
	}

	/**
	 * Sort passengers.
	 */
	private void sortPassengers() {
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
		default:
			break;
		}
		if (value != 0) {
			sort2.setPropertiesManually(false, value);
			sort2.doRun();
			cabin = sort2.returnCabin();
		}
	}

	/**
	 * Export result data.
	 *
	 * @throws FileNotFoundException
	 *             the file not found exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private void exportResultData() throws FileNotFoundException, IOException {

		ExcelExport exporterResults = new ExcelExport(PAXeleratePreferencePage.DEFAULT_RESULT_FILE_NAME,
				PAXeleratePreferencePage.DEFAULT_EXPORT_PATH);
		exporterResults.createFile();
		ExportDataCommand exportDataResults = new ExportDataCommand(cabin, exporterResults);
		/* print header only for first loop */
		// if(simulationLoop == 1) {
		exportDataResults.getStudySettings();
		// }
		exportDataResults.getResultData();
		exporterResults.closeFile();

		/*
		 * if (developerMode) { // save the CostMap and ObstacleMap to the local
		 * file // system ExcelExport exporterCostMap = new
		 * ExcelExport("CostMap"); exporterCostMap.createFile(); MapExportHelper
		 * exportDataResults1 = new MapExportHelper(exporterCostMap);
		 * exportDataResults1.saveCostmapToFile(SimulationHandler.
		 * getUsedCostmaps(), dimensions); exporterCostMap.closeFile();
		 * 
		 * ExcelExport exporterObstacleMap = new ExcelExport("ObstacleMap");
		 * exporterObstacleMap.createFile(); MapExportHelper exportData = new
		 * MapExportHelper(exporterObstacleMap);
		 * exportData.saveObstacleToFile(SimulationHandler.getMap(),
		 * dimensions); exporterObstacleMap.closeFile(); /* ExcelExport exporter
		 * = new ExcelExport("iteration" + simulationLoopIndex);
		 * exporter.createFile(); ExportDataCommand exportData = new
		 * ExportDataCommand(cabin, exporter);
		 * exportData.generateDistributionFile(); exportData.getPassengerData();
		 * exportData.getSimulationPropertiesData(); exporter.closeFile();
		 * 
		 * }
		 */
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected final void doRun() {

		// Create separate thread
		Job job = new Job("Simulation Thread") {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
			 * IProgressMonitor)
			 */
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				Log.add(this, "Initializing new simulation run " + simulationLoop);

				CabinViewPart cabinViewPart = ViewPartHelper.getCabinView();

				/* reset simulation in case of previous existing objects. */
				SimulationHandler.reset();
				/* reset the passenger properties */
				for (Passenger passenger : cabin.getPassengers()) {
					passenger.setIsSeated(false);
					passenger.setBoardingTime(0);
				}
				/* resets seat properties */
				for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
					seat.setOccupied(false);
				}
				/* sorts passengers according to selected scheme */
				if (cabin.getSimulationSettings().isSortPassengerBetweenLoops()) {
					sortPassengers();
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

				dimensions = new Vector2D(cabin.getXDimension(), cabin.getYDimension(),
						cabin.getSimulationSettings().getScale());

				/* initiates a new simulation */
				new SimulationHandler(dimensions, cabin, simulationLoop);

				/* Show WIP simulation view */
				if (!cabin.getSimulationSettings().isSimulateWithoutUI()) {
					runAreaMapWindow();
				}

				// TODO: INSERT PAX LOCATION SUBMIT TO CABINVIEWPART
				// HERE

				/* checks if an agent is in freezing mode */
				while (!SimulationHandler.isSimulationDone()) {
					try {
						if (agentSleepCheck()) {
							return Status.CANCEL_STATUS;
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
						System.out.println("InterruptedException @ thread " + Thread.currentThread().getName());
						Thread.currentThread().interrupt();
					}

					if (!cabin.getSimulationSettings().isSimulateWithoutUI() && simulationFrame == null) {
						SimulationHandler.setSimulationStatus(true);
						SimulationHandler.reset();
					}
				}

				/* closes the simulation view after completion */
				if (!cabin.getSimulationSettings().isSimulateWithoutUI()) {
					simulationFrame.dispose();
				}

				/* saves results to results model element */
				SimulationResultLogger results = new SimulationResultLogger();

				results.getSimulationData(cabin, simulationLoop,
						SimulationHandler.getMasterBoardingTime().getElapsedTime()
								* cabin.getSimulationSettings().getSimulationSpeedFactor() / 1000,
						SimulationHandler.getNumberWaymakingSkipped(), SimulationHandler.getNumberWaymakingCompleted());

				/* data export */
				if (cabin.getSimulationSettings().isDataExport()) {
					try {
						exportResultData();
					} catch (IOException e) {
						e.printStackTrace();
					}
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

				/* report finished */
				return Status.OK_STATUS;
			}

		};

		/* report job status to console */
		job.addJobChangeListener(new JobChangeAdapter() {
			@Override
			public void done(final IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					runSuccessful = true;
					Log.add(this, "Simulation run completed");
				} else {
					runSuccessful = false;
					Log.add(this, "Simulation run failed!");
				}
			}
		});

		/* Start the Job */
		job.schedule();
		try {
			/* schedule job after previous is finished */
			job.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread " + Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
	}

	/**
	 * Run area map window.
	 */
	private void runAreaMapWindow() {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				simulationFrame = new JFrame("Simulation View");
				SimulationView simulationView = new SimulationView();
				simulationView.setAreamap(SimulationHandler.getMap());
				simulationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				simulationFrame.setContentPane(simulationView);
				simulationFrame.pack();
				simulationFrame.setVisible(true);

				WindowListener exitListener = new WindowAdapter() {
					@Override
					public void windowClosing(final WindowEvent e) {
						simulationView.resetSimulationView();
						SimulationHandler.reset();
					}
				};
				simulationFrame.addWindowListener(exitListener);
			}
		});
	}
}
