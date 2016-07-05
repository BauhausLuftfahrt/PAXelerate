/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 ***************************************************************************************/
package net.bhl.cdt.paxelerate.ui.commands;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.Door;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.model.command.helper.GeneratePassenger;
import net.bhl.cdt.paxelerate.ui.helper.Input;
import net.bhl.cdt.paxelerate.ui.helper.Input.WindowType;
import net.bhl.cdt.paxelerate.ui.preferences.PAXeleratePreferencePage;
import net.bhl.cdt.paxelerate.ui.views.CabinViewPart;
import net.bhl.cdt.paxelerate.ui.views.PropertyViewPart;
import net.bhl.cdt.paxelerate.ui.views.ViewPartHelper;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * 
 * This command creates the passengers.
 * 
 * @author marc.engelmann, michael.schmidt
 * @version 1.1
 * @since 0.5
 *
 */

public class GeneratePassengersCommand extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The cabinview. */
	private CabinViewPart cabinViewPart;
	
	private PropertyViewPart propertyViewPart;

	/**
	 * This method submits the cabin to be used in the file.
	 * 
	 * @param cabin
	 *            is the input parameter
	 */
	public GeneratePassengersCommand(final Cabin cabin) {
		this.cabin = cabin;
	}

	/**
	 * Instantiates a new generate passengers command.
	 */
	public GeneratePassengersCommand() {
		if (ECPUtil.getECPProjectManager().getProjects() != null) {
			this.cabin = (Cabin) ECPUtil.getECPProjectManager()
					.getProject(PAXeleratePreferencePage.DEFAULT_PROJECT_NAME).getContents().get(0);
		}
	}

	/**
	 * This method runs the passenger generation command.
	 */
	@Override
	protected final void doRun() {
		/* Create separate thread */

		Job job = new Job("Generate Passengers Thread") {
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				Log.add(this, "Passenger generation started...");

				if (cabin.getDoors().isEmpty()) {
					new Input(WindowType.WARNING,
							"You can not continue without generating and activating at least one door!",
							IMessageProvider.ERROR);
					Log.add(this, "Passenger generation aborted");
					return Status.CANCEL_STATUS;
					
				} else {
					Display.getDefault().syncExec(new Runnable() {
						@Override
						public void run() {
							
							cabinViewPart = ViewPartHelper.getCabinView();
							if (cabinViewPart != null) {
								try {
									cabinViewPart.unsyncViewer();
								} catch (NullPointerException e) {
									Log.add(this, "No property view is visible!");
									e.printStackTrace();
								}
							}
							cabin.getPassengers().clear();
						}
					});

					for (TravelClass travelclass : cabin.getClasses()) {
						new GeneratePassenger(cabin, travelclass).performGeneratePassengers();
					}
					for (Door door : cabin.getDoors()) {
						door.getWaitingPassengers().clear();
					}

					/* PUBLISH */
					Log.add(this, "Updating GUI...");
					Display.getDefault().syncExec(new Runnable() {

						@Override
						public void run() {
							
							propertyViewPart = ViewPartHelper.getPropertyView();
							if (propertyViewPart != null) {
								try {
									propertyViewPart.updateUI(cabin);
								} catch (NullPointerException e) {
									Log.add(this, "No property view is visible!");
									e.printStackTrace();
								}
							}
							
							cabinViewPart = ViewPartHelper.getCabinView();
							if (cabinViewPart != null) {
								try {
									cabinViewPart.syncViewer();
									cabinViewPart.setCabin(cabin);
								} catch (NullPointerException e) {
									Log.add(this, "No cabin view is visible!");
									e.printStackTrace();
								}
							}
							
							try {
								new RefreshCabinViewCommand(cabin).doRun();
							} catch (NullPointerException e) {
								Log.add(this, "Cabin View could not be refreshed");
								e.printStackTrace();
							}
						}
					});
				}
				/* report finished */
				return Status.OK_STATUS;
			}
		};

		/* report job status to console */
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					Log.add(this, "Passenger generation completed");
				} else {
					Log.add(this, "Passenger generation failed!");
				}
			}
		});

		/* Start the Job */
		job.schedule();
		try {
			/* schedule job after previous is finished */
			job.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("InterruptedException @ thread " + Thread.currentThread().getName());
			Thread.currentThread().interrupt();
		}
	}
}
