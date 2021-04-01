/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.sim.agent.action;

import com.paxelerate.core.sim.agent.Agent;
import com.paxelerate.core.sim.agent.PathFinder;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.State;

/**
 * Handles the agent behavior in case of collision depending on the mood.
 *
 * @author Marc.Engelmann, Michael.Schmidt
 * @since 11.12.2019
 *
 */
public interface Collision {

	/**
	 *
	 * @param agent
	 */
	static void pass(Agent agent) {

		if (!agent.isOvertakingBlocked()) {

			// only pass other passenger, if they stow luggage or unfold a seat
			State blockingAgentState = agent.getBlocker().getState();
			if (blockingAgentState == State.STOW_LUGGAGE || blockingAgentState == State.UNFOLD_SEAT) {

				// Calculate new path around blocking agent
				PathFinder pathfinder = new PathFinder(agent);
				pathfinder.start();

				while (agent.isCurrentlySearchingForPath()) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				// abort if agent is not blocked anymore
				if (!agent.isOvertakingBlocked()) {
					agent.setExitPathLoop(true);
				}
			}
		}
	}

	static void run(Agent agent) {

		Passenger passenger = agent.getPassenger();

		// avoid useless unblocking and blocking of the same area
		boolean changeArea;
		if (passenger.getState() == State.QUEUE_UP) {
			changeArea = false;
		} else {
			changeArea = true;
		}

		// change state
		passenger.setState(State.QUEUE_UP);

		// change influence area
		if (changeArea) {
			agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
			agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);
		}

		// raise the interrupts counter of the agent and occupied Node up by one
		passenger.setNumberOfWaits(passenger.getNumberOfWaits() + 1);

		// Perform action depending on passenger mood
		switch (passenger.getPassengerMood()) {

		case AGGRESSIVE:
			Collision.pass(agent);
			break;

		case PASSIVE:
			Collision.wait(agent);
			break;
		}

		passenger.setTotalTimeWaited(passenger.getTotalTimeWaited() + (long) agent.getWaitingTimeAfterCollision());
	}

	/**
	 *
	 * @param agent
	 */
	static void wait(Agent agent) {

		try {
			// agent waits for specific time before he continues walking
			Thread.sleep(agent.time(agent.getWaitingTimeAfterCollision()));
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}
		agent.setExitPathLoop(false);
	}
}
