package net.bhl.cdt.model.cabin.util;

/**
 * This class represents a point consisting of 2 coordinates. It is easily
 * possible to expand this vector to 3 coordinates.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @date 08.12.2014
 *
 */
public class Vector {
	private static final int DIMENSIONS = 2;
	private int[] pointVector = new int[DIMENSIONS];

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Vector() {
		pointVector[0] = 0;
		pointVector[1] = 0;

	}

	public int getDimensions() {
		return DIMENSIONS;
	}

	public Vector(int x, int y) {
		pointVector[0] = x;
		pointVector[1] = y;
	}

	public void setPointFromCoordinates(int x, int y) {
		pointVector[0] = x;
		pointVector[1] = y;
	}

	public void setPointFromPoint(int[] point) {
		pointVector = point;
	}

	public int getX() {
		return pointVector[0];
	}

	public int getY() {
		return pointVector[1];
	}

	public int[] getValue() {
		return pointVector;
	}
}
