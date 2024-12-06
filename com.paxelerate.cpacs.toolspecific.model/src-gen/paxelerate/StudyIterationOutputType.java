/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Iteration Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.StudyIterationOutputType#getBoardingTime <em>Boarding Time</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getStudyIterationOutputType()
 * @model extendedMetaData="name='studyIterationOutputType' kind='elementOnly'"
 * @generated
 */
public interface StudyIterationOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The boarding time of the particular iteration of this study. [s]
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boarding Time</em>' attribute.
	 * @see #isSetBoardingTime()
	 * @see #unsetBoardingTime()
	 * @see #setBoardingTime(double)
	 * @see paxelerate.PaxeleratePackage#getStudyIterationOutputType_BoardingTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='boardingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getBoardingTime();

	/**
	 * Sets the value of the '{@link paxelerate.StudyIterationOutputType#getBoardingTime <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boarding Time</em>' attribute.
	 * @see #isSetBoardingTime()
	 * @see #unsetBoardingTime()
	 * @see #getBoardingTime()
	 * @generated
	 */
	void setBoardingTime(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyIterationOutputType#getBoardingTime <em>Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoardingTime()
	 * @see #getBoardingTime()
	 * @see #setBoardingTime(double)
	 * @generated
	 */
	void unsetBoardingTime();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyIterationOutputType#getBoardingTime <em>Boarding Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Boarding Time</em>' attribute is set.
	 * @see #unsetBoardingTime()
	 * @see #getBoardingTime()
	 * @see #setBoardingTime(double)
	 * @generated
	 */
	boolean isSetBoardingTime();

} // StudyIterationOutputType
