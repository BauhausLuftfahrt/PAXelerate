/**
 */
package com.paxelerate.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

import com.paxelerate.model.CabinPackage;
import com.paxelerate.model.PhysicalObject;
import com.paxelerate.model.ui.CabinViewPart;
import com.paxelerate.model.util.CabinValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Physical Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.paxelerate.model.impl.PhysicalObjectImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.PhysicalObjectImpl#getYNowXPosition <em>YNow XPosition</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.PhysicalObjectImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.PhysicalObjectImpl#getYNowXDimension <em>YNow XDimension</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.PhysicalObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.paxelerate.model.impl.PhysicalObjectImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhysicalObjectImpl extends MinimalEObjectImpl.Container implements
		PhysicalObject {
	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int XPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected int xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYNowXPosition() <em>YNow XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYNowXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int YNOW_XPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYNowXPosition() <em>YNow XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYNowXPosition()
	 * @generated
	 * @ordered
	 */
	protected int yNowXPosition = YNOW_XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int XDIMENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected int xDimension = XDIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYNowXDimension() <em>YNow XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYNowXDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int YNOW_XDIMENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYNowXDimension() <em>YNow XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYNowXDimension()
	 * @generated
	 * @ordered
	 */
	protected int yNowXDimension = YNOW_XDIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.PHYSICAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPosition(int newXPosition) {
		int oldXPosition = xPosition;
		xPosition = newXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__XPOSITION, oldXPosition, xPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYNowXPosition() {
		return yNowXPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYNowXPosition(int newYNowXPosition) {
		int oldYNowXPosition = yNowXPosition;
		yNowXPosition = newYNowXPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__YNOW_XPOSITION, oldYNowXPosition, yNowXPosition));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getXDimension() {
		return xDimension;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setXDimension(int newXDimension) {
		int oldXDimension = xDimension;
		xDimension = newXDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__XDIMENSION, oldXDimension, xDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYNowXDimension() {
		return yNowXDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYNowXDimension(int newYNowXDimension) {
		int oldYNowXDimension = yNowXDimension;
		yNowXDimension = newYNowXDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__YNOW_XDIMENSION, oldYNowXDimension, yNowXDimension));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean outOfBounds(DiagnosticChain chain, Map<?, ?> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and
		// message
		// Ensure that you remove @generated or mark it @generated NOT

		int width = 10000;
		int length = 50000;

		try {
			IWorkbenchPage page = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage();
			CabinViewPart cabinViewPart = (CabinViewPart) page
					.findView("net.bhl.cdt.model.cabin.cabinview");

			width = cabinViewPart.getCabin().getCabinWidth();
			length = cabinViewPart.getCabin().getCabinLength();
		} catch (NullPointerException e) {
			// BLA BLA
		}

		boolean xError = false;
		boolean yError = false;

		if ((getXPosition() < 0)
				|| (width < (getXPosition() + getXDimension()))) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR,
						CabinValidator.DIAGNOSTIC_SOURCE,
						CabinValidator.PHYSICAL_OBJECT__OUT_OF_BOUNDS,
						"This object is out of bounds!", new Object[] {
								this,
								CabinPackage.eINSTANCE
										.getPhysicalObject_XPosition() }));

				xError = true;
			}
		}

		if ((getYNowXPosition() < 0)
				|| (length < (getYNowXPosition() + getYNowXDimension()))) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR,
						CabinValidator.DIAGNOSTIC_SOURCE,
						CabinValidator.PHYSICAL_OBJECT__OUT_OF_BOUNDS,
						"This object is out of bounds!", new Object[] {
								this,
								CabinPackage.eINSTANCE
										.getPhysicalObject_YNowXPosition() }));
				yError = true;
			}
		}

		if (yError || xError) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				return getXPosition();
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XPOSITION:
				return getYNowXPosition();
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				return getXDimension();
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XDIMENSION:
				return getYNowXDimension();
			case CabinPackage.PHYSICAL_OBJECT__NAME:
				return getName();
			case CabinPackage.PHYSICAL_OBJECT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				setXPosition((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XPOSITION:
				setYNowXPosition((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				setXDimension((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XDIMENSION:
				setYNowXDimension((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__NAME:
				setName((String)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__ID:
				setId((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XPOSITION:
				setYNowXPosition(YNOW_XPOSITION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				setXDimension(XDIMENSION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XDIMENSION:
				setYNowXDimension(YNOW_XDIMENSION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__ID:
				setId(ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				return xPosition != XPOSITION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XPOSITION:
				return yNowXPosition != YNOW_XPOSITION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				return xDimension != XDIMENSION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__YNOW_XDIMENSION:
				return yNowXDimension != YNOW_XDIMENSION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.PHYSICAL_OBJECT__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case CabinPackage.PHYSICAL_OBJECT___OUT_OF_BOUNDS__DIAGNOSTICCHAIN_MAP:
				return outOfBounds((DiagnosticChain)arguments.get(0), (Map<?, ?>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xPosition: ");
		result.append(xPosition);
		result.append(", yNowXPosition: ");
		result.append(yNowXPosition);
		result.append(", xDimension: ");
		result.append(xDimension);
		result.append(", yNowXDimension: ");
		result.append(yNowXDimension);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // PhysicalObjectImpl
