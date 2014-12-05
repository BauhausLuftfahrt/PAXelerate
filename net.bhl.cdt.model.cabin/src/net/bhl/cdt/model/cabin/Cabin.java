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
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getRowNonexistent <em>Row Nonexistent</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getAisleWidth <em>Aisle Width</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getFramesPerSecond <em>Frames Per Second</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getNumberOfDecks <em>Number Of Decks</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getFirstClasses <em>First Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBusinessClasses <em>Business Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getEconomyClasses <em>Economy Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPremiumEconomyClasses <em>Premium Economy Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getClasses <em>Classes</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getDoors <em>Doors</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getLavatories <em>Lavatories</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getGalleys <em>Galleys</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStairways <em>Stairways</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getCurtains <em>Curtains</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getStowages <em>Stowages</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getPassengers <em>Passengers</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getScale <em>Scale</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Cabin#getBoardingTime <em>Boarding Time</em>}</li>
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
	 * The default value is <code>"2411.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Length</em>' attribute.
	 * @see #setCabinLength(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_CabinLength()
	 * @model default="2411.5"
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
	 * The default value is <code>"364"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Width</em>' attribute.
	 * @see #setCabinWidth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_CabinWidth()
	 * @model default="364"
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
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Scale()
	 * @model default="4"
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
	 * Returns the value of the '<em><b>Frames Per Second</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames Per Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames Per Second</em>' attribute.
	 * @see #setFramesPerSecond(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_FramesPerSecond()
	 * @model default="5"
	 * @generated
	 */
	int getFramesPerSecond();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Cabin#getFramesPerSecond <em>Frames Per Second</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frames Per Second</em>' attribute.
	 * @see #getFramesPerSecond()
	 * @generated
	 */
	void setFramesPerSecond(int value);

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
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Decks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Decks</em>' attribute.
	 * @see #setNumberOfDecks(int)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_NumberOfDecks()
	 * @model default="1"
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
	 * Returns the value of the '<em><b>First Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.FirstClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Classes</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_FirstClasses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FirstClass> getFirstClasses();

	/**
	 * Returns the value of the '<em><b>Business Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.BusinessClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Business Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Classes</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_BusinessClasses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BusinessClass> getBusinessClasses();

	/**
	 * Returns the value of the '<em><b>Economy Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.EconomyClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Economy Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Economy Classes</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_EconomyClasses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EconomyClass> getEconomyClasses();

	/**
	 * Returns the value of the '<em><b>Premium Economy Classes</b></em>' containment reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.PremiumEconomyClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Premium Economy Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premium Economy Classes</em>' containment reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_PremiumEconomyClasses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PremiumEconomyClass> getPremiumEconomyClasses();

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
	 * Returns the value of the '<em><b>Classes</b></em>' reference list.
	 * The list contents are of type {@link net.bhl.cdt.model.cabin.TravelClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' reference list.
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_Classes()
	 * @model required="true"
	 * @generated
	 */
	EList<TravelClass> getClasses();

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
	 * Returns the value of the '<em><b>Aisle Width</b></em>' attribute.
	 * The default value is <code>"64"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aisle Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aisle Width</em>' attribute.
	 * @see #setAisleWidth(double)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCabin_AisleWidth()
	 * @model default="64"
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
