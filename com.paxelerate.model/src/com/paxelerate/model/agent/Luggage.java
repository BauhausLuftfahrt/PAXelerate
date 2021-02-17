/**
 */
package com.paxelerate.model.agent;

import com.paxelerate.model.enums.LuggageType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Luggage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.agent.Luggage#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Luggage#getStowTime <em>Stow Time</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Luggage#getStowDistance <em>Stow Distance</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Luggage#getType <em>Type</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.Luggage#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see com.paxelerate.model.agent.AgentPackage#getLuggage()
 * @model
 * @generated
 */
public interface Luggage extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see com.paxelerate.model.agent.AgentPackage#getLuggage_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Luggage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Stow Time</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stow Time</em>' attribute.
	 * @see #setStowTime(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getLuggage_StowTime()
	 * @model default="1.0"
	 * @generated
	 */
	double getStowTime();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Luggage#getStowTime <em>Stow Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stow Time</em>' attribute.
	 * @see #getStowTime()
	 * @generated
	 */
	void setStowTime(double value);

	/**
	 * Returns the value of the '<em><b>Stow Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stow Distance</em>' attribute.
	 * @see #setStowDistance(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getLuggage_StowDistance()
	 * @model
	 * @generated
	 */
	double getStowDistance();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Luggage#getStowDistance <em>Stow Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stow Distance</em>' attribute.
	 * @see #getStowDistance()
	 * @generated
	 */
	void setStowDistance(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.enums.LuggageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.enums.LuggageType
	 * @see #setType(LuggageType)
	 * @see com.paxelerate.model.agent.AgentPackage#getLuggage_Type()
	 * @model
	 * @generated
	 */
	LuggageType getType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Luggage#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.enums.LuggageType
	 * @see #getType()
	 * @generated
	 */
	void setType(LuggageType value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(double)
	 * @see com.paxelerate.model.agent.AgentPackage#getLuggage_Volume()
	 * @model default="0"
	 * @generated
	 */
	double getVolume();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.agent.Luggage#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(double value);

} // Luggage
