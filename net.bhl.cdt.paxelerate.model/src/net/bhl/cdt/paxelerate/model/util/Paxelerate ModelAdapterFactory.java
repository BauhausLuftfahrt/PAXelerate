/**
 */
package model.util;

import model.*;

import net.bhl.cdt.model.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see model.Paxelerate ModelPackage
 * @generated
 */
public class Paxelerate ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Paxelerate ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paxelerate ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Paxelerate ModelPackage.eINSTANCE;
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
	protected Paxelerate ModelSwitch<Adapter> modelSwitch =
		new Paxelerate ModelSwitch<Adapter>() {
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
	 * Creates a new adapter for an object of class '{@link model.Cabin <em>Cabin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Cabin
	 * @generated
	 */
	public Adapter createCabinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.TravelClass <em>Travel Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.TravelClass
	 * @generated
	 */
	public Adapter createTravelClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.BusinessClass <em>Business Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.BusinessClass
	 * @generated
	 */
	public Adapter createBusinessClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.FirstClass <em>First Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.FirstClass
	 * @generated
	 */
	public Adapter createFirstClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EconomyClass <em>Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EconomyClass
	 * @generated
	 */
	public Adapter createEconomyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PremiumEconomyClass <em>Premium Economy Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PremiumEconomyClass
	 * @generated
	 */
	public Adapter createPremiumEconomyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Seat <em>Seat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Seat
	 * @generated
	 */
	public Adapter createSeatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Passenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Passenger
	 * @generated
	 */
	public Adapter createPassengerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.CrewMember <em>Crew Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.CrewMember
	 * @generated
	 */
	public Adapter createCrewMemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.PhysicalObject <em>Physical Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.PhysicalObject
	 * @generated
	 */
	public Adapter createPhysicalObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Lavatory <em>Lavatory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Lavatory
	 * @generated
	 */
	public Adapter createLavatoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Galley <em>Galley</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Galley
	 * @generated
	 */
	public Adapter createGalleyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Stairway <em>Stairway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Stairway
	 * @generated
	 */
	public Adapter createStairwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Curtain <em>Curtain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Curtain
	 * @generated
	 */
	public Adapter createCurtainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Stowage <em>Stowage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Stowage
	 * @generated
	 */
	public Adapter createStowageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.Door
	 * @generated
	 */
	public Adapter createDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.MainDoor <em>Main Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.MainDoor
	 * @generated
	 */
	public Adapter createMainDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.EmergencyExit <em>Emergency Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.EmergencyExit
	 * @generated
	 */
	public Adapter createEmergencyExitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.StandardDoor <em>Standard Door</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.StandardDoor
	 * @generated
	 */
	public Adapter createStandardDoorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SimulationProperties <em>Simulation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SimulationProperties
	 * @generated
	 */
	public Adapter createSimulationPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link model.SimulationResult <em>Simulation Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see model.SimulationResult
	 * @generated
	 */
	public Adapter createSimulationResultAdapter() {
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

} //Paxelerate ModelAdapterFactory
