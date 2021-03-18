/**
 */
package com.paxelerate.model.settings;

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
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getMaxNumberOfLuggageItemsPerPax <em>Max Number Of Luggage Items Per Pax</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeDeviation <em>Jacket Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeMean <em>Jacket Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeMean <em>Small Bag Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeDeviation <em>Small Bag Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeMean <em>Medium Bag Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeDeviation <em>Medium Bag Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeMean <em>Large Bag Stow Time Mean</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeDeviation <em>Large Bag Stow Time Deviation</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getJacketVolume <em>Jacket Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagVolume <em>Small Bag Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagVolume <em>Medium Bag Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagVolume <em>Large Bag Volume</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getJacketBulkiness <em>Jacket Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagBulkiness <em>Small Bag Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagBulkiness <em>Medium Bag Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagBulkiness <em>Large Bag Bulkiness</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getJacketWalkingSpeedFactor <em>Jacket Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagWalkingSpeedFactor <em>Small Bag Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagWalkingSpeedFactor <em>Medium Bag Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagWalkingSpeedFactor <em>Large Bag Walking Speed Factor</em>}</li>
 *   <li>{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStorageScaling <em>Luggage Storage Scaling</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties()
 * @model
 * @generated
 */
public interface LuggageProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Max Number Of Luggage Items Per Pax</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Number Of Luggage Items Per Pax</em>' attribute.
	 * @see #setMaxNumberOfLuggageItemsPerPax(int)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_MaxNumberOfLuggageItemsPerPax()
	 * @model default="1"
	 * @generated
	 */
	int getMaxNumberOfLuggageItemsPerPax();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getMaxNumberOfLuggageItemsPerPax <em>Max Number Of Luggage Items Per Pax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Of Luggage Items Per Pax</em>' attribute.
	 * @see #getMaxNumberOfLuggageItemsPerPax()
	 * @generated
	 */
	void setMaxNumberOfLuggageItemsPerPax(int value);

	/**
	 * Returns the value of the '<em><b>Luggage Stow Distance From Seat Mean</b></em>' attribute.
	 * The default value is <code>"0.8"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Stow Distance From Seat Mean</em>' attribute.
	 * @see #setLuggageStowDistanceFromSeatMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LuggageStowDistanceFromSeatMean()
	 * @model default="0.8"
	 * @generated
	 */
	double getLuggageStowDistanceFromSeatMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatMean <em>Luggage Stow Distance From Seat Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Stow Distance From Seat Mean</em>' attribute.
	 * @see #getLuggageStowDistanceFromSeatMean()
	 * @generated
	 */
	void setLuggageStowDistanceFromSeatMean(double value);

	/**
	 * Returns the value of the '<em><b>Luggage Stow Distance From Seat Deviation</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Stow Distance From Seat Deviation</em>' attribute.
	 * @see #setLuggageStowDistanceFromSeatDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LuggageStowDistanceFromSeatDeviation()
	 * @model default="0.1"
	 * @generated
	 */
	double getLuggageStowDistanceFromSeatDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStowDistanceFromSeatDeviation <em>Luggage Stow Distance From Seat Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Stow Distance From Seat Deviation</em>' attribute.
	 * @see #getLuggageStowDistanceFromSeatDeviation()
	 * @generated
	 */
	void setLuggageStowDistanceFromSeatDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Jacket Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacket Stow Time Deviation</em>' attribute.
	 * @see #setJacketStowTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_JacketStowTimeDeviation()
	 * @model default="2"
	 * @generated
	 */
	double getJacketStowTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeDeviation <em>Jacket Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacket Stow Time Deviation</em>' attribute.
	 * @see #getJacketStowTimeDeviation()
	 * @generated
	 */
	void setJacketStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Jacket Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacket Stow Time Mean</em>' attribute.
	 * @see #setJacketStowTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_JacketStowTimeMean()
	 * @model default="7"
	 * @generated
	 */
	double getJacketStowTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getJacketStowTimeMean <em>Jacket Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacket Stow Time Mean</em>' attribute.
	 * @see #getJacketStowTimeMean()
	 * @generated
	 */
	void setJacketStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Small Bag Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Bag Stow Time Mean</em>' attribute.
	 * @see #setSmallBagStowTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_SmallBagStowTimeMean()
	 * @model default="10"
	 * @generated
	 */
	double getSmallBagStowTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeMean <em>Small Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Bag Stow Time Mean</em>' attribute.
	 * @see #getSmallBagStowTimeMean()
	 * @generated
	 */
	void setSmallBagStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Small Bag Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Bag Stow Time Deviation</em>' attribute.
	 * @see #setSmallBagStowTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_SmallBagStowTimeDeviation()
	 * @model default="5"
	 * @generated
	 */
	double getSmallBagStowTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagStowTimeDeviation <em>Small Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Bag Stow Time Deviation</em>' attribute.
	 * @see #getSmallBagStowTimeDeviation()
	 * @generated
	 */
	void setSmallBagStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Medium Bag Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Bag Stow Time Mean</em>' attribute.
	 * @see #setMediumBagStowTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_MediumBagStowTimeMean()
	 * @model default="15"
	 * @generated
	 */
	double getMediumBagStowTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeMean <em>Medium Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Bag Stow Time Mean</em>' attribute.
	 * @see #getMediumBagStowTimeMean()
	 * @generated
	 */
	void setMediumBagStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Medium Bag Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Bag Stow Time Deviation</em>' attribute.
	 * @see #setMediumBagStowTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_MediumBagStowTimeDeviation()
	 * @model default="7"
	 * @generated
	 */
	double getMediumBagStowTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagStowTimeDeviation <em>Medium Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Bag Stow Time Deviation</em>' attribute.
	 * @see #getMediumBagStowTimeDeviation()
	 * @generated
	 */
	void setMediumBagStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Large Bag Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"20"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Bag Stow Time Mean</em>' attribute.
	 * @see #setLargeBagStowTimeMean(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LargeBagStowTimeMean()
	 * @model default="20"
	 * @generated
	 */
	double getLargeBagStowTimeMean();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeMean <em>Large Bag Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Bag Stow Time Mean</em>' attribute.
	 * @see #getLargeBagStowTimeMean()
	 * @generated
	 */
	void setLargeBagStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Large Bag Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Bag Stow Time Deviation</em>' attribute.
	 * @see #setLargeBagStowTimeDeviation(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LargeBagStowTimeDeviation()
	 * @model default="5"
	 * @generated
	 */
	double getLargeBagStowTimeDeviation();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagStowTimeDeviation <em>Large Bag Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Bag Stow Time Deviation</em>' attribute.
	 * @see #getLargeBagStowTimeDeviation()
	 * @generated
	 */
	void setLargeBagStowTimeDeviation(double value);

	/**
	 * Returns the value of the '<em><b>Jacket Volume</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacket Volume</em>' attribute.
	 * @see #setJacketVolume(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_JacketVolume()
	 * @model default="0.05"
	 * @generated
	 */
	double getJacketVolume();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getJacketVolume <em>Jacket Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacket Volume</em>' attribute.
	 * @see #getJacketVolume()
	 * @generated
	 */
	void setJacketVolume(double value);

	/**
	 * Returns the value of the '<em><b>Small Bag Volume</b></em>' attribute.
	 * The default value is <code>"0.01"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Bag Volume</em>' attribute.
	 * @see #setSmallBagVolume(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_SmallBagVolume()
	 * @model default="0.01"
	 * @generated
	 */
	double getSmallBagVolume();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagVolume <em>Small Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Bag Volume</em>' attribute.
	 * @see #getSmallBagVolume()
	 * @generated
	 */
	void setSmallBagVolume(double value);

	/**
	 * Returns the value of the '<em><b>Medium Bag Volume</b></em>' attribute.
	 * The default value is <code>"0.02"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Bag Volume</em>' attribute.
	 * @see #setMediumBagVolume(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_MediumBagVolume()
	 * @model default="0.02"
	 * @generated
	 */
	double getMediumBagVolume();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagVolume <em>Medium Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Bag Volume</em>' attribute.
	 * @see #getMediumBagVolume()
	 * @generated
	 */
	void setMediumBagVolume(double value);

	/**
	 * Returns the value of the '<em><b>Large Bag Volume</b></em>' attribute.
	 * The default value is <code>"0.04"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Bag Volume</em>' attribute.
	 * @see #setLargeBagVolume(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LargeBagVolume()
	 * @model default="0.04"
	 * @generated
	 */
	double getLargeBagVolume();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagVolume <em>Large Bag Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Bag Volume</em>' attribute.
	 * @see #getLargeBagVolume()
	 * @generated
	 */
	void setLargeBagVolume(double value);

	/**
	 * Returns the value of the '<em><b>Jacket Bulkiness</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacket Bulkiness</em>' attribute.
	 * @see #setJacketBulkiness(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_JacketBulkiness()
	 * @model default="1.0"
	 * @generated
	 */
	double getJacketBulkiness();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getJacketBulkiness <em>Jacket Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacket Bulkiness</em>' attribute.
	 * @see #getJacketBulkiness()
	 * @generated
	 */
	void setJacketBulkiness(double value);

	/**
	 * Returns the value of the '<em><b>Small Bag Bulkiness</b></em>' attribute.
	 * The default value is <code>"1.15"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Bag Bulkiness</em>' attribute.
	 * @see #setSmallBagBulkiness(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_SmallBagBulkiness()
	 * @model default="1.15"
	 * @generated
	 */
	double getSmallBagBulkiness();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagBulkiness <em>Small Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Bag Bulkiness</em>' attribute.
	 * @see #getSmallBagBulkiness()
	 * @generated
	 */
	void setSmallBagBulkiness(double value);

	/**
	 * Returns the value of the '<em><b>Medium Bag Bulkiness</b></em>' attribute.
	 * The default value is <code>"1.3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Bag Bulkiness</em>' attribute.
	 * @see #setMediumBagBulkiness(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_MediumBagBulkiness()
	 * @model default="1.3"
	 * @generated
	 */
	double getMediumBagBulkiness();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagBulkiness <em>Medium Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Bag Bulkiness</em>' attribute.
	 * @see #getMediumBagBulkiness()
	 * @generated
	 */
	void setMediumBagBulkiness(double value);

	/**
	 * Returns the value of the '<em><b>Large Bag Bulkiness</b></em>' attribute.
	 * The default value is <code>"1.6"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Bag Bulkiness</em>' attribute.
	 * @see #setLargeBagBulkiness(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LargeBagBulkiness()
	 * @model default="1.6"
	 * @generated
	 */
	double getLargeBagBulkiness();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagBulkiness <em>Large Bag Bulkiness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Bag Bulkiness</em>' attribute.
	 * @see #getLargeBagBulkiness()
	 * @generated
	 */
	void setLargeBagBulkiness(double value);

	/**
	 * Returns the value of the '<em><b>Jacket Walking Speed Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jacket Walking Speed Factor</em>' attribute.
	 * @see #setJacketWalkingSpeedFactor(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_JacketWalkingSpeedFactor()
	 * @model default="1"
	 * @generated
	 */
	double getJacketWalkingSpeedFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getJacketWalkingSpeedFactor <em>Jacket Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jacket Walking Speed Factor</em>' attribute.
	 * @see #getJacketWalkingSpeedFactor()
	 * @generated
	 */
	void setJacketWalkingSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Small Bag Walking Speed Factor</b></em>' attribute.
	 * The default value is <code>"0.95"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Small Bag Walking Speed Factor</em>' attribute.
	 * @see #setSmallBagWalkingSpeedFactor(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_SmallBagWalkingSpeedFactor()
	 * @model default="0.95"
	 * @generated
	 */
	double getSmallBagWalkingSpeedFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getSmallBagWalkingSpeedFactor <em>Small Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Small Bag Walking Speed Factor</em>' attribute.
	 * @see #getSmallBagWalkingSpeedFactor()
	 * @generated
	 */
	void setSmallBagWalkingSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Medium Bag Walking Speed Factor</b></em>' attribute.
	 * The default value is <code>"0.9"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medium Bag Walking Speed Factor</em>' attribute.
	 * @see #setMediumBagWalkingSpeedFactor(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_MediumBagWalkingSpeedFactor()
	 * @model default="0.9"
	 * @generated
	 */
	double getMediumBagWalkingSpeedFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getMediumBagWalkingSpeedFactor <em>Medium Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medium Bag Walking Speed Factor</em>' attribute.
	 * @see #getMediumBagWalkingSpeedFactor()
	 * @generated
	 */
	void setMediumBagWalkingSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Large Bag Walking Speed Factor</b></em>' attribute.
	 * The default value is <code>"0.75"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Large Bag Walking Speed Factor</em>' attribute.
	 * @see #setLargeBagWalkingSpeedFactor(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LargeBagWalkingSpeedFactor()
	 * @model default="0.75"
	 * @generated
	 */
	double getLargeBagWalkingSpeedFactor();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLargeBagWalkingSpeedFactor <em>Large Bag Walking Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Large Bag Walking Speed Factor</em>' attribute.
	 * @see #getLargeBagWalkingSpeedFactor()
	 * @generated
	 */
	void setLargeBagWalkingSpeedFactor(double value);

	/**
	 * Returns the value of the '<em><b>Luggage Storage Scaling</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Luggage Storage Scaling</em>' attribute.
	 * @see #setLuggageStorageScaling(double)
	 * @see com.paxelerate.model.settings.SettingsPackage#getLuggageProperties_LuggageStorageScaling()
	 * @model default="1.0"
	 * @generated
	 */
	double getLuggageStorageScaling();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.settings.LuggageProperties#getLuggageStorageScaling <em>Luggage Storage Scaling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luggage Storage Scaling</em>' attribute.
	 * @see #getLuggageStorageScaling()
	 * @generated
	 */
	void setLuggageStorageScaling(double value);

} // LuggageProperties
