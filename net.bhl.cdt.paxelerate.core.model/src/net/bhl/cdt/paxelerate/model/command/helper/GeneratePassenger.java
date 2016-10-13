/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.command.helper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.DoorOption;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.util.PassengerGenerator;
import net.bhl.cdt.paxelerate.model.util.PassengerPropertyGenerator;

import net.bhl.cdt.paxelerate.util.string.StringHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.1
 * @since 0.5
 *
 */

public class GeneratePassenger {

	private int totalCount = 1;
	private TravelClass travelClass;
	private Cabin cabin;

	/**
	 * This method submits the cabin to be used in the file.
	 * 
	 * @param cabin
	 *            is the input parameter
	 */
	public GeneratePassenger(final Cabin cabin, final TravelClass travelClass) {
		this.cabin = cabin;
		this.travelClass = travelClass;
	}

	/**
	 * This method applies a door to a passenger.
	 *
	 * @param pass
	 *            is the passenger to whom the door is assigned to.
	 * @return the door
	 */
	private Door getDoor(final Passenger pass) {

		ArrayList<Door> sdoorage = new ArrayList<Door>();

		if (cabin.getDoors().size() == 0) {
			Log.add(this, "No doors found. Please add a least one door!");
			return null;

		} else {
			for (Door door : cabin.getDoors()) {
				if (door.isIsActive()) {
					sdoorage.add(door);
				}
			}
			/* Check if active doors exist */
			if (sdoorage.size() == 0) {
				Log.add(this,
						"No active door is found. First available main door is activated.");
				for (Door door : cabin.getDoors()) {
					if (door.getDoorOption() == DoorOption.MAIN_DOOR) {
						door.setIsActive(true);
						sdoorage.add(door);
						break;
					}
				}
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

	}

	/**
	 * This method gets the seat which is connected to a specific passenger.
	 * 
	 * @param passenger
	 *            the passenger
	 * @return the seat which is linked to the passenger
	 */
	private Seat getSeat(final Passenger passenger) {
		List<Seat> seats = ModelHelper.getChildrenByClass(cabin, Seat.class);
		if (seats.size() == 0) {
			Log.add(this, "No seats found!");
			return null;
		} else {
			for (Seat seat : seats) {
				if ((seat.getId() == passenger.getSeatID())) {
					seat.setPassenger(passenger);
					return seat;
				}
			}
			return null;
		}
	}
	
	/**
	 * This method generates the passengers.
	 */
	public synchronized void performGeneratePassengers() {

		int numberOfPassengers = travelClass.getPassengers();
		int numberOfSeats = travelClass.getAvailableSeats();

		if (numberOfPassengers != 0) {
			if (numberOfPassengers <= numberOfSeats) {

				int firstSeatNumber = ModelHelper
						.getChildrenByClass(travelClass, Seat.class).get(0)
						.getId();

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
							Passenger passenger = CabinFactory.eINSTANCE
									.createPassenger();

							cabin.getPassengers().add(passenger);

							passenger.setId(totalCount);
							passenger.setSeatID(randomSeatId.get(i));
							passenger.setName(passenger.getId() + " ("
									+ getSeat(passenger).getName() + ")");
							passenger.setSeat(getSeat(passenger));
							passenger.setTravelClass(
									passenger.getSeat().getTravelClass());


							if (!(getDoor(passenger) == null)) {
								passenger.setDoor(getDoor(passenger));
							} else {
								throw new NullPointerException();
							}

							PassengerGenerator.applyDelay(passenger, delays);

							PassengerPropertyGenerator generator = new PassengerPropertyGenerator(
									passenger);
							passenger = generator.getPassenger();

							totalCount++;

						} catch (ConcurrentModificationException e) {
							Log.add(this,
									"ConcurrentModificationException: Passenger generation aborted!");
							e.printStackTrace();
						} catch (NullPointerException e) {
							Log.add(this,
									"NullPointerException: Passenger generation aborted!");
							e.printStackTrace();
						}

					}
				}
				Log.add(this, "successfully created " + numberOfPassengers
						+ " passengers in " + travelClass.getName());
			} else {
				Log.add(this, "Too many passengers in "
						+ StringHelper.splitCamelCase(travelClass.getName()));
			}
		}
	}

}

