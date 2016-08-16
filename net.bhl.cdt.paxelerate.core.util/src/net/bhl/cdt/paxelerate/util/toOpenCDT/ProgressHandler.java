/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.util.toOpenCDT;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.eclipse.jface.dialogs.ProgressIndicator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

/**
 * The Class ProgressHandler.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 */
public class ProgressHandler {

	/** The display. */
	private Display display;

	/** The shell. */
	private Shell shell;

	/** The indicator. */
	private ProgressIndicator indicator;

	/** The current. */
	private int current;

	/** The label. */
	private Label label;

	/**
	 * Report progress.
	 *
	 * @param value
	 *            the value
	 */
	public void reportProgress(int value) {
		indicator.worked(result(value));
		spin(display);
	}

	/**
	 * Result.
	 *
	 * @param value
	 *            the value
	 * @return the int
	 */
	private int result(int value) {
		int difference = Math.abs(current - value);

		if (difference != 0) {
			current = value;
		}
		return difference;
	}

	/**
	 * Done.
	 */
	public void done() {
		indicator.done();
		display.dispose();
	}

	/**
	 * Update text.
	 *
	 * @param text
	 *            the text
	 */
	public void updateText(String text) {
		label.setText(text);
	}

	/**
	 * Instantiates a new progress handler.
	 *
	 * @param max
	 *            the max
	 */
	public ProgressHandler(int max) {

		current = 0;

		display = new Display();
		shell = new Shell(display);
		shell.setLayout(new GridLayout());
		shell.setSize(500, 100);
		shell.setText("Boarding Simulation - Preparations in Progress.");

		indicator = new ProgressIndicator(shell, SWT.HORIZONTAL);
		indicator.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		indicator.setBackground(shell.getDisplay().getSystemColor(SWT.COLOR_CYAN));

		label = new Label(shell, SWT.NONE);
		label.setText("The boarding paths for the passengers are being calculated ...");

		shell.open();

		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) ((dimension.getWidth() - shell.getSize().x) / 2);
		int y = (int) ((dimension.getHeight() - shell.getSize().y) / 2);
		shell.setLocation(x, y);

		indicator.beginTask(max);
		indicator.showNormal();
	}

	/**
	 * Spin.
	 *
	 * @param display
	 *            the display
	 */
	private static void spin(Display display) {
		long endTime = System.currentTimeMillis() + 10;
		while (System.currentTimeMillis() < endTime)
			display.readAndDispatch();

	}
}
