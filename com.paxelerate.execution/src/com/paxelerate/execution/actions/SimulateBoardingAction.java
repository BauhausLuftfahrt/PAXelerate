/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.actions;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import org.eclipse.emf.common.util.ECollections;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.core.simulation.astar.Areamap;
import com.paxelerate.core.simulation.astar.SimulationHandler;
import com.paxelerate.execution.main.StartPaxelerate;
import com.paxelerate.execution.ui.SimulationView;
import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.SeatExtensions;
import com.paxelerate.model.settings.Settings;

import net.bhl.opensource.toolbox.emf.CSVExport;
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.io.DataSet;
import net.bhl.opensource.toolbox.time.StopWatch;
import paxelerate.StudyType;

/**
 * This command starts the boarding simulation.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 */

public class SimulateBoardingAction {

	private JFrame frame;
	static boolean simulationFailed = false;
	private static List<ArrayList<Integer>> boardingStatus = new ArrayList<>();
	public final double boardingTime;

	/**
	 * Export result data.
	 *
	 * @param iteration
	 * @param deck
	 * @param fileName
	 * @param studyName
	 */
	private static void exportResultData(Integer iteration, Deck deck, String fileName, String studyName) {

		String exportPath = StartPaxelerate.CORE_FILE_SAVE_PATH + fileName.replace(".xml", "") + "\\" + studyName
				+ "\\";

		String outputFileName = "results_" + studyName;

		try {
			CSVExport csv = new CSVExport(outputFileName, exportPath, false);

			csv.addHead(iteration);
			csv.addAll(EObjectHelper.getParent(Model.class, deck).getSettings());
			csv.addAll(EObjectHelper.getParent(Model.class, deck).getSettings().getPassengerProperties());
			csv.addAll(EObjectHelper.getParent(Model.class, deck).getSettings().getLuggageProperties());
			csv.addAll(EObjectHelper.getParent(Model.class, deck).getSimulationResults().get(0));

			if (Agent.ACTIVATE_CONTACT_TRACING) {

				csv.add("COVID Average Average Distance", deck.getPassengers().stream()
						.mapToDouble(Passenger::getCovidAverageDistanceToPassengers).average().orElse(0));
				csv.add("COVID Average Min Distance", deck.getPassengers().stream()
						.mapToDouble(Passenger::getCovidMinimumDistanceToPassengers).average().orElse(0));
				csv.add("COVID Average Average Duration", deck.getPassengers().stream()
						.mapToDouble(Passenger::getCovidAverageDurationOfContacts).average().orElse(0));
				csv.add("COVID Average Max Duration", deck.getPassengers().stream()
						.mapToDouble(Passenger::getCovidMaximumDurationOfContact).average().orElse(0));
				csv.add("COVID Average Amount", deck.getPassengers().stream()
						.mapToDouble(Passenger::getCovidTotalNumberOfContacts).average().orElse(0));
				csv.add("COVID Total Amount",
						deck.getPassengers().stream().mapToDouble(Passenger::getCovidTotalNumberOfContacts).sum());

			}

			EObjectHelper.getParent(Model.class, deck).getSimulationResults().clear();
			csv.saveFile(true);

		} catch (IOException | IllegalAccessException e) {
			System.out.println("CSVExport: File export: Cannot open file - IOException");
		}

		if (!simulationFailed) {

			try {

				int id = 1;

				File file = new File(exportPath + outputFileName + "_PAX_" + iteration + "_thread_" + id + ".csv");

				while (file.exists()) {

					id++;

					file = new File(exportPath + outputFileName + "_PAX_" + iteration + "_thread_" + id + ".csv");

				}

				CSVExport csv = new CSVExport(outputFileName + "_PAX_" + iteration + "_thread_" + id, exportPath, true);

				ECollections.sort(deck.getPassengers(), (p1, p2) -> Integer.valueOf(p1.getGender().toString().charAt(0))
						.compareTo((int) p2.getGender().toString().charAt(0)));

				for (Passenger passenger : deck.getPassengers()) {
					passenger.getSpeedOnPath().clear();
					csv.addAll(passenger);
					DataSet ds = new DataSet();
					ds.put("Seat", SeatExtensions.getName(passenger.getSeat()));
					ds.put("Door", passenger.getDoor().getId());
					csv.add(ds, false);
				}
				csv.saveFile(false);

			} catch (IOException | IllegalAccessException e) {
				System.out.println("CSVExport: File export: Cannot open file - IOException");
			}
		}
	}

