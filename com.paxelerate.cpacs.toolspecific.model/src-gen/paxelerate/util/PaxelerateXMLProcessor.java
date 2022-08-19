/**
 */
package paxelerate.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import paxelerate.PaxeleratePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PaxelerateXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		PaxeleratePackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the PaxelerateResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new PaxelerateResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new PaxelerateResourceFactoryImpl());
		}
		return registrations;
	}

} //PaxelerateXMLProcessor
