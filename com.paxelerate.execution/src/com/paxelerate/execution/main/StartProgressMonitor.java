/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.execution.main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import Cpacs.CpacsType;
import net.bhl.opensource.cpacs.functions.CPACSInitializer;
import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.io.CSVImport;
import net.bhl.opensource.toolbox.io.DataSet;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.time.TimeHelper;
import net.bhl.opensource.toolbox.ui.FilePicker;
import net.bhl.opensource.toolbox.ui.LoggerView;
import toolspecific.StudyType;
import toolspecific.ToolspecificFactory;

/**
 * @author Marc.Engelmann
 * @since 23.08.2019
 *
 *        This class tracks the progress of multiple threads running at the same
 *        time and gives an overview of the results during the live simulation.
 *
 */

public class StartProgressMonitor {

	private static String fileName = "";
	private static JFrame frame;
	private static LoggerView loggerView;
	private static List<DataSet> status = new ArrayList<>();

	private static String id = "#";
	private static String procedure = "Procedure";
	private static String doors = "Doors";
	private static String iterations = "Iterations";
	private static String time = "Avg. Boarding Time";
	private static String walked = "Avg. Walked";
	private static String interrupts = "Avg. Interuptions";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<StudyType> studies = new ArrayList<>();

		// Ask for input file corresponding to results
		FilePicker.getFile(StartPaxelerate.DEFAULT_PATH, StartPaxelerate.FILE_FORMAT).ifPresentOrElse(f -> {

			fileName = f.getName();

			// Initialize the CPACS model
			CpacsType cpacs = CPACSInitializer.runWithToolspecific(f,
					ToolspecificFactory.eINSTANCE.createPaxelerateType());

			studies.addAll(EObjectHelper.getChildren(cpacs.getToolspecific(), StudyType.class));

		}, () -> {
			Log.printInfoLine("No input file chosen", "TERMINATED");
			System.exit(0);
		});

		runStatusUI();

		// Scan folder for results every 10 seconds
		while (true) {

			status.clear();

			// Reload data
			for (StudyType study : studies) {

				DataSet statusLine = new DataSet();

				File folder = new File(StartPaxelerate.CORE_FILE_SAVE_PATH + "\\" + fileName.replace(".xml", "") + "\\"
						+ study.getUID());

				statusLine.put(id, study.getUID());
				statusLine.put(procedure, study.getPassengerSortingScheme().getValue());
				statusLine.put(doors, study.getActiveDoorUIDs().getValue());

				if (folder.exists()) {

					// TODO! Something is wrong with csv import!

					List<DataSet> results = CSVImport.importAll("results_" + study.getUID(),
							folder.getAbsolutePath() + "\\");

					double averageBoardingTime = results.stream().mapToDouble(r -> r.getDouble("boardingTime").get())
							.average().orElse(0.0);

					int size = 0;
					try {

						size = results.size();

					} catch (Exception e) {
						e.printStackTrace();
					}

					statusLine.put(iterations, size + "");
					statusLine.put(time, TimeHelper.secondsToTime(averageBoardingTime));

					statusLine.put(walked, BHLMath.round(Arrays.stream(folder.listFiles())
							.filter(f -> f.getName().contains("PAX"))
							.mapToDouble(f -> CSVImport.getRows(f.getName(), folder.getAbsolutePath() + "\\").stream()
									.mapToDouble(s -> s.getDouble("distanceWalked").get()).average().orElse(0.0))
							.average().orElse(0.0), 3) + "");

					statusLine.put(interrupts, BHLMath.round(Arrays.stream(folder.listFiles())
							.filter(f -> f.getName().contains("PAX"))
							.mapToDouble(f -> CSVImport.getRows(f.getName(), folder.getAbsolutePath() + "\\").stream()
									.mapToDouble(s -> s.getInteger("numberOfWaits").get()).average().orElse(0.0))
							.average().orElse(0.0), 1) + "");

				} else {
					statusLine.put(iterations, "0 (pending)");
					statusLine.put(time, 0);
					statusLine.put(walked, 0);
					statusLine.put(interrupts, 0);
				}

				status.add(statusLine);
			}

			// Update UI
			loggerView.updateStatus(status, Arrays.asList("#", "Procedure", "Doors", "Iterations", "Avg. Boarding Time",
					"Avg. Walked", "Avg. Interuptions"));

			if (frame == null) {
				break;
			}

			// Reload every x seconds
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		terminate();

		// Send email when done!
	}

	private static void terminate() {
//
//		switch (JOptionPane.showConfirmDialog(null, "Do you want to save the results?", "Export results as CSV.",
//				JOptionPane.INFORMATION_MESSAGE)) {
//
//		case JOptionPane.OK_OPTION:
//			try {
//				CSVExport csvExport = new CSVExport(inputFilename + "_results_collection", inputPath, true);
//				for (DataSet set : status) {
//					csvExport.add(set, false);
//				}
//				csvExport.saveFile(false);
//
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			break;
//
//		default:
//			break;
//		}
//
		System.out.println("Reached end of code.");
		System.exit(0);
	}

	/**
	 *
	 */
	private static void runStatusUI() {
		SwingUtilities.invokeLater(() -> {

			try {

				frame = new JFrame("PAXelerate Batch Simulation Monitor");

				loggerView = new LoggerView(status);

				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				frame.setContentPane(loggerView);
				frame.pack();
				frame.setVisible(true);

				frame.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(final WindowEvent e) {
						System.out.println("Monitor closed.");
						terminate();
					}
				});

			} catch (NullPointerException e) {
				e.printStackTrace();
				frame.dispose();
			}
		});
	}
}
