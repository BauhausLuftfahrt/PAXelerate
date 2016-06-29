/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

/**
 * The Class MathHelper.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 * 
 */
public abstract class MathHelper {

	/**
	 * This method calculates the Pythagoras distance between two vectors.
	 *
	 * @param vector1
	 *            the vector1
	 * @param vector2
	 *            the vector2
	 * @return the distance between the nodes
	 */
	public static double distanceBetween(Vector vector1, Vector vector2) {

		/* define the first element of the square root function */
		double first = Math.pow(vector2.getX() - vector1.getX(), 2);

		/* define the second element of the square root function */
		double second = Math.pow(vector2.getY() - vector1.getY(), 2);

		/* calculate the square root */
		return Math.sqrt(first + second);
	}

	/**
	 * Perform a linear interpolation calculation.
	 *
	 * @param y2
	 *            the upper bound
	 * @param y1
	 *            the lower bound
	 * @param deltaX
	 *            the delta x value
	 * @param x1
	 *            the given x value
	 * @return the calculated y value at the position x1
	 */
	public static double linearInterpolation(double y2, double y1, double deltaX, double x1) {
		return y2 - (y2 - y1) / deltaX * x1;
	}

}
