/**
 */
package paxelerate.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import paxelerate.PaxeleratePackage;
import paxelerate.PaxelerateSettingsType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Settings Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link paxelerate.impl.PaxelerateSettingsTypeImpl#isDisplaySimulation <em>Display Simulation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PaxelerateSettingsTypeImpl extends MinimalEObjectImpl.Container implements PaxelerateSettingsType {
	/**
	 * The default value of the '{@link #isDisplaySimulation() <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplaySimulation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPLAY_SIMULATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisplaySimulation() <em>Display Simulation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisplaySimulation()
	 * @generated
	 * @ordered
	 */
	protected boolean displaySimulation = DISPLAY_SIMULATION_EDEFAULT;

	/**
	 * This is true if the Display Simulation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean displaySimulationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PaxelerateSettingsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PaxeleratePackage.Literals.PAXELERATE_SETTINGS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisplaySimulation() {
		return displaySimulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplaySimulation(boolean newDisplaySimulation) {
		boolean oldDisplaySimulation = displaySimulation;
		displaySimulation = newDisplaySimulation;
		boolean oldDisplaySimulationESet = displaySimulationESet;
		displaySimulationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PaxeleratePackage.PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION, oldDisplaySimulation,
					displaySimulation, !oldDisplaySimulationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDisplaySimulation() {
		boolean oldDisplaySimulation = displaySimulation;
		boolean oldDisplaySimulationESet = displaySimulationESet;
		displaySimulation = DISPLAY_SIMULATION_EDEFAULT;
		displaySimulationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					PaxeleratePackage.PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION, oldDisplaySimulation,
					DISPLAY_SIMULATION_EDEFAULT, oldDisplaySimulationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDisplaySimulation() {
		return displaySimulationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PaxeleratePackage.PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION:
			return isDisplaySimulation();
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
		case PaxeleratePackage.PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION:
			setDisplaySimulation((Boolean) newValue);
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
		case PaxeleratePackage.PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION:
			unsetDisplaySimulation();
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
		case PaxeleratePackage.PAXELERATE_SETTINGS_TYPE__DISPLAY_SIMULATION:
			return isSetDisplaySimulation();
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
		result.append(" (displaySimulation: ");
		if (displaySimulationESet)
			result.append(displaySimulation);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PaxelerateSettingsTypeImpl
