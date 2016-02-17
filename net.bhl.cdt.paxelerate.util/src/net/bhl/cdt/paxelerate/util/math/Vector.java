/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

/**
 * This class represents a vector consisting of 2 or 3 coordinates. 
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
	protected Vector(int x, int y) {
		xValue = x;
		yValue = y;
		dimensions = 2;
	}
	
	/**
	 * Instead of casting every Vector to (int) manually, this can be done automatically here.
	 * @param x the double x value <b>(will become int!)</b>
	 * @param y the double y value <b>(will become int!)</b>
	 */
	protected Vector(double x, double y) {
		xValue = (int) x;
		yValue = (int) y;
		dimensions = 2;
	}
	
	/**
	 * Instead of casting every Vector to (int) manually, this can be done automatically here.
	 * Additionally, the parameters are scaled automatically.
	 * @param x the double x value <b>(will become int!)</b>
	 * @param y the double y value <b>(will become int!)</b>
	 * @param scaling additionally, the entries are scaled!
	 */
	protected Vector(double x, double y, int scaling) {
		xValue = (int) (x / scaling);
		yValue = (int) (y / scaling);
		dimensions = 2;
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
	protected Vector(int x, int y, int z) {
		xValue = x;
		yValue = y;
		zValue = z;
		dimensions = 3;
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
	 * This method compares two vectors for the cost map generation. Do not use it for equality comparison!
	 * 
	 * @param vector the other vector
	 * @return returns the better better vector
	 */

	/**
	 * @Raoul: Die Methode compareTo() ist eine definierte Methode des interfaces "Comparable", was die Klasse Vector hier implementiert.
	 * Wie vergleichsweise in Core.java zu sehen, wird openList (SortedNodeList.java) verwendet, um die Nodes vorzusortieren. Hier ist Collections.sort(list)
	 * die entscheidende Funktion, die sich auf das Comparable bezieht. Hier werden Nodes sortiert, weswegen in Node.java auch eine compareTo ist.
	 * 
	 * Bei den Vectoren ist das ganze in der CostMap nötig, um die Erzeugung eben jener zu gewährleisten.
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
	
	/**
	 * This method compares two vectors for equality.
	 * 
	 * @param the object being compared to the node
	 * 
	 * @return vectors are equal or not
	 */
	public boolean equals(Vector vec) {
		return vec != null 
				&& dimensions == vec.getNumberOfDimensions() 
				&& xValue == vec.getX() 
				&& yValue == vec.getY()
				&& zValue == vec.getZ();
	}
}
