package com.paxelerate.util.math;

public enum GaussOptions {
	PERCENT_99(2.576), PERCENT_95(1.960), PERCENT_90(1.645), PERCENT_50(0.675);

	private final double sigma;

	GaussOptions(double sigma) {
		this.sigma = sigma;
	}

	public double getSigma() {
		return sigma;
	}
}
