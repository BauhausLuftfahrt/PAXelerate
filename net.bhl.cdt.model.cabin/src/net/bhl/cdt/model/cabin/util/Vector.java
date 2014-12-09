/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

/**
 * This class represents a point consisting of 2 coordinates. It is easily
 * possible to expand this vector to 3 coordinates.
 * 
 * @author marc.engelmann
 * @version 1.0
 *
 */
public class Vector {
	private static final int DIMENSIONS = 2;
	private int xValue;
	private int yValue;

	/**
	 * 
	 * @param x
	 * @param y
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

	public void setVectorFromCoordinates(int x, int y) {
		xValue = x;
		yValue = y;
	}

	public void setVectorFromPoint(int[] point) {
		xValue = point[0];
		yValue = point[1];
	}

	public int getX() {
		return xValue;
	}

	public int getY() {
		return yValue;
	}

	public int[] getValue() {
		int[] value = new int[2];
		value[0] = xValue;
		value[1] = yValue;
		return value;
	}
}
