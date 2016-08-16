/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.model.util;

import net.bhl.cdt.paxelerate.util.math.Vector;
import net.bhl.cdt.paxelerate.util.math.Vector2D;

/**
 * This class is used to rotate an array or part of an array.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */
public class Rotator {

	/**
	 * Round index to point.
	 *
	 * @param index the index
	 * @param radius the radius
	 * @return the vector
	 */
	private static Vector RoundIndexToPoint(int index, int radius) {
		if (radius == 0)
			return new Vector2D(0, 0);
		Vector2D result = new Vector2D(-radius, -radius);

		while (index < 0) {
			index = index + radius * 8;
		}
		index = index % (radius * 8);

		int edgeLen = radius * 2;

		if (index < edgeLen) {
			result.setX(result.getX() + index);
		} else if ((index -= edgeLen) < edgeLen) {
			result.setX(radius);
			result.setY(result.getY() + index);
		} else if ((index -= edgeLen) < edgeLen) {
			result.setX(radius - index);
			result.setY(radius);
		} else if ((index -= edgeLen) < edgeLen) {
			result.setY(radius - index);
		}

		return result;
	}

	// private static int[][] removeEmptyRows(int[][] array) {
	// ArrayList<Integer> storageX = new ArrayList<Integer>();
	// for (int x = 0; x < array.length; x++) {
	// boolean onlyZeros = true;
	// int xStor = 0;
	// forloop: for (int y = 0; y < array[0].length; y++) {
	// if (array[x][y] != 0) {
	// onlyZeros = false;
	//
	// break forloop;
	// }
	//
	// }
	// if (onlyZeros) {
	// xStor = x;
	// storageX.add(xStor);
	// }
	// }
	//
	// ArrayList<Integer> storageY = new ArrayList<Integer>();
	// for (int y = 0; y < array[0].length; y++) {
	// boolean onlyZeros = true;
	// int yStor = 0;
	// forloop: for (int x = 0; x < array.length; x++) {
	// if (array[x][y] != 0) {
	// onlyZeros = false;
	// break forloop;
	// }
	// }
	// if (onlyZeros) {
	// yStor = y;
	// storageY.add(yStor);
	// }
	// }
	//
	// Func.printIntegerListToLog(storageX);
	// Func.printIntegerListToLog(storageY);
	//
	// int[][] newArray = new int[array.length -
	// storageX.size()][array[0].length
	// - storageY.size()];
	//
	// System.out.println("xDim: " + newArray.length);
	// System.out.println("yDim: " + newArray[0].length);
	//
	// System.out.println("xStorage: " + storageX.size());
	// System.out.println("yStorage: " + storageY.size());
	//
	// System.out.println();
	//
	// for (int x = 0, a = 0; x < newArray.length; x++, a++) {
	// for (int y = 0, b = 0; y < newArray[0].length; y++, b++) {
	// if (containsValue(storageX, x)) {
	// b++;
	// break;
	//
	// // TODO: falscher Ausschnitt wird geladen.
	// }
	// newArray[x][y] = array[a][b];
	// }
	// }
	//
	// return newArray;
	// }
	//
	// private static boolean containsValue(ArrayList<Integer> list, int value)
	// {
	// for (int a : list) {
	// if (a == value) {
	// return true;
	// }
	// }
	// return false;
	// }

	/**
	 * Rotate45.
	 *
	 * @param array the array
	 * @return the int[][]
	 */
	private static int[][] rotate45(int[][] array) {

		int dim = Math.max(array[0].length, array.length);

		if (dim % 2 == 0) {
			dim += 1;
		}

		int[][] result = new int[dim][dim];

		Vector center = new Vector2D((result.length - 1) / 2,
				(result[1].length - 1) / 2);
		Vector center2 = new Vector2D((array.length - 1) / 2,
				(array[1].length - 1) / 2);
		for (int r = 0; r <= (dim - 1) / 2; r++) {
			for (int i = 0; i <= r * 8; i++) {

				Vector source = RoundIndexToPoint(i, r);
				Vector target = RoundIndexToPoint(i + r, r);

				if (!((center2.getX() + source.getX()) < 0
						|| (center2.getY() + source.getY()) < 0
						|| (center2.getX() + source.getX()) >= array.length || (center2
						.getY() + source.getY()) >= array[1].length)) {
					result[center.getX() + target.getX()][center.getY()
							+ target.getY()] = array[center2.getX()
							+ source.getX()][center2.getY() + source.getY()];
				}
			}
		}

		return result;
	}

	/**
	 * Rotate.
	 *
	 * @param degrees the degrees
	 * @param array the array
	 * @return the int[][]
	 */
	public static int[][] rotate(int degrees, int[][] array) {
		if (degrees == 0 || degrees % 45 != 0) {
			return null;
		}
		for (int i = 0; i < (degrees / 45); i++) {
			array = rotate45(array);
		}
		return array;
	}
}
