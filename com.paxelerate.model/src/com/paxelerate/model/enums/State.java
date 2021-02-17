/**
 */
package com.paxelerate.model.enums;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.paxelerate.model.enums.EnumsPackage#getState()
 * @model
 * @generated
 */
public enum State implements Enumerator {
	/**
	 * The '<em><b>FOLLOW PATH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOW_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOW_PATH(0, "FOLLOW_PATH", "FOLLOW_PATH"),

	/**
	 * The '<em><b>WAIT FOR ROW CLEARING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_FOR_ROW_CLEARING_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT_FOR_ROW_CLEARING(1, "WAIT_FOR_ROW_CLEARING", "WAIT_FOR_ROW_CLEARING"),

	/**
	 * The '<em><b>CLEAR ROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_ROW_VALUE
	 * @generated
	 * @ordered
	 */
	CLEAR_ROW(2, "CLEAR_ROW", "CLEAR_ROW"),

	/**
	 * The '<em><b>STOW LUGGAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOW_LUGGAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STOW_LUGGAGE(3, "STOW_LUGGAGE", "STOW_LUGGAGE"),

	/**
	 * The '<em><b>RETRIEVE LUGGAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_LUGGAGE_VALUE
	 * @generated
	 * @ordered
	 */
	RETRIEVE_LUGGAGE(4, "RETRIEVE_LUGGAGE", "RETRIEVE_LUGGAGE"),

	/**
	 * The '<em><b>UNFOLD SEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNFOLD_SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	UNFOLD_SEAT(5, "UNFOLD_SEAT", ""),

	/**
	 * The '<em><b>PREPARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARE_VALUE
	 * @generated
	 * @ordered
	 */
	PREPARE(6, "PREPARE", "PREPARE"),

	/**
	 * The '<em><b>QUEUE UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	QUEUE_UP(7, "QUEUE_UP", "QUEUE_UP"),

	/**
	 * The '<em><b>WAIT FOR OTHER PASSENGER TO SEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_FOR_OTHER_PASSENGER_TO_SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT_FOR_OTHER_PASSENGER_TO_SEAT(8, "WAIT_FOR_OTHER_PASSENGER_TO_SEAT", "WAIT_FOR_OTHER_PASSENGER_TO_SEAT"),

	/**
	 * The '<em><b>RETURN TO SEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_TO_SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN_TO_SEAT(9, "RETURN_TO_SEAT", "RETURN_TO_SEAT"),

	/**
	 * The '<em><b>SEATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEATED_VALUE
	 * @generated
	 * @ordered
	 */
	SEATED(10, "SEATED", "SEATED"),

	/**
	 * The '<em><b>CALCULATE NEW PATH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATE_NEW_PATH_VALUE
	 * @generated
	 * @ordered
	 */
	CALCULATE_NEW_PATH(11, "CALCULATE_NEW_PATH", "CALCULATE_NEW_PATH"),

	/**
	 * The '<em><b>CABIN LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABIN_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	CABIN_LEFT(12, "CABIN_LEFT", "CABIN_LEFT"),

	/**
	 * The '<em><b>NOT ACTIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ACTIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ACTIVE(13, "NOT_ACTIVE", "NOT_ACTIVE");

	/**
	 * The '<em><b>FOLLOW PATH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOW_PATH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOW_PATH_VALUE = 0;

	/**
	 * The '<em><b>WAIT FOR ROW CLEARING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_FOR_ROW_CLEARING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_FOR_ROW_CLEARING_VALUE = 1;

	/**
	 * The '<em><b>CLEAR ROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLEAR_ROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLEAR_ROW_VALUE = 2;

	/**
	 * The '<em><b>STOW LUGGAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOW_LUGGAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STOW_LUGGAGE_VALUE = 3;

	/**
	 * The '<em><b>RETRIEVE LUGGAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRIEVE_LUGGAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETRIEVE_LUGGAGE_VALUE = 4;

	/**
	 * The '<em><b>UNFOLD SEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNFOLD_SEAT
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int UNFOLD_SEAT_VALUE = 5;

	/**
	 * The '<em><b>PREPARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREPARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PREPARE_VALUE = 6;

	/**
	 * The '<em><b>QUEUE UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #QUEUE_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUEUE_UP_VALUE = 7;

	/**
	 * The '<em><b>WAIT FOR OTHER PASSENGER TO SEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_FOR_OTHER_PASSENGER_TO_SEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_FOR_OTHER_PASSENGER_TO_SEAT_VALUE = 8;

	/**
	 * The '<em><b>RETURN TO SEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_TO_SEAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_TO_SEAT_VALUE = 9;

	/**
	 * The '<em><b>SEATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEATED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEATED_VALUE = 10;

	/**
	 * The '<em><b>CALCULATE NEW PATH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALCULATE_NEW_PATH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALCULATE_NEW_PATH_VALUE = 11;

	/**
	 * The '<em><b>CABIN LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CABIN_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CABIN_LEFT_VALUE = 12;

	/**
	 * The '<em><b>NOT ACTIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_ACTIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ACTIVE_VALUE = 13;

	/**
	 * An array of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final State[] VALUES_ARRAY = new State[] { FOLLOW_PATH, WAIT_FOR_ROW_CLEARING, CLEAR_ROW,
			STOW_LUGGAGE, RETRIEVE_LUGGAGE, UNFOLD_SEAT, PREPARE, QUEUE_UP, WAIT_FOR_OTHER_PASSENGER_TO_SEAT,
			RETURN_TO_SEAT, SEATED, CALCULATE_NEW_PATH, CABIN_LEFT, NOT_ACTIVE, };

	/**
	 * A public read-only list of all the '<em><b>State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<State> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			State result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static State get(int value) {
		switch (value) {
		case FOLLOW_PATH_VALUE:
			return FOLLOW_PATH;
		case WAIT_FOR_ROW_CLEARING_VALUE:
			return WAIT_FOR_ROW_CLEARING;
		case CLEAR_ROW_VALUE:
			return CLEAR_ROW;
		case STOW_LUGGAGE_VALUE:
			return STOW_LUGGAGE;
		case RETRIEVE_LUGGAGE_VALUE:
			return RETRIEVE_LUGGAGE;
		case UNFOLD_SEAT_VALUE:
			return UNFOLD_SEAT;
		case PREPARE_VALUE:
			return PREPARE;
		case QUEUE_UP_VALUE:
			return QUEUE_UP;
		case WAIT_FOR_OTHER_PASSENGER_TO_SEAT_VALUE:
			return WAIT_FOR_OTHER_PASSENGER_TO_SEAT;
		case RETURN_TO_SEAT_VALUE:
			return RETURN_TO_SEAT;
		case SEATED_VALUE:
			return SEATED;
		case CALCULATE_NEW_PATH_VALUE:
			return CALCULATE_NEW_PATH;
		case CABIN_LEFT_VALUE:
			return CABIN_LEFT;
		case NOT_ACTIVE_VALUE:
			return NOT_ACTIVE;
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
	private State(int value, String name, String literal) {
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

} //State
