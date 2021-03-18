/**
 */
package toolspecific.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import toolspecific.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see toolspecific.ToolspecificPackage
 * @generated
 */
public class ToolspecificAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ToolspecificPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ToolspecificAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ToolspecificPackage.eINSTANCE;
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
	protected ToolspecificSwitch<Adapter> modelSwitch = new ToolspecificSwitch<Adapter>() {
		@Override
		public Adapter caseBooleanBaseType(BooleanBaseType object) {
			return createBooleanBaseTypeAdapter();
		}

		@Override
		public Adapter caseComplexBaseType(ComplexBaseType object) {
			return createComplexBaseTypeAdapter();
		}

		@Override
		public Adapter caseDateBaseType(DateBaseType object) {
			return createDateBaseTypeAdapter();
		}

		@Override
		public Adapter caseDateTimeBaseType(DateTimeBaseType object) {
			return createDateTimeBaseTypeAdapter();
		}

		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter caseDoorSelectionType(DoorSelectionType object) {
			return createDoorSelectionTypeAdapter();
		}

		@Override
		public Adapter caseDoubleBaseType(DoubleBaseType object) {
			return createDoubleBaseTypeAdapter();
		}

		@Override
		public Adapter caseDoubleConstraintBaseType(DoubleConstraintBaseType object) {
			return createDoubleConstraintBaseTypeAdapter();
		}

		@Override
		public Adapter caseIntegerBaseType(IntegerBaseType object) {
			return createIntegerBaseTypeAdapter();
		}

		@Override
		public Adapter casePassengerSortingSchemeType(PassengerSortingSchemeType object) {
			return createPassengerSortingSchemeTypeAdapter();
		}

		@Override
		public Adapter casePaxelerateInputType(PaxelerateInputType object) {
			return createPaxelerateInputTypeAdapter();
		}

		@Override
		public Adapter casePaxelerateType(PaxelerateType object) {
			return createPaxelerateTypeAdapter();
		}

		@Override
		public Adapter caseSeatTypeType(SeatTypeType object) {
			return createSeatTypeTypeAdapter();
		}

		@Override
		public Adapter caseSimulationTypeType(SimulationTypeType object) {
			return createSimulationTypeTypeAdapter();
		}

		@Override
		public Adapter caseStringArrayBaseType(StringArrayBaseType object) {
			return createStringArrayBaseTypeAdapter();
		}

		@Override
		public Adapter caseStringBaseType(StringBaseType object) {
			return createStringBaseTypeAdapter();
		}

		@Override
		public Adapter caseStringUIDBaseType(StringUIDBaseType object) {
			return createStringUIDBaseTypeAdapter();
		}

		@Override
		public Adapter caseStringVectorBaseType(StringVectorBaseType object) {
			return createStringVectorBaseTypeAdapter();
		}

		@Override
		public Adapter caseStudiesType(StudiesType object) {
			return createStudiesTypeAdapter();
		}

		@Override
		public Adapter caseStudyType(StudyType object) {
			return createStudyTypeAdapter();
		}

		@Override
		public Adapter caseTimeBaseType(TimeBaseType object) {
			return createTimeBaseTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link toolspecific.BooleanBaseType <em>Boolean Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.BooleanBaseType
	 * @generated
	 */
	public Adapter createBooleanBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.ComplexBaseType <em>Complex Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.ComplexBaseType
	 * @generated
	 */
	public Adapter createComplexBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.DateBaseType <em>Date Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.DateBaseType
	 * @generated
	 */
	public Adapter createDateBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.DateTimeBaseType <em>Date Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.DateTimeBaseType
	 * @generated
	 */
	public Adapter createDateTimeBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.DoorSelectionType <em>Door Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.DoorSelectionType
	 * @generated
	 */
	public Adapter createDoorSelectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.DoubleBaseType <em>Double Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.DoubleBaseType
	 * @generated
	 */
	public Adapter createDoubleBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.DoubleConstraintBaseType <em>Double Constraint Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.DoubleConstraintBaseType
	 * @generated
	 */
	public Adapter createDoubleConstraintBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.IntegerBaseType <em>Integer Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.IntegerBaseType
	 * @generated
	 */
	public Adapter createIntegerBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.PassengerSortingSchemeType <em>Passenger Sorting Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.PassengerSortingSchemeType
	 * @generated
	 */
	public Adapter createPassengerSortingSchemeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.PaxelerateInputType <em>Paxelerate Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.PaxelerateInputType
	 * @generated
	 */
	public Adapter createPaxelerateInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.PaxelerateType <em>Paxelerate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.PaxelerateType
	 * @generated
	 */
	public Adapter createPaxelerateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.SeatTypeType <em>Seat Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.SeatTypeType
	 * @generated
	 */
	public Adapter createSeatTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.SimulationTypeType <em>Simulation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.SimulationTypeType
	 * @generated
	 */
	public Adapter createSimulationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.StringArrayBaseType <em>String Array Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.StringArrayBaseType
	 * @generated
	 */
	public Adapter createStringArrayBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.StringBaseType <em>String Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.StringBaseType
	 * @generated
	 */
	public Adapter createStringBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.StringUIDBaseType <em>String UID Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.StringUIDBaseType
	 * @generated
	 */
	public Adapter createStringUIDBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.StringVectorBaseType <em>String Vector Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.StringVectorBaseType
	 * @generated
	 */
	public Adapter createStringVectorBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.StudiesType <em>Studies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.StudiesType
	 * @generated
	 */
	public Adapter createStudiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.StudyType <em>Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.StudyType
	 * @generated
	 */
	public Adapter createStudyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link toolspecific.TimeBaseType <em>Time Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see toolspecific.TimeBaseType
	 * @generated
	 */
	public Adapter createTimeBaseTypeAdapter() {
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

} //ToolspecificAdapterFactory
