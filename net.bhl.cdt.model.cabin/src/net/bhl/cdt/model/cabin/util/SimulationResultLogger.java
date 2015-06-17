package net.bhl.cdt.model.cabin.util;

import java.text.DecimalFormat;
import java.util.ArrayList;

import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.Passenger;

import org.eclipse.emf.common.util.EList;

/**
 * This class is used to handle passenger data and to analyze and export it.
 * 
 * @author marc.engelmann
 *
 */

public class SimulationResultLogger {

	private int totalPax;
	private double average_age;
	private DecimalFormat df = new DecimalFormat("#.##");
	private EList<Passenger> paxList;
	private Vector2D ageLimits;
	private ArrayList<Result> results = new ArrayList<Result>();

	public SimulationResultLogger() {

	}

	public void getSimulationData(Cabin cabin, int runNumber) {
		results.add(new Result(cabin.getPassengers().size(), cabin
				.getEstimatedSimulationTime(), runNumber));
		System.out.println("Result " + runNumber + " saved!");
	}

	public void getPassengerData(EList<Passenger> paxList) {
		this.paxList = paxList;

		// TODO: here it could be possible to evaluate the distributions of
		// passengers, their waiting times, their boarding times, their number
		// of interrupts, ...

		// TODO: the data could be output to an excel file.

		totalPax = paxList.size();

		ageLimits = findMaxima();

		int agecounter = 0;
		for (Passenger pax : paxList) {
			agecounter += pax.getAge();
		}

		average_age = agecounter / (double) totalPax;

	}

	private Vector2D findMaxima() {
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (Passenger pax : paxList) {
			int age = pax.getAge();
			if (age > max) {
				max = age;
			}
			if (age < min) {
				min = age;
			}
		}
		return new Vector2D(min, max);
	}

	public void printPassengerEvaluation() {

		System.out
				.println("~~~~~~~~~~ Passenger Evaluation (Pre-Boarding) ~~~~~~~~~~~");
		System.out.println();
		System.out.println("Average age of all " + totalPax + " passengers: "
				+ df.format(average_age) + " years.");

		System.out.println("Youngest passenger: " + ageLimits.getX()
				+ " years.");
		System.out.println("Oldest passenger: " + ageLimits.getY() + " years.");

		System.out.println();
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	public void printSimulationData() {
		System.out.println("~~~~~~~~~~ Simulation Results ~~~~~~~~~~~");
		System.out.println();
		System.out.println("Number of Loops: " + results.size());
		System.out.println();
		for (Result result : results) {
			System.out.println(result.getPassengers()
					+ " passengers simulated in run #" + result.getRunNumber()
					+ " within "
					+ FuncLib.transformToTimeString(result.getSimulationTime())
					+ ".");
			System.out.println();
		}
		System.out.println("Average boarding time: "
				+ FuncLib.transformToTimeString(getAverageBoardingTime())
				+ " seconds.");
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	private double getAverageBoardingTime() {

		double time = 0;

		for (Result result : results) {
			time += result.getSimulationTime();
		}
		return time / results.size();

	}
}
