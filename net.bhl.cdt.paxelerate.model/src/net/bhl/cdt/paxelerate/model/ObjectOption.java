/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Option</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getObjectOption()
 * @model
 * @generated
 */
public enum ObjectOption implements Enumerator {
	/**
	 * The '<em><b>Seat</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEAT_VALUE
	 * @generated
	 * @ordered
	 */
	SEAT(0, "Seat", "Seat"),

	/**
	 * The '<em><b>Galley</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GALLEY_VALUE
	 * @generated
	 * @ordered
	 */
	GALLEY(1, "Galley", "Galley"),

	/**
	 * The '<em><b>Lavatory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVATORY_VALUE
	 * @generated
	 * @ordered
	 */
	LAVATORY(2, "Lavatory", "Lavatory"),

	/**
	 * The '<em><b>Stairway</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAIRWAY_VALUE
	 * @generated
	 * @ordered
	 */
	STAIRWAY(3, "Stairway", "Stairway"),

	/**
	 * The '<em><b>Curtain</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURTAIN_VALUE
	 * @generated
	 * @ordered
	 */
	CURTAIN(4, "Curtain", "Curtain"),

	/**
	 * The '<em><b>Stowage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOWAGE_VALUE
	 * @generated
	 * @ordered
	 */
	STOWAGE(5, "Stowage", "Stowage");

	/**
	 * The '<em><b>Seat</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Seat</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEAT
	 * @model name="Seat"
	 * @generated
	 * @ordered
	 */
	public static final int SEAT_VALUE = 0;

	/**
	 * The '<em><b>Galley</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Galley</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GALLEY
	 * @model name="Galley"
	 * @generated
	 * @ordered
	 */
	public static final int GALLEY_VALUE = 1;

	/**
	 * The '<em><b>Lavatory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavatory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVATORY
	 * @model name="Lavatory"
	 * @generated
	 * @ordered
	 */
	public static final int LAVATORY_VALUE = 2;

	/**
	 * The '<em><b>Stairway</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stairway</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAIRWAY
	 * @model name="Stairway"
	 * @generated
	 * @ordered
	 */
	public static final int STAIRWAY_VALUE = 3;

	/**
	 * The '<em><b>Curtain</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Curtain</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURTAIN
	 * @model name="Curtain"
	 * @generated
	 * @ordered
	 */
	public static final int CURTAIN_VALUE = 4;

	/**
	 * The '<em><b>Stowage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stowage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOWAGE
	 * @model name="Stowage"
	 * @generated
	 * @ordered
	 */
	public static final int STOWAGE_VALUE = 5;

	/**
	 * An array of all the '<em><b>Object Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectOption[] VALUES_ARRAY =
		new ObjectOption[] {
			SEAT,
			GALLEY,
			LAVATORY,
			STAIRWAY,
			CURTAIN,
			STOWAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Option</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectOption> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Option</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectOption get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectOption result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Option</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectOption getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectOption result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Option</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ObjectOption get(int value) {
		switch (value) {
			case SEAT_VALUE: return SEAT;
			case GALLEY_VALUE: return GALLEY;
			case LAVATORY_VALUE: return LAVATORY;
			case STAIRWAY_VALUE: return STAIRWAY;
			case CURTAIN_VALUE: return CURTAIN;
			case STOWAGE_VALUE: return STOWAGE;
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
	private ObjectOption(int value, String name, String literal) {
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
	
} //ObjectOption
