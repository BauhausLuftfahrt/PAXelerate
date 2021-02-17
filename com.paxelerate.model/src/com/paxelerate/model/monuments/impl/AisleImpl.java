/**
 */
package com.paxelerate.model.monuments.impl;

import com.paxelerate.model.EPoint;

import com.paxelerate.model.monuments.Aisle;
import com.paxelerate.model.monuments.MonumentsPackage;

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
 * An implementation of the model object '<em><b>Aisle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.monuments.impl.AisleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.AisleImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.AisleImpl#isIgnoreForSimulation <em>Ignore For Simulation</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.AisleImpl#getPath <em>Path</em>}</li>
 *   <li>{@link com.paxelerate.model.monuments.impl.AisleImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AisleImpl extends MinimalEObjectImpl.Container implements Aisle {
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
	 * The default value of the '{@link #isIgnoreForSimulation() <em>Ignore For Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreForSimulation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_FOR_SIMULATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreForSimulation() <em>Ignore For Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreForSimulation()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreForSimulation = IGNORE_FOR_SIMULATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected EList<EPoint> path;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.51;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AisleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MonumentsPackage.Literals.AISLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.AISLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.AISLE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIgnoreForSimulation() {
		return ignoreForSimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreForSimulation(boolean newIgnoreForSimulation) {
		boolean oldIgnoreForSimulation = ignoreForSimulation;
		ignoreForSimulation = newIgnoreForSimulation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.AISLE__IGNORE_FOR_SIMULATION,
					oldIgnoreForSimulation, ignoreForSimulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPoint> getPath() {
		if (path == null) {
			path = new EObjectContainmentEList<EPoint>(EPoint.class, this, MonumentsPackage.AISLE__PATH);
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MonumentsPackage.AISLE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MonumentsPackage.AISLE__PATH:
			return ((InternalEList<?>) getPath()).basicRemove(otherEnd, msgs);
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
		case MonumentsPackage.AISLE__NAME:
			return getName();
		case MonumentsPackage.AISLE__ID:
			return getId();
		case MonumentsPackage.AISLE__IGNORE_FOR_SIMULATION:
			return isIgnoreForSimulation();
		case MonumentsPackage.AISLE__PATH:
			return getPath();
		case MonumentsPackage.AISLE__WIDTH:
			return getWidth();
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
		case MonumentsPackage.AISLE__NAME:
			setName((String) newValue);
			return;
		case MonumentsPackage.AISLE__ID:
			setId((Integer) newValue);
			return;
		case MonumentsPackage.AISLE__IGNORE_FOR_SIMULATION:
			setIgnoreForSimulation((Boolean) newValue);
			return;
		case MonumentsPackage.AISLE__PATH:
			getPath().clear();
			getPath().addAll((Collection<? extends EPoint>) newValue);
			return;
		case MonumentsPackage.AISLE__WIDTH:
			setWidth((Double) newValue);
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
		case MonumentsPackage.AISLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MonumentsPackage.AISLE__ID:
			setId(ID_EDEFAULT);
			return;
		case MonumentsPackage.AISLE__IGNORE_FOR_SIMULATION:
			setIgnoreForSimulation(IGNORE_FOR_SIMULATION_EDEFAULT);
			return;
		case MonumentsPackage.AISLE__PATH:
			getPath().clear();
			return;
		case MonumentsPackage.AISLE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
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
		case MonumentsPackage.AISLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MonumentsPackage.AISLE__ID:
			return id != ID_EDEFAULT;
		case MonumentsPackage.AISLE__IGNORE_FOR_SIMULATION:
			return ignoreForSimulation != IGNORE_FOR_SIMULATION_EDEFAULT;
		case MonumentsPackage.AISLE__PATH:
			return path != null && !path.isEmpty();
		case MonumentsPackage.AISLE__WIDTH:
			return width != WIDTH_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(", ignoreForSimulation: ");
		result.append(ignoreForSimulation);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //AisleImpl
