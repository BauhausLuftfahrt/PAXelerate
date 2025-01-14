/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage
 * @generated
 */
public interface PaxelerateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PaxelerateFactory eINSTANCE = paxelerate.impl.PaxelerateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Boarding Time Per Door Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boarding Time Per Door Type</em>'.
	 * @generated
	 */
	BoardingTimePerDoorType createBoardingTimePerDoorType();

	/**
	 * Returns a new object of class '<em>Boarding Times Per Door Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boarding Times Per Door Type</em>'.
	 * @generated
	 */
	BoardingTimesPerDoorType createBoardingTimesPerDoorType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Input Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Type</em>'.
	 * @generated
	 */
	PaxelerateInputType createPaxelerateInputType();

	/**
	 * Returns a new object of class '<em>Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Type</em>'.
	 * @generated
	 */
	PaxelerateOutputType createPaxelerateOutputType();

	/**
	 * Returns a new object of class '<em>Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings Type</em>'.
	 * @generated
	 */
	PaxelerateSettingsType createPaxelerateSettingsType();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	PaxelerateType createPaxelerateType();

	/**
	 * Returns a new object of class '<em>Studies Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Studies Output Type</em>'.
	 * @generated
	 */
	StudiesOutputType createStudiesOutputType();

	/**
	 * Returns a new object of class '<em>Studies Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Studies Type</em>'.
	 * @generated
	 */
	StudiesType createStudiesType();

	/**
	 * Returns a new object of class '<em>Study Iteration Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Iteration Output Type</em>'.
	 * @generated
	 */
	StudyIterationOutputType createStudyIterationOutputType();

	/**
	 * Returns a new object of class '<em>Study Iterations Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Iterations Output Type</em>'.
	 * @generated
	 */
	StudyIterationsOutputType createStudyIterationsOutputType();

	/**
	 * Returns a new object of class '<em>Study Output Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Output Type</em>'.
	 * @generated
	 */
	StudyOutputType createStudyOutputType();

	/**
	 * Returns a new object of class '<em>Study Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Study Type</em>'.
	 * @generated
	 */
	StudyType createStudyType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PaxeleratePackage getPaxeleratePackage();

} //PaxelerateFactory
