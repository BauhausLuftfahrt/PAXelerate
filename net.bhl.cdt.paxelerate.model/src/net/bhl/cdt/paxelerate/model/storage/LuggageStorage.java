/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.model.storage;

import net.bhl.cdt.paxelerate.model.LuggageSize;

public class LuggageStorage {

	private int counter = 0, noLuggageCount = 0, smallLuggageCount = 0,
			mediumLuggageCount = 0, bigLuggageCount = 0;

	public LuggageStorage() {

	}

	public void addValue(LuggageSize size) {

		counter++;

		switch (size) {
		default:
			noLuggageCount++;
			break;
		case SMALL:
			smallLuggageCount++;
			break;
		case MEDIUM:
			mediumLuggageCount++;
			break;
		case BIG:
			bigLuggageCount++;
			break;
		}
	}

	public int getLuggageCount(LuggageSize size) {
		switch (size) {
		default:
			return noLuggageCount;

		case SMALL:
			return smallLuggageCount;

		case MEDIUM:
			return mediumLuggageCount;

		case BIG:
			return bigLuggageCount;
		}
	}

	public double getLuggagePercentage(LuggageSize size) {
		try {
			switch (size) {
			default:
				return noLuggageCount / (double) counter;

			case SMALL:
				return smallLuggageCount / (double) counter;

			case MEDIUM:
				return mediumLuggageCount / (double) counter;

			case BIG:
				return bigLuggageCount / (double) counter;
			}
		} catch (ArithmeticException e) {
			return 0;
		}
	}

	public int getAmount() {
		return counter;
	}
}
