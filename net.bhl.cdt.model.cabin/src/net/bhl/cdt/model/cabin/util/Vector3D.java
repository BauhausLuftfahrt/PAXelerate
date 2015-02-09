package net.bhl.cdt.model.cabin.util;

public class Vector3D extends Vector {

	public Vector3D(int x, int y, int z) {
		super(x, y, z);
		dimensions = 3;
	}

	public void set(int x, int y, int z) {
		super.xValue  = x;
		super.yValue = y;
		super.zValue = z;
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
			super.zValue = point[2];
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
		value[2] = zValue;
		return value;
	}
}
