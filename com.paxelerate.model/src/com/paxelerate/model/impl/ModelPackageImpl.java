/**
 */
package com.paxelerate.model.impl;

import com.paxelerate.model.Deck;
import com.paxelerate.model.EPoint;
import com.paxelerate.model.Model;
import com.paxelerate.model.ModelFactory;
import com.paxelerate.model.ModelPackage;
import com.paxelerate.model.SimulationResult;

import com.paxelerate.model.agent.AgentPackage;

import com.paxelerate.model.agent.impl.AgentPackageImpl;

import com.paxelerate.model.enums.EnumsPackage;

import com.paxelerate.model.enums.impl.EnumsPackageImpl;

import com.paxelerate.model.monuments.MonumentsPackage;

import com.paxelerate.model.monuments.impl.MonumentsPackageImpl;

import com.paxelerate.model.settings.SettingsPackage;

import com.paxelerate.model.settings.impl.SettingsPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ePointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

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
	 * @see com.paxelerate.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited)
			return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ModelPackageImpl theModelPackage = registeredModelPackage instanceof ModelPackageImpl
				? (ModelPackageImpl) registeredModelPackage
				: new ModelPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);
		AgentPackageImpl theAgentPackage = (AgentPackageImpl) (registeredPackage instanceof AgentPackageImpl
				? registeredPackage
				: AgentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);
		SettingsPackageImpl theSettingsPackage = (SettingsPackageImpl) (registeredPackage instanceof SettingsPackageImpl
				? registeredPackage
				: SettingsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MonumentsPackage.eNS_URI);
		MonumentsPackageImpl theMonumentsPackage = (MonumentsPackageImpl) (registeredPackage instanceof MonumentsPackageImpl
				? registeredPackage
				: MonumentsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl) (registeredPackage instanceof EnumsPackageImpl
				? registeredPackage
				: EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theModelPackage.createPackageContents();
		theAgentPackage.createPackageContents();
		theSettingsPackage.createPackageContents();
		theMonumentsPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();
		theAgentPackage.initializePackageContents();
		theSettingsPackage.initializePackageContents();
		theMonumentsPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationResult() {
		return simulationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_BoardingTime() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Passengers() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Name() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Id() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_Date() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_BoardingTimeString() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_WaymakingSkipped() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_WaymakingCompleted() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_LayoutConceptType() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_SimulationTime() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_NotStoredLuggageItems() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_LuggageStorageFillingDegree() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_TotalLargeBagsStowed() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_TotalStorageVolume() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_PassengersLookingForLuggageSpot() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_VolumeOfNotStoredLuggageItems() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_MaxNumberOfActivePassengers() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_AverageNumberOfActivePassengers() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulationResult_AverageNumberOfBags() {
		return (EAttribute) simulationResultEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEPoint() {
		return ePointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPoint_X() {
		return (EAttribute) ePointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPoint_Y() {
		return (EAttribute) ePointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEPoint_Z() {
		return (EAttribute) ePointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeck() {
		return deckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeck_Name() {
		return (EAttribute) deckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeck_Height() {
		return (EAttribute) deckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_Rows() {
		return (EReference) deckEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_Obstacles() {
		return (EReference) deckEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_Doors() {
		return (EReference) deckEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_Aisles() {
		return (EReference) deckEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_ShapeFloor() {
		return (EReference) deckEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeck_Passengers() {
		return (EReference) deckEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Deck() {
		return (EReference) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Name() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_Settings() {
		return (EReference) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModel_SimulationResults() {
		return (EReference) modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory) getEFactoryInstance();
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
		simulationResultEClass = createEClass(SIMULATION_RESULT);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__BOARDING_TIME);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__PASSENGERS);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__NAME);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__ID);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__DATE);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__BOARDING_TIME_STRING);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__WAYMAKING_SKIPPED);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__WAYMAKING_COMPLETED);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__LAYOUT_CONCEPT_TYPE);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__SIMULATION_TIME);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__NOT_STORED_LUGGAGE_ITEMS);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__LUGGAGE_STORAGE_FILLING_DEGREE);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__TOTAL_LARGE_BAGS_STOWED);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__TOTAL_STORAGE_VOLUME);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__PASSENGERS_LOOKING_FOR_LUGGAGE_SPOT);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__VOLUME_OF_NOT_STORED_LUGGAGE_ITEMS);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__MAX_NUMBER_OF_ACTIVE_PASSENGERS);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__AVERAGE_NUMBER_OF_ACTIVE_PASSENGERS);
		createEAttribute(simulationResultEClass, SIMULATION_RESULT__AVERAGE_NUMBER_OF_BAGS);

		ePointEClass = createEClass(EPOINT);
		createEAttribute(ePointEClass, EPOINT__X);
		createEAttribute(ePointEClass, EPOINT__Y);
		createEAttribute(ePointEClass, EPOINT__Z);

		deckEClass = createEClass(DECK);
		createEAttribute(deckEClass, DECK__NAME);
		createEAttribute(deckEClass, DECK__HEIGHT);
		createEReference(deckEClass, DECK__ROWS);
		createEReference(deckEClass, DECK__OBSTACLES);
		createEReference(deckEClass, DECK__DOORS);
		createEReference(deckEClass, DECK__AISLES);
		createEReference(deckEClass, DECK__SHAPE_FLOOR);
		createEReference(deckEClass, DECK__PASSENGERS);

		modelEClass = createEClass(MODEL);
		createEReference(modelEClass, MODEL__DECK);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__SETTINGS);
		createEReference(modelEClass, MODEL__SIMULATION_RESULTS);
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
		AgentPackage theAgentPackage = (AgentPackage) EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);
		SettingsPackage theSettingsPackage = (SettingsPackage) EPackage.Registry.INSTANCE
				.getEPackage(SettingsPackage.eNS_URI);
		MonumentsPackage theMonumentsPackage = (MonumentsPackage) EPackage.Registry.INSTANCE
				.getEPackage(MonumentsPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theAgentPackage);
		getESubpackages().add(theSettingsPackage);
		getESubpackages().add(theMonumentsPackage);
		getESubpackages().add(theEnumsPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationResultEClass, SimulationResult.class, "SimulationResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimulationResult_BoardingTime(), ecorePackage.getEDouble(), "boardingTime", null, 0, 1,
				SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Passengers(), ecorePackage.getEInt(), "passengers", null, 0, 1,
				SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Id(), ecorePackage.getEInt(), "id", null, 0, 1, SimulationResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_Date(), ecorePackage.getEDate(), "date", null, 1, 1, SimulationResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_BoardingTimeString(), ecorePackage.getEString(), "boardingTimeString", null,
				0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_WaymakingSkipped(), ecorePackage.getEInt(), "waymakingSkipped", null, 0, 1,
				SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_WaymakingCompleted(), ecorePackage.getEInt(), "waymakingCompleted", null, 0,
				1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_LayoutConceptType(), theEnumsPackage.getSeatType(), "layoutConceptType",
				null, 1, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_SimulationTime(), ecorePackage.getEDouble(), "simulationTime", "0", 0, 1,
				SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_NotStoredLuggageItems(), ecorePackage.getEInt(), "notStoredLuggageItems",
				"0", 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_LuggageStorageFillingDegree(), ecorePackage.getEDouble(),
				"luggageStorageFillingDegree", "0", 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_TotalLargeBagsStowed(), ecorePackage.getEInt(), "totalLargeBagsStowed", "0",
				0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_TotalStorageVolume(), ecorePackage.getEDouble(), "totalStorageVolume", "0",
				0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_PassengersLookingForLuggageSpot(), ecorePackage.getEInt(),
				"passengersLookingForLuggageSpot", "0", 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_VolumeOfNotStoredLuggageItems(), ecorePackage.getEDouble(),
				"volumeOfNotStoredLuggageItems", "0", 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_MaxNumberOfActivePassengers(), ecorePackage.getEInt(),
				"maxNumberOfActivePassengers", "0", 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_AverageNumberOfActivePassengers(), ecorePackage.getEInt(),
				"averageNumberOfActivePassengers", "0", 0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulationResult_AverageNumberOfBags(), ecorePackage.getEDouble(), "averageNumberOfBags", "0",
				0, 1, SimulationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ePointEClass, EPoint.class, "EPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEPoint_X(), ecorePackage.getEDouble(), "x", "0", 0, 1, EPoint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPoint_Y(), ecorePackage.getEDouble(), "y", "0", 0, 1, EPoint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEPoint_Z(), ecorePackage.getEDouble(), "z", null, 0, 1, EPoint.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deckEClass, Deck.class, "Deck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeck_Name(), ecorePackage.getEString(), "name", null, 0, 1, Deck.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeck_Height(), ecorePackage.getEDouble(), "height", "2.15", 0, 1, Deck.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_Rows(), theMonumentsPackage.getRow(), null, "rows", null, 2, -1, Deck.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_Obstacles(), theMonumentsPackage.getObstacle(), null, "obstacles", null, 0, -1,
				Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_Doors(), theMonumentsPackage.getDoor(), null, "doors", null, 0, -1, Deck.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_Aisles(), theMonumentsPackage.getAisle(), null, "aisles", null, 0, -1, Deck.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_ShapeFloor(), this.getEPoint(), null, "shapeFloor", null, 0, -1, Deck.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeck_Passengers(), theAgentPackage.getPassenger(), null, "passengers", null, 0, -1,
				Deck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModel_Deck(), this.getDeck(), null, "deck", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Settings(), theSettingsPackage.getSettings(), null, "settings", null, 1, 1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_SimulationResults(), this.getSimulationResult(), null, "simulationResults", null, 0, -1,
				Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
