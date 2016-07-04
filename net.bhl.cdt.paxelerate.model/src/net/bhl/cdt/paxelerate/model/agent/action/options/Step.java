/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent.action.options;

import java.util.ConcurrentModificationException;

import org.eclipse.swt.SWTException;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.Agent;
import net.bhl.cdt.paxelerate.model.agent.AgentFunctions;
import net.bhl.cdt.paxelerate.model.agent.action.AgentActionType;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.util.math.MathHelper;

/**
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.8
 *
 */
public class Step extends AgentActionType {

	public Step(Agent agent, int scale) {
		super(agent, scale);
	}

	@Override
	public void performNextAction() {

		Passenger passenger = agent.getPassenger();

		agent.setCurrentState(State.FOLLOWING_PATH);

		/*
		 * Go one step ahead. Do this by unblocking the current position and
		 * blocking the next position.
		 */
		agent.occupyOneStepAhead();

		if (agent.getCurrentPosition().getX() != 0
				&& agent.getCurrentPosition().getY() != 0
				&& agent.getCurrentPosition().getX() != 0
				&& agent.getCurrentPosition().getY() != 0) {

			/* update the walked distance */
			passenger.setDistanceWalked(passenger.getDistanceWalked()
					+ (int) (MathHelper.distanceBetween(
							agent.getDesiredPosition(),
							agent.getCurrentPosition()) * scale));
		}

		/* notify next step */
		agent.setLastMoveTime(System.currentTimeMillis());

		/* try to submit the properties back to the passenger */
		try {

			/* submit the agents position */
			passenger.setPositionX(agent.getDesiredPosition().getX() * scale);
			passenger.setPositionY(agent.getDesiredPosition().getY() * scale);

			/* submit the agents orientation */
			passenger.setOrientationInDegree(AgentFunctions.getRotation(agent));

			/* catch possible errors */
		} catch (ConcurrentModificationException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		} catch (SWTException swt) {
			swt.printStackTrace();
		}

	}

}
