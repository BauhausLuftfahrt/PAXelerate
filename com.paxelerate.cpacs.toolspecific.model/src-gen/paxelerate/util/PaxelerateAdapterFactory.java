/**
 */
package paxelerate.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import paxelerate.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage
 * @generated
 */
public class PaxelerateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PaxeleratePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PaxeleratePackage.eINSTANCE;
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
	protected PaxelerateSwitch<Adapter> modelSwitch = new PaxelerateSwitch<Adapter>() {
		@Override
		public Adapter caseDocumentRoot(DocumentRoot object) {
			return createDocumentRootAdapter();
		}

		@Override
		public Adapter casePaxelerateInputType(PaxelerateInputType object) {
			return createPaxelerateInputTypeAdapter();
		}

		@Override
		public Adapter casePaxelerateOutputType(PaxelerateOutputType object) {
			return createPaxelerateOutputTypeAdapter();
		}

		@Override
		public Adapter casePaxelerateSettingsType(PaxelerateSettingsType object) {
			return createPaxelerateSettingsTypeAdapter();
		}

		@Override
		public Adapter casePaxelerateType(PaxelerateType object) {
			return createPaxelerateTypeAdapter();
		}

		@Override
		public Adapter caseStudiesOutputType(StudiesOutputType object) {
			return createStudiesOutputTypeAdapter();
		}

		@Override
		public Adapter caseStudiesType(StudiesType object) {
			return createStudiesTypeAdapter();
		}

		@Override
		public Adapter caseStudyIterationOutputType(StudyIterationOutputType object) {
			return createStudyIterationOutputTypeAdapter();
		}

		@Override
		public Adapter caseStudyIterationsOutputType(StudyIterationsOutputType object) {
			return createStudyIterationsOutputTypeAdapter();
		}

		@Override
		public Adapter caseStudyOutputType(StudyOutputType object) {
			return createStudyOutputTypeAdapter();
		}

		@Override
		public Adapter caseStudyType(StudyType object) {
			return createStudyTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link paxelerate.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.PaxelerateInputType <em>Input Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.PaxelerateInputType
	 * @generated
	 */
	public Adapter createPaxelerateInputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.PaxelerateOutputType <em>Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.PaxelerateOutputType
	 * @generated
	 */
	public Adapter createPaxelerateOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.PaxelerateSettingsType <em>Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.PaxelerateSettingsType
	 * @generated
	 */
	public Adapter createPaxelerateSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.PaxelerateType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.PaxelerateType
	 * @generated
	 */
	public Adapter createPaxelerateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.StudiesOutputType <em>Studies Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.StudiesOutputType
	 * @generated
	 */
	public Adapter createStudiesOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.StudiesType <em>Studies Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.StudiesType
	 * @generated
	 */
	public Adapter createStudiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.StudyIterationOutputType <em>Study Iteration Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.StudyIterationOutputType
	 * @generated
	 */
	public Adapter createStudyIterationOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.StudyIterationsOutputType <em>Study Iterations Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.StudyIterationsOutputType
	 * @generated
	 */
	public Adapter createStudyIterationsOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.StudyOutputType <em>Study Output Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.StudyOutputType
	 * @generated
	 */
	public Adapter createStudyOutputTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link paxelerate.StudyType <em>Study Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see paxelerate.StudyType
	 * @generated
	 */
	public Adapter createStudyTypeAdapter() {
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

} //PaxelerateAdapterFactory
