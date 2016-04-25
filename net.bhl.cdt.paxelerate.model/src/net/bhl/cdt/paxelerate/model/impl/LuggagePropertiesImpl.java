/**
 */
package net.bhl.cdt.paxelerate.model.impl;

import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.LuggageProperties;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getLuggageStowingDistanceFromSeatMean <em>Luggage Stowing Distance From Seat Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getLuggageStowingDistanceFromSeatDeviation <em>Luggage Stowing Distance From Seat Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPassengerSmallLuggageStowTimeMean <em>Passenger Small Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPassengerSmallLuggageStowTimeDeviation <em>Passenger Small Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPassengerMediumLuggageStowTimeMean <em>Passenger Medium Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPassengerMediumLuggageStowTimeDeviation <em>Passenger Medium Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPassengerBigLuggageStowTimeMean <em>Passenger Big Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.LuggagePropertiesImpl#getPassengerBigLuggageStowTimeDeviation <em>Passenger Big Luggage Stow Time Deviation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggagePropertiesImpl extends MinimalEObjectImpl.Container implements LuggageProperties {
	/**
	 * The default value of the '{@link #getLuggageStowingDistanceFromSeatMean() <em>Luggage Stowing Distance From Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowingDistanceFromSeatMean()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN_EDEFAULT = 80.0;

	/**
	 * The cached value of the '{@link #getLuggageStowingDistanceFromSeatMean() <em>Luggage Stowing Distance From Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowingDistanceFromSeatMean()
	 * @generated
	 * @ordered
	 */
	protected double luggageStowingDistanceFromSeatMean = LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuggageStowingDistanceFromSeatDeviation() <em>Luggage Stowing Distance From Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowingDistanceFromSeatDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getLuggageStowingDistanceFromSeatDeviation() <em>Luggage Stowing Distance From Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuggageStowingDistanceFromSeatDeviation()
	 * @generated
	 * @ordered
	 */
	protected double luggageStowingDistanceFromSeatDeviation = LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithNoLuggage() <em>Percentage Of Passengers With No Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithNoLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithNoLuggage() <em>Percentage Of Passengers With No Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithNoLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithNoLuggage = PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithSmallLuggage() <em>Percentage Of Passengers With Small Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithSmallLuggage() <em>Percentage Of Passengers With Small Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithSmallLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithSmallLuggage = PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithMediumLuggage() <em>Percentage Of Passengers With Medium Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithMediumLuggage() <em>Percentage Of Passengers With Medium Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithMediumLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithMediumLuggage = PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentageOfPassengersWithBigLuggage() <em>Percentage Of Passengers With Big Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithBigLuggage()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentageOfPassengersWithBigLuggage() <em>Percentage Of Passengers With Big Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageOfPassengersWithBigLuggage()
	 * @generated
	 * @ordered
	 */
	protected double percentageOfPassengersWithBigLuggage = PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerSmallLuggageStowTimeMean() <em>Passenger Small Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSmallLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN_EDEFAULT = 10.0;

	/**
	 * The cached value of the '{@link #getPassengerSmallLuggageStowTimeMean() <em>Passenger Small Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSmallLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double passengerSmallLuggageStowTimeMean = PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerSmallLuggageStowTimeDeviation() <em>Passenger Small Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSmallLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getPassengerSmallLuggageStowTimeDeviation() <em>Passenger Small Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerSmallLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double passengerSmallLuggageStowTimeDeviation = PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerMediumLuggageStowTimeMean() <em>Passenger Medium Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMediumLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN_EDEFAULT = 15.0;

	/**
	 * The cached value of the '{@link #getPassengerMediumLuggageStowTimeMean() <em>Passenger Medium Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMediumLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double passengerMediumLuggageStowTimeMean = PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerMediumLuggageStowTimeDeviation() <em>Passenger Medium Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMediumLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT = 7.0;

	/**
	 * The cached value of the '{@link #getPassengerMediumLuggageStowTimeDeviation() <em>Passenger Medium Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerMediumLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double passengerMediumLuggageStowTimeDeviation = PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerBigLuggageStowTimeMean() <em>Passenger Big Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerBigLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getPassengerBigLuggageStowTimeMean() <em>Passenger Big Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerBigLuggageStowTimeMean()
	 * @generated
	 * @ordered
	 */
	protected double passengerBigLuggageStowTimeMean = PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassengerBigLuggageStowTimeDeviation() <em>Passenger Big Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerBigLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected static final double PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT = 5.0;

	/**
	 * The cached value of the '{@link #getPassengerBigLuggageStowTimeDeviation() <em>Passenger Big Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassengerBigLuggageStowTimeDeviation()
	 * @generated
	 * @ordered
	 */
	protected double passengerBigLuggageStowTimeDeviation = PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected LuggagePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the e class
	 * @generated 
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.LUGGAGE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage stowing distance from seat mean
	 * @generated 
	 */
	public double getLuggageStowingDistanceFromSeatMean() {
		return luggageStowingDistanceFromSeatMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newLuggageStowingDistanceFromSeatMean the new luggage stowing distance from seat mean
	 * @generated 
	 */
	public void setLuggageStowingDistanceFromSeatMean(double newLuggageStowingDistanceFromSeatMean) {
		double oldLuggageStowingDistanceFromSeatMean = luggageStowingDistanceFromSeatMean;
		luggageStowingDistanceFromSeatMean = newLuggageStowingDistanceFromSeatMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN, oldLuggageStowingDistanceFromSeatMean, luggageStowingDistanceFromSeatMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the luggage stowing distance from seat deviation
	 * @generated 
	 */
	public double getLuggageStowingDistanceFromSeatDeviation() {
		return luggageStowingDistanceFromSeatDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newLuggageStowingDistanceFromSeatDeviation the new luggage stowing distance from seat deviation
	 * @generated 
	 */
	public void setLuggageStowingDistanceFromSeatDeviation(double newLuggageStowingDistanceFromSeatDeviation) {
		double oldLuggageStowingDistanceFromSeatDeviation = luggageStowingDistanceFromSeatDeviation;
		luggageStowingDistanceFromSeatDeviation = newLuggageStowingDistanceFromSeatDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION, oldLuggageStowingDistanceFromSeatDeviation, luggageStowingDistanceFromSeatDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the percentage of passengers with no luggage
	 * @generated 
	 */
	public double getPercentageOfPassengersWithNoLuggage() {
		return percentageOfPassengersWithNoLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPercentageOfPassengersWithNoLuggage the new percentage of passengers with no luggage
	 * @generated 
	 */
	public void setPercentageOfPassengersWithNoLuggage(double newPercentageOfPassengersWithNoLuggage) {
		double oldPercentageOfPassengersWithNoLuggage = percentageOfPassengersWithNoLuggage;
		percentageOfPassengersWithNoLuggage = newPercentageOfPassengersWithNoLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE, oldPercentageOfPassengersWithNoLuggage, percentageOfPassengersWithNoLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the percentage of passengers with small luggage
	 * @generated 
	 */
	public double getPercentageOfPassengersWithSmallLuggage() {
		return percentageOfPassengersWithSmallLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPercentageOfPassengersWithSmallLuggage the new percentage of passengers with small luggage
	 * @generated 
	 */
	public void setPercentageOfPassengersWithSmallLuggage(double newPercentageOfPassengersWithSmallLuggage) {
		double oldPercentageOfPassengersWithSmallLuggage = percentageOfPassengersWithSmallLuggage;
		percentageOfPassengersWithSmallLuggage = newPercentageOfPassengersWithSmallLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE, oldPercentageOfPassengersWithSmallLuggage, percentageOfPassengersWithSmallLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the percentage of passengers with medium luggage
	 * @generated 
	 */
	public double getPercentageOfPassengersWithMediumLuggage() {
		return percentageOfPassengersWithMediumLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPercentageOfPassengersWithMediumLuggage the new percentage of passengers with medium luggage
	 * @generated 
	 */
	public void setPercentageOfPassengersWithMediumLuggage(double newPercentageOfPassengersWithMediumLuggage) {
		double oldPercentageOfPassengersWithMediumLuggage = percentageOfPassengersWithMediumLuggage;
		percentageOfPassengersWithMediumLuggage = newPercentageOfPassengersWithMediumLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE, oldPercentageOfPassengersWithMediumLuggage, percentageOfPassengersWithMediumLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the percentage of passengers with big luggage
	 * @generated 
	 */
	public double getPercentageOfPassengersWithBigLuggage() {
		return percentageOfPassengersWithBigLuggage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPercentageOfPassengersWithBigLuggage the new percentage of passengers with big luggage
	 * @generated 
	 */
	public void setPercentageOfPassengersWithBigLuggage(double newPercentageOfPassengersWithBigLuggage) {
		double oldPercentageOfPassengersWithBigLuggage = percentageOfPassengersWithBigLuggage;
		percentageOfPassengersWithBigLuggage = newPercentageOfPassengersWithBigLuggage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE, oldPercentageOfPassengersWithBigLuggage, percentageOfPassengersWithBigLuggage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger small luggage stow time mean
	 * @generated 
	 */
	public double getPassengerSmallLuggageStowTimeMean() {
		return passengerSmallLuggageStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerSmallLuggageStowTimeMean the new passenger small luggage stow time mean
	 * @generated 
	 */
	public void setPassengerSmallLuggageStowTimeMean(double newPassengerSmallLuggageStowTimeMean) {
		double oldPassengerSmallLuggageStowTimeMean = passengerSmallLuggageStowTimeMean;
		passengerSmallLuggageStowTimeMean = newPassengerSmallLuggageStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN, oldPassengerSmallLuggageStowTimeMean, passengerSmallLuggageStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger small luggage stow time deviation
	 * @generated 
	 */
	public double getPassengerSmallLuggageStowTimeDeviation() {
		return passengerSmallLuggageStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerSmallLuggageStowTimeDeviation the new passenger small luggage stow time deviation
	 * @generated 
	 */
	public void setPassengerSmallLuggageStowTimeDeviation(double newPassengerSmallLuggageStowTimeDeviation) {
		double oldPassengerSmallLuggageStowTimeDeviation = passengerSmallLuggageStowTimeDeviation;
		passengerSmallLuggageStowTimeDeviation = newPassengerSmallLuggageStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION, oldPassengerSmallLuggageStowTimeDeviation, passengerSmallLuggageStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger medium luggage stow time mean
	 * @generated 
	 */
	public double getPassengerMediumLuggageStowTimeMean() {
		return passengerMediumLuggageStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerMediumLuggageStowTimeMean the new passenger medium luggage stow time mean
	 * @generated 
	 */
	public void setPassengerMediumLuggageStowTimeMean(double newPassengerMediumLuggageStowTimeMean) {
		double oldPassengerMediumLuggageStowTimeMean = passengerMediumLuggageStowTimeMean;
		passengerMediumLuggageStowTimeMean = newPassengerMediumLuggageStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN, oldPassengerMediumLuggageStowTimeMean, passengerMediumLuggageStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger medium luggage stow time deviation
	 * @generated 
	 */
	public double getPassengerMediumLuggageStowTimeDeviation() {
		return passengerMediumLuggageStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerMediumLuggageStowTimeDeviation the new passenger medium luggage stow time deviation
	 * @generated 
	 */
	public void setPassengerMediumLuggageStowTimeDeviation(double newPassengerMediumLuggageStowTimeDeviation) {
		double oldPassengerMediumLuggageStowTimeDeviation = passengerMediumLuggageStowTimeDeviation;
		passengerMediumLuggageStowTimeDeviation = newPassengerMediumLuggageStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION, oldPassengerMediumLuggageStowTimeDeviation, passengerMediumLuggageStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger big luggage stow time mean
	 * @generated 
	 */
	public double getPassengerBigLuggageStowTimeMean() {
		return passengerBigLuggageStowTimeMean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerBigLuggageStowTimeMean the new passenger big luggage stow time mean
	 * @generated 
	 */
	public void setPassengerBigLuggageStowTimeMean(double newPassengerBigLuggageStowTimeMean) {
		double oldPassengerBigLuggageStowTimeMean = passengerBigLuggageStowTimeMean;
		passengerBigLuggageStowTimeMean = newPassengerBigLuggageStowTimeMean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN, oldPassengerBigLuggageStowTimeMean, passengerBigLuggageStowTimeMean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the passenger big luggage stow time deviation
	 * @generated 
	 */
	public double getPassengerBigLuggageStowTimeDeviation() {
		return passengerBigLuggageStowTimeDeviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newPassengerBigLuggageStowTimeDeviation the new passenger big luggage stow time deviation
	 * @generated 
	 */
	public void setPassengerBigLuggageStowTimeDeviation(double newPassengerBigLuggageStowTimeDeviation) {
		double oldPassengerBigLuggageStowTimeDeviation = passengerBigLuggageStowTimeDeviation;
		passengerBigLuggageStowTimeDeviation = newPassengerBigLuggageStowTimeDeviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION, oldPassengerBigLuggageStowTimeDeviation, passengerBigLuggageStowTimeDeviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param resolve the resolve
	 * @param coreType the core type
	 * @return the object
	 * @generated 
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN:
				return getLuggageStowingDistanceFromSeatMean();
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION:
				return getLuggageStowingDistanceFromSeatDeviation();
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				return getPercentageOfPassengersWithNoLuggage();
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				return getPercentageOfPassengersWithSmallLuggage();
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				return getPercentageOfPassengersWithMediumLuggage();
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				return getPercentageOfPassengersWithBigLuggage();
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN:
				return getPassengerSmallLuggageStowTimeMean();
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION:
				return getPassengerSmallLuggageStowTimeDeviation();
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN:
				return getPassengerMediumLuggageStowTimeMean();
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION:
				return getPassengerMediumLuggageStowTimeDeviation();
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN:
				return getPassengerBigLuggageStowTimeMean();
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION:
				return getPassengerBigLuggageStowTimeDeviation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param newValue the new value
	 * @generated 
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN:
				setLuggageStowingDistanceFromSeatMean((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION:
				setLuggageStowingDistanceFromSeatDeviation((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				setPercentageOfPassengersWithNoLuggage((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				setPercentageOfPassengersWithSmallLuggage((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				setPercentageOfPassengersWithMediumLuggage((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				setPercentageOfPassengersWithBigLuggage((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN:
				setPassengerSmallLuggageStowTimeMean((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerSmallLuggageStowTimeDeviation((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN:
				setPassengerMediumLuggageStowTimeMean((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerMediumLuggageStowTimeDeviation((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN:
				setPassengerBigLuggageStowTimeMean((Double)newValue);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerBigLuggageStowTimeDeviation((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @generated 
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN:
				setLuggageStowingDistanceFromSeatMean(LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION:
				setLuggageStowingDistanceFromSeatDeviation(LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				setPercentageOfPassengersWithNoLuggage(PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				setPercentageOfPassengersWithSmallLuggage(PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				setPercentageOfPassengersWithMediumLuggage(PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				setPercentageOfPassengersWithBigLuggage(PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN:
				setPassengerSmallLuggageStowTimeMean(PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerSmallLuggageStowTimeDeviation(PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN:
				setPassengerMediumLuggageStowTimeMean(PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerMediumLuggageStowTimeDeviation(PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN:
				setPassengerBigLuggageStowTimeMean(PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN_EDEFAULT);
				return;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION:
				setPassengerBigLuggageStowTimeDeviation(PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @return true, if successful
	 * @generated 
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN:
				return luggageStowingDistanceFromSeatMean != LUGGAGE_STOWING_DISTANCE_FROM_SEAT_MEAN_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION:
				return luggageStowingDistanceFromSeatDeviation != LUGGAGE_STOWING_DISTANCE_FROM_SEAT_DEVIATION_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE:
				return percentageOfPassengersWithNoLuggage != PERCENTAGE_OF_PASSENGERS_WITH_NO_LUGGAGE_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE:
				return percentageOfPassengersWithSmallLuggage != PERCENTAGE_OF_PASSENGERS_WITH_SMALL_LUGGAGE_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE:
				return percentageOfPassengersWithMediumLuggage != PERCENTAGE_OF_PASSENGERS_WITH_MEDIUM_LUGGAGE_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE:
				return percentageOfPassengersWithBigLuggage != PERCENTAGE_OF_PASSENGERS_WITH_BIG_LUGGAGE_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN:
				return passengerSmallLuggageStowTimeMean != PASSENGER_SMALL_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION:
				return passengerSmallLuggageStowTimeDeviation != PASSENGER_SMALL_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN:
				return passengerMediumLuggageStowTimeMean != PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION:
				return passengerMediumLuggageStowTimeDeviation != PASSENGER_MEDIUM_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN:
				return passengerBigLuggageStowTimeMean != PASSENGER_BIG_LUGGAGE_STOW_TIME_MEAN_EDEFAULT;
			case CabinPackage.LUGGAGE_PROPERTIES__PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION:
				return passengerBigLuggageStowTimeDeviation != PASSENGER_BIG_LUGGAGE_STOW_TIME_DEVIATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the string
	 * @generated 
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (luggageStowingDistanceFromSeatMean: ");
		result.append(luggageStowingDistanceFromSeatMean);
		result.append(", luggageStowingDistanceFromSeatDeviation: ");
		result.append(luggageStowingDistanceFromSeatDeviation);
		result.append(", percentageOfPassengersWithNoLuggage: ");
		result.append(percentageOfPassengersWithNoLuggage);
		result.append(", percentageOfPassengersWithSmallLuggage: ");
		result.append(percentageOfPassengersWithSmallLuggage);
		result.append(", percentageOfPassengersWithMediumLuggage: ");
		result.append(percentageOfPassengersWithMediumLuggage);
		result.append(", percentageOfPassengersWithBigLuggage: ");
		result.append(percentageOfPassengersWithBigLuggage);
		result.append(", passengerSmallLuggageStowTimeMean: ");
		result.append(passengerSmallLuggageStowTimeMean);
		result.append(", passengerSmallLuggageStowTimeDeviation: ");
		result.append(passengerSmallLuggageStowTimeDeviation);
		result.append(", passengerMediumLuggageStowTimeMean: ");
		result.append(passengerMediumLuggageStowTimeMean);
		result.append(", passengerMediumLuggageStowTimeDeviation: ");
		result.append(passengerMediumLuggageStowTimeDeviation);
		result.append(", passengerBigLuggageStowTimeMean: ");
		result.append(passengerBigLuggageStowTimeMean);
		result.append(", passengerBigLuggageStowTimeDeviation: ");
		result.append(passengerBigLuggageStowTimeDeviation);
		result.append(')');
		return result.toString();
	}

} //LuggagePropertiesImpl
