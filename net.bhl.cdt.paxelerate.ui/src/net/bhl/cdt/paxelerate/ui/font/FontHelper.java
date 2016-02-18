/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ******************************************************************************/

package net.bhl.cdt.paxelerate.ui.font;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;

/**
 * Unified font system for Paxelerate
 * 
 * @author raoul.rothfeld
 */
public class FontHelper {
	
	/**
	 * The font displaying device/component
	 */
	private static final Device d = Display.getCurrent();
	
	/**
	 * Font Name
	 */
	private static final String fontName = "Helvetica Neue";

	/**
	 * All Paxelerate font styles
	 */
	public static final Font
			// Heading styles
			HEADING1 = new Font(d, fontName, 9, SWT.BOLD),
			HEADING2 = new Font(d, fontName, 9, SWT.NORMAL),
			HEADING3 = new Font(d, fontName, 8, SWT.NORMAL),
			
			// Paragraph styles
			PARAGRAPH = new Font(d, fontName, 6, SWT.NORMAL);

	/**
	 * Singleton constructor for a FontHelper instance
	 */
	private FontHelper() {
	}
	
}
