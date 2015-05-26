package net.bhl.cdt.model.cabin.util;

import java.text.DecimalFormat;

import net.bhl.cdt.model.cabin.Passenger;

import org.eclipse.emf.common.util.EList;

public class PassengerEvaluator {

	private int totalPax;
	private double average_age;
	private DecimalFormat df = new DecimalFormat("#.##");
	private EList<Passenger> paxList;
	private Vector2D ageLimits;

	public PassengerEvaluator(EList<Passenger> paxList) {

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

	public void printResults() {
		System.out.println();
		System.out.println();
		System.out
				.println("~~~~~~~~~~~~ Passenger Evaluation (Pre-Boarding) ~~~~~~~~~~~~~");
		System.out.println();
		System.out.println("Average age of all " + totalPax + " passengers: "
				+ df.format(average_age) + " years.");

		System.out.println("Youngest passenger: " + ageLimits.getX()
				+ " years.");
		System.out.println("Oldest passenger: " + ageLimits.getY() + " years.");

		System.out.println();
		System.out
				.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}
}
