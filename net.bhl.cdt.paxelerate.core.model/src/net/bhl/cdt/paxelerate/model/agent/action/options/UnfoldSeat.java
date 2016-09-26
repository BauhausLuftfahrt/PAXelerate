/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.action.options;

import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.Seat;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.action.AgentActionType;
import net.bhl.cdt.paxelerate.model.agent.enums.Property;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.astar.AStarHelper;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.GaussianRandom;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * @author michael.schmidt
 * @version 1.0
 * @since 0.8
 *
 */
public class UnfoldSeat extends AgentActionType {

	private SimulationProperties simSettings;
	private Passenger myself;

	public UnfoldSeat(Agent agent, int scale, SimulationProperties simSettings,
			Passenger myself) {
		super(agent, scale);
		this.simSettings = simSettings;
		this.myself = myself;
	}

	@Override
	public void performNextAction() {

		agent.setCurrentState(State.UNFOLDING_SEAT);

		/* Sideways foldable seat */
		if (myself.getSeat()
				.getLayoutConcept() == LayoutConcept.SIDWAYS_FOLDABLE_SEAT) {
			unfoldSeat(GaussianRandom.gaussianRandom(
					simSettings.getSidewaysFoldabeSeatPopupTimeMean(),
					GaussOptions.PERCENT_95,
					simSettings.getSidewaysFoldabeSeatPopupTimeDeviation()));

		/* Lifting seat pan */
		} else if (myself.getSeat()
				.getLayoutConcept() == LayoutConcept.LIFTING_SEAT_PAN_SEATS) {
			unfoldSeat(GaussianRandom.gaussianRandom(
					simSettings.getLiftingSeatPanPopupTimeMean(),
					GaussOptions.PERCENT_95,
					simSettings.getLiftingSeatPanPopupTimeDeviation()));
			
		} else if (myself.getSeat().getLayoutConcept() == LayoutConcept.BRING_YOUR_OWN_SEAT) {
			unfoldSeat(GaussianRandom.gaussianRandom(
					simSettings.getLiftingSeatPanPopupTimeMean(),
					GaussOptions.PERCENT_95,
					simSettings.getLiftingSeatPanPopupTimeDeviation()));		
		}

	}

	private void unfoldSeat(double d) {

		Seat seat = myself.getSeat();
		seat.setLayoutConcept(LayoutConcept.DEFAULT);

		int width = seat.getYDimension() / scale;
		int length = seat.getXDimension() / scale;
		int yPosition = seat.getYPosition() / scale;
		int xPosition = seat.getXPosition() / scale;

		if (simSettings.isDeveloperMode()) {
			System.out.println("Passenger " + myself.getId() + " unfolds Seat "
					+ seat.getName());
		}

		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				int k = yPosition + i;
				int l = xPosition + j;
				if (k < SimulationHandler.getMap().getDimensions().getY()
						&& l < SimulationHandler.getMap().getDimensions()
								.getX()) {
					SimulationHandler.getMap().get(l, k)
							.setProperty(Property.SEAT, null);//SEAT
				}
			}
		}
		

		/* Pauses the agent for the seat pop up time */
		try {
			agent.increaseTotalWaitingTime(AStarHelper.time(d));
			Thread.sleep(AStarHelper.time(d));
		} catch (InterruptedException e) {
			e.printStackTrace();
			Log.add(this,"InterruptedException @ thread "
					+ Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
	}

}
