/**
 */
package com.paxelerate.model.agent.impl;

import com.paxelerate.model.ModelPackage;

import com.paxelerate.model.agent.AgentFactory;
import com.paxelerate.model.agent.AgentPackage;
import com.paxelerate.model.agent.Luggage;
import com.paxelerate.model.agent.Passenger;

import com.paxelerate.model.enums.EnumsPackage;

import com.paxelerate.model.enums.impl.EnumsPackageImpl;

import com.paxelerate.model.impl.ModelPackageImpl;

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
public class AgentPackageImpl extends EPackageImpl implements AgentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passengerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass luggageEClass = null;

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
	 * @see com.paxelerate.model.agent.AgentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgentPackageImpl() {
		super(eNS_URI, AgentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgentPackage init() {
		if (isInited)
			return (AgentPackage) EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AgentPackageImpl theAgentPackage = registeredAgentPackage instanceof AgentPackageImpl
				? (AgentPackageImpl) registeredAgentPackage
				: new AgentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theModelPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
				? registeredPackage
				: ModelPackage.eINSTANCE);
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
		theAgentPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theSettingsPackage.createPackageContents();
		theMonumentsPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theAgentPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theSettingsPackage.initializePackageContents();
		theMonumentsPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgentPackage.eNS_URI, theAgentPackage);
		return theAgentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPassenger() {
		return passengerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Id() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Gender() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Height() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Age() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Weight() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_Door() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_BoardingTime() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_Seat() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Width() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_Depth() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_IsSeated() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WalkingSpeed() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_StartBoardingAfterDelay() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PassengerMood() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfWaits() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_NumberOfMakeWayOperations() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_DistanceWalked() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_CostOfPath() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_TotalTimeWaited() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_Luggage() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_PassingDecisionCostFactor() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_Path() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_SpeedOnPath() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_CurrentPosition() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_DesiredPosition() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_StartPosition() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPassenger_GoalPosition() {
		return (EReference) passengerEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_State() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WidthBottom() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WidthMiddle() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_WidthTop() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_DepthBottom() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_DepthMiddle() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_DepthTop() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_HeightBottom() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_HeightMiddle() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPassenger_HeightTop() {
		return (EAttribute) passengerEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLuggage() {
		return luggageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggage_Id() {
		return (EAttribute) luggageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggage_StowTime() {
		return (EAttribute) luggageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggage_StowDistance() {
		return (EAttribute) luggageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggage_Type() {
		return (EAttribute) luggageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLuggage_Volume() {
		return (EAttribute) luggageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentFactory getAgentFactory() {
		return (AgentFactory) getEFactoryInstance();
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
		passengerEClass = createEClass(PASSENGER);
		createEAttribute(passengerEClass, PASSENGER__ID);
		createEAttribute(passengerEClass, PASSENGER__GENDER);
		createEAttribute(passengerEClass, PASSENGER__HEIGHT);
		createEAttribute(passengerEClass, PASSENGER__AGE);
		createEAttribute(passengerEClass, PASSENGER__WEIGHT);
		createEReference(passengerEClass, PASSENGER__DOOR);
		createEAttribute(passengerEClass, PASSENGER__BOARDING_TIME);
		createEReference(passengerEClass, PASSENGER__SEAT);
		createEAttribute(passengerEClass, PASSENGER__WIDTH);
		createEAttribute(passengerEClass, PASSENGER__DEPTH);
		createEAttribute(passengerEClass, PASSENGER__IS_SEATED);
		createEAttribute(passengerEClass, PASSENGER__WALKING_SPEED);
		createEAttribute(passengerEClass, PASSENGER__START_BOARDING_AFTER_DELAY);
		createEAttribute(passengerEClass, PASSENGER__PASSENGER_MOOD);
		createEAttribute(passengerEClass, PASSENGER__NUMBER_OF_WAITS);
		createEAttribute(passengerEClass, PASSENGER__NUMBER_OF_MAKE_WAY_OPERATIONS);
		createEAttribute(passengerEClass, PASSENGER__DISTANCE_WALKED);
		createEAttribute(passengerEClass, PASSENGER__COST_OF_PATH);
		createEAttribute(passengerEClass, PASSENGER__TOTAL_TIME_WAITED);
		createEReference(passengerEClass, PASSENGER__LUGGAGE);
		createEAttribute(passengerEClass, PASSENGER__PASSING_DECISION_COST_FACTOR);
		createEReference(passengerEClass, PASSENGER__PATH);
		createEAttribute(passengerEClass, PASSENGER__SPEED_ON_PATH);
		createEReference(passengerEClass, PASSENGER__CURRENT_POSITION);
		createEReference(passengerEClass, PASSENGER__DESIRED_POSITION);
		createEReference(passengerEClass, PASSENGER__START_POSITION);
		createEReference(passengerEClass, PASSENGER__GOAL_POSITION);
		createEAttribute(passengerEClass, PASSENGER__STATE);
		createEAttribute(passengerEClass, PASSENGER__WIDTH_BOTTOM);
		createEAttribute(passengerEClass, PASSENGER__WIDTH_MIDDLE);
		createEAttribute(passengerEClass, PASSENGER__WIDTH_TOP);
		createEAttribute(passengerEClass, PASSENGER__DEPTH_BOTTOM);
		createEAttribute(passengerEClass, PASSENGER__DEPTH_MIDDLE);
		createEAttribute(passengerEClass, PASSENGER__DEPTH_TOP);
		createEAttribute(passengerEClass, PASSENGER__HEIGHT_BOTTOM);
		createEAttribute(passengerEClass, PASSENGER__HEIGHT_MIDDLE);
		createEAttribute(passengerEClass, PASSENGER__HEIGHT_TOP);

		luggageEClass = createEClass(LUGGAGE);
		createEAttribute(luggageEClass, LUGGAGE__ID);
		createEAttribute(luggageEClass, LUGGAGE__STOW_TIME);
		createEAttribute(luggageEClass, LUGGAGE__STOW_DISTANCE);
		createEAttribute(luggageEClass, LUGGAGE__TYPE);
		createEAttribute(luggageEClass, LUGGAGE__VOLUME);
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
		EnumsPackage theEnumsPackage = (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		MonumentsPackage theMonumentsPackage = (MonumentsPackage) EPackage.Registry.INSTANCE
				.getEPackage(MonumentsPackage.eNS_URI);
		ModelPackage theModelPackage = (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(passengerEClass, Passenger.class, "Passenger", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPassenger_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Passenger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Gender(), theEnumsPackage.getGender(), "gender", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Passenger.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_Door(), theMonumentsPackage.getDoor(), null, "door", null, 1, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_BoardingTime(), ecorePackage.getEDouble(), "boardingTime", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_Seat(), theMonumentsPackage.getSeat(), null, "seat", null, 1, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Width(), ecorePackage.getEDouble(), "width", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_Depth(), ecorePackage.getEDouble(), "depth", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_IsSeated(), ecorePackage.getEBoolean(), "isSeated", "false", 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_WalkingSpeed(), ecorePackage.getEDouble(), "walkingSpeed", "2.0", 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_StartBoardingAfterDelay(), ecorePackage.getEDouble(), "startBoardingAfterDelay",
				"1.0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PassengerMood(), theEnumsPackage.getPassengerMood(), "passengerMood", null, 1, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_NumberOfWaits(), ecorePackage.getEInt(), "numberOfWaits", "0", 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_NumberOfMakeWayOperations(), ecorePackage.getEInt(), "numberOfMakeWayOperations",
				"0", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_DistanceWalked(), ecorePackage.getEDouble(), "distanceWalked", "0", 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_CostOfPath(), ecorePackage.getEInt(), "costOfPath", "0", 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_TotalTimeWaited(), ecorePackage.getEDouble(), "totalTimeWaited", "0", 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_Luggage(), this.getLuggage(), null, "luggage", null, 0, -1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_PassingDecisionCostFactor(), ecorePackage.getEDouble(), "passingDecisionCostFactor",
				"1", 0, 1, Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_Path(), theModelPackage.getEPoint(), null, "path", null, 0, -1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_SpeedOnPath(), ecorePackage.getEDouble(), "speedOnPath", null, 0, -1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_CurrentPosition(), theModelPackage.getEPoint(), null, "currentPosition", null, 1, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_DesiredPosition(), theModelPackage.getEPoint(), null, "desiredPosition", null, 1, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_StartPosition(), theModelPackage.getEPoint(), null, "startPosition", null, 1, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPassenger_GoalPosition(), theModelPackage.getEPoint(), null, "goalPosition", null, 1, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_State(), theEnumsPackage.getState(), "state", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_WidthBottom(), ecorePackage.getEDouble(), "widthBottom", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_WidthMiddle(), ecorePackage.getEDouble(), "widthMiddle", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_WidthTop(), ecorePackage.getEDouble(), "widthTop", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_DepthBottom(), ecorePackage.getEDouble(), "depthBottom", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_DepthMiddle(), ecorePackage.getEDouble(), "depthMiddle", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_DepthTop(), ecorePackage.getEDouble(), "depthTop", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_HeightBottom(), ecorePackage.getEDouble(), "heightBottom", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_HeightMiddle(), ecorePackage.getEDouble(), "heightMiddle", null, 0, 1,
				Passenger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPassenger_HeightTop(), ecorePackage.getEDouble(), "heightTop", null, 0, 1, Passenger.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(luggageEClass, Luggage.class, "Luggage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLuggage_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Luggage.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggage_StowTime(), ecorePackage.getEDouble(), "stowTime", "1.0", 0, 1, Luggage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggage_StowDistance(), ecorePackage.getEDouble(), "stowDistance", null, 0, 1, Luggage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggage_Type(), theEnumsPackage.getLuggageType(), "type", null, 0, 1, Luggage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLuggage_Volume(), ecorePackage.getEDouble(), "volume", "0", 0, 1, Luggage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AgentPackageImpl
