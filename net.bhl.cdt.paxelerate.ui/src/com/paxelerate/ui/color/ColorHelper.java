/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package com.paxelerate.ui.color;

import java.util.Random;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.widgets.Display;

/**
 * Unified coloring system for Paxelerate
 * 
 * @author marc.engelmann, raoul.rothfeld
 */
public class ColorHelper {

	/**
	 * The color displaying device/component
	 */
	private static final Device d = Display.getCurrent();

	/**
	 * All Paxelerate colors
	 */
	public static final Color
			// General colors
			BLACK = new Color(d, 0, 0, 0),
			GREY_DARK = new Color(d, 51, 51, 51),
			GREY_LIGHT = new Color(d, 193, 193, 193),
			RED = new Color(d, 255, 0, 0),
			ORANGE = new Color(d, 255, 122, 0),
			YELLOW = new Color(d, 255, 255, 0),
			GREEN = new Color(d, 0, 255, 0),
			GREEN_LIGHT = new Color(d, 122, 255, 0),
			BLUE = new Color(d, 0, 0, 255),
			WHITE = new Color(d, 0, 0, 0),

			// Program colors
			ERROR = new Color(d, 255, 51, 51),

			// Passenger colors
			PASSENGER_MALE = new Color(d, 51, 153, 255),
			PASSENGER_FEMALE = new Color(d, 255, 153, 255),

			// Luggage colors
			LUGGAGE_NONE = new Color(d, 127, 112, 99),
			LUGGAGE_SMALL = new Color(d, 255, 162, 76),
			LUGGAGE_MEDIUM = new Color(d, 204, 97, 0),
			LUGGAGE_LARGE = new Color(d, 127, 61, 0),

			// Aircraft colors
			AIRCRAFT_FLOOR = new Color(d, 237, 243, 245),
			AIRCRAFT_LAVATORY = new Color(d, 255, 160, 122);

	/**
	 * Singleton constructor for a ColorHelper instance
	 */
	private ColorHelper() {
	}

	/**
	 * Returns a random color
	 * 
	 * @return the random color
	 */
	public static Color getRandomColor() {
		Random r = new Random();
		return new Color(d, r.nextInt(256), r.nextInt(256), r.nextInt(256));
	}

}
