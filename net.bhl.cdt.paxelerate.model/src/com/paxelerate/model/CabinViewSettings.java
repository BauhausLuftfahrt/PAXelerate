/**
 */
package com.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowSeatlabels <em>Show Seatlabels</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowRowLabels <em>Show Row Labels</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowGalleyAndLavatoryLabels <em>Show Galley And Lavatory Labels</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowCurtains <em>Show Curtains</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowSeats <em>Show Seats</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowGalleys <em>Show Galleys</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowLavatories <em>Show Lavatories</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowDoors <em>Show Doors</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#isShowOccupiedSeats <em>Show Occupied Seats</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#getSizeOfPassengerCircle <em>Size Of Passenger Circle</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#getDoorOffSetInPixels <em>Door Off Set In Pixels</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#getXZeroInPixels <em>XZero In Pixels</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#getYZeroInPixels <em>YZero In Pixels</em>}</li>
 *   <li>{@link com.paxelerate.model.CabinViewSettings#getCabinWidthInPixels <em>Cabin Width In Pixels</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings()
 * @model
 * @generated
 */
public interface CabinViewSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Show Seatlabels</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Seatlabels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Seatlabels</em>' attribute.
	 * @see #setShowSeatlabels(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowSeatlabels()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowSeatlabels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowSeatlabels <em>Show Seatlabels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Seatlabels</em>' attribute.
	 * @see #isShowSeatlabels()
	 * @generated
	 */
	void setShowSeatlabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Row Labels</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Row Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Row Labels</em>' attribute.
	 * @see #setShowRowLabels(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowRowLabels()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowRowLabels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowRowLabels <em>Show Row Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Row Labels</em>' attribute.
	 * @see #isShowRowLabels()
	 * @generated
	 */
	void setShowRowLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Galley And Lavatory Labels</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Galley And Lavatory Labels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Galley And Lavatory Labels</em>' attribute.
	 * @see #setShowGalleyAndLavatoryLabels(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowGalleyAndLavatoryLabels()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowGalleyAndLavatoryLabels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowGalleyAndLavatoryLabels <em>Show Galley And Lavatory Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Galley And Lavatory Labels</em>' attribute.
	 * @see #isShowGalleyAndLavatoryLabels()
	 * @generated
	 */
	void setShowGalleyAndLavatoryLabels(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Curtains</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Curtains</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Curtains</em>' attribute.
	 * @see #setShowCurtains(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowCurtains()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowCurtains();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowCurtains <em>Show Curtains</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Curtains</em>' attribute.
	 * @see #isShowCurtains()
	 * @generated
	 */
	void setShowCurtains(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Seats</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Seats</em>' attribute.
	 * @see #setShowSeats(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowSeats()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowSeats();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowSeats <em>Show Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Seats</em>' attribute.
	 * @see #isShowSeats()
	 * @generated
	 */
	void setShowSeats(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Galleys</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Galleys</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Galleys</em>' attribute.
	 * @see #setShowGalleys(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowGalleys()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowGalleys();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowGalleys <em>Show Galleys</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Galleys</em>' attribute.
	 * @see #isShowGalleys()
	 * @generated
	 */
	void setShowGalleys(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Lavatories</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Lavatories</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Lavatories</em>' attribute.
	 * @see #setShowLavatories(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowLavatories()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowLavatories();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowLavatories <em>Show Lavatories</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Lavatories</em>' attribute.
	 * @see #isShowLavatories()
	 * @generated
	 */
	void setShowLavatories(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Doors</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Doors</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Doors</em>' attribute.
	 * @see #setShowDoors(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowDoors()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowDoors();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowDoors <em>Show Doors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Doors</em>' attribute.
	 * @see #isShowDoors()
	 * @generated
	 */
	void setShowDoors(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Occupied Seats</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Occupied Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Occupied Seats</em>' attribute.
	 * @see #setShowOccupiedSeats(boolean)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_ShowOccupiedSeats()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowOccupiedSeats();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#isShowOccupiedSeats <em>Show Occupied Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Occupied Seats</em>' attribute.
	 * @see #isShowOccupiedSeats()
	 * @generated
	 */
	void setShowOccupiedSeats(boolean value);

	/**
	 * Returns the value of the '<em><b>Size Of Passenger Circle</b></em>' attribute.
	 * The default value is <code>"0.75"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Of Passenger Circle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Of Passenger Circle</em>' attribute.
	 * @see #setSizeOfPassengerCircle(double)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_SizeOfPassengerCircle()
	 * @model default="0.75"
	 * @generated
	 */
	double getSizeOfPassengerCircle();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#getSizeOfPassengerCircle <em>Size Of Passenger Circle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Of Passenger Circle</em>' attribute.
	 * @see #getSizeOfPassengerCircle()
	 * @generated
	 */
	void setSizeOfPassengerCircle(double value);

	/**
	 * Returns the value of the '<em><b>Door Off Set In Pixels</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Door Off Set In Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Off Set In Pixels</em>' attribute.
	 * @see #setDoorOffSetInPixels(int)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_DoorOffSetInPixels()
	 * @model default="2"
	 * @generated
	 */
	int getDoorOffSetInPixels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#getDoorOffSetInPixels <em>Door Off Set In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Off Set In Pixels</em>' attribute.
	 * @see #getDoorOffSetInPixels()
	 * @generated
	 */
	void setDoorOffSetInPixels(int value);

	/**
	 * Returns the value of the '<em><b>XZero In Pixels</b></em>' attribute.
	 * The default value is <code>"138"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XZero In Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XZero In Pixels</em>' attribute.
	 * @see #setXZeroInPixels(int)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_XZeroInPixels()
	 * @model default="138"
	 * @generated
	 */
	int getXZeroInPixels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#getXZeroInPixels <em>XZero In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XZero In Pixels</em>' attribute.
	 * @see #getXZeroInPixels()
	 * @generated
	 */
	void setXZeroInPixels(int value);

	/**
	 * Returns the value of the '<em><b>YZero In Pixels</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YZero In Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YZero In Pixels</em>' attribute.
	 * @see #setYZeroInPixels(int)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_YZeroInPixels()
	 * @model default="90"
	 * @generated
	 */
	int getYZeroInPixels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#getYZeroInPixels <em>YZero In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YZero In Pixels</em>' attribute.
	 * @see #getYZeroInPixels()
	 * @generated
	 */
	void setYZeroInPixels(int value);

	/**
	 * Returns the value of the '<em><b>Cabin Width In Pixels</b></em>' attribute.
	 * The default value is <code>"96"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cabin Width In Pixels</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cabin Width In Pixels</em>' attribute.
	 * @see #setCabinWidthInPixels(int)
	 * @see com.paxelerate.model.CabinPackage#getCabinViewSettings_CabinWidthInPixels()
	 * @model default="96"
	 * @generated
	 */
	int getCabinWidthInPixels();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.CabinViewSettings#getCabinWidthInPixels <em>Cabin Width In Pixels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cabin Width In Pixels</em>' attribute.
	 * @see #getCabinWidthInPixels()
	 * @generated
	 */
	void setCabinWidthInPixels(int value);

} // CabinViewSettings
