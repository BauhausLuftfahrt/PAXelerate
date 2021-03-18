/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import toolspecific.PaxelerateInputType;
import toolspecific.StudiesType;
import toolspecific.ToolspecificPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paxelerate Input Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.PaxelerateInputTypeImpl#getStudies <em>Studies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxelerateInputTypeImpl extends ComplexBaseTypeImpl implements PaxelerateInputType {
	/**
	 * The cached value of the '{@link #getStudies() <em>Studies</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudies()
	 * @generated
	 * @ordered
	 */
	protected StudiesType studies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxelerateInputTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.PAXELERATE_INPUT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StudiesType getStudies() {
		return studies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudies(StudiesType newStudies, NotificationChain msgs) {
		StudiesType oldStudies = studies;
		studies = newStudies;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES, oldStudies, newStudies);
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
	public void setStudies(StudiesType newStudies) {
		if (newStudies != studies) {
			NotificationChain msgs = null;
			if (studies != null)
				msgs = ((InternalEObject) studies).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES, null, msgs);
			if (newStudies != null)
				msgs = ((InternalEObject) newStudies).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES, null, msgs);
			msgs = basicSetStudies(newStudies, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES,
					newStudies, newStudies));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES:
			return basicSetStudies(null, msgs);
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES:
			return getStudies();
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES:
			setStudies((StudiesType) newValue);
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES:
			setStudies((StudiesType) null);
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
		case ToolspecificPackage.PAXELERATE_INPUT_TYPE__STUDIES:
			return studies != null;
		}
		return super.eIsSet(featureID);
	}

} //PaxelerateInputTypeImpl
