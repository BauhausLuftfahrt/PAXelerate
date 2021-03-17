/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.execution.init;

import java.util.Comparator;

import org.eclipse.emf.common.util.ECollections;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Luggage;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.Gender;
import com.paxelerate.model.enums.PassengerMood;
import com.paxelerate.model.settings.LuggageProperties;
import com.paxelerate.model.settings.PassengerProperties;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.LinearInterpolation;
import net.bhl.opensource.toolbox.math.gaussian.Gaussian;
import net.bhl.opensource.toolbox.math.gaussian.Gaussian.Sigma;
import net.bhl.opensource.toolbox.math.random.RandomHelper;

/**
 * This class is used to generate the passenger properties for each passenger
 * individually. Speed and age models are given.
 *
 * @author Marc.Engelmann
 */
public interface PassengerPropertyGenerator {

	/**
	 * This method takes four variables and performs the Gauss distribution for the
	 * correct two ones.
	 *
	 * @param mMean      is the male mean value
	 * @param mDeviation is the male deviation value
	 * @param fMean      is the female mean value
	 * @param fDeviation is the female deviation value
	 * @return is a Gaussian random value
	 */
	static double adapt(Passenger pax, double mMean, double mDeviation, double fMean, double fDeviation) {

		return Gaussian.random(pax.getGender() == Gender.MALE ? mMean : fMean, Sigma.PERCENT_95,
				pax.getGender() == Gender.MALE ? mDeviation : fDeviation);
	}

	/**
	 * @param pax
	 * @param opt
	 * @return
	 */
	static double adaptSpeed(Passenger pax, PassengerProperties opt) {

		if (opt.getAgeSpeedDependency().size() == 0) {
			throw new NullPointerException("No age - speed dependency available!");
		}

		if (opt.getAgeSpeedDependency().size() == 1) {
			return opt.getAgeSpeedDependency().get(0).getY();
		}

		// otherwise, the require value is interpolated between the lower bound and
		// upper bound.
		EPoint closestLow = opt.getAgeSpeedDependency().stream()
				.sorted(Comparator.comparing(s -> Math.abs(s.getX() - pax.getAge())))
				.filter(s -> s.getX() - pax.getAge() <= 0).findFirst().orElse(null);

		EPoint closestHigh = opt.getAgeSpeedDependency().stream()
				.sorted(Comparator.comparing(s -> s.getX() - pax.getAge())).filter(s -> s.getX() - pax.getAge() >= 0)
				.findFirst().orElse(null);

		ECollections.sort(opt.getAgeSpeedDependency(), Comparator.comparing(EPoint::getX));

		if (closestLow == null) {
			return opt.getAgeSpeedDependency().get(0).getY();
		}

		if (closestHigh == null) {
			return opt.getAgeSpeedDependency().get(opt.getAgeSpeedDependency().size() - 1).getY();
		}

		return LinearInterpolation.getYAt(pax.getAge(), closestHigh.getY(), closestLow.getY(), closestHigh.getX(),
				closestLow.getX());

	}

	/**
	 *
	 * @return
	 */
	static double adaptWalkingSpeedWithLuggage(Passenger pax, LuggageProperties settings) {

		double speedFactor = 1.0;

		for (Luggage item : pax.getLuggage()) {

			switch (item.getType()) {
			case JACKET:
				speedFactor *= settings.getJacketWalkingSpeedFactor();
			case SMALL_BAG:
				speedFactor *= settings.getSmallBagWalkingSpeedFactor();
			case MEDIUM_BAG:
				speedFactor *= settings.getMediumBagWalkingSpeedFactor();
			case LARGE_BAG:
				speedFactor *= settings.getLargeBagWalkingSpeedFactor();
			}
		}

		return speedFactor;
	}

