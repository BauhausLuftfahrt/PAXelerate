/**
 */
package net.bhl.cdt.model.cabin.util;

import net.bhl.cdt.model.cabin.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.model.cabin.CabinPackage
 * @generated
 */
public class CabinAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CabinPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabinAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CabinPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CabinSwitch<Adapter> modelSwitch =
		new CabinSwitch<Adapter>() {
			@Override
			public Adapter caseCabin(Cabin object) {
				return createCabinAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter casePassengerClass(PassengerClass object) {
				return createPassengerClassAdapter();
			}
			@Override
			public Adapter caseCabinDoors(CabinDoors object) {
				return createCabinDoorsAdapter();
			}
			@Override
			public Adapter caseSeat(Seat object) {
				return createSeatAdapter();
			}
			@Override
			public Adapter casePassenger(Passenger object) {
				return createPassengerAdapter();
			}
			@Override
			public Adapter caseEmergencyExits(EmergencyExits object) {
				return createEmergencyExitsAdapter();
			}
			@Override
			public Adapter caseToilet(Toilet object) {
				return createToiletAdapter();
			}
			@Override
			public Adapter caseGalley(Galley object) {
				return createGalleyAdapter();
			}
			@Override
			public Adapter caseCrewSeat(CrewSeat object) {
				return createCrewSeatAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.Cabin <em>Cabin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.Cabin
	 * @generated
	 */
	public Adapter createCabinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.PassengerClass <em>Passenger Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.PassengerClass
	 * @generated
	 */
	public Adapter createPassengerClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.CabinDoors <em>Doors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.CabinDoors
	 * @generated
	 */
	public Adapter createCabinDoorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.Seat
	 * @generated
	 */
	public Adapter createSeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.Passenger
	 * @generated
	 */
	public Adapter createPassengerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.EmergencyExits <em>Emergency Exits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.EmergencyExits
	 * @generated
	 */
	public Adapter createEmergencyExitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.Toilet <em>Toilet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.Toilet
	 * @generated
	 */
	public Adapter createToiletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.Galley
	 * @generated
	 */
	public Adapter createGalleyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.cabin.CrewSeat <em>Crew Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.cabin.CrewSeat
	 * @generated
	 */
	public Adapter createCrewSeatAdapter() {
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

} //CabinAdapterFactory
