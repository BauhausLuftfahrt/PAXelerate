/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#isOnBothSides <em>On Both Sides</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getWidth <em>Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getWidthOfMainDoor <em>Width Of Main Door</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Door#getWidthOfEmergencyExit <em>Width Of Emergency Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor()
 * @model
 * @generated
 */
public interface Door extends EObject {
	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_YPosition()
	 * @model
	 * @generated
	 */
	double getYPosition();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getYPosition <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_OnBothSides()
	 * @model
	 * @generated
	 */
	boolean isOnBothSides();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#isOnBothSides <em>On Both Sides</em>}' attribute.
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
	 * @see #setWidth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Door Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.DoorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Type</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.DoorType
	 * @see #setDoorType(DoorType)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_DoorType()
	 * @model
	 * @generated
	 */
	DoorType getDoorType();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getDoorType <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Type</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.DoorType
	 * @see #getDoorType()
	 * @generated
	 */
	void setDoorType(DoorType value);

	/**
	 * Returns the value of the '<em><b>Width Of Main Door</b></em>' attribute.
	 * The default value is <code>"80"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Of Main Door</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Of Main Door</em>' attribute.
	 * @see #setWidthOfMainDoor(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_WidthOfMainDoor()
	 * @model default="80"
	 * @generated
	 */
	double getWidthOfMainDoor();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getWidthOfMainDoor <em>Width Of Main Door</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Of Main Door</em>' attribute.
	 * @see #getWidthOfMainDoor()
	 * @generated
	 */
	void setWidthOfMainDoor(double value);

	/**
	 * Returns the value of the '<em><b>Width Of Emergency Exit</b></em>' attribute.
	 * The default value is <code>"50"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width Of Emergency Exit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width Of Emergency Exit</em>' attribute.
	 * @see #setWidthOfEmergencyExit(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getDoor_WidthOfEmergencyExit()
	 * @model default="50"
	 * @generated
	 */
	double getWidthOfEmergencyExit();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Door#getWidthOfEmergencyExit <em>Width Of Emergency Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width Of Emergency Exit</em>' attribute.
	 * @see #getWidthOfEmergencyExit()
	 * @generated
	 */
	void setWidthOfEmergencyExit(double value);

} // Door
