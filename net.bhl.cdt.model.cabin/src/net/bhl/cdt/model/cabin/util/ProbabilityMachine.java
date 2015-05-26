package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.Sex;

public class ProbabilityMachine {

	/*
	 * program n_select=1000 times selects one of n=4 elements with weights
	 * weight[i]. Selections are summed up in counter[i]. For the weights as
	 * given in the example below one expects that elements 0,1,2 and 3 will be
	 * selected (on average) 200, 150, 600 and 50 times, respectively. In good
	 * agreement with exemplary run.
	 */
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

		// for (int i = 0; i < n; i++) {
		// System.out.println("Between " + (i * 5) + " and " + (i * 5 + 5)
		// + ": " + counter[i] + " persons.");
		// }

		/*
		 * The program uses stochastic acceptance instead of linear (or binary)
		 * search. More on http://arxiv.org/abs/1109.3627
		 */
	}

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
