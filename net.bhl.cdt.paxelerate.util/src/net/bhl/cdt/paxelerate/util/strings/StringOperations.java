package net.bhl.cdt.paxelerate.util.strings;

public class StringOperations {
	/**
	 * Check if there are two of the same characters directly after each other,
	 * like in <i>balloon</i>.
	 * 
	 * @param str
	 *            the string
	 * @return a character is repeating
	 */
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
	public static String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s", "(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}

	/**
	 * Check if a string is numeric or not.
	 * 
	 * @param str
	 *            the string
	 * @return yes or no
	 */
	public static boolean isNumeric(String str) {
		for (char c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				if (!String.valueOf(c).equals("-")) {
					return false;
				}
			}
		}
		return true;
	}

}
