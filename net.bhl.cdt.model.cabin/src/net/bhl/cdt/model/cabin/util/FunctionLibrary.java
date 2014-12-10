/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.cabin.util;

import java.util.ArrayList;


/**
 * This class is used for general caluclations and methods.
 * @author marc.engelmann
 * @version 0.1
 *
 */


public final class FunctionLibrary {
	
	private FunctionLibrary() {
		
	}
	
	/**
	 * This method splits camel case strings into normal strings with spaces.
	 * @param s is the string that should be transformed.
	 * @return returns the transformed string
	 */
	public static String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s",
				"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	/**
	 * This method transforms 2 coordinates to a point.
	 * 
	 * @param xLocation
	 *            is the x location
	 * @param yLocation
	 *            is the y location
	 * @return returns the point
	 */
	public static int[] transformCoordinatesToPoint(int xLocation, int yLocation) {
		int[] point = new int[2];
		point[0] = xLocation;
		point[1] = yLocation;
		return point;
	}
	
	/**
	 * This method prints an array list to the log.
	 * @param list is the list
	 */
	public static void printListToLog(ArrayList <Object> list) {
		for(Object object:list) {
			System.out.println(object);
		}
	}
}
