/**
 */
package com.paxelerate.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.paxelerate.model.Partition#getType <em>Type</em>}</li>
 *   <li>{@link com.paxelerate.model.Partition#getPostitionAfterRow <em>Postition After Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.paxelerate.model.CabinPackage#getPartition()
 * @model
 * @generated
 */
public interface Partition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.paxelerate.model.PartitionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.PartitionType
	 * @see #setType(PartitionType)
	 * @see com.paxelerate.model.CabinPackage#getPartition_Type()
	 * @model
	 * @generated
	 */
	PartitionType getType();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Partition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.paxelerate.model.PartitionType
	 * @see #getType()
	 * @generated
	 */
	void setType(PartitionType value);

	/**
	 * Returns the value of the '<em><b>Postition After Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postition After Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postition After Row</em>' attribute.
	 * @see #setPostitionAfterRow(int)
	 * @see com.paxelerate.model.CabinPackage#getPartition_PostitionAfterRow()
	 * @model
	 * @generated
	 */
	int getPostitionAfterRow();

	/**
	 * Sets the value of the '{@link com.paxelerate.model.Partition#getPostitionAfterRow <em>Postition After Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postition After Row</em>' attribute.
	 * @see #getPostitionAfterRow()
	 * @generated
	 */
	void setPostitionAfterRow(int value);

} // Partition
