package com.paxelerate.util.math;

import java.util.ArrayList;
import java.util.Random;

public class RandomHelper {
	/**
	 * This method generates a unique random number for a specific list.
	 * 
	 * @param list
	 *            is the array list that is checked for uniqueness
	 * @param lowerBound
	 *            is the lower bound of the integer
	 * @param range
	 *            is the range of the integer <b><i>Note that the upper bound
	 *            itself is never reached!</i></b>
	 * @return returns a random value
	 */
	public static int uniqueRandom(ArrayList<Integer> list, int lowerBound, int range) {
		boolean checkUniqueness = false;
		Random rand = new Random();
		int randomValue = 0;
		while (!checkUniqueness) {
			randomValue = rand.nextInt(range) + lowerBound;
			if (!list.contains(randomValue)) {
				list.add(randomValue);
				checkUniqueness = true;
			}
		}
		return randomValue;
	}

	/**
	 * Note that the 2 integer values have the following meanings: first integer
	 * is the lower bound, second integer is the upper bound. The upper bound is
	 * never reached! Result is part of: [l,u[
	 * 
	 * 
	 * @param lowerBound
	 *            defines the lower end of the random number.
	 * @param upperBound
	 *            defines the upper bound. <b><i>Note that the upper bound
	 *            itself is never reached!</i></b>
	 * @return returns the random double generated from the parameters above.
	 */
	public static int randomValue(int lowerBound, int upperBound) {
		Random rand = new Random();
		return (rand.nextInt(upperBound - lowerBound) + lowerBound);
	}
}
