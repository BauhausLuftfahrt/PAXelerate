/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.ECollections;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.settings.PassengerProperties;
import com.paxelerate.model.settings.SettingsFactory;

/**
 * @author Marc.Engelmann
 *
 */
public interface PassengerPropertiesExtensions {

	// This array contains the age distribution in the united states in 2012. The
	// first value of the tuple is the male, the second one the female distribution.
	double[][] AGE_MODEL = { { 0.0349, 0.0333 }, { 0.0374, 0.0356 }, { 0.0374, 0.0356 }, { 0.0369, 0.0349 },

			{ 0.0344, 0.0330 }, { 0.0348, 0.0341 }, { 0.0367, 0.0362 }, { 0.0402, 0.0405 },

			{ 0.0395, 0.0402 }, { 0.0351, 0.0363 }, { 0.0306, 0.0319 }, { 0.0231, 0.0247 },

			{ 0.0183, 0.0201 }, { 0.0156, 0.0182 }, { 0.0139, 0.0176 }, { 0.0108, 0.0155 },

			{ 0.0065, 0.0111 }, { 0.0044, 0.0107 } };

	// This array contains two values, first the age of the passenger and second the
	// corresponding speed.
	Map<Integer, Double> SPEED_MODEL = new HashMap<Integer, Double>() {

		private static final long serialVersionUID = 1427318562840273451L;

		{
			put(5, 0.69);
			put(10, 1.18);
			put(15, 1.5);
			put(20, 1.6);
			put(25, 1.6);
			put(30, 1.55);
			put(35, 1.5);
			put(40, 1.5);
			put(45, 1.45);
			put(50, 1.42);
			put(55, 1.37);
			put(60, 1.3);
			put(65, 1.2);
			put(70, 1.05);
			put(75, 0.9);
			put(80, 0.7);
		}
	};

	/**
	 * @return
	 */
	static PassengerProperties create() {

		PassengerProperties props = SettingsFactory.eINSTANCE.createPassengerProperties();

		SPEED_MODEL.entrySet()
				.forEach(e -> props.getAgeSpeedDependency().add(EPointExtensions.create(e.getKey(), e.getValue())));

		ECollections.sort(props.getAgeSpeedDependency(), Comparator.comparing(EPoint::getX));

		for (int age = 1; age <= AGE_MODEL.length; age++) {
			props.getAgeDistribution()
					.add(EPointExtensions.create(age * 5.0 - 5, AGE_MODEL[age - 1][0], AGE_MODEL[age - 1][1]));
		}

		ECollections.sort(props.getAgeDistribution(), Comparator.comparing(EPoint::getX));

		return props;
	}

	/**
	 * @param properties
	 * @return
	 */
	static double getMaximumShoulderWidth(PassengerProperties properties) {
		return Math.max(properties.getPassengerWidthMeanMale() + properties.getPassengerWidthDeviationMale(),
				properties.getPassengerWidthMeanFemale() + properties.getPassengerWidthDeviationFemale());
	}

	/**
	 * @param properties
	 * @return
	 */
	static double getMaximumHeight(PassengerProperties properties) {
		return Math.max(properties.getPassengerHeightMeanMale() + properties.getPassengerHeightDeviationMale(),
				properties.getPassengerHeightMeanFemale() + properties.getPassengerHeightDeviationFemale());
	}
}
