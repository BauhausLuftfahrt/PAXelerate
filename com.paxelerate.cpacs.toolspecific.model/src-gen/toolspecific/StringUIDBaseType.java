/**
 */
package toolspecific;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String UID Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.StringUIDBaseType#getValue <em>Value</em>}</li>
 *   <li>{@link toolspecific.StringUIDBaseType#getIsLink <em>Is Link</em>}</li>
 *   <li>{@link toolspecific.StringUIDBaseType#getSymmetry <em>Symmetry</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getStringUIDBaseType()
 * @model extendedMetaData="name='stringUIDBaseType' kind='simple'"
 * @generated
 */
public interface StringUIDBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see toolspecific.ToolspecificPackage#getStringUIDBaseType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link toolspecific.StringUIDBaseType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Link</b></em>' attribute.
	 * The default value is <code>"True"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Link</em>' attribute.
	 * @see #isSetIsLink()
	 * @see #unsetIsLink()
	 * @see #setIsLink(String)
	 * @see toolspecific.ToolspecificPackage#getStringUIDBaseType_IsLink()
	 * @model default="True" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='isLink'"
	 * @generated
	 */
	String getIsLink();

	/**
	 * Sets the value of the '{@link toolspecific.StringUIDBaseType#getIsLink <em>Is Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Link</em>' attribute.
	 * @see #isSetIsLink()
	 * @see #unsetIsLink()
	 * @see #getIsLink()
	 * @generated
	 */
	void setIsLink(String value);

	/**
	 * Unsets the value of the '{@link toolspecific.StringUIDBaseType#getIsLink <em>Is Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsLink()
	 * @see #getIsLink()
	 * @see #setIsLink(String)
	 * @generated
	 */
	void unsetIsLink();

	/**
	 * Returns whether the value of the '{@link toolspecific.StringUIDBaseType#getIsLink <em>Is Link</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Link</em>' attribute is set.
	 * @see #unsetIsLink()
	 * @see #getIsLink()
	 * @see #setIsLink(String)
	 * @generated
	 */
	boolean isSetIsLink();

	/**
	 * Returns the value of the '<em><b>Symmetry</b></em>' attribute.
	 * The literals are from the enumeration {@link toolspecific.SymmetryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symmetry</em>' attribute.
	 * @see toolspecific.SymmetryType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #setSymmetry(SymmetryType)
	 * @see toolspecific.ToolspecificPackage#getStringUIDBaseType_Symmetry()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='symmetry'"
	 * @generated
	 */
	SymmetryType getSymmetry();

	/**
	 * Sets the value of the '{@link toolspecific.StringUIDBaseType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symmetry</em>' attribute.
	 * @see toolspecific.SymmetryType
	 * @see #isSetSymmetry()
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @generated
	 */
	void setSymmetry(SymmetryType value);

	/**
	 * Unsets the value of the '{@link toolspecific.StringUIDBaseType#getSymmetry <em>Symmetry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType)
	 * @generated
	 */
	void unsetSymmetry();

	/**
	 * Returns whether the value of the '{@link toolspecific.StringUIDBaseType#getSymmetry <em>Symmetry</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Symmetry</em>' attribute is set.
	 * @see #unsetSymmetry()
	 * @see #getSymmetry()
	 * @see #setSymmetry(SymmetryType)
	 * @generated
	 */
	boolean isSetSymmetry();

} // StringUIDBaseType
