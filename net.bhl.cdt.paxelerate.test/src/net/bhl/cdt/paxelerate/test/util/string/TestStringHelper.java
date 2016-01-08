/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.test.util.string;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import net.bhl.cdt.paxelerate.util.string.StringHelper;

/**
 * Test class for StringHelper.java imported from
 * net.bhl.cdt.paxelerate.util.string
 * 
 * @author raoul.rothfeld
 */
public class TestStringHelper {

	// Provide random Integer generator
	private static Random randomGenerator = new Random();
	
	@Test
	public void isEmptyTest() {
		// Test empty Strings
		assertTrue("null falsely rejected as non-emtpy.",StringHelper.isEmpty(null));
		assertTrue("\"\" falsely rejected as non-emtpy.",StringHelper.isEmpty(""));
		
		// Test non-empty Strings
		assertFalse("\" \" falsely accepted as empty.",StringHelper.isEmpty(" "));
		assertFalse("AaBbCc falsely accepted as empty.",StringHelper.isEmpty("AaBbCc"));
	}

	@Test
	public void isIntegerTest() {
		// Create and test non-Integer Strings
		String[] nonIntegers = { "AaBbCc", "123ABC", "§$%&/(", "€10",
				"" + randomGenerator.nextInt() + "," + randomGenerator.nextInt(100),
				"" + randomGenerator.nextInt() + "." + randomGenerator.nextInt(100), "+" + randomGenerator.nextInt() };
		for (String text : nonIntegers)
			assertFalse(text + " falsely accepted as Integer.", StringHelper.isInteger(text));
		
		// Create and test Integer Strings
		String[] integers = { "0", "" + randomGenerator.nextInt(), "" + Integer.MAX_VALUE };
		for (String number : integers)
			assertTrue(number + " falsely rejected as Text.", StringHelper.isInteger(number));
	}

	@Test
	public void isPositiveIntegerTest() {
		// Create and test negative Integer
		String negativeInteger = "" + randomGenerator.nextInt(Integer.MAX_VALUE) * (-1);
		assertFalse(negativeInteger + " falsely accepted as positive Integer.",
				StringHelper.isPositiveInteger(negativeInteger));

		// Create and test positive Integer
		String positiveInteger = "" + randomGenerator.nextInt(Integer.MAX_VALUE);
		assertTrue(positiveInteger + " falsely declined as non-positive Integer.",
				StringHelper.isPositiveInteger(positiveInteger));
	}
}