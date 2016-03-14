package net.bhl.cdt.paxelerate.ui.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;

/**
 * 
 * @author marc.engelmann
 *
 */

public class SWTHelper {

	public static GC getQualitySettings(GC gc) {
		gc.setAntialias(SWT.ON);
		gc.setTextAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		return gc;
	}
}
