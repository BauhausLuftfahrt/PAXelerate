/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#isOnBothSides <em>On Both Sides</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#getNumberOfSimultaneousPassengers <em>Number Of Simultaneous Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Door#getWaitingPassengers <em>Waiting Passengers</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends EObject {
	/**
	 * Returns the value of the '<em><b>XPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XPosition</em>' attribute.
	 * @see #setXPosition(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_XPosition()
	 * @model
	 * @generated
	 */
	int getXPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Door#getXPosition <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XPosition</em>' attribute.
	 * @see #getXPosition()
	 * @generated
	 */
	void setXPosition(int value);

	/**
	 * Returns the value of the '<em><b>On Both Sides</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Both Sides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Both Sides</em>' attribute.
	 * @see #setOnBothSides(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_OnBothSides()
	 * @model
	 * @generated
	 */
	boolean isOnBothSides();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Door#isOnBothSides <em>On Both Sides</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Both Sides</em>' attribute.
	 * @see #isOnBothSides()
	 * @generated
	 */
	void setOnBothSides(boolean value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Door#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Door#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Simultaneous Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Simultaneous Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Simultaneous Passengers</em>' attribute.
	 * @see #setNumberOfSimultaneousPassengers(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_NumberOfSimultaneousPassengers()
	 * @model
	 * @generated
	 */
	int getNumberOfSimultaneousPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Door#getNumberOfSimultaneousPassengers <em>Number Of Simultaneous Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Simultaneous Passengers</em>' attribute.
	 * @see #getNumberOfSimultaneousPassengers()
	 * @generated
	 */
	void setNumberOfSimultaneousPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_IsActive()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Door#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Waiting Passengers</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.paxelerate.model.Passenger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Waiting Passengers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Passengers</em>' reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoor_WaitingPassengers()
	 * @model
	 * @generated
	 */
	EList<Passenger> getWaitingPassengers();

} // Door
