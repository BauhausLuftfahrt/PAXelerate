/**
 */
package paxelerate.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import paxelerate.ComplexBaseType;
import paxelerate.DocumentRoot;
import paxelerate.DoorSelectionType;
import paxelerate.PassengerSortingSchemeType;
import paxelerate.PaxelerateFactory;
import paxelerate.PaxelerateInputType;
import paxelerate.PaxeleratePackage;
import paxelerate.PaxelerateType;
import paxelerate.SeatTypeType;
import paxelerate.SimulationTypeType;
import paxelerate.StudiesType;
import paxelerate.StudyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PaxeleratePackageImpl extends EPackageImpl implements PaxeleratePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexBaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paxelerateInputTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paxelerateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doorSelectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum passengerSortingSchemeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum seatTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum simulationTypeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType doorSelectionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType passengerSortingSchemeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seatTypeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simulationTypeTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see paxelerate.PaxeleratePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PaxeleratePackageImpl() {
		super(eNS_URI, PaxelerateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PaxeleratePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PaxeleratePackage init() {
		if (isInited)
			return (PaxeleratePackage) EPackage.Registry.INSTANCE.getEPackage(PaxeleratePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPaxeleratePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PaxeleratePackageImpl thePaxeleratePackage = registeredPaxeleratePackage instanceof PaxeleratePackageImpl
				? (PaxeleratePackageImpl) registeredPaxeleratePackage
				: new PaxeleratePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePaxeleratePackage.createPackageContents();

		// Initialize created meta-data
		thePaxeleratePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePaxeleratePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PaxeleratePackage.eNS_URI, thePaxeleratePackage);
		return thePaxeleratePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexBaseType() {
		return complexBaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexBaseType_ExternalDataDirectory() {
		return (EAttribute) complexBaseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexBaseType_ExternalDataNodePath() {
		return (EAttribute) complexBaseTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexBaseType_ExternalFileName() {
		return (EAttribute) complexBaseTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute) documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Content() {
		return (EReference) documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaxelerateInputType() {
		return paxelerateInputTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaxelerateInputType_Studies() {
		return (EReference) paxelerateInputTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPaxelerateType() {
		return paxelerateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPaxelerateType_Input() {
		return (EReference) paxelerateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudiesType() {
		return studiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudiesType_Study() {
		return (EReference) studiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyType() {
		return studyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_LoadFactor() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_ActiveDoorUIDs() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_Iterations() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_SimulationType() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_DisplaySimulation() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_SeatType() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_SimulationGridResolution() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_SimulationSpeedFactor() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_PassengerSortingScheme() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_DoorSelection() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_PercentageOfPassengersWithJackets() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_PercentageOfPassengersWithSmallBags() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_PercentageOfPassengersWithMediumBags() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_PercentageOfPassengersWithLargeBags() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyType_UID() {
		return (EAttribute) studyTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoorSelectionType() {
		return doorSelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPassengerSortingSchemeType() {
		return passengerSortingSchemeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSeatTypeType() {
		return seatTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSimulationTypeType() {
		return simulationTypeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDoorSelectionTypeObject() {
		return doorSelectionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPassengerSortingSchemeTypeObject() {
		return passengerSortingSchemeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSeatTypeTypeObject() {
		return seatTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimulationTypeTypeObject() {
		return simulationTypeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateFactory getPaxelerateFactory() {
		return (PaxelerateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		complexBaseTypeEClass = createEClass(COMPLEX_BASE_TYPE);
		createEAttribute(complexBaseTypeEClass, COMPLEX_BASE_TYPE__EXTERNAL_DATA_DIRECTORY);
		createEAttribute(complexBaseTypeEClass, COMPLEX_BASE_TYPE__EXTERNAL_DATA_NODE_PATH);
		createEAttribute(complexBaseTypeEClass, COMPLEX_BASE_TYPE__EXTERNAL_FILE_NAME);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONTENT);

		paxelerateInputTypeEClass = createEClass(PAXELERATE_INPUT_TYPE);
		createEReference(paxelerateInputTypeEClass, PAXELERATE_INPUT_TYPE__STUDIES);

		paxelerateTypeEClass = createEClass(PAXELERATE_TYPE);
		createEReference(paxelerateTypeEClass, PAXELERATE_TYPE__INPUT);

		studiesTypeEClass = createEClass(STUDIES_TYPE);
		createEReference(studiesTypeEClass, STUDIES_TYPE__STUDY);

		studyTypeEClass = createEClass(STUDY_TYPE);
		createEAttribute(studyTypeEClass, STUDY_TYPE__LOAD_FACTOR);
		createEAttribute(studyTypeEClass, STUDY_TYPE__ACTIVE_DOOR_UI_DS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__ITERATIONS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__SIMULATION_TYPE);
		createEAttribute(studyTypeEClass, STUDY_TYPE__DISPLAY_SIMULATION);
		createEAttribute(studyTypeEClass, STUDY_TYPE__SEAT_TYPE);
		createEAttribute(studyTypeEClass, STUDY_TYPE__SIMULATION_GRID_RESOLUTION);
		createEAttribute(studyTypeEClass, STUDY_TYPE__SIMULATION_SPEED_FACTOR);
		createEAttribute(studyTypeEClass, STUDY_TYPE__PASSENGER_SORTING_SCHEME);
		createEAttribute(studyTypeEClass, STUDY_TYPE__DOOR_SELECTION);
		createEAttribute(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_JACKETS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_BAGS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_BAGS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__PERCENTAGE_OF_PASSENGERS_WITH_LARGE_BAGS);
		createEAttribute(studyTypeEClass, STUDY_TYPE__UID);

		// Create enums
		doorSelectionTypeEEnum = createEEnum(DOOR_SELECTION_TYPE);
		passengerSortingSchemeTypeEEnum = createEEnum(PASSENGER_SORTING_SCHEME_TYPE);
		seatTypeTypeEEnum = createEEnum(SEAT_TYPE_TYPE);
		simulationTypeTypeEEnum = createEEnum(SIMULATION_TYPE_TYPE);

		// Create data types
		doorSelectionTypeObjectEDataType = createEDataType(DOOR_SELECTION_TYPE_OBJECT);
		passengerSortingSchemeTypeObjectEDataType = createEDataType(PASSENGER_SORTING_SCHEME_TYPE_OBJECT);
		seatTypeTypeObjectEDataType = createEDataType(SEAT_TYPE_TYPE_OBJECT);
		simulationTypeTypeObjectEDataType = createEDataType(SIMULATION_TYPE_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
				.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		paxelerateInputTypeEClass.getESuperTypes().add(this.getComplexBaseType());
		paxelerateTypeEClass.getESuperTypes().add(this.getComplexBaseType());
		studiesTypeEClass.getESuperTypes().add(this.getComplexBaseType());
		studyTypeEClass.getESuperTypes().add(this.getComplexBaseType());

		// Initialize classes, features, and operations; add parameters
		initEClass(complexBaseTypeEClass, ComplexBaseType.class, "ComplexBaseType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplexBaseType_ExternalDataDirectory(), theXMLTypePackage.getString(),
				"externalDataDirectory", null, 0, 1, ComplexBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexBaseType_ExternalDataNodePath(), theXMLTypePackage.getString(), "externalDataNodePath",
				null, 0, 1, ComplexBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplexBaseType_ExternalFileName(), theXMLTypePackage.getString(), "externalFileName", null,
				0, 1, ComplexBaseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null,
				"xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null,
				"xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Content(), this.getPaxelerateType(), null, "content", null, 0, -2, null,
				IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				IS_DERIVED, IS_ORDERED);

		initEClass(paxelerateInputTypeEClass, PaxelerateInputType.class, "PaxelerateInputType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaxelerateInputType_Studies(), this.getStudiesType(), null, "studies", null, 1, 1,
				PaxelerateInputType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paxelerateTypeEClass, PaxelerateType.class, "PaxelerateType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPaxelerateType_Input(), this.getPaxelerateInputType(), null, "input", null, 1, 1,
				PaxelerateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studiesTypeEClass, StudiesType.class, "StudiesType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudiesType_Study(), this.getStudyType(), null, "study", null, 1, -1, StudiesType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyTypeEClass, StudyType.class, "StudyType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudyType_LoadFactor(), theXMLTypePackage.getDouble(), "loadFactor", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_ActiveDoorUIDs(), theXMLTypePackage.getString(), "activeDoorUIDs", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_Iterations(), theXMLTypePackage.getInt(), "iterations", null, 1, 1, StudyType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_SimulationType(), this.getSimulationTypeType(), "simulationType", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_DisplaySimulation(), theXMLTypePackage.getBoolean(), "displaySimulation", null, 1,
				1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_SeatType(), this.getSeatTypeType(), "seatType", null, 1, 1, StudyType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_SimulationGridResolution(), theXMLTypePackage.getDouble(),
				"simulationGridResolution", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_SimulationSpeedFactor(), theXMLTypePackage.getDouble(), "simulationSpeedFactor",
				null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_PassengerSortingScheme(), this.getPassengerSortingSchemeType(),
				"passengerSortingScheme", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_DoorSelection(), this.getDoorSelectionType(), "doorSelection", null, 1, 1,
				StudyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_PercentageOfPassengersWithJackets(), theXMLTypePackage.getDouble(),
				"percentageOfPassengersWithJackets", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_PercentageOfPassengersWithSmallBags(), theXMLTypePackage.getDouble(),
				"percentageOfPassengersWithSmallBags", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_PercentageOfPassengersWithMediumBags(), theXMLTypePackage.getDouble(),
				"percentageOfPassengersWithMediumBags", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_PercentageOfPassengersWithLargeBags(), theXMLTypePackage.getDouble(),
				"percentageOfPassengersWithLargeBags", null, 1, 1, StudyType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStudyType_UID(), theXMLTypePackage.getID(), "uID", null, 1, 1, StudyType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(doorSelectionTypeEEnum, DoorSelectionType.class, "DoorSelectionType");
		addEEnumLiteral(doorSelectionTypeEEnum, DoorSelectionType.CLOSEST);
		addEEnumLiteral(doorSelectionTypeEEnum, DoorSelectionType.CLOSESTBEHIND);
		addEEnumLiteral(doorSelectionTypeEEnum, DoorSelectionType.CLOSESTFRONT);
		addEEnumLiteral(doorSelectionTypeEEnum, DoorSelectionType.RANDOM);

		initEEnum(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.class, "PassengerSortingSchemeType");
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.RANDOM);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.RTF);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.FTR);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.WTA);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.WTARTF);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.WTAFTR);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.BLOCK);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.BOARDINGCLASSRANDOM);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.STEFFEN);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.MILNEKELLY);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.BIGBAGSAFT);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.BIGBAGSFRONT);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.MAXBAGSAFT);
		addEEnumLiteral(passengerSortingSchemeTypeEEnum, PassengerSortingSchemeType.MAXBAGSFRONT);

		initEEnum(seatTypeTypeEEnum, SeatTypeType.class, "SeatTypeType");
		addEEnumLiteral(seatTypeTypeEEnum, SeatTypeType.DEFAULT);
		addEEnumLiteral(seatTypeTypeEEnum, SeatTypeType.SIDEWAYSFOLDABLE);
		addEEnumLiteral(seatTypeTypeEEnum, SeatTypeType.LIFTINGSEATPAN);
		addEEnumLiteral(seatTypeTypeEEnum, SeatTypeType.BRINGYOUROWN);

		initEEnum(simulationTypeTypeEEnum, SimulationTypeType.class, "SimulationTypeType");
		addEEnumLiteral(simulationTypeTypeEEnum, SimulationTypeType.BOARDING);
		addEEnumLiteral(simulationTypeTypeEEnum, SimulationTypeType.DEBOARDING);
		addEEnumLiteral(simulationTypeTypeEEnum, SimulationTypeType.EMERGENCY);

		// Initialize data types
		initEDataType(doorSelectionTypeObjectEDataType, DoorSelectionType.class, "DoorSelectionTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(passengerSortingSchemeTypeObjectEDataType, PassengerSortingSchemeType.class,
				"PassengerSortingSchemeTypeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seatTypeTypeObjectEDataType, SeatTypeType.class, "SeatTypeTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simulationTypeTypeObjectEDataType, SimulationTypeType.class, "SimulationTypeTypeObject",
				IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(complexBaseTypeEClass, source, new String[] { "name", "complexBaseType", "kind", "empty" });
		addAnnotation(getComplexBaseType_ExternalDataDirectory(), source,
				new String[] { "kind", "attribute", "name", "externalDataDirectory" });
		addAnnotation(getComplexBaseType_ExternalDataNodePath(), source,
				new String[] { "kind", "attribute", "name", "externalDataNodePath" });
		addAnnotation(getComplexBaseType_ExternalFileName(), source,
				new String[] { "kind", "attribute", "name", "externalFileName" });
		addAnnotation(documentRootEClass, source, new String[] { "name", "", "kind", "mixed" });
		addAnnotation(getDocumentRoot_Mixed(), source, new String[] { "kind", "elementWildcard", "name", ":mixed" });
		addAnnotation(getDocumentRoot_XMLNSPrefixMap(), source,
				new String[] { "kind", "attribute", "name", "xmlns:prefix" });
		addAnnotation(getDocumentRoot_XSISchemaLocation(), source,
				new String[] { "kind", "attribute", "name", "xsi:schemaLocation" });
		addAnnotation(getDocumentRoot_Content(), source,
				new String[] { "kind", "element", "name", "content", "namespace", "##targetNamespace" });
		addAnnotation(doorSelectionTypeEEnum, source, new String[] { "name", "doorSelection_._type" });
		addAnnotation(doorSelectionTypeObjectEDataType, source,
				new String[] { "name", "doorSelection_._type:Object", "baseType", "doorSelection_._type" });
		addAnnotation(passengerSortingSchemeTypeEEnum, source,
				new String[] { "name", "passengerSortingScheme_._type" });
		addAnnotation(passengerSortingSchemeTypeObjectEDataType, source, new String[] { "name",
				"passengerSortingScheme_._type:Object", "baseType", "passengerSortingScheme_._type" });
		addAnnotation(paxelerateInputTypeEClass, source,
				new String[] { "name", "paxelerateInputType", "kind", "elementOnly" });
		addAnnotation(getPaxelerateInputType_Studies(), source,
				new String[] { "kind", "element", "name", "studies", "namespace", "##targetNamespace" });
		addAnnotation(paxelerateTypeEClass, source, new String[] { "name", "paxelerateType", "kind", "elementOnly" });
		addAnnotation(getPaxelerateType_Input(), source,
				new String[] { "kind", "element", "name", "input", "namespace", "##targetNamespace" });
		addAnnotation(seatTypeTypeEEnum, source, new String[] { "name", "seatType_._type" });
		addAnnotation(seatTypeTypeObjectEDataType, source,
				new String[] { "name", "seatType_._type:Object", "baseType", "seatType_._type" });
		addAnnotation(simulationTypeTypeEEnum, source, new String[] { "name", "simulationType_._type" });
		addAnnotation(simulationTypeTypeObjectEDataType, source,
				new String[] { "name", "simulationType_._type:Object", "baseType", "simulationType_._type" });
		addAnnotation(studiesTypeEClass, source, new String[] { "name", "studiesType", "kind", "elementOnly" });
		addAnnotation(getStudiesType_Study(), source,
				new String[] { "kind", "element", "name", "study", "namespace", "##targetNamespace" });
		addAnnotation(studyTypeEClass, source, new String[] { "name", "studyType", "kind", "elementOnly" });
		addAnnotation(getStudyType_LoadFactor(), source,
				new String[] { "kind", "element", "name", "loadFactor", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_ActiveDoorUIDs(), source,
				new String[] { "kind", "element", "name", "activeDoorUIDs", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_Iterations(), source,
				new String[] { "kind", "element", "name", "iterations", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SimulationType(), source,
				new String[] { "kind", "element", "name", "simulationType", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_DisplaySimulation(), source,
				new String[] { "kind", "element", "name", "displaySimulation", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SeatType(), source,
				new String[] { "kind", "element", "name", "seatType", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SimulationGridResolution(), source, new String[] { "kind", "element", "name",
				"simulationGridResolution", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_SimulationSpeedFactor(), source,
				new String[] { "kind", "element", "name", "simulationSpeedFactor", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PassengerSortingScheme(), source,
				new String[] { "kind", "element", "name", "passengerSortingScheme", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_DoorSelection(), source,
				new String[] { "kind", "element", "name", "doorSelection", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithJackets(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithJackets", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithSmallBags(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithSmallBags", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithMediumBags(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithMediumBags", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_PercentageOfPassengersWithLargeBags(), source, new String[] { "kind", "element",
				"name", "percentageOfPassengersWithLargeBags", "namespace", "##targetNamespace" });
		addAnnotation(getStudyType_UID(), source, new String[] { "kind", "attribute", "name", "uID" });
	}

} //PaxeleratePackageImpl
