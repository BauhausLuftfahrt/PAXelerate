/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.core.simulation.covid;

import java.util.HashMap;

import com.paxelerate.model.enums.State;

/**
 * Store a map of contact events (duration, distance) registered at specific
 * time steps.
 *
 * @author Marc.Engelmann
 * @since 08.07.2021
 *
 */
public class ContactTracingMap extends HashMap<Double, ContactTracingEvent> {

	private static final long serialVersionUID = 1L;

	ContactTracingMap(double timestamp, double duration, double distance, State state) {
		put(timestamp, new ContactTracingEvent(duration, distance, state));
	}

	void add(double timestamp, double duration, double distance, State state) {
		put(timestamp, new ContactTracingEvent(duration, distance, state));
	}

}
