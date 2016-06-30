/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.model.util;

import net.bhl.cdt.paxelerate.model.Sex;

/**
 * This method returns a random value depending on the distribution probability
 * of each value.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 *
 */
public class ProbabilityMachine {

	/** The model. */
	private double[][] model;
	
	/** The model2. */
	private double[] model2;
	
	/** The value of a step. */
	private int lowerBound = 0, upperBound = Integer.MAX_VALUE, valueOfAStep;

	/**
	 * Instantiates a new probability machine.
	 *
	 * @param datamodel the datamodel
	 * @param stepValues the step values
	 */
	public ProbabilityMachine(double[][] datamodel, int stepValues) {
		this.model = datamodel;
		this.valueOfAStep = stepValues;
	}

	/**
	 * Instantiates a new probability machine.
	 *
	 * @param datamodel2 the datamodel2
	 */
	public ProbabilityMachine(double[] datamodel2) {
		this.model2 = datamodel2;
		this.valueOfAStep = 1;
	}

	/**
	 * Sets the lower bound.
	 *
	 * @param value the new lower bound
	 */
	public void setLowerBound(int value) {
		lowerBound = value;
	}

	/**
	 * Sets the upper bound.
	 *
	 * @param value the new upper bound
	 */
	public void setUpperBound(int value) {
		upperBound = value;
	}

	/**
	 * Gets the probability value.
	 *
	 * @return the probability value
	 */
	public int getProbabilityValue() {
		int n = model2.length;

		double[] weight = new double[n];
		int k = 0;
		for (double value : model2) {
			weight[k] = value;
			k++;
		}

		double max_weight = maximum(weight);

		int index = 0;
		boolean notaccepted;

		notaccepted = true;
		while (notaccepted) {
			index = (int) (n * Math.random());
			if (Math.random() < weight[index] / max_weight) {
				notaccepted = false;
			}
		}
		return index;
	}

	/**
	 * Gets the probability value.
	 *
	 * @param sex the sex
	 * @return the probability value
	 */
	public int getProbabilityValue(Sex sex) {
		int n = model.length;

		int value = 0;
		if (sex == Sex.FEMALE) {
			value = 1;
		}
		int lowerBound_index;
		if (lowerBound != 0) {
			lowerBound_index = lowerBound / valueOfAStep + 1;
		} else {
			lowerBound_index = 0;
		}
		int upperBound_index;
		if (upperBound != Integer.MAX_VALUE) {
			upperBound_index = upperBound / valueOfAStep;
		} else {
			upperBound_index = Integer.MAX_VALUE;
		}

		double[] weight = new double[n];
		int j = 0;
		int k = 0;
		for (double[] tuple : model) {
			if (j >= lowerBound_index && j <= upperBound_index) {
				weight[k] = tuple[value];
				k++;
			}
			j++;
		}

		double max_weight = maximum(weight);

		int index = 0;
		boolean notaccepted;

		notaccepted = true;
		while (notaccepted) {
			index = (int) (n * Math.random());
			if (Math.random() < weight[index] / max_weight) {
				notaccepted = false;
			}
		}
		return index + lowerBound_index;
	}

	/**
	 * This method detects and returns the maximum value out of an array of
	 * values.
	 * 
	 * @param values
	 *            the array of values.
	 * @return the maximum value.
	 */
	private static double maximum(double[] values) {

		double max = 0;

		for (int i = 0; i < values.length; i++) {
			if (values[i] > max) {
				max = values[i];
			}
		}
		return max;

	}
}
