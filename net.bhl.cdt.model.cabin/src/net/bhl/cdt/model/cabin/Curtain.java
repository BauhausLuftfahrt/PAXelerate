/**
 */
package net.bhl.cdt.model.cabin;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curtain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.bhl.cdt.model.cabin.Curtain#getPostitionAfterRow <em>Postition After Row</em>}</li>
 *   <li>{@link net.bhl.cdt.model.cabin.Curtain#isCurtainOpen <em>Curtain Open</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.bhl.cdt.model.cabin.CabinPackage#getCurtain()
 * @model
 * @generated
 */
public interface Curtain extends EObject {
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
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCurtain_PostitionAfterRow()
	 * @model
	 * @generated
	 */
	int getPostitionAfterRow();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Curtain#getPostitionAfterRow <em>Postition After Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postition After Row</em>' attribute.
	 * @see #getPostitionAfterRow()
	 * @generated
	 */
	void setPostitionAfterRow(int value);

	/**
	 * Returns the value of the '<em><b>Curtain Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Curtain Open</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curtain Open</em>' attribute.
	 * @see #setCurtainOpen(boolean)
	 * @see net.bhl.cdt.model.cabin.CabinPackage#getCurtain_CurtainOpen()
	 * @model
	 * @generated
	 */
	boolean isCurtainOpen();

	/**
	 * Sets the value of the '{@link net.bhl.cdt.model.cabin.Curtain#isCurtainOpen <em>Curtain Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curtain Open</em>' attribute.
	 * @see #isCurtainOpen()
	 * @generated
	 */
	void setCurtainOpen(boolean value);

} // Curtain
