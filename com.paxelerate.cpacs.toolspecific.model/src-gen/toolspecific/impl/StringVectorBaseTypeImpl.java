/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import toolspecific.StringVectorBaseType;
import toolspecific.ToolspecificPackage;
import toolspecific.UncertaintyFunctionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Vector Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getC <em>C</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getMapType <em>Map Type</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getV <em>V</em>}</li>
 *   <li>{@link toolspecific.impl.StringVectorBaseTypeImpl#getW <em>W</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringVectorBaseTypeImpl extends StringBaseTypeImpl implements StringVectorBaseType {
	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final String A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected String a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final String B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected String b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final String C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected String c = C_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected static final String DELTA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected String delta = DELTA_EDEFAULT;

	/**
	 * The default value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected static final String MAP_TYPE_EDEFAULT = "vector";

	/**
	 * The cached value of the '{@link #getMapType() <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapType()
	 * @generated
	 * @ordered
	 */
	protected String mapType = MAP_TYPE_EDEFAULT;

	/**
	 * This is true if the Map Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mapTypeESet;

	/**
	 * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected static final String MU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected String mu = MU_EDEFAULT;

	/**
	 * The default value of the '{@link #getUncertaintyFunctionName() <em>Uncertainty Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertaintyFunctionName()
	 * @generated
	 * @ordered
	 */
	protected static final UncertaintyFunctionType UNCERTAINTY_FUNCTION_NAME_EDEFAULT = UncertaintyFunctionType.GAUSSIAN_NORMAL_DISTRIBUTION;

	/**
	 * The cached value of the '{@link #getUncertaintyFunctionName() <em>Uncertainty Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUncertaintyFunctionName()
	 * @generated
	 * @ordered
	 */
	protected UncertaintyFunctionType uncertaintyFunctionName = UNCERTAINTY_FUNCTION_NAME_EDEFAULT;

	/**
	 * This is true if the Uncertainty Function Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uncertaintyFunctionNameESet;

	/**
	 * The default value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected static final String V_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected String v = V_EDEFAULT;

	/**
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final String W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected String w = W_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringVectorBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.STRING_VECTOR_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(String newA) {
		String oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__A, oldA,
					a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(String newB) {
		String oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__B, oldB,
					b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(String newC) {
		String oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__C, oldC,
					c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDelta() {
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelta(String newDelta) {
		String oldDelta = delta;
		delta = newDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__DELTA,
					oldDelta, delta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMapType() {
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapType(String newMapType) {
		String oldMapType = mapType;
		mapType = newMapType;
		boolean oldMapTypeESet = mapTypeESet;
		mapTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MAP_TYPE,
					oldMapType, mapType, !oldMapTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMapType() {
		String oldMapType = mapType;
		boolean oldMapTypeESet = mapTypeESet;
		mapType = MAP_TYPE_EDEFAULT;
		mapTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MAP_TYPE, oldMapType, MAP_TYPE_EDEFAULT,
					oldMapTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMapType() {
		return mapTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMu() {
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMu(String newMu) {
		String oldMu = mu;
		mu = newMu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MU,
					oldMu, mu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UncertaintyFunctionType getUncertaintyFunctionName() {
		return uncertaintyFunctionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUncertaintyFunctionName(UncertaintyFunctionType newUncertaintyFunctionName) {
		UncertaintyFunctionType oldUncertaintyFunctionName = uncertaintyFunctionName;
		uncertaintyFunctionName = newUncertaintyFunctionName == null ? UNCERTAINTY_FUNCTION_NAME_EDEFAULT
				: newUncertaintyFunctionName;
		boolean oldUncertaintyFunctionNameESet = uncertaintyFunctionNameESet;
		uncertaintyFunctionNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME, oldUncertaintyFunctionName,
					uncertaintyFunctionName, !oldUncertaintyFunctionNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUncertaintyFunctionName() {
		UncertaintyFunctionType oldUncertaintyFunctionName = uncertaintyFunctionName;
		boolean oldUncertaintyFunctionNameESet = uncertaintyFunctionNameESet;
		uncertaintyFunctionName = UNCERTAINTY_FUNCTION_NAME_EDEFAULT;
		uncertaintyFunctionNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					ToolspecificPackage.STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME, oldUncertaintyFunctionName,
					UNCERTAINTY_FUNCTION_NAME_EDEFAULT, oldUncertaintyFunctionNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUncertaintyFunctionName() {
		return uncertaintyFunctionNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(String newV) {
		String oldV = v;
		v = newV;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__V, oldV,
					v));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(String newW) {
		String oldW = w;
		w = newW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.STRING_VECTOR_BASE_TYPE__W, oldW,
					w));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__A:
			return getA();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__B:
			return getB();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__C:
			return getC();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__DELTA:
			return getDelta();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MAP_TYPE:
			return getMapType();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MU:
			return getMu();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			return getUncertaintyFunctionName();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__V:
			return getV();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__W:
			return getW();
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
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__A:
			setA((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__B:
			setB((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__C:
			setC((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__DELTA:
			setDelta((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MAP_TYPE:
			setMapType((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MU:
			setMu((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			setUncertaintyFunctionName((UncertaintyFunctionType) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__V:
			setV((String) newValue);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__W:
			setW((String) newValue);
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
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__A:
			setA(A_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__B:
			setB(B_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__C:
			setC(C_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__DELTA:
			setDelta(DELTA_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MAP_TYPE:
			unsetMapType();
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MU:
			setMu(MU_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			unsetUncertaintyFunctionName();
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__V:
			setV(V_EDEFAULT);
			return;
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__W:
			setW(W_EDEFAULT);
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
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__A:
			return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__B:
			return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__C:
			return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__DELTA:
			return DELTA_EDEFAULT == null ? delta != null : !DELTA_EDEFAULT.equals(delta);
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MAP_TYPE:
			return isSetMapType();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__MU:
			return MU_EDEFAULT == null ? mu != null : !MU_EDEFAULT.equals(mu);
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			return isSetUncertaintyFunctionName();
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__V:
			return V_EDEFAULT == null ? v != null : !V_EDEFAULT.equals(v);
		case ToolspecificPackage.STRING_VECTOR_BASE_TYPE__W:
			return W_EDEFAULT == null ? w != null : !W_EDEFAULT.equals(w);
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
		result.append(" (a: ");
		result.append(a);
		result.append(", b: ");
		result.append(b);
		result.append(", c: ");
		result.append(c);
		result.append(", delta: ");
		result.append(delta);
		result.append(", mapType: ");
		if (mapTypeESet)
			result.append(mapType);
		else
			result.append("<unset>");
		result.append(", mu: ");
		result.append(mu);
		result.append(", uncertaintyFunctionName: ");
		if (uncertaintyFunctionNameESet)
			result.append(uncertaintyFunctionName);
		else
			result.append("<unset>");
		result.append(", v: ");
		result.append(v);
		result.append(", w: ");
		result.append(w);
		result.append(')');
		return result.toString();
	}

} //StringVectorBaseTypeImpl
