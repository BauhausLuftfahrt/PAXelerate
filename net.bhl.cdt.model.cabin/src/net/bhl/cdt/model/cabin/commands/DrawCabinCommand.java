/*******************************************************************************
 * <copyright> Copyright (c) 2009-2014 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.model.cabin.commands;

import javax.swing.JFrame;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.model.astar.AreaMap;
import net.bhl.cdt.model.astar.CostMap;
import net.bhl.cdt.model.astar.ObstacleMap;
import net.bhl.cdt.model.cabin.Cabin;
import net.bhl.cdt.model.cabin.ui.CabinViewPart;
import net.bhl.cdt.model.cabin.ui.HelpView;
import net.bhl.cdt.model.cabin.util.Vector;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

/**
 * This class refreshed the cabin view without modifying anything. It checks the
 * layout of the cabin and warns the user.
 * 
 * @author marc.engelmann
 *
 */

public class DrawCabinCommand extends CDTCommand {

	private Cabin cabin;
	private ILog logger;
	private CabinViewPart cabinViewPart;
	private static JFrame frame;

	/**
	 * This method is the constructor.
	 * 
	 * @param cabin
	 *            the cabin
	 */
	public DrawCabinCommand(Cabin cabin) {
		this.cabin = cabin;
		logger = Platform.getLog(Platform.getBundle("net.bhl.cdt.model.cabin"));
	}

	/**
	 * This method executed the right click command. The cabin view is updated.
	 */
	@Override
	protected void doRun() {

//		GetInput dialog = new GetInput(shell);
//		dialog.create();
//		if (dialog.open() == Window.OK) {
//		  System.out.println(dialog.getFirstName());
//		  System.out.println(dialog.getLastName());
//		} 


		/**
		 * Main method.
		 * 
		 * @param args
		 *            the arguments
		 */
//		final Vector dimensions = new Vector(cabin.getCabinWidth()/cabin.getScale(),cabin.getCabinLength()/cabin.getScale());
//		ObstacleMap obstaclemap = new ObstacleMap(cabin);
//		final AreaMap areamap = new AreaMap(dimensions,obstaclemap);
//		javax.swing.SwingUtilities.invokeLater(new Runnable() {
//			public void run() {
//				// Set up main window (using Swing's Jframe)
//				frame = new JFrame("Cost Map Flooding Animation");
//				//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				frame.setContentPane(new HelpView(areamap, dimensions));
//				frame.pack();
//				frame.setVisible(true);
//			}
//		});

		IWorkbenchPage page = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow().getActivePage();
		cabinViewPart = (CabinViewPart) page
				.findView("net.bhl.cdt.model.cabin.cabinview");

		checkForConstructionErrors();

		try {
			cabinViewPart.setCabin(cabin);
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"Cabin view checked and updated"));
		} catch (NullPointerException e) {
			logger.log(new Status(IStatus.INFO, "net.bhl.cdt.model.cabin",
					"No cabin view is visible!"));
		}
	}

	private void checkForConstructionErrors() {
		// TODO Create error detection algorithm.

	}
}