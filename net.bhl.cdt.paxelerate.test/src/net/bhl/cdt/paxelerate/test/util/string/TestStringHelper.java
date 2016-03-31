/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.test.util.string;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

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
	private static Random rand = new Random();

	@Test
	public void isIntegerTest() {
		// Create and test non-Integer Strings
		String[] nonIntegers = { "AaBbCc", "123ABC", "§$%&/(", "€10", "" + rand.nextInt() + "," + rand.nextInt(100),
				"" + rand.nextInt() + "." + rand.nextInt(100), "+" + rand.nextInt() };
		for (String text : nonIntegers)
			assertFalse(text + " falsely accepted as Integer.", StringHelper.isInteger(text));

		// Create and test Integer Strings
		String[] integers = { "0", "" + rand.nextInt(), "" + Integer.MAX_VALUE };
		for (String number : integers)
			assertTrue(number + " falsely rejected as Text.", StringHelper.isInteger(number));
	}

	@Test
	public void isPositiveIntegerTest() {
		// Create and test negative Integer
		String negativeInteger = "" + rand.nextInt(Integer.MAX_VALUE) * (-1);
		assertFalse(negativeInteger + " falsely accepted as positive Integer.",
				StringHelper.isPositiveInteger(negativeInteger));

		// Create and test positive Integer
		String positiveInteger = "" + rand.nextInt(Integer.MAX_VALUE);
		assertTrue(positiveInteger + " falsely declined as non-positive Integer.",
				StringHelper.isPositiveInteger(positiveInteger));
	}

	@Test
	public void toStringTest() {
		assertNull("0 falsely converted to char.", StringHelper.toString(0));
		assertEquals("1 not converted to A.", StringHelper.toString(1), "A");
		assertEquals("5 not converted to E.", StringHelper.toString(5), "E");
		assertEquals("26 not converted to Z.", StringHelper.toString(26), "Z");
		assertNull("27 falsely converted to char.", StringHelper.toString(27));
	}

	@Test
	public void splitCamelCaseTest() {
		String[] tests = { "lowercase", "Class", "MyClassTestTesterText", "HTML", "PDFLoader", "AString", "SimpleXMLParser",
				"GL11Version", "99Bottles", "May5", "BFG9000" };
		String[] expected = { "lowercase", "Class", "My Class Test Tester Text", "HTML", "PDF Loader", "A String", "Simple XML Parser",
				"GL 11 Version", "99 Bottles", "May 5", "BFG 9000" };
		for (int i = 0; i < tests.length; i++) {
			assertEquals(tests[i] + " incorrectly converted from CamelCase.", StringHelper.splitCamelCase(tests[i]),
					expected[i]);
		}
	}

}