/** <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This command exports data from the EMF meta-model.
 *
 * @author michael.schmidt
 * @version 0.5
 */

public class ExcelExport {

	/** The writer. */
	private FileWriter writer;
	
	private String fileName;

	private Object filePath;

	/**
	 * Instantiates a new excel export.
	 *
	 * @param filename
	 *            the filename
	 */
	public ExcelExport(String fileName, String filePath) {
		this.fileName = fileName;
		this.filePath = filePath;
	}

	/**
	 * Creates the export file.
	 *
	 * @return true, if successful
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void createFile() throws IOException, FileNotFoundException {
		Log.add(this, "Start data export...");

		File dir = new File(fileName);
		dir.mkdir();
		this.writer = new FileWriter(fileName + filePath + ".xls", true);
	}

	/**
	 * Close export file.
	 *
	 * @return true, if successful
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void closeFile() throws IOException, FileNotFoundException {
		this.writer.flush();
		this.writer.close();

		Log.add(this, "...data export complete.");
	}

	/**
	 * Adds the column element.
	 *
	 * @param parStringValue
	 *            the par string value
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void addColumnElement(String parStringValue) throws IOException, FileNotFoundException {
		this.writer.append("" + parStringValue);
		this.writer.append("\t");
	}

	/**
	 * Adds the column element.
	 *
	 * @param parIntValue
	 *            the par int value
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void addColumnElement(int parIntValue) throws IOException, FileNotFoundException {
		this.writer.append("" + parIntValue);
		this.writer.append("\t");
	}

	/**
	 * Adds the column element.
	 *
	 * @param parDoubleValue
	 *            the par double value
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void addColumnElement(double parDoubleValue) throws IOException, FileNotFoundException {
		writer.append("" + parDoubleValue);
		writer.append("\t");
	}

	/**
	 * Adds the new line.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void addNewLine() throws IOException, FileNotFoundException {
		this.writer.append("\n");
	}

}