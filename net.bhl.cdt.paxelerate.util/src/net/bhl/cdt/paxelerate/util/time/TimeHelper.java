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
 * 
 * @author marc.engelmann, raoul.rothfeld
 *
 */
public class TimeHelper {
	
	/**
	 * 
	 * @param seconds
	 * @return
	 */
	public static String toTimeOfDay(int seconds) {
		return TimeHelper.toTimeOfDay(seconds);
	}
	
	/**
	 * 
	 * @param seconds
	 * @return
	 */
	public static String toTimeOfDay(long seconds) {
		LocalTime timeOfDay = LocalTime.ofSecondOfDay(seconds);
		return timeOfDay.toString();
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getCurrentTimeOfDay() {
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
	
	@Deprecated
	public static String transformToTimeString(double timeInSeconds) {

		int hours = (int) (timeInSeconds / 3600);
		int minutes = (int) (timeInSeconds / 60) - hours * 60;
		int seconds = (int) (timeInSeconds % 60);

		String hoursAppend = "";
		String minutesAppend = "";
		String secondsAppend = "";

		if (hours < 10) {
			hoursAppend = "0";
		}
		if (minutes < 10) {
			minutesAppend = "0";
		}
		if (seconds < 10) {
			secondsAppend = "0";
		}

		return new String(hoursAppend + hours + ":" + minutesAppend + minutes + ":" + secondsAppend + seconds);
	}

	@Deprecated
	public static String getCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}
}
