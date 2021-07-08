/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.agent.action;

import com.paxelerate.core.simulation.agent.Agent;
import com.paxelerate.model.enums.State;

import net.bhl.opensource.toolbox.math.gaussian.Gaussian;
import net.bhl.opensource.toolbox.math.gaussian.Gaussian.Sigma;

/**
 * @author Michael.Schmidt, Marc.Engelmann
 *
 */
public interface UnfoldSeat {

	/**
	 *
	 * @param agent
	 * @param scale
	 * @param simSettings
	 * @param myself
	 */
	static void run(Agent agent) {

		// change influence area and state
		agent.blockArea(agent.getPassenger().getCurrentPosition(), false, false);
		agent.getPassenger().setState(State.UNFOLD_SEAT);
		agent.blockArea(agent.getPassenger().getCurrentPosition(), true, false);

		switch (agent.getPassenger().getSeat().getSeatType()) {

		case SIDEWAYS_FOLDABLE:
			UnfoldSeat.unfoldSeat(Gaussian.random(
					agent.getHandler().getSettings().getSidewaysFoldabeSeatPopupTimeMean(), Sigma.PERCENT_95,
					agent.getHandler().getSettings().getSidewaysFoldabeSeatPopupTimeDeviation()), agent);
			break;

		case LIFTING_SEAT_PAN:
			UnfoldSeat.unfoldSeat(Gaussian.random(agent.getHandler().getSettings().getLiftingSeatPanPopupTimeMean(),
					Sigma.PERCENT_95, agent.getHandler().getSettings().getLiftingSeatPanPopupTimeDeviation()), agent);
			break;

		case BRING_YOUR_OWN:
			break;

		case DEFAULT:
			break;

		default:
			break;
		}
	}

	/**
	 *
	 * @param unfoldTime
	 */
	static void unfoldSeat(double unfoldTime, Agent agent) {

		throw new IllegalArgumentException("not implemented!");

//		double scale = agent.getHandler().getSettings().getSimulationGridResolution();
//
//		Seat seat = agent.getPassenger().getSeat();
//		seat.setSeatType(SeatType.DEFAULT);
//
//		for (Layer layer : Node.Layer.values()) {
////			AddMonumentToMap.run((Monument) seat, layer, scale, agent.getHandler().getMap(),
////					agent.getHandler().getDeck());
//		}
//
////		int width = (int) (SeatExtensions.getSize(seat).getY() / scale);
////		int length = (int) (SeatExtensions.getSize(seat).getX() / scale);
////		int yPosition = (int) (SeatExtensions.getPosition(seat).getY() / scale);
////		int xPosition = (int) (SeatExtensions.getPosition(seat).getX() / scale);
////
////		for (int y = yPosition; y < yPosition + width; y++) {
////			for (int x = xPosition; x < xPosition + length; x++) {
////				agent.getHandler().getMap().get(y, x).setProperty(Property.OBJECT);
////			}
////		}
//
//		// Pauses the agent for the seat pop up time
//		try {
//			agent.getPassenger().setTotalTimeWaited(agent.getPassenger().getTotalTimeWaited() + agent.time(unfoldTime));
//			Thread.sleep(agent.time(unfoldTime));
//		} catch (InterruptedException e) {
//			// e.printStackTrace();
//			System.out.println("InterruptedException @ thread " + Thread.currentThread().getName());
//			Thread.currentThread().interrupt();
//		}
	}

}
