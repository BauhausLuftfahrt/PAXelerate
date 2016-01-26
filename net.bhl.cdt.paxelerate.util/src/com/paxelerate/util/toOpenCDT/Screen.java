/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package com.paxelerate.util.toOpenCDT;

/**
 * 
 * @author marc.engelmann, raoul.rothfeld
 *
 */
public class Screen {
	
	/**
	 * Protect constructor since it is a static only class
	 */
	protected Screen() {
	}

	/**
	 * 
	 * @return
	 */
	public static int getWidth() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}

	/**
	 * 
	 * @return
	 */
	public static int getHeight() {
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}
	
}
