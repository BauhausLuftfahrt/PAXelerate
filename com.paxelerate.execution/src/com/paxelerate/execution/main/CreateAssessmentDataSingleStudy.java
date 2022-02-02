/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/

package com.paxelerate.execution.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import net.bhl.opensource.toolbox.emf.CSVExport;
import net.bhl.opensource.toolbox.io.CSVImport;
import net.bhl.opensource.toolbox.io.DataSet;
import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.ui.FilePicker;

/**
 * @author Marc.Engelmann
 * @since 02.09.2021
 *
 */
public class CreateAssessmentDataSingleStudy {

	private static final String[] assessedLiterals = { "covidTotalNumberOfContacts", "covidAverageDistanceToPassengers",
			"covidMinimumDistanceToPassengers", "covidAverageDurationOfContacts", "covidMaximumDurationOfContact" };

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Ask for input file corresponding to results
		FilePicker.getFolder(StartPaxelerate.CORE_FILE_SAVE_PATH).ifPresentOrElse(f -> {

			Path sourceDirectory = Paths.get(f.getAbsolutePath());

			Map<String, List<DataSet>> collection = new HashMap<>();

			for (File file : sourceDirectory.toFile().listFiles()) {

				if (file.isDirectory() || !file.getName().contains("_PAX_")) {
					continue;
				}

				List<DataSet> results = CSVImport.getRows(file.getName(), file.getParent() + "\\");

				for (DataSet set : results) {

					DataSet seatProperties = new DataSet(file.getName());

					for (String literal : assessedLiterals) {
						seatProperties.put(literal, set.getDouble(literal).get());
					}

					if (!collection.containsKey(set.getString("Seat").get())) {
						collection.put(set.getString("Seat").get(), new ArrayList<DataSet>());
					}

					collection.get(set.getString("Seat").get()).add(seatProperties);
				}
			}

			try {
				CSVExport csv = new CSVExport("results_collection", sourceDirectory.toFile().getAbsolutePath() + "/",
						true);

				// Loop through all iterations containing seat objects
				for (Entry<String, List<DataSet>> seatList : collection.entrySet().stream().sorted(seatNameComparator)
						.collect(Collectors.toList())) {

					csv.add("Seat", seatList.getKey());

					for (String literal : assessedLiterals) {
						csv.add(literal, seatList.getValue().stream().mapToDouble(r -> r.getDouble(literal).get())
								.average().orElse(0.0));
					}

				}

				csv.saveFile(false);

			} catch (IOException e) {
				e.printStackTrace();
			}

		}, () ->

		{
			Log.printInfoLine("No input file chosen", "TERMINATED");
			System.exit(0);
		});

	}

	static Comparator<Entry<String, List<DataSet>>> seatNameComparator = (e1,
			e2) -> (extractInt(e1.getKey()) - extractInt(e2.getKey()));

	static int extractInt(String s) {
		String num = s.replaceAll("\\D", "");
		// return 0 if no digits found
		return num.isEmpty() ? 0 : Integer.parseInt(num);
	}
}
