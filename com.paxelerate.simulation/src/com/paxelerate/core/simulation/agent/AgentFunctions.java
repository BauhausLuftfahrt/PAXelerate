/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.paxelerate.core.simulation.agent.AgentShapeHandler.Influence;
import com.paxelerate.core.simulation.astar.Node;
import com.paxelerate.core.simulation.astar.Node.Layer;
import com.paxelerate.core.simulation.astar.Node.Property;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.SeatLocation;
import com.paxelerate.model.enums.SimulationType;
import com.paxelerate.model.enums.State;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.EPointExtensions;
import com.paxelerate.model.extensions.PassengerExtensions;
import com.paxelerate.model.extensions.SeatExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.monuments.SeatGroup;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.Distance;
import net.bhl.opensource.toolbox.math.Rotator;
import net.bhl.opensource.toolbox.math.vector.IntVector;

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

	/**
	 * @param shape
	 * @param vector
	 * @param occupy
	 * @param changePosition
	 */
	static void blockShape(int[][] shape, EPoint vector, boolean occupy, boolean changePosition, Agent agent) {

		/*
		 * this is the dimension you need to go in every direction from the starting
		 * point. It is half the way back in every dimension.
		 */
		int scanDimension = (int) (Math.max(shape.length, shape[0].length) / 2.0);

		/* loop through the whole passenger area in the area map */
		for (int x = -scanDimension; x <= scanDimension; x++) {
			for (int y = -scanDimension; y <= scanDimension; y++) {

				/* the location currently under investigation */
				IntVector location = new IntVector(BHLMath.toInt(vector.getX()) + x, BHLMath.toInt(vector.getY()) + y);

				/* if the point is within the bounds of the passenger area */
				if (x + scanDimension < shape.length && y + scanDimension < shape[0].length) {

					// Check for passenger shape itself
					if (shape[x + scanDimension][y + scanDimension] == 100 && changePosition) {

						if (agent.getHandler().getMap().get(location).isPresent()) {

							Node node = agent.getHandler().getMap().get(location).get();

							/* check if the node is no obstacle */
							if (node.getProperty(Layer.ASTAR) == Property.FREE) {

								if (node.getPassenger() == null
										|| node.getPassenger().getId() == agent.getPassenger().getId()) {

									/* block or unblock the node */
									if (occupy) {

										/* check if the node is empty */
										node.setPassenger(agent.getPassenger());

									} else {

										/* During unblocking, check if the node is empty */
										node.setProperty(Property.FREE, Layer.ASTAR);
										node.setPassenger(null);
									}
								}
							}
						}

						// Check for influence area
					} else if (shape[x + scanDimension][y + scanDimension] != 0
							&& shape[x + scanDimension][y + scanDimension] != 100) {

						if (agent.getHandler().getMap().get(location).isPresent()) {

							Node node = agent.getHandler().getMap().get(location).get();

							if (node.getProperty(Layer.ASTAR) == Property.FREE) {

								/* add or remove the influence value */
								if (occupy) {
									/* check if the node is no obstacle */
									// create an new influencer object and add it to the node
									node.influencingPassengers.put(agent, shape[x + scanDimension][y + scanDimension]);
								}

								else {

									// remove the influencer object from the nodes list
									/* check if the node is no obstacle */
									node.influencingPassengers.remove(agent);

								}
							}
						}
					}
				}
			}
		}
	}

	/**
	 * @param shape
	 * @param vector
	 * @param occupy
	 */
	static void blockContactTracingShape(int[][] shape, EPoint vector, boolean occupy, Agent agent) {

		/*
		 * this is the dimension you need to go in every direction from the starting
		 * point. It is half the way back in every dimension.
		 */
		int scanDimension = (int) (Math.max(shape.length, shape[0].length) / 2.0);

		/* loop through the whole passenger area in the area map */
		for (int x = -scanDimension; x <= scanDimension; x++) {
			for (int y = -scanDimension; y <= scanDimension; y++) {

				/* the location currently under investigation */
				IntVector location = new IntVector(BHLMath.toInt(vector.getX()) + x, BHLMath.toInt(vector.getY()) + y);

				/* if the point is within the bounds of the passenger area */
				if (x + scanDimension < shape.length && y + scanDimension < shape[0].length) {

					if (shape[x + scanDimension][y + scanDimension] != 0) {

						if (agent.getHandler().getMap().get(location).isPresent()) {

							Node node = agent.getHandler().getMap().get(location).get();

							/* add or remove the influence value */
							if (occupy) {
								node.getContactTracingMap().put(agent.getPassenger(),
										shape[x + scanDimension][y + scanDimension]);

							} else {
								node.getContactTracingMap().remove(agent.getPassenger());
							}
						}
					}
				}
			}
		}
	}

	static void adaptShape(int stepIndex, boolean occupy, boolean changePosition, Agent agent) {

		/*
		 * makes sure that the shape of the passenger is blocked too when luggage is
		 * stowed on the first step
		 */
		if (stepIndex == 0 && occupy == true) {
			changePosition = true;
		}

		// Apply rotation and shape
		if (occupy) {

			switch (agent.getPassenger().getState()) {
			case CABIN_LEFT:
				break;

			case CALCULATE_NEW_PATH:
				break;

			case CLEAR_ROW:
				break;

			case FOLLOW_PATH:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.WALKING));
				break;

			case NOT_ACTIVE:
				break;

			case PREPARE:
				break;

			case QUEUE_UP:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));
				break;

			case RETRIEVE_LUGGAGE:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));
				break;

			case RETURN_TO_SEAT:
				break;

			case SEATED:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.SITTING));
				break;

			case STOW_LUGGAGE:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));
				break;

			case UNFOLD_SEAT:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));
				break;

			case WAIT_FOR_OTHER_PASSENGER_TO_SEAT:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));
				break;

			case WAIT_FOR_ROW_CLEARING:
				agent.getShapeHandler().setCurrentShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));
				break;

			default:
				break;

			}

			if (stepIndex <= 1 && agent.getHandler().getSettings().getSimulationType() == SimulationType.BOARDING) {

				// rotate the shape if for the first two steps, assign the rotation between the
				// first two points to avoid door blocking 1.
				agent.getShapeHandler()
						.setModifiedShape(Rotator.rotate(
								PassengerExtensions.getRotation(
										EPointExtensions.transformIntVector(agent.getPath().get(0).getPosition()),
										EPointExtensions.transformIntVector(agent.getPath().get(1).getPosition())),
								agent.getShapeHandler().getCurrentShape()));

			} else if (changePosition) {

				// else if standard rotating process while walking 2
				agent.getShapeHandler()
						.setModifiedShape(Rotator.rotate(PassengerExtensions.getRotation(agent.getPassenger()),
								agent.getShapeHandler().getCurrentShape()));

			} else if (agent.getPassenger().getState() != State.SEATED) {

				// else if rotating process when only the influence area gets changed
				agent.getShapeHandler()
						.setModifiedShape(
								Rotator.rotate(
										PassengerExtensions.getRotation(
												EPointExtensions.transformIntVector(
														agent.getPath().get(stepIndex - 2).getPosition()),
												agent.getPassenger().getCurrentPosition()),
										agent.getShapeHandler().getCurrentShape()));

			} else {

				// else influence area sitting (The influence area is symmetric, so the
				// orientation of the seat does not matter.
				agent.getShapeHandler().setModifiedShape(Rotator.rotate(90, agent.getShapeHandler().getCurrentShape()));
			}
		}

		// if no rotation is needed or possible, skip the rotation process and assign
		// the basic layout to the object.

		if (agent.getShapeHandler().getModifiedShape() == null) {
			if (Math.max(agent.getShapeHandler().getInfluenceArea(Influence.STANDING).length,
					agent.getShapeHandler().getInfluenceArea(Influence.STANDING)[0].length) > Math.max(
							agent.getShapeHandler().getInfluenceArea(Influence.WALKING).length,
							agent.getShapeHandler().getInfluenceArea(Influence.WALKING)[0].length)) {

				agent.getShapeHandler().setModifiedShape(agent.getShapeHandler().getInfluenceArea(Influence.STANDING));

			} else {
				agent.getShapeHandler().setModifiedShape(agent.getShapeHandler().getInfluenceArea(Influence.WALKING));
			}
		}
	}
}
