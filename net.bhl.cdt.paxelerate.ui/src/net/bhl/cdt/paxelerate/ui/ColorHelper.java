/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.ui;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.RGB;

import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector3D;

/**
 * Unified coloring system for Paxelerate
 * @author marc.engelmann, raoul.rothfeld
 */
public class ColorHelper {
	
	/**
	 * 
	 */
	private Device display;
	
	/**
	 * Paxelerate colors
	 * @author raoul.rothfeld
	 */
	public final Color 
			// General colors
			BLACK = new Color(display,0,0,0),
			DARK_GREY = new Color(display,51,51,51),
			LIGHT_GREY = new Color(display,193,193,193),
			
			// Program colors
			ERROR = new Color(display,255,0,0),
			
			// Passenger colors
			MALE_PASSENGER = new Color(display,51,153,255),
			FEMALE_PASSENGER = new Color(display,255,153,255),
	
			// Luggage colors
			NO_LUGGAGE = new Color(display,127,112,99),
			SMALL_LUGGAGE = new Color(display,255,162,76),
			MEDIUM_LUGGAGE = new Color(display,204,97,0),
			LARGE_LUGGAGE = new Color(display,127,61,0);
	
	/**
	 * 	
	 * @param display
	 */
	public ColorHelper(Device display) {
		this.display = display;
	}
	
	/**
	 * This method calculates the color of the passenger and seat. It is
	 * calculated by a formula and the passenger id.
	 * 
	 * @param pax
	 *            the passenger
	 * @return the color code represented by a three dimensional vector
	 */
	@Deprecated
	public static Vector calculateColor(int value) {
		int randInt = value % 6;
		int colorDefine = (value % 13) * 20 + 15;
		switch (randInt) {
		case 0:
			return new Vector3D(255, 0, colorDefine);
		case 1:
			return new Vector3D(255, colorDefine, 0);
		case 2:
			return new Vector3D(0, 255, colorDefine);
		case 3:
			return new Vector3D(colorDefine, 255, 0);
		case 4:
			return new Vector3D(0, colorDefine, 255);
		case 5:
			return new Vector3D(colorDefine, 0, 255);
		default:
			return new Vector3D(255, 255, 255);
		}
	}

	@Deprecated
	public static RGB hex2Rgb(String colorStr) {
		return new RGB(Integer.valueOf(colorStr.substring(1, 3), 16), Integer.valueOf(colorStr.substring(3, 5), 16),
				Integer.valueOf(colorStr.substring(5, 7), 16));
	}
}
