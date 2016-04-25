/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.util.time;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;

/**
 * Supports formatting various time amounts into HH:mm:ss format.
 *
 * @author marc.engelmann, raoul.rothfeld
 */
public class TimeHelper {

	/**
	 * Formats time amount in seconds into HH:mm:ss format.
	 *
	 * @param seconds            the number of seconds to be formatted
	 * @return the converted HH:mm:ss String
	 */
	public static String toTimeOfDay(int seconds) {
		return TimeHelper.toTimeOfDay((long) seconds);
	}

	/**
	 * Formats time amount in seconds into HH:mm:ss format.
	 *
	 * @param seconds            the number of seconds to be formatted
	 * @return the converted HH:mm:ss String
	 */
	public static String toTimeOfDay(double seconds) {
		return TimeHelper.toTimeOfDay(Math.round(seconds));
	}

	/**
	 * Formats time amount in seconds into HH:mm:ss format.
	 *
	 * @param seconds            the number of seconds to be formatted
	 * @return the converted HH:mm:ss String
	 */
	public static String toTimeOfDay(long seconds) {
		return LocalTime.ofSecondOfDay(seconds).toString();
	}

	/**
	 * Delivers the current time in HH:mm:ss format.
	 *
	 * @return the current time as HH:mm:ss String
	 */
	public static String getCurrentTimeOfDay() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}