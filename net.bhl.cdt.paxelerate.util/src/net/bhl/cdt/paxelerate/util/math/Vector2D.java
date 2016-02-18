/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

/**
 * This class is a 2 dimensional subclass of the Vector
 * @author marc.engelmann
 *
 */
public class Vector2D extends Vector {

	public Vector2D(int x, int y) {
		super(x, y);
	}
	
	public Vector2D(double x, double y) {
		super(x,y);
	}
	
	public Vector2D(double x, double y, int scaling) {
		super(x,y,scaling);
	}
}
