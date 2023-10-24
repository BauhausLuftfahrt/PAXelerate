/**
 */
package paxelerate;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Output Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.StudyOutputType#getAverageBoardingTime <em>Average Boarding Time</em>}</li>
 *   <li>{@link paxelerate.StudyOutputType#getStudyIterationsOutput <em>Study Iterations Output</em>}</li>
 *   <li>{@link paxelerate.StudyOutputType#getLinkedStudyUID <em>Linked Study UID</em>}</li>
 * </ul>
 *
 * @see paxelerate.PaxeleratePackage#getStudyOutputType()
 * @model extendedMetaData="name='studyOutputType' kind='elementOnly'"
 * @generated
 */
public interface StudyOutputType extends EObject {
	/**
	 * Returns the value of the '<em><b>Average Boarding Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Boarding Time</em>' attribute.
	 * @see #isSetAverageBoardingTime()
	 * @see #unsetAverageBoardingTime()
	 * @see #setAverageBoardingTime(double)
	 * @see paxelerate.PaxeleratePackage#getStudyOutputType_AverageBoardingTime()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='averageBoardingTime' namespace='##targetNamespace'"
	 * @generated
	 */
	double getAverageBoardingTime();

	/**
	 * Sets the value of the '{@link paxelerate.StudyOutputType#getAverageBoardingTime <em>Average Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Boarding Time</em>' attribute.
	 * @see #isSetAverageBoardingTime()
	 * @see #unsetAverageBoardingTime()
	 * @see #getAverageBoardingTime()
	 * @generated
	 */
	void setAverageBoardingTime(double value);

	/**
	 * Unsets the value of the '{@link paxelerate.StudyOutputType#getAverageBoardingTime <em>Average Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAverageBoardingTime()
	 * @see #getAverageBoardingTime()
	 * @see #setAverageBoardingTime(double)
	 * @generated
	 */
	void unsetAverageBoardingTime();

	/**
	 * Returns whether the value of the '{@link paxelerate.StudyOutputType#getAverageBoardingTime <em>Average Boarding Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Average Boarding Time</em>' attribute is set.
	 * @see #unsetAverageBoardingTime()
	 * @see #getAverageBoardingTime()
	 * @see #setAverageBoardingTime(double)
	 * @generated
	 */
	boolean isSetAverageBoardingTime();

	/**
	 * Returns the value of the '<em><b>Study Iterations Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Iterations Output</em>' containment reference.
	 * @see #setStudyIterationsOutput(StudyIterationsOutputType)
	 * @see paxelerate.PaxeleratePackage#getStudyOutputType_StudyIterationsOutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='studyIterationsOutput' namespace='##targetNamespace'"
	 * @generated
	 */
	StudyIterationsOutputType getStudyIterationsOutput();

	/**
	 * Sets the value of the '{@link paxelerate.StudyOutputType#getStudyIterationsOutput <em>Study Iterations Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Iterations Output</em>' containment reference.
	 * @see #getStudyIterationsOutput()
	 * @generated
	 */
	void setStudyIterationsOutput(StudyIterationsOutputType value);

	/**
	 * Returns the value of the '<em><b>Linked Study UID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Study UID</em>' attribute.
	 * @see #setLinkedStudyUID(String)
	 * @see paxelerate.PaxeleratePackage#getStudyOutputType_LinkedStudyUID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='linkedStudyUID'"
	 * @generated
	 */
	String getLinkedStudyUID();

	/**
	 * Sets the value of the '{@link paxelerate.StudyOutputType#getLinkedStudyUID <em>Linked Study UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked Study UID</em>' attribute.
	 * @see #getLinkedStudyUID()
	 * @generated
	 */
	void setLinkedStudyUID(String value);

} // StudyOutputType
