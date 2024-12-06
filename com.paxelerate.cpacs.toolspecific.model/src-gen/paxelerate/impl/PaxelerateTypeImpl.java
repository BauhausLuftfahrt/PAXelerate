/**
 */
package paxelerate.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paxelerate.PaxelerateInputType;
import paxelerate.PaxelerateOutputType;
import paxelerate.PaxeleratePackage;
import paxelerate.PaxelerateSettingsType;
import paxelerate.PaxelerateType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.PaxelerateTypeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link paxelerate.impl.PaxelerateTypeImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link paxelerate.impl.PaxelerateTypeImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxelerateTypeImpl extends MinimalEObjectImpl.Container implements PaxelerateType {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected PaxelerateInputType input;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected PaxelerateSettingsType settings;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected PaxelerateOutputType output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxelerateTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.PAXELERATE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateInputType getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInput(PaxelerateInputType newInput, NotificationChain msgs) {
		PaxelerateInputType oldInput = input;
		input = newInput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.PAXELERATE_TYPE__INPUT, oldInput, newInput);
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
	public void setInput(PaxelerateInputType newInput) {
		if (newInput != input) {
			NotificationChain msgs = null;
			if (input != null)
				msgs = ((InternalEObject) input).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_TYPE__INPUT, null, msgs);
			if (newInput != null)
				msgs = ((InternalEObject) newInput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_TYPE__INPUT, null, msgs);
			msgs = basicSetInput(newInput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.PAXELERATE_TYPE__INPUT, newInput,
					newInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateOutputType getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutput(PaxelerateOutputType newOutput, NotificationChain msgs) {
		PaxelerateOutputType oldOutput = output;
		output = newOutput;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.PAXELERATE_TYPE__OUTPUT, oldOutput, newOutput);
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
	public void setOutput(PaxelerateOutputType newOutput) {
		if (newOutput != output) {
			NotificationChain msgs = null;
			if (output != null)
				msgs = ((InternalEObject) output).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_TYPE__OUTPUT, null, msgs);
			if (newOutput != null)
				msgs = ((InternalEObject) newOutput).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_TYPE__OUTPUT, null, msgs);
			msgs = basicSetOutput(newOutput, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.PAXELERATE_TYPE__OUTPUT, newOutput,
					newOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaxelerateSettingsType getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(PaxelerateSettingsType newSettings, NotificationChain msgs) {
		PaxelerateSettingsType oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.PAXELERATE_TYPE__SETTINGS, oldSettings, newSettings);
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
	public void setSettings(PaxelerateSettingsType newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject) settings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_TYPE__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject) newSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PaxeleratePackage.PAXELERATE_TYPE__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PaxeleratePackage.PAXELERATE_TYPE__SETTINGS,
					newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PaxeleratePackage.PAXELERATE_TYPE__INPUT:
			return basicSetInput(null, msgs);
		case PaxeleratePackage.PAXELERATE_TYPE__SETTINGS:
			return basicSetSettings(null, msgs);
		case PaxeleratePackage.PAXELERATE_TYPE__OUTPUT:
			return basicSetOutput(null, msgs);
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
		case PaxeleratePackage.PAXELERATE_TYPE__INPUT:
			return getInput();
		case PaxeleratePackage.PAXELERATE_TYPE__SETTINGS:
			return getSettings();
		case PaxeleratePackage.PAXELERATE_TYPE__OUTPUT:
			return getOutput();
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
		case PaxeleratePackage.PAXELERATE_TYPE__INPUT:
			setInput((PaxelerateInputType) newValue);
			return;
		case PaxeleratePackage.PAXELERATE_TYPE__SETTINGS:
			setSettings((PaxelerateSettingsType) newValue);
			return;
		case PaxeleratePackage.PAXELERATE_TYPE__OUTPUT:
			setOutput((PaxelerateOutputType) newValue);
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
		case PaxeleratePackage.PAXELERATE_TYPE__INPUT:
			setInput((PaxelerateInputType) null);
			return;
		case PaxeleratePackage.PAXELERATE_TYPE__SETTINGS:
			setSettings((PaxelerateSettingsType) null);
			return;
		case PaxeleratePackage.PAXELERATE_TYPE__OUTPUT:
			setOutput((PaxelerateOutputType) null);
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
		case PaxeleratePackage.PAXELERATE_TYPE__INPUT:
			return input != null;
		case PaxeleratePackage.PAXELERATE_TYPE__SETTINGS:
			return settings != null;
		case PaxeleratePackage.PAXELERATE_TYPE__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

} //PaxelerateTypeImpl
