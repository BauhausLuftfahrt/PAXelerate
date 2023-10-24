/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.agent.Luggage;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.monuments.Seat;

import net.bhl.opensource.toolbox.emf.EObjectHelper;

/**
 *
 * @author Marc.Engelmann
 *
 */

public interface PassengerExtensions {

	/**
	 *
	 * @param seat
	 * @return
	 */
	static Passenger getBySeat(Seat seat) {
		return EObjectHelper.getParent(Deck.class, seat).getPassengers().stream().filter(p -> p.getSeat().equals(seat))
				.findFirst().orElse(null);
	}

	/**
	 * Get luggage stowing time in seconds
	 *
	 * @param bin
	 */
	static double getLuggageStowingTime(Passenger passenger) {
		double stowingTime = 0;
		for (Luggage luggage : passenger.getLuggage()) {
			stowingTime += luggage.getStowTime();
		}
		return stowingTime;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 *
	 * @param agent the agent
	 * @return the rotation in degrees.
	 */
	static int getRotation(Passenger passenger) {

		/* get the angle in radian from -Pi to Pi, so zero is EAST */
		double theta = Math.atan2(passenger.getDesiredPosition().getY() - passenger.getCurrentPosition().getY(),
				passenger.getDesiredPosition().getX() - passenger.getCurrentPosition().getX());

		/* rotate the angle by 90 degrees so that zero is NORTH */
		theta += Math.PI / 2.0;

		/* transform from radian to degree */
		int angle = (int) Math.toDegrees(theta);

		/* if degree is smaller than 0, convert it */
		if (angle < 0) {
			angle += 360;
		}
		return angle;
	}

	/**
	 * Rotation from 0 to 359 degrees. Only 45 degree steps. North is zero.
	 *
	 * @param EPoint 1
	 * @param EPoint 2
	 * @return the rotation in degrees.
	 */
	static int getRotation(EPoint pos1, EPoint pos2) {

		/* get the angle in radian from -Pi to Pi, so zero is EAST */
		double theta = Math.atan2(pos2.getY() - pos1.getY(), pos2.getX() - pos1.getX());

		/* rotate the angle by 90 degrees so that zero is NORTH */
		theta += Math.PI / 2.0;

		/* transform from radian to degree */
		int angle = (int) Math.toDegrees(theta);

		/* if degree is smaller than 0, convert it */
		if (angle < 0) {
			angle += 360;
		}
		return angle;
	}

	/**
	 *
	 */
	static void swapStartAndGoal(Passenger passenger) {

		/* new helper vector stores the start */
		EPoint helper = EcoreUtil.copy(passenger.getStartPosition());

		/* swap goal and start position */
		passenger.setStartPosition(passenger.getGoalPosition());
		passenger.setGoalPosition(helper);
	}
}
