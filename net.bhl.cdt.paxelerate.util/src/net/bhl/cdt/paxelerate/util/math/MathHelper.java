package net.bhl.cdt.paxelerate.util.math;

/**
 * 
 * @author marc.engelmann
 *
 */
public abstract class MathHelper {

	/**
	 * This method calculates the Pythagoras distance between two vectors.
	 * 
	 * @param node1
	 *            the first node
	 * @param node2
	 *            the second node
	 * @return the distance between the nodes
	 */
	public static double distance(Vector vector1, Vector vector2) {

		/* define the first element of the square root function */
		double first = Math.pow(vector2.getX() - vector1.getX(), 2);

		/* define the second element of the square root function */
		double second = Math.pow(vector2.getY() - vector1.getY(), 2);

		/* calculate the square root */
		return Math.sqrt(first + second);
	}

}
