/*******************************************************************************
 * <copyright> Copyright (c) 2014-2016 Bauhaus Luftfahrt e.V.. All rights reserved. This program and the accompanying
 * materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 *******************************************************************************/
package net.bhl.cdt.paxelerate.model.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.SimulationProperties;

/**
 * This class is used for loading the previously stored model.
 * 
 * @author marc.engelmann
 * @version 1.0
 * @since 0.5
 * @see EMFModelStore
 *
 */
public class EMFModelLoader {

	/**
	 * This function loads a already stored cabin object from an .XMI file.
	 * 
	 * @return the loaded cabin is returned
	 */
	public static synchronized Cabin loadCabin() {

		/* Register the XMI resource factory */
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(EMFModelStore.CABIN_FILE, new XMIResourceFactoryImpl());
		m.put(EMFModelStore.SETTINGS_FILE, new XMIResourceFactoryImpl());

		/* Obtain a new resource set */
		ResourceSet resSet = new ResourceSetImpl();

		/* Get the resource */
		Resource cabinResource = resSet.getResource(
				URI.createURI(
						EMFModelStore.PATH + "/" + EMFModelStore.CABIN_FILE),
				true);
		Resource settingsResource = resSet.getResource(
				URI.createURI(
						EMFModelStore.PATH + "/" + EMFModelStore.SETTINGS_FILE),
				true);

		/* Get the model elements */
		Cabin cabin = (Cabin) cabinResource.getContents().get(0);
		SimulationProperties settings = (SimulationProperties) settingsResource
				.getContents().get(0);

		/* Load the settings into the cabin */
		cabin.setSimulationSettings(settings);

		System.out.println("Cabin is now loaded from local store!");
		return cabin;
	}
}
