/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package com.paxelerate.util.math;

/**
 * This class represents a vector consisting of 2 coordinates. It is easily
 * possible to expand this vector to 3 coordinates. It can represent both a
 * specific point as well as lengths or other values with several dimensions.
 * RGB color codes are possible as well.
 * 
 * @author marc.engelmann
 * @version 1.0
 */
public abstract class Vector implements Comparable<Vector> {

	protected int dimensions, xValue, yValue, zValue;

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
		xValue = x;
		yValue = y;
		zValue = z;
	}

	/**
	 * This method returns the x value.
	 * 
	 * @return the x value
	 */
	public synchronized int getX() {
		return xValue;
	}

	/**
	 * This method sets the x value.
	 * 
	 * @param x
	 *            the x value
	 */
	public synchronized void setX(int x) {
		xValue = x;
	}

	/**
	 * This method returns the y value.
	 * 
	 * @return the y value
	 */
	public synchronized int getY() {
		return yValue;
	}

	/**
	 * This method sets the y value.
	 * 
	 * @param y
	 *            the y value
	 */
	public synchronized void setY(int y) {
		yValue = y;
	}

	/**
	 * This method returns the z Value.
	 * 
	 * @return the z value
	 */
	public synchronized int getZ() {
		return zValue;
	}

	/**
	 * This method sets the z value.
	 * 
	 * @param z
	 *            the z value
	 */
	public synchronized void setZ(int z) {
		yValue = z;
	}

	/**
	 * This method compares two nodes.
	 * 
	 * @param otherNode
	 *            the other node
	 * @return returns the better node value
	 */
	public int compareTo(Vector vector) {
		int better = -1;
		int equal = 0;
		int worse = 1;
		if (zValue < vector.getZ()) {
			return better;
		} else if (zValue > vector.getZ()) {
			return worse;
		} else {
			if (yValue < vector.getY()) {
				return better;
			} else if (yValue > vector.getY()) {
				return worse;
			} else {
				if (xValue < vector.getX()) {
					return better;
				} else if (xValue > vector.getX()) {
					return worse;
				} else {
					return equal;
				}
			}
		}
	}
}
