/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Door Selection</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getDoorSelection()
 * @model
 * @generated
 */
public enum DoorSelection implements Enumerator {
	/**
	 * The '<em><b>CLOSEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEST_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEST(0, "CLOSEST", "CLOSEST"),

	/**
	 * The '<em><b>CLOSEST BEHIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEST_BEHIND_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEST_BEHIND(1, "CLOSEST_BEHIND", "CLOSEST_BEHIND"),

	/**
	 * The '<em><b>CLOSEST IN FRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEST_IN_FRONT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSEST_IN_FRONT(2, "CLOSEST_IN_FRONT", "CLOSEST_IN_FRONT"),

	/**
	 * The '<em><b>RANDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(3, "RANDOM", "RANDOM");

	/**
	 * The '<em><b>CLOSEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEST
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEST_VALUE = 0;

	/**
	 * The '<em><b>CLOSEST BEHIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEST_BEHIND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEST_BEHIND_VALUE = 1;

	/**
	 * The '<em><b>CLOSEST IN FRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSEST_IN_FRONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLOSEST_IN_FRONT_VALUE = 2;

	/**
	 * The '<em><b>RANDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Door Selection</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorSelection[] VALUES_ARRAY = new DoorSelection[] { CLOSEST, CLOSEST_BEHIND, CLOSEST_IN_FRONT,
			RANDOM, };

	/**
	 * A public read-only list of all the '<em><b>Door Selection</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorSelection> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Selection</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSelection get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorSelection result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Selection</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSelection getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorSelection result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Selection</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSelection get(int value) {
		switch (value) {
		case CLOSEST_VALUE:
			return CLOSEST;
		case CLOSEST_BEHIND_VALUE:
			return CLOSEST_BEHIND;
		case CLOSEST_IN_FRONT_VALUE:
			return CLOSEST_IN_FRONT;
		case RANDOM_VALUE:
			return RANDOM;
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
	private DoorSelection(int value, String name, String literal) {
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

} //DoorSelection
