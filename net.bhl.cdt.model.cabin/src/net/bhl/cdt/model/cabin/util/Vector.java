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
		pointVector[0] = x;
		pointVector[1] = y;
	}

	public void setVectorFromCoordinates(int x, int y) {
		pointVector[0] = x;
		pointVector[1] = y;
	}

	public void setVectorFromPoint(int[] point) {
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
