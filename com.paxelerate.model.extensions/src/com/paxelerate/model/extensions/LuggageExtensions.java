/*******************************************************************************
 * <copyright> Copyright (c) 2014 - 2021 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v2.0 which accompanies this distribution,
 * and is available at https://www.eclipse.org/legal/epl-v20.html </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.Model;
import com.paxelerate.model.agent.Passenger;
import com.paxelerate.model.enums.LuggageType;
import com.paxelerate.model.settings.LuggageProperties;

import net.bhl.opensource.toolbox.emf.EObjectHelper;
import net.bhl.opensource.toolbox.math.gaussian.Gaussian;
import net.bhl.opensource.toolbox.math.gaussian.Gaussian.Sigma;

/**
 *
 * @author Marc.Engelmann
 *
 */
public interface LuggageExtensions {

	/**
	 * This function adapts a specific luggage stowing time using a Gaussian
	 * distribution depending on the luggage size.
	 *
	 * @param luggageType2
	 *
	 * @param passengerPropertyGenerator
	 *
	 * @param luggageType
	 *
	 * @return stowing time in s
	 */
	static double adaptStowTime(LuggageProperties settings, LuggageType luggageType) {

		switch (luggageType) {
		case JACKET:
			return Gaussian.random(settings.getJacketStowTimeMean(), Sigma.PERCENT_95,
					settings.getJacketStowTimeDeviation());
		case SMALL_BAG:
			return Gaussian.random(settings.getSmallBagStowTimeMean(), Sigma.PERCENT_95,
					settings.getSmallBagStowTimeDeviation());
		case MEDIUM_BAG:
			return Gaussian.random(settings.getMediumBagStowTimeMean(), Sigma.PERCENT_95,
					settings.getMediumBagStowTimeDeviation());
		case LARGE_BAG:
			return Gaussian.random(settings.getLargeBagStowTimeMean(), Sigma.PERCENT_95,
					settings.getLargeBagStowTimeDeviation());
		default:
			return 0;
		}

	}

	/**
	 * @param settings
	 * @param luggageType
	 * @return
	 */
	static double adaptVolume(LuggageProperties settings, LuggageType luggageType) {

		switch (luggageType) {
		case JACKET:
			return settings.getJacketVolume();

		case SMALL_BAG:
			return settings.getSmallBagVolume();

		case MEDIUM_BAG:
			return settings.getMediumBagVolume();

		case LARGE_BAG:
			return settings.getLargeBagVolume();

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
	static double getLuggageStowDistance(Passenger passenger) {

		LuggageProperties settings = EObjectHelper.getParent(Model.class, passenger).getSettings()
				.getLuggageProperties();

		double stowingDistance = Gaussian.random(settings.getLuggageStowDistanceFromSeatMean(), Sigma.PERCENT_95,
				settings.getLuggageStowDistanceFromSeatDeviation());

		if (stowingDistance < 0.30) {
			return 0.3;
		}

		// TODO!
		// double xPositionPaxSeat =
		// SeatExtensions.getPosition(passenger.getSeat()).getX();
		// double xPositionDoor = passenger.getDoor().getXPosition();
		// double doorWidth = DoorExtensions.getWidth(passenger.getDoor());

		// if (((Math.abs(xPositionPaxSeat - xPositionDoor) - doorWidth) <
		// stowingDistance)) {
		// /* luggage is stowed very close to the seat (30cm) */
		// return 0.30;
		// }

		return stowingDistance;
	}
}
