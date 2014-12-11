/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.astar;

/**
 * This class represents a stopwatch.
 * @author marc.engelmann
 * 
 *         originally created by Corey Goldberg StopWatch.java is free software;
 *         you can redistribute it and/or modify it under the terms of the GNU
 *         General Public License as published by the Free Software Foundation;
 *         either version 2 of the License, or (at your option) any later
 *         version.
 */

public class StopWatch {
	private long startTime;
	private long stopTime;
	private boolean running;

	/**
	 * This method constructs the StopWatch and initializes the parameters.
	 */
	public StopWatch() {
		startTime = 0;
		stopTime = 0;
		running = false;
	}

	/**
	 * This method starts the time stopping.
	 */
	public void start() {
		this.startTime = System.currentTimeMillis();
		this.running = true;
	}

	/**
	 * This method stops the time stopping.
	 */
	public void stop() {
		this.stopTime = System.currentTimeMillis();
		this.running = false;
	}

	/**
	 * This method returns the elapsed time in milliseconds.
	 * 
	 * @return the elapsed time in milliseconds
	 */
	public long getElapsedTime() {
		long elapsed;
		if (running) {
			elapsed = (System.currentTimeMillis() - startTime);
		} else {
			elapsed = (stopTime - startTime);
		}
		return elapsed;
	}

	/**
	 * This method returns the elapsed time in seconds.
	 * 
	 * @return the time in milliseconds
	 */
	public long getElapsedTimeSecs() {
		long elapsed;
		if (running) {
			elapsed = ((System.currentTimeMillis() - startTime) / 1000);
		} else {
			elapsed = ((stopTime - startTime) / 1000);
		}
		return elapsed;
	}
}
