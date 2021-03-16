/**
 */
package com.paxelerate.model.settings;

import com.paxelerate.model.EPoint;
import com.paxelerate.model.enums.DoorSelection;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceMultiPassengerFactor <em>Seat Interference Multi Passenger Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWalkingSpeedFactor <em>Passenger Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getDoorSelection <em>Door Selection</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getGroupPercentage <em>Group Percentage</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getAgeSpeedDependency <em>Age Speed Dependency</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getAgeDistribution <em>Age Distribution</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanMale <em>Passenger Knee Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationMale <em>Passenger Knee Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanFemale <em>Passenger Knee Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationFemale <em>Passenger Knee Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanMale <em>Passenger Knee Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationMale <em>Passenger Knee Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanFemale <em>Passenger Knee Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationFemale <em>Passenger Knee Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanMale <em>Passenger Knee Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationMale <em>Passenger Knee Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanFemale <em>Passenger Knee Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationFemale <em>Passenger Knee Height Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanMale <em>Passenger Hip Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationMale <em>Passenger Hip Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanFemale <em>Passenger Hip Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationFemale <em>Passenger Hip Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanMale <em>Passenger Hip Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationMale <em>Passenger Hip Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanFemale <em>Passenger Hip Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationFemale <em>Passenger Hip Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanMale <em>Passenger Hip Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationMale <em>Passenger Hip Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanFemale <em>Passenger Hip Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationFemale <em>Passenger Hip Height Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanMale <em>Passenger Shoulder Width Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationMale <em>Passenger Shoulder Width Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanFemale <em>Passenger Shoulder Width Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationFemale <em>Passenger Shoulder Width Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanMale <em>Passenger Shoulder Depth Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationMale <em>Passenger Shoulder Depth Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanFemale <em>Passenger Shoulder Depth Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationFemale <em>Passenger Shoulder Depth Deviation Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanMale <em>Passenger Shoulder Height Mean Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationMale <em>Passenger Shoulder Height Deviation Male</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanFemale <em>Passenger Shoulder Height Mean Female</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationFemale <em>Passenger Shoulder Height Deviation Female</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties()
 * @model
 * @generated
 */
