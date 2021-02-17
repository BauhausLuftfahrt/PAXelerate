/**
 */
package com.paxelerate.model.monuments;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.monuments.MonumentsPackage
 * @generated
 */
public interface MonumentsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonumentsFactory eINSTANCE = com.paxelerate.model.monuments.impl.MonumentsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Seat Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seat Group</em>'.
	 * @generated
	 */
	SeatGroup createSeatGroup();

	/**
	 * Returns a new object of class '<em>Obstacle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obstacle</em>'.
	 * @generated
	 */
	Obstacle createObstacle();

	/**
	 * Returns a new object of class '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Seat</em>'.
	 * @generated
	 */
	Seat createSeat();

	/**
	 * Returns a new object of class '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Door</em>'.
	 * @generated
	 */
	Door createDoor();

	/**
	 * Returns a new object of class '<em>Aisle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aisle</em>'.
	 * @generated
	 */
	Aisle createAisle();

	/**
	 * Returns a new object of class '<em>Overhead Bin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overhead Bin</em>'.
	 * @generated
	 */
	OverheadBin createOverheadBin();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MonumentsPackage getMonumentsPackage();

} //MonumentsFactory
