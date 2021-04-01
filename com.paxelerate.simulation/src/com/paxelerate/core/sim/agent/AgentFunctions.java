/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.sim.agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.paxelerate.core.sim.astar.Node;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.EPointExtensions;
import com.paxelerate.model.extensions.PassengerExtensions;
import com.paxelerate.model.extensions.SeatExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.monuments.SeatGroup;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.Distance;

/**
 * The Class AgentFunctions.
 *
 * @author Marc.Engelmann
 * @since 11.05.2020
 *
 */
public interface AgentFunctions {

	int PIXELS_FOR_SCANNING_AT_DOOR = 10;

	/**
	 * Passenger stows luggage at aisle seat.
	 *
	 * @param agent
	 * @return
	 */
	static boolean canPassengerPerformActionAtAisleSeat(Agent agent) {

		Seat aisleSeat = AgentFunctions.getMyAisleSeat(agent);

		if (aisleSeat != null) {
			double distanceToAisleSeat = 1;
			double yCoordAisleSeat = SeatExtensions.getPosition(aisleSeat).getY();
			return Distance.distanceBetween(agent.getPassenger().getCurrentPosition().getY(), 0, yCoordAisleSeat, 0)
					/ EObjectHelper.getParent(Model.class, agent.getPassenger()).getSettings()
							.getSimulationGridResolution() <= distanceToAisleSeat;

		}

		throw new IllegalArgumentException("Error! There must be an aisle seat!");
	}

	/**
	 * This method of checking for other passengers ahead should be way faster and
	 * safer than the previous one as the passenger does not need to scan its
	 * surroundings but rather just scans a specific number of steps ahead on its
	 * path.
	 *
	 * @param index the index at which the check should be done.
	 * @return if the path at the index is blocked
	 */
	static boolean isPathBlockedAtIndex(Agent agent, int index) {

		/* if the index is to big, check for the last element instead */
		if (index >= agent.getPath().size()) {
			index = agent.getPath().size() - 1;
		}

		Node node = agent.getPath().get(index);

		/* check if the node at the index is blocked */
		if (node.getPassenger() != null) {

			/* check if it is not this agent who is blocking the node. */
			if (node.getPassenger().getId() != agent.getPassenger().getId()) {
				agent.setBlocker(node.getPassenger());
				return true;
			}
		}

		return false;
	}

	/**
	 * Doorway blocked.
	 *
	 * @param passenger the passenger
	 * @return true, if successful
	 */
	static boolean doorwayBlocked(Agent agent, int pixelsScanningAtDoor) {

		/* get the door of the passenger */
		Door door = agent.getPassenger().getDoor();

		/* get the scale of the cabin */
		double scale = EObjectHelper.getParent(Model.class, agent.getPassenger()).getSettings()
				.getSimulationGridResolution();

		/*
		 * loop through the area defined by the width of the door and a certain size for
		 * the first step into the cabin
		 */
		for (int j = 0; j < DoorExtensions.getWidth(door) / scale; j++) {
			for (int i = 0; i <= pixelsScanningAtDoor; i++) {

				/* get the corresponding node */
				Optional<Node> node = agent.getHandler().getMap().get((int) Math.round(door.getXPosition() / scale + j),
						i);

				if (node.isPresent()) {

					/* check if the node is an agent */
					if (node.get().getPassenger() != null && agent.getPassenger() != null) {

						/* check if it is not the agent itself */
						if (node.get().getPassenger().getId() != agent.getPassenger().getId()) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

//	/**
//	 *
//	 * @param assignedDoor
//	 * @return
//	 */
//	static LuggageStorage getCenterLuggageStorageAtDoor(Door assignedDoor) {
//
//		return DeckExtensions.getBy(assignedDoor).getLuggageStorages().stream()
//				.filter(l -> l.getType() == StorageType.CENTER_STORAGE)
//				.filter(l -> Math.abs(l.getPosition().getX() - assignedDoor.getXPosition()) <= 300).findFirst()
//				.orElse(null);
//	}

	/**
	 *
	 * @param agent
	 * @return
	 */
	static Seat getMyAisleSeat(Agent agent) {
		return AgentFunctions.getSeatsBetweenMeAndMySeat(agent).stream()
				.filter(s -> s.getSeatLocation() == SeatLocation.AISLE).findFirst().orElse(null);
	}

	/**
	 *
	 * Passenger position from simulation has to be moved half the diameter in y
	 * direction
	 *
	 * @param group
	 * @param me
	 * @return
	 */
	static List<Seat> getSeatsBetweenMeAndMySeat(Agent me) {

		List<Seat> betweeners = new ArrayList<>();

		double myYPosition = EPointExtensions.transform(me.getPassenger().getCurrentPosition()).getY()
				* EObjectHelper.getParent(Model.class, me.getPassenger()).getSettings().getSimulationGridResolution()
				- DeckExtensions.getMaximumSize(EObjectHelper.getParent(Model.class, me.getPassenger()).getDeck())
						.getY() / 2.0;

		double mySeatYPosition = EPointExtensions.transform(SeatExtensions.getCenter(me.getPassenger().getSeat()))
				.getY();

		for (Seat seat : EObjectHelper.getParent(SeatGroup.class, me.getPassenger().getSeat()).getSeats()) {

			double otherYPosition = EPointExtensions.transform(SeatExtensions.getCenter(seat)).getY();

			// Check if the other passenger is between me and my seat!
			if (myYPosition > otherYPosition && mySeatYPosition < otherYPosition
					|| myYPosition < otherYPosition && mySeatYPosition > otherYPosition) {

				betweeners.add(seat);
			}
		}

		return betweeners;
	}

	/**
	 * Someone already in this part of the row.
	 *
	 * @param agent the agent
	 * @return true, if successful
	 */
	static boolean someoneAlreadyInThisPartOfTheRow(Agent agent) {

		for (Seat checkSeat : AgentFunctions.getSeatsBetweenMeAndMySeat(agent)) {

			Passenger otherPassenger = PassengerExtensions.getBySeat(checkSeat);

			/* check for blocked seats in my part of the row */
			if (otherPassenger != null) {

				return otherPassenger.isIsSeated();

			}
		}
		return false;
	}
}
