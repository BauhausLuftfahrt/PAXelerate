package net.bhl.cdt.paxelerate.util;

public class OS {

	private static String OSString = System.getProperty("os.name").toLowerCase();

	public static boolean isWindows() {

		return (OSString.indexOf("win") >= 0);

	}

	public static boolean isMac() {

		return (OSString.indexOf("mac") >= 0);

	}

	public static boolean isUnix() {

		return (OSString.indexOf("nix") >= 0 || OSString.indexOf("nux") >= 0 || OSString.indexOf("aix") > 0);

	}

	public static boolean isSolaris() {

		return (OSString.indexOf("sunos") >= 0);

	}

}