public interface PassengerProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Passenger Width Mean Male</b></em>' attribute.
	 * The default value is <code>"0.47"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Mean Male</em>' attribute.
	 * @see #setPassengerWidthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWidthMeanMale()
	 * @model default="0.47"
	 * @generated
	 */
	double getPassengerWidthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Male</em>' attribute.
	 * @see #getPassengerWidthMeanMale()
	 * @generated
	 */
	void setPassengerWidthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.028"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Male</em>' attribute.
	 * @see #setPassengerWidthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWidthDeviationMale()
	 * @model default="0.028"
	 * @generated
	 */
	double getPassengerWidthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Deviation Male</em>' attribute.
	 * @see #getPassengerWidthDeviationMale()
	 * @generated
	 */
	void setPassengerWidthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Mean Male</b></em>' attribute.
	 * The default value is <code>"0.9"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Mean Male</em>' attribute.
	 * @see #setPassengerWeightMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWeightMeanMale()
	 * @model default="0.9"
	 * @generated
	 */
	double getPassengerWeightMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Mean Male</em>' attribute.
	 * @see #getPassengerWeightMeanMale()
	 * @generated
	 */
	void setPassengerWeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Deviation Male</em>' attribute.
	 * @see #setPassengerWeightDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWeightDeviationMale()
	 * @model default="0.2"
	 * @generated
	 */
	double getPassengerWeightDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Deviation Male</em>' attribute.
	 * @see #getPassengerWeightDeviationMale()
	 * @generated
	 */
	void setPassengerWeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Mean Male</b></em>' attribute.
	 * The default value is <code>"1.775"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Mean Male</em>' attribute.
	 * @see #setPassengerHeightMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHeightMeanMale()
	 * @model default="1.775"
	 * @generated
	 */
	double getPassengerHeightMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Mean Male</em>' attribute.
	 * @see #getPassengerHeightMeanMale()
	 * @generated
	 */
	void setPassengerHeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.111"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Deviation Male</em>' attribute.
	 * @see #setPassengerHeightDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHeightDeviationMale()
	 * @model default="0.111"
	 * @generated
	 */
	double getPassengerHeightDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Deviation Male</em>' attribute.
	 * @see #getPassengerHeightDeviationMale()
	 * @generated
	 */
	void setPassengerHeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Mean Male</b></em>' attribute.
	 * The default value is <code>"0.3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Mean Male</em>' attribute.
	 * @see #setPassengerDepthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerDepthMeanMale()
	 * @model default="0.3"
	 * @generated
	 */
	double getPassengerDepthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Male</em>' attribute.
	 * @see #getPassengerDepthMeanMale()
	 * @generated
	 */
	void setPassengerDepthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Deviation Male</em>' attribute.
	 * @see #setPassengerDepthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerDepthDeviationMale()
	 * @model default="0.05"
	 * @generated
	 */
	double getPassengerDepthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Deviation Male</em>' attribute.
	 * @see #getPassengerDepthDeviationMale()
	 * @generated
	 */
	void setPassengerDepthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Mean Female</b></em>' attribute.
	 * The default value is <code>"0.414"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #setPassengerWidthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWidthMeanFemale()
	 * @model default="0.414"
	 * @generated
	 */
	double getPassengerWidthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 */
	void setPassengerWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #setPassengerWidthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWidthDeviationFemale()
	 * @model default="0.01"
	 * @generated
	 */
	double getPassengerWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #getPassengerWidthDeviationFemale()
	 * @generated
	 */
	void setPassengerWidthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Mean Female</b></em>' attribute.
	 * The default value is <code>"0.6"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Mean Female</em>' attribute.
	 * @see #setPassengerWeightMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWeightMeanFemale()
	 * @model default="0.6"
	 * @generated
	 */
	double getPassengerWeightMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Mean Female</em>' attribute.
	 * @see #getPassengerWeightMeanFemale()
	 * @generated
	 */
	void setPassengerWeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Weight Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Weight Deviation Female</em>' attribute.
	 * @see #setPassengerWeightDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWeightDeviationFemale()
	 * @model default="0.15"
	 * @generated
	 */
	double getPassengerWeightDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Weight Deviation Female</em>' attribute.
	 * @see #getPassengerWeightDeviationFemale()
	 * @generated
	 */
	void setPassengerWeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Mean Female</b></em>' attribute.
	 * The default value is <code>"1.645"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Mean Female</em>' attribute.
	 * @see #setPassengerHeightMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHeightMeanFemale()
	 * @model default="1.645"
	 * @generated
	 */
	double getPassengerHeightMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Mean Female</em>' attribute.
	 * @see #getPassengerHeightMeanFemale()
	 * @generated
	 */
	void setPassengerHeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Height Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.115"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Height Deviation Female</em>' attribute.
	 * @see #setPassengerHeightDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHeightDeviationFemale()
	 * @model default="0.115"
	 * @generated
	 */
	double getPassengerHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Height Deviation Female</em>' attribute.
	 * @see #getPassengerHeightDeviationFemale()
	 * @generated
	 */
	void setPassengerHeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Mean Female</b></em>' attribute.
	 * The default value is <code>"0.27"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #setPassengerDepthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerDepthMeanFemale()
	 * @model default="0.27"
	 * @generated
	 */
	double getPassengerDepthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 */
	void setPassengerDepthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Depth Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.03"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Depth Deviation Female</em>' attribute.
	 * @see #setPassengerDepthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerDepthDeviationFemale()
	 * @model default="0.03"
	 * @generated
	 */
	double getPassengerDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Aggressive Mood Share</em>' attribute.
	 * @see #setPassengerAggressiveMoodShare(int)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerAggressiveMoodShare()
	 * @model default="0"
	 * @generated
	 */
	int getPassengerAggressiveMoodShare();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerAggressiveMoodShare <em>Passenger Aggressive Mood Share</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Aggressive Mood Share</em>' attribute.
	 * @see #getPassengerAggressiveMoodShare()
	 * @generated
	 */
	void setPassengerAggressiveMoodShare(int value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Process Time Mean</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Mean</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_SeatInterferenceProcessTimeMean()
	 * @model default="7"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeMean <em>Seat Interference Process Time Mean</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Deviation</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_SeatInterferenceProcessTimeDeviation()
	 * @model default="1.5"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeDeviation <em>Seat Interference Process Time Deviation</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Folding Seat Mean</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeFoldingSeatMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatMean()
	 * @model default="5"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeFoldingSeatMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatMean <em>Seat Interference Process Time Folding Seat Mean</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Process Time Folding Seat Deviation</em>' attribute.
	 * @see #setSeatInterferenceProcessTimeFoldingSeatDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_SeatInterferenceProcessTimeFoldingSeatDeviation()
	 * @model default="1"
	 * @generated
	 */
	double getSeatInterferenceProcessTimeFoldingSeatDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceProcessTimeFoldingSeatDeviation <em>Seat Interference Process Time Folding Seat Deviation</em>}' attribute.
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
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passive Passenger Waiting Time After Collision</em>' attribute.
	 * @see #setPassivePassengerWaitingTimeAfterCollision(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassivePassengerWaitingTimeAfterCollision()
	 * @model default="0.3"
	 * @generated
	 */
	double getPassivePassengerWaitingTimeAfterCollision();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassivePassengerWaitingTimeAfterCollision <em>Passive Passenger Waiting Time After Collision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passive Passenger Waiting Time After Collision</em>' attribute.
	 * @see #getPassivePassengerWaitingTimeAfterCollision()
	 * @generated
	 */
	void setPassivePassengerWaitingTimeAfterCollision(double value);

	/**
	 * Returns the value of the '<em><b>Seat Interference Multi Passenger Factor</b></em>' attribute.
	 * The default value is <code>"0.7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat Interference Multi Passenger Factor</em>' attribute.
	 * @see #setSeatInterferenceMultiPassengerFactor(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_SeatInterferenceMultiPassengerFactor()
	 * @model default="0.7"
	 * @generated
	 */
	double getSeatInterferenceMultiPassengerFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getSeatInterferenceMultiPassengerFactor <em>Seat Interference Multi Passenger Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat Interference Multi Passenger Factor</em>' attribute.
	 * @see #getSeatInterferenceMultiPassengerFactor()
	 * @generated
	 */
	void setSeatInterferenceMultiPassengerFactor(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Walking Speed Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Walking Speed Factor</em>' attribute.
	 * @see #setPassengerWalkingSpeedFactor(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerWalkingSpeedFactor()
	 * @model default="1.0"
	 * @generated
	 */
	double getPassengerWalkingSpeedFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerWalkingSpeedFactor <em>Passenger Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Walking Speed Factor</em>' attribute.
	 * @see #getPassengerWalkingSpeedFactor()
	 * @generated
	 */
	void setPassengerWalkingSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Door Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.DoorSelection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Selection</em>' attribute.
	 * @see com.paxelerate.model.enums.DoorSelection
	 * @see #setDoorSelection(DoorSelection)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_DoorSelection()
	 * @model
	 * @generated
	 */
	DoorSelection getDoorSelection();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getDoorSelection <em>Door Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Selection</em>' attribute.
	 * @see com.paxelerate.model.enums.DoorSelection
	 * @see #getDoorSelection()
	 * @generated
	 */
	void setDoorSelection(DoorSelection value);

	/**
	 * Returns the value of the '<em><b>Group Percentage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Percentage</em>' attribute.
	 * @see #setGroupPercentage(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_GroupPercentage()
	 * @model default="0"
	 * @generated
	 */
	double getGroupPercentage();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getGroupPercentage <em>Group Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Percentage</em>' attribute.
	 * @see #getGroupPercentage()
	 * @generated
	 */
	void setGroupPercentage(double value);

	/**
	 * Returns the value of the '<em><b>Age Speed Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.EPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Speed Dependency</em>' containment reference list.
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_AgeSpeedDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPoint> getAgeSpeedDependency();

	/**
	 * Returns the value of the '<em><b>Age Distribution</b></em>' containment reference list.
	 * The list contents are of type {@link com.paxelerate.model.EPoint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age Distribution</em>' containment reference list.
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_AgeDistribution()
	 * @model containment="true"
	 * @generated
	 */
	EList<EPoint> getAgeDistribution();

	/**
	 * Returns the value of the '<em><b>Passenger Knee Width Mean Male</b></em>' attribute.
	 * The default value is <code>"0.3418"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Width Mean Male</em>' attribute.
	 * @see #setPassengerKneeWidthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeWidthMeanMale()
	 * @model default="0.3418"
	 * @generated
	 */
	double getPassengerKneeWidthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanMale <em>Passenger Knee Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Width Mean Male</em>' attribute.
	 * @see #getPassengerKneeWidthMeanMale()
	 * @generated
	 */
	void setPassengerKneeWidthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Width Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0203"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Width Deviation Male</em>' attribute.
	 * @see #setPassengerKneeWidthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeWidthDeviationMale()
	 * @model default="0.0203"
	 * @generated
	 */
	double getPassengerKneeWidthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationMale <em>Passenger Knee Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Width Deviation Male</em>' attribute.
	 * @see #getPassengerKneeWidthDeviationMale()
	 * @generated
	 */
	void setPassengerKneeWidthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Width Mean Female</b></em>' attribute.
	 * The default value is <code>"0.3427"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Width Mean Female</em>' attribute.
	 * @see #setPassengerKneeWidthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeWidthMeanFemale()
	 * @model default="0.3427"
	 * @generated
	 */
	double getPassengerKneeWidthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthMeanFemale <em>Passenger Knee Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Width Mean Female</em>' attribute.
	 * @see #getPassengerKneeWidthMeanFemale()
	 * @generated
	 */
	void setPassengerKneeWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.0224"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Width Deviation Female</em>' attribute.
	 * @see #setPassengerKneeWidthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeWidthDeviationFemale()
	 * @model default="0.0224"
	 * @generated
	 */
	double getPassengerKneeWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeWidthDeviationFemale <em>Passenger Knee Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Width Deviation Female</em>' attribute.
	 * @see #getPassengerKneeWidthDeviationFemale()
	 * @generated
	 */
	void setPassengerKneeWidthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Depth Mean Male</b></em>' attribute.
	 * The default value is <code>"0.2486"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Depth Mean Male</em>' attribute.
	 * @see #setPassengerKneeDepthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeDepthMeanMale()
	 * @model default="0.2486"
	 * @generated
	 */
	double getPassengerKneeDepthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanMale <em>Passenger Knee Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Depth Mean Male</em>' attribute.
	 * @see #getPassengerKneeDepthMeanMale()
	 * @generated
	 */
	void setPassengerKneeDepthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Depth Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0207"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Depth Deviation Male</em>' attribute.
	 * @see #setPassengerKneeDepthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeDepthDeviationMale()
	 * @model default="0.0207"
	 * @generated
	 */
	double getPassengerKneeDepthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationMale <em>Passenger Knee Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Depth Deviation Male</em>' attribute.
	 * @see #getPassengerKneeDepthDeviationMale()
	 * @generated
	 */
	void setPassengerKneeDepthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Depth Mean Female</b></em>' attribute.
	 * The default value is <code>"0.2271"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Depth Mean Female</em>' attribute.
	 * @see #setPassengerKneeDepthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeDepthMeanFemale()
	 * @model default="0.2271"
	 * @generated
	 */
	double getPassengerKneeDepthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthMeanFemale <em>Passenger Knee Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Depth Mean Female</em>' attribute.
	 * @see #getPassengerKneeDepthMeanFemale()
	 * @generated
	 */
	void setPassengerKneeDepthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Depth Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.021"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Depth Deviation Female</em>' attribute.
	 * @see #setPassengerKneeDepthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeDepthDeviationFemale()
	 * @model default="0.021"
	 * @generated
	 */
	double getPassengerKneeDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeDepthDeviationFemale <em>Passenger Knee Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Depth Deviation Female</em>' attribute.
	 * @see #getPassengerKneeDepthDeviationFemale()
	 * @generated
	 */
	void setPassengerKneeDepthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Height Mean Male</b></em>' attribute.
	 * The default value is <code>"0.5048"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Height Mean Male</em>' attribute.
	 * @see #setPassengerKneeHeightMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeHeightMeanMale()
	 * @model default="0.5048"
	 * @generated
	 */
	double getPassengerKneeHeightMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanMale <em>Passenger Knee Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Height Mean Male</em>' attribute.
	 * @see #getPassengerKneeHeightMeanMale()
	 * @generated
	 */
	void setPassengerKneeHeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Height Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0276"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Height Deviation Male</em>' attribute.
	 * @see #setPassengerKneeHeightDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeHeightDeviationMale()
	 * @model default="0.0276"
	 * @generated
	 */
	double getPassengerKneeHeightDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationMale <em>Passenger Knee Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Height Deviation Male</em>' attribute.
	 * @see #getPassengerKneeHeightDeviationMale()
	 * @generated
	 */
	void setPassengerKneeHeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Height Mean Female</b></em>' attribute.
	 * The default value is <code>"0.4587"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Height Mean Female</em>' attribute.
	 * @see #setPassengerKneeHeightMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeHeightMeanFemale()
	 * @model default="0.4587"
	 * @generated
	 */
	double getPassengerKneeHeightMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightMeanFemale <em>Passenger Knee Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Height Mean Female</em>' attribute.
	 * @see #getPassengerKneeHeightMeanFemale()
	 * @generated
	 */
	void setPassengerKneeHeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Knee Height Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.0261"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Knee Height Deviation Female</em>' attribute.
	 * @see #setPassengerKneeHeightDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerKneeHeightDeviationFemale()
	 * @model default="0.0261"
	 * @generated
	 */
	double getPassengerKneeHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerKneeHeightDeviationFemale <em>Passenger Knee Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Knee Height Deviation Female</em>' attribute.
	 * @see #getPassengerKneeHeightDeviationFemale()
	 * @generated
	 */
	void setPassengerKneeHeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Width Mean Male</b></em>' attribute.
	 * The default value is <code>"0.3418"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Width Mean Male</em>' attribute.
	 * @see #setPassengerHipWidthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipWidthMeanMale()
	 * @model default="0.3418"
	 * @generated
	 */
	double getPassengerHipWidthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanMale <em>Passenger Hip Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Width Mean Male</em>' attribute.
	 * @see #getPassengerHipWidthMeanMale()
	 * @generated
	 */
	void setPassengerHipWidthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Width Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0203"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Width Deviation Male</em>' attribute.
	 * @see #setPassengerHipWidthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipWidthDeviationMale()
	 * @model default="0.0203"
	 * @generated
	 */
	double getPassengerHipWidthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationMale <em>Passenger Hip Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Width Deviation Male</em>' attribute.
	 * @see #getPassengerHipWidthDeviationMale()
	 * @generated
	 */
	void setPassengerHipWidthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Width Mean Female</b></em>' attribute.
	 * The default value is <code>"0.3427"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Width Mean Female</em>' attribute.
	 * @see #setPassengerHipWidthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipWidthMeanFemale()
	 * @model default="0.3427"
	 * @generated
	 */
	double getPassengerHipWidthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthMeanFemale <em>Passenger Hip Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Width Mean Female</em>' attribute.
	 * @see #getPassengerHipWidthMeanFemale()
	 * @generated
	 */
	void setPassengerHipWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.0224"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Width Deviation Female</em>' attribute.
	 * @see #setPassengerHipWidthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipWidthDeviationFemale()
	 * @model default="0.0224"
	 * @generated
	 */
	double getPassengerHipWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipWidthDeviationFemale <em>Passenger Hip Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Width Deviation Female</em>' attribute.
	 * @see #getPassengerHipWidthDeviationFemale()
	 * @generated
	 */
	void setPassengerHipWidthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Depth Mean Male</b></em>' attribute.
	 * The default value is <code>"0.2486"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Depth Mean Male</em>' attribute.
	 * @see #setPassengerHipDepthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipDepthMeanMale()
	 * @model default="0.2486"
	 * @generated
	 */
	double getPassengerHipDepthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanMale <em>Passenger Hip Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Depth Mean Male</em>' attribute.
	 * @see #getPassengerHipDepthMeanMale()
	 * @generated
	 */
	void setPassengerHipDepthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Depth Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0207"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Depth Deviation Male</em>' attribute.
	 * @see #setPassengerHipDepthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipDepthDeviationMale()
	 * @model default="0.0207"
	 * @generated
	 */
	double getPassengerHipDepthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationMale <em>Passenger Hip Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Depth Deviation Male</em>' attribute.
	 * @see #getPassengerHipDepthDeviationMale()
	 * @generated
	 */
	void setPassengerHipDepthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Depth Mean Female</b></em>' attribute.
	 * The default value is <code>"0.2271"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Depth Mean Female</em>' attribute.
	 * @see #setPassengerHipDepthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipDepthMeanFemale()
	 * @model default="0.2271"
	 * @generated
	 */
	double getPassengerHipDepthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthMeanFemale <em>Passenger Hip Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Depth Mean Female</em>' attribute.
	 * @see #getPassengerHipDepthMeanFemale()
	 * @generated
	 */
	void setPassengerHipDepthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Depth Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.021"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Depth Deviation Female</em>' attribute.
	 * @see #setPassengerHipDepthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipDepthDeviationFemale()
	 * @model default="0.021"
	 * @generated
	 */
	double getPassengerHipDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipDepthDeviationFemale <em>Passenger Hip Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Depth Deviation Female</em>' attribute.
	 * @see #getPassengerHipDepthDeviationFemale()
	 * @generated
	 */
	void setPassengerHipDepthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Height Mean Male</b></em>' attribute.
	 * The default value is <code>"0.8874"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Height Mean Male</em>' attribute.
	 * @see #setPassengerHipHeightMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipHeightMeanMale()
	 * @model default="0.8874"
	 * @generated
	 */
	double getPassengerHipHeightMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanMale <em>Passenger Hip Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Height Mean Male</em>' attribute.
	 * @see #getPassengerHipHeightMeanMale()
	 * @generated
	 */
	void setPassengerHipHeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Height Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0471"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Height Deviation Male</em>' attribute.
	 * @see #setPassengerHipHeightDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipHeightDeviationMale()
	 * @model default="0.0471"
	 * @generated
	 */
	double getPassengerHipHeightDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationMale <em>Passenger Hip Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Height Deviation Male</em>' attribute.
	 * @see #getPassengerHipHeightDeviationMale()
	 * @generated
	 */
	void setPassengerHipHeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Height Mean Female</b></em>' attribute.
	 * The default value is <code>"0.8383"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Height Mean Female</em>' attribute.
	 * @see #setPassengerHipHeightMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipHeightMeanFemale()
	 * @model default="0.8383"
	 * @generated
	 */
	double getPassengerHipHeightMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightMeanFemale <em>Passenger Hip Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Height Mean Female</em>' attribute.
	 * @see #getPassengerHipHeightMeanFemale()
	 * @generated
	 */
	void setPassengerHipHeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Hip Height Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.0452"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Hip Height Deviation Female</em>' attribute.
	 * @see #setPassengerHipHeightDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerHipHeightDeviationFemale()
	 * @model default="0.0452"
	 * @generated
	 */
	double getPassengerHipHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerHipHeightDeviationFemale <em>Passenger Hip Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Hip Height Deviation Female</em>' attribute.
	 * @see #getPassengerHipHeightDeviationFemale()
	 * @generated
	 */
	void setPassengerHipHeightDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Width Mean Male</b></em>' attribute.
	 * The default value is <code>"0.49"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Width Mean Male</em>' attribute.
	 * @see #setPassengerShoulderWidthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderWidthMeanMale()
	 * @model default="0.49"
	 * @generated
	 */
	double getPassengerShoulderWidthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanMale <em>Passenger Shoulder Width Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Width Mean Male</em>' attribute.
	 * @see #getPassengerShoulderWidthMeanMale()
	 * @generated
	 */
	void setPassengerShoulderWidthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Width Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.026"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Width Deviation Male</em>' attribute.
	 * @see #setPassengerShoulderWidthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderWidthDeviationMale()
	 * @model default="0.026"
	 * @generated
	 */
	double getPassengerShoulderWidthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationMale <em>Passenger Shoulder Width Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Width Deviation Male</em>' attribute.
	 * @see #getPassengerShoulderWidthDeviationMale()
	 * @generated
	 */
	void setPassengerShoulderWidthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Width Mean Female</b></em>' attribute.
	 * The default value is <code>"0.43"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Width Mean Female</em>' attribute.
	 * @see #setPassengerShoulderWidthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderWidthMeanFemale()
	 * @model default="0.43"
	 * @generated
	 */
	double getPassengerShoulderWidthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthMeanFemale <em>Passenger Shoulder Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Width Mean Female</em>' attribute.
	 * @see #getPassengerShoulderWidthMeanFemale()
	 * @generated
	 */
	void setPassengerShoulderWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.023"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Width Deviation Female</em>' attribute.
	 * @see #setPassengerShoulderWidthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderWidthDeviationFemale()
	 * @model default="0.023"
	 * @generated
	 */
	double getPassengerShoulderWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderWidthDeviationFemale <em>Passenger Shoulder Width Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Width Deviation Female</em>' attribute.
	 * @see #getPassengerShoulderWidthDeviationFemale()
	 * @generated
	 */
	void setPassengerShoulderWidthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Depth Mean Male</b></em>' attribute.
	 * The default value is <code>"0.2432"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Depth Mean Male</em>' attribute.
	 * @see #setPassengerShoulderDepthMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderDepthMeanMale()
	 * @model default="0.2432"
	 * @generated
	 */
	double getPassengerShoulderDepthMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanMale <em>Passenger Shoulder Depth Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Depth Mean Male</em>' attribute.
	 * @see #getPassengerShoulderDepthMeanMale()
	 * @generated
	 */
	void setPassengerShoulderDepthMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Depth Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.0215"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Depth Deviation Male</em>' attribute.
	 * @see #setPassengerShoulderDepthDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderDepthDeviationMale()
	 * @model default="0.0215"
	 * @generated
	 */
	double getPassengerShoulderDepthDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationMale <em>Passenger Shoulder Depth Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Depth Deviation Male</em>' attribute.
	 * @see #getPassengerShoulderDepthDeviationMale()
	 * @generated
	 */
	void setPassengerShoulderDepthDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Depth Mean Female</b></em>' attribute.
	 * The default value is <code>"0.2394"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Depth Mean Female</em>' attribute.
	 * @see #setPassengerShoulderDepthMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderDepthMeanFemale()
	 * @model default="0.2394"
	 * @generated
	 */
	double getPassengerShoulderDepthMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthMeanFemale <em>Passenger Shoulder Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Depth Mean Female</em>' attribute.
	 * @see #getPassengerShoulderDepthMeanFemale()
	 * @generated
	 */
	void setPassengerShoulderDepthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Depth Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.0211"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Depth Deviation Female</em>' attribute.
	 * @see #setPassengerShoulderDepthDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderDepthDeviationFemale()
	 * @model default="0.0211"
	 * @generated
	 */
	double getPassengerShoulderDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderDepthDeviationFemale <em>Passenger Shoulder Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Depth Deviation Female</em>' attribute.
	 * @see #getPassengerShoulderDepthDeviationFemale()
	 * @generated
	 */
	void setPassengerShoulderDepthDeviationFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Height Mean Male</b></em>' attribute.
	 * The default value is <code>"1.4425"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Height Mean Male</em>' attribute.
	 * @see #setPassengerShoulderHeightMeanMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderHeightMeanMale()
	 * @model default="1.4425"
	 * @generated
	 */
	double getPassengerShoulderHeightMeanMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanMale <em>Passenger Shoulder Height Mean Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Height Mean Male</em>' attribute.
	 * @see #getPassengerShoulderHeightMeanMale()
	 * @generated
	 */
	void setPassengerShoulderHeightMeanMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Height Deviation Male</b></em>' attribute.
	 * The default value is <code>"0.062"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Height Deviation Male</em>' attribute.
	 * @see #setPassengerShoulderHeightDeviationMale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderHeightDeviationMale()
	 * @model default="0.062"
	 * @generated
	 */
	double getPassengerShoulderHeightDeviationMale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationMale <em>Passenger Shoulder Height Deviation Male</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Height Deviation Male</em>' attribute.
	 * @see #getPassengerShoulderHeightDeviationMale()
	 * @generated
	 */
	void setPassengerShoulderHeightDeviationMale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Height Mean Female</b></em>' attribute.
	 * The default value is <code>"1.3336"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Height Mean Female</em>' attribute.
	 * @see #setPassengerShoulderHeightMeanFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderHeightMeanFemale()
	 * @model default="1.3336"
	 * @generated
	 */
	double getPassengerShoulderHeightMeanFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightMeanFemale <em>Passenger Shoulder Height Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Height Mean Female</em>' attribute.
	 * @see #getPassengerShoulderHeightMeanFemale()
	 * @generated
	 */
	void setPassengerShoulderHeightMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Shoulder Height Deviation Female</b></em>' attribute.
	 * The default value is <code>"0.0579"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Shoulder Height Deviation Female</em>' attribute.
	 * @see #setPassengerShoulderHeightDeviationFemale(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getPassengerProperties_PassengerShoulderHeightDeviationFemale()
	 * @model default="0.0579"
	 * @generated
	 */
	double getPassengerShoulderHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.PassengerProperties#getPassengerShoulderHeightDeviationFemale <em>Passenger Shoulder Height Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Shoulder Height Deviation Female</em>' attribute.
	 * @see #getPassengerShoulderHeightDeviationFemale()
	 * @generated
	 */
	void setPassengerShoulderHeightDeviationFemale(double value);

} // PassengerProperties
