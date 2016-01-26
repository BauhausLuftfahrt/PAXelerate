/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package com.paxelerate.util.toOpenCDT;

/**
 * Identification class for host's operating system.
 * 
 * TODO michael.shamiyeh, shift to OpenCDT
 * 
 * @author marc.engelmann, raoul.rothfeld
 */
public final class OS {

	/**
	 * OS type categorization
	 * @author raoul.rothfeld
	 */
	public enum OSType {
		Windows, MacOS, Linux, Solaris, Other
	}
	
	/**
	 * Set class constructor to private to enforce singleton use
	 */
	private OS() {}

	/**
	 * Instance variable storing the active OS type enumerator
	 */
	private static OSType activeOS;

	/**
	 * Private population of the OS type instance variable to one-time OS retrieval from host system
	 * @return active OS type enumerator
	 * @author marc.engelmann, raoul.rothfeld
	 */
	private static OSType getActiveOS() {
		if (activeOS == null) {
			String OS = System.getProperty("os.name").toLowerCase();
			if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {
				activeOS = OSType.MacOS;
			} else if (OS.indexOf("win") >= 0) {
				activeOS = OSType.Windows;
			} else if (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0) {
				activeOS = OSType.Linux;
			} else if (OS.indexOf("sunos") >= 0) {
				activeOS = OSType.Solaris;
			} else {
				activeOS = OSType.Other;
			}
		}
		return activeOS;
	}

	/**
	 * Retrieve active OS type
	 * @return active OS type enumerator
	 */
	public static OSType getOSType() {
		return getActiveOS();
	}

	/**
	 * Test if OS type is Windows
	 * @return whether OS type is Windows
	 */
	public static boolean isWindows() {
		return getActiveOS() == OSType.Windows;
	}

	/**
	 * Test if OS type is MacOS
	 * @return whether OS type is MacOS
	 */
	public static boolean isMac() {
		return getActiveOS() == OSType.MacOS;
	}

	/**
	 * Test if OS type is Linux
	 * @return whether OS type is Linux
	 */
	public static boolean isUnix() {
		return getActiveOS() == OSType.Linux;
	}

	/**
	 * Test if OS type is Solaris
	 * @return whether OS type is Solaris
	 */
	public static boolean isSolaris() {
		return getActiveOS() == OSType.Solaris;
	}
}