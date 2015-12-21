/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui;

import org.eclipse.jface.dialogs.ProgressIndicator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import net.bhl.cdt.paxelerate.util.Func;

public class ProgressHandler {

	private Display display;
	private Shell shell;
	private ProgressIndicator indicator;
	private int current;
	private Label label;

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

	public void updateText(String text) {
		label.setText(text);
	}

	public ProgressHandler(int max) {

		current = 0;

		display = new Display();
		shell = new Shell(display);
		shell.setLayout(new GridLayout());
		shell.setSize(500, 100);
		shell.setText("Boarding Simulation - Preparations in Progress.");

		indicator = new ProgressIndicator(shell, SWT.HORIZONTAL);
		indicator.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false));
		indicator.setBackground(shell.getDisplay().getSystemColor(
				SWT.COLOR_CYAN));

		label = new Label(shell, SWT.NONE);
		label.setText("The boarding paths for the passengers are being calculated ...");

		shell.open();
		Func.centreWindow(shell);
		indicator.beginTask(max);
		indicator.showNormal();
	}

	private static void spin(Display display) {
		long endTime = System.currentTimeMillis() + 10;
		while (System.currentTimeMillis() < endTime)
			display.readAndDispatch();

	}
}
