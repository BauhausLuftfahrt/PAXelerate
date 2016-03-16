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
 *
 */
public class EMFModelLoader {

	public static Cabin loadCabin() {

		// Register the XMI resource factory

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("cabin", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet
				.getResource(URI.createURI("paxelerate/cabin"), true);

		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Cabin cabin = (Cabin) resource.getContents().get(0);

		System.out.println("Cabin is now loaded from local store!");

		cabin.setSimulationSettings(loadSettings());

		return cabin;
	}

	public static SimulationProperties loadSettings() {

		// Register the XMI resource factory

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("properties", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet
				.getResource(URI.createURI("paxelerate/properties"), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		SimulationProperties settings = (SimulationProperties) resource
				.getContents().get(0);

		System.out.println("Settings are now loaded from local store!");

		return settings;
	}
}
