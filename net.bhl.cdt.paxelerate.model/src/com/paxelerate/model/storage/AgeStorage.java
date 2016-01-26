package com.paxelerate.model.storage;

import com.paxelerate.model.Sex;

public class AgeStorage {

	private int[] agesMale = new int[100], agesFemale = new int[100],
			agesTotal = new int[100];

	private int minimumAgeMale = Integer.MAX_VALUE,
			minimumAgeFemale = Integer.MAX_VALUE,
			minimumAgeTotal = Integer.MAX_VALUE;

	private int maximumAgeMale = 0, maximumAgeFemale = 0, maximumAgeTotal = 0;

	private int ageSumTotal = 0;

	private int numberOfAgeValuesTotal = 0;

	private double averageAgeTotal = 0;

	private int maximumAmountOfOneAgeMale = 0, maximumAmountOfOneAgeFemale = 0,
			maximumAmountOfOneAgeTotal;

	private int minimumAmountOfOneAgeMale = 0, minimumAmountOfOneAgeFemale = 0;

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

	public void updateMaximumAge(Sex sex, int age) {
		if (sex == Sex.MALE) {
			maximumAgeMale = Math.max(maximumAgeMale, age);
		} else if (sex == null) {
			maximumAgeTotal = Math.max(maximumAgeTotal, age);
		} else {
			maximumAgeFemale = Math.max(maximumAgeFemale, age);
		}
	}

	public void updateAverageAge(Sex sex) {
		if (sex == null) {
			averageAgeTotal = (double) ageSumTotal
					/ (double) numberOfAgeValuesTotal;
		} else {
			// DO NOTING!
		}
	}

	public void updateMinimumAge(Sex sex, int age) {
		if (sex == Sex.MALE) {
			minimumAgeMale = Math.min(minimumAgeMale, age);
		} else if (sex == null) {
			minimumAgeTotal = Math.min(minimumAgeTotal, age);
		} else {
			minimumAgeFemale = Math.min(minimumAgeFemale, age);
		}
	}

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

	public double getAverageAge(Sex sex) {

		updateAverageAge(sex);
		updateAverageAge(null);

		if (sex == null) {
			return averageAgeTotal;
		} else {
			return -Integer.MAX_VALUE;
		}

	}

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
