/**
 */
package com.paxelerate.model.agent.impl;

import com.paxelerate.model.agent.AgentPackage;
import com.paxelerate.model.agent.Luggage;

import com.paxelerate.model.enums.LuggageType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Luggage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.agent.impl.LuggageImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.LuggageImpl#getStowTime <em>Stow Time</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.LuggageImpl#getStowDistance <em>Stow Distance</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.LuggageImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.paxelerate.model.agent.impl.LuggageImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LuggageImpl extends MinimalEObjectImpl.Container implements Luggage {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStowTime() <em>Stow Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowTime()
	 * @generated
	 * @ordered
	 */
	protected static final double STOW_TIME_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getStowTime() <em>Stow Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowTime()
	 * @generated
	 * @ordered
	 */
	protected double stowTime = STOW_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStowDistance() <em>Stow Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double STOW_DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStowDistance() <em>Stow Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStowDistance()
	 * @generated
	 * @ordered
	 */
	protected double stowDistance = STOW_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LuggageType TYPE_EDEFAULT = LuggageType.JACKET;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LuggageType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLUME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected double volume = VOLUME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LuggageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.LUGGAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.LUGGAGE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStowTime() {
		return stowTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStowTime(double newStowTime) {
		double oldStowTime = stowTime;
		stowTime = newStowTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.LUGGAGE__STOW_TIME, oldStowTime,
					stowTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStowDistance() {
		return stowDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStowDistance(double newStowDistance) {
		double oldStowDistance = stowDistance;
		stowDistance = newStowDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.LUGGAGE__STOW_DISTANCE, oldStowDistance,
					stowDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LuggageType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LuggageType newType) {
		LuggageType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.LUGGAGE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(double newVolume) {
		double oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.LUGGAGE__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AgentPackage.LUGGAGE__ID:
			return getId();
		case AgentPackage.LUGGAGE__STOW_TIME:
			return getStowTime();
		case AgentPackage.LUGGAGE__STOW_DISTANCE:
			return getStowDistance();
		case AgentPackage.LUGGAGE__TYPE:
			return getType();
		case AgentPackage.LUGGAGE__VOLUME:
			return getVolume();
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
		case AgentPackage.LUGGAGE__ID:
			setId((Integer) newValue);
			return;
		case AgentPackage.LUGGAGE__STOW_TIME:
			setStowTime((Double) newValue);
			return;
		case AgentPackage.LUGGAGE__STOW_DISTANCE:
			setStowDistance((Double) newValue);
			return;
		case AgentPackage.LUGGAGE__TYPE:
			setType((LuggageType) newValue);
			return;
		case AgentPackage.LUGGAGE__VOLUME:
			setVolume((Double) newValue);
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
		case AgentPackage.LUGGAGE__ID:
			setId(ID_EDEFAULT);
			return;
		case AgentPackage.LUGGAGE__STOW_TIME:
			setStowTime(STOW_TIME_EDEFAULT);
			return;
		case AgentPackage.LUGGAGE__STOW_DISTANCE:
			setStowDistance(STOW_DISTANCE_EDEFAULT);
			return;
		case AgentPackage.LUGGAGE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case AgentPackage.LUGGAGE__VOLUME:
			setVolume(VOLUME_EDEFAULT);
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
		case AgentPackage.LUGGAGE__ID:
			return id != ID_EDEFAULT;
		case AgentPackage.LUGGAGE__STOW_TIME:
			return stowTime != STOW_TIME_EDEFAULT;
		case AgentPackage.LUGGAGE__STOW_DISTANCE:
			return stowDistance != STOW_DISTANCE_EDEFAULT;
		case AgentPackage.LUGGAGE__TYPE:
			return type != TYPE_EDEFAULT;
		case AgentPackage.LUGGAGE__VOLUME:
			return volume != VOLUME_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", stowTime: ");
		result.append(stowTime);
		result.append(", stowDistance: ");
		result.append(stowDistance);
		result.append(", type: ");
		result.append(type);
		result.append(", volume: ");
		result.append(volume);
		result.append(')');
		return result.toString();
	}

} //LuggageImpl
