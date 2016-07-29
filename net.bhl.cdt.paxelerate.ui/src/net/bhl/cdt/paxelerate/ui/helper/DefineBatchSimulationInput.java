/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.helper;

import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.ui.commands.RefreshCabinViewCommand;
import net.bhl.cdt.paxelerate.ui.preferences.PAXeleratePreferencePage;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class DefineBatchSimulationInput.
 * 
 * @author michael.schmidt
 * @version 1.0
 * @since 0.7
 */
public class DefineBatchSimulationInput extends CDTCommand {

	/** The hand luggage study. */
	private static HandLuggageCase handLuggageStudy;

	/** The csv import. */
	private boolean csvImport = false;

	/**
	 * The Enum HandLuggageCase.
	 */
	public static enum HandLuggageCase {

		/** The no hl. */
		NO_HL,
		/** The usual hl low. */
		USUAL_HL_LOW,
		/** The usual hl high. */
		USUAL_HL_HIGH,
		/** The bulky hl. */
		BULKY_HL
	}

	/** The load factor. */
	private int loadFactor;

	/** The study parameters. */
	private ArrayList<String> studyParameters;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 *
	 * @param handLuggageStudy
	 *            the hand luggage study
	 * @param loadFactor
	 *            the load factor
	 */
	public DefineBatchSimulationInput(HandLuggageCase handLuggageStudy, int loadFactor) {	
		this.handLuggageStudy = handLuggageStudy;
		this.loadFactor = loadFactor;
	}

