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
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getRowNonexistent <em>Row Nonexistent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getTotalPassengers <em>Total Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getFirstClassPassengers <em>First Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBusinessClassPassengers <em>Business Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getEconomyClassPassengers <em>Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumbAisles <em>Numb Aisles</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRow <em>Seats Per Row</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStairs <em>Stairs</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getCurtain <em>Curtain</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStowage <em>Stowage</em>}</li>
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
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Door}.
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
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Lavatories</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Lavatory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lavatories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lavatories</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Lavatories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Lavatory> getLavatories();

	/**
	 * Returns the value of the '<em><b>Galleys</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Galley}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Galleys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Galleys</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Galleys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Galley> getGalleys();

	/**
	 * Returns the value of the '<em><b>Stairs</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Stairway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stairs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stairs</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Stairs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stairway> getStairs();

	/**
	 * Returns the value of the '<em><b>Curtain</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Curtain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtain</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Curtain()
	 * @model containment="true"
	 * @generated
	 */
	EList<Curtain> getCurtain();

	/**
	 * Returns the value of the '<em><b>Stowage</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Stowage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stowage</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stowage</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Stowage()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stowage> getStowage();

	/**
	 * Returns the value of the '<em><b>Number Of Decks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Decks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Decks</em>' attribute.
	 * @see #setNumberOfDecks(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_NumberOfDecks()
	 * @model
	 * @generated
	 */
	int getNumberOfDecks();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getNumberOfDecks <em>Number Of Decks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Decks</em>' attribute.
	 * @see #getNumberOfDecks()
	 * @generated
	 */
	void setNumberOfDecks(int value);

	/**
	 * Returns the value of the '<em><b>Seats Per Row</b></em>' attribute.
	 * The literals are from the enumeration {@link net.bhl.cdt.model.cabin.SeatsPerRow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats Per Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats Per Row</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.SeatsPerRow
	 * @see #setSeatsPerRow(SeatsPerRow)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsPerRow()
	 * @model
	 * @generated
	 */
	SeatsPerRow getSeatsPerRow();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRow <em>Seats Per Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats Per Row</em>' attribute.
	 * @see net.bhl.cdt.model.cabin.SeatsPerRow
	 * @see #getSeatsPerRow()
	 * @generated
	 */
	void setSeatsPerRow(SeatsPerRow value);

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
	 * Returns the value of the '<em><b>First Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Class Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Class Passengers</em>' attribute.
	 * @see #setFirstClassPassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_FirstClassPassengers()
	 * @model
	 * @generated
	 */
	int getFirstClassPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getFirstClassPassengers <em>First Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Class Passengers</em>' attribute.
	 * @see #getFirstClassPassengers()
	 * @generated
	 */
	void setFirstClassPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Business Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Class Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Class Passengers</em>' attribute.
	 * @see #setBusinessClassPassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_BusinessClassPassengers()
	 * @model
	 * @generated
	 */
	int getBusinessClassPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getBusinessClassPassengers <em>Business Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Business Class Passengers</em>' attribute.
	 * @see #getBusinessClassPassengers()
	 * @generated
	 */
	void setBusinessClassPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Premium Economy Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Premium Economy Class Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premium Economy Class Passengers</em>' attribute.
	 * @see #setPremiumEconomyClassPassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_PremiumEconomyClassPassengers()
	 * @model
	 * @generated
	 */
	int getPremiumEconomyClassPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premium Economy Class Passengers</em>' attribute.
	 * @see #getPremiumEconomyClassPassengers()
	 * @generated
	 */
	void setPremiumEconomyClassPassengers(int value);

	/**
	 * Returns the value of the '<em><b>Economy Class Passengers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economy Class Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economy Class Passengers</em>' attribute.
	 * @see #setEconomyClassPassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_EconomyClassPassengers()
	 * @model
	 * @generated
	 */
	int getEconomyClassPassengers();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getEconomyClassPassengers <em>Economy Class Passengers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Economy Class Passengers</em>' attribute.
	 * @see #getEconomyClassPassengers()
	 * @generated
	 */
	void setEconomyClassPassengers(int value);

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

	/**
	 * Returns the value of the '<em><b>Aisle Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aisle Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisle Width</em>' attribute.
	 * @see #setAisleWidth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_AisleWidth()
	 * @model
	 * @generated
	 */
	double getAisleWidth();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getAisleWidth <em>Aisle Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aisle Width</em>' attribute.
	 * @see #getAisleWidth()
	 * @generated
	 */
	void setAisleWidth(double value);
} // Cabin
