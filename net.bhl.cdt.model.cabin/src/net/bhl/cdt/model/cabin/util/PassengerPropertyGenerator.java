package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.Passenger;
import net.bhl.cdt.model.cabin.PassengerMood;
import net.bhl.cdt.model.cabin.Sex;
import net.bhl.cdt.model.cabin.util.FuncLib.GaussOptions;

/**
 * This class is used to generate the passenger properties for each passenger
 * individually. Speed and age models are given.
 * 
 * @author marc.engelmann
 *
 */
public class PassengerPropertyGenerator {

	/* The current passenger */
	private Passenger passenger;

	/* amount of women in percent */
	private static final int PROBABILITY_OF_WOMEN = 50;

	/*
	 * This array contains two values, first the age of the passenger and second
	 * the corresponding speed.
	 */
	private double[][] speedmodel = { { 5, 0.6 }, { 10, 1.18 }, { 15, 1.5 },
			{ 20, 1.6 }, { 25, 1.6 }, { 30, 1.55 }, { 35, 1.5 }, { 40, 1.5 },
			{ 45, 1.45 }, { 50, 1.42 }, { 55, 1.37 }, { 60, 1.3 }, { 65, 1.2 },
			{ 70, 1.05 }, { 75, 0.9 }, { 80, 0.7 } };

	/*
	 * This array contains the age dirstribution in the united states in 2012.
	 * The first value of the tuple is the male, the second one the female
	 * distribution.
	 */
	private double[][] agemodel = { { 0.0349, 0.0333 }, { 0.0374, 0.0356 },
			{ 0.0374, 0.0356 }, { 0.0369, 0.0349 }, { 0.0344, 0.0330 },
			{ 0.0348, 0.0341 }, { 0.0367, 0.0362 }, { 0.0402, 0.0405 },
			{ 0.0395, 0.0402 }, { 0.0351, 0.0363 }, { 0.0306, 0.0319 },
			{ 0.0231, 0.0247 }, { 0.0183, 0.0201 }, { 0.0156, 0.0182 },
			{ 0.0139, 0.0176 }, { 0.0108, 0.0155 }, { 0.0065, 0.0111 },
			{ 0.0044, 0.0107 } };

	public PassengerPropertyGenerator(Passenger pax) {

		this.passenger = pax;

		/** At first. decide for the sex. **/
		passenger.setSex(switchRandomSex(PROBABILITY_OF_WOMEN));

		/** Define the mood of the passenger **/
		passenger.setPassengerMood(PassengerMood.PASSIVE);

		/** Define the age according to age distribution **/
		passenger.setAge(adaptAge());

		/** Define the height according to normal distribution **/
		passenger.setHeight((int) adapt(177.5, 11.1, 164.5, 11.5));

		/** Define the weight according to normal distribution **/
		passenger.setWeight((int) adapt(90, 20, 60, 15));

		/** Define the depth according to normal distribution **/
		passenger.setDepth((int) adapt(30, 5, 27, 3));

		/** Define the width according to normal distribution **/
		passenger.setWidth((int) adapt(47, 2.8, 41.4, 2.8));

		/** Define the walking speed according to age **/
		passenger.setWalkingSpeed(adaptSpeed());

		/** Define the luggage stow time randomly **/
		passenger.setLuggageStowTime((int) FuncLib.gaussianRandom(15,
				GaussOptions.PERCENT_95, 7));
	}

	/**
	 * Returns the passenger object.
	 * 
	 * @return the passenger
	 */
	public Passenger getPassenger() {
		return passenger;
	}

	/**
	 * This function translates the speed model to a single value for a specific
	 * age.
	 * 
	 * @return the speed in meters per second
	 */
	private double adaptSpeed() {
		int value = FuncLib.roundToFive(passenger.getAge());
		int index = value % 5;
		if (index <= 0) {
			index = 1;
		}
		return speedmodel[index - 1][1];
	}

	/**
	 * This method adapts the age according to the US age distribution. It does
	 * this by creating a random value which reacts according to the age
	 * probability functions.
	 * 
	 * @return the age of a specific passenger
	 */
	private int adaptAge() {

		/* This class is used for the probability calculations */
		ProbabilityMachine machine = new ProbabilityMachine(agemodel, 5);

		/* Define the lower bound of the age model. */
		machine.setLowerBound(20);

		/* Define the upper bound of the age model. */
		machine.setUpperBound(80);

		/* This returns the index of the object in the age model. */
		int index = machine.getProbabilityValue(passenger.getSex());

		/*
		 * To translate this to an age, multiply it with 5, because each element
		 * stands for a 5 year range.
		 */
		int age = index * 5;
		if (age < 5) {
			age = 5;
		}

		/* Then create a random number within the 5 year range. */
		return FuncLib.randomValue(age - 5, age);

	}

	/**
	 * This method takes four variables and performs the gauss distribution for
	 * the correct two ones.
	 * 
	 * @param one
	 *            is the male mean value
	 * @param two
	 *            is the male deviation value
	 * @param three
	 *            is the female mean value
	 * @param four
	 *            is the female deviation value
	 * @return is a gaussian random value
	 */
	private double adapt(double one, double two, double three, double four) {
		return getGauss95(applySwitch(one, three), applySwitch(two, four));
	}

	/**
	 * This method switches the sex of the passengers according to the
	 * probability of females.
	 * 
	 * @param percentageOfWomen
	 *            is the percentage of women.
	 * @return returns the sex.
	 */

	private Sex switchRandomSex(int percentageOfWomen) {
		if (FuncLib.randomValue(0, 100) < percentageOfWomen) {
			return Sex.FEMALE;
		}
		return Sex.MALE;

	}

	/**
	 * This function performs the gaussian distribution for a specific mean and
	 * deviation value.
	 * 
	 * @param mean
	 *            the mean value
	 * @param deviation
	 *            the deviation value
	 * @return a random gauss value
	 */
	private double getGauss95(double mean, double deviation) {
		return FuncLib.gaussianRandom(mean, GaussOptions.PERCENT_95, deviation);
	}

	/**
	 * this function returns one of the two values depending on the sex.
	 * 
	 * @param maleValue
	 *            the male value
	 * @param femaleValue
	 *            the female value
	 * @return the value depending on the chosen sex
	 */
	private double applySwitch(double maleValue, double femaleValue) {
		if (passenger.getSex() == Sex.MALE) {
			return maleValue;
		}
		return femaleValue;
	}
}