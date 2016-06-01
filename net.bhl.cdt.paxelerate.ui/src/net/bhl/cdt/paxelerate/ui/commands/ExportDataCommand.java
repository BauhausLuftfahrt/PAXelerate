/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.util.exchange.ExcelExport;
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
	
	/** The default fileName. */
	String fileName = "export";
	
	private ExcelExport exporter;

	/**
	 * Instantiates a new export data command.
	 *
	 * @param cabin the cabin
	 */
	public ExportDataCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	/**
	 * Gets the passenger data.
	 *
	 * @param writer the writer
	 * @return the passenger data
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public boolean getPassengerData() throws IOException {
		/** Create file header **/
		exporter.addColumnElement("ID");
		exporter.addColumnElement("Sex");
		exporter.addColumnElement("Age");
		exporter.addColumnElement("Mood");
		exporter.addColumnElement("Height");
		exporter.addColumnElement("Weight");
		exporter.addColumnElement("Width");
		exporter.addColumnElement("Depth");
		exporter.addColumnElement("WalkingSpeed");
		exporter.addColumnElement("TravelClass");
		exporter.addColumnElement("Door");
		exporter.addColumnElement("SeatID");
		exporter.addColumnElement("Luggage");
		exporter.addColumnElement("LuggageStowTime");
		exporter.addColumnElement("LuggageStowDistance");
		exporter.addColumnElement("BoardingTime");
		exporter.addColumnElement("NumberOfWaits");
		exporter.addColumnElement("InitialBoardingDelay");
		exporter.addColumnElement("NumberOfWayMaking");
		exporter.addNewLine();

		EList<Passenger> paxList = cabin.getPassengers();

		for (Passenger pax : paxList) {
			exporter.addColumnElement(pax.getId());
			exporter.addColumnElement(pax.getSex().toString());
			exporter.addColumnElement(pax.getAge());
			exporter.addColumnElement(pax.getPassengerMood().toString());
			exporter.addColumnElement(pax.getHeight());
			exporter.addColumnElement(pax.getWeight());
			exporter.addColumnElement(pax.getWidth());
			exporter.addColumnElement(pax.getDepth());
			exporter.addColumnElement(pax.getWalkingSpeed());
			exporter.addColumnElement(pax.getTravelClass().getTravelOption().toString());
			exporter.addColumnElement(pax.getDoor().getDoorOption().toString());
			exporter.addColumnElement(pax.getSeatID());
			exporter.addColumnElement(pax.getLuggage().toString());
			exporter.addColumnElement(pax.getLuggageStowTime());
			exporter.addColumnElement(pax.getLuggageStowDistance());
			exporter.addColumnElement(pax.getBoardingTime());
			exporter.addColumnElement(pax.getNumberOfWaits());
			exporter.addColumnElement(pax.getStartBoardingAfterDelay());
			exporter.addColumnElement(pax.getNumberOfMakeWayOperations());
			exporter.addNewLine();
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
	public boolean getSimulationPropertiesData() throws IOException {

		/** SimulationProperties **/
		SimulationProperties settings = cabin.getSimulationSettings();
		
		exporter.addColumnElement("FramesPerSecond");
		exporter.addColumnElement(settings.getFramesPerSecond());
		exporter.addNewLine();
		
		exporter.addColumnElement("Scale");
		exporter.addColumnElement(settings.getScale());
		exporter.addNewLine();
		
		exporter.addColumnElement("NumberOfSimulationLoops");
		exporter.addColumnElement(settings.getNumberOfSimulationLoops());
		exporter.addNewLine();
		
		exporter.addColumnElement("SimulationSpeedFactor");
		exporter.addColumnElement(settings.getSimulationSpeedFactor());
		exporter.addNewLine();
		
		/** General passenger properties **/
		exporter.addColumnElement("PassengersBoardingPerMinute");
		exporter.addColumnElement(settings.getPassengersBoardingPerMinute());
		exporter.addNewLine();
		
		exporter.addColumnElement("SeatInterferenceProcessTime");
		exporter.addColumnElement(settings.getSeatInterferenceProcessTime());
		exporter.addNewLine();
		
		exporter.addColumnElement("SeatInterferenceStandingUpPassengerWaitingTime");
		exporter.addColumnElement(settings.getSeatInterferenceStandingUpPassengerWaitingTime());
		exporter.addNewLine();
		
		exporter.addColumnElement("Sorting");
		exporter.addColumnElement(settings.getSorting().toString());
		exporter.addNewLine();
		
		exporter.addColumnElement("ThreadSleepTimeDefault");
		exporter.addColumnElement(settings.getThreadSleepTimeDefault());
		exporter.addNewLine();
		
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
			exporter = new ExcelExport(fileName);
			exporter.createFile();
			getPassengerData();
			getSimulationPropertiesData();
			exporter.closeFile();
		} catch (IOException e) {
			Log.add(this, "Data export failed!");
		}
	}

}