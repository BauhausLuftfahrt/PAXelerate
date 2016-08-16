/** <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This command imports data from an external source.
 *
 * @author michael.schmidt
 * @version 1.0
 * @since 0.8
 */

public class CSVImport {

	/** The file reader. */
	private BufferedReader fileReader;

	/** The default fileName. */
	private String fileName = "import";

	/** The file path. */
	private String filePath;

	/** The line. */
	private String line = "";

	/** The cvs split by. */
	private String cvsSplitBy = ";";

	/**
	 * Instantiates a new excel import.
	 *
	 * @param filename
	 *            the filename
	 * @param filePath
	 *            the file path
	 */
	public CSVImport(String filename, String filePath) {
		this.fileName = filename;
		this.filePath = filePath;
	}

	/**
	 * Import file.
	 *
	 * @return the string[][]
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public ArrayList<ArrayList<String>> readData() throws IOException {
		ArrayList<ArrayList<String>> lineList = new ArrayList<ArrayList<String>>();
		// skip first two header rows
		fileReader.readLine();
		fileReader.readLine();
		while ((line = fileReader.readLine()) != null) {
			ArrayList<String> strList = new ArrayList<String>();

			while (line.length() > 0) {
				int nextDelimPo = line.indexOf(cvsSplitBy);
				if (nextDelimPo == -1) {
					strList.add(line);
					line = "";
				} else {
					strList.add(line.substring(0, nextDelimPo));
					line = line.substring(nextDelimPo + 1);
				}
			}

			Collections.addAll(lineList, strList);
		}
		return lineList;
	}

	/**
	 * Open specific file.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException
	 *             the file not found exception
	 */
	public void openSpecificFile() throws IOException, FileNotFoundException {
		Log.add(this, "Start data import...");

		fileReader = new BufferedReader(new FileReader(filePath + fileName + ".csv"));
	}

	/**
	 * Open first file.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException
	 *             the file not found exception
	 */
	public void openFirstFile() throws IOException, FileNotFoundException {
		Log.add(this, "Start data import...");
		File path = new File(filePath);
		if (path.exists()) {
			File[] files = path.listFiles();
			if (files != null) {
				fileReader = new BufferedReader(new FileReader(files[0]));
				files[0].delete();
			}
			
		}
	}

	/**
	 * Close file.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void closeFile() throws IOException {
		fileReader.close();
	}

	/**
	 * Delete file.
	 */
	public void deleteFile() {
		File file = new File(filePath + fileName + ".csv");
		file.delete();
	}

}