/**
 */
package com.paxelerate.model.monuments.util;

import com.paxelerate.model.monuments.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.monuments.MonumentsPackage
 * @generated
 */
public class MonumentsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MonumentsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonumentsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MonumentsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MonumentsSwitch<Adapter> modelSwitch = new MonumentsSwitch<Adapter>() {
		@Override
		public Adapter caseRow(Row object) {
			return createRowAdapter();
		}

		@Override
		public Adapter caseMonument(Monument object) {
			return createMonumentAdapter();
		}

		@Override
		public Adapter caseSeatGroup(SeatGroup object) {
			return createSeatGroupAdapter();
		}

		@Override
		public Adapter caseObstacle(Obstacle object) {
			return createObstacleAdapter();
		}

		@Override
		public Adapter caseSeat(Seat object) {
			return createSeatAdapter();
		}

		@Override
		public Adapter caseDoor(Door object) {
			return createDoorAdapter();
		}

		@Override
		public Adapter caseAisle(Aisle object) {
			return createAisleAdapter();
		}

		@Override
		public Adapter caseOverheadBin(OverheadBin object) {
			return createOverheadBinAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.Monument <em>Monument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.Monument
	 * @generated
	 */
	public Adapter createMonumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.SeatGroup <em>Seat Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.SeatGroup
	 * @generated
	 */
	public Adapter createSeatGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.Obstacle <em>Obstacle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.Obstacle
	 * @generated
	 */
	public Adapter createObstacleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.Seat
	 * @generated
	 */
	public Adapter createSeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.Aisle <em>Aisle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.Aisle
	 * @generated
	 */
	public Adapter createAisleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.monuments.OverheadBin <em>Overhead Bin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.monuments.OverheadBin
	 * @generated
	 */
	public Adapter createOverheadBinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MonumentsAdapterFactory
