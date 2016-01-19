/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.util.string;

public class StringHelper {
	/**
	 * Check if there are two of the same characters directly after each other,
	 * like in <i>balloon</i>.
	 * 
	 * @param str
	 *            the string
	 * @return a character is repeating
	 */
	@Deprecated
	public static boolean checkForDoubleCharacter(String str) {
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method splits camel case strings into normal strings with spaces.
	 * 
	 * @param s
	 *            is the string that should be transformed.
	 * @return returns the transformed string
	 */
	@Deprecated
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
		if (StringHelper.isEmpty(str))
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
				return false;
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
		if (StringHelper.isEmpty(str))
			return false;

		if (str.charAt(0) == '-')
			return false;
		
		return StringHelper.isInteger(str);
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}
	
//	// http://stackoverflow.com/questions/19484406/detecting-if-a-string-has-unique-characters-comparing-my-solution-to-cracking
//	public static boolean isUniqueChars(String str) {
//	    if (str.length() > 26) { 
//	        return false;
//	    }
//	    int checker = 0;
//	    for (int i = 0; i < str.length(); i++) {
//	        int val = str.charAt(i) - 'a';
//	        if ((checker & (1 << val)) > 0) return false;
//	        checker |= (1 << val);
//	    }
//	    return true;
//	}
}