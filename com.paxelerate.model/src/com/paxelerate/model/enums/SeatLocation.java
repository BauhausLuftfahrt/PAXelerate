/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Seat Location</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getSeatLocation()
 * @model
 * @generated
 */
public enum SeatLocation implements Enumerator {
	/**
	 * The '<em><b>WINDOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOW_VALUE
	 * @generated
	 * @ordered
	 */
	WINDOW(0, "WINDOW", "WINDOW"),

	/**
	 * The '<em><b>MIDDLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE_VALUE
	 * @generated
	 * @ordered
	 */
	MIDDLE(1, "MIDDLE", "MIDDLE"),

	/**
	 * The '<em><b>AISLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AISLE_VALUE
	 * @generated
	 * @ordered
	 */
	AISLE(2, "AISLE", "AISLE");

	/**
	 * The '<em><b>WINDOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WINDOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WINDOW_VALUE = 0;

	/**
	 * The '<em><b>MIDDLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIDDLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIDDLE_VALUE = 1;

	/**
	 * The '<em><b>AISLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AISLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AISLE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Seat Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeatLocation[] VALUES_ARRAY = new SeatLocation[] { WINDOW, MIDDLE, AISLE, };

	/**
	 * A public read-only list of all the '<em><b>Seat Location</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SeatLocation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Seat Location</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatLocation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeatLocation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seat Location</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatLocation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeatLocation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seat Location</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatLocation get(int value) {
		switch (value) {
		case WINDOW_VALUE:
			return WINDOW;
		case MIDDLE_VALUE:
			return MIDDLE;
		case AISLE_VALUE:
			return AISLE;
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
	private SeatLocation(int value, String name, String literal) {
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

} //SeatLocation
