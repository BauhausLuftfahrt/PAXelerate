/**
 */
package toolspecific.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import toolspecific.*;

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
 * @see toolspecific.ToolspecificPackage
 * @generated
 */
public class ToolspecificSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToolspecificPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolspecificSwitch() {
		if (modelPackage == null) {
			modelPackage = ToolspecificPackage.eINSTANCE;
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
		case ToolspecificPackage.BOOLEAN_BASE_TYPE: {
			BooleanBaseType booleanBaseType = (BooleanBaseType) theEObject;
			T result = caseBooleanBaseType(booleanBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.COMPLEX_BASE_TYPE: {
			ComplexBaseType complexBaseType = (ComplexBaseType) theEObject;
			T result = caseComplexBaseType(complexBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.DATE_BASE_TYPE: {
			DateBaseType dateBaseType = (DateBaseType) theEObject;
			T result = caseDateBaseType(dateBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.DATE_TIME_BASE_TYPE: {
			DateTimeBaseType dateTimeBaseType = (DateTimeBaseType) theEObject;
			T result = caseDateTimeBaseType(dateTimeBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.DOCUMENT_ROOT: {
			DocumentRoot documentRoot = (DocumentRoot) theEObject;
			T result = caseDocumentRoot(documentRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.DOOR_SELECTION_TYPE: {
			DoorSelectionType doorSelectionType = (DoorSelectionType) theEObject;
			T result = caseDoorSelectionType(doorSelectionType);
			if (result == null)
				result = caseStringBaseType(doorSelectionType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.DOUBLE_BASE_TYPE: {
			DoubleBaseType doubleBaseType = (DoubleBaseType) theEObject;
			T result = caseDoubleBaseType(doubleBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.DOUBLE_CONSTRAINT_BASE_TYPE: {
			DoubleConstraintBaseType doubleConstraintBaseType = (DoubleConstraintBaseType) theEObject;
			T result = caseDoubleConstraintBaseType(doubleConstraintBaseType);
			if (result == null)
				result = caseDoubleBaseType(doubleConstraintBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.INTEGER_BASE_TYPE: {
			IntegerBaseType integerBaseType = (IntegerBaseType) theEObject;
			T result = caseIntegerBaseType(integerBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.PASSENGER_SORTING_SCHEME_TYPE: {
			PassengerSortingSchemeType passengerSortingSchemeType = (PassengerSortingSchemeType) theEObject;
			T result = casePassengerSortingSchemeType(passengerSortingSchemeType);
			if (result == null)
				result = caseStringBaseType(passengerSortingSchemeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE: {
			PaxelerateInputType paxelerateInputType = (PaxelerateInputType) theEObject;
			T result = casePaxelerateInputType(paxelerateInputType);
			if (result == null)
				result = caseComplexBaseType(paxelerateInputType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.PAXELERATE_TYPE: {
			PaxelerateType paxelerateType = (PaxelerateType) theEObject;
			T result = casePaxelerateType(paxelerateType);
			if (result == null)
				result = caseComplexBaseType(paxelerateType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.SEAT_TYPE_TYPE: {
			SeatTypeType seatTypeType = (SeatTypeType) theEObject;
			T result = caseSeatTypeType(seatTypeType);
			if (result == null)
				result = caseStringBaseType(seatTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.SIMULATION_TYPE_TYPE: {
			SimulationTypeType simulationTypeType = (SimulationTypeType) theEObject;
			T result = caseSimulationTypeType(simulationTypeType);
			if (result == null)
				result = caseStringBaseType(simulationTypeType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.STRING_ARRAY_BASE_TYPE: {
			StringArrayBaseType stringArrayBaseType = (StringArrayBaseType) theEObject;
			T result = caseStringArrayBaseType(stringArrayBaseType);
			if (result == null)
				result = caseStringBaseType(stringArrayBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.STRING_BASE_TYPE: {
			StringBaseType stringBaseType = (StringBaseType) theEObject;
			T result = caseStringBaseType(stringBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.STRING_UID_BASE_TYPE: {
			StringUIDBaseType stringUIDBaseType = (StringUIDBaseType) theEObject;
			T result = caseStringUIDBaseType(stringUIDBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE: {
			StringVectorBaseType stringVectorBaseType = (StringVectorBaseType) theEObject;
			T result = caseStringVectorBaseType(stringVectorBaseType);
			if (result == null)
				result = caseStringBaseType(stringVectorBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ToolspecificPackage.TIME_BASE_TYPE: {
			TimeBaseType timeBaseType = (TimeBaseType) theEObject;
			T result = caseTimeBaseType(timeBaseType);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBaseType(BooleanBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexBaseType(ComplexBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateBaseType(DateBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeBaseType(DateTimeBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Door Selection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Door Selection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoorSelectionType(DoorSelectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleBaseType(DoubleBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Double Constraint Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Double Constraint Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoubleConstraintBaseType(DoubleConstraintBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerBaseType(IntegerBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Passenger Sorting Scheme Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Passenger Sorting Scheme Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePassengerSortingSchemeType(PassengerSortingSchemeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paxelerate Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paxelerate Input Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxelerateInputType(PaxelerateInputType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paxelerate Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paxelerate Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePaxelerateType(PaxelerateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seat Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seat Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeatTypeType(SeatTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simulation Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simulation Type Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulationTypeType(SimulationTypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Array Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Array Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringArrayBaseType(StringArrayBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringBaseType(StringBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String UID Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String UID Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringUIDBaseType(StringUIDBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Vector Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Vector Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVectorBaseType(StringVectorBaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeBaseType(TimeBaseType object) {
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

} //ToolspecificSwitch
