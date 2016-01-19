/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.test.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import net.bhl.cdt.paxelerate.util.OS;
import net.bhl.cdt.paxelerate.util.OS.OSType;

/**
 * Test class for OS.java imported from net.bhl.cdt.paxelerate.util
 * 
 * @author raoul.rothfeld
 */
public class TestOS {

	@Test
	public void isOSTest() {
		// There must always be one true response (i.e. one running OS)
		int expectedResponses = 1;

		// Record number of true responses for each OS possibility
		int actualResponses = 0;
		if (OS.isWindows())
			actualResponses++;
		if (OS.isMac())
			actualResponses++;
		if (OS.isSolaris())
			actualResponses++;
		if (OS.isUnix())
			actualResponses++;

		// Test if exactly one OS has been recognized
		assertEquals("No or more than one OS detected.", expectedResponses, actualResponses);
	}

	@Test
	public void OSTypeTest() {
		// Retrieve active OS
		OSType activeOS = OS.getOSType();

		// Check if OS is listed as enumerator in OSType
		boolean found = false;
		for (OSType type : OSType.values())
			if (!found)
				found = (type == activeOS);
		assertTrue("OS type unrecognised.", found);
	}
}