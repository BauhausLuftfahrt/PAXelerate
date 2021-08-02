/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.astar;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.DoorSide;
import com.paxelerate.model.extensions.DeckExtensions;
import com.paxelerate.model.extensions.DoorExtensions;
import com.paxelerate.model.extensions.SeatExtensions;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Seat;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.BHLMath;
import net.bhl.opensource.toolbox.math.vector.IntVector;

/**
 * @author Marc.Engelmann
 * @since 11.12.2019
 *
 */

public interface SimulationFunctions {

	/**
	 * Calculate the goal position for a specific door
	 *
	 * @param door
	 * @return
	 */
	static List<IntVector> determineGoalForObject(EObject object) {

		List<IntVector> goals = new ArrayList<>();
		EPoint deckSize = DeckExtensions.getMaximumSize(DeckExtensions.getBy(object));

		double gridSize = EObjectHelper.getParent(Model.class, object).getSettings().getSimulationGridResolution();

		if (object instanceof Door) {

			for (Passenger p : ((Door) object).getWaitingPassengers()) {
				goals.add(new IntVector(BHLMath.toInt(SeatExtensions.getPosition(p.getSeat()).getX() / gridSize - 1),
						BHLMath.toInt(
								(SeatExtensions.getCenter(p.getSeat()).getY() + deckSize.getY() / 2.0) / gridSize)));
			}
		} else if (object instanceof Seat) {

			Seat seat = (Seat) object;
			goals.add(new IntVector(BHLMath.toInt(SeatExtensions.getPosition(seat).getX() / gridSize - 1),
					BHLMath.toInt((SeatExtensions.getCenter(seat).getY() + deckSize.getY() / 2.0) / gridSize)));
		}
		return goals;
	}

	/**
	 * Calculate the starting position for a specific door.
	 *
	 * @param door
	 * @return
	 */
	static IntVector determineStartForDoor(Door door) {

		double gridSize = EObjectHelper.getParent(Model.class, door).getSettings().getSimulationGridResolution();

		IntVector start = new IntVector(
				BHLMath.toInt((door.getXPosition() + DoorExtensions.getWidth(door) / 2.0) / gridSize), 0);

		if (door.getSide() == DoorSide.STARBOARD) {

			start.setY(BHLMath.toInt(
					DeckExtensions.getMaximumSize(EObjectHelper.getParent(Deck.class, door)).getY() / gridSize - 1));
		}

		return start;
	}

}
