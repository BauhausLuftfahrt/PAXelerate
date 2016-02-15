/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.util.string;

/**
 * 
 * @author marc.engelmann, raoul.rothfeld
 *
 */
public class StringHelper {

	/**
	 * Protect constructor since it is a static only class
	 */
	protected StringHelper() {
	}

	/**
	 * This method splits camel case strings into normal strings with spaces.
	 * 
	 * @param s
	 *            is the string that should be transformed.
	 * @return returns the transformed string
	 */
	public static String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	/**
	 * @see <a href=
	 *      "http://stackoverflow.com/questions/237159/whats-the-best-way-to-check-to-see-if-a-string-represents-an-integer-in-java">
	 *      Stackoverflow question on faster options to Integer.parseInt()</a>
	 * @param str
	 * @return
	 */
	public static boolean isInteger(String str) {
		if (str.isEmpty())
			return false;
		
		int length = str.length(), i = 0;
		if (str.charAt(0) == '-') {
			if (length == 1) {
				return false;
			}
			i = 1;
		}
		for (; i < length; i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') {
				if(c != '-') {
				return false;
				}
			}
		}
		return true;
	}

	/**
	 * @see <a href=
	 *      "http://stackoverflow.com/questions/237159/whats-the-best-way-to-check-to-see-if-a-string-represents-an-integer-in-java">
	 *      Stackoverflow question on faster options to Integer.parseInt()</a>
	 * @param str
	 * @return
	 */
	public static boolean isPositiveInteger(String str) {
		if (str.isEmpty())
			return false;

		if (str.charAt(0) == '-')
			return false;

		return StringHelper.isInteger(str);
	}

	/**
	 * This method returns a letter for a integer in the alphabet.
	 * 
	 * @param i
	 *            the integer
	 * @return the letter which represents the number.
	 */
	public static String toString(int i) {
		return i > 0 && i < 27 ? "" + (char) (i + 'A' - 1) : null;
	}

}