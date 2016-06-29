/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

import java.util.Random;

/**
 * The Class GaussianRandom.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
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
	 * @return the double
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
