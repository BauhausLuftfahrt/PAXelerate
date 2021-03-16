/**
 */
package toolspecific.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import toolspecific.ToolspecificPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ToolspecificXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolspecificXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ToolspecificPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the ToolspecificResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ToolspecificResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ToolspecificResourceFactoryImpl());
		}
		return registrations;
	}

} //ToolspecificXMLProcessor
