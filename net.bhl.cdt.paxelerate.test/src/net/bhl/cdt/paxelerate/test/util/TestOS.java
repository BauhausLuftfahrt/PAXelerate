package net.bhl.cdt.paxelerate.test.util;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import net.bhl.cdt.paxelerate.util.OS;

public class TestOS {

	@BeforeClass
	public static void beforeTest() {
		System.out.println(System.getProperty("os.name"));
	}

	@Test
	public void isOSTest() {
		// There must always be one true response (i.e. one running OS)
		int expectedResponses = 1;

		// Record number of true responses for each OS possibility
		int actualResponses = 0;

		if (OS.isWindows())
			actualResponses++;
		if (OS.isMac())
			actualResponses++;
		if (OS.isSolaris())
			actualResponses++;
		if (OS.isUnix())
			actualResponses++;

		// Test if exactly one OS has been recognized
		assertEquals(expectedResponses, actualResponses);
	}

}
