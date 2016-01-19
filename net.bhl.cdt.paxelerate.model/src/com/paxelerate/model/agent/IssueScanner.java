/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.agent;

import java.util.HashMap;

import com.paxelerate.model.Passenger;
import com.paxelerate.model.agent.Agent.State;
import com.paxelerate.model.astar.SimulationHandler;
import com.paxelerate.model.observer.Subject;
import com.paxelerate.util.math.StopWatch;
import com.paxelerate.util.math.Vector3D;

public class IssueScanner extends Subject implements Runnable {

	private Thread thread;
	private StopWatch watch;
	private boolean init = true;

	private HashMap<Integer, Vector3D> positionTracker = new HashMap<Integer, Vector3D>();

	@Override
	public void run() {

		watch = new StopWatch();
		watch.start();

		updateMap();

		while (true) {
			try {
				for (Passenger pax : SimulationHandler.getCabin()
						.getPassengers()) {
					Agent agent = (SimulationHandler.getAgentByPassenger(pax));
					if (agent.getCurrentState() != State.QUEUEING_UP) {
						if (agent.didMoveOnce()) {
							checkMovement(pax);
						}
					}
				}

				System.out.println("~~~~~~~~~~~~~~~~~~~~");
				updateMap();

				Thread.sleep(200);
			} catch (InterruptedException e) {

			}
		}
	}

	private void checkMovement(Passenger pax) {
		Vector3D data = positionTracker.get(pax.getId());
		if (noMovementDetected(pax)) {
			if (Math.abs(watch.getElapsedTimeSecs() - data.getZ()) > 5) {
				System.out.println(pax.getId() + " NOT MOVING! Time: "
						+ data.getZ());
			}
		}
	}

	private boolean noMovementDetected(Passenger pax) {
		Vector3D data = positionTracker.get(pax.getId());
		return (pax.getPositionX() == data.getX() && pax.getPositionY() == data
				.getY());
	}

	private void updateMap() {
		for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
			int time = (int) watch.getElapsedTimeSecs();

			if (!init) {
				if (noMovementDetected(pax)) {
					time = positionTracker.get(pax.getId()).getZ();
				}
			}
			positionTracker.put(
					pax.getId(),
					new Vector3D((int) pax.getPositionX(), (int) pax
							.getPositionY(), time));
		}
		init = false;
	}

	/**
	 * This method starts the agent.
	 */
	public void start() {
		if (getThread() == null) {
			setThread(new Thread(this, "Scanner"));
			getThread().start();
		}
	}

	/**
	 * This method returns the thread.
	 * 
	 * @return the thread
	 */
	public Thread getThread() {
		return thread;
	}

	/**
	 * This method sets the thread.
	 * 
	 * @param thread
	 *            the thread
	 */
	public void setThread(Thread thread) {
		this.thread = thread;
	}

}
