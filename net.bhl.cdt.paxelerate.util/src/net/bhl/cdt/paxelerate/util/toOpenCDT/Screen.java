/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.util.toOpenCDT;

/**
 * The Class Screen.
 *
 * @author marc.engelmann, raoul.rothfeld
 * @version 1.0
 * @since 0.5
 */
public class Screen {

	/**
	 * Protect constructor since it is a static only class.
	 */
	protected Screen() {
	}

	/**
	 * Gets the width.
	 *
	 * @return the width
	 */
	public static int getWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	/**
	 * Gets the height.
	 *
	 * @return the height
	 */
	public static int getHeight() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}

}
