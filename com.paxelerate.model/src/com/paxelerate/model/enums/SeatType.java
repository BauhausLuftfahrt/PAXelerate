/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Seat Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getSeatType()
 * @model
 * @generated
 */
public enum SeatType implements Enumerator {
	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>SIDEWAYS FOLDABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDEWAYS_FOLDABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIDEWAYS_FOLDABLE(1, "SIDEWAYS_FOLDABLE", "SIDEWAYS_FOLDABLE"),

	/**
	 * The '<em><b>LIFTING SEAT PAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFTING_SEAT_PAN_VALUE
	 * @generated
	 * @ordered
	 */
	LIFTING_SEAT_PAN(2, "LIFTING_SEAT_PAN", "LIFTING_SEAT_PAN"),

	/**
	 * The '<em><b>BRING YOUR OWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRING_YOUR_OWN_VALUE
	 * @generated
	 * @ordered
	 */
	BRING_YOUR_OWN(3, "BRING_YOUR_OWN", "BRING_YOUR_OWN");

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>SIDEWAYS FOLDABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDEWAYS_FOLDABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIDEWAYS_FOLDABLE_VALUE = 1;

	/**
	 * The '<em><b>LIFTING SEAT PAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFTING_SEAT_PAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LIFTING_SEAT_PAN_VALUE = 2;

	/**
	 * The '<em><b>BRING YOUR OWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRING_YOUR_OWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BRING_YOUR_OWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Seat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeatType[] VALUES_ARRAY = new SeatType[] { DEFAULT, SIDEWAYS_FOLDABLE, LIFTING_SEAT_PAN,
			BRING_YOUR_OWN, };

	/**
	 * A public read-only list of all the '<em><b>Seat Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SeatType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Seat Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeatType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seat Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeatType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seat Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatType get(int value) {
		switch (value) {
		case DEFAULT_VALUE:
			return DEFAULT;
		case SIDEWAYS_FOLDABLE_VALUE:
			return SIDEWAYS_FOLDABLE;
		case LIFTING_SEAT_PAN_VALUE:
			return LIFTING_SEAT_PAN;
		case BRING_YOUR_OWN_VALUE:
			return BRING_YOUR_OWN;
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
	private SeatType(int value, String name, String literal) {
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

} //SeatType
