/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.model.storage;

import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.paxelerate.model.storage.StorageHandler.StoreType;

/**
 * The Class GaussianStorage.
 */
public class GaussianStorage {

	/** The number male. */
	private int numberFemale = 0, numberMale = 0;

	/** The average male. */
	private double averageFemale = 0, averageMale = 0;

	/** The maximum male. */
	private double maximumFemale = 0, maximumMale = 0;

	/** The minimum male. */
	private double minimumFemale = Integer.MAX_VALUE,
			minimumMale = Integer.MAX_VALUE;

	/** The sum male. */
	private double sumFemale = 0, sumMale = 0;

	/** The type. */
	private final StoreType type;

	/**
	 * Instantiates a new gaussian storage.
	 *
	 * @param type the type
	 */
	public GaussianStorage(StoreType type) {
		this.type = type;
	}

	/**
	 * Gets the store type.
	 *
	 * @return the store type
	 */
	public StoreType getStoreType() {
		return type;
	}

	/**
	 * Adds the value.
	 *
	 * @param sex the sex
	 * @param value the value
	 */
	public void addValue(Sex sex, double value) {
		if (sex == Sex.MALE) {
			numberMale++;
			sumMale += value;
		} else {
			numberFemale++;
			sumFemale += value;
		}

		updateAverage();
		updateMinimum(sex, value);
		updateMaximum(sex, value);
	}

	/**
	 * Update average.
	 */
	private void updateAverage() {

		averageMale = sumMale / (double) numberMale;
		averageFemale = sumFemale / (double) numberFemale;
	}

	/**
	 * Update minimum.
	 *
	 * @param sex the sex
	 * @param value the value
	 */
	private void updateMinimum(Sex sex, double value) {
		if (sex == Sex.MALE) {
			minimumMale = Math.min(value, minimumMale);
		} else {
			minimumFemale = Math.min(value, minimumFemale);
		}
	}

	/**
	 * Update maximum.
	 *
	 * @param sex the sex
	 * @param value the value
	 */
	private void updateMaximum(Sex sex, double value) {
		if (sex == Sex.MALE) {
			maximumMale = Math.max(maximumMale, value);
		} else {
			maximumFemale = Math.max(maximumFemale, value);
		}

	}

	/**
	 * Gets the maximum.
	 *
	 * @param sex the sex
	 * @return the maximum
	 */
	public double getMaximum(Sex sex) {
		if (sex == Sex.MALE) {
			return maximumMale;
		} else {
			return maximumFemale;
		}
	}

	/**
	 * Gets the minimum.
	 *
	 * @param sex the sex
	 * @return the minimum
	 */
	public double getMinimum(Sex sex) {
		if (sex == Sex.MALE) {
			return minimumMale;
		} else {
			return minimumFemale;
		}
	}

	/**
	 * Gets the average.
	 *
	 * @param sex the sex
	 * @return the average
	 */
	public double getAverage(Sex sex) {
		if (sex == Sex.MALE) {
			return averageMale;
		} else {
			return averageFemale;
		}
	}

	/**
	 * Gets the sum.
	 *
	 * @param sex the sex
	 * @return the sum
	 */
	public double getSum(Sex sex) {
		if (sex == Sex.MALE) {
			return sumMale;
		} else {
			return sumFemale;
		}
	}

	/**
	 * Gets the amount.
	 *
	 * @param sex the sex
	 * @return the amount
	 */
	public double getAmount(Sex sex) {
		if (sex == Sex.MALE) {
			return numberMale;
		} else {
			return numberFemale;
		}
	}
}
