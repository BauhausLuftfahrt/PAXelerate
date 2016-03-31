/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Lavatory Porperties</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getLavatoryPorperties()
 * @model
 * @generated
 */
public enum LavatoryPorperties implements Enumerator {
	/**
	 * The '<em><b>XDimension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XDIMENSION_VALUE
	 * @generated
	 * @ordered
	 */
	XDIMENSION(100, "xDimension", "xDimension"),

	/**
	 * The '<em><b>YDimension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YDIMENSION_VALUE
	 * @generated
	 * @ordered
	 */
	YDIMENSION(300, "yDimension", "yDimension");

	/**
	 * The '<em><b>XDimension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XDimension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XDIMENSION
	 * @model name="xDimension"
	 * @generated
	 * @ordered
	 */
	public static final int XDIMENSION_VALUE = 100;

	/**
	 * The '<em><b>YDimension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YDimension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YDIMENSION
	 * @model name="yDimension"
	 * @generated
	 * @ordered
	 */
	public static final int YDIMENSION_VALUE = 300;

	/**
	 * An array of all the '<em><b>Lavatory Porperties</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LavatoryPorperties[] VALUES_ARRAY =
		new LavatoryPorperties[] {
			XDIMENSION,
			YDIMENSION,
		};

	/**
	 * A public read-only list of all the '<em><b>Lavatory Porperties</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LavatoryPorperties> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Lavatory Porperties</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LavatoryPorperties get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LavatoryPorperties result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lavatory Porperties</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LavatoryPorperties getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LavatoryPorperties result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Lavatory Porperties</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LavatoryPorperties get(int value) {
		switch (value) {
			case XDIMENSION_VALUE: return XDIMENSION;
			case YDIMENSION_VALUE: return YDIMENSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private LavatoryPorperties(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //LavatoryPorperties
