/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPercentageOfWomen <em>Percentage Of Women</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerLuggageStowTimeMean <em>Passenger Luggage Stow Time Mean</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerLuggageStowTimeDeviation <em>Passenger Luggage Stow Time Deviation</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties()
 * @model
 * @generated
 */
public interface SimulationProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Passengers Boarding Per Minute</b></em>' attribute.
	 * The default value is <code>"18"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passengers Boarding Per Minute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers Boarding Per Minute</em>' attribute.
	 * @see #setPassengersBoardingPerMinute(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengersBoardingPerMinute()
	 * @model default="18" required="true"
	 * @generated
	 */
	double getPassengersBoardingPerMinute();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengersBoardingPerMinute <em>Passengers Boarding Per Minute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passengers Boarding Per Minute</em>' attribute.
	 * @see #getPassengersBoardingPerMinute()
	 * @generated
	 */
	void setPassengersBoardingPerMinute(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWidthMeanMale()
	 * @model default="47"
	 * @generated
	 */
	double getPassengerWidthMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthMeanMale <em>Passenger Width Mean Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWidthDeviationMale()
	 * @model default="2.8"
	 * @generated
	 */
	double getPassengerWidthDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthDeviationMale <em>Passenger Width Deviation Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWeightMeanMale()
	 * @model default="90"
	 * @generated
	 */
	double getPassengerWeightMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightMeanMale <em>Passenger Weight Mean Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWeightDeviationMale()
	 * @model default="20"
	 * @generated
	 */
	double getPassengerWeightDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightDeviationMale <em>Passenger Weight Deviation Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerHeightMeanMale()
	 * @model default="177.5"
	 * @generated
	 */
	double getPassengerHeightMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightMeanMale <em>Passenger Height Mean Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerHeightDeviationMale()
	 * @model default="11.1"
	 * @generated
	 */
	double getPassengerHeightDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightDeviationMale <em>Passenger Height Deviation Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerDepthMeanMale()
	 * @model default="30"
	 * @generated
	 */
	double getPassengerDepthMeanMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthMeanMale <em>Passenger Depth Mean Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerDepthDeviationMale()
	 * @model default="5"
	 * @generated
	 */
	double getPassengerDepthDeviationMale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthDeviationMale <em>Passenger Depth Deviation Male</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PercentageOfWomen()
	 * @model default="50"
	 * @generated
	 */
	double getPercentageOfWomen();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPercentageOfWomen <em>Percentage Of Women</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Percentage Of Women</em>' attribute.
	 * @see #getPercentageOfWomen()
	 * @generated
	 */
	void setPercentageOfWomen(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Luggage Stow Time Mean</b></em>' attribute.
	 * The default value is <code>"15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Luggage Stow Time Mean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Luggage Stow Time Mean</em>' attribute.
	 * @see #setPassengerLuggageStowTimeMean(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerLuggageStowTimeMean()
	 * @model default="15"
	 * @generated
	 */
	double getPassengerLuggageStowTimeMean();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerLuggageStowTimeMean <em>Passenger Luggage Stow Time Mean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Luggage Stow Time Mean</em>' attribute.
	 * @see #getPassengerLuggageStowTimeMean()
	 * @generated
	 */
	void setPassengerLuggageStowTimeMean(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Luggage Stow Time Deviation</b></em>' attribute.
	 * The default value is <code>"7"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Luggage Stow Time Deviation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Luggage Stow Time Deviation</em>' attribute.
	 * @see #setPassengerLuggageStowTimeDeviation(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerLuggageStowTimeDeviation()
	 * @model default="7"
	 * @generated
	 */
	double getPassengerLuggageStowTimeDeviation();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerLuggageStowTimeDeviation <em>Passenger Luggage Stow Time Deviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Luggage Stow Time Deviation</em>' attribute.
	 * @see #getPassengerLuggageStowTimeDeviation()
	 * @generated
	 */
	void setPassengerLuggageStowTimeDeviation(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWidthMeanFemale()
	 * @model default="41.4"
	 * @generated
	 */
	double getPassengerWidthMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthMeanFemale <em>Passenger Width Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Width Mean Female</em>' attribute.
	 * @see #getPassengerWidthMeanFemale()
	 * @generated
	 */
	void setPassengerWidthMeanFemale(double value);

	/**
	 * Returns the value of the '<em><b>Passenger Width Deviation Female</b></em>' attribute.
	 * The default value is <code>"2.8"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passenger Width Deviation Female</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passenger Width Deviation Female</em>' attribute.
	 * @see #setPassengerWidthDeviationFemale(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWidthDeviationFemale()
	 * @model default="2.8"
	 * @generated
	 */
	double getPassengerWidthDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWidthDeviationFemale <em>Passenger Width Deviation Female</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWeightMeanFemale()
	 * @model default="60"
	 * @generated
	 */
	double getPassengerWeightMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightMeanFemale <em>Passenger Weight Mean Female</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerWeightDeviationFemale()
	 * @model default="15"
	 * @generated
	 */
	double getPassengerWeightDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerWeightDeviationFemale <em>Passenger Weight Deviation Female</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerHeightMeanFemale()
	 * @model default="164.5"
	 * @generated
	 */
	double getPassengerHeightMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightMeanFemale <em>Passenger Height Mean Female</em>}' attribute.
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerHeightDeviationFemale()
	 * @model default="11.5"
	 * @generated
	 */
	double getPassengerHeightDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerHeightDeviationFemale <em>Passenger Height Deviation Female</em>}' attribute.
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
	 * @see #setPassengerDepthMeanFemale(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerDepthMeanFemale()
	 * @model default="27"
	 * @generated
	 */
	double getPassengerDepthMeanFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthMeanFemale <em>Passenger Depth Mean Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Mean Female</em>' attribute.
	 * @see #getPassengerDepthMeanFemale()
	 * @generated
	 */
	void setPassengerDepthMeanFemale(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getSimulationProperties_PassengerDepthDeviationFemale()
	 * @model default="3"
	 * @generated
	 */
	double getPassengerDepthDeviationFemale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.SimulationProperties#getPassengerDepthDeviationFemale <em>Passenger Depth Deviation Female</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passenger Depth Deviation Female</em>' attribute.
	 * @see #getPassengerDepthDeviationFemale()
	 * @generated
	 */
	void setPassengerDepthDeviationFemale(double value);

} // SimulationProperties
