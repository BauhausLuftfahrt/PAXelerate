/**
 */
package paxelerate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paxelerate.PaxeleratePackage;
import paxelerate.StudyIterationsOutputType;
import paxelerate.StudyOutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.StudyOutputTypeImpl#getAverageBoardingTime <em>Average Boarding Time</em>}</li>
 *   <li>{@link paxelerate.impl.StudyOutputTypeImpl#getStudyIterationsOutput <em>Study Iterations Output</em>}</li>
 *   <li>{@link paxelerate.impl.StudyOutputTypeImpl#getLinkedStudyUID <em>Linked Study UID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyOutputTypeImpl extends MinimalEObjectImpl.Container implements StudyOutputType {
	/**
	 * The default value of the '{@link #getAverageBoardingTime() <em>Average Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_BOARDING_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAverageBoardingTime() <em>Average Boarding Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageBoardingTime()
	 * @generated
	 * @ordered
	 */
	protected double averageBoardingTime = AVERAGE_BOARDING_TIME_EDEFAULT;

	/**
	 * This is true if the Average Boarding Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean averageBoardingTimeESet;

	/**
	 * The cached value of the '{@link #getStudyIterationsOutput() <em>Study Iterations Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyIterationsOutput()
	 * @generated
	 * @ordered
	 */
	protected StudyIterationsOutputType studyIterationsOutput;

	/**
	 * The default value of the '{@link #getLinkedStudyUID() <em>Linked Study UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedStudyUID()
	 * @generated
	 * @ordered
	 */
	protected static final String LINKED_STUDY_UID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkedStudyUID() <em>Linked Study UID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedStudyUID()
	 * @generated
	 * @ordered
	 */
	protected String linkedStudyUID = LINKED_STUDY_UID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyOutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.STUDY_OUTPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverageBoardingTime() {
		return averageBoardingTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageBoardingTime(double newAverageBoardingTime) {
		double oldAverageBoardingTime = averageBoardingTime;
		averageBoardingTime = newAverageBoardingTime;
		boolean oldAverageBoardingTimeESet = averageBoardingTimeESet;
		averageBoardingTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME, oldAverageBoardingTime,
					averageBoardingTime, !oldAverageBoardingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAverageBoardingTime() {
		double oldAverageBoardingTime = averageBoardingTime;
		boolean oldAverageBoardingTimeESet = averageBoardingTimeESet;
		averageBoardingTime = AVERAGE_BOARDING_TIME_EDEFAULT;
		averageBoardingTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME, oldAverageBoardingTime,
					AVERAGE_BOARDING_TIME_EDEFAULT, oldAverageBoardingTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAverageBoardingTime() {
		return averageBoardingTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudyIterationsOutputType getStudyIterationsOutput() {
		return studyIterationsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyIterationsOutput(StudyIterationsOutputType newStudyIterationsOutput,
			NotificationChain msgs) {
		StudyIterationsOutputType oldStudyIterationsOutput = studyIterationsOutput;
		studyIterationsOutput = newStudyIterationsOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT, oldStudyIterationsOutput,
					newStudyIterationsOutput);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStudyIterationsOutput(StudyIterationsOutputType newStudyIterationsOutput) {
		if (newStudyIterationsOutput != studyIterationsOutput) {
			NotificationChain msgs = null;
			if (studyIterationsOutput != null)
				msgs = ((InternalEObject) studyIterationsOutput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT, null,
						msgs);
			if (newStudyIterationsOutput != null)
				msgs = ((InternalEObject) newStudyIterationsOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT, null,
						msgs);
			msgs = basicSetStudyIterationsOutput(newStudyIterationsOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT, newStudyIterationsOutput,
					newStudyIterationsOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkedStudyUID() {
		return linkedStudyUID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedStudyUID(String newLinkedStudyUID) {
		String oldLinkedStudyUID = linkedStudyUID;
		linkedStudyUID = newLinkedStudyUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.STUDY_OUTPUT_TYPE__LINKED_STUDY_UID,
					oldLinkedStudyUID, linkedStudyUID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT:
			return basicSetStudyIterationsOutput(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME:
			return getAverageBoardingTime();
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT:
			return getStudyIterationsOutput();
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__LINKED_STUDY_UID:
			return getLinkedStudyUID();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME:
			setAverageBoardingTime((Double) newValue);
			return;
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT:
			setStudyIterationsOutput((StudyIterationsOutputType) newValue);
			return;
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__LINKED_STUDY_UID:
			setLinkedStudyUID((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME:
			unsetAverageBoardingTime();
			return;
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT:
			setStudyIterationsOutput((StudyIterationsOutputType) null);
			return;
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__LINKED_STUDY_UID:
			setLinkedStudyUID(LINKED_STUDY_UID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__AVERAGE_BOARDING_TIME:
			return isSetAverageBoardingTime();
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__STUDY_ITERATIONS_OUTPUT:
			return studyIterationsOutput != null;
		case PaxeleratePackage.STUDY_OUTPUT_TYPE__LINKED_STUDY_UID:
			return LINKED_STUDY_UID_EDEFAULT == null ? linkedStudyUID != null
					: !LINKED_STUDY_UID_EDEFAULT.equals(linkedStudyUID);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (averageBoardingTime: ");
		if (averageBoardingTimeESet)
			result.append(averageBoardingTime);
		else
			result.append("<unset>");
		result.append(", linkedStudyUID: ");
		result.append(linkedStudyUID);
		result.append(')');
		return result.toString();
	}

} //StudyOutputTypeImpl
