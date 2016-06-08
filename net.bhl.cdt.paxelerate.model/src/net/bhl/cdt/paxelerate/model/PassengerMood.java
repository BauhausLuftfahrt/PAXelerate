/**
 */
package net.bhl.cdt.paxelerate.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Passenger Mood</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.bhl.cdt.paxelerate.model.CabinPackage#getPassengerMood()
 * @model
 * @generated
 */
public enum PassengerMood implements Enumerator {
	/**
	 * The '<em><b>Aggressive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGGRESSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	AGGRESSIVE(0, "aggressive", "aggressive"), /**
	 * The '<em><b>Passive</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSIVE_VALUE
	 * @generated
	 * @ordered
	 */
	PASSIVE(1, "passive", "passive");

	/**
	 * The '<em><b>Aggressive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggressive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGGRESSIVE
	 * @model name="aggressive"
	 * @generated
	 * @ordered
	 */
	public static final int AGGRESSIVE_VALUE = 0;

	/**
	 * The '<em><b>Passive</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Passive</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSIVE
	 * @model name="passive"
	 * @generated
	 * @ordered
	 */
	public static final int PASSIVE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Passenger Mood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PassengerMood[] VALUES_ARRAY =
		new PassengerMood[] {
			AGGRESSIVE,
			PASSIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Passenger Mood</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PassengerMood> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Passenger Mood</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerMood get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassengerMood result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passenger Mood</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerMood getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassengerMood result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passenger Mood</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerMood get(int value) {
		switch (value) {
			case AGGRESSIVE_VALUE: return AGGRESSIVE;
			case PASSIVE_VALUE: return PASSIVE;
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
	private PassengerMood(int value, String name, String literal) {
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
	
} //PassengerMood
