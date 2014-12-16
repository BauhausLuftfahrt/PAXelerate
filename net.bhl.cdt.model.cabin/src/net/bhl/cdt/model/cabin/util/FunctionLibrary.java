/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.cabin.util;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class is used for general calculations and methods.
 * 
 * @author marc.engelmann
 * @version 0.1
 *
 */

public final class FunctionLibrary {

	private FunctionLibrary() {

	}

	/**
	 * This method splits camel case strings into normal strings with spaces.
	 * 
	 * @param s
	 *            is the string that should be transformed.
	 * @return returns the transformed string
	 */
	public static String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s",
				"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	/**
	 * This method generates a random value.
	 * 
	 * @param lowerBound
	 *            defines the lower end of the random number.
	 * @param upperBound
	 *            defines the upper bound. <b><i>Note that the upper bound itself is
	 *            never reached!</i></b>
	 * @return returns the random double generated from the parameters above.
	 */
	public static double randomValue(int lowerBound, int upperBound) {
		Random rand = new Random();
		return (rand.nextInt(upperBound-lowerBound) + lowerBound);
	}

	/**
	 * This method returns a letter for a integer in the alphabet.
	 * 
	 * @param i
	 *            the integer
	 * @return the letter which represents the number.
	 */
	public static String getCharForNumber(int i) {
		return i > 0 && i < 27 ? String.valueOf((char) (i + 'A' - 1)) : null;
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
	 * This method generates a unique random number for a specific list.
	 * 
	 * @param list
	 *            is the array list that is checked for uniqueness
	 * @param lowerBound
	 *            is the lower bound of the integer
	 * @param range
	 *            is the range of the integer <b><i>Note that the upper bound
	 *            itself is never reached!</i></b>
	 * @return returns a random value
	 */
	public static int uniqueRandom(ArrayList<Integer> list, int lowerBound,
			int range) {
		boolean checkUniqueness = false;
		Random rand = new Random();
		int randomValue = 0;
		while (!checkUniqueness) {
			randomValue = rand.nextInt(range) + lowerBound;
			if (!list.contains(randomValue)) {
				list.add(randomValue);
				checkUniqueness = true;
			}
		}
		return randomValue;
	}

	/**
	 * This method prints an array list to the log.
	 * 
	 * @param list
	 *            is the list
	 */
	public static void printListToLog(ArrayList<Object> list) {
		for (Object object : list) {
			System.out.println(object);
		}
	}
}
