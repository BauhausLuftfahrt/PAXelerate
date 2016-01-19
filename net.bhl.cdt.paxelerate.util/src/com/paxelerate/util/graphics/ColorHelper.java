package com.paxelerate.util.graphics;

import org.eclipse.swt.graphics.RGB;

import com.paxelerate.util.math.Vector;
import com.paxelerate.util.math.Vector3D;

public class ColorHelper {
	/**
	 * This method calculates the color of the passenger and seat. It is
	 * calculated by a formula and the passenger id.
	 * 
	 * @param pax
	 *            the passenger
	 * @return the color code represented by a three dimensional vector
	 */
	public static Vector calculateColor(int value) {
		int randInt = value % 6;
		int colorDefine = (value % 13) * 20 + 15;
		switch (randInt) {
		case 0:
			return new Vector3D(255, 0, colorDefine);
		case 1:
			return new Vector3D(255, colorDefine, 0);
		case 2:
			return new Vector3D(0, 255, colorDefine);
		case 3:
			return new Vector3D(colorDefine, 255, 0);
		case 4:
			return new Vector3D(0, colorDefine, 255);
		case 5:
			return new Vector3D(colorDefine, 0, 255);
		default:
			return new Vector3D(255, 255, 255);
		}
	}

	public static RGB hex2Rgb(String colorStr) {
		return new RGB(Integer.valueOf(colorStr.substring(1, 3), 16), Integer.valueOf(colorStr.substring(3, 5), 16),
				Integer.valueOf(colorStr.substring(5, 7), 16));
	}
}
