/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

/**
 * This class represents a stop watch.
 * 
 * @author marc.engelmann
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

	public void reset() {
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

	public double getElapsedTimeTens() {
		double value = getElapsedTime() / 1000.0;
		return FuncLib.round(value, 1);
	}

	/**
	 * This method returns the elapsed time in seconds.
	 * 
	 * @return the time in milliseconds
	 */
	public long getElapsedTimeSecs() {
		long elapsed;
		if (running) {
			elapsed = (int) ((System.currentTimeMillis() - startTime) / 1000);
		} else {
			elapsed = (int) ((stopTime - startTime) / 1000);
		}
		return elapsed;
	}
}
