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
