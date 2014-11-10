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
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getExits <em>Exits</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getToilets <em>Toilets</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStairs <em>Stairs</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPartition <em>Partition</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStowage <em>Stowage</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumbAisles <em>Numb Aisles</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getFCpassengers <em>FCpassengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBCpassengers <em>BCpassengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPECpassengers <em>PE Cpassengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getTotalPassengers <em>Total Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getRowNonexistent <em>Row Nonexistent</em>}</li>
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
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.CabinDoor}.
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
	EList<CabinDoor> getDoors();

	/**
	 * Returns the value of the '<em><b>Exits</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.EmergencyExit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exits</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exits</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Exits()
	 * @model required="true"
	 * @generated
	 */
	EList<EmergencyExit> getExits();

	/**
	 * Returns the value of the '<em><b>Toilets</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Toilet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Toilets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Toilets</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Toilets()
	 * @model required="true"
	 * @generated
	 */
	EList<Toilet> getToilets();

	/**
	 * Returns the value of the '<em><b>Galleys</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Galley}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Galleys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Galleys</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Galleys()
	 * @model required="true"
	 * @generated
	 */
	EList<Galley> getGalleys();

	/**
	 * Returns the value of the '<em><b>Stairs</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Stairway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stairs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stairs</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Stairs()
	 * @model
	 * @generated
	 */
	EList<Stairway> getStairs();

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Partition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Partition()
	 * @model
	 * @generated
	 */
	EList<Partition> getPartition();

	/**
	 * Returns the value of the '<em><b>Stowage</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Stowage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stowage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stowage</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Stowage()
	 * @model
	 * @generated
	 */
	EList<Stowage> getStowage();

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
	 * Returns the value of the '<em><b>Total Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Passengers</em>' attribute.
	 * @see #setTotalPassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_TotalPassengers()
	 * @model
	 * @generated
	 */
	int getTotalPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getTotalPassengers <em>Total Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Passengers</em>' attribute.
	 * @see #getTotalPassengers()
	 * @generated
	 */
	void setTotalPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Row Nonexistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row Nonexistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row Nonexistent</em>' attribute.
	 * @see #setRowNonexistent(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_RowNonexistent()
	 * @model
	 * @generated
	 */
	int getRowNonexistent();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getRowNonexistent <em>Row Nonexistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Row Nonexistent</em>' attribute.
	 * @see #getRowNonexistent()
	 * @generated
	 */
	void setRowNonexistent(int value);

	/**
	 * Returns the value of the '<em><b>FCpassengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>FCpassengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FCpassengers</em>' attribute.
	 * @see #setFCpassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_FCpassengers()
	 * @model
	 * @generated
	 */
	int getFCpassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getFCpassengers <em>FCpassengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCpassengers</em>' attribute.
	 * @see #getFCpassengers()
	 * @generated
	 */
	void setFCpassengers(int value);

	/**
	 * Returns the value of the '<em><b>BCpassengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BCpassengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BCpassengers</em>' attribute.
	 * @see #setBCpassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_BCpassengers()
	 * @model
	 * @generated
	 */
	int getBCpassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getBCpassengers <em>BCpassengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCpassengers</em>' attribute.
	 * @see #getBCpassengers()
	 * @generated
	 */
	void setBCpassengers(int value);

	/**
	 * Returns the value of the '<em><b>PE Cpassengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PE Cpassengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PE Cpassengers</em>' attribute.
	 * @see #setPECpassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_PECpassengers()
	 * @model
	 * @generated
	 */
	int getPECpassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getPECpassengers <em>PE Cpassengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PE Cpassengers</em>' attribute.
	 * @see #getPECpassengers()
	 * @generated
	 */
	void setPECpassengers(int value);

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
