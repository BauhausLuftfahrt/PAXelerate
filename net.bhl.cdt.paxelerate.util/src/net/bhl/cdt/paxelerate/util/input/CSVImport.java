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

import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This command imports data from an external source.
 *
 * @author michael.schmidt
 * @version 0.5
 */

public class CSVImport {

	/** The file reader. */
	private BufferedReader fileReader;

	/** The default fileName. */
	String fileName = "import";

	private String filePath;

	/**
	 * Instantiates a new excel import.
	 *
	 * @param filename
	 *            the filename
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
	public String[][] readData() throws IOException {
		String[][] data = new String[10][10];
		String nextLine;
		int i = 0;
		while ((nextLine = fileReader.readLine()) != null) {
			String[] line = nextLine.split(";");
			for (int j = 0; j < line.length; j++) {
				data[i][j] = line[j];
			}
			i++;
		}
		return data;
	}

	/**
	 * Open specific file.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public void openSpecificFile() throws IOException, FileNotFoundException {
		Log.add(this, "Start data import...");

		fileReader = new BufferedReader(new FileReader(filePath + fileName + ".csv"));
	}

	/**
	 * Open first file.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public void openFirstFile() throws IOException, FileNotFoundException {
		Log.add(this, "Start data import...");
		File path = new File(filePath);
		if (path.exists()) {
			File[] files = path.listFiles();
			fileReader = new BufferedReader(new FileReader(files[0]));
			// dev mode
			files[0].delete();
		}
	}

	/**
	 * Close file.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
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