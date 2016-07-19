/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPercentageOfWomen <em>Percentage Of Women</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceStandingUpPassengerWaitingTime <em>Seat Interference Standing Up Passenger Waiting Time</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWalkingSpeedFactor <em>Passenger Walking Speed Factor</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties()
 * @model
 * @generated
 */
public interface PassengerProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger Width Mean Male</b></em>' attribute.
	 * The default value is <code>"47"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Mean Male</em>' attribute.
	 * @see #setPassengerWidthMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWidthMeanMale()
	 * @model default="47"
	 * @generated
	 */
	double getPassengerWidthMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Male</em>' attribute.
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 */
	void setPassengerWidthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Male</b></em>' attribute.
	 * The default value is <code>"2.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Male</em>' attribute.
	 * @see #setPassengerWidthDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWidthDeviationMale()
	 * @model default="2.8"
	 * @generated
	 */
	double getPassengerWidthDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Deviation Male</em>' attribute.
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 */
	void setPassengerWidthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Mean Male</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Mean Male</em>' attribute.
	 * @see #setPassengerWeightMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWeightMeanMale()
	 * @model default="90"
	 * @generated
	 */
	double getPassengerWeightMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Mean Male</em>' attribute.
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 */
	void setPassengerWeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Deviation Male</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Deviation Male</em>' attribute.
	 * @see #setPassengerWeightDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWeightDeviationMale()
	 * @model default="20"
	 * @generated
	 */
	double getPassengerWeightDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Deviation Male</em>' attribute.
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 */
	void setPassengerWeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Mean Male</b></em>' attribute.
	 * The default value is <code>"177.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Mean Male</em>' attribute.
	 * @see #setPassengerHeightMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerHeightMeanMale()
	 * @model default="177.5"
	 * @generated
	 */
	double getPassengerHeightMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Mean Male</em>' attribute.
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 */
	void setPassengerHeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Deviation Male</b></em>' attribute.
	 * The default value is <code>"11.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Deviation Male</em>' attribute.
	 * @see #setPassengerHeightDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerHeightDeviationMale()
	 * @model default="11.1"
	 * @generated
	 */
	double getPassengerHeightDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Deviation Male</em>' attribute.
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 */
	void setPassengerHeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Mean Male</b></em>' attribute.
	 * The default value is <code>"30"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Mean Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Mean Male</em>' attribute.
	 * @see #setPassengerDepthMeanMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerDepthMeanMale()
	 * @model default="30"
	 * @generated
	 */
	double getPassengerDepthMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Male</em>' attribute.
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 */
	void setPassengerDepthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Deviation Male</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Deviation Male</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Deviation Male</em>' attribute.
	 * @see #setPassengerDepthDeviationMale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerDepthDeviationMale()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerDepthDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Deviation Male</em>' attribute.
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 */
	void setPassengerDepthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Percentage Of Women</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Of Women</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Of Women</em>' attribute.
	 * @see #setPercentageOfWomen(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PercentageOfWomen()
	 * @model default="50"
	 * @generated
	 */
	double getPercentageOfWomen();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPercentageOfWomen <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Women</em>' attribute.
	 * @see #getPercentageOfWomen()
	 * @generated
	 */
	void setPercentageOfWomen(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Mean Female</b></em>' attribute.
	 * The default value is <code>"41.4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #setPassengerWidthMeanFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWidthMeanFemale()
	 * @model default="41.4"
	 * @generated
	 */
	double getPassengerWidthMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 */
	void setPassengerWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #setPassengerWidthDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWidthDeviationFemale()
	 * @model default="1"
	 * @generated
	 */
	double getPassengerWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 */
	void setPassengerWidthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Mean Female</b></em>' attribute.
	 * The default value is <code>"60"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Mean Female</em>' attribute.
	 * @see #setPassengerWeightMeanFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWeightMeanFemale()
	 * @model default="60"
	 * @generated
	 */
	double getPassengerWeightMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Mean Female</em>' attribute.
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 */
	void setPassengerWeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Deviation Female</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Weight Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Deviation Female</em>' attribute.
	 * @see #setPassengerWeightDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWeightDeviationFemale()
	 * @model default="15"
	 * @generated
	 */
	double getPassengerWeightDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Deviation Female</em>' attribute.
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 */
	void setPassengerWeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Mean Female</b></em>' attribute.
	 * The default value is <code>"164.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Mean Female</em>' attribute.
	 * @see #setPassengerHeightMeanFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerHeightMeanFemale()
	 * @model default="164.5"
	 * @generated
	 */
	double getPassengerHeightMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Mean Female</em>' attribute.
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 */
	void setPassengerHeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Deviation Female</b></em>' attribute.
	 * The default value is <code>"11.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Height Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Deviation Female</em>' attribute.
	 * @see #setPassengerHeightDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerHeightDeviationFemale()
	 * @model default="11.5"
	 * @generated
	 */
	double getPassengerHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Deviation Female</em>' attribute.
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 */
	void setPassengerHeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Mean Female</b></em>' attribute.
	 * The default value is <code>"27"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Mean Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #setPassengerDepthMeanFemale(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerDepthMeanFemale()
	 * @model default="27"
	 * @generated
	 */
	int getPassengerDepthMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 */
	void setPassengerDepthMeanFemale(int value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Deviation Female</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Depth Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Deviation Female</em>' attribute.
	 * @see #setPassengerDepthDeviationFemale(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerDepthDeviationFemale()
	 * @model default="3"
	 * @generated
	 */
	double getPassengerDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Deviation Female</em>' attribute.
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 */
	void setPassengerDepthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Aggressive Mood Share</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Aggressive Mood Share</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Aggressive Mood Share</em>' attribute.
	 * @see #setPassengerAggressiveMoodShare(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerAggressiveMoodShare()
	 * @model default="0"
	 * @generated
	 */
	int getPassengerAggressiveMoodShare();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Aggressive Mood Share</em>' attribute.
	 * @see #getPassengerAggressiveMoodShare()
	 * @generated
	 */
	void setPassengerAggressiveMoodShare(int value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Standing Up Passenger Waiting Time</b></em>' attribute.
	 * The default value is <code>"3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Interference Standing Up Passenger Waiting Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Standing Up Passenger Waiting Time</em>' attribute.
	 * @see #setSeatInterferenceStandingUpPassengerWaitingTime(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_SeatInterferenceStandingUpPassengerWaitingTime()
	 * @model default="3"
	 * @generated
	 */
	double getSeatInterferenceStandingUpPassengerWaitingTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceStandingUpPassengerWaitingTime <em>Seat Interference Standing Up Passenger Waiting Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Standing Up Passenger Waiting Time</em>' attribute.
	 * @see #getSeatInterferenceStandingUpPassengerWaitingTime()
	 * @generated
	 */
	void setSeatInterferenceStandingUpPassengerWaitingTime(double value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Mean</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Interference Process Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Mean</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_SeatInterferenceProcessTimeMean()
	 * @model default="7"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Process Time Mean</em>' attribute.
	 * @see #getSeatInterferenceProcessTimeMean()
	 * @generated
	 */
	void setSeatInterferenceProcessTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Deviation</b></em>' attribute.
	 * The default value is <code>"1.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Interference Process Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Deviation</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_SeatInterferenceProcessTimeDeviation()
	 * @model default="1.5"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Process Time Deviation</em>' attribute.
	 * @see #getSeatInterferenceProcessTimeDeviation()
	 * @generated
	 */
	void setSeatInterferenceProcessTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Folding Seat Mean</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Interference Process Time Folding Seat Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Folding Seat Mean</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeFoldingSeatMean(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean()
	 * @model default="5"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeFoldingSeatMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Process Time Folding Seat Mean</em>' attribute.
	 * @see #getSeatInterferenceProcessTimeFoldingSeatMean()
	 * @generated
	 */
	void setSeatInterferenceProcessTimeFoldingSeatMean(double value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Folding Seat Deviation</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat Interference Process Time Folding Seat Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Folding Seat Deviation</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeFoldingSeatDeviation(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @model default="1"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeFoldingSeatDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Process Time Folding Seat Deviation</em>' attribute.
	 * @see #getSeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @generated
	 */
	void setSeatInterferenceProcessTimeFoldingSeatDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Passive Passenger Waiting Time After Collision</b></em>' attribute.
	 * The default value is <code>"0.3"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passive Passenger Waiting Time After Collision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive Passenger Waiting Time After Collision</em>' attribute.
	 * @see #setPassivePassengerWaitingTimeAfterCollision(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassivePassengerWaitingTimeAfterCollision()
	 * @model default="0.3"
	 * @generated
	 */
	double getPassivePassengerWaitingTimeAfterCollision();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Passenger Waiting Time After Collision</em>' attribute.
	 * @see #getPassivePassengerWaitingTimeAfterCollision()
	 * @generated
	 */
	void setPassivePassengerWaitingTimeAfterCollision(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Walking Speed Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Walking Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Walking Speed Factor</em>' attribute.
	 * @see #setPassengerWalkingSpeedFactor(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerProperties_PassengerWalkingSpeedFactor()
	 * @model default="1.0"
	 * @generated
	 */
	double getPassengerWalkingSpeedFactor();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.PassengerProperties#getPassengerWalkingSpeedFactor <em>Passenger Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Walking Speed Factor</em>' attribute.
	 * @see #getPassengerWalkingSpeedFactor()
	 * @generated
	 */
	void setPassengerWalkingSpeedFactor(double value);

} // PassengerProperties
