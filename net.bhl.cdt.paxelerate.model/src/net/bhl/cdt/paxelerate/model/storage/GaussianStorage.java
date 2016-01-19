package net.bhl.cdt.paxelerate.model.storage;

import net.bhl.cdt.paxelerate.model.Sex;
import net.bhl.cdt.paxelerate.model.storage.StorageHandler.StoreType;

public class GaussianStorage {

	private int numberFemale = 0, numberMale = 0;

	private double averageFemale = 0, averageMale = 0;

	private double maximumFemale = 0, maximumMale = 0;

	private double minimumFemale = Integer.MAX_VALUE,
			minimumMale = Integer.MAX_VALUE;

	private double sumFemale = 0, sumMale = 0;

	private final StoreType type;

	public GaussianStorage(StoreType type) {
		this.type = type;
	}

	public StoreType getStoreType() {
		return type;
	}

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

	private void updateAverage() {

		averageMale = sumMale / (double) numberMale;
		averageFemale = sumFemale / (double) numberFemale;
	}

	private void updateMinimum(Sex sex, double value) {
		if (sex == Sex.MALE) {
			minimumMale = Math.min(value, minimumMale);
		} else {
			minimumFemale = Math.min(value, minimumFemale);
		}
	}

	private void updateMaximum(Sex sex, double value) {
		if (sex == Sex.MALE) {
			maximumMale = Math.max(maximumMale, value);
		} else {
			maximumFemale = Math.max(maximumFemale, value);
		}

	}

	public double getMaximum(Sex sex) {
		if (sex == Sex.MALE) {
			return maximumMale;
		} else {
			return maximumFemale;
		}
	}

	public double getMinimum(Sex sex) {
		if (sex == Sex.MALE) {
			return minimumMale;
		} else {
			return minimumFemale;
		}
	}

	public double getAverage(Sex sex) {
		if (sex == Sex.MALE) {
			return averageMale;
		} else {
			return averageFemale;
		}
	}

	public double getSum(Sex sex) {
		if (sex == Sex.MALE) {
			return sumMale;
		} else {
			return sumFemale;
		}
	}

	public double getAmount(Sex sex) {
		if (sex == Sex.MALE) {
			return numberMale;
		} else {
			return numberFemale;
		}
	}
}
