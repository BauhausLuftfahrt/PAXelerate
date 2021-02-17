/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Door Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getDoorType()
 * @model
 * @generated
 */
public enum DoorType implements Enumerator {
	/**
	 * The '<em><b>I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I_VALUE
	 * @generated
	 * @ordered
	 */
	I(0, "I", "I"),

	/**
	 * The '<em><b>II</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #II_VALUE
	 * @generated
	 * @ordered
	 */
	II(1, "II", "II"),

	/**
	 * The '<em><b>III</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #III_VALUE
	 * @generated
	 * @ordered
	 */
	III(2, "III", "III"),

	/**
	 * The '<em><b>IV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IV_VALUE
	 * @generated
	 * @ordered
	 */
	IV(3, "IV", "IV"),

	/**
	 * The '<em><b>A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A_VALUE
	 * @generated
	 * @ordered
	 */
	A(4, "A", "A"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(5, "B", "B"),

	/**
	 * The '<em><b>C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C_VALUE
	 * @generated
	 * @ordered
	 */
	C(6, "C", "C");

	/**
	 * The '<em><b>I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #I
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int I_VALUE = 0;

	/**
	 * The '<em><b>II</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #II
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int II_VALUE = 1;

	/**
	 * The '<em><b>III</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #III
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int III_VALUE = 2;

	/**
	 * The '<em><b>IV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IV_VALUE = 3;

	/**
	 * The '<em><b>A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #A
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int A_VALUE = 4;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 5;

	/**
	 * The '<em><b>C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #C
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int C_VALUE = 6;

	/**
	 * An array of all the '<em><b>Door Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorType[] VALUES_ARRAY = new DoorType[] { I, II, III, IV, A, B, C, };

	/**
	 * A public read-only list of all the '<em><b>Door Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorType get(int value) {
		switch (value) {
		case I_VALUE:
			return I;
		case II_VALUE:
			return II;
		case III_VALUE:
			return III;
		case IV_VALUE:
			return IV;
		case A_VALUE:
			return A;
		case B_VALUE:
			return B;
		case C_VALUE:
			return C;
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
	private DoorType(int value, String name, String literal) {
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

} //DoorType
