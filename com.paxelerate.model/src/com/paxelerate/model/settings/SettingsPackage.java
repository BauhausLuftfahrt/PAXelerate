/**
 */
package com.paxelerate.model.settings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.settings.SettingsFactory
 * @model kind="package"
 * @generated
 */
public interface SettingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "settings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.paxelerate.core.model/settings/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.paxelerate.core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SettingsPackage eINSTANCE = com.paxelerate.model.settings.impl.SettingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.paxelerate.model.settings.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.settings.impl.SettingsImpl
	 * @see com.paxelerate.model.settings.impl.SettingsPackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Luggage Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__LUGGAGE_PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Passenger Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__PASSENGER_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Simulation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SIMULATION_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Use Center Luggage Storage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__USE_CENTER_LUGGAGE_STORAGE = 3;

	/**
	 * The feature id for the '<em><b>Seat Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SEAT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Simulation Grid Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SIMULATION_GRID_RESOLUTION = 5;

	/**
	 * The feature id for the '<em><b>Simulation Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SIMULATION_SPEED_FACTOR = 6;

	/**
	 * The feature id for the '<em><b>Thread Sleep Time Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__THREAD_SLEEP_TIME_DEFAULT = 7;

	/**
	 * The feature id for the '<em><b>Sideways Foldabe Seat Popup Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN = 8;

	/**
	 * The feature id for the '<em><b>Sideways Foldabe Seat Popup Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION = 9;

	/**
	 * The feature id for the '<em><b>Lifting Seat Pan Popup Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN = 10;

	/**
	 * The feature id for the '<em><b>Lifting Seat Pan Popup Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION = 11;

	/**
	 * The feature id for the '<em><b>Boarding Conformance Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__BOARDING_CONFORMANCE_RATE = 12;

	/**
	 * The feature id for the '<em><b>Number Of Boarding Blocks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__NUMBER_OF_BOARDING_BLOCKS = 13;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl <em>Luggage Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.settings.impl.LuggagePropertiesImpl
	 * @see com.paxelerate.model.settings.impl.SettingsPackageImpl#getLuggageProperties()
	 * @generated
	 */
	int LUGGAGE_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Max Number Of Luggage Items Per Pax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX = 0;

	/**
	 * The feature id for the '<em><b>Luggage Stow Distance From Seat Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN = 1;

	/**
	 * The feature id for the '<em><b>Luggage Stow Distance From Seat Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION = 2;

	/**
	 * The feature id for the '<em><b>Jacket Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION = 3;

	/**
	 * The feature id for the '<em><b>Jacket Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN = 4;

	/**
	 * The feature id for the '<em><b>Small Bag Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN = 5;

	/**
	 * The feature id for the '<em><b>Small Bag Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION = 6;

	/**
	 * The feature id for the '<em><b>Medium Bag Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN = 7;

	/**
	 * The feature id for the '<em><b>Medium Bag Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION = 8;

	/**
	 * The feature id for the '<em><b>Large Bag Stow Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN = 9;

	/**
	 * The feature id for the '<em><b>Large Bag Stow Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION = 10;

	/**
	 * The feature id for the '<em><b>Jacket Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__JACKET_VOLUME = 11;

	/**
	 * The feature id for the '<em><b>Small Bag Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME = 12;

	/**
	 * The feature id for the '<em><b>Medium Bag Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME = 13;

	/**
	 * The feature id for the '<em><b>Large Bag Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME = 14;

	/**
	 * The feature id for the '<em><b>Jacket Bulkiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__JACKET_BULKINESS = 15;

	/**
	 * The feature id for the '<em><b>Small Bag Bulkiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS = 16;

	/**
	 * The feature id for the '<em><b>Medium Bag Bulkiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS = 17;

	/**
	 * The feature id for the '<em><b>Large Bag Bulkiness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS = 18;

	/**
	 * The feature id for the '<em><b>Jacket Walking Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR = 19;

	/**
	 * The feature id for the '<em><b>Small Bag Walking Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR = 20;

	/**
	 * The feature id for the '<em><b>Medium Bag Walking Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR = 21;

	/**
	 * The feature id for the '<em><b>Large Bag Walking Speed Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR = 22;

	/**
	 * The feature id for the '<em><b>Luggage Storage Scaling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING = 23;

	/**
	 * The number of structural features of the '<em>Luggage Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Luggage Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LUGGAGE_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl <em>Passenger Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.paxelerate.model.settings.impl.PassengerPropertiesImpl
	 * @see com.paxelerate.model.settings.impl.SettingsPackageImpl#getPassengerProperties()
	 * @generated
	 */
	int PASSENGER_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Passenger Width Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE = 0;

	/**
	 * The feature id for the '<em><b>Passenger Width Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE = 1;

	/**
	 * The feature id for the '<em><b>Passenger Weight Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE = 2;

	/**
	 * The feature id for the '<em><b>Passenger Weight Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE = 3;

	/**
	 * The feature id for the '<em><b>Passenger Height Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE = 4;

	/**
	 * The feature id for the '<em><b>Passenger Height Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE = 5;

	/**
	 * The feature id for the '<em><b>Passenger Depth Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE = 6;

	/**
	 * The feature id for the '<em><b>Passenger Depth Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE = 7;

	/**
	 * The feature id for the '<em><b>Passenger Width Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE = 8;

	/**
	 * The feature id for the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE = 9;

	/**
	 * The feature id for the '<em><b>Passenger Weight Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE = 10;

	/**
	 * The feature id for the '<em><b>Passenger Weight Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE = 11;

	/**
	 * The feature id for the '<em><b>Passenger Height Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE = 12;

	/**
	 * The feature id for the '<em><b>Passenger Height Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE = 13;

	/**
	 * The feature id for the '<em><b>Passenger Depth Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE = 14;

	/**
	 * The feature id for the '<em><b>Passenger Depth Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE = 15;

	/**
	 * The feature id for the '<em><b>Passenger Aggressive Mood Share</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE = 16;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN = 17;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION = 18;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Folding Seat Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN = 19;

	/**
	 * The feature id for the '<em><b>Seat Interference Process Time Folding Seat Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION = 20;

	/**
	 * The feature id for the '<em><b>Passive Passenger Waiting Time After Collision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION = 21;

	/**
	 * The feature id for the '<em><b>Seat Interference Multi Passenger Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR = 22;

	/**
	 * The feature id for the '<em><b>Door Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__DOOR_SELECTION = 23;

	/**
	 * The feature id for the '<em><b>Group Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__GROUP_PERCENTAGE = 24;

	/**
	 * The feature id for the '<em><b>Age Speed Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY = 25;

	/**
	 * The feature id for the '<em><b>Age Distribution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__AGE_DISTRIBUTION = 26;

	/**
	 * The feature id for the '<em><b>Passenger Knee Width Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE = 27;

	/**
	 * The feature id for the '<em><b>Passenger Knee Width Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE = 28;

	/**
	 * The feature id for the '<em><b>Passenger Knee Width Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE = 29;

	/**
	 * The feature id for the '<em><b>Passenger Knee Width Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE = 30;

	/**
	 * The feature id for the '<em><b>Passenger Knee Depth Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE = 31;

	/**
	 * The feature id for the '<em><b>Passenger Knee Depth Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE = 32;

	/**
	 * The feature id for the '<em><b>Passenger Knee Depth Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE = 33;

	/**
	 * The feature id for the '<em><b>Passenger Knee Depth Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE = 34;

	/**
	 * The feature id for the '<em><b>Passenger Knee Height Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE = 35;

	/**
	 * The feature id for the '<em><b>Passenger Knee Height Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE = 36;

	/**
	 * The feature id for the '<em><b>Passenger Knee Height Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE = 37;

	/**
	 * The feature id for the '<em><b>Passenger Knee Height Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE = 38;

	/**
	 * The feature id for the '<em><b>Passenger Hip Width Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE = 39;

	/**
	 * The feature id for the '<em><b>Passenger Hip Width Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE = 40;

	/**
	 * The feature id for the '<em><b>Passenger Hip Width Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE = 41;

	/**
	 * The feature id for the '<em><b>Passenger Hip Width Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE = 42;

	/**
	 * The feature id for the '<em><b>Passenger Hip Depth Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE = 43;

	/**
	 * The feature id for the '<em><b>Passenger Hip Depth Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE = 44;

	/**
	 * The feature id for the '<em><b>Passenger Hip Depth Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE = 45;

	/**
	 * The feature id for the '<em><b>Passenger Hip Depth Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE = 46;

	/**
	 * The feature id for the '<em><b>Passenger Hip Height Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE = 47;

	/**
	 * The feature id for the '<em><b>Passenger Hip Height Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE = 48;

	/**
	 * The feature id for the '<em><b>Passenger Hip Height Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE = 49;

	/**
	 * The feature id for the '<em><b>Passenger Hip Height Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE = 50;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Width Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE = 51;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Width Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE = 52;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Width Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE = 53;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Width Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE = 54;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Depth Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE = 55;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Depth Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE = 56;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Depth Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE = 57;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Depth Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE = 58;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Height Mean Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE = 59;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Height Deviation Male</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE = 60;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Height Mean Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE = 61;

	/**
	 * The feature id for the '<em><b>Passenger Shoulder Height Deviation Female</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE = 62;

	/**
	 * The number of structural features of the '<em>Passenger Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES_FEATURE_COUNT = 63;

	/**
	 * The number of operations of the '<em>Passenger Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSENGER_PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.settings.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see com.paxelerate.model.settings.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.settings.Settings#getLuggageProperties <em>Luggage Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Luggage Properties</em>'.
	 * @see com.paxelerate.model.settings.Settings#getLuggageProperties()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_LuggageProperties();

	/**
	 * Returns the meta object for the containment reference '{@link com.paxelerate.model.settings.Settings#getPassengerProperties <em>Passenger Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Passenger Properties</em>'.
	 * @see com.paxelerate.model.settings.Settings#getPassengerProperties()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_PassengerProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getSimulationType <em>Simulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Type</em>'.
	 * @see com.paxelerate.model.settings.Settings#getSimulationType()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_SimulationType();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#isUseCenterLuggageStorage <em>Use Center Luggage Storage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Center Luggage Storage</em>'.
	 * @see com.paxelerate.model.settings.Settings#isUseCenterLuggageStorage()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_UseCenterLuggageStorage();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getSeatType <em>Seat Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Type</em>'.
	 * @see com.paxelerate.model.settings.Settings#getSeatType()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_SeatType();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getSimulationGridResolution <em>Simulation Grid Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Grid Resolution</em>'.
	 * @see com.paxelerate.model.settings.Settings#getSimulationGridResolution()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_SimulationGridResolution();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getSimulationSpeedFactor <em>Simulation Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Simulation Speed Factor</em>'.
	 * @see com.paxelerate.model.settings.Settings#getSimulationSpeedFactor()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_SimulationSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getThreadSleepTimeDefault <em>Thread Sleep Time Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thread Sleep Time Default</em>'.
	 * @see com.paxelerate.model.settings.Settings#getThreadSleepTimeDefault()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_ThreadSleepTimeDefault();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeMean <em>Sideways Foldabe Seat Popup Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sideways Foldabe Seat Popup Time Mean</em>'.
	 * @see com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeMean()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_SidewaysFoldabeSeatPopupTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeDeviation <em>Sideways Foldabe Seat Popup Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sideways Foldabe Seat Popup Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.Settings#getSidewaysFoldabeSeatPopupTimeDeviation()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_SidewaysFoldabeSeatPopupTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeMean <em>Lifting Seat Pan Popup Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifting Seat Pan Popup Time Mean</em>'.
	 * @see com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeMean()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_LiftingSeatPanPopupTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeDeviation <em>Lifting Seat Pan Popup Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lifting Seat Pan Popup Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.Settings#getLiftingSeatPanPopupTimeDeviation()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_LiftingSeatPanPopupTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getBoardingConformanceRate <em>Boarding Conformance Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boarding Conformance Rate</em>'.
	 * @see com.paxelerate.model.settings.Settings#getBoardingConformanceRate()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_BoardingConformanceRate();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.Settings#getNumberOfBoardingBlocks <em>Number Of Boarding Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Boarding Blocks</em>'.
	 * @see com.paxelerate.model.settings.Settings#getNumberOfBoardingBlocks()
	 * @see #getSettings()
	 * @generated
	 */
	EAttribute getSettings_NumberOfBoardingBlocks();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.settings.LuggageProperties <em>Luggage Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Luggage Properties</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties
	 * @generated
	 */
	EClass getLuggageProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getMaxNumberOfLuggageItemsPerPax <em>Max Number Of Luggage Items Per Pax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Number Of Luggage Items Per Pax</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getMaxNumberOfLuggageItemsPerPax()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_MaxNumberOfLuggageItemsPerPax();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Distance From Seat Mean</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LuggageStowDistanceFromSeatMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Stow Distance From Seat Deviation</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LuggageStowDistanceFromSeatDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeDeviation <em>Jacket Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jacket Stow Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_JacketStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeMean <em>Jacket Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jacket Stow Time Mean</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_JacketStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeMean <em>Small Bag Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Bag Stow Time Mean</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_SmallBagStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeDeviation <em>Small Bag Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Bag Stow Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_SmallBagStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeMean <em>Medium Bag Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Bag Stow Time Mean</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_MediumBagStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeDeviation <em>Medium Bag Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Bag Stow Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_MediumBagStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeMean <em>Large Bag Stow Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Bag Stow Time Mean</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeMean()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LargeBagStowTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeDeviation <em>Large Bag Stow Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Bag Stow Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeDeviation()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LargeBagStowTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getJacketVolume <em>Jacket Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jacket Volume</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getJacketVolume()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_JacketVolume();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagVolume <em>Small Bag Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Bag Volume</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getSmallBagVolume()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_SmallBagVolume();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagVolume <em>Medium Bag Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Bag Volume</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getMediumBagVolume()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_MediumBagVolume();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagVolume <em>Large Bag Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Bag Volume</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLargeBagVolume()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LargeBagVolume();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getJacketBulkiness <em>Jacket Bulkiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jacket Bulkiness</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getJacketBulkiness()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_JacketBulkiness();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagBulkiness <em>Small Bag Bulkiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Bag Bulkiness</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getSmallBagBulkiness()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_SmallBagBulkiness();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagBulkiness <em>Medium Bag Bulkiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Bag Bulkiness</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getMediumBagBulkiness()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_MediumBagBulkiness();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagBulkiness <em>Large Bag Bulkiness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Bag Bulkiness</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLargeBagBulkiness()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LargeBagBulkiness();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getJacketWalkingSpeedFactor <em>Jacket Walking Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jacket Walking Speed Factor</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getJacketWalkingSpeedFactor()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_JacketWalkingSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagWalkingSpeedFactor <em>Small Bag Walking Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Small Bag Walking Speed Factor</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getSmallBagWalkingSpeedFactor()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_SmallBagWalkingSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagWalkingSpeedFactor <em>Medium Bag Walking Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium Bag Walking Speed Factor</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getMediumBagWalkingSpeedFactor()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_MediumBagWalkingSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagWalkingSpeedFactor <em>Large Bag Walking Speed Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Large Bag Walking Speed Factor</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLargeBagWalkingSpeedFactor()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LargeBagWalkingSpeedFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStorageScaling <em>Luggage Storage Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luggage Storage Scaling</em>'.
	 * @see com.paxelerate.model.settings.LuggageProperties#getLuggageStorageScaling()
	 * @see #getLuggageProperties()
	 * @generated
	 */
	EAttribute getLuggageProperties_LuggageStorageScaling();

	/**
	 * Returns the meta object for class '{@link com.paxelerate.model.settings.PassengerProperties <em>Passenger Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passenger Properties</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties
	 * @generated
	 */
	EClass getPassengerProperties();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Width Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWidthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Weight Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerWeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Height Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Depth Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerDepthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Aggressive Mood Share</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerAggressiveMoodShare()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerAggressiveMoodShare();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Mean</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeMean()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Deviation</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeDeviation()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Folding Seat Mean</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Process Time Folding Seat Deviation</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passive Passenger Waiting Time After Collision</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassivePassengerWaitingTimeAfterCollision();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceMultiPassengerFactor <em>Seat Interference Multi Passenger Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seat Interference Multi Passenger Factor</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceMultiPassengerFactor()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_SeatInterferenceMultiPassengerFactor();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getDoorSelection <em>Door Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door Selection</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getDoorSelection()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_DoorSelection();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getGroupPercentage <em>Group Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Percentage</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getGroupPercentage()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_GroupPercentage();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.settings.PassengerProperties#getAgeSpeedDependency <em>Age Speed Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Age Speed Dependency</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getAgeSpeedDependency()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EReference getPassengerProperties_AgeSpeedDependency();

	/**
	 * Returns the meta object for the containment reference list '{@link com.paxelerate.model.settings.PassengerProperties#getAgeDistribution <em>Age Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Age Distribution</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getAgeDistribution()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EReference getPassengerProperties_AgeDistribution();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanMale <em>Passenger Knee Width Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Width Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeWidthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationMale <em>Passenger Knee Width Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Width Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeWidthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanFemale <em>Passenger Knee Width Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Width Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeWidthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationFemale <em>Passenger Knee Width Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Width Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeWidthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanMale <em>Passenger Knee Depth Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Depth Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeDepthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationMale <em>Passenger Knee Depth Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Depth Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeDepthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanFemale <em>Passenger Knee Depth Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Depth Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeDepthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationFemale <em>Passenger Knee Depth Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Depth Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeDepthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanMale <em>Passenger Knee Height Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Height Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeHeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationMale <em>Passenger Knee Height Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Height Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeHeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanFemale <em>Passenger Knee Height Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Height Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeHeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationFemale <em>Passenger Knee Height Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Knee Height Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerKneeHeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanMale <em>Passenger Hip Width Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Width Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipWidthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationMale <em>Passenger Hip Width Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Width Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipWidthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanFemale <em>Passenger Hip Width Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Width Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipWidthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationFemale <em>Passenger Hip Width Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Width Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipWidthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanMale <em>Passenger Hip Depth Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Depth Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipDepthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationMale <em>Passenger Hip Depth Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Depth Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipDepthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanFemale <em>Passenger Hip Depth Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Depth Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipDepthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationFemale <em>Passenger Hip Depth Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Depth Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipDepthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanMale <em>Passenger Hip Height Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Height Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipHeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationMale <em>Passenger Hip Height Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Height Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipHeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanFemale <em>Passenger Hip Height Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Height Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipHeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationFemale <em>Passenger Hip Height Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Hip Height Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerHipHeightDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanMale <em>Passenger Shoulder Width Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Width Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderWidthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationMale <em>Passenger Shoulder Width Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Width Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderWidthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanFemale <em>Passenger Shoulder Width Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Width Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderWidthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationFemale <em>Passenger Shoulder Width Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Width Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderWidthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanMale <em>Passenger Shoulder Depth Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Depth Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderDepthMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationMale <em>Passenger Shoulder Depth Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Depth Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderDepthDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanFemale <em>Passenger Shoulder Depth Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Depth Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderDepthMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationFemale <em>Passenger Shoulder Depth Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Depth Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderDepthDeviationFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanMale <em>Passenger Shoulder Height Mean Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Height Mean Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderHeightMeanMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationMale <em>Passenger Shoulder Height Deviation Male</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Height Deviation Male</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationMale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderHeightDeviationMale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanFemale <em>Passenger Shoulder Height Mean Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Height Mean Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderHeightMeanFemale();

	/**
	 * Returns the meta object for the attribute '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationFemale <em>Passenger Shoulder Height Deviation Female</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Passenger Shoulder Height Deviation Female</em>'.
	 * @see com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationFemale()
	 * @see #getPassengerProperties()
	 * @generated
	 */
	EAttribute getPassengerProperties_PassengerShoulderHeightDeviationFemale();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SettingsFactory getSettingsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.paxelerate.model.settings.impl.SettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.settings.impl.SettingsImpl
		 * @see com.paxelerate.model.settings.impl.SettingsPackageImpl#getSettings()
		 * @generated
		 */
		EClass SETTINGS = eINSTANCE.getSettings();

		/**
		 * The meta object literal for the '<em><b>Luggage Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__LUGGAGE_PROPERTIES = eINSTANCE.getSettings_LuggageProperties();

		/**
		 * The meta object literal for the '<em><b>Passenger Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__PASSENGER_PROPERTIES = eINSTANCE.getSettings_PassengerProperties();

		/**
		 * The meta object literal for the '<em><b>Simulation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SIMULATION_TYPE = eINSTANCE.getSettings_SimulationType();

		/**
		 * The meta object literal for the '<em><b>Use Center Luggage Storage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__USE_CENTER_LUGGAGE_STORAGE = eINSTANCE.getSettings_UseCenterLuggageStorage();

		/**
		 * The meta object literal for the '<em><b>Seat Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SEAT_TYPE = eINSTANCE.getSettings_SeatType();

		/**
		 * The meta object literal for the '<em><b>Simulation Grid Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SIMULATION_GRID_RESOLUTION = eINSTANCE.getSettings_SimulationGridResolution();

		/**
		 * The meta object literal for the '<em><b>Simulation Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SIMULATION_SPEED_FACTOR = eINSTANCE.getSettings_SimulationSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Thread Sleep Time Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__THREAD_SLEEP_TIME_DEFAULT = eINSTANCE.getSettings_ThreadSleepTimeDefault();

		/**
		 * The meta object literal for the '<em><b>Sideways Foldabe Seat Popup Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_MEAN = eINSTANCE
				.getSettings_SidewaysFoldabeSeatPopupTimeMean();

		/**
		 * The meta object literal for the '<em><b>Sideways Foldabe Seat Popup Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__SIDEWAYS_FOLDABE_SEAT_POPUP_TIME_DEVIATION = eINSTANCE
				.getSettings_SidewaysFoldabeSeatPopupTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Lifting Seat Pan Popup Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_MEAN = eINSTANCE.getSettings_LiftingSeatPanPopupTimeMean();

		/**
		 * The meta object literal for the '<em><b>Lifting Seat Pan Popup Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__LIFTING_SEAT_PAN_POPUP_TIME_DEVIATION = eINSTANCE
				.getSettings_LiftingSeatPanPopupTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Boarding Conformance Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__BOARDING_CONFORMANCE_RATE = eINSTANCE.getSettings_BoardingConformanceRate();

		/**
		 * The meta object literal for the '<em><b>Number Of Boarding Blocks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTINGS__NUMBER_OF_BOARDING_BLOCKS = eINSTANCE.getSettings_NumberOfBoardingBlocks();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.settings.impl.LuggagePropertiesImpl <em>Luggage Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.settings.impl.LuggagePropertiesImpl
		 * @see com.paxelerate.model.settings.impl.SettingsPackageImpl#getLuggageProperties()
		 * @generated
		 */
		EClass LUGGAGE_PROPERTIES = eINSTANCE.getLuggageProperties();

		/**
		 * The meta object literal for the '<em><b>Max Number Of Luggage Items Per Pax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__MAX_NUMBER_OF_LUGGAGE_ITEMS_PER_PAX = eINSTANCE
				.getLuggageProperties_MaxNumberOfLuggageItemsPerPax();

		/**
		 * The meta object literal for the '<em><b>Luggage Stow Distance From Seat Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_MEAN = eINSTANCE
				.getLuggageProperties_LuggageStowDistanceFromSeatMean();

		/**
		 * The meta object literal for the '<em><b>Luggage Stow Distance From Seat Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LUGGAGE_STOW_DISTANCE_FROM_SEAT_DEVIATION = eINSTANCE
				.getLuggageProperties_LuggageStowDistanceFromSeatDeviation();

		/**
		 * The meta object literal for the '<em><b>Jacket Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__JACKET_STOW_TIME_DEVIATION = eINSTANCE
				.getLuggageProperties_JacketStowTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Jacket Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__JACKET_STOW_TIME_MEAN = eINSTANCE.getLuggageProperties_JacketStowTimeMean();

		/**
		 * The meta object literal for the '<em><b>Small Bag Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_MEAN = eINSTANCE.getLuggageProperties_SmallBagStowTimeMean();

		/**
		 * The meta object literal for the '<em><b>Small Bag Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__SMALL_BAG_STOW_TIME_DEVIATION = eINSTANCE
				.getLuggageProperties_SmallBagStowTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Medium Bag Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_MEAN = eINSTANCE
				.getLuggageProperties_MediumBagStowTimeMean();

		/**
		 * The meta object literal for the '<em><b>Medium Bag Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__MEDIUM_BAG_STOW_TIME_DEVIATION = eINSTANCE
				.getLuggageProperties_MediumBagStowTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Large Bag Stow Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_MEAN = eINSTANCE.getLuggageProperties_LargeBagStowTimeMean();

		/**
		 * The meta object literal for the '<em><b>Large Bag Stow Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LARGE_BAG_STOW_TIME_DEVIATION = eINSTANCE
				.getLuggageProperties_LargeBagStowTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Jacket Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__JACKET_VOLUME = eINSTANCE.getLuggageProperties_JacketVolume();

		/**
		 * The meta object literal for the '<em><b>Small Bag Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__SMALL_BAG_VOLUME = eINSTANCE.getLuggageProperties_SmallBagVolume();

		/**
		 * The meta object literal for the '<em><b>Medium Bag Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__MEDIUM_BAG_VOLUME = eINSTANCE.getLuggageProperties_MediumBagVolume();

		/**
		 * The meta object literal for the '<em><b>Large Bag Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LARGE_BAG_VOLUME = eINSTANCE.getLuggageProperties_LargeBagVolume();

		/**
		 * The meta object literal for the '<em><b>Jacket Bulkiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__JACKET_BULKINESS = eINSTANCE.getLuggageProperties_JacketBulkiness();

		/**
		 * The meta object literal for the '<em><b>Small Bag Bulkiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__SMALL_BAG_BULKINESS = eINSTANCE.getLuggageProperties_SmallBagBulkiness();

		/**
		 * The meta object literal for the '<em><b>Medium Bag Bulkiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__MEDIUM_BAG_BULKINESS = eINSTANCE.getLuggageProperties_MediumBagBulkiness();

		/**
		 * The meta object literal for the '<em><b>Large Bag Bulkiness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LARGE_BAG_BULKINESS = eINSTANCE.getLuggageProperties_LargeBagBulkiness();

		/**
		 * The meta object literal for the '<em><b>Jacket Walking Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__JACKET_WALKING_SPEED_FACTOR = eINSTANCE
				.getLuggageProperties_JacketWalkingSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Small Bag Walking Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__SMALL_BAG_WALKING_SPEED_FACTOR = eINSTANCE
				.getLuggageProperties_SmallBagWalkingSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Medium Bag Walking Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__MEDIUM_BAG_WALKING_SPEED_FACTOR = eINSTANCE
				.getLuggageProperties_MediumBagWalkingSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Large Bag Walking Speed Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LARGE_BAG_WALKING_SPEED_FACTOR = eINSTANCE
				.getLuggageProperties_LargeBagWalkingSpeedFactor();

		/**
		 * The meta object literal for the '<em><b>Luggage Storage Scaling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LUGGAGE_PROPERTIES__LUGGAGE_STORAGE_SCALING = eINSTANCE.getLuggageProperties_LuggageStorageScaling();

		/**
		 * The meta object literal for the '{@link com.paxelerate.model.settings.impl.PassengerPropertiesImpl <em>Passenger Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.paxelerate.model.settings.impl.PassengerPropertiesImpl
		 * @see com.paxelerate.model.settings.impl.SettingsPackageImpl#getPassengerProperties()
		 * @generated
		 */
		EClass PASSENGER_PROPERTIES = eINSTANCE.getPassengerProperties();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerWidthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerWidthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerWeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerWeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerHeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerHeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerDepthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerDepthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerWidthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Width Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WIDTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerWidthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerWeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Weight Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_WEIGHT_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerWeightDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Height Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HEIGHT_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHeightDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerDepthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Depth Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_DEPTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerDepthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Aggressive Mood Share</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_AGGRESSIVE_MOOD_SHARE = eINSTANCE
				.getPassengerProperties_PassengerAggressiveMoodShare();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_MEAN = eINSTANCE
				.getPassengerProperties_SeatInterferenceProcessTimeMean();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_DEVIATION = eINSTANCE
				.getPassengerProperties_SeatInterferenceProcessTimeDeviation();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Folding Seat Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_MEAN = eINSTANCE
				.getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Process Time Folding Seat Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_PROCESS_TIME_FOLDING_SEAT_DEVIATION = eINSTANCE
				.getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation();

		/**
		 * The meta object literal for the '<em><b>Passive Passenger Waiting Time After Collision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSIVE_PASSENGER_WAITING_TIME_AFTER_COLLISION = eINSTANCE
				.getPassengerProperties_PassivePassengerWaitingTimeAfterCollision();

		/**
		 * The meta object literal for the '<em><b>Seat Interference Multi Passenger Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__SEAT_INTERFERENCE_MULTI_PASSENGER_FACTOR = eINSTANCE
				.getPassengerProperties_SeatInterferenceMultiPassengerFactor();

		/**
		 * The meta object literal for the '<em><b>Door Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__DOOR_SELECTION = eINSTANCE.getPassengerProperties_DoorSelection();

		/**
		 * The meta object literal for the '<em><b>Group Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__GROUP_PERCENTAGE = eINSTANCE.getPassengerProperties_GroupPercentage();

		/**
		 * The meta object literal for the '<em><b>Age Speed Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_PROPERTIES__AGE_SPEED_DEPENDENCY = eINSTANCE.getPassengerProperties_AgeSpeedDependency();

		/**
		 * The meta object literal for the '<em><b>Age Distribution</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSENGER_PROPERTIES__AGE_DISTRIBUTION = eINSTANCE.getPassengerProperties_AgeDistribution();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Width Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerKneeWidthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Width Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerKneeWidthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Width Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerKneeWidthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Width Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_WIDTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerKneeWidthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Depth Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerKneeDepthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Depth Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerKneeDepthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Depth Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerKneeDepthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Depth Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_DEPTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerKneeDepthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Height Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerKneeHeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Height Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerKneeHeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Height Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerKneeHeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Knee Height Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_KNEE_HEIGHT_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerKneeHeightDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Width Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerHipWidthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Width Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerHipWidthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Width Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHipWidthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Width Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_WIDTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHipWidthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Depth Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerHipDepthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Depth Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerHipDepthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Depth Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHipDepthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Depth Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_DEPTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHipDepthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Height Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerHipHeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Height Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerHipHeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Height Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHipHeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Hip Height Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_HIP_HEIGHT_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerHipHeightDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Width Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderWidthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Width Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderWidthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Width Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderWidthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Width Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_WIDTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderWidthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Depth Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderDepthMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Depth Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderDepthDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Depth Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderDepthMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Depth Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_DEPTH_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderDepthDeviationFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Height Mean Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_MALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderHeightMeanMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Height Deviation Male</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_MALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderHeightDeviationMale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Height Mean Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_MEAN_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderHeightMeanFemale();

		/**
		 * The meta object literal for the '<em><b>Passenger Shoulder Height Deviation Female</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PASSENGER_PROPERTIES__PASSENGER_SHOULDER_HEIGHT_DEVIATION_FEMALE = eINSTANCE
				.getPassengerProperties_PassengerShoulderHeightDeviationFemale();

	}

} //SettingsPackage
