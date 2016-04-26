/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This command exports important data from the EMF meta-model.
 *
 * @author michael.schmidt
 * @version 0.5
 */

public class ExportDataCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The writer. */
	private FileWriter writer;

	/** The Constant FILE_PATH. */
	private static final String FOLDER_NAME = "paxelerate",
			FILE_PATH = System.getProperty("user.home") + "/Documents/" + FOLDER_NAME + "/";
	
	/** The default fileName. */
	String fileName = "export";

	/**
	 * Instantiates a new export data command.
	 *
	 * @param cabin the cabin
	 */
	public ExportDataCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * Creates the export file.
	 *
	 * @param fileName the file name
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private boolean createExportFile(String fileName) throws IOException {
		Log.add(this, "Start data export...");

		File dir = new File(FILE_PATH);
		dir.mkdir();
		this.writer = new FileWriter(FILE_PATH + fileName + ".xls");

		return true;
	}

	/**
	 * Close export file.
	 *
	 * @param writer the writer
	 * @return true, if successful
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private boolean closeExportFile(FileWriter writer) throws IOException {
		writer.flush();
		writer.close();

		Log.add(this, "...data export complete.");

		return true;
	}

	/**
	 * Gets the passenger data.
	 *
	 * @param writer the writer
	 * @return the passenger data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private boolean getPassengerData(FileWriter writer) throws IOException {
		/** Create file header **/
		writer.append("ID");
		writer.append("\t");
		writer.append("Sex");
		writer.append("\t");
		writer.append("Age");
		writer.append("\t");
		writer.append("Mood");
		writer.append("\t");
		writer.append("Height");
		writer.append("\t");
		writer.append("Weight");
		writer.append("\t");
		writer.append("Width");
		writer.append("\t");
		writer.append("Depth");
		writer.append("\t");
		writer.append("WalkingSpeed");
		writer.append("\t");
		writer.append("TravelClass");
		writer.append("\t");
		writer.append("Door");
		writer.append("\t");
		writer.append("SeatID");
		writer.append("\t");
		writer.append("Luggage");
		writer.append("\t");
		writer.append("LuggageStowTime");
		writer.append("\t");
		writer.append("LuggageStowDistance");
		writer.append("\t");
		writer.append("BoardingTime");
		writer.append("\t");
		writer.append("NumberOfWaits");
		writer.append("\t");
		writer.append("InitialBoardingDelay");
		writer.append("\t");
		writer.append("NumberOfWayMaking");
		writer.append("\n");

		EList<Passenger> paxList = cabin.getPassengers();

		for (Passenger pax : paxList) {
			writer.append("" + pax.getId());
			writer.append("\t");
			writer.append("" + pax.getSex());
			writer.append("\t");
			writer.append("" + pax.getAge());
			writer.append("\t");
			writer.append("" + pax.getPassengerMood());
			writer.append("\t");
			writer.append("" + pax.getHeight());
			writer.append("\t");
			writer.append("" + pax.getWeight());
			writer.append("\t");
			writer.append("" + pax.getWidth());
			writer.append("\t");
			writer.append("" + pax.getDepth());
			writer.append("\t");
			writer.append("" + pax.getWalkingSpeed());
			writer.append("\t");
			writer.append("" + pax.getTravelClass().getTravelOption());
			writer.append("\t");
			writer.append("" + pax.getDoor().getDoorOption());
			writer.append("\t");
			writer.append("" + pax.getSeatID());
			writer.append("\t");
			writer.append("" + pax.getLuggage());
			writer.append("\t");
			writer.append("" + pax.getLuggageStowTime());
			writer.append("\t");
			writer.append("" + pax.getLuggageStowDistance());
			writer.append("\t");
			writer.append("" + pax.getBoardingTime());
			writer.append("\t");
			writer.append("" + pax.getNumberOfWaits());
			writer.append("\t");
			writer.append("" + pax.getStartBoardingAfterDelay());
			writer.append("\t");
			writer.append("" + pax.getNumberOfMakeWayOperations());
			writer.append("\n");
		}

		return true;
	}
	
	/**
	 * Gets the simulation properties data.
	 *
	 * @param writer the writer
	 * @return the simulation properties data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	private boolean getSimulationPropertiesData(FileWriter writer) throws IOException {

		/** SimulationProperties **/
		SimulationProperties settings = cabin.getSimulationSettings();
		
		writer.append("FramesPerSecond");
		writer.append("\t");
		writer.append("" + settings.getFramesPerSecond());
		writer.append("\n");
		
		writer.append("Scale");
		writer.append("\t");
		writer.append("" + settings.getScale());
		writer.append("\n");
		
		writer.append("NumberOfSimulationLoops");
		writer.append("\t");
		writer.append("" + settings.getNumberOfSimulationLoops());
		writer.append("\n");
		
		writer.append("SimulationSpeedFactor");
		writer.append("\t");
		writer.append("" + settings.getSimulationSpeedFactor());
		writer.append("\n");
		
		/** General passenger properties **/
		writer.append("PassengersBoardingPerMinute");
		writer.append("\t");
		writer.append("" + settings.getPassengersBoardingPerMinute());
		writer.append("\n");
		
		writer.append("SeatInterferenceProcessTime");
		writer.append("\t");
		writer.append("" + settings.getSeatInterferenceProcessTime());
		writer.append("\n");
		
		writer.append("SeatInterferenceStandingUpPassengerWaitingTime");
		writer.append("\t");
		writer.append("" + settings.getSeatInterferenceStandingUpPassengerWaitingTime());
		writer.append("\n");
		
		writer.append("Sorting");
		writer.append("\t");
		writer.append("" + settings.getSorting());
		writer.append("\n");
		
		writer.append("ThreadSleepTimeDefault");
		writer.append("\t");
		writer.append("" + settings.getThreadSleepTimeDefault());
		writer.append("\n");
		
		//LuggageProperties luggageSettings = cabin.getSimulationSettings().getLuggageProperties();
		//PassengerProperties paxSettings = cabin.getSimulationSettings().getPassengerProperties();

		return true;
	}

	/* (non-Javadoc)
	 * @see net.bhl.cdt.commands.CDTCommand#doRun()
	 */
	@Override
	protected void doRun() {
		Input input = new Input(WindowType.EXPORT_DATA, "Enter the filename.", IMessageProvider.INFORMATION);

		String fileName = input.getStringValue();
		try {
			createExportFile(fileName);
			getPassengerData(this.writer);
			getSimulationPropertiesData(this.writer);
			closeExportFile(this.writer);
		} catch (IOException e) {
			Log.add(this, "Data export failed!");
		}
	}

}
