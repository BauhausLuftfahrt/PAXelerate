/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

import java.awt.Color;

/**
 * This class represents a vector consisting of 2 coordinates. It is easily
 * possible to expand this vector to 3 coordinates. It can represent both a
 * specific point as well as lengths or other values with several dimensions.
 * RGB color codes are possible as well.
 * 
 * @author marc.engelmann
 * @version 1.0
 */
public class Vector implements Comparable<Vector> {
	private int dimensions;
	private int xValue;
	private int yValue;
	private int zValue;

	/**
	 * This method returns the number of dimensions that the vector has.
	 * 
	 * @return number of dimensions
	 */
	public int getNumberOfDimensions() {
		return dimensions;
	}

	/**
	 * This method constructs the two dimensional Vector object.
	 * 
	 * @param x
	 *            is the first value
	 * @param y
	 *            is the second value
	 */
	public Vector(int x, int y) {
		dimensions = 2;
		xValue = x;
		yValue = y;
	}

	/**
	 * This method constructs the three dimensional Vector object.
	 * 
	 * @param x
	 *            is the first value
	 * @param y
	 *            is the second value
	 * @param z
	 *            is the third value
	 */
	public Vector(int x, int y, int z) {
		dimensions = 3;
		xValue = x;
		yValue = y;
		zValue = z;
	}

	/**
	 * This method sets the vector values from integers.
	 * 
	 * @param x
	 *            is the first value
	 * @param y
	 *            is the second value
	 */
	public void setTwoDimensional(int x, int y) {
		if (dimensions == 2) {
			xValue = x;
			yValue = y;
		} else {
			System.out
					.println("Dimensions not matching! Use other set function!");
		}
	}

	/**
	 * This method sets the vector values from integers.
	 * 
	 * @param x
	 *            is the first value
	 * @param y
	 *            is the second value
	 * @param z
	 *            is the third value
	 */
	public void setThreeDimensional(int x, int y, int z) {
		if (dimensions == 3) {
			xValue = x;
			yValue = y;
			zValue = z;
		} else {
			System.out
					.println("Dimensions not matching! Use other set function!");
		}
	}

	/**
	 * This method sets the vector from an int[] if the dimension 2.
	 * 
	 * @param point
	 *            is the point that is submitted
	 */
	public void setFromPoint(int[] point) {
		if (point.length >= dimensions) {
			xValue = point[0];
			yValue = point[1];
		}
		if (point.length == 3) {
			zValue = point[2];
		}
	}

	/**
	 * This method generates a color out of the three values.
	 * 
	 * @return returns the Color
	 */
	public Color getTheColor() {
		return new Color(xValue, yValue, zValue);
	}

	/**
	 * This method returns the x value.
	 * 
	 * @return the x value
	 */
	public int getX() {
		return xValue;
	}

	/**
	 * This method sets the x value.
	 * 
	 * @param x
	 *            the x value
	 */
	public void setX(int x) {
		xValue = x;
	}

	/**
	 * This method returns the y value.
	 * 
	 * @return the y value
	 */
	public int getY() {
		return yValue;
	}

	/**
	 * This method sets the y value.
	 * 
	 * @param y
	 *            the y value
	 */
	public void setY(int y) {
		yValue = y;
	}

	/**
	 * This method returns the z Value.
	 * 
	 * @return the z value
	 */
	public int getZ() {
		return zValue;
	}

	/**
	 * This method sets the z value.
	 * 
	 * @param z
	 *            the z value
	 */
	public void setZ(int z) {
		yValue = z;
	}

	/**
	 * This method returns the vector in form of an int[] of the dimensions
	 * DIMENSIONS.
	 * 
	 * @return the value in int[DIMENSIONS] form
	 */
	public int[] getValue() {
		int[] value = new int[dimensions];
		value[0] = xValue;
		value[1] = yValue;
		if (dimensions == 3) {
			value[2] = zValue;
		}
		return value;
	}

	/**
	 * This method compares two nodes.
	 * 
	 * @param otherNode
	 *            the other node
	 * @return returns the better node value
	 */
	public int compareTo(Vector vector) {
		int BEFORE = -1;
		int EQUAL = 0;
		int AFTER = 1;
		if (zValue < vector.getZ()) {
			return BEFORE;
		} else if (zValue > vector.getZ()) {
			return AFTER;
		} else {
			 if (xValue > vector.getX()) {
			 return BEFORE;
			 } else if (xValue < vector.getX()) {
			 return AFTER;
			 } else {
			return EQUAL;
			 }
		}
	}
}
