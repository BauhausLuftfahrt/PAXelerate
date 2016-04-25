/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

import java.util.ArrayList;

/**
 * The Class Gaussian.
 */
public class Gaussian {

	/** This class is a verification class for the gauss function. */

	private static final int ITERATIONS = 10 ^ 9;

	/** The avlist. */
	static ArrayList<Double> list = new ArrayList<Double>(), avlist = new ArrayList<Double>();

	/**
	 * Sum up.
	 *
	 * @param listlist the listlist
	 * @return the double
	 */
	private static double sumUp(ArrayList<Double> listlist) {
		double counter = 0;
		for (double value : listlist) {
			counter += value;
		}
		return counter;
	}

	/**
	 * Loop.
	 */
	private static void loop() {
		for (int i = 1; i <= ITERATIONS; i++) {
			list.add(GaussianRandom.gaussianRandom(100, GaussOptions.PERCENT_99, 5));
		}
		double value = average(list);
		System.out.println("Average: " + value);
		avlist.add(value);
		list.clear();
	}

	/**
	 * Average.
	 *
	 * @param listit the listit
	 * @return the double
	 */
	private static double average(ArrayList<Double> listit) {
		return sumUp(listit) / listit.size();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		for (int j = 0; j < 1000; j++) {
			loop();
		}

		System.out.println("\nTotal average: " + average(avlist));
	}
}
