package net.bhl.cdt.paxelerate.util.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeHelper {
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

		return new String(hoursAppend + hours + ":" + minutesAppend + minutes
				+ ":" + secondsAppend + seconds);
	}

	public static String getCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdfDate.format(now);
		return strDate;
	}
}
