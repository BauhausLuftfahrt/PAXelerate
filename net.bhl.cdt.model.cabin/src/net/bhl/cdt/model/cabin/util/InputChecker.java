/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.util;

import org.apache.commons.lang.StringUtils;

/**
 * This class checks user input for errors.
 * 
 * @author marc.engelmann
 *
 */
public class InputChecker {

	private static final boolean DEVELOPER_MODE = false;

	/**
	 * This method checks the string for user input errors and corrects them.
	 * 
	 * @param str
	 *            is the string
	 * @return the corrected string
	 */
	public static String checkStructureString(String str) {

		/* remove all spaces and invisible pieces */
		if (str.contains(" ")) {
			str = str.replaceAll("\\s+", "");
			if (DEVELOPER_MODE) {
				System.out.println("spaces detected and removed!");
			}
		}

		/* for cleaning purposes, the dashes are temporarily removed */
		String stringWithoutDashes = str.replace("-", "");

		/*
		 * if there are other characters than digits inside the string, this is
		 * not good either. Define the standard string again.
		 */
		if (!FunctionLibrary.isNumeric(stringWithoutDashes)) {
			str = str.replaceAll("[^0-9-]+", "");
			if (DEVELOPER_MODE) {
				System.out
						.println("non-numeric characters detected and removed!");
			}
		}

		/* Now this string only contains numbers! */
		stringWithoutDashes = str.replace("-", "");

		/*
		 * if there is no dash, define an aisle in the middle so that there is
		 * at least on aisle and the generate cabin method is working correctly.
		 */
		if (StringUtils.countMatches(str, "-") == 0) {
			int numbcount = stringWithoutDashes.length();
			if (DEVELOPER_MODE) {
				System.out.println("no dash detected, inserted in the middle!");
			}
			str = str.substring(0, (int) (numbcount / 2)) + "-"
					+ str.substring((int) (numbcount / 2));
		}

		/*
		 * if there is an unsynchronized amount of aisles seat segments, this is
		 * corrected by removing the last element.
		 */

		if (str.substring(str.length() - 1, str.length()).equals("-")) {
			str = str.substring(0, str.length() - 1);
		}

		/*
		 * if there are 2 or more dashes following on another, remove all except
		 * for one.
		 */
		if (FunctionLibrary.checkForDoubleCharacter(str)) {
			if (DEVELOPER_MODE) {
				System.out
						.println("several dashes in a row detected and corrected");
			}
			String helperString = "";
			for (int i = 0; i < str.length(); i++) {
				if (i == 0) {
					helperString = "" + str.charAt(i);
				} else {
					if (str.charAt(i - 1) != str.charAt(i)) {
						helperString = helperString + str.charAt(i);
					}
				}
			}
			str = helperString;
		}
		return str;
	}
}
