/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.util.PassengerGenerator;
import net.bhl.cdt.paxelerate.model.util.PassengerPropertyGenerator;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.input.Input;
import net.bhl.cdt.paxelerate.util.input.Input.WindowType;
import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * This command creates the passengers.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.0
 *
 */

public class GeneratePassengersCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The total count. */
	private int totalCount = 1;

	/** The cabinview. */
	private CabinViewPart cabinview;

	final JobScheduleRule jobRule = new JobScheduleRule();

	/**
	 * This method submits the cabin to be used in the file.
	 * 
	 * @param cabin
	 *            is the input parameter
	 */
	public GeneratePassengersCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	public GeneratePassengersCommand() {
		if (ECPUtil.getECPProjectManager().getProjects() != null) {
			this.cabin = (Cabin) ECPUtil.getECPProjectManager().getProject("reference").getContents().get(0);
		}
	}

	/**
	 * This method applies a door to a passenger.
	 *
	 * @param pass
	 *            is the passenger to whom the door is assigned to.
	 * @return the door
	 */
	private Door getDoor(Passenger pass) {

		ArrayList<Door> sdoorage = new ArrayList<Door>();

		for (Door door : cabin.getDoors()) {
			if (door.isIsActive()) {
				sdoorage.add(door);
			}
		}
		/**
		 * Check if active doors exist otherwise throw a NullPointerException
		 **/
		if (sdoorage.size() == 0) {
			Log.add(this, "Please activate at least one door which can be assigned to passengers.");
			throw new NullPointerException();
		}
		int seatPos = pass.getSeat().getXPosition();

		int current = Integer.MAX_VALUE;
		Door bestDoor = null;

		for (Door door : sdoorage) {
			int diff = Math.abs(door.getXPosition() - seatPos);
			if (diff < current) {
				current = diff;
				bestDoor = door;
			}
		}
		return bestDoor;
	}

	/**
	 * This method gets the seat which is connected to a specific passenger.
	 * 
	 * @param passenger
	 *            the passenger
	 * @return the seat which is linked to the passenger
	 */
	private Seat getSeat(Passenger passenger) {

		for (Seat seat : ModelHelper.getChildrenByClass(cabin, Seat.class)) {
			if ((seat.getId() == passenger.getSeatID())) {
				seat.setPassenger(passenger);
				return seat;
			}
		}

		Log.add(this, "No seat found!");

		return null;
	}

	/**
	 * This method generates the passengers.
	 *
	 * @param tc
	 *            the tc
	 */
	private synchronized void generatePassengers(TravelClass tc) {

		int numberOfPassengers = tc.getPassengers();
		int numberOfSeats = tc.getAvailableSeats();

		if (numberOfPassengers != 0) {
			if (numberOfPassengers <= numberOfSeats) {

				int firstSeatNumber = ModelHelper.getChildrenByClass(tc, Seat.class).get(0).getId();

				/* Create random list */

				ArrayList<Integer> randomSeatId = new ArrayList<Integer>();

				for (int i = 0; i < numberOfSeats; i++) {
					randomSeatId.add(firstSeatNumber + i);
				}

				Collections.shuffle(randomSeatId);

				Map<Integer, Double> delays = new HashMap<>();

				for (int i = 0; i < numberOfPassengers; i++) {
					synchronized (this) {
						try {
							Passenger passenger = CabinFactory.eINSTANCE.createPassenger();

							cabin.getPassengers().add(passenger);

							passenger.setId(totalCount);
							passenger.setSeatID(randomSeatId.get(i));
							passenger.setName(passenger.getId() + " (" + getSeat(passenger).getName() + ")");
							passenger.setSeat(getSeat(passenger));
							passenger.setTravelClass(passenger.getSeat().getTravelClass());
							passenger.setDoor(getDoor(passenger));

							PassengerGenerator.applyDelay(passenger, delays);

							PassengerPropertyGenerator generator = new PassengerPropertyGenerator(passenger);
							passenger = generator.getPassenger();

							totalCount++;

						} catch (ConcurrentModificationException e) {
							e.printStackTrace();
						}

					}
				}
				Log.add(this, "successfully created " + numberOfPassengers + " passengers in " + tc.getName());
			} else {
				Log.add(this, "Too many passengers in " + StringHelper.splitCamelCase(tc.getName()));
			}
		}
	}

	/**
	 * This method runs the passenger generation command.
	 */
	@Override
	protected void doRun() {
		/* Create separate thread */

		Job job = new Job("Generate Passengers Thread") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {

				Log.add(this, "Passenger generation started...");

				if (cabin.getDoors().isEmpty()) {
					new Input(WindowType.WARNING,
							"You can not continue without generating and activating at least one door!",
							IMessageProvider.ERROR);
					Log.add(this, "Passenger generation aborted");
				} else {

					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							cabinview = ViewPartHelper.getCabinView();
							cabinview.unsyncViewer();

							cabin.getPassengers().clear();
						}
					});

					for (TravelClass travelclass : cabin.getClasses()) {
						generatePassengers(travelclass);
					}
					for (Door door : cabin.getDoors()) {
						door.getWaitingPassengers().clear();
					}

					/* PUBLISH */
					Log.add(this, "Updating GUI...");
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							try {
								ViewPartHelper.getPropertyView().updateUI(cabin);
							} catch (NullPointerException e) {
								Log.add(this, "No property view is visible!");
							}

							try {
								cabinview.syncViewer();
								cabinview.setCabin(cabin);
							} catch (NullPointerException e) {
								Log.add(this, "Cabin View not visible!");
							}

							try {
								new DrawCabinCommand(cabin).doRun();
							} catch (NullPointerException e) {
								Log.add(this, "Cabin View could not be refreshed");
							}
						}
					});
				}
				/* report finished */
				return Status.OK_STATUS;

			}
		};

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK())
					Log.add(this, "Passenger generation completed");
				else
					Log.add(this, "Job did not complete successfully");
			}
		});

		job.setRule(jobRule);
		/* Start the Job */
		job.schedule();
	}
}
