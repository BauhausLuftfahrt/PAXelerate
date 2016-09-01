/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

/**
 * This class is a 2 dimensional subclass of the Vector.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
public class Vector2D extends Vector {

	/**
	 * Instantiates a new vector2 d.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public Vector2D(int x, int y) {
		super(x, y);
	}

	/**
	 * Instantiates a new vector2 d.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	public Vector2D(double x, double y) {
		super(x, y);
	}

	/**
	 * Instantiates a new vector2 d.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param scaling
	 *            the scaling
	 */
	public Vector2D(double x, double y, int scaling) {
		super(x, y, scaling);
	}
}