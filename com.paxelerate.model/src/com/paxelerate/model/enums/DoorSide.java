/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Door Side</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getDoorSide()
 * @model
 * @generated
 */
public enum DoorSide implements Enumerator {
	/**
	 * The '<em><b>PORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT_VALUE
	 * @generated
	 * @ordered
	 */
	PORT(0, "PORT", "PORT"),

	/**
	 * The '<em><b>STARBOARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	STARBOARD(1, "STARBOARD", "STARBOARD");

	/**
	 * The '<em><b>PORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PORT_VALUE = 0;

	/**
	 * The '<em><b>STARBOARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STARBOARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STARBOARD_VALUE = 1;

	/**
	 * An array of all the '<em><b>Door Side</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorSide[] VALUES_ARRAY = new DoorSide[] { PORT, STARBOARD, };

	/**
	 * A public read-only list of all the '<em><b>Door Side</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorSide> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Side</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSide get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorSide result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Side</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSide getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorSide result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Side</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSide get(int value) {
		switch (value) {
		case PORT_VALUE:
			return PORT;
		case STARBOARD_VALUE:
			return STARBOARD;
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
	private DoorSide(int value, String name, String literal) {
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

} //DoorSide
