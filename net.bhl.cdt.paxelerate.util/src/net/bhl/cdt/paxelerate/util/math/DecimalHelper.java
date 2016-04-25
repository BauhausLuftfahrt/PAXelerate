/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.util.math;

import java.math.BigDecimal;

/**
 * This utility class rounds a decimal number.
 * 
 * @author www.codejava.net
 *
 */
public class DecimalHelper {

	/**
	 * Instantiates a new decimal helper.
	 */
	protected DecimalHelper() {

	}

	/**
	 * Round.
	 *
	 * @param value the value
	 * @param numberOfDigitsAfterDecimalPoint the number of digits after decimal point
	 * @return the double
	 */
	public static double round(double value, int numberOfDigitsAfterDecimalPoint) {
		BigDecimal bigDecimal = new BigDecimal(value);
		bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
		return bigDecimal.doubleValue();
	}

	/**
	 * Percentage.
	 *
	 * @param value the value
	 * @param maximumValue the maximum value
	 * @return the int
	 */
	public static int percentage(double value, double maximumValue) {
		return (int) ((value / maximumValue) * 100.0);
	}
}