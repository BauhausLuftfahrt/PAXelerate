package net.bhl.cdt.model.cabin.util;

import java.util.ArrayList;

import net.bhl.cdt.model.cabin.util.Func.GaussOptions;

public class Gaussian {

	/**
	 * This class is a verification class for the gauss function
	 */

	private static final int ITERATIONS = 10 ^ 9;

	static ArrayList<Double> list = new ArrayList<Double>();

	static ArrayList<Double> avlist = new ArrayList<Double>();

	private static double sumUp(ArrayList<Double> listlist) {
		double counter = 0;
		for (double value : listlist) {
			counter += value;
		}
		return counter;
	}

	private static void loop() {
		for (int i = 1; i <= ITERATIONS; i++) {
			list.add(Func.gaussianRandom(100, GaussOptions.PERCENT_99, 5));
		}
		double value = average(list);
		System.out.println("Average: " + value);
		avlist.add(value);
		list.clear();
	}

	private static double average(ArrayList<Double> listit) {
		return sumUp(listit) / listit.size();
	}

	public static void main(String[] args) {
		for (int j = 0; j < 1000; j++) {
			loop();
		}

		System.out.println("\nTotal average: " + average(avlist));
	}
}
