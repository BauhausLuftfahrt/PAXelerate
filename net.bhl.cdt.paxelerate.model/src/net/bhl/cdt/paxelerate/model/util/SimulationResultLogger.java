package net.bhl.cdt.paxelerate.model.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.CabinFactory;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.SimulationResult;
import net.bhl.cdt.paxelerate.model.astar.SimulationHandler;
import net.bhl.cdt.paxelerate.util.math.Vector2D;
import net.bhl.cdt.paxelerate.util.time.TimeHelper;

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

	public SimulationResultLogger() {

	}

	public void getSimulationData(Cabin cabin, int runNumber, double time) {
		SimulationResult result = CabinFactory.eINSTANCE
				.createSimulationResult();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM, HH:mm");
		Date date = new Date();

		result.setPassengers(cabin.getPassengers().size());
		result.setBoardingTime(time);
		result.setId(SimulationHandler.getCabin().getSimulationSettings()
				.getResults().size() + 1);
		result.setName(dateFormat.format(date));
		result.setDate(date);
		result.setBoardingTimeString(TimeHelper.toTimeOfDay(time));
		SimulationHandler.getCabin().getSimulationSettings().getResults()
				.add(result);
	}

	public void getPassengerData(EList<Passenger> paxList) {
		this.paxList = paxList;

		// TODO: here it could be possible to evaluate the distributions of
		// passengers, their waiting times, their boarding times, their number
		// of interrupts, ...

		// TODO: the data could be output to a text file.

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
		System.out.println("Number of Loops: "
				+ SimulationHandler.getCabin().getSimulationSettings()
						.getResults().size());
		System.out.println();
		for (SimulationResult result : SimulationHandler.getCabin()
				.getSimulationSettings().getResults()) {
			System.out
					.println(result.getPassengers()
							+ " passengers simulated in run #"
							+ result.getId()
							+ " within "
							+ TimeHelper.toTimeOfDay(result
									.getBoardingTime()) + ".");
			System.out.println();
		}
		System.out.println("Average boarding time: "
				+ TimeHelper.toTimeOfDay(getAverageBoardingTime())
				+ " seconds.");
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	private double getAverageBoardingTime() {

		double time = 0;

		for (SimulationResult result : SimulationHandler.getCabin()
				.getSimulationSettings().getResults()) {
			time += result.getBoardingTime();
		}
		return time
				/ SimulationHandler.getCabin().getSimulationSettings()
						.getResults().size();

	}
}