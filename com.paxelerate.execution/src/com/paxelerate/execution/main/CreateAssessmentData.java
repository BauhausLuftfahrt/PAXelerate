/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.execution.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import net.bhl.opensource.toolbox.emf.CSVExport;
import net.bhl.opensource.toolbox.io.CSVImport;
import net.bhl.opensource.toolbox.io.DataSet;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.ui.FilePicker;

/**
 * @author Marc.Engelmann
 * @since 27.07.2021
 *
 */
public class CreateAssessmentData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Ask for input file corresponding to results
		FilePicker.getFolder(StartPaxelerate.CORE_FILE_SAVE_PATH).ifPresentOrElse(f -> {

			Path sourceDirectory = Paths.get(f.getAbsolutePath());

			Map<String, List<DataSet>> collection = new HashMap<>();

			for (File file : sourceDirectory.toFile().listFiles()) {

				if (!file.isDirectory()) {
					continue;
				}

				String fileName = "results_" + file.getName() + ".csv";

				List<DataSet> results = CSVImport.importAll(fileName, file.getAbsolutePath() + "\\");

				collection.put(fileName, results);

//				System.out.println(
//						results.stream().mapToDouble(r -> r.getDouble("boardingTime").get()).average().orElse(0.0));

			}

			try {
				CSVExport csv = new CSVExport("results_collection", sourceDirectory.toFile().getAbsolutePath() + "/",
						true);

				for (Entry<String, List<DataSet>> entry : collection.entrySet()) {

					csv.add("id", entry.getKey());

					csv.add("COVID Total Amount", entry.getValue().stream()
							.mapToDouble(r -> r.getDouble("COVID Total Amount").get()).average().orElse(0.0));

					csv.add("COVID Average Amount", entry.getValue().stream()
							.mapToDouble(r -> r.getDouble("COVID Average Amount").get()).average().orElse(0.0));

					csv.add("COVID Average Average Distance",
							entry.getValue().stream()
									.mapToDouble(r -> r.getDouble("COVID Average Average Distance").get()).average()
									.orElse(0.0));

					csv.add("COVID Average Min Distance", entry.getValue().stream()
							.mapToDouble(r -> r.getDouble("COVID Average Min Distance").get()).average().orElse(0.0));

					csv.add("COVID Average Average Duration",
							entry.getValue().stream()
									.mapToDouble(r -> r.getDouble("COVID Average Average Duration").get()).average()
									.orElse(0.0));

					csv.add("COVID Average Max Duration", entry.getValue().stream()
							.mapToDouble(r -> r.getDouble("COVID Average Max Duration").get()).average().orElse(0.0));

					csv.add("boardingTime", entry.getValue().stream()
							.mapToDouble(r -> r.getDouble("boardingTime").get()).average().orElse(0.0));

				}

				csv.saveFile(false);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}, () -> {
			Log.printInfoLine("No input file chosen", "TERMINATED");
			System.exit(0);
		});

	}

}
