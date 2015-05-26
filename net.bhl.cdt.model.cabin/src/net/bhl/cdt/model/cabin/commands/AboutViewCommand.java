/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import javax.swing.JFrame;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.cabin.ui.AboutView;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class AboutViewCommand extends CDTCommand {

	private static JFrame frame;

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public AboutViewCommand() {

	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected void doRun() {

		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */

		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame = new JFrame("About this application");
				frame.setContentPane(new AboutView());
				frame.pack();
				frame.setVisible(true);
			}
		});
	}
}