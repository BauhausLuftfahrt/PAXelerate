/**
 */
package toolspecific;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Array Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.StringArrayBaseType#getMapType <em>Map Type</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getStringArrayBaseType()
 * @model extendedMetaData="name='stringArrayBaseType' kind='simple'"
 * @generated
 */
public interface StringArrayBaseType extends StringBaseType {
	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' attribute.
	 * The default value is <code>"array"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' attribute.
	 * @see #isSetMapType()
	 * @see #unsetMapType()
	 * @see #setMapType(String)
	 * @see toolspecific.ToolspecificPackage#getStringArrayBaseType_MapType()
	 * @model default="array" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mapType'"
	 * @generated
	 */
	String getMapType();

	/**
	 * Sets the value of the '{@link toolspecific.StringArrayBaseType#getMapType <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type</em>' attribute.
	 * @see #isSetMapType()
	 * @see #unsetMapType()
	 * @see #getMapType()
	 * @generated
	 */
	void setMapType(String value);

	/**
	 * Unsets the value of the '{@link toolspecific.StringArrayBaseType#getMapType <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapType()
	 * @see #getMapType()
	 * @see #setMapType(String)
	 * @generated
	 */
	void unsetMapType();

	/**
	 * Returns whether the value of the '{@link toolspecific.StringArrayBaseType#getMapType <em>Map Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Type</em>' attribute is set.
	 * @see #unsetMapType()
	 * @see #getMapType()
	 * @see #setMapType(String)
	 * @generated
	 */
	boolean isSetMapType();

} // StringArrayBaseType
