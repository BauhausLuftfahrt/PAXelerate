/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.model.util;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.SimulationProperties;

/**
 * This class is used to store data locally by using the EMF Persistence API.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 * @see EMFModelLoader
 *
 */
public class EMFModelStore {

	/** The Constant SETTINGS_FILE. */
	public final static String PATH = "PAXelerate", CABIN_FILE = "cabin",
			SETTINGS_FILE = "properties";

	/**
	 * This method stores a Cabin object as an .XMI file locally. <b> Note that
	 * only direct children of the object are stored. <b/>
	 * 
	 * @param submittedCabin
	 *            The cabin object which should be stored.
	 */
	public static synchronized void store(Cabin submittedCabin) {

		/* The cabin object is copied for local storage first */
		Cabin cabin = EcoreUtil.copy(submittedCabin);
		SimulationProperties settings = EcoreUtil
				.copy(submittedCabin.getSimulationSettings());

		/* Register the XMI resource factory */
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();

		m.put(CABIN_FILE, new XMIResourceFactoryImpl());
		m.put(SETTINGS_FILE, new XMIResourceFactoryImpl());

		/* Obtain a new resource set */
		ResourceSet resSet = new ResourceSetImpl();

		/* create a resource */
		Resource cabinResource = resSet
				.createResource(URI.createURI(PATH + "/" + CABIN_FILE));

		/* create a resource */
		Resource settingsResource = resSet
				.createResource(URI.createURI(PATH + "/" + SETTINGS_FILE));

		cabinResource.getContents().add(cabin);
		settingsResource.getContents().add(settings);

		/* now save the content. */
		try {
			cabinResource.save(Collections.EMPTY_MAP);
			settingsResource.save(Collections.EMPTY_MAP);
			System.out.println("Cabin has been saved locally.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}