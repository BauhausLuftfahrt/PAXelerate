/**
 */
package com.paxelerate.model.monuments.impl;

import com.paxelerate.model.ModelPackage;

import com.paxelerate.model.agent.AgentPackage;

import com.paxelerate.model.agent.impl.AgentPackageImpl;

import com.paxelerate.model.enums.EnumsPackage;

import com.paxelerate.model.enums.impl.EnumsPackageImpl;

import com.paxelerate.model.impl.ModelPackageImpl;

import com.paxelerate.model.monuments.Aisle;
import com.paxelerate.model.monuments.Door;
import com.paxelerate.model.monuments.Monument;
import com.paxelerate.model.monuments.MonumentsFactory;
import com.paxelerate.model.monuments.MonumentsPackage;
import com.paxelerate.model.monuments.Obstacle;
import com.paxelerate.model.monuments.OverheadBin;
import com.paxelerate.model.monuments.Row;
import com.paxelerate.model.monuments.Seat;
import com.paxelerate.model.monuments.SeatGroup;

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
public class MonumentsPackageImpl extends EPackageImpl implements MonumentsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seatGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obstacleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass seatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aisleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass overheadBinEClass = null;

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
	 * @see com.paxelerate.model.monuments.MonumentsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MonumentsPackageImpl() {
		super(eNS_URI, MonumentsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MonumentsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MonumentsPackage init() {
		if (isInited)
			return (MonumentsPackage) EPackage.Registry.INSTANCE.getEPackage(MonumentsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMonumentsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MonumentsPackageImpl theMonumentsPackage = registeredMonumentsPackage instanceof MonumentsPackageImpl
				? (MonumentsPackageImpl) registeredMonumentsPackage
				: new MonumentsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		ModelPackageImpl theModelPackage = (ModelPackageImpl) (registeredPackage instanceof ModelPackageImpl
				? registeredPackage
				: ModelPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);
		AgentPackageImpl theAgentPackage = (AgentPackageImpl) (registeredPackage instanceof AgentPackageImpl
				? registeredPackage
				: AgentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);
		SettingsPackageImpl theSettingsPackage = (SettingsPackageImpl) (registeredPackage instanceof SettingsPackageImpl
				? registeredPackage
				: SettingsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		EnumsPackageImpl theEnumsPackage = (EnumsPackageImpl) (registeredPackage instanceof EnumsPackageImpl
				? registeredPackage
				: EnumsPackage.eINSTANCE);

		// Create package meta-data objects
		theMonumentsPackage.createPackageContents();
		theModelPackage.createPackageContents();
		theAgentPackage.createPackageContents();
		theSettingsPackage.createPackageContents();
		theEnumsPackage.createPackageContents();

		// Initialize created meta-data
		theMonumentsPackage.initializePackageContents();
		theModelPackage.initializePackageContents();
		theAgentPackage.initializePackageContents();
		theSettingsPackage.initializePackageContents();
		theEnumsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMonumentsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MonumentsPackage.eNS_URI, theMonumentsPackage);
		return theMonumentsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRow_SeatGroups() {
		return (EReference) rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonument() {
		return monumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonument_Position() {
		return (EReference) monumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonument_Size() {
		return (EReference) monumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeatGroup() {
		return seatGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSeatGroup_Seats() {
		return (EReference) seatGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeatGroup_TravelClass() {
		return (EAttribute) seatGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObstacle() {
		return obstacleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObstacle_Seats() {
		return (EReference) obstacleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObstacle_TravelClass() {
		return (EAttribute) obstacleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeat() {
		return seatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Letter() {
		return (EAttribute) seatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_SeatType() {
		return (EAttribute) seatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_SeatLocation() {
		return (EAttribute) seatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSeat_Id() {
		return (EAttribute) seatEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoor() {
		return doorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_PassengerThroughputPerMinute() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Active() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDoor_WaitingPassengers() {
		return (EReference) doorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Side() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_XPosition() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Id() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_EmergencyOnly() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoor_Type() {
		return (EAttribute) doorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAisle() {
		return aisleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAisle_Name() {
		return (EAttribute) aisleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAisle_Id() {
		return (EAttribute) aisleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAisle_IgnoreForSimulation() {
		return (EAttribute) aisleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAisle_Path() {
		return (EReference) aisleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAisle_Width() {
		return (EAttribute) aisleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOverheadBin() {
		return overheadBinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonumentsFactory getMonumentsFactory() {
		return (MonumentsFactory) getEFactoryInstance();
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
		rowEClass = createEClass(ROW);
		createEReference(rowEClass, ROW__SEAT_GROUPS);

		monumentEClass = createEClass(MONUMENT);
		createEReference(monumentEClass, MONUMENT__POSITION);
		createEReference(monumentEClass, MONUMENT__SIZE);

		seatGroupEClass = createEClass(SEAT_GROUP);
		createEReference(seatGroupEClass, SEAT_GROUP__SEATS);
		createEAttribute(seatGroupEClass, SEAT_GROUP__TRAVEL_CLASS);

		obstacleEClass = createEClass(OBSTACLE);
		createEReference(obstacleEClass, OBSTACLE__SEATS);
		createEAttribute(obstacleEClass, OBSTACLE__TRAVEL_CLASS);

		seatEClass = createEClass(SEAT);
		createEAttribute(seatEClass, SEAT__LETTER);
		createEAttribute(seatEClass, SEAT__SEAT_TYPE);
		createEAttribute(seatEClass, SEAT__SEAT_LOCATION);
		createEAttribute(seatEClass, SEAT__ID);

		doorEClass = createEClass(DOOR);
		createEAttribute(doorEClass, DOOR__PASSENGER_THROUGHPUT_PER_MINUTE);
		createEAttribute(doorEClass, DOOR__ACTIVE);
		createEReference(doorEClass, DOOR__WAITING_PASSENGERS);
		createEAttribute(doorEClass, DOOR__SIDE);
		createEAttribute(doorEClass, DOOR__XPOSITION);
		createEAttribute(doorEClass, DOOR__ID);
		createEAttribute(doorEClass, DOOR__EMERGENCY_ONLY);
		createEAttribute(doorEClass, DOOR__TYPE);

		aisleEClass = createEClass(AISLE);
		createEAttribute(aisleEClass, AISLE__NAME);
		createEAttribute(aisleEClass, AISLE__ID);
		createEAttribute(aisleEClass, AISLE__IGNORE_FOR_SIMULATION);
		createEReference(aisleEClass, AISLE__PATH);
		createEAttribute(aisleEClass, AISLE__WIDTH);

		overheadBinEClass = createEClass(OVERHEAD_BIN);
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
		ModelPackage theModelPackage = (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);
		EnumsPackage theEnumsPackage = (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);
		AgentPackage theAgentPackage = (AgentPackage) EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		seatGroupEClass.getESuperTypes().add(this.getMonument());
		obstacleEClass.getESuperTypes().add(this.getMonument());
		overheadBinEClass.getESuperTypes().add(this.getMonument());

		// Initialize classes, features, and operations; add parameters
		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRow_SeatGroups(), this.getSeatGroup(), null, "seatGroups", null, 0, -1, Row.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(monumentEClass, Monument.class, "Monument", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMonument_Position(), theModelPackage.getEPoint(), null, "position", null, 1, 1,
				Monument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMonument_Size(), theModelPackage.getEPoint(), null, "size", null, 1, 1, Monument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(seatGroupEClass, SeatGroup.class, "SeatGroup", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSeatGroup_Seats(), this.getSeat(), null, "seats", null, 0, -1, SeatGroup.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSeatGroup_TravelClass(), theEnumsPackage.getTravelClass(), "travelClass", "ECONOMY", 0, 1,
				SeatGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(obstacleEClass, Obstacle.class, "Obstacle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObstacle_Seats(), this.getSeat(), null, "seats", null, 0, -1, Obstacle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getObstacle_TravelClass(), theEnumsPackage.getTravelClass(), "travelClass", "ECONOMY", 0, 1,
				Obstacle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(seatEClass, Seat.class, "Seat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSeat_Letter(), ecorePackage.getEChar(), "letter", null, 0, 1, Seat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_SeatType(), theEnumsPackage.getSeatType(), "seatType", null, 1, 1, Seat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSeat_SeatLocation(), theEnumsPackage.getSeatLocation(), "seatLocation", "WINDOW", 0, 1,
				Seat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getSeat_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Seat.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doorEClass, Door.class, "Door", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoor_PassengerThroughputPerMinute(), ecorePackage.getEDouble(),
				"passengerThroughputPerMinute", null, 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Active(), ecorePackage.getEBoolean(), "active", "true", 0, 1, Door.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDoor_WaitingPassengers(), theAgentPackage.getPassenger(), null, "waitingPassengers", null, 0,
				-1, Door.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Side(), theEnumsPackage.getDoorSide(), "side", null, 0, 1, Door.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_XPosition(), ecorePackage.getEDouble(), "xPosition", null, 0, 1, Door.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Id(), ecorePackage.getEInt(), "id", "0", 0, 1, Door.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_EmergencyOnly(), ecorePackage.getEBoolean(), "emergencyOnly", "false", 0, 1, Door.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDoor_Type(), theEnumsPackage.getDoorType(), "type", null, 0, 1, Door.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aisleEClass, Aisle.class, "Aisle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAisle_Name(), ecorePackage.getEString(), "name", null, 0, 1, Aisle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAisle_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Aisle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAisle_IgnoreForSimulation(), ecorePackage.getEBoolean(), "ignoreForSimulation", "false", 0, 1,
				Aisle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAisle_Path(), theModelPackage.getEPoint(), null, "path", null, 0, -1, Aisle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAisle_Width(), ecorePackage.getEDouble(), "width", "0.51", 0, 1, Aisle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(overheadBinEClass, OverheadBin.class, "OverheadBin", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //MonumentsPackageImpl
