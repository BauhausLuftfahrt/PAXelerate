/**
 */
package net.bhl.cdt.paxelerate.model;

import org.eclipse.emf.common.util.EList;

import net.bhl.cdt.model.NamedElement;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Cabin</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getCabinLength
 * <em>Cabin Length</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getCabinWidth
 * <em>Cabin Width</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getRowNonexistent
 * <em>Row Nonexistent</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getAisleWidth
 * <em>Aisle Width</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getFramesPerSecond
 * <em>Frames Per Second</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getNumberOfDecks
 * <em>Number Of Decks</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getSimulationSettings
 * <em>Simulation Settings</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getClasses <em>Classes</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getDoors <em>Doors</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getLavatories
 * <em>Lavatories</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getGalleys <em>Galleys</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getStairways <em>Stairways</em>
 * }</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getCurtains <em>Curtains</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getStowages <em>Stowages</em>}
 * </li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getPassengers
 * <em>Passengers</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getScale <em>Scale</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getAircraftType
 * <em>Aircraft Type</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#isUsePresetSettings
 * <em>Use Preset Settings</em>}</li>
 * <li>{@link net.bhl.cdt.paxelerate.model.Cabin#getSpeedFactor
 * <em>Speed Factor</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin()
 * @model
 * @generated
 */
public interface Cabin extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Cabin Length</b></em>' attribute. The
	 * default value is <code>"2412"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cabin Length</em>' attribute.
	 * @see #setCabinLength(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_CabinLength()
	 * @model default="2412"
	 * @generated
	 */
	int getCabinLength();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getCabinLength
	 * <em>Cabin Length</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cabin Length</em>' attribute.
	 * @see #getCabinLength()
	 * @generated
	 */
	void setCabinLength(int value);

	/**
	 * Returns the value of the '<em><b>Cabin Width</b></em>' attribute. The
	 * default value is <code>"364"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cabin Width</em>' attribute.
	 * @see #setCabinWidth(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_CabinWidth()
	 * @model default="364"
	 * @generated
	 */
	int getCabinWidth();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getCabinWidth
	 * <em>Cabin Width</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cabin Width</em>' attribute.
	 * @see #getCabinWidth()
	 * @generated
	 */
	void setCabinWidth(int value);

	/**
	 * Returns the value of the '<em><b>Doors</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Door}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doors</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Doors</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Doors()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Door> getDoors();

	/**
	 * Returns the value of the '<em><b>Lavatories</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Lavatory}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lavatories</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Lavatories</em>' containment reference
	 *         list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Lavatories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Lavatory> getLavatories();

	/**
	 * Returns the value of the '<em><b>Galleys</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Galley}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Galleys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Galleys</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Galleys()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Galley> getGalleys();

	/**
	 * Returns the value of the '<em><b>Stairways</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Stairway}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stairways</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stairways</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Stairways()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stairway> getStairways();

	/**
	 * Returns the value of the '<em><b>Curtains</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Curtain}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtains</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Curtains</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Curtains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Curtain> getCurtains();

	/**
	 * Returns the value of the '<em><b>Stowages</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Stowage}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stowages</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Stowages</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Stowages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stowage> getStowages();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute. The default
	 * value is <code>"10"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Scale()
	 * @model default="10"
	 * @generated
	 */
	int getScale();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.paxelerate.model.Cabin#getScale
	 * <em>Scale</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(int value);

	/**
	 * Returns the value of the '<em><b>Frames Per Second</b></em>' attribute.
	 * The default value is <code>"5"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames Per Second</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Frames Per Second</em>' attribute.
	 * @see #setFramesPerSecond(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_FramesPerSecond()
	 * @model default="5"
	 * @generated
	 */
	int getFramesPerSecond();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getFramesPerSecond
	 * <em>Frames Per Second</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Frames Per Second</em>' attribute.
	 * @see #getFramesPerSecond()
	 * @generated
	 */
	void setFramesPerSecond(int value);

	/**
	 * Returns the value of the '<em><b>Passengers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.Passenger}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passengers</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Passengers</em>' containment reference
	 *         list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Passengers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Passenger> getPassengers();

	/**
	 * Returns the value of the '<em><b>Number Of Decks</b></em>' attribute. The
	 * default value is <code>"1"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Decks</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Number Of Decks</em>' attribute.
	 * @see #setNumberOfDecks(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_NumberOfDecks()
	 * @model default="1"
	 * @generated
	 */
	int getNumberOfDecks();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getNumberOfDecks
	 * <em>Number Of Decks</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Number Of Decks</em>' attribute.
	 * @see #getNumberOfDecks()
	 * @generated
	 */
	void setNumberOfDecks(int value);

	/**
	 * Returns the value of the '<em><b>Aircraft Type</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link net.bhl.cdt.paxelerate.model.AircraftType}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Aircraft Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aircraft Type</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.AircraftType
	 * @see #setAircraftType(AircraftType)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_AircraftType()
	 * @model
	 * @generated
	 */
	AircraftType getAircraftType();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getAircraftType
	 * <em>Aircraft Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Aircraft Type</em>' attribute.
	 * @see net.bhl.cdt.paxelerate.model.AircraftType
	 * @see #getAircraftType()
	 * @generated
	 */
	void setAircraftType(AircraftType value);

	/**
	 * Returns the value of the '<em><b>Use Preset Settings</b></em>' attribute.
	 * The default value is <code>"false"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Preset Settings</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Use Preset Settings</em>' attribute.
	 * @see #setUsePresetSettings(boolean)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_UsePresetSettings()
	 * @model default="false"
	 * @generated
	 */
	boolean isUsePresetSettings();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#isUsePresetSettings
	 * <em>Use Preset Settings</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Use Preset Settings</em>' attribute.
	 * @see #isUsePresetSettings()
	 * @generated
	 */
	void setUsePresetSettings(boolean value);

	/**
	 * Returns the value of the '<em><b>Speed Factor</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Speed Factor</em>' attribute.
	 * @see #setSpeedFactor(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_SpeedFactor()
	 * @model
	 * @generated
	 */
	int getSpeedFactor();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getSpeedFactor
	 * <em>Speed Factor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Speed Factor</em>' attribute.
	 * @see #getSpeedFactor()
	 * @generated
	 */
	void setSpeedFactor(int value);

	/**
	 * Returns the value of the '<em><b>Simulation Settings</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simulation Settings</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Simulation Settings</em>' reference.
	 * @see #setSimulationSettings(SimulationProperties)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_SimulationSettings()
	 * @model required="true"
	 * @generated
	 */
	SimulationProperties getSimulationSettings();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getSimulationSettings
	 * <em>Simulation Settings</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Simulation Settings</em>' reference.
	 * @see #getSimulationSettings()
	 * @generated
	 */
	void setSimulationSettings(SimulationProperties value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link net.bhl.cdt.paxelerate.model.TravelClass}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_Classes()
	 * @model containment="true" required="true"
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
	 * 
	 * @return the value of the '<em>Row Nonexistent</em>' attribute.
	 * @see #setRowNonexistent(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_RowNonexistent()
	 * @model
	 * @generated
	 */
	int getRowNonexistent();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getRowNonexistent
	 * <em>Row Nonexistent</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Row Nonexistent</em>' attribute.
	 * @see #getRowNonexistent()
	 * @generated
	 */
	void setRowNonexistent(int value);

	/**
	 * Returns the value of the '<em><b>Aisle Width</b></em>' attribute. The
	 * default value is <code>"64"</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aisle Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Aisle Width</em>' attribute.
	 * @see #setAisleWidth(int)
	 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getCabin_AisleWidth()
	 * @model default="64"
	 * @generated
	 */
	int getAisleWidth();

	/**
	 * Sets the value of the '
	 * {@link net.bhl.cdt.paxelerate.model.Cabin#getAisleWidth
	 * <em>Aisle Width</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Aisle Width</em>' attribute.
	 * @see #getAisleWidth()
	 * @generated
	 */
	void setAisleWidth(int value);
} // Cabin
