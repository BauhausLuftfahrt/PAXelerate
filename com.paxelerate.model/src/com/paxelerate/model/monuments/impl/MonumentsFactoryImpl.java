/**
 */
package com.paxelerate.model.monuments.impl;

import com.paxelerate.model.monuments.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonumentsFactoryImpl extends EFactoryImpl implements MonumentsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MonumentsFactory init() {
		try {
			MonumentsFactory theMonumentsFactory = (MonumentsFactory) EPackage.Registry.INSTANCE
					.getEFactory(MonumentsPackage.eNS_URI);
			if (theMonumentsFactory != null) {
				return theMonumentsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MonumentsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonumentsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MonumentsPackage.ROW:
			return createRow();
		case MonumentsPackage.SEAT_GROUP:
			return createSeatGroup();
		case MonumentsPackage.OBSTACLE:
			return createObstacle();
		case MonumentsPackage.SEAT:
			return createSeat();
		case MonumentsPackage.DOOR:
			return createDoor();
		case MonumentsPackage.AISLE:
			return createAisle();
		case MonumentsPackage.OVERHEAD_BIN:
			return createOverheadBin();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Row createRow() {
		RowImpl row = new RowImpl();
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeatGroup createSeatGroup() {
		SeatGroupImpl seatGroup = new SeatGroupImpl();
		return seatGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Obstacle createObstacle() {
		ObstacleImpl obstacle = new ObstacleImpl();
		return obstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Seat createSeat() {
		SeatImpl seat = new SeatImpl();
		return seat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door createDoor() {
		DoorImpl door = new DoorImpl();
		return door;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aisle createAisle() {
		AisleImpl aisle = new AisleImpl();
		return aisle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadBin createOverheadBin() {
		OverheadBinImpl overheadBin = new OverheadBinImpl();
		return overheadBin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonumentsPackage getMonumentsPackage() {
		return (MonumentsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MonumentsPackage getPackage() {
		return MonumentsPackage.eINSTANCE;
	}

} //MonumentsFactoryImpl
