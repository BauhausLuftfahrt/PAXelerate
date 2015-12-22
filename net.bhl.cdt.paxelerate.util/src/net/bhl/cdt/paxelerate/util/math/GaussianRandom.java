package net.bhl.cdt.paxelerate.util.math;

import java.util.Random;

public class GaussianRandom {
	/**
	 * Use this function to generate a value according to gaussian normal
	 * distribution.
	 * 
	 * @param average
	 *            is the average value of the distribution
	 * @param gauss
	 *            is the option you want to choose.
	 * @param deviation
	 *            is the deviation at the chosen option.
	 * @return
	 */
	public static double gaussianRandom(double average, GaussOptions gauss, double deviation) {
		Random rand = new Random();
		double result = (rand.nextGaussian() * (deviation / gauss.getSigma()) + average);
		if (result < 0) {
			return 0;
		}
		return result;
	}
}
