/**
 */
package net.bhl.cdt.paxelerate.model.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import net.bhl.cdt.model.NamedElement;
import net.bhl.cdt.paxelerate.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage
 * @generated
 */
public class CabinSwitch<T> extends Switch<T> {
	
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected static CabinPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CabinSwitch() {
		if (modelPackage == null) {
			modelPackage = CabinPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CabinPackage.CABIN: {
				Cabin cabin = (Cabin)theEObject;
				T result = caseCabin(cabin);
				if (result == null) result = caseNamedElement(cabin);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.ROW: {
				Row row = (Row)theEObject;
				T result = caseRow(row);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.TRAVEL_CLASS: {
				TravelClass travelClass = (TravelClass)theEObject;
				T result = caseTravelClass(travelClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.SEAT: {
				Seat seat = (Seat)theEObject;
				T result = caseSeat(seat);
				if (result == null) result = casePhysicalObject(seat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.PASSENGER: {
				Passenger passenger = (Passenger)theEObject;
				T result = casePassenger(passenger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.CREW_MEMBER: {
				CrewMember crewMember = (CrewMember)theEObject;
				T result = caseCrewMember(crewMember);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.PHYSICAL_OBJECT: {
				PhysicalObject physicalObject = (PhysicalObject)theEObject;
				T result = casePhysicalObject(physicalObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.LAVATORY: {
				Lavatory lavatory = (Lavatory)theEObject;
				T result = caseLavatory(lavatory);
				if (result == null) result = casePhysicalObject(lavatory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.GALLEY: {
				Galley galley = (Galley)theEObject;
				T result = caseGalley(galley);
				if (result == null) result = casePhysicalObject(galley);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.STAIRWAY: {
				Stairway stairway = (Stairway)theEObject;
				T result = caseStairway(stairway);
				if (result == null) result = casePhysicalObject(stairway);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.CURTAIN: {
				Curtain curtain = (Curtain)theEObject;
				T result = caseCurtain(curtain);
				if (result == null) result = casePhysicalObject(curtain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.STOWAGE: {
				Stowage stowage = (Stowage)theEObject;
				T result = caseStowage(stowage);
				if (result == null) result = casePhysicalObject(stowage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.DOOR: {
				Door door = (Door)theEObject;
				T result = caseDoor(door);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.SIMULATION_PROPERTIES: {
				SimulationProperties simulationProperties = (SimulationProperties)theEObject;
				T result = caseSimulationProperties(simulationProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.LUGGAGE_PROPERTIES: {
				LuggageProperties luggageProperties = (LuggageProperties)theEObject;
				T result = caseLuggageProperties(luggageProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.SIMULATION_RESULT: {
				SimulationResult simulationResult = (SimulationResult)theEObject;
				T result = caseSimulationResult(simulationResult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CabinPackage.PASSENGER_PROPERTIES: {
				PassengerProperties passengerProperties = (PassengerProperties)theEObject;
				T result = casePassengerProperties(passengerProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cabin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cabin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCabin(Cabin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRow(Row object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravelClass(TravelClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoor(Door object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeat(Seat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassenger(Passenger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crew Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crew Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCrewMember(CrewMember object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lavatory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lavatory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLavatory(Lavatory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Galley</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Galley</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGalley(Galley object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stairway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stairway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStairway(Stairway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Curtain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Curtain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCurtain(Curtain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stowage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stowage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStowage(Stowage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationProperties(SimulationProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Luggage Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Luggage Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLuggageProperties(LuggageProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationResult(SimulationResult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerProperties(PassengerProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalObject(PhysicalObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CabinSwitch