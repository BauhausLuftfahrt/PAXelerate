/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boarding Time Per Door Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.BoardingTimePerDoorType#getTime <em>Time</em>}</li>
 *   <li>{@link paxelerate.BoardingTimePerDoorType#getDoorUID <em>Door UID</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getBoardingTimePerDoorType()
 * @model extendedMetaData="name='boardingTimePerDoorType' kind='elementOnly'"
 * @generated
 */
public interface BoardingTimePerDoorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #isSetTime()
	 * @see #unsetTime()
	 * @see #setTime(double)
	 * @see paxelerate.PaxeleratePackage#getBoardingTimePerDoorType_Time()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	double getTime();

	/**
	 * Sets the value of the '{@link paxelerate.BoardingTimePerDoorType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #isSetTime()
	 * @see #unsetTime()
	 * @see #getTime()
	 * @generated
	 */
	void setTime(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.BoardingTimePerDoorType#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTime()
	 * @see #getTime()
	 * @see #setTime(double)
	 * @generated
	 */
	void unsetTime();

	/**
	 * Returns whether the value of the '{@link paxelerate.BoardingTimePerDoorType#getTime <em>Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Time</em>' attribute is set.
	 * @see #unsetTime()
	 * @see #getTime()
	 * @see #setTime(double)
	 * @generated
	 */
	boolean isSetTime();

	/**
	 * Returns the value of the '<em><b>Door UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door UID</em>' attribute.
	 * @see #setDoorUID(String)
	 * @see paxelerate.PaxeleratePackage#getBoardingTimePerDoorType_DoorUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='doorUID'"
	 * @generated
	 */
	String getDoorUID();

	/**
	 * Sets the value of the '{@link paxelerate.BoardingTimePerDoorType#getDoorUID <em>Door UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door UID</em>' attribute.
	 * @see #getDoorUID()
	 * @generated
	 */
	void setDoorUID(String value);

} // BoardingTimePerDoorType
