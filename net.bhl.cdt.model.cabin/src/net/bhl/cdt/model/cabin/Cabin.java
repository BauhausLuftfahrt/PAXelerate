/**
 */
package net.bhl.cdt.model.cabin;

import net.bhl.cdt.model.NamedElement;
import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInFirstClass <em>Seats In First Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getFirstClassPassengers <em>First Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInFirstClass <em>Seats Per Row In First Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInBusinessClass <em>Seats In Business Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBusinessClassPassengers <em>Business Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInBusinessClass <em>Seats Per Row In Business Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInPremiumEconomyClass <em>Seats In Premium Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPremiumEconomyClassPassengers <em>Premium Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInPremiumEconomyClass <em>Seats Per Row In Premium Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInEconomyClass <em>Seats In Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getEconomyClassPassengers <em>Economy Class Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInEconomyClass <em>Seats Per Row In Economy Class</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getRowNonexistent <em>Row Nonexistent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumbAisles <em>Numb Aisles</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStairways <em>Stairways</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getCurtains <em>Curtains</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStowages <em>Stowages</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getScale <em>Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin()
 * @model
 * @generated
 */
public interface Cabin extends NamedElement {

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
	 * Returns the value of the '<em><b>Stairways</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Stairway}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stairways</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stairways</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Stairways()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stairway> getStairways();

	/**
	 * Returns the value of the '<em><b>Curtains</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Curtain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtains</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Curtains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Curtain> getCurtains();

	/**
	 * Returns the value of the '<em><b>Stowages</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Stowage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stowages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stowages</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Stowages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stowage> getStowages();

	/**
	 * Returns the value of the '<em><b>Seats In Economy Class</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats In Economy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats In Economy Class</em>' attribute.
	 * @see #setSeatsInEconomyClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsInEconomyClass()
	 * @model default="12"
	 * @generated
	 */
	int getSeatsInEconomyClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInEconomyClass <em>Seats In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats In Economy Class</em>' attribute.
	 * @see #getSeatsInEconomyClass()
	 * @generated
	 */
	void setSeatsInEconomyClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats In Premium Economy Class</b></em>' attribute.
	 * The default value is <code>"12"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats In Premium Economy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats In Premium Economy Class</em>' attribute.
	 * @see #setSeatsInPremiumEconomyClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsInPremiumEconomyClass()
	 * @model default="12"
	 * @generated
	 */
	int getSeatsInPremiumEconomyClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInPremiumEconomyClass <em>Seats In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats In Premium Economy Class</em>' attribute.
	 * @see #getSeatsInPremiumEconomyClass()
	 * @generated
	 */
	void setSeatsInPremiumEconomyClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats In Business Class</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats In Business Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats In Business Class</em>' attribute.
	 * @see #setSeatsInBusinessClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsInBusinessClass()
	 * @model default="4"
	 * @generated
	 */
	int getSeatsInBusinessClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInBusinessClass <em>Seats In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats In Business Class</em>' attribute.
	 * @see #getSeatsInBusinessClass()
	 * @generated
	 */
	void setSeatsInBusinessClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats In First Class</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats In First Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats In First Class</em>' attribute.
	 * @see #setSeatsInFirstClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsInFirstClass()
	 * @model default="4"
	 * @generated
	 */
	int getSeatsInFirstClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsInFirstClass <em>Seats In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats In First Class</em>' attribute.
	 * @see #getSeatsInFirstClass()
	 * @generated
	 */
	void setSeatsInFirstClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats Per Row In Economy Class</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats Per Row In Economy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats Per Row In Economy Class</em>' attribute.
	 * @see #setSeatsPerRowInEconomyClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsPerRowInEconomyClass()
	 * @model default="6"
	 * @generated
	 */
	int getSeatsPerRowInEconomyClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInEconomyClass <em>Seats Per Row In Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats Per Row In Economy Class</em>' attribute.
	 * @see #getSeatsPerRowInEconomyClass()
	 * @generated
	 */
	void setSeatsPerRowInEconomyClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats Per Row In Business Class</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats Per Row In Business Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats Per Row In Business Class</em>' attribute.
	 * @see #setSeatsPerRowInBusinessClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsPerRowInBusinessClass()
	 * @model default="4"
	 * @generated
	 */
	int getSeatsPerRowInBusinessClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInBusinessClass <em>Seats Per Row In Business Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats Per Row In Business Class</em>' attribute.
	 * @see #getSeatsPerRowInBusinessClass()
	 * @generated
	 */
	void setSeatsPerRowInBusinessClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats Per Row In First Class</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats Per Row In First Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats Per Row In First Class</em>' attribute.
	 * @see #setSeatsPerRowInFirstClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsPerRowInFirstClass()
	 * @model default="2"
	 * @generated
	 */
	int getSeatsPerRowInFirstClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInFirstClass <em>Seats Per Row In First Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats Per Row In First Class</em>' attribute.
	 * @see #getSeatsPerRowInFirstClass()
	 * @generated
	 */
	void setSeatsPerRowInFirstClass(int value);

	/**
	 * Returns the value of the '<em><b>Seats Per Row In Premium Economy Class</b></em>' attribute.
	 * The default value is <code>"6"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seats Per Row In Premium Economy Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seats Per Row In Premium Economy Class</em>' attribute.
	 * @see #setSeatsPerRowInPremiumEconomyClass(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_SeatsPerRowInPremiumEconomyClass()
	 * @model default="6"
	 * @generated
	 */
	int getSeatsPerRowInPremiumEconomyClass();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getSeatsPerRowInPremiumEconomyClass <em>Seats Per Row In Premium Economy Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seats Per Row In Premium Economy Class</em>' attribute.
	 * @see #getSeatsPerRowInPremiumEconomyClass()
	 * @generated
	 */
	void setSeatsPerRowInPremiumEconomyClass(int value);

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Scale()
	 * @model
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.Passenger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passengers</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passengers</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Passengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Passenger> getPassengers();

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
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Class Passengers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Class Passengers</em>' attribute.
	 * @see #setFirstClassPassengers(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_FirstClassPassengers()
	 * @model default="0"
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
