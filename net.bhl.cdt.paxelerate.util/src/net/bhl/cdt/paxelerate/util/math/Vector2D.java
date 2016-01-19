package net.bhl.cdt.paxelerate.util.math;

public class Vector2D extends Vector {

	public Vector2D(int x, int y) {
		super(x, y);
		super.dimensions = 2;
	}

	public Vector2D(Vector vector) {
		super(vector.getX(), vector.getY());
		super.dimensions = 2;

	}

	public void set(int x, int y) {
		super.xValue = x;
		super.yValue = y;
	}

	/**
	 * This method sets the vector from an int[] if the dimension 2.
	 * 
	 * @param point
	 *            is the point that is submitted
	 */
	public void setFromPoint(int[] point) {
		if (point.length == dimensions) {
			super.xValue = point[0];
			super.yValue = point[1];
		}
	}

	/**
	 * This method returns the vector in form of an int[] of the dimensions
	 * DIMENSIONS.
	 * 
	 * @return the value in int[DIMENSIONS] form
	 */
	public int[] getValue() {
		int[] value = new int[dimensions];
		value[0] = xValue;
		value[1] = yValue;
		return value;
	}
}
