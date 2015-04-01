package net.bhl.cdt.model.cabin.util;

import java.util.Arrays;

/**
 * This class is used to rotate an array or part of an array.
 * 
 * @author marc.engelmann
 *
 */
public class Rotator {

	public static Vector RoundIndexToPoint(int index, int radius) {
		if (radius == 0)
			return new Vector2D(0, 0);
		Vector2D result = new Vector2D(-radius, -radius);

		while (index < 0)
			index += radius * 8;
		index = index % (radius * 8);

		int edgeLen = radius * 2;

		if (index < edgeLen) {
			result.setX(result.getX() + index);
		} else if ((index -= edgeLen) < edgeLen) {
			result.setX(radius);
			result.setY(result.getY() + index);
		} else if ((index -= edgeLen) < edgeLen) {
			result.setX(radius - index);
			result.setY(radius);
		} else if ((index -= edgeLen) < edgeLen) {
			result.setY(radius - index);
		}

		return result;
	}

	public static int[][] rotate45(int[][] array) {
		int dim = Math.max(array[0].length, array.length);

		int[][] result = new int[dim][dim];

		Vector center = new Vector2D((result.length - 1) / 2,
				(result[0].length - 1) / 2);
		Vector center2 = new Vector2D((array.length - 1) / 2,
				(array[0].length - 1) / 2);
		for (int r = 0; r <= (dim - 1) / 2; r++) {
			for (int i = 0; i <= r * 8; i++) {
				Vector source = RoundIndexToPoint(i, r);
				Vector target = RoundIndexToPoint(i + r, r);

				if (!(center2.getX() + source.getX() < 0
						|| center2.getY() + source.getY() < 0
						|| center2.getX() + source.getX() >= array.length || center2
						.getY() + source.getY() >= array[0].length)) {
					result[center.getX() + target.getX()][center.getY()
							+ target.getY()] = array[center2.getX()
							+ source.getX()][center2.getY() + source.getY()];
				}
			}
		}
		return result;
	}

	public static int[][] RotatePart(int degrees, int[][] array, Vector start,
			Vector dimensions) {

		int rest = degrees % 45;
		int times = degrees / 45;
		if (rest != 0) {
			return null;
		}
		int[][] rotatingArea = new int[dimensions.getX()][dimensions.getY()];
		for (int i = 0; i < dimensions.getX(); i++) {
			rotatingArea[i] = Arrays.copyOfRange(array[i + start.getX()],
					start.getY(), start.getY() + dimensions.getY());
		}

		for (int j = 0; j < times; j++) {
			rotatingArea = rotate45(rotatingArea);
		}

		for (int i = 0; i < dimensions.getX(); i++) {
			for (int j = 0; j < dimensions.getY(); j++) {
				array[start.getX() + i][start.getY() + j] = rotatingArea[i][j];
			}
		}

		return array;
	}
}
