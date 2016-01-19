/*******************************************************************************
 * <copyright> Copyright (c) 2014-2015 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package com.paxelerate.model.commands;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import net.bhl.cdt.commands.CDTCommand;

import org.eclipse.jface.dialogs.IMessageProvider;

import com.paxelerate.model.Cabin;
import com.paxelerate.model.astar.AreaMap;
import com.paxelerate.model.astar.ObstacleMap;
import com.paxelerate.model.ui.HelpView;
import com.paxelerate.util.input.Input;
import com.paxelerate.util.input.Input.WindowType;
import com.paxelerate.util.math.Vector;
import com.paxelerate.util.math.Vector2D;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class FloodCabinCommand extends CDTCommand {

	private Cabin cabin;
	private static JFrame frame;

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public FloodCabinCommand(Cabin cabin) {
		this.cabin = cabin;
	}
	
	public void runFrame(final int value) {
		final Vector dimensions = new Vector2D(cabin.getCabinWidth()
				/ cabin.getScale(), cabin.getCabinLength() / cabin.getScale());
		ObstacleMap obstaclemap = new ObstacleMap(cabin);
		final AreaMap areamap = new AreaMap(dimensions, obstaclemap);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				frame = new JFrame("Cost Map Flooding Animation");
				frame.setContentPane(new HelpView(areamap, dimensions, value));
				frame.pack();
				frame.setVisible(true);
			}
		});
	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected void doRun() {

		final Input dialog = new Input(WindowType.GET_INTEGER,
				"please enter the execution speed in milliseconds",
				IMessageProvider.INFORMATION);

		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */
		runFrame(dialog.getIntegerValue());
	}
}