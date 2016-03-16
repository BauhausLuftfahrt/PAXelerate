package net.bhl.cdt.paxelerate.model.util;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import net.bhl.cdt.paxelerate.model.Cabin;
import net.bhl.cdt.paxelerate.model.SimulationProperties;

/**
 * 
 * @author marc.engelmann
 *
 */
public class ModelPersistor {

	/**
	 * @param args
	 */

	public static void store(Cabin cabin) {

		System.out.println("0");

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("cabin", new XMIResourceFactoryImpl());

		System.out.println("1");

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		System.out.println("2");

		// create a resource
		Resource resource = resSet
				.createResource(URI.createURI("paxelerate/cabin"));

		if (!resource.getContents().isEmpty()) {

			System.out.println("already exists!");
			return;
		}

		resource.getContents().add(cabin);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Cabin is now stored locally!");

		} catch (IOException e) {
			System.out.println("Cabin could not be persisted!");
			e.printStackTrace();
		}
	}

	public static void store(SimulationProperties settings) {

		// Register the XMI resource factory
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("properties", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet
				.createResource(URI.createURI("paxelerate/properties"));
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node

		resource.getContents().clear();

		resource.getContents().add(settings);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
			System.out.println("Simulation properties are now stored locally!");

		} catch (IOException e) {
			System.out.println("Simulation properties could not be persisted!");
			e.printStackTrace();
		}
	}
}