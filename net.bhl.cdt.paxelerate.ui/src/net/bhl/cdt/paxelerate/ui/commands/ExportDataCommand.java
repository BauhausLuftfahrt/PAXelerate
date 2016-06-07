/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IMessageProvider;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.SimulationResult;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.storage.AgeStorage;
import net.bhl.cdt.paxelerate.model.storage.GaussianStorage;
import net.bhl.cdt.paxelerate.model.storage.LuggageStorage;
import net.bhl.cdt.paxelerate.model.storage.StorageHandler;
import net.bhl.cdt.paxelerate.util.exchange.ExcelExport;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.time.TimeHelper;
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

	/** The property store. */
	private StorageHandler propertyStore = new StorageHandler();

	/** The exporter. */
	private ExcelExport exporter;

	/**
	 * Instantiates a new export data command.
	 *
	 * @param cabin
	 *            the cabin
	 */
	public ExportDataCommand(Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * Instantiates a new export data command.
	 *
	 * @param cabin the cabin
	 * @param exporter the exporter
	 */
	public ExportDataCommand(Cabin cabin, ExcelExport exporter) {
		// super();
		this.cabin = cabin;
		this.exporter = exporter;
	}

	/**
	 * Gets the passenger data.
	 *
	 * @return the passenger data
	 * @throws IOException             Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public boolean getPassengerData() throws IOException, FileNotFoundException {
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
	 * @return the simulation properties data
	 * @throws IOException             Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public boolean getSimulationPropertiesData() throws IOException, FileNotFoundException {

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

		// LuggageProperties luggageSettings =
		// cabin.getSimulationSettings().getLuggageProperties();
		// PassengerProperties paxSettings =
		// cabin.getSimulationSettings().getPassengerProperties();

		return true;
	}

	/**
	 * Gets the study settings.
	 *
	 * @return the study settings
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public boolean getStudySettings() throws IOException, FileNotFoundException {

		LuggageProperties luggageSettings = cabin.getSimulationSettings().getLuggageProperties();
		EList<TravelClass> tcList = cabin.getClasses();
		EList<Door> doorList = cabin.getDoors();

		exporter.addColumnElement("No Luggage");
		exporter.addColumnElement("Small Luggage");
		exporter.addColumnElement("Medium Luggage");
		exporter.addColumnElement("Big Luggage");
		exporter.addColumnElement("Load Factor");
		exporter.addColumnElement("Active Door ID");
		exporter.addNewLine();
		exporter.addColumnElement(luggageSettings.getPercentageOfPassengersWithNoLuggage());
		exporter.addColumnElement(luggageSettings.getPercentageOfPassengersWithSmallLuggage());
		exporter.addColumnElement(luggageSettings.getPercentageOfPassengersWithMediumLuggage());
		exporter.addColumnElement(luggageSettings.getPercentageOfPassengersWithBigLuggage());
		for (TravelClass tc : tcList) {
			exporter.addColumnElement(tc.getLoadFactor());
		}
		for (Door dl : doorList) {
			if(dl.isIsActive()) {
				exporter.addColumnElement(dl.getId());
			}
		}
		exporter.addNewLine();
		exporter.addNewLine();

		return true;
	}

	/**
	 * Gets the result data.
	 *
	 * @return the result data
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public boolean getResultData() throws IOException, FileNotFoundException {

		exporter.addColumnElement("Loop ID");
		exporter.addColumnElement("Passengers");
		exporter.addColumnElement("Time");
		exporter.addColumnElement("Skipped Way Making");
		exporter.addColumnElement("Completed Way Making");
		exporter.addNewLine();

		for (SimulationResult result : cabin.getSimulationSettings().getResults()) {
			exporter.addColumnElement(result.getId());
			exporter.addColumnElement(result.getPassengers());
			exporter.addColumnElement(TimeHelper.toTimeOfDay(result.getBoardingTime()));
			exporter.addColumnElement(result.getWaymakingSkipped());
			exporter.addColumnElement(result.getWaymakingCompleted());
			exporter.addNewLine();
		}

		return true;
	}

	/**
	 * Generate distribution file.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException the file not found exception
	 */
	public void generateDistributionFile() throws IOException, FileNotFoundException {

		propertyStore.clear();
		for (Passenger pax : cabin.getPassengers()) {
			propertyStore.addPassenger(pax);
		}
		Object[] storageData = propertyStore.getStorageData();
		// weightStore, heightStore, depthStore, widthStore, ageStore,
		// luggageStore, numberOfPassengers

		exporter.addColumnElement("Type");
		exporter.addColumnElement("Maximum Value F");
		exporter.addColumnElement("Maximum Value M");
		exporter.addColumnElement("Minimum Value F");
		exporter.addColumnElement("Minimum Value M");
		exporter.addColumnElement("Average Value F");
		exporter.addColumnElement("Average Value M");
		exporter.addColumnElement("Sum Value F");
		exporter.addColumnElement("Sum Value M");
		exporter.addColumnElement("Amount Value F");
		exporter.addColumnElement("Amount Value F");
		exporter.addNewLine();

		writeGaussian((GaussianStorage) storageData[0], "Weight");
		writeGaussian((GaussianStorage) storageData[1], "Height");
		writeGaussian((GaussianStorage) storageData[2], "Depth");
		writeGaussian((GaussianStorage) storageData[3], "Width");
		// writeGaussian((GaussianStorage) storageData[4], "Age");
		// writeGaussian((GaussianStorage) storageData[5], "Luggage");
		// writeGaussian((GaussianStorage) storageData[6], "Passengers");
	}

	/**
	 * Write gaussian.
	 *
	 * @param storage            the storage
	 * @param name            the name
	 * @throws IOException             Signals that an I/O exception has occurred.
	 * @throws FileNotFoundException             the file not found exception
	 */
	private void writeGaussian(GaussianStorage storage, String name) throws IOException, FileNotFoundException {

		exporter.addColumnElement(name);
		exporter.addColumnElement(str(storage.getMaximum(Sex.FEMALE)));
		exporter.addColumnElement(str(storage.getMaximum(Sex.MALE)));
		exporter.addColumnElement(str(storage.getMinimum(Sex.FEMALE)));
		exporter.addColumnElement(str(storage.getMinimum(Sex.MALE)));
		exporter.addColumnElement(str(storage.getAverage(Sex.FEMALE)));
		exporter.addColumnElement(str(storage.getAverage(Sex.MALE)));
		exporter.addColumnElement(str(storage.getSum(Sex.FEMALE)));
		exporter.addColumnElement(str(storage.getSum(Sex.MALE)));
		exporter.addColumnElement(str(storage.getAmount(Sex.FEMALE)));
		exporter.addColumnElement(str(storage.getAmount(Sex.MALE)));
		exporter.addNewLine();
	}

	/**
	 * Str.
	 *
	 * @param value
	 *            the value
	 * @return the string
	 */
	private static String str(double value) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(value);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.bhl.cdt.commands.CDTCommand#doRun()
	 */
	@Override
	protected void doRun() {
		Input input = new Input(WindowType.EXPORT_DATA, "Enter the filename.", IMessageProvider.INFORMATION);

		String fileName = input.getStringValue();
		try {

			getPassengerData();
			getSimulationPropertiesData();
			exporter.closeFile();
		} catch (IOException e) {
			Log.add(this, "Data export failed!");
		}
	}

}