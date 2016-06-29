/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/
package net.bhl.cdt.paxelerate.ui.graphics;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;

/**
 * The Class SWTHelper.
 *
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */

public class SWTHelper {

	/**
	 * Gets the quality settings.
	 *
	 * @param gc
	 *            the gc
	 * @return the quality settings
	 */
	public static GC getQualitySettings(final GC gc) {
		gc.setAntialias(SWT.ON);
		gc.setTextAntialias(SWT.ON);
		gc.setInterpolation(SWT.HIGH);
		return gc;
	}
}
