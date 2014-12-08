
package net.bhl.cdt.model.cabin.util;


/**
 * This class is used for general caluclations and methods.
 * 
 * @author marc.engelmann
 * @version 0.1
 * @date 08.12.2014
 *
 */


public class FunctionLibrary {
	
	/**
	 * This method splits camel case strings into normal strings with spaces.
	 * @param s is the string that should be transformed.
	 * @return returns the transformed string
	 */
	public static String splitCamelCase(String s) {
		return s.replaceAll(String.format("%s|%s|%s",
				"(?<=[A-Z])(?=[A-Z][a-z])", "(?<=[^A-Z])(?=[A-Z])",
				"(?<=[A-Za-z])(?=[^A-Za-z])"), " ");
	}
}
