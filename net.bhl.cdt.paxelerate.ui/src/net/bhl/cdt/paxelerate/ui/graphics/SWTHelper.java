package net.bhl.cdt.paxelerate.ui.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;

/**
 * The Class SWTHelper.
 *
 * @author marc.engelmann
 */

public class SWTHelper {

	/**
	 * Gets the quality settings.
	 *
	 * @param gc the gc
	 * @return the quality settings
	 */
	public static GC getQualitySettings(GC gc) {
		gc.setAntialias(SWT.ON);
		gc.setTextAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		return gc;
	}
}
