/**
 */
package toolspecific;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Vector Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.StringVectorBaseType#getA <em>A</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getB <em>B</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getC <em>C</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getDelta <em>Delta</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getMapType <em>Map Type</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getMu <em>Mu</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getV <em>V</em>}</li>
 *   <li>{@link toolspecific.StringVectorBaseType#getW <em>W</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType()
 * @model extendedMetaData="name='stringVectorBaseType' kind='simple'"
 * @generated
 */
public interface StringVectorBaseType extends StringBaseType {
	/**
	 * Returns the value of the '<em><b>A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' attribute.
	 * @see #setA(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_A()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='a'"
	 * @generated
	 */
	String getA();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getA <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' attribute.
	 * @see #getA()
	 * @generated
	 */
	void setA(String value);

	/**
	 * Returns the value of the '<em><b>B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' attribute.
	 * @see #setB(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_B()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='b'"
	 * @generated
	 */
	String getB();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getB <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' attribute.
	 * @see #getB()
	 * @generated
	 */
	void setB(String value);

	/**
	 * Returns the value of the '<em><b>C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' attribute.
	 * @see #setC(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_C()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='c'"
	 * @generated
	 */
	String getC();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getC <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>C</em>' attribute.
	 * @see #getC()
	 * @generated
	 */
	void setC(String value);

	/**
	 * Returns the value of the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta</em>' attribute.
	 * @see #setDelta(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_Delta()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='delta'"
	 * @generated
	 */
	String getDelta();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getDelta <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta</em>' attribute.
	 * @see #getDelta()
	 * @generated
	 */
	void setDelta(String value);

	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' attribute.
	 * The default value is <code>"vector"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' attribute.
	 * @see #isSetMapType()
	 * @see #unsetMapType()
	 * @see #setMapType(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_MapType()
	 * @model default="vector" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='mapType'"
	 * @generated
	 */
	String getMapType();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getMapType <em>Map Type</em>}' attribute.
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
	 * Unsets the value of the '{@link toolspecific.StringVectorBaseType#getMapType <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMapType()
	 * @see #getMapType()
	 * @see #setMapType(String)
	 * @generated
	 */
	void unsetMapType();

	/**
	 * Returns whether the value of the '{@link toolspecific.StringVectorBaseType#getMapType <em>Map Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Map Type</em>' attribute is set.
	 * @see #unsetMapType()
	 * @see #getMapType()
	 * @see #setMapType(String)
	 * @generated
	 */
	boolean isSetMapType();

	/**
	 * Returns the value of the '<em><b>Mu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mu</em>' attribute.
	 * @see #setMu(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_Mu()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='mu'"
	 * @generated
	 */
	String getMu();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getMu <em>Mu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mu</em>' attribute.
	 * @see #getMu()
	 * @generated
	 */
	void setMu(String value);

	/**
	 * Returns the value of the '<em><b>Uncertainty Function Name</b></em>' attribute.
	 * The literals are from the enumeration {@link toolspecific.UncertaintyFunctionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uncertainty Function Name</em>' attribute.
	 * @see toolspecific.UncertaintyFunctionType
	 * @see #isSetUncertaintyFunctionName()
	 * @see #unsetUncertaintyFunctionName()
	 * @see #setUncertaintyFunctionName(UncertaintyFunctionType)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_UncertaintyFunctionName()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='uncertaintyFunctionName'"
	 * @generated
	 */
	UncertaintyFunctionType getUncertaintyFunctionName();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uncertainty Function Name</em>' attribute.
	 * @see toolspecific.UncertaintyFunctionType
	 * @see #isSetUncertaintyFunctionName()
	 * @see #unsetUncertaintyFunctionName()
	 * @see #getUncertaintyFunctionName()
	 * @generated
	 */
	void setUncertaintyFunctionName(UncertaintyFunctionType value);

	/**
	 * Unsets the value of the '{@link toolspecific.StringVectorBaseType#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUncertaintyFunctionName()
	 * @see #getUncertaintyFunctionName()
	 * @see #setUncertaintyFunctionName(UncertaintyFunctionType)
	 * @generated
	 */
	void unsetUncertaintyFunctionName();

	/**
	 * Returns whether the value of the '{@link toolspecific.StringVectorBaseType#getUncertaintyFunctionName <em>Uncertainty Function Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Uncertainty Function Name</em>' attribute is set.
	 * @see #unsetUncertaintyFunctionName()
	 * @see #getUncertaintyFunctionName()
	 * @see #setUncertaintyFunctionName(UncertaintyFunctionType)
	 * @generated
	 */
	boolean isSetUncertaintyFunctionName();

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_V()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='v'"
	 * @generated
	 */
	String getV();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(String value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' attribute.
	 * @see #setW(String)
	 * @see toolspecific.ToolspecificPackage#getStringVectorBaseType_W()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='w'"
	 * @generated
	 */
	String getW();

	/**
	 * Sets the value of the '{@link toolspecific.StringVectorBaseType#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(String value);

} // StringVectorBaseType
