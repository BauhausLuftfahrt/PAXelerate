/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.cabin.CabinPackage
 * @generated
 */
public interface CabinFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CabinFactory eINSTANCE = net.bhl.cdt.model.cabin.impl.CabinFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cabin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cabin</em>'.
	 * @generated
	 */
	Cabin createCabin();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Passenger Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger Class</em>'.
	 * @generated
	 */
	PassengerClass createPassengerClass();

	/**
	 * Returns a new object of class '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door</em>'.
	 * @generated
	 */
	Door createDoor();

	/**
	 * Returns a new object of class '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seat</em>'.
	 * @generated
	 */
	Seat createSeat();

	/**
	 * Returns a new object of class '<em>Passenger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Passenger</em>'.
	 * @generated
	 */
	Passenger createPassenger();

	/**
	 * Returns a new object of class '<em>Crew Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crew Member</em>'.
	 * @generated
	 */
	CrewMember createCrewMember();

	/**
	 * Returns a new object of class '<em>Lavatory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lavatory</em>'.
	 * @generated
	 */
	Lavatory createLavatory();

	/**
	 * Returns a new object of class '<em>Galley</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Galley</em>'.
	 * @generated
	 */
	Galley createGalley();

	/**
	 * Returns a new object of class '<em>Stairway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stairway</em>'.
	 * @generated
	 */
	Stairway createStairway();

	/**
	 * Returns a new object of class '<em>Curtain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Curtain</em>'.
	 * @generated
	 */
	Curtain createCurtain();

	/**
	 * Returns a new object of class '<em>Stowage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stowage</em>'.
	 * @generated
	 */
	Stowage createStowage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CabinPackage getCabinPackage();

} //CabinFactory
