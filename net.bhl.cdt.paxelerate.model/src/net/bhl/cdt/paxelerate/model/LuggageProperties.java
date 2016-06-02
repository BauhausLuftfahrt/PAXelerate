/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeMean <em>Passenger Small Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeDeviation <em>Passenger Small Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeMean <em>Passenger Medium Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeDeviation <em>Passenger Medium Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeMean <em>Passenger Big Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeDeviation <em>Passenger Big Luggage Stow Time Deviation</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties()
 * @model
 * @generated
 */
public interface LuggageProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Luggage Stow Distance From Seat Mean</b></em>' attribute.
	 * The default value is <code>"80"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luggage Stow Distance From Seat Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Stow Distance From Seat Mean</em>' attribute.
	 * @see #setLuggageStowDistanceFromSeatMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_LuggageStowDistanceFromSeatMean()
	 * @model default="80"
	 * @generated
	 */
	double getLuggageStowDistanceFromSeatMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Stow Distance From Seat Mean</em>' attribute.
	 * @see #getLuggageStowDistanceFromSeatMean()
	 * @generated
	 */
	void setLuggageStowDistanceFromSeatMean(double value);

	/**
	 * Returns the value of the '<em><b>Luggage Stow Distance From Seat Deviation</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Luggage Stow Distance From Seat Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Stow Distance From Seat Deviation</em>' attribute.
	 * @see #setLuggageStowDistanceFromSeatDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_LuggageStowDistanceFromSeatDeviation()
	 * @model default="10"
	 * @generated
	 */
	double getLuggageStowDistanceFromSeatDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Stow Distance From Seat Deviation</em>' attribute.
	 * @see #getLuggageStowDistanceFromSeatDeviation()
	 * @generated
	 */
	void setLuggageStowDistanceFromSeatDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With No Luggage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With No Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With No Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithNoLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PercentageOfPassengersWithNoLuggage()
	 * @model default="0"
	 * @generated
	 */
	double getPercentageOfPassengersWithNoLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithNoLuggage <em>Percentage Of Passengers With No Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With No Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithNoLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithNoLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Small Luggage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With Small Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Small Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithSmallLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PercentageOfPassengersWithSmallLuggage()
	 * @model default="0"
	 * @generated
	 */
	double getPercentageOfPassengersWithSmallLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithSmallLuggage <em>Percentage Of Passengers With Small Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Small Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithSmallLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithSmallLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Medium Luggage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With Medium Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Medium Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithMediumLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PercentageOfPassengersWithMediumLuggage()
	 * @model default="0"
	 * @generated
	 */
	double getPercentageOfPassengersWithMediumLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithMediumLuggage <em>Percentage Of Passengers With Medium Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Medium Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithMediumLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithMediumLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Passengers With Big Luggage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Passengers With Big Luggage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Passengers With Big Luggage</em>' attribute.
	 * @see #setPercentageOfPassengersWithBigLuggage(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PercentageOfPassengersWithBigLuggage()
	 * @model default="0"
	 * @generated
	 */
	double getPercentageOfPassengersWithBigLuggage();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPercentageOfPassengersWithBigLuggage <em>Percentage Of Passengers With Big Luggage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Passengers With Big Luggage</em>' attribute.
	 * @see #getPercentageOfPassengersWithBigLuggage()
	 * @generated
	 */
	void setPercentageOfPassengersWithBigLuggage(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Small Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Small Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Small Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerSmallLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PassengerSmallLuggageStowTimeMean()
	 * @model default="10"
	 * @generated
	 */
	double getPassengerSmallLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeMean <em>Passenger Small Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Small Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerSmallLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerSmallLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Small Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Small Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Small Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerSmallLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PassengerSmallLuggageStowTimeDeviation()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerSmallLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerSmallLuggageStowTimeDeviation <em>Passenger Small Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Small Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerSmallLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerSmallLuggageStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Medium Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Medium Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Medium Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerMediumLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PassengerMediumLuggageStowTimeMean()
	 * @model default="15"
	 * @generated
	 */
	double getPassengerMediumLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeMean <em>Passenger Medium Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Medium Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerMediumLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerMediumLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Medium Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Medium Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Medium Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerMediumLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PassengerMediumLuggageStowTimeDeviation()
	 * @model default="7"
	 * @generated
	 */
	double getPassengerMediumLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerMediumLuggageStowTimeDeviation <em>Passenger Medium Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Medium Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerMediumLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerMediumLuggageStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Big Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Big Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Big Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerBigLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PassengerBigLuggageStowTimeMean()
	 * @model default="20"
	 * @generated
	 */
	double getPassengerBigLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeMean <em>Passenger Big Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Big Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerBigLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerBigLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Big Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Big Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Big Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerBigLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLuggageProperties_PassengerBigLuggageStowTimeDeviation()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerBigLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.LuggageProperties#getPassengerBigLuggageStowTimeDeviation <em>Passenger Big Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Big Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerBigLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerBigLuggageStowTimeDeviation(double value);

} // LuggageProperties
