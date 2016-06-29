/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.model.storage;

import net.bhl.cdt.paxelerate.model.Sex;

/**
 * The Class DistributionStorage.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
public class DistributionStorage {

	/** The ages total. */
	private int[] agesMale = new int[100], agesFemale = new int[100],
			agesTotal = new int[100];

	/** The minimum age total. */
	private int minimumAgeMale = Integer.MAX_VALUE,
			minimumAgeFemale = Integer.MAX_VALUE,
			minimumAgeTotal = Integer.MAX_VALUE;

	/** The maximum age total. */
	private int maximumAgeMale = 0, maximumAgeFemale = 0, maximumAgeTotal = 0;

	/** The age sum total. */
	private int ageSumTotal = 0;

	/** The number of age values total. */
	private int numberOfAgeValuesTotal = 0;

	/** The average age total. */
	private double averageAgeTotal = 0;

	/** The maximum amount of one age total. */
	private int maximumAmountOfOneAgeMale = 0, maximumAmountOfOneAgeFemale = 0,
			maximumAmountOfOneAgeTotal;

	/** The minimum amount of one age female. */
	private int minimumAmountOfOneAgeMale = 0, minimumAmountOfOneAgeFemale = 0;

	/**
	 * Adds the value.
	 *
	 * @param sex the sex
	 * @param age the age
	 */
	public void addValue(Sex sex, int age) {
		if (sex == Sex.MALE) {
			agesMale[age] += 1;
		} else {
			agesFemale[age] += 1;
		}

		agesTotal[age] += 1;

		ageSumTotal += age;

		updateMaximumAge(sex, age);
		updateMaximumAge(null, age);

		updateMinimumAge(sex, age);
		updateMinimumAge(null, age);

		numberOfAgeValuesTotal++;
	}

	/**
	 * Update maximum age.
	 *
	 * @param sex the sex
	 * @param age the age
	 */
	public void updateMaximumAge(Sex sex, int age) {
		if (sex == Sex.MALE) {
			maximumAgeMale = Math.max(maximumAgeMale, age);
		} else if (sex == null) {
			maximumAgeTotal = Math.max(maximumAgeTotal, age);
		} else {
			maximumAgeFemale = Math.max(maximumAgeFemale, age);
		}
	}

	/**
	 * Update average age.
	 *
	 * @param sex the sex
	 */
	public void updateAverageAge(Sex sex) {
		if (sex == null) {
			averageAgeTotal = (double) ageSumTotal
					/ (double) numberOfAgeValuesTotal;
		} else {
			// DO NOTING!
		}
	}

	/**
	 * Update minimum age.
	 *
	 * @param sex the sex
	 * @param age the age
	 */
	public void updateMinimumAge(Sex sex, int age) {
		if (sex == Sex.MALE) {
			minimumAgeMale = Math.min(minimumAgeMale, age);
		} else if (sex == null) {
			minimumAgeTotal = Math.min(minimumAgeTotal, age);
		} else {
			minimumAgeFemale = Math.min(minimumAgeFemale, age);
		}
	}

	/**
	 * Update maximum amount.
	 */
	public void updateMaximumAmount() {

		for (int ageAmount : agesMale) {
			maximumAmountOfOneAgeMale = Math.max(maximumAmountOfOneAgeMale,
					ageAmount);
		}
		for (int ageAmount : agesFemale) {
			maximumAmountOfOneAgeFemale = Math.max(maximumAmountOfOneAgeFemale,
					ageAmount);
		}
		for (int ageAmount : agesTotal) {
			maximumAmountOfOneAgeTotal = Math.max(maximumAmountOfOneAgeTotal,
					ageAmount);
		}
	}

	/**
	 * Gets the data.
	 *
	 * @param sex the sex
	 * @return the data
	 */
	public int[] getData(Sex sex) {
		if (sex == null) {
			return agesTotal;
		}
		if (sex == Sex.MALE) {
			return agesMale;
		} else {
			return agesFemale;
		}
	}

	/**
	 * Gets the average age.
	 *
	 * @param sex the sex
	 * @return the average age
	 */
	public double getAverageAge(Sex sex) {

		updateAverageAge(sex);
		updateAverageAge(null);

		if (sex == null) {
			return averageAgeTotal;
		} else {
			return -Integer.MAX_VALUE;
		}

	}

	/**
	 * Gets the minimum age.
	 *
	 * @param sex the sex
	 * @return the minimum age
	 */
	public int getMinimumAge(Sex sex) {
		if (sex == null) {
			return minimumAgeTotal;
		}
		if (sex == Sex.MALE) {
			return minimumAgeMale;
		} else {
			return minimumAgeFemale;
		}
	}

	/**
	 * Gets the maximum age.
	 *
	 * @param sex the sex
	 * @return the maximum age
	 */
	public int getMaximumAge(Sex sex) {
		if (sex == null) {
			return maximumAgeTotal;
		}
		if (sex == Sex.MALE) {
			return maximumAgeMale;
		} else {
			return maximumAgeFemale;
		}
	}

	/**
	 * Gets the maximum amount.
	 *
	 * @param sex the sex
	 * @return the maximum amount
	 */
	public int getMaximumAmount(Sex sex) {
		updateMaximumAmount();

		if (sex == null) {
			return maximumAmountOfOneAgeTotal;
		}
		if (sex == Sex.MALE) {
			return maximumAmountOfOneAgeMale;
		} else {
			return maximumAmountOfOneAgeFemale;
		}
	}

	/**
	 * Clear.
	 */
	public void clear() {
		agesMale = new int[100];
		agesFemale = new int[100];
		agesTotal = new int[100];
		minimumAgeMale = Integer.MAX_VALUE;
		minimumAgeFemale = Integer.MAX_VALUE;
		minimumAgeTotal = Integer.MAX_VALUE;
		maximumAgeMale = 0;
		maximumAgeFemale = 0;
		maximumAgeTotal = 0;
		ageSumTotal = 0;
		numberOfAgeValuesTotal = 0;
		averageAgeTotal = 0;
		maximumAmountOfOneAgeMale = 0;
		maximumAmountOfOneAgeFemale = 0;
		maximumAmountOfOneAgeTotal = 0;
		minimumAmountOfOneAgeMale = 0;
		minimumAmountOfOneAgeFemale = 0;
	}
}
