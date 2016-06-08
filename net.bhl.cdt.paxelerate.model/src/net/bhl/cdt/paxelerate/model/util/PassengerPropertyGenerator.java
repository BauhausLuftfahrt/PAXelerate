package net.bhl.cdt.paxelerate.model.util;

import net.bhl.cdt.model.util.ModelHelper;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LuggageProperties;
import net.bhl.cdt.paxelerate.model.LuggageSize;
import net.bhl.cdt.paxelerate.model.Passenger;
import net.bhl.cdt.paxelerate.model.PassengerMood;
import net.bhl.cdt.paxelerate.model.PassengerProperties;
import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.paxelerate.util.math.DecimalHelper;
import net.bhl.cdt.paxelerate.util.math.GaussOptions;
import net.bhl.cdt.paxelerate.util.math.GaussianRandom;
import net.bhl.cdt.paxelerate.util.math.RandomHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * This class is used to generate the passenger properties for each passenger
 * individually. Speed and age models are given.
 * 
 * @author marc.engelmann
 *
 */
public class PassengerPropertyGenerator {

	/** The current passenger. */
	private Passenger passenger;

	/** The paxSettings. */
	private PassengerProperties paxSettings;

	/** The luggage settings. */
	private LuggageProperties luggageSettings;

	/**
	 * This array contains two values, first the age of the passenger and second
	 * the corresponding speed.
	 **/
	private double[][] speedmodel = { { 5, 0.6 }, { 10, 1.18 }, { 15, 1.5 },
			{ 20, 1.6 }, { 25, 1.6 }, { 30, 1.55 }, { 35, 1.5 }, { 40, 1.5 },
			{ 45, 1.45 }, { 50, 1.42 }, { 55, 1.37 }, { 60, 1.3 }, { 65, 1.2 },
			{ 70, 1.05 }, { 75, 0.9 }, { 80, 0.7 } };

	/**
	 * This array contains the age distribution in the united states in 2012.
	 * The first value of the tuple is the male, the second one the female
	 * distribution.
	 **/
	private double[][] agemodel = { { 0.0349, 0.0333 }, { 0.0374, 0.0356 },
			{ 0.0374, 0.0356 }, { 0.0369, 0.0349 }, { 0.0344, 0.0330 },
			{ 0.0348, 0.0341 }, { 0.0367, 0.0362 }, { 0.0402, 0.0405 },
			{ 0.0395, 0.0402 }, { 0.0351, 0.0363 }, { 0.0306, 0.0319 },
			{ 0.0231, 0.0247 }, { 0.0183, 0.0201 }, { 0.0156, 0.0182 },
			{ 0.0139, 0.0176 }, { 0.0108, 0.0155 }, { 0.0065, 0.0111 },
			{ 0.0044, 0.0107 } };

	/**
	 * Instantiates a new passenger property generator.
	 *
	 * @param pax
	 *            the pax
	 */
	public PassengerPropertyGenerator(Passenger pax) {

		passenger = pax;

		paxSettings = ModelHelper.getParent(Cabin.class, pax)
				.getSimulationSettings().getPassengerProperties();

		luggageSettings = ModelHelper.getParent(Cabin.class, pax)
				.getSimulationSettings().getLuggageProperties();

		/* At first. decide for the sex. */
		passenger.setSex(switchRandomSex(paxSettings.getPercentageOfWomen()));

		/* Define the mood of the passenger **/
		passenger.setPassengerMood(switchRandomMood(paxSettings.getPassengerAggressiveMoodShare()));

		/* Define the age according to age distribution **/
		passenger.setAge(adaptAge());

		/* Define the height according to normal distribution **/
		passenger
				.setHeight((int) adapt(paxSettings.getPassengerHeightMeanMale(),
						paxSettings.getPassengerHeightDeviationMale(),
						paxSettings.getPassengerHeightMeanFemale(),
						paxSettings.getPassengerHeightDeviationFemale()));

		/* Define the weight according to normal distribution **/
		passenger
				.setWeight((int) adapt(paxSettings.getPassengerWeightMeanMale(),
						paxSettings.getPassengerWeightDeviationMale(),
						paxSettings.getPassengerWeightMeanFemale(),
						paxSettings.getPassengerWeightDeviationFemale()));

		/* Define the depth according to normal distribution **/
		passenger.setDepth((int) adapt(paxSettings.getPassengerDepthMeanMale(),
				paxSettings.getPassengerDepthDeviationMale(),
				paxSettings.getPassengerDepthMeanFemale(),
				paxSettings.getPassengerDepthDeviationFemale()));

		/* Define the width according to normal distribution **/
		passenger.setWidth((int) adapt(paxSettings.getPassengerWidthMeanMale(),
				paxSettings.getPassengerWidthDeviationMale(),
				paxSettings.getPassengerWidthMeanFemale(),
				paxSettings.getPassengerWidthDeviationFemale()));

		/* Define the walking speed according to age **/
		passenger.setWalkingSpeed(adaptSpeed());

		/* Define the type of luggage **/
		passenger.setLuggage(adaptLuggage());

		/* Define the luggage stow time randomly **/
		passenger.setLuggageStowTime(
				DecimalHelper.round(adaptLuggageStowTime(), 2));

		/* Define the luggage distance from seat randomly **/
		passenger.setLuggageStowDistance(
				DecimalHelper.round(defineLuggageStowDistance(), 2));
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
		/** Removed round to five. Otherwise value % 5 always = 0. **/
		int value = passenger.getAge();
		int index = value % 5;
		if (index <= 0) {
			index = 1;
		}
		return speedmodel[index - 1][1];
	}

