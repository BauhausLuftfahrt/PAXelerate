/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Door Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getDoorOption()
 * @model
 * @generated
 */
public enum DoorOption implements Enumerator {
	/**
	 * The '<em><b>Main Door</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAIN_DOOR_VALUE
	 * @generated
	 * @ordered
	 */
	MAIN_DOOR(0, "MainDoor", "MainDoor"),

	/**
	 * The '<em><b>Standard Door</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_DOOR_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_DOOR(1, "StandardDoor", "StandardDoor"),

	/**
	 * The '<em><b>Emergency Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY_EXIT(2, "EmergencyExit", "EmergencyExit");

	/**
	 * The '<em><b>Main Door</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Main Door</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAIN_DOOR
	 * @model name="MainDoor"
	 * @generated
	 * @ordered
	 */
	public static final int MAIN_DOOR_VALUE = 0;

	/**
	 * The '<em><b>Standard Door</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Door</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_DOOR
	 * @model name="StandardDoor"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_DOOR_VALUE = 1;

	/**
	 * The '<em><b>Emergency Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Emergency Exit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_EXIT
	 * @model name="EmergencyExit"
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_EXIT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Door Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorOption[] VALUES_ARRAY =
		new DoorOption[] {
			MAIN_DOOR,
			STANDARD_DOOR,
			EMERGENCY_EXIT,
		};

	/**
	 * A public read-only list of all the '<em><b>Door Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorOption get(int value) {
		switch (value) {
			case MAIN_DOOR_VALUE: return MAIN_DOOR;
			case STANDARD_DOOR_VALUE: return STANDARD_DOOR;
			case EMERGENCY_EXIT_VALUE: return EMERGENCY_EXIT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @generated 
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DoorOption(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the value
	 * @generated 
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the name
	 * @generated 
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->.
	 *
	 * @return the literal
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
	
} //DoorOption
