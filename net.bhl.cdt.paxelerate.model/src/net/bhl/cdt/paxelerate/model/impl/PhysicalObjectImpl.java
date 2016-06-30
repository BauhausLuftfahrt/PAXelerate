/**
 */
package net.bhl.cdt.paxelerate.model.impl;

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
import net.bhl.cdt.paxelerate.model.CabinPackage;
import net.bhl.cdt.paxelerate.model.PhysicalObject;
import net.bhl.cdt.paxelerate.model.util.CabinValidator;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Physical Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl#getYDimension <em>YDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.bhl.cdt.paxelerate.model.impl.PhysicalObjectImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PhysicalObjectImpl extends MinimalEObjectImpl.Container implements
		PhysicalObject {
	/**
	 * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int YPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPosition()
	 * @generated
	 * @ordered
	 */
	protected int yPosition = YPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int XPOSITION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPosition()
	 * @generated
	 * @ordered
	 */
	protected int xPosition = XPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int YDIMENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYDimension() <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYDimension()
	 * @generated
	 * @ordered
	 */
	protected int yDimension = YDIMENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected static final int XDIMENSION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getXDimension() <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXDimension()
	 * @generated
	 * @ordered
	 */
	protected int xDimension = XDIMENSION_EDEFAULT;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	protected PhysicalObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the e class
	 * @generated 
	 */
	@Override
	protected EClass eStaticClass() {
		return CabinPackage.Literals.PHYSICAL_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the y position
	 * @generated 
	 */
	public int getYPosition() {
		return yPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newYPosition the new y position
	 * @generated 
	 */
	public void setYPosition(int newYPosition) {
		int oldYPosition = yPosition;
		yPosition = newYPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__YPOSITION, oldYPosition, yPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the x position
	 * @generated 
	 */
	public int getXPosition() {
		return xPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newXPosition the new x position
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
	 * <!-- end-user-doc -->.
	 *
	 * @return the y dimension
	 * @generated 
	 */
	public int getYDimension() {
		return yDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newYDimension the new y dimension
	 * @generated 
	 */
	public void setYDimension(int newYDimension) {
		int oldYDimension = yDimension;
		yDimension = newYDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__YDIMENSION, oldYDimension, yDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the x dimension
	 * @generated 
	 */
	public int getXDimension() {
		return xDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @param newXDimension the new x dimension
	 * @generated 
	 */
	public void setXDimension(int newXDimension) {
		int oldXDimension = xDimension;
		xDimension = newXDimension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__XDIMENSION, oldXDimension, xDimension));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the name
	 * @generated 
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newName the new name
	 * @generated 
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the id
	 * @generated 
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param newId the new id
	 * @generated 
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CabinPackage.PHYSICAL_OBJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param chain the chain
	 * @param context the context
	 * @return true, if successful
	 * @generated NOT
	 */
	public boolean outOfBounds(DiagnosticChain chain, Map<?, ?> context) {

		int width = 10000;
		int length = 50000;

		try {
			// TODO disabled, as to unlink model from ui
//			IWorkbenchPage page = PlatformUI.getWorkbench()
//					.getActiveWorkbenchWindow().getActivePage();
//			CabinViewPart cabinViewPart = (CabinViewPart) page
//					.findView("net.bhl.cdt.model.cabin.cabinview");
//
//			width = cabinViewPart.getCabin().getYDimension();
//			length = cabinViewPart.getCabin().getXDimension();
		} catch (NullPointerException e) {
			// BLA BLA
		}

		boolean xError = false;
		boolean yError = false;

		if ((getYPosition() < 0)
				|| (width < (getYPosition() + getYDimension()))) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR,
						CabinValidator.DIAGNOSTIC_SOURCE,
						CabinValidator.PHYSICAL_OBJECT__OUT_OF_BOUNDS,
						"This object is out of bounds!", new Object[] {
								this,
								CabinPackage.eINSTANCE
										.getPhysicalObject_YPosition() }));

				xError = true;
			}
		}

		if ((getXPosition() < 0)
				|| (length < (getXPosition() + getXDimension()))) {
			if (chain != null) {
				chain.add(new BasicDiagnostic(Diagnostic.ERROR,
						CabinValidator.DIAGNOSTIC_SOURCE,
						CabinValidator.PHYSICAL_OBJECT__OUT_OF_BOUNDS,
						"This object is out of bounds!", new Object[] {
								this,
								CabinPackage.eINSTANCE
										.getPhysicalObject_XPosition() }));
				yError = true;
			}
		}

		if (yError || xError) {
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param resolve the resolve
	 * @param coreType the core type
	 * @return the object
	 * @generated 
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__YPOSITION:
				return getYPosition();
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				return getXPosition();
			case CabinPackage.PHYSICAL_OBJECT__YDIMENSION:
				return getYDimension();
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				return getXDimension();
			case CabinPackage.PHYSICAL_OBJECT__NAME:
				return getName();
			case CabinPackage.PHYSICAL_OBJECT__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @param newValue the new value
	 * @generated 
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__YPOSITION:
				setYPosition((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				setXPosition((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__YDIMENSION:
				setYDimension((Integer)newValue);
				return;
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				setXDimension((Integer)newValue);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @generated 
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__YPOSITION:
				setYPosition(YPOSITION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				setXPosition(XPOSITION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__YDIMENSION:
				setYDimension(YDIMENSION_EDEFAULT);
				return;
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				setXDimension(XDIMENSION_EDEFAULT);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param featureID the feature id
	 * @return true, if successful
	 * @generated 
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CabinPackage.PHYSICAL_OBJECT__YPOSITION:
				return yPosition != YPOSITION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__XPOSITION:
				return xPosition != XPOSITION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__YDIMENSION:
				return yDimension != YDIMENSION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__XDIMENSION:
				return xDimension != XDIMENSION_EDEFAULT;
			case CabinPackage.PHYSICAL_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CabinPackage.PHYSICAL_OBJECT__ID:
				return id != ID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @param operationID the operation id
	 * @param arguments the arguments
	 * @return the object
	 * @throws InvocationTargetException the invocation target exception
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->.
	 *
	 * @return the string
	 * @generated 
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (yPosition: ");
		result.append(yPosition);
		result.append(", xPosition: ");
		result.append(xPosition);
		result.append(", yDimension: ");
		result.append(yDimension);
		result.append(", xDimension: ");
		result.append(xDimension);
		result.append(", name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} // PhysicalObjectImpl
