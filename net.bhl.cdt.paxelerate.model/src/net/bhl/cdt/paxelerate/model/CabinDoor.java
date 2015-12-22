/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Door</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.paxelerate.model.CabinDoor#getYPosition
 * <em>YPosition</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.CabinDoor#isOnBothSides
 * <em>On Both Sides</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.CabinDoor#isMainDoor
 * <em>Main Door</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.CabinDoor#getWidth <em>Width</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.CabinDoor#getId <em>Id</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.CabinDoor#getDoorType
 * <em>Door Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor()
 * @model
 * @generated
 */
public interface CabinDoor extends EObject {
	/**
	 * Returns the value of the '<em><b>YPosition</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YPosition</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>YPosition</em>' attribute.
	 * @see #setYPosition(double)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor_YPosition()
	 * @model
	 * @generated
	 */
	double getYPosition();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.CabinDoor#getYPosition
	 * <em>YPosition</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>YPosition</em>' attribute.
	 * @see #getYPosition()
	 * @generated
	 */
	void setYPosition(double value);

	/**
	 * Returns the value of the '<em><b>On Both Sides</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Both Sides</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>On Both Sides</em>' attribute.
	 * @see #setOnBothSides(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor_OnBothSides()
	 * @model
	 * @generated
	 */
	boolean isOnBothSides();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.CabinDoor#isOnBothSides
	 * <em>On Both Sides</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>On Both Sides</em>' attribute.
	 * @see #isOnBothSides()
	 * @generated
	 */
	void setOnBothSides(boolean value);

	/**
	 * Returns the value of the '<em><b>Main Door</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Door</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Main Door</em>' attribute.
	 * @see #setMainDoor(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor_MainDoor()
	 * @model
	 * @generated
	 */
	boolean isMainDoor();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.CabinDoor#isMainDoor
	 * <em>Main Door</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Main Door</em>' attribute.
	 * @see #isMainDoor()
	 * @generated
	 */
	void setMainDoor(boolean value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.CabinDoor#getWidth <em>Width</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.CabinDoor#getId <em>Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Door Type</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link net.bhl.cdt.paxelerate.model.DoorType}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Door Type</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.DoorType
	 * @see #setDoorType(DoorType)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabinDoor_DoorType()
	 * @model
	 * @generated
	 */
	DoorType getDoorType();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.CabinDoor#getDoorType
	 * <em>Door Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Door Type</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.DoorType
	 * @see #getDoorType()
	 * @generated
	 */
	void setDoorType(DoorType value);

} // CabinDoor
