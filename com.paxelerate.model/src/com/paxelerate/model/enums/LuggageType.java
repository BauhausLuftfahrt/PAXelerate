/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Luggage Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getLuggageType()
 * @model
 * @generated
 */
public enum LuggageType implements Enumerator {
	/**
	 * The '<em><b>JACKET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACKET_VALUE
	 * @generated
	 * @ordered
	 */
	JACKET(0, "JACKET", "JACKET"),

	/**
	 * The '<em><b>SMALL BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	SMALL_BAG(1, "SMALL_BAG", "SMALL_BAG"),

	/**
	 * The '<em><b>MEDIUM BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM_BAG(2, "MEDIUM_BAG", "MEDIUM_BAG"),

	/**
	 * The '<em><b>LARGE BAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_BAG_VALUE
	 * @generated
	 * @ordered
	 */
	LARGE_BAG(3, "LARGE_BAG", "LARGE_BAG");

	/**
	 * The '<em><b>JACKET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JACKET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JACKET_VALUE = 0;

	/**
	 * The '<em><b>SMALL BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMALL_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMALL_BAG_VALUE = 1;

	/**
	 * The '<em><b>MEDIUM BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_BAG_VALUE = 2;

	/**
	 * The '<em><b>LARGE BAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LARGE_BAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LARGE_BAG_VALUE = 3;

	/**
	 * An array of all the '<em><b>Luggage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LuggageType[] VALUES_ARRAY = new LuggageType[] { JACKET, SMALL_BAG, MEDIUM_BAG, LARGE_BAG, };

	/**
	 * A public read-only list of all the '<em><b>Luggage Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LuggageType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Luggage Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LuggageType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LuggageType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Luggage Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LuggageType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LuggageType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Luggage Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static LuggageType get(int value) {
		switch (value) {
		case JACKET_VALUE:
			return JACKET;
		case SMALL_BAG_VALUE:
			return SMALL_BAG;
		case MEDIUM_BAG_VALUE:
			return MEDIUM_BAG;
		case LARGE_BAG_VALUE:
			return LARGE_BAG;
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
	private LuggageType(int value, String name, String literal) {
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

} //LuggageType
