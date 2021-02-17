/**
 */
package com.paxelerate.model.impl;

import com.paxelerate.model.Deck;
import com.paxelerate.model.Model;
import com.paxelerate.model.ModelPackage;
import com.paxelerate.model.SimulationResult;

import com.paxelerate.model.settings.Settings;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.impl.ModelImpl#getDeck <em>Deck</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.ModelImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.ModelImpl#getSimulationResults <em>Simulation Results</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getDeck() <em>Deck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeck()
	 * @generated
	 * @ordered
	 */
	protected Deck deck;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected Settings settings;

	/**
	 * The cached value of the '{@link #getSimulationResults() <em>Simulation Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationResults()
	 * @generated
	 * @ordered
	 */
	protected EList<SimulationResult> simulationResults;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deck getDeck() {
		return deck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeck(Deck newDeck, NotificationChain msgs) {
		Deck oldDeck = deck;
		deck = newDeck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL__DECK,
					oldDeck, newDeck);
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
	public void setDeck(Deck newDeck) {
		if (newDeck != deck) {
			NotificationChain msgs = null;
			if (deck != null)
				msgs = ((InternalEObject) deck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODEL__DECK,
						null, msgs);
			if (newDeck != null)
				msgs = ((InternalEObject) newDeck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MODEL__DECK,
						null, msgs);
			msgs = basicSetDeck(newDeck, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL__DECK, newDeck, newDeck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(Settings newSettings, NotificationChain msgs) {
		Settings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL__SETTINGS,
					oldSettings, newSettings);
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
	public void setSettings(Settings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject) settings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.MODEL__SETTINGS, null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject) newSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ModelPackage.MODEL__SETTINGS, null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MODEL__SETTINGS, newSettings,
					newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SimulationResult> getSimulationResults() {
		if (simulationResults == null) {
			simulationResults = new EObjectContainmentEList<SimulationResult>(SimulationResult.class, this,
					ModelPackage.MODEL__SIMULATION_RESULTS);
		}
		return simulationResults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ModelPackage.MODEL__DECK:
			return basicSetDeck(null, msgs);
		case ModelPackage.MODEL__SETTINGS:
			return basicSetSettings(null, msgs);
		case ModelPackage.MODEL__SIMULATION_RESULTS:
			return ((InternalEList<?>) getSimulationResults()).basicRemove(otherEnd, msgs);
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
		case ModelPackage.MODEL__DECK:
			return getDeck();
		case ModelPackage.MODEL__NAME:
			return getName();
		case ModelPackage.MODEL__SETTINGS:
			return getSettings();
		case ModelPackage.MODEL__SIMULATION_RESULTS:
			return getSimulationResults();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ModelPackage.MODEL__DECK:
			setDeck((Deck) newValue);
			return;
		case ModelPackage.MODEL__NAME:
			setName((String) newValue);
			return;
		case ModelPackage.MODEL__SETTINGS:
			setSettings((Settings) newValue);
			return;
		case ModelPackage.MODEL__SIMULATION_RESULTS:
			getSimulationResults().clear();
			getSimulationResults().addAll((Collection<? extends SimulationResult>) newValue);
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
		case ModelPackage.MODEL__DECK:
			setDeck((Deck) null);
			return;
		case ModelPackage.MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ModelPackage.MODEL__SETTINGS:
			setSettings((Settings) null);
			return;
		case ModelPackage.MODEL__SIMULATION_RESULTS:
			getSimulationResults().clear();
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
		case ModelPackage.MODEL__DECK:
			return deck != null;
		case ModelPackage.MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ModelPackage.MODEL__SETTINGS:
			return settings != null;
		case ModelPackage.MODEL__SIMULATION_RESULTS:
			return simulationResults != null && !simulationResults.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