	/**
	 * Instantiates a new passenger property generator.
	 *
	 * @param pax the pax
	 */
	static void apply(Passenger pax) {

		PassengerProperties options = EObjectHelper.getParent(Model.class, pax).getSettings().getPassengerProperties();
		LuggageProperties lugOpt = EObjectHelper.getParent(Model.class, pax).getSettings().getLuggageProperties();

		if (options == null || lugOpt == null) {
			return;
		}

		// Define the mood of the passenger

		pax.setPassengerMood(
				RandomHelper.randomValue(0, 100) < options.getPassengerAggressiveMoodShare() ? PassengerMood.AGGRESSIVE
						: PassengerMood.PASSIVE);

		// Define the weight according to normal distribution
		pax.setWeight(adapt(pax, options.getPassengerWeightMeanMale(), options.getPassengerWeightDeviationMale(),
				options.getPassengerWeightMeanFemale(), options.getPassengerWeightDeviationFemale()));

		// Define the depth according to normal distribution
		pax.setDepth(adapt(pax, options.getPassengerDepthMeanMale(), options.getPassengerDepthDeviationMale(),
				options.getPassengerDepthMeanFemale(), options.getPassengerDepthDeviationFemale()));

		// Define the height according to normal distribution
		pax.setHeight(adapt(pax, options.getPassengerHeightMeanMale(), options.getPassengerHeightDeviationMale(),
				options.getPassengerHeightMeanFemale(), options.getPassengerHeightDeviationFemale()));

		// Define the width according to normal distribution
		pax.setWidth(adapt(pax, options.getPassengerWidthMeanMale(), options.getPassengerWidthDeviationMale(),
				options.getPassengerWidthMeanFemale(), options.getPassengerWidthDeviationFemale()));

		// Define the shoulder depth according to normal distribution
		pax.setDepthTop(adapt(pax, options.getPassengerShoulderDepthMeanMale(),
				options.getPassengerShoulderDepthDeviationMale(), options.getPassengerShoulderDepthMeanFemale(),
				options.getPassengerShoulderDepthDeviationFemale()));

		// Define the shoulder width according to normal distribution
		pax.setWidthTop(adapt(pax, options.getPassengerShoulderWidthMeanMale(),
				options.getPassengerShoulderWidthDeviationMale(), options.getPassengerShoulderWidthMeanFemale(),
				options.getPassengerShoulderWidthDeviationFemale()));

		// Define the shoulder height according to normal distribution
		pax.setHeightTop(adapt(pax, options.getPassengerShoulderHeightMeanMale(),
				options.getPassengerShoulderHeightDeviationMale(), options.getPassengerShoulderHeightMeanFemale(),
				options.getPassengerShoulderHeightDeviationFemale()));

		// Define the hip depth according to normal distribution
		pax.setDepthMiddle(
				adapt(pax, options.getPassengerHipDepthMeanMale(), options.getPassengerHipDepthDeviationMale(),
						options.getPassengerHipDepthMeanFemale(), options.getPassengerHipDepthDeviationFemale()));

		// Define the hip width according to normal distribution
		pax.setWidthMiddle(
				adapt(pax, options.getPassengerHipWidthMeanMale(), options.getPassengerHipWidthDeviationMale(),
						options.getPassengerHipWidthMeanFemale(), options.getPassengerHipWidthDeviationFemale()));

		// Define the hip height according to normal distribution
		pax.setHeightMiddle(
				adapt(pax, options.getPassengerHipHeightMeanMale(), options.getPassengerHipHeightDeviationMale(),
						options.getPassengerHipHeightMeanFemale(), options.getPassengerHipHeightDeviationFemale()));

		// Define the knee depth according to normal distribution
		pax.setDepthBottom(
				adapt(pax, options.getPassengerKneeDepthMeanMale(), options.getPassengerKneeDepthDeviationMale(),
						options.getPassengerKneeDepthMeanFemale(), options.getPassengerKneeDepthDeviationFemale()));

		// Define the knee width according to normal distribution
		pax.setWidthBottom(
				adapt(pax, options.getPassengerKneeWidthMeanMale(), options.getPassengerKneeWidthDeviationMale(),
						options.getPassengerKneeWidthMeanFemale(), options.getPassengerKneeWidthDeviationFemale()));

		// Define the knee height according to normal distribution
		pax.setHeightBottom(
				adapt(pax, options.getPassengerKneeHeightMeanMale(), options.getPassengerKneeHeightDeviationMale(),
						options.getPassengerKneeHeightMeanFemale(), options.getPassengerKneeHeightDeviationFemale()));

		// Define the walking speed according to age and carried luggage
		pax.setWalkingSpeed(adaptSpeed(pax, options) * adaptWalkingSpeedWithLuggage(pax, lugOpt));
	}
}