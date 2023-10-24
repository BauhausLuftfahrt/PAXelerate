/**
 */
package paxelerate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paxelerate.PaxelerateOutputType;
import paxelerate.PaxeleratePackage;
import paxelerate.StudiesOutputType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.PaxelerateOutputTypeImpl#getStudiesOutput <em>Studies Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxelerateOutputTypeImpl extends MinimalEObjectImpl.Container implements PaxelerateOutputType {
	/**
	 * The cached value of the '{@link #getStudiesOutput() <em>Studies Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudiesOutput()
	 * @generated
	 * @ordered
	 */
	protected StudiesOutputType studiesOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxelerateOutputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.PAXELERATE_OUTPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiesOutputType getStudiesOutput() {
		return studiesOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudiesOutput(StudiesOutputType newStudiesOutput, NotificationChain msgs) {
		StudiesOutputType oldStudiesOutput = studiesOutput;
		studiesOutput = newStudiesOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT, oldStudiesOutput, newStudiesOutput);
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
	public void setStudiesOutput(StudiesOutputType newStudiesOutput) {
		if (newStudiesOutput != studiesOutput) {
			NotificationChain msgs = null;
			if (studiesOutput != null)
				msgs = ((InternalEObject) studiesOutput).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT, null, msgs);
			if (newStudiesOutput != null)
				msgs = ((InternalEObject) newStudiesOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT, null, msgs);
			msgs = basicSetStudiesOutput(newStudiesOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT, newStudiesOutput, newStudiesOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT:
			return basicSetStudiesOutput(null, msgs);
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
		case PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT:
			return getStudiesOutput();
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
		case PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT:
			setStudiesOutput((StudiesOutputType) newValue);
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
		case PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT:
			setStudiesOutput((StudiesOutputType) null);
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
		case PaxeleratePackage.PAXELERATE_OUTPUT_TYPE__STUDIES_OUTPUT:
			return studiesOutput != null;
		}
		return super.eIsSet(featureID);
	}

} //PaxelerateOutputTypeImpl
