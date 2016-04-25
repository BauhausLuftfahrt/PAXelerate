/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

/**
 * The Enum GaussOptions.
 */
public enum GaussOptions {
	
	/** The PERCEN t_99. */
	PERCENT_99(2.576), 
 /** The PERCEN t_95. */
 PERCENT_95(1.960), 
 /** The PERCEN t_90. */
 PERCENT_90(1.645), 
 /** The PERCEN t_50. */
 PERCENT_50(0.675);

	/** The sigma. */
	private final double sigma;

	/**
	 * Instantiates a new gauss options.
	 *
	 * @param sigma the sigma
	 */
	GaussOptions(double sigma) {
		this.sigma = sigma;
	}

	/**
	 * Gets the sigma.
	 *
	 * @return the sigma
	 */
	public double getSigma() {
		return sigma;
	}
}
