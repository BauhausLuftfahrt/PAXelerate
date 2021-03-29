/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/

package com.paxelerate.execution.main;

import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.io.File;

import com.paxelerate.execution.actions.BatchSimulationAction;

import net.bhl.opensource.toolbox.io.Log;
import net.bhl.opensource.toolbox.ui.FilePicker;

/**
 *
 * @author Michael.Schmidt, Marc.Engelmann
 *
 */

public class StartPaxelerate {

	public static String DEFAULT_PATH = System.getProperty("user.home") + "/git/cpacs/aircraft/cabins";
	public static String FILE_FORMAT = "xml";
	public static String CORE_FILE_SAVE_PATH = System.getProperty("user.home") + "\\Documents\\paxelerate\\";

	private static String AUTHORS = "Marc Engelmann & Michael Schmidt";
	private static String NAME = "PAXelerate - Headless";

	/**
	 * Run PAXelerate Headless
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		Log.createHead(NAME, "1.0", AUTHORS, 2015);

		if (args.length > 0) {

			Log.printInfoLine("Launch arguments detected.", null);

			File file = new File(args[0]);
			if (file.exists()) {

				Log.printInfoLine("CPACS input file launch argument detected.", null);
				BatchSimulationAction.run(file);
			} else {

				Log.printInfoLine("Launch arguments error! Could not find file.", "TERMINATED");
				System.exit(-1);
			}

		} else {
			FilePicker.getFile(DEFAULT_PATH, FILE_FORMAT).ifPresent(BatchSimulationAction::run);
		}

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
