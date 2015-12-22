/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/

package net.bhl.cdt.paxelerate.util;

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

import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.Vector;

/**
 * This class is used for general calculations and methods.
 * 
 * @author marc.engelmann
 *
 */

public abstract class Func {

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

	public static int GetScreenWorkingWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	public static int GetScreenWorkingHeight() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}

	public static int roundToFive(int num) {
		int temp = num % 5;
		if (temp < 3)
			return num - temp;
		else
			return num + 5 - temp;
	}

	public static boolean PassengerIdAlreadyInList(int id, ArrayList<Integer> list) {
		for (int value : list) {
			if (value == id) {
				return true;
			}
		}
		return false;
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

	public static double round(double value, int places) {
		if (places < 0)
			throw new IllegalArgumentException();

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
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
}
