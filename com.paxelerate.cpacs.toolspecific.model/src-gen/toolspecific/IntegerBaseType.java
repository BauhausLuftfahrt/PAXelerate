/**
 */
package toolspecific;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Base Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link toolspecific.IntegerBaseType#getValue <em>Value</em>}</li>
 *   <li>{@link toolspecific.IntegerBaseType#getExternalDataDirectory <em>External Data Directory</em>}</li>
 *   <li>{@link toolspecific.IntegerBaseType#getExternalDataNodePath <em>External Data Node Path</em>}</li>
 *   <li>{@link toolspecific.IntegerBaseType#getExternalFileName <em>External File Name</em>}</li>
 * </ul>
 *
 * @see toolspecific.ToolspecificPackage#getIntegerBaseType()
 * @model extendedMetaData="name='integerBaseType' kind='simple'"
 * @generated
 */
public interface IntegerBaseType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see toolspecific.ToolspecificPackage#getIntegerBaseType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link toolspecific.IntegerBaseType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>External Data Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data Directory</em>' attribute.
	 * @see #setExternalDataDirectory(String)
	 * @see toolspecific.ToolspecificPackage#getIntegerBaseType_ExternalDataDirectory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataDirectory'"
	 * @generated
	 */
	String getExternalDataDirectory();

	/**
	 * Sets the value of the '{@link toolspecific.IntegerBaseType#getExternalDataDirectory <em>External Data Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Data Directory</em>' attribute.
	 * @see #getExternalDataDirectory()
	 * @generated
	 */
	void setExternalDataDirectory(String value);

	/**
	 * Returns the value of the '<em><b>External Data Node Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Data Node Path</em>' attribute.
	 * @see #setExternalDataNodePath(String)
	 * @see toolspecific.ToolspecificPackage#getIntegerBaseType_ExternalDataNodePath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalDataNodePath'"
	 * @generated
	 */
	String getExternalDataNodePath();

	/**
	 * Sets the value of the '{@link toolspecific.IntegerBaseType#getExternalDataNodePath <em>External Data Node Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Data Node Path</em>' attribute.
	 * @see #getExternalDataNodePath()
	 * @generated
	 */
	void setExternalDataNodePath(String value);

	/**
	 * Returns the value of the '<em><b>External File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External File Name</em>' attribute.
	 * @see #setExternalFileName(String)
	 * @see toolspecific.ToolspecificPackage#getIntegerBaseType_ExternalFileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='externalFileName'"
	 * @generated
	 */
	String getExternalFileName();

	/**
	 * Sets the value of the '{@link toolspecific.IntegerBaseType#getExternalFileName <em>External File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External File Name</em>' attribute.
	 * @see #getExternalFileName()
	 * @generated
	 */
	void setExternalFileName(String value);

} // IntegerBaseType
