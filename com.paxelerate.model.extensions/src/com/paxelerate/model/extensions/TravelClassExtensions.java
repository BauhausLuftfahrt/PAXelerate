/*******************************************************************************
 * <copyright> Copyright (c) since 2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the GNU General Public License v3.0 which accompanies this distribution,
 * and is available at https://www.gnu.org/licenses/gpl-3.0.html.en </copyright>
 *******************************************************************************/
package com.paxelerate.model.extensions;

import com.paxelerate.model.enums.TravelClass;

/**
 * @author Marc.Engelmann
 * @since 09.08.2019
 *
 */
public interface TravelClassExtensions {

	String CPACS_BOARDING_CLASS_ECONOMY_LITERAL = "economy";
	String CPACS_BOARDING_CLASS_PREMIUM_ECONOMY_LITERAL = "premiumeconomy";
	String CPACS_BOARDING_CLASS_BUSINESS_LITERAL = "business";
	String CPACS_BOARDING_CLASS_FIRST_LITERAL = "first";

	/**
	 *
	 * @param cabin
	 * @param className
	 * @return
	 */
	static TravelClass getClassByCPACSLiteral(String className) {

		switch (className) {
		case CPACS_BOARDING_CLASS_BUSINESS_LITERAL:
			return TravelClass.BUSINESS;

		case CPACS_BOARDING_CLASS_PREMIUM_ECONOMY_LITERAL:
			return TravelClass.PREMIUM_ECONOMY;

		case CPACS_BOARDING_CLASS_FIRST_LITERAL:
			return TravelClass.FIRST;

		case CPACS_BOARDING_CLASS_ECONOMY_LITERAL:
			return TravelClass.ECONOMY;

		default:
			return TravelClass.ECONOMY;
		}
	}
}
