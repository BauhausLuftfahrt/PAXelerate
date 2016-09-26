/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.model.agent;

import java.util.HashMap;

import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.agent.enums.State;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.model.observer.Subject;
import net.bhl.cdt.paxelerate.util.math.Vector3D;
import net.bhl.cdt.paxelerate.util.time.StopWatch;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class IssueScanner.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */

// TODO: IS THIS USED?
@Deprecated
public class IssueScanner extends Subject implements Runnable {

	/** The thread. */
	private Thread thread;

	/** The watch. */
	private StopWatch watch;

	/** The init. */
	private boolean init = true;

	/** The position tracker. */
	private HashMap<Integer, Vector3D> positionTracker = new HashMap<Integer, Vector3D>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
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
				e.printStackTrace();
				Log.add(this, "Issue scanner: InterruptedException @ thread "
						+ Thread.currentThread().getName());
				Thread.currentThread().interrupt();
			}
		}
	}

	/**
	 * Check movement.
	 *
	 * @param pax
	 *            the pax
	 */
	private void checkMovement(Passenger pax) {
		Vector3D data = positionTracker.get(pax.getId());
		if (noMovementDetected(pax)) {
			if (Math.abs(watch.getElapsedTimeSecs() - data.getZ()) > 5) {
				System.out.println(
						pax.getId() + " NOT MOVING! Time: " + data.getZ());
			}
		}
	}

	/**
	 * No movement detected.
	 *
	 * @param pax
	 *            the pax
	 * @return true, if successful
	 */
	private boolean noMovementDetected(Passenger pax) {
		Vector3D data = positionTracker.get(pax.getId());
		return (pax.getPositionX() == data.getX()
				&& pax.getPositionY() == data.getY());
	}

	/**
	 * Update map.
	 */
	private void updateMap() {
		for (Passenger pax : SimulationHandler.getCabin().getPassengers()) {
			int time = (int) watch.getElapsedTimeSecs();

			if (!init) {
				if (noMovementDetected(pax)) {
					time = positionTracker.get(pax.getId()).getZ();
				}
			}
			positionTracker.put(pax.getId(), new Vector3D(
					(int) pax.getPositionX(), (int) pax.getPositionY(), time));
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
