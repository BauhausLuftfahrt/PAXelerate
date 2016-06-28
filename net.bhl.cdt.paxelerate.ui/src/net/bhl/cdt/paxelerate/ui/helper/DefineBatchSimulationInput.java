package net.bhl.cdt.paxelerate.ui.helper;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobChangeAdapter;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.swt.widgets.Display;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.LayoutConcept;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.model.TravelClass;
import net.bhl.cdt.paxelerate.ui.commands.DrawCabinCommand;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class DefineBatchSimulationInput.
 */
public class DefineBatchSimulationInput extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	/** The sim settings. */
	private SimulationProperties simSettings;

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 */
	public DefineBatchSimulationInput() {

		try {
			if (ECPUtil.getECPProjectManager().getProjects() != null) {
				this.cabin = (Cabin) ECPUtil.getECPProjectManager().getProject("reference").getContents().get(0);
				this.simSettings = this.cabin.getSimulationSettings();
				Log.add(this, "Cabin set ...");
			}
		} catch (NullPointerException e) {
			Log.add(this, "Could not load model!");
		}

	}

	/**
	 * This method runs the simulate boarding command.
	 */
	public final void doRun() {
		// Create separate thread
		Job job = new Job("Define Simulation Input Thread") {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
			 * IProgressMonitor)
			 */
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				Log.add(this, "Setting study parameters ...");

				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						new DrawCabinCommand(cabin).execute();
					}
				});

				// 10 50 30 10
				// 10 30 40 20
				// 0 20 30 50

				simSettings.setSimulationSpeedFactor(2);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(0);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(20);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(30);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(50);
				simSettings.setLayoutConcept(LayoutConcept.DEFAULT);
				simSettings.setSimulateWithoutUI(true);

				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						new DrawCabinCommand(cabin).execute();
					}
				});
				// 70 - 126
				// 90 - 162
				for (TravelClass travelclass : cabin.getClasses()) {
					travelclass.setPassengers(162);
				}

				// report finished
				return Status.OK_STATUS;

			}
		};

		/* report job status to console */
		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					Log.add(this, "Simulation parameters set");
				} else {
					Log.add(this, "Setting simulation parameters failed");
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
		}
	}
}
