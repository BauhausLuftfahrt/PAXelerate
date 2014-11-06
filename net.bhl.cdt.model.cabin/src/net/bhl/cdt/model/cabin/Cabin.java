/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cabin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getCabinLength <em>Cabin Length</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getCabinWidth <em>Cabin Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumbSeats <em>Numb Seats</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getFCperc <em>FCperc</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBCperc <em>BCperc</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumbAisles <em>Numb Aisles</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin()
 * @model
 * @generated
 */
public interface Cabin extends EObject {

	/**
	 * Returns the value of the '<em><b>Cabin Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Length</em>' attribute.
	 * @see #setCabinLength(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_CabinLength()
	 * @model
	 * @generated
	 */
	double getCabinLength();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getCabinLength <em>Cabin Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cabin Length</em>' attribute.
	 * @see #getCabinLength()
	 * @generated
	 */
	void setCabinLength(double value);

	/**
	 * Returns the value of the '<em><b>Cabin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Width</em>' attribute.
	 * @see #setCabinWidth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_CabinWidth()
	 * @model
	 * @generated
	 */
	double getCabinWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getCabinWidth <em>Cabin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cabin Width</em>' attribute.
	 * @see #getCabinWidth()
	 * @generated
	 */
	void setCabinWidth(double value);

	/**
	 * Returns the value of the '<em><b>Numb Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numb Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numb Seats</em>' attribute.
	 * @see #setNumbSeats(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_NumbSeats()
	 * @model
	 * @generated
	 */
	int getNumbSeats();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getNumbSeats <em>Numb Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numb Seats</em>' attribute.
	 * @see #getNumbSeats()
	 * @generated
	 */
	void setNumbSeats(int value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.PassengerClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PassengerClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.CabinDoors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Doors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CabinDoors> getDoors();

	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boarding Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #setBoardingTime(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_BoardingTime()
	 * @model
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Time</em>' attribute.
	 * @see #getBoardingTime()
	 * @generated
	 */
	void setBoardingTime(double value);

	/**
	 * Returns the value of the '<em><b>FCperc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FCperc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCperc</em>' attribute.
	 * @see #setFCperc(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_FCperc()
	 * @model
	 * @generated
	 */
	int getFCperc();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getFCperc <em>FCperc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCperc</em>' attribute.
	 * @see #getFCperc()
	 * @generated
	 */
	void setFCperc(int value);

	/**
	 * Returns the value of the '<em><b>BCperc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BCperc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BCperc</em>' attribute.
	 * @see #setBCperc(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_BCperc()
	 * @model
	 * @generated
	 */
	int getBCperc();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getBCperc <em>BCperc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCperc</em>' attribute.
	 * @see #getBCperc()
	 * @generated
	 */
	void setBCperc(int value);

	/**
	 * Returns the value of the '<em><b>Numb Aisles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numb Aisles</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numb Aisles</em>' attribute.
	 * @see #setNumbAisles(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_NumbAisles()
	 * @model
	 * @generated
	 */
	int getNumbAisles();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getNumbAisles <em>Numb Aisles</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numb Aisles</em>' attribute.
	 * @see #getNumbAisles()
	 * @generated
	 */
	void setNumbAisles(int value);
} // Cabin