	/**
	 * Adapt luggage.
	 *
	 * @return the luggage size
	 */
	private LuggageSize adaptLuggage() {

		double[] luggagemodel = {
				luggageSettings.getPercentageOfPassengersWithNoLuggage(),
				luggageSettings.getPercentageOfPassengersWithSmallLuggage(),
				luggageSettings.getPercentageOfPassengersWithMediumLuggage(),
				luggageSettings.getPercentageOfPassengersWithBigLuggage() };

		if ((luggagemodel[0] == 0 && luggagemodel[1] == 0
				&& luggagemodel[2] == 0 && luggagemodel[3] == 0)
				|| ((luggagemodel[0] + luggagemodel[1] + luggagemodel[2]
						+ luggagemodel[3]) == 0)) {
			luggagemodel[0] = 100;
			Log.add(this, "CAUTION, ERROR IN LUGGAGE DISTRIBUTION.");
		}

		ProbabilityMachine machine = new ProbabilityMachine(luggagemodel);

		switch (machine.getProbabilityValue()) {
		case 0:

			return LuggageSize.NONE;
		case 1:

			return LuggageSize.SMALL;
		case 2:

			return LuggageSize.MEDIUM;
		case 3:

			return LuggageSize.BIG;
		default:

			return LuggageSize.NONE;
		}
	}

	/**
	 * This function adapts a specific luggage stowing time using a Gaussian
	 * distribution depending on the luggage size.
	 *
	 * @return stowing time in s
	 */
	private double adaptLuggageStowTime() {

		switch (passenger.getLuggage()) {
		case NONE:
			return 0;
		case SMALL:
			return GaussianRandom.gaussianRandom(
					luggageSettings.getPassengerSmallLuggageStowTimeMean(),
					GaussOptions.PERCENT_95, luggageSettings
							.getPassengerSmallLuggageStowTimeDeviation());
		case MEDIUM:
			return GaussianRandom.gaussianRandom(
					luggageSettings.getPassengerMediumLuggageStowTimeMean(),
					GaussOptions.PERCENT_95, luggageSettings
							.getPassengerMediumLuggageStowTimeDeviation());
		case BIG:
			return GaussianRandom.gaussianRandom(
					luggageSettings.getPassengerBigLuggageStowTimeMean(),
					GaussOptions.PERCENT_95,
					luggageSettings.getPassengerBigLuggageStowTimeDeviation());
		default:
			return 0;
		}

	}

	/**
	 * This function adapts a specific luggage stowing distance using a Gaussian
	 * distribution.
	 *
	 * @return stowing distance in cm
	 */
	private double defineLuggageStowDistance() {

		return GaussianRandom.gaussianRandom(
				luggageSettings.getLuggageStowDistanceFromSeatMean(),
				GaussOptions.PERCENT_95,
				luggageSettings.getLuggageStowDistanceFromSeatDeviation());
	}

	/**
	 * This method adapts the age according to the US age distribution. It does
	 * this by creating a random value which reacts according to the age
	 * probability functions.
	 * 
	 * @return the age of a specific passenger
	 */
	private int adaptAge() {

		/* This class is used for the probability calculations **/
		ProbabilityMachine machine = new ProbabilityMachine(agemodel, 5);

		/* Define the lower bound of the age model. **/
		machine.setLowerBound(20);

		/* Define the upper bound of the age model. **/
		machine.setUpperBound(80);

		/* This returns the index of the object in the age model. **/
		int index = machine.getProbabilityValue(passenger.getSex());

		/*
		 * To translate this to an age, multiply it with 5, because each element
		 * stands for a 5 year range.
		 **/
		int age = index * 5;
		if (age < 5) {
			age = 5;
		}

		/* Then create a random number within the 5 year range. **/
		return RandomHelper.randomValue(age - 5, age);

	}

	/**
	 * This method takes four variables and performs the Gauss distribution for
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
	 * @return is a Gaussian random value
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

	private Sex switchRandomSex(double percentageOfWomen) {
		if (RandomHelper.randomValue(0, 100) < percentageOfWomen) {
			return Sex.FEMALE;
		}
		return Sex.MALE;

	}
	
	/**
	 * This method switches the mood of the passengers according to the
	 * probability of aggressive agents.
	 *
	 * @param percentageOfAggressiveAgents the percentage of aggressive agents
	 * @return returns the sex.
	 */

	private PassengerMood switchRandomMood(double percentageOfAggressiveAgents) {
		if (RandomHelper.randomValue(0, 100) < percentageOfAggressiveAgents) {
			return PassengerMood.AGGRESSIVE;
		}
		return PassengerMood.PASSIVE;

	}

	/**
	 * This function performs the Gaussian distribution for a specific mean and
	 * deviation value.
	 * 
	 * @param mean
	 *            the mean value
	 * @param deviation
	 *            the deviation value
	 * @return a random Gauss value
	 */
	private double getGauss95(double mean, double deviation) {
		return GaussianRandom.gaussianRandom(mean, GaussOptions.PERCENT_95,
				deviation);
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
