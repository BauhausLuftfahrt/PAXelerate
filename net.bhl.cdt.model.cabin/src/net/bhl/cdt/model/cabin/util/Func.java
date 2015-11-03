/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.model.cabin.util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import net.bhl.cdt.model.astar.SimulationHandler;
import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.PropertyViewPart;

/**
 * This class is used for general calculations and methods.
 * 
 * @author marc.engelmann
 *
 */

public abstract class Func {

	public static CabinViewPart getCabinView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");
	}

	public static int getLineNumber() {
		return Thread.currentThread().getStackTrace()[2].getLineNumber();
	}

	/**
	 * This method checks whether the two input vectors are equal
	 * 
	 * @param v1
	 *            is the first vector
	 * @param v2
	 *            is the second vector
	 * @return returns if the vectors are equal or not
	 */
	public static boolean vectorsAreEqual(Vector v1, Vector v2) {
		if (v1.getX() == v2.getX() && v1.getY() == v2.getY()) {
			if (v1.getNumberOfDimensions() == v2.getNumberOfDimensions()) {
				if (v1.getNumberOfDimensions() == 2) {
					return true;
				} else if (v1.getNumberOfDimensions() == 3) {
					if (v1.getZ() == v2.getZ()) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void centreWindow(Shell frame) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - frame.getSize().x) / 2);
		int y = (int) ((dimension.getHeight() - frame.getSize().y) / 2);
		frame.setLocation(x, y);
	}

	/**
	 * Check if a string is numeric or not.
	 * 
	 * @param str
	 *            the string
	 * @return yes or no
	 */
	public static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				if (!String.valueOf(c).equals("-")) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * This method transforms the time for use in "Thread.sleep()" according to
	 * the speed factor. CAUTION! Time input in seconds only!
	 * 
	 * @param timeInSeconds
	 *            time in seconds
	 * @return transformed time in milliseconds
	 */
	public static long time(double timeInSeconds) {
		double value = timeInSeconds
				* 1000.0
				/ SimulationHandler.getCabin().getSimulationSettings()
						.getSimulationSpeedFactor();
		if (value < 1) {
			value = 1;
		}
		return (long) value;
	}

	public static int size(double size) {
		try {
			return (int) (size / SimulationHandler.getCabin().getScale());
		} catch (NullPointerException e) {
			return (int) (size / getCabinView().getCabin().getScale());
		}
	}

	public static int GetScreenWorkingWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getMaximumWindowBounds().width;
	}

	public static int GetScreenWorkingHeight() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment()
				.getMaximumWindowBounds().height;
	}

	/**
	 * Check if there are two of the same characters directly after each other,
	 * like in <i>balloon</i>.
	 * 
	 * @param str
	 *            the string
	 * @return a character is repeating
	 */
	public static boolean checkForDoubleCharacter(String str) {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				return true;
			}
		}
		return false;
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

	public static String getCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}

	public static int roundToFive(int num) {
		int temp = num % 5;
		if (temp < 3)
			return num - temp;
		else
			return num + 5 - temp;
	}

	public static boolean lowestValueInHashMap(Passenger pax,
			HashMap<Passenger, Integer> hashmap) {
		int lowestValue = Integer.MAX_VALUE;
		Passenger lowestPax = null;
		for (Entry<Passenger, Integer> entry : hashmap.entrySet()) {
			if (lowestValue > entry.getValue()) {
				lowestValue = entry.getValue();
				lowestPax = entry.getKey();
			}
		}

		if (pax.getId() == lowestPax.getId()) {
			return true;
		} else {
			return false;
		}
	}

	public static void printHashMap(HashMap<Passenger, Integer> accessPending) {
		int i = 1;
		for (Entry<Passenger, Integer> entry : accessPending.entrySet()) {
			System.out.println("#" + i + " Pax: " + entry.getKey().getId()
					+ " Time: " + entry.getValue());
			i++;
		}
		System.out.println();
	}

	public synchronized static boolean PassengerAlreadyInList(Passenger pax,
			ArrayList<Passenger> list) {
		if (list != null) {
			for (Passenger pass : list) {
				if (pass.getId() == pax.getId()) {
					return true;
				}
			}
		}
		return false;
	}

	public static boolean PassengerIdAlreadyInList(int id,
			ArrayList<Integer> list) {
		for (int value : list) {
			if (value == id) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Note that the 2 integer values have the following meanings: first integer
	 * is the lower bound, second integer is the upper bound. The upper bound is
	 * never reached! Result is part of: [l,u[
	 * 
	 * 
	 * @param lowerBound
	 *            defines the lower end of the random number.
	 * @param upperBound
	 *            defines the upper bound. <b><i>Note that the upper bound
	 *            itself is never reached!</i></b>
	 * @return returns the random double generated from the parameters above.
	 */
	public static int randomValue(int lowerBound, int upperBound) {
		Random rand = new Random();
		return (rand.nextInt(upperBound - lowerBound) + lowerBound);
	}

	/**
	 * Use this function to generate a value according to gaussian normal
	 * distribution.
	 * 
	 * @param average
	 *            is the average value of the distribution
	 * @param gauss
	 *            is the option you want to choose.
	 * @param deviation
	 *            is the deviation at the chosen option.
	 * @return
	 */
	public static double gaussianRandom(double average, GaussOptions gauss,
			double deviation) {
		Random rand = new Random();
		double result = (rand.nextGaussian() * (deviation / gauss.sigma) + average);
		if (result < 0) {
			return 0;
		}
		return result;
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

	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
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
			System.out.println();
			System.out.println();
		}
	}

	public static void printIntegerListToLog(ArrayList<Integer> list) {
		for (Integer object : list) {
			System.out.print(object);
			if (!object.equals(list.get(list.size() - 1))) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println();
	}

	/**
	 * This method prints a vector to the log.
	 * 
	 * @param vector
	 *            is the vector
	 * @param name
	 *            that should be displayed in the log
	 */
	public static void printVectorToLog(Vector vector, String name) {
		if (vector.getNumberOfDimensions() == 3) {
			System.out.println(name + "\t->\tx: " + vector.getX() + "\ty: "
					+ vector.getY() + "\tz: " + vector.getZ());
		} else {
			System.out.println(name + "\t->\tx: " + vector.getX() + "\ty: "
					+ vector.getY());
		}
		System.out.println();
	}

	public static boolean rectangular(double rot) {
		if (rot == 0) {
			return true;
		}
		if (rot % 90 == 0) {
			return true;
		}
		return false;
	}

	/**
	 * This method prints a list consisting of vectors to the log.
	 * 
	 * @param list
	 *            is the specific list.
	 */
	public static void printVectorListToLog(ArrayList<Vector> list) {
		int i = 1;
		for (Vector vector : list) {
			System.out.println("#" + i + " -> x: " + vector.getX() + ", y: "
					+ vector.getY() + ", z: " + vector.getZ());
			i++;
		}
		System.out.println("#########################################");
	}

	public static void printArray(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] != 0) {
					System.out.print(array[i][j]);
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public enum GaussOptions {

		PERCENT_99(2.576), PERCENT_95(1.960), PERCENT_90(1.645), PERCENT_50(
				0.675);

		private final double sigma;

		GaussOptions(double sigma) {
			this.sigma = sigma;
		}

		public double sigma() {
			return sigma;
		}
	}

	public static String transformToTimeString(double timeInSeconds) {

		int hours = (int) (timeInSeconds / 3600);
		int minutes = (int) (timeInSeconds / 60) - hours * 60;
		int seconds = (int) (timeInSeconds % 60);

		String hoursAppend = "";
		String minutesAppend = "";
		String secondsAppend = "";

		if (hours < 10) {
			hoursAppend = "0";
		}
		if (minutes < 10) {
			minutesAppend = "0";
		}
		if (seconds < 10) {
			secondsAppend = "0";
		}

		return new String(hoursAppend + hours + ":" + minutesAppend + minutes
				+ ":" + secondsAppend + seconds);
	}

	public static void main(String[] args) {
		System.out.println(transformToTimeString(3471.6));
	}

	public static RGB hex2Rgb(String colorStr) {
		return new RGB(Integer.valueOf(colorStr.substring(1, 3), 16),
				Integer.valueOf(colorStr.substring(3, 5), 16), Integer.valueOf(
						colorStr.substring(5, 7), 16));
	}

	public static PropertyViewPart getPropertyView() {
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();
		return (PropertyViewPart) page.findView("com.paxelerate.propertyview");
	}
}
