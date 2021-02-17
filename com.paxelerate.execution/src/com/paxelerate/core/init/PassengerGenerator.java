/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.core.init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.ModelFactory;
import com.paxelerate.model.agent.AgentFactory;
import com.paxelerate.model.agent.Luggage;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.Gender;
import com.paxelerate.model.enums.SortingScheme;
import com.paxelerate.model.enums.TravelClass;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.LuggageExtensions;
import com.paxelerate.model.extensions.SeatExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.settings.PassengerProperties;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.random.RandomHelper;

/**
 * @author Marc.Engelmann, Michael.Schmidt
 */

public interface PassengerGenerator {

	/**
	 *
	 * @param cabin
	 */
	static void createAll(Deck deck, Map<TravelClass, Integer> amounts) {

		// ---------------------------------------------------------------------------
		// Age distribution calculation

		List<Double> valuesMale = new ArrayList<>();
		List<Double> valuesFemale = new ArrayList<>();

		double scaler = 100;

		for (EPoint value : EObjectHelper.getParent(Model.class, deck).getSettings().getPassengerProperties()
				.getAgeDistribution()) {

			for (int i = 0; i < value.getZ() * 100.0 * scaler; i++) {
				valuesFemale.add(value.getX());
			}

			for (int i = 0; i < value.getY() * 100.0 * scaler; i++) {
				valuesMale.add(value.getX());
			}
		}

		// ---------------------------------------------------------------------------
		// Passenger generation

		amounts.entrySet().forEach(entry -> {

			TravelClass tc = entry.getKey();

			if (entry.getValue() <= 0) {
				return;
			}

			// Create a random seat list
			List<Seat> randomSeatList = new ArrayList<>();

			// Fill the random seat list with all seats of the class
			for (Seat seat : EObjectHelper.getChildren(deck, Seat.class)) {
				if (SeatExtensions.getTravelClass(seat) == tc) {
					randomSeatList.add(seat);
				}
			}

			// Shuffle the list before assigning the seats to the passengers
			Collections.shuffle(randomSeatList);

			// Loop through all passengers
			for (int i = 0; i < entry.getValue(); i++) {

				Passenger passenger = AgentFactory.eINSTANCE.createPassenger();

				deck.getPassengers().add(passenger);

				// Apply seat to passenger
				passenger.setSeat(randomSeatList.get(i));
				passenger.setId(deck.getPassengers().size());

				Door door = findDoor(passenger);

				if (door != null) {
					passenger.setDoor(door);
					door.getWaitingPassengers().add(passenger);
				}

				PassengerProperties opts = EObjectHelper.getParent(Model.class, passenger).getSettings()
						.getPassengerProperties();

				int ageValue = 0;

				if (RandomHelper.randomValue(0,
						1000) < opts.getAgeDistribution().stream().mapToDouble(EPoint::getZ).sum() * 1000.0) {
					passenger.setGender(Gender.FEMALE);
					ageValue = valuesFemale.get(RandomHelper.randomValue(0, valuesFemale.size() - 1)).intValue();

				} else {
					passenger.setGender(Gender.MALE);
					ageValue = valuesMale.get(RandomHelper.randomValue(0, valuesMale.size() - 1)).intValue();
				}

				passenger.setAge(RandomHelper.randomValue(ageValue, ageValue + 5));

				PassengerPropertyGenerator.apply(passenger);

				passenger.setCurrentPosition(ModelFactory.eINSTANCE.createEPoint());
				passenger.setDesiredPosition(ModelFactory.eINSTANCE.createEPoint());
				passenger.setGoalPosition(ModelFactory.eINSTANCE.createEPoint());
				passenger.setStartPosition(ModelFactory.eINSTANCE.createEPoint());
			}
		});

		// Determine the luggage distribution
		List<Luggage> luggageList = LuggageGenerator.create(deck);

		// Loop through luggage list
		for (int i = 0; i < luggageList.size(); i++) {

			Luggage luggage = luggageList.get(i);
			Passenger passenger = deck.getPassengers().get(i);

			// Stowing distance
			luggage.setStowDistance(LuggageExtensions.getLuggageStowDistance(passenger));
			passenger.getLuggage().add(luggage);
		}

		PassengerSorter.sort(deck, SortingScheme.RANDOM);
	}

	/**
	 * This method applies a door to a passenger.
	 *
	 * @param passenger is the passenger to whom the door is assigned to.
	 * @return the door
	 */
	static Door findDoor(Passenger passenger) {

		Deck deck = DeckExtensions.getBy(passenger);

		if (!deck.getDoors().isEmpty()) {

			// Check if there are no active doors
			if (DoorExtensions.getActiveDoors(deck).isEmpty()) {
				System.out.println("No active door is found. First available main door is activated.");
				deck.getDoors().get(0).setActive(true);
				return deck.getDoors().get(0);
			}

			return selectDoor(passenger);
		}

		System.out.println("No doors found. Please add a least one door!");
		return null;
	}

	/**
	 *
	 * @param passenger
	 * @return
	 */
	static Door selectDoor(Passenger passenger) {

		List<Door> activeDoors = DoorExtensions.getActiveDoors(DeckExtensions.getBy(passenger));

		switch (EObjectHelper.getParent(Model.class, passenger).getSettings().getPassengerProperties()
				.getDoorSelection()) {

		case CLOSEST:

			return DoorExtensions.getClosestDoor(null, passenger);

		case CLOSEST_BEHIND:

			for (Door door : activeDoors) {
				if (door.getXPosition() < SeatExtensions.getPosition(passenger.getSeat()).getX()) {
					activeDoors.remove(door);
				}
			}

			return DoorExtensions.getClosestDoor(activeDoors, passenger);

		case CLOSEST_IN_FRONT:

			for (Door door : activeDoors) {
				if (door.getXPosition() > SeatExtensions.getPosition(passenger.getSeat()).getX()) {
					activeDoors.remove(door);
				}
			}

			return DoorExtensions.getClosestDoor(activeDoors, passenger);

		case RANDOM:
			return activeDoors
					.get(new Random().nextInt(DoorExtensions.getActiveDoors(DeckExtensions.getBy(passenger)).size()));

		default:
			throw new IllegalArgumentException("Door Selection Option not available!");
		}
	}
}