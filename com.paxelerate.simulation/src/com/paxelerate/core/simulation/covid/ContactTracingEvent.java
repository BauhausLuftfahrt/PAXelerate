/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.covid;

import com.paxelerate.model.enums.State;

/**
 *
 * Store the duration and distance of a specific contact event.
 *
 * @author Marc.Engelmann
 * @since 08.07.2021
 *
 */
public class ContactTracingEvent {

	private double distance = 0;
	private double duration = 0;
	private State myState = null;
	private State contactState = null;

	/**
	 * @param duration
	 * @param distance
	 * @param state
	 */
	public ContactTracingEvent(double duration, double distance, State myState, State contactState) {

		this.distance = distance;
		this.duration = duration;
		this.myState = contactState;
		this.contactState = myState;

	}

	/**
	 * @return
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * @return
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @return
	 */
	public State getMyState() {
		return myState;
	}

	/**
	 * @return
	 */
	public State getContactState() {
		return contactState;
	}

}
