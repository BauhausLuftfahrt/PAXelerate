/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Passenger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getId <em>Id</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getSex <em>Sex</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getSeat <em>Seat</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getHeight <em>Height</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getAge <em>Age</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getWeight <em>Weight</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Passenger#getDoor <em>Door</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger()
 * @model
 * @generated
 */
public interface Passenger extends EObject {
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.Sex}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see #setSex(Sex)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Sex()
	 * @model
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.Sex
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Seat()
	 * @model
	 * @generated
	 */
	Seat getSeat();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getSeat <em>Seat</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seat</em>' reference.
	 * @see #getSeat()
	 * @generated
	 */
	void setSeat(Seat value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' reference.
	 * @see #setDoor(Door)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getPassenger_Door()
	 * @model required="true"
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Passenger#getDoor <em>Door</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

} // Passenger
