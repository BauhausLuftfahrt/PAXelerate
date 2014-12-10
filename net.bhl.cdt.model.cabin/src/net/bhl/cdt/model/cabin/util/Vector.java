/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

/**
 * This class represents a vector consisting of 2 coordinates. It is easily
 * possible to expand this vector to 3 coordinates.
 * It can represent both a specific point as well as lengths or other values with several dimensions.
 * 
 * @author marc.engelmann
 * @version 1.0
 */
public class Vector {
	private static final int DIMENSIONS = 2;
	private int xValue;
	private int yValue;

	/**
	 * This method constructs the Vector object with zeros.
	 */
	public Vector() {
		xValue = 0;
		yValue = 0;

	}

	/**
	 * This method returns the number of dimensions that the vector has.
	 * 
	 * @return number of dimensions
	 */
	public int getNumberOfDimensions() {
		return DIMENSIONS;
	}

	/**
	 * This method constructs the Vector object.
	 * 
	 * @param x
	 *            is the first value
	 * @param y
	 *            is the second value
	 */
	public Vector(int x, int y) {
		xValue = x;
		yValue = y;
	}

	/**
	 * This method sets the vector values from integers.
	 * 
	 * @param x
	 *            is the first value
	 * @param y
	 *            is the second value
	 */
	public void set(int x, int y) {
		xValue = x;
		yValue = y;
	}

	/**
	 * This method sets the vector from an int[] if the dimension 2.
	 * 
	 * @param point
	 *            is the point that is submitted
	 */
	public void setFromPoint(int[] point) {
		if (point.length >= DIMENSIONS) {
			xValue = point[0];
			yValue = point[1];
		}
	}

	/**
	 * This method returns the x value.
	 * @return the x value
	 */
	public int getX() {
		return xValue;
	}
	
	public void setX(int x) {
		xValue = x;
	}

	/**
	 * This method returns the y value.
	 * @return the y value
	 */
	public int getY() {
		return yValue;
	}
	
	public void setY(int y)  {
	yValue = y;
	}

	/**
	 * This method returns the vector in form of an int[] of the dimensions DIMENSIONS. 
	 * @return the value in int[DIMENSIONS] form
	 */
	public int[] getValue() {
		int[] value = new int[DIMENSIONS];
		value[0] = xValue;
		value[1] = yValue;
		return value;
	}
}
