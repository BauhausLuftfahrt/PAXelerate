/**
 */
package toolspecific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import toolspecific.DoubleBaseType;
import toolspecific.ToolspecificPackage;
import toolspecific.UncertaintyFunctionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Base Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getC <em>C</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getExternalFileName <em>External File Name</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getMu <em>Mu</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getV <em>V</em>}</li>
 *   <li>{@link toolspecific.impl.DoubleBaseTypeImpl#getW <em>W</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleBaseTypeImpl extends MinimalEObjectImpl.Container implements DoubleBaseType {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final double A_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected double a = A_EDEFAULT;

	/**
	 * This is true if the A attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aESet;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final double B_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected double b = B_EDEFAULT;

	/**
	 * This is true if the B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bESet;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final double C_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected double c = C_EDEFAULT;

	/**
	 * This is true if the C attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cESet;

	/**
	 * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected static final double DELTA_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected double delta = DELTA_EDEFAULT;

	/**
	 * This is true if the Delta attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean deltaESet;

	/**
	 * The default value of the '{@link #getExternalDataDirectory() <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DATA_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDataDirectory() <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataDirectory()
	 * @generated
	 * @ordered
	 */
	protected String externalDataDirectory = EXTERNAL_DATA_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDataNodePath() <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataNodePath()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DATA_NODE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDataNodePath() <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDataNodePath()
	 * @generated
	 * @ordered
	 */
	protected String externalDataNodePath = EXTERNAL_DATA_NODE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalFileName() <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalFileName() <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalFileName()
	 * @generated
	 * @ordered
	 */
	protected String externalFileName = EXTERNAL_FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected static final double MU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMu() <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMu()
	 * @generated
	 * @ordered
	 */
	protected double mu = MU_EDEFAULT;

	/**
	 * This is true if the Mu attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean muESet;

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
	protected static final double V_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getV() <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getV()
	 * @generated
	 * @ordered
	 */
	protected double v = V_EDEFAULT;

	/**
	 * This is true if the V attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vESet;

	/**
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final double W_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected double w = W_EDEFAULT;

	/**
	 * This is true if the W attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DoubleBaseTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolspecificPackage.Literals.DOUBLE_BASE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__VALUE, oldValue,
					value, !oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		double oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__VALUE,
					oldValue, VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(double newA) {
		double oldA = a;
		a = newA;
		boolean oldAESet = aESet;
		aESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__A, oldA, a,
					!oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetA() {
		double oldA = a;
		boolean oldAESet = aESet;
		a = A_EDEFAULT;
		aESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__A, oldA,
					A_EDEFAULT, oldAESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetA() {
		return aESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(double newB) {
		double oldB = b;
		b = newB;
		boolean oldBESet = bESet;
		bESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__B, oldB, b,
					!oldBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetB() {
		double oldB = b;
		boolean oldBESet = bESet;
		b = B_EDEFAULT;
		bESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__B, oldB,
					B_EDEFAULT, oldBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetB() {
		return bESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(double newC) {
		double oldC = c;
		c = newC;
		boolean oldCESet = cESet;
		cESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__C, oldC, c,
					!oldCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetC() {
		double oldC = c;
		boolean oldCESet = cESet;
		c = C_EDEFAULT;
		cESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__C, oldC,
					C_EDEFAULT, oldCESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetC() {
		return cESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDelta() {
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelta(double newDelta) {
		double oldDelta = delta;
		delta = newDelta;
		boolean oldDeltaESet = deltaESet;
		deltaESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__DELTA, oldDelta,
					delta, !oldDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDelta() {
		double oldDelta = delta;
		boolean oldDeltaESet = deltaESet;
		delta = DELTA_EDEFAULT;
		deltaESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__DELTA,
					oldDelta, DELTA_EDEFAULT, oldDeltaESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDelta() {
		return deltaESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDataDirectory() {
		return externalDataDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDataDirectory(String newExternalDataDirectory) {
		String oldExternalDataDirectory = externalDataDirectory;
		externalDataDirectory = newExternalDataDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY, oldExternalDataDirectory,
					externalDataDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalDataNodePath() {
		return externalDataNodePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDataNodePath(String newExternalDataNodePath) {
		String oldExternalDataNodePath = externalDataNodePath;
		externalDataNodePath = newExternalDataNodePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH, oldExternalDataNodePath,
					externalDataNodePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExternalFileName() {
		return externalFileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalFileName(String newExternalFileName) {
		String oldExternalFileName = externalFileName;
		externalFileName = newExternalFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME, oldExternalFileName, externalFileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMu() {
		return mu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMu(double newMu) {
		double oldMu = mu;
		mu = newMu;
		boolean oldMuESet = muESet;
		muESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__MU, oldMu, mu,
					!oldMuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMu() {
		double oldMu = mu;
		boolean oldMuESet = muESet;
		mu = MU_EDEFAULT;
		muESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__MU, oldMu,
					MU_EDEFAULT, oldMuESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMu() {
		return muESet;
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
					ToolspecificPackage.DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME, oldUncertaintyFunctionName,
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
					ToolspecificPackage.DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME, oldUncertaintyFunctionName,
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
	public double getV() {
		return v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setV(double newV) {
		double oldV = v;
		v = newV;
		boolean oldVESet = vESet;
		vESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__V, oldV, v,
					!oldVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetV() {
		double oldV = v;
		boolean oldVESet = vESet;
		v = V_EDEFAULT;
		vESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__V, oldV,
					V_EDEFAULT, oldVESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetV() {
		return vESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(double newW) {
		double oldW = w;
		w = newW;
		boolean oldWESet = wESet;
		wESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolspecificPackage.DOUBLE_BASE_TYPE__W, oldW, w,
					!oldWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetW() {
		double oldW = w;
		boolean oldWESet = wESet;
		w = W_EDEFAULT;
		wESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ToolspecificPackage.DOUBLE_BASE_TYPE__W, oldW,
					W_EDEFAULT, oldWESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetW() {
		return wESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ToolspecificPackage.DOUBLE_BASE_TYPE__VALUE:
			return getValue();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__A:
			return getA();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__B:
			return getB();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__C:
			return getC();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__DELTA:
			return getDelta();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			return getExternalDataDirectory();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			return getExternalDataNodePath();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME:
			return getExternalFileName();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__MU:
			return getMu();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			return getUncertaintyFunctionName();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__V:
			return getV();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__W:
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
		case ToolspecificPackage.DOUBLE_BASE_TYPE__VALUE:
			setValue((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__A:
			setA((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__B:
			setB((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__C:
			setC((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__DELTA:
			setDelta((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			setExternalDataDirectory((String) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			setExternalDataNodePath((String) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME:
			setExternalFileName((String) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__MU:
			setMu((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			setUncertaintyFunctionName((UncertaintyFunctionType) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__V:
			setV((Double) newValue);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__W:
			setW((Double) newValue);
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
		case ToolspecificPackage.DOUBLE_BASE_TYPE__VALUE:
			unsetValue();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__A:
			unsetA();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__B:
			unsetB();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__C:
			unsetC();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__DELTA:
			unsetDelta();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			setExternalDataDirectory(EXTERNAL_DATA_DIRECTORY_EDEFAULT);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			setExternalDataNodePath(EXTERNAL_DATA_NODE_PATH_EDEFAULT);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME:
			setExternalFileName(EXTERNAL_FILE_NAME_EDEFAULT);
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__MU:
			unsetMu();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			unsetUncertaintyFunctionName();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__V:
			unsetV();
			return;
		case ToolspecificPackage.DOUBLE_BASE_TYPE__W:
			unsetW();
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
		case ToolspecificPackage.DOUBLE_BASE_TYPE__VALUE:
			return isSetValue();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__A:
			return isSetA();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__B:
			return isSetB();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__C:
			return isSetC();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__DELTA:
			return isSetDelta();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_DIRECTORY:
			return EXTERNAL_DATA_DIRECTORY_EDEFAULT == null ? externalDataDirectory != null
					: !EXTERNAL_DATA_DIRECTORY_EDEFAULT.equals(externalDataDirectory);
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_DATA_NODE_PATH:
			return EXTERNAL_DATA_NODE_PATH_EDEFAULT == null ? externalDataNodePath != null
					: !EXTERNAL_DATA_NODE_PATH_EDEFAULT.equals(externalDataNodePath);
		case ToolspecificPackage.DOUBLE_BASE_TYPE__EXTERNAL_FILE_NAME:
			return EXTERNAL_FILE_NAME_EDEFAULT == null ? externalFileName != null
					: !EXTERNAL_FILE_NAME_EDEFAULT.equals(externalFileName);
		case ToolspecificPackage.DOUBLE_BASE_TYPE__MU:
			return isSetMu();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__UNCERTAINTY_FUNCTION_NAME:
			return isSetUncertaintyFunctionName();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__V:
			return isSetV();
		case ToolspecificPackage.DOUBLE_BASE_TYPE__W:
			return isSetW();
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
		result.append(" (value: ");
		if (valueESet)
			result.append(value);
		else
			result.append("<unset>");
		result.append(", a: ");
		if (aESet)
			result.append(a);
		else
			result.append("<unset>");
		result.append(", b: ");
		if (bESet)
			result.append(b);
		else
			result.append("<unset>");
		result.append(", c: ");
		if (cESet)
			result.append(c);
		else
			result.append("<unset>");
		result.append(", delta: ");
		if (deltaESet)
			result.append(delta);
		else
			result.append("<unset>");
		result.append(", externalDataDirectory: ");
		result.append(externalDataDirectory);
		result.append(", externalDataNodePath: ");
		result.append(externalDataNodePath);
		result.append(", externalFileName: ");
		result.append(externalFileName);
		result.append(", mu: ");
		if (muESet)
			result.append(mu);
		else
			result.append("<unset>");
		result.append(", uncertaintyFunctionName: ");
		if (uncertaintyFunctionNameESet)
			result.append(uncertaintyFunctionName);
		else
			result.append("<unset>");
		result.append(", v: ");
		if (vESet)
			result.append(v);
		else
			result.append("<unset>");
		result.append(", w: ");
		if (wESet)
			result.append(w);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DoubleBaseTypeImpl
