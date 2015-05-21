package net.bhl.cdt.model.cabin.util;

public class ProbabilityMachine {

	/*
	 * program n_select=1000 times selects one of n=4 elements with weights
	 * weight[i]. Selections are summed up in counter[i]. For the weights as
	 * given in the example below one expects that elements 0,1,2 and 3 will be
	 * selected (on average) 200, 150, 600 and 50 times, respectively. In good
	 * agreement with exemplary run.
	 */
	
	private static double[][] array = {{1,2},{2,3},{4,5},{3,7}};

	// TODO: IMPLEMENT THAT CORRECTLY!!
	public static void main(String[] args) {
		int n = array.length;
		double[] weight = new double[n];
		for(double[] tuple:array) {
			//weight.addOneOfTHeValuesDependingOnSex/();
		}
		double max_weight = maximum(weight);
		int[] counter = new int[n];
		int n_select = 1;
		int index = 0;
		boolean notaccepted;
		for (int i = 0; i < n_select; i++) {
			notaccepted = true;
			while (notaccepted) {
				index = (int) (n * Math.random());
				if (Math.random() < weight[index] / max_weight) {
					notaccepted = false;
				}
			}
			counter[index]++;
		}
		for (int i = 0; i < n; i++) {
			System.out.println("counter[" + i + "]=" + counter[i]);
		}

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
