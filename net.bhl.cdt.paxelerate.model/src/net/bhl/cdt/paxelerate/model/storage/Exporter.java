/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.model.storage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

import net.bhl.cdt.paxelerate.model.Sex;

/**
 * The Class Exporter.
 */
@Deprecated
public class Exporter {

	/** The Constant FILE_PATH. */
	private static final String FOLDER_NAME = "paxelerate",
			FILE_PATH = System.getProperty("user.home") + "/Documents/"
					+ FOLDER_NAME + "/";


	/**
	 * Generate distribution file.
	 *
	 * @param sFileName the s file name
	 * @param weight the weight
	 * @param height the height
	 * @param depth the depth
	 * @param width the width
	 * @param age the age
	 * @param luggage the luggage
	 * @param pax the pax
	 */
	public static void generateDistributionFile(String sFileName,
			GaussianStorage weight, GaussianStorage height,
			GaussianStorage depth, GaussianStorage width, AgeStorage age,
			LuggageStorage luggage, int[] pax) {

		try {

			// Create a path before creating the file!
			File dir = new File(FILE_PATH);
			dir.mkdir();

			FileWriter writer = new FileWriter(FILE_PATH + sFileName + ".xls");

			writeHeadline(writer);
			writeGaussian(writer, weight, "Weight");
			writeGaussian(writer, height, "Height");
			writeGaussian(writer, depth, "Depth");
			writeGaussian(writer, width, "Width");

			writer.flush();
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Write headline.
	 *
	 * @param writer the writer
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	private static void writeHeadline(FileWriter writer)
			throws IOException, FileNotFoundException {
		writer.append("Type");
		writer.append('\t');
		writer.append("Maximum Value F");
		writer.append('\t');
		writer.append("Maximum Value M");
		writer.append('\t');
		writer.append("Minimum Value F");
		writer.append('\t');
		writer.append("Minimum Value M");
		writer.append('\t');
		writer.append("Average Value F");
		writer.append('\t');
		writer.append("Average Value M");
		writer.append('\t');
		writer.append("Sum Value F");
		writer.append('\t');
		writer.append("Sum Value M");
		writer.append('\t');
		writer.append("Amount Value F");
		writer.append('\t');
		writer.append("Amount Value M");
		writer.append('\n');
	}

	/**
	 * Write gaussian.
	 *
	 * @param writer the writer
	 * @param storage the storage
	 * @param name the name
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	private static void writeGaussian(FileWriter writer,
			GaussianStorage storage, String name)
			throws IOException, FileNotFoundException {
		writer.append(name);
		writer.append('\t');
		writer.append(str(storage.getMaximum(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getMaximum(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getMinimum(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getMinimum(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getAverage(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getAverage(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getSum(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getSum(Sex.MALE)));
		writer.append('\t');
		writer.append(str(storage.getAmount(Sex.FEMALE)));
		writer.append('\t');
		writer.append(str(storage.getAmount(Sex.MALE)));
		writer.append('\n');
	}

	/**
	 * Str.
	 *
	 * @param value the value
	 * @return the string
	 */
	private static String str(double value) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(value);
	}
}
