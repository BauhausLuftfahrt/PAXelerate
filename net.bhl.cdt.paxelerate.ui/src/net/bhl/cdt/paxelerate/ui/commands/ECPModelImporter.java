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
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.emf.ecp.core.util.ECPUtil;
import org.eclipse.emf.edit.command.ChangeCommand;

import net.bhl.cdt.commands.CDTCommand;
import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.SimulationProperties;
import net.bhl.cdt.paxelerate.util.toOpenCDT.Log;

/**
 * The Class RunBatchSimulationMenuCommand.
 *
 * @author michael.schmidt
 */

public class ECPModelImporter extends CDTCommand {

	/** The cabin. */
	private Cabin cabinModel;

	/** The sim settings. */
	private SimulationProperties simSettings;

	/** The default xmi folder. */
	private static String DEFAULT_XMI_FOLDER = "T:/PAXelerate/data/";

	/** The default xmi filename. */
	private static String DEFAULT_XMI_FILENAME = "Reference_Cabin_v2.xmi";

	/** The default project. */
	private static String DEFAULT_PROJECT = "reference";

	final JobScheduleRule jobRule = new JobScheduleRule();

	/**
	 * This is the constructor method of the RunBatchSimulationMenuCommand.
	 */
	public ECPModelImporter() {

	}

	/**
	 * Load xmi model.
	 *
	 * @param folderName
	 *            the folder name
	 * @param fileName
	 *            the file name
	 * @return the cabin
	 * @throws ECPProjectWithNameExistsException
	 *             the ECP project with name exists exception
	 */
	private Cabin loadXMIModel(String folderName, String fileName) throws ECPProjectWithNameExistsException {
		/* Create a resource set */
		ResourceSet resourceSet = new ResourceSetImpl();

		/* Register the default resource factory */
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		/* Get the URI of the model file */
		URI uri = URI.createFileURI(folderName + fileName);

		/* Demand load the resource for this file */
		Resource resource = resourceSet.getResource(uri, true);

		/* get model elements from the resource */
		Cabin cabin = (Cabin) resource.getContents().get(0);

		return cabin;
	}

	/**
	 * Creates the new project.
	 *
	 * @param projectName
	 *            the project name
	 * @return the ECP project
	 * @throws ECPProjectWithNameExistsException
	 *             the ECP project with name exists exception
	 */
	private ECPProject createNewProject(String projectName) throws ECPProjectWithNameExistsException {
		ECPProject refProject = ECPUtil.getECPProjectManager().createProject(getProvider(), projectName,
				ECPUtil.createProperties());
		return refProject;
	}

	/**
	 * Adds the xmi model to project.
	 *
	 * @param refProject
	 *            the ref project
	 * @param cabin
	 *            the cabin
	 */
	private void addXMIModelToProject(ECPProject refProject, Cabin cabin) {
		/* add the imported xmi model to the default project */
		refProject.getEditingDomain().getCommandStack().execute(new ChangeCommand(cabin) {
			@Override
			protected void doExecute() {
				refProject.getContents().add(cabin);
			}
		});
	}

	/**
	 * Delete existing projects.
	 */
	private void deleteExistingProjects() {
		if (ECPUtil.getECPProjectManager().getProjects() != null) {
			for (ECPProject project : ECPUtil.getECPProjectManager().getProjects()) {
				project.delete();
			}
		}
	}

	/**
	 * Gets the provider.
	 *
	 * @return the provider
	 */
	private static ECPProvider getProvider() {
		Object[] providerArray = ECPUtil.getECPProviderRegistry().getProviders().toArray();
		return (ECPProvider) providerArray[0];
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
			protected IStatus run(IProgressMonitor monitor) {

				try {
					Log.add(this, "Loading cabin from file...");

					deleteExistingProjects();
					ECPProject project = createNewProject(DEFAULT_PROJECT);
					Cabin cabin = loadXMIModel(DEFAULT_XMI_FOLDER, DEFAULT_XMI_FILENAME);
					addXMIModelToProject(project, cabin);
					// cabinModel = EcoreUtil.copy(cabin);
					Log.add(this, "...cabin loaded!");

				} catch (ECPProjectWithNameExistsException e) {
					e.printStackTrace();
				}
				
				// report finished
				return Status.OK_STATUS;

			}

		};

		job.addJobChangeListener(new JobChangeAdapter() {
			public void done(IJobChangeEvent event) {
				if (event.getResult().isOK())
					Log.add(this, "ECP model import completed");
				else
					Log.add(this, "ECP model import failed");
			}
		});

		job.setRule(jobRule);
		// Start the Job
		job.schedule();
	}
}
