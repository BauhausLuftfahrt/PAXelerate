package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.Sex;

/**
 * This method returns a random value depending on the distribution probability
 * of each value.
 * 
 * @author marc.engelmann
 *
 */
public class ProbabilityMachine {

	private static double[][] model;
	private int lowerBound = 0;
	private int upperBound = Integer.MAX_VALUE;
	private int valueOfAStep;

	public ProbabilityMachine(double[][] datamodel, int stepValues) {
		model = datamodel;
		valueOfAStep = stepValues;
	}

	public void setLowerBound(int value) {
		lowerBound = value;
	}

	public void setUpperBound(int value) {
		upperBound = value;
	}

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