	/**
	 * Instantiates a new define batch simulation input.
	 *
	 * @param study
	 *            the study
	 */
	public DefineBatchSimulationInput(ArrayList<String> study) {
		this.studyParameters = study;
		this.csvImport = true;
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	public final void doRun() {
		// Create separate thread
		Job job = new Job("Define Simulation Input Thread") {

			private Cabin cabin;
			private SimulationProperties simSettings;

			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
			 * IProgressMonitor)
			 */
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				Log.add(this, "Setting study parameters ...");
				
				try {
					if (ECPUtil.getECPProjectManager().getProjects() != null) {
						cabin = (Cabin) ECPUtil.getECPProjectManager()
								.getProject(PAXeleratePreferencePage.DEFAULT_PROJECT_NAME).getContents().get(0);
						simSettings = cabin.getSimulationSettings();
					}
				} catch (NullPointerException e) {
					Log.add(this, "Could not find any project or model!");
					e.printStackTrace();
					return Status.CANCEL_STATUS;
				}
				

				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						new RefreshCabinViewCommand(cabin).execute();
					}
				});

				if (csvImport) {

					if (!StringHelper.empty(studyParameters.get(2))) {
						simSettings.setSimulationSpeedFactor(Integer.parseInt(studyParameters.get(2)));
					}

					if (!StringHelper.empty(studyParameters.get(3))) {
						if (studyParameters.get(3) == "false") {
							simSettings.setSimulateWithoutUI(false);
						} else {
							simSettings.setSimulateWithoutUI(true);
						}
					}

					if (!StringHelper.empty(studyParameters.get(5))) {
						simSettings.getLuggageProperties()
								.setPercentageOfPassengersWithNoLuggage((Integer.parseInt(studyParameters.get(5))));
					}
					if (!StringHelper.empty(studyParameters.get(6))) {
						simSettings.getLuggageProperties()
								.setPercentageOfPassengersWithSmallLuggage((Integer.parseInt(studyParameters.get(6))));
					}
					if (!StringHelper.empty(studyParameters.get(7))) {
						simSettings.getLuggageProperties()
								.setPercentageOfPassengersWithMediumLuggage((Integer.parseInt(studyParameters.get(7))));
					}
					if (!StringHelper.empty(studyParameters.get(8))) {
						simSettings.getLuggageProperties()
								.setPercentageOfPassengersWithBigLuggage((Integer.parseInt(studyParameters.get(8))));
					}
					if (!StringHelper.empty(studyParameters.get(11))) {
						simSettings.setPassengersBoardingDoor(Integer.parseInt(studyParameters.get(11)));
					}
					if (!StringHelper.empty(studyParameters.get(12))) {
						simSettings.getPassengerProperties().setPassengerWalkingSpeedFactor(Double.parseDouble(studyParameters.get(12)));
					}

					if (!StringHelper.empty(studyParameters.get(9))) {
						switch (studyParameters.get(9)) {

						case "Default":
							simSettings.setLayoutConcept(LayoutConcept.DEFAULT);
							break;

						case "LiftingSeatPanSeats":
							simSettings.setLayoutConcept(LayoutConcept.LIFTING_SEAT_PAN_SEATS);
							simSettings.setLiftingSeatPanPopupTimeMean(0);
							simSettings.setLiftingSeatPanPopupTimeDeviation(0);
							simSettings.getPassengerProperties().setSeatInterferenceProcessTimeFoldingSeatMean(0);
							simSettings.getPassengerProperties().setSeatInterferenceProcessTimeFoldingSeatDeviation(0);
							break;

						case "SidewaysFoldableSeat":
							simSettings.setLayoutConcept(LayoutConcept.SIDWAYS_FOLDABLE_SEAT);
							simSettings.setSidewaysFoldabeSeatPopupTimeMean(0);
							simSettings.setSidewaysFoldabeSeatPopupTimeDeviation(0);
							simSettings.getPassengerProperties().setSeatInterferenceProcessTimeFoldingSeatMean(0);
							simSettings.getPassengerProperties().setSeatInterferenceProcessTimeFoldingSeatDeviation(0);
							break;

						default:
							simSettings.setLayoutConcept(LayoutConcept.DEFAULT);
							break;
						}
					}

					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							new RefreshCabinViewCommand(cabin).execute();
						}
					});

					if (!StringHelper.empty(studyParameters.get(4))) {
						for (TravelClass travelclass : cabin.getClasses()) {
							travelclass.setPassengers((Integer.parseInt((String) studyParameters.get(4))));
						}
					}

				} else {
					simSettings.setSimulationSpeedFactor(10);
					simSettings.setLayoutConcept(LayoutConcept.DEFAULT);
					simSettings.setSimulateWithoutUI(true);
					simSettings.setSidewaysFoldabeSeatPopupTimeDeviation(0);
					simSettings.setLiftingSeatPanPopupTimeDeviation(0);
					simSettings.getPassengerProperties().setSeatInterferenceProcessTimeFoldingSeatDeviation(0);
					simSettings.getPassengerProperties().setSeatInterferenceProcessTimeDeviation(0);

					switch (handLuggageStudy) {
					case NO_HL:
						simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(100);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(0);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(0);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(0);
						break;

					case USUAL_HL_LOW:
						simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(10);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(50);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(30);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(10);
						break;

					case USUAL_HL_HIGH:
						simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(10);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(30);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(40);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(20);
						break;

					case BULKY_HL:
						simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(0);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(20);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(30);
						simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(50);
						break;
					default:
						break;
					}

					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							new RefreshCabinViewCommand(cabin).execute();
						}
					});

					switch (loadFactor) {
					case 60:
						for (TravelClass travelclass : cabin.getClasses()) {
							travelclass.setPassengers(108);
						}
						break;

					case 70:
						for (TravelClass travelclass : cabin.getClasses()) {
							travelclass.setPassengers(126);
						}
						break;

					case 80:
						for (TravelClass travelclass : cabin.getClasses()) {
							travelclass.setPassengers(144);
						}
						break;

					case 90:
						for (TravelClass travelclass : cabin.getClasses()) {
							travelclass.setPassengers(162);
						}
						break;

					case 100:
						for (TravelClass travelclass : cabin.getClasses()) {
							travelclass.setPassengers(180);
						}
						break;
					default:
						break;
					}
				}

				// report finished
				return Status.OK_STATUS;

			}
		};

		/* report job status to console */
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					Log.add(this, "Simulation parameters set");
				} else {
					Log.add(this, "Setting simulation parameters failed");
				}
			}
		});

		/* Start the Job */
		job.schedule();
		try {
			/* schedule job after previous is finished */
			job.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread " + Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
	}
}
