/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.test.util.time;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.junit.Test;

import net.bhl.cdt.paxelerate.util.time.TimeHelper;

/**
 * Test class for TimeHelper.java imported from net.bhl.cdt.paxelerate.util.time
 * 
 * @author raoul.rothfeld
 */
public class TestTimeHelper {
	
	@Test
	public void getCurrentTimeOfDayTest() {
		// Retrieve current date and define time of day format
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		assertEquals("Wrong time format.", dateFormat.format(date), TimeHelper.getCurrentTimeOfDay());
	}
	
	@Test
	public void toTimeOfDayTest() {
		// Maximum number of seconds in a day
		int maxSeconds = 24*3600;		
		
		// Generate random number of seconds
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(maxSeconds);
		
		// Convert randomInt seconds to HH:mm:ss manually
		String expected = String.format("%02d:%02d:%02d", randomInt/3600, randomInt%3600/60, randomInt%3600%60);
		
		assertEquals("Wrong integer to time of day format.", expected, TimeHelper.toTimeOfDay(randomInt));
		assertEquals("Wrong double to time of day format.", expected, TimeHelper.toTimeOfDay((double) randomInt));
		assertEquals("Wrong long to time of day format.", expected, TimeHelper.toTimeOfDay((long) randomInt));
	}
}