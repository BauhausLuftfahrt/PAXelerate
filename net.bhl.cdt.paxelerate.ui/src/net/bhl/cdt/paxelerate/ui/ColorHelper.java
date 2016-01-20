/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.ui;

import java.util.Random;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;

/**
 * Unified coloring system for Paxelerate
 * @author marc.engelmann, raoul.rothfeld
 */
public class ColorHelper {
	
	/**
	 * 
	 */
	private Device d;
		
	/**
	 * Paxelerate colors
	 * @author raoul.rothfeld
	 */
	public final Color 
			// General colors
			BLACK = new Color(d,0,0,0),
			DARK_GREY = new Color(d,51,51,51),
			LIGHT_GREY = new Color(d,193,193,193),
			RED = new Color(d,255,0,0),
			GREEN = new Color(d,0,255,0),
			LIGHT_GREEN = new Color(d,122,255,0),
			BLUE = new Color(d,0,0,255),
			YELLOW = new Color(d,255,255,0),
			ORANGE = new Color(d,255,122,0),
			WHITE = new Color(d,0,0,0),
			
			// Program colors
			ERROR = new Color(d,255,51,51),
			
			// Passenger colors
			MALE_PASSENGER = new Color(d,51,153,255),
			FEMALE_PASSENGER = new Color(d,255,153,255),
	
			// Luggage colors
			NO_LUGGAGE = new Color(d,127,112,99),
			SMALL_LUGGAGE = new Color(d,255,162,76),
			MEDIUM_LUGGAGE = new Color(d,204,97,0),
			LARGE_LUGGAGE = new Color(d,127,61,0),
	
			// Aircraft colors
			AIRCRAFT_FLOOR = new Color(d,237,243,245),
			AIRCRAFT_LAVATORY = new Color(d,255,160,122);
	
	/**
	 * 	
	 * @param display
	 */
	public ColorHelper(Device display) {
		this.d = display;
	}
	
	/**
	 * 
	 * @return
	 */
	public Color getRandomColor() {
		Random r = new Random();
		return new Color(d,r.nextInt(256),r.nextInt(256),r.nextInt(256));
	}
	
}
