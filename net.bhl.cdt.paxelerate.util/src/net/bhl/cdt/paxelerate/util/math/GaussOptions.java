/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

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
