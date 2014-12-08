package net.bhl.cdt.model.cabin.util;

/**
 * 
 * @author marc.engelmann
 *
 */
public class Vector {

	private int[] pointVector = new int[2];

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Vector() {
		pointVector[0] = 0;
		pointVector[1] = 0;

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

	public int[] getPoint() {
		return pointVector;
	}
}