	/**
	 * @param deck
	 * @param iteration
	 * @param map
	 * @param fileName
	 * @param study
	 */
	public SimulateBoardingAction(final Deck deck, int iteration, Areamap map, String fileName, StudyType study,
			int iMax, boolean displaySimulation) {

		Settings settings = EObjectHelper.getParent(Model.class, deck).getSettings();

		StopWatch simTimer = new StopWatch();

		for (Passenger passenger : deck.getPassengers()) {
			passenger.setIsSeated(settings.getSimulationType() != SimulationType.BOARDING);
			passenger.setBoardingTime(0);
		}

		/* initiates a new simulation */
		SimulationHandler handler = new SimulationHandler(deck, false, map);

		/* Show WIP simulation view */
		if (displaySimulation) {
			runAreaMapWindow(handler, iteration, iMax, study.getUID());
		}

		// Log the current state of the simulation every 10 "simulation seconds".
		while (!handler.getPassengersByState(State.SEATED, true).isEmpty()) {

			simulationStatus(handler);

			try {

				Thread.sleep(10000 / settings.getSimulationSpeedFactor());

				// Terminate if boarding time exceeds limit
				if (handler.getMasterBoardingTime() * settings.getSimulationSpeedFactor() / 1000.0 > 1.0 * 60.0
						* 60.0) {

					System.err.println("\nSimulateBoardingAction: Simulation terminated due to inactivity.");
					System.exit(-1);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if (displaySimulation && frame == null) {
				handler.reset();
			}
		}

		/* closes the simulation view after completion */
		if (displaySimulation && frame != null) {
			frame.dispose();
		}

		boardingTime = handler.getMasterBoardingTime() * settings.getSimulationSpeedFactor() / 1000.0;

		/* saves results to results model element */
		ExportResultsAction.setSimulationData(handler, EObjectHelper.getParent(Model.class, deck), boardingStatus,
				handler.getMasterBoardingTime() * settings.getSimulationSpeedFactor() / 1000,
				simTimer.getElapsedTimeSecs());

		// data export
		if (fileName != null) {
			exportResultData(iteration, deck, fileName, study.getUID());
		}

		handler.reset();
		boardingStatus.clear();

		simTimer.stop();

	}

	/**
	 *
	 */
	private void runAreaMapWindow(SimulationHandler handler, int i, int iMax, String name) {
		SwingUtilities.invokeLater(() -> {

			try {

				frame = new JFrame("PAXelerate Boarding Simulation (\"" + name + "\")");

				SimulationView simulationView = new SimulationView(handler);
				simulationView.setAreamap(handler.getMap(), i, iMax);

				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				frame.setContentPane(simulationView);
				frame.pack();
				frame.setVisible(true);

				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(final WindowEvent e) {
						simulationView.resetSimulationView();
						handler.reset();
					}
				});

			} catch (NullPointerException e) {
				e.printStackTrace();
				frame.dispose();
			}
		});
	}

	/**
	 * Simulation status.
	 *
	 */
	private void simulationStatus(SimulationHandler handler) {

		if (handler.getMasterBoardingTime() == 0) {
			return;
		}

		ArrayList<Integer> timeStamp = new ArrayList<>();
		timeStamp.add((int) handler.getMasterBoardingTime() * handler.getSettings().getSimulationSpeedFactor());
		timeStamp.add(handler.getPassengersByState(null, false).size());
		timeStamp.add(handler.getPassengersByState(State.SEATED, true).size());

		boardingStatus.add(timeStamp);
	}
}
