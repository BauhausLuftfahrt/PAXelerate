/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crew Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.CrewMember#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.CrewMember#getSeat <em>Seat</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getCrewMember()
 * @model
 * @generated
 */
public interface CrewMember extends EObject {
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCrewMember_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.CrewMember#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Seat</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seat</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seat</em>' reference.
	 * @see #setSeat(Seat)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCrewMember_Seat()
	 * @model
	 * @generated
	 */
	Seat getSeat();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.CrewMember#getSeat <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' reference.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(Seat value);

} // CrewMember
