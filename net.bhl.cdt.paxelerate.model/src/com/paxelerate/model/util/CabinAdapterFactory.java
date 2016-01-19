/**
 */
package com.paxelerate.model.util;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import com.paxelerate.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.CabinPackage
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
			public Adapter caseTravelClass(TravelClass object) {
				return createTravelClassAdapter();
			}
			@Override
			public Adapter caseBusinessClass(BusinessClass object) {
				return createBusinessClassAdapter();
			}
			@Override
			public Adapter caseFirstClass(FirstClass object) {
				return createFirstClassAdapter();
			}
			@Override
			public Adapter caseEconomyClass(EconomyClass object) {
				return createEconomyClassAdapter();
			}
			@Override
			public Adapter casePremiumEconomyClass(PremiumEconomyClass object) {
				return createPremiumEconomyClassAdapter();
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
			public Adapter caseCrewMember(CrewMember object) {
				return createCrewMemberAdapter();
			}
			@Override
			public Adapter casePhysicalObject(PhysicalObject object) {
				return createPhysicalObjectAdapter();
			}
			@Override
			public Adapter caseLavatory(Lavatory object) {
				return createLavatoryAdapter();
			}
			@Override
			public Adapter caseGalley(Galley object) {
				return createGalleyAdapter();
			}
			@Override
			public Adapter caseStairway(Stairway object) {
				return createStairwayAdapter();
			}
			@Override
			public Adapter caseCurtain(Curtain object) {
				return createCurtainAdapter();
			}
			@Override
			public Adapter caseStowage(Stowage object) {
				return createStowageAdapter();
			}
			@Override
			public Adapter caseDoor(Door object) {
				return createDoorAdapter();
			}
			@Override
			public Adapter caseMainDoor(MainDoor object) {
				return createMainDoorAdapter();
			}
			@Override
			public Adapter caseEmergencyExit(EmergencyExit object) {
				return createEmergencyExitAdapter();
			}
			@Override
			public Adapter caseStandardDoor(StandardDoor object) {
				return createStandardDoorAdapter();
			}
			@Override
			public Adapter caseSimulationProperties(SimulationProperties object) {
				return createSimulationPropertiesAdapter();
			}
			@Override
			public Adapter caseSimulationResult(SimulationResult object) {
				return createSimulationResultAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Cabin <em>Cabin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Cabin
	 * @generated
	 */
	public Adapter createCabinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.TravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.TravelClass
	 * @generated
	 */
	public Adapter createTravelClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.BusinessClass <em>Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.BusinessClass
	 * @generated
	 */
	public Adapter createBusinessClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.FirstClass <em>First Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.FirstClass
	 * @generated
	 */
	public Adapter createFirstClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.EconomyClass <em>Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.EconomyClass
	 * @generated
	 */
	public Adapter createEconomyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.PremiumEconomyClass <em>Premium Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.PremiumEconomyClass
	 * @generated
	 */
	public Adapter createPremiumEconomyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Seat
	 * @generated
	 */
	public Adapter createSeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Passenger
	 * @generated
	 */
	public Adapter createPassengerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.CrewMember <em>Crew Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.CrewMember
	 * @generated
	 */
	public Adapter createCrewMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Lavatory <em>Lavatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Lavatory
	 * @generated
	 */
	public Adapter createLavatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Galley
	 * @generated
	 */
	public Adapter createGalleyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Stairway <em>Stairway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Stairway
	 * @generated
	 */
	public Adapter createStairwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Curtain <em>Curtain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Curtain
	 * @generated
	 */
	public Adapter createCurtainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.Stowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.Stowage
	 * @generated
	 */
	public Adapter createStowageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.MainDoor <em>Main Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.MainDoor
	 * @generated
	 */
	public Adapter createMainDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.EmergencyExit <em>Emergency Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.EmergencyExit
	 * @generated
	 */
	public Adapter createEmergencyExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.StandardDoor <em>Standard Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.StandardDoor
	 * @generated
	 */
	public Adapter createStandardDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.SimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.SimulationProperties
	 * @generated
	 */
	public Adapter createSimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.SimulationResult <em>Simulation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.SimulationResult
	 * @generated
	 */
	public Adapter createSimulationResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.paxelerate.model.PhysicalObject <em>Physical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.paxelerate.model.PhysicalObject
	 * @generated
	 */
	public Adapter createPhysicalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.bhl.cdt.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.bhl.cdt.model.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
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
