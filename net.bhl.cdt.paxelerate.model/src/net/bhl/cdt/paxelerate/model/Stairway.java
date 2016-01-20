/**
 */
package net.bhl.cdt.paxelerate.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stairway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.Stairway#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getStairway()
 * @model
 * @generated
 */
public interface Stairway extends PhysicalObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.paxelerate.model.StairwayDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.StairwayDirection
	 * @see #setDirection(StairwayDirection)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getStairway_Direction()
	 * @model
	 * @generated
	 */
	StairwayDirection getDirection();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Stairway#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.StairwayDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(StairwayDirection value);

} // Stairway