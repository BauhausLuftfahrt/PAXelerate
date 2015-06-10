package net.bhl.cdt.model.cabin.ui;

/*******************************************************************************
 * Copyright (c) 2007, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

import org.eclipse.jface.dialogs.ProgressIndicator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * A snippet to demonstrate the progress indicator on Vista showing paused and
 * errors
 * 
 */
public class ProgressHandler {

	private Display display;
	private Shell shell;
	private ProgressIndicator indicator;
	private int current;

	public void reportProgress(int value) {
		indicator.worked(result(value));
		spin(display);
	}

	private int result(int value) {
		int difference = Math.abs(current - value);

		if (difference != 0) {
			current = value;
		}
		return difference;
	}

	public void done() {
		indicator.done();
		display.dispose();
	}

	public ProgressHandler(int max) {

		current = 0;

		display = new Display();
		shell = new Shell(display);
		shell.setLayout(new GridLayout());
		shell.setSize(500, 100);
		shell.setText("Calculation in progress.");

		indicator = new ProgressIndicator(shell, SWT.HORIZONTAL);
		indicator.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		indicator.setBackground(shell.getDisplay().getSystemColor(
				SWT.COLOR_CYAN));

		// Create a label
		new Label(shell, SWT.NONE)
				.setText("The boarding paths for the passengers are being calculated ...");

		shell.open();
		indicator.beginTask(max);
		indicator.showNormal();
		// spin(display);
		// indicator.showPaused();
		// indicator.worked(50);
		// spin(display);
		// indicator.showError();
		// indicator.worked(50);
		// spin(display);

	}

	private static void spin(Display display) {
		long endTime = System.currentTimeMillis() + 10;
		while (System.currentTimeMillis() < endTime)
			display.readAndDispatch();

	}
}
