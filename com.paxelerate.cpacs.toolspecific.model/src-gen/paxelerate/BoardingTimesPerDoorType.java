/**
 */
package paxelerate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boarding Times Per Door Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.BoardingTimesPerDoorType#getBoardingTimePerDoor <em>Boarding Time Per Door</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getBoardingTimesPerDoorType()
 * @model extendedMetaData="name='boardingTimesPerDoorType' kind='elementOnly'"
 * @generated
 */
public interface BoardingTimesPerDoorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Boarding Time Per Door</b></em>' containment reference list.
	 * The list contents are of type {@link paxelerate.BoardingTimePerDoorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boarding Time Per Door</em>' containment reference list.
	 * @see paxelerate.PaxeleratePackage#getBoardingTimesPerDoorType_BoardingTimePerDoor()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='boardingTimePerDoor' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<BoardingTimePerDoorType> getBoardingTimePerDoor();

} // BoardingTimesPerDoorType
