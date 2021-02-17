/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/

package com.paxelerate.core.main;

import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;

import com.paxelerate.core.actions.BatchSimulationAction;
import com.paxelerate.core.keys.DataKeys;

import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.ui.FilePicker;

/**
 *
 * @author Michael.Schmidt, Marc.Engelmann
 *
 */

public class StartPaxelerate {

	private static String inputFilename;
	public static String DEFAULT_PATH = System.getProperty("user.home") + "/Documents/PAXelerate";
	public static String FILE_FORMAT = "csv";

	private static String AUTHORS = "Marc Engelmann & Michael Schmidt";
	private static String NAME = "PAXelerate - Headless";

	/**
	 * Run PAXelerate Headless
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Log.createHead(NAME, "1.0", AUTHORS, 2015);

		if (args.length == 0) {

			FilePicker.getFile(DEFAULT_PATH, FILE_FORMAT).ifPresentOrElse(f -> {
				inputFilename = f.getName().replace("." + FILE_FORMAT, "");
				DataKeys.IMPORT_PATH = f.getAbsolutePath().replace(f.getName(), "");
			}, () -> {
				Log.printInfoLine("No input file chosen", "TERMINATED");
				System.exit(0);
			});

		} else {
			Log.printInfoLine("CSV selection skipped", "Using args\n");
			inputFilename = args[0];
		}

		BatchSimulationAction.run(inputFilename);

		try {
			TrayIcon mainTrayIcon = new TrayIcon(Toolkit.getDefaultToolkit().getImage(""));

			SystemTray.getSystemTray().add(mainTrayIcon);
			mainTrayIcon.displayMessage("Simulation finished!", "PAXelerate Boarding Simulation", MessageType.INFO);
			SystemTray.getSystemTray().remove(mainTrayIcon);

		} catch (Exception e) {
			//
		} finally {
			Log.divider();
			Log.printInfoLine("Reached end of code", "TERMINATED");
			System.exit(0);
		}
	}
}
