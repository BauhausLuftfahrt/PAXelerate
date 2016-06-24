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

public class DefineBatchSimulationInput extends CDTCommand {

	/** The cabin. */
	private Cabin cabin;

	private SimulationProperties simSettings;

	final JobScheduleRule jobRule = new JobScheduleRule();

	/**
	 * This is the constructor method of the SimulateBoardingCommand.
	 * 
	 * @param cabin
	 *            the cabin object
	 */
	public DefineBatchSimulationInput() {

		if (ECPUtil.getECPProjectManager().getProjects() != null) {
			this.cabin = (Cabin) ECPUtil.getECPProjectManager().getProject("reference").getContents().get(0);
		}
	}

	/**
	 * This method runs the simulate boarding command.
	 */
	@Override
	protected void doRun() {
		// Create separate thread
		Job job = new Job("ECP Importer Thread") {
			/*
			 * (non-Javadoc)
			 * 
			 * @see
			 * org.eclipse.core.runtime.jobs.Job#run(org.eclipse.core.runtime.
			 * IProgressMonitor)
			 */
			@Override
			protected IStatus run(final IProgressMonitor monitor) {

				Log.add(this, "Initializing batch simulation ...");

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
				simSettings.setNumberOfSimulationLoops(20);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithNoLuggage(10);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithSmallLuggage(30);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithMediumLuggage(40);
				simSettings.getLuggageProperties().setPercentageOfPassengersWithBigLuggage(20);
				simSettings.setLayoutConcept(LayoutConcept.DEFAULT);

				Display.getDefault().syncExec(new Runnable() {
					@Override
					public void run() {
						new DrawCabinCommand(cabin).execute();
					}
				});
				// 70 - 126
				// 90 - 162
				for (TravelClass travelclass : cabin.getClasses()) {
					travelclass.setPassengers(180);
				}

				// report finished
				return Status.OK_STATUS;

			}
		};

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(final IJobChangeEvent event) {
				if (event.getResult().isOK()) {
					Log.add(this, "Simulation parameters set");
				} else {
					Log.add(this, "Setting simulation parameters failed");
				}
			}
		});

		job.setRule(jobRule);
		// Start the Job
		job.schedule();
	}
}
