/*******************************************************************************
 * <copyright> Copyright (c) 2009-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;

/**
 * Unified font system for Paxelerate
 * 
 * @author raoul.rothfeld
 */
public class FontHelper {
	
	/**
	 * The font displaying device/component
	 */
	private Device d;
	
	private static final String FONT_NAME = "Helvetica Neue";

	/**
	 * All Paxelerate font styles
	 */
	public final Font
			// Heading styles
			h1 = new Font(d, FONT_NAME, 9, SWT.BOLD),
			h2 = new Font(d, FONT_NAME, 9, SWT.NORMAL),
			h3 = new Font(d, FONT_NAME, 8, SWT.NORMAL),
			
			// Paragraph styles
			p = new Font(d, FONT_NAME, 6, SWT.NORMAL);

	/**
	 * Constructor for a FontHelper instance
	 * 
	 * @param display
	 *            the font displaying device/component
	 */
	public FontHelper(Device display) {
		this.d = display;
	}
	
}
