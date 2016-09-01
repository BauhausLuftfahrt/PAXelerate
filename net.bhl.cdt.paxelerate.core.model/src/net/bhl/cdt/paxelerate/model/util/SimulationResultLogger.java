/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
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
 * @author marc.engelmann, michael.schmidt
 * @version 0.8
 * @since 0.5
 *
 */

public class SimulationResultLogger {

	/** The total pax. */
	private int totalPax;
	
	/** The average_age. */
	private double average_age;
	
	/** The df. */
	private DecimalFormat df = new DecimalFormat("#.##");
	
	/** The pax list. */
	private EList<Passenger> paxList;
	
	/** The age limits. */
	private Vector2D ageLimits;

	/**
	 * Instantiates a new simulation result logger.
	 */
	public SimulationResultLogger() {

	}

	/**
	 * Gets the simulation data.
	 *
	 * @param cabin the cabin
	 * @param runNumber the run number
	 * @param time the time
	 * @param simTime the sim time
	 * @param waymakingSkipped the waymaking skipped
	 * @param waymakingCompleted the waymaking completed
	 * @return the simulation data
	 */
	public void getSimulationData(Cabin cabin, int runNumber, double time, double simTime, int waymakingSkipped, int waymakingCompleted) {
		SimulationResult result = CabinFactory.eINSTANCE
				.createSimulationResult();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM, HH:mm");
		Date date = new Date();

		result.setPassengers(cabin.getPassengers().size());
		result.setBoardingTime(time);
		result.setSimulationTime(simTime);
		result.setId(SimulationHandler.getCabin().getSimulationSettings()
				.getResults().size() + 1);
		result.setName(dateFormat.format(date));
		result.setDate(date);
		result.setBoardingTimeString(TimeHelper.toTimeOfDay(time));
		result.setWaymakingSkipped(waymakingSkipped);
		result.setWaymakingCompleted(waymakingCompleted);
		result.setLayoutConceptType(cabin.getSimulationSettings().getLayoutConcept());
		SimulationHandler.getCabin().getSimulationSettings().getResults()
				.add(result);
	}

	/**
	 * Gets the passenger data.
	 *
	 * @param paxList the pax list
	 * @return the passenger data
	 */
	public void getPassengerData(EList<Passenger> paxList) {
		this.paxList = paxList;

		// TODO: here it could be possible to evaluate the distributions of
		// passengers, their waiting times, their boarding times, their number
		// of interrupts, ...

		// the data could be output to a text file.

		totalPax = paxList.size();

		ageLimits = findMaxima();

		int agecounter = 0;
		for (Passenger pax : paxList) {
			agecounter += pax.getAge();
		}

		average_age = agecounter / (double) totalPax;

	}

	/**
	 * Find maxima.
	 *
	 * @return the vector2 d
	 */
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

	/**
	 * Prints the passenger evaluation.
	 */
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

	/**
	 * Prints the simulation data.
	 */
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

	/**
	 * Gets the average boarding time.
	 *
	 * @return the average boarding time
	 */
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