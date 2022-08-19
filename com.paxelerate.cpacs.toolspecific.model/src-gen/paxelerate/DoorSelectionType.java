/**
 */
package paxelerate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Door Selection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage#getDoorSelectionType()
 * @model extendedMetaData="name='doorSelection_._type'"
 * @generated
 */
public enum DoorSelectionType implements Enumerator {
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
	 * The '<em><b>CLOSESTBEHIND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSESTBEHIND_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSESTBEHIND(1, "CLOSESTBEHIND", "CLOSEST_BEHIND"),

	/**
	 * The '<em><b>CLOSESTFRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSESTFRONT_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSESTFRONT(2, "CLOSESTFRONT", "CLOSEST_FRONT"),

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
	 * The '<em><b>CLOSESTBEHIND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSESTBEHIND
	 * @model literal="CLOSEST_BEHIND"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSESTBEHIND_VALUE = 1;

	/**
	 * The '<em><b>CLOSESTFRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSESTFRONT
	 * @model literal="CLOSEST_FRONT"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSESTFRONT_VALUE = 2;

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
	 * An array of all the '<em><b>Door Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoorSelectionType[] VALUES_ARRAY = new DoorSelectionType[] { CLOSEST, CLOSESTBEHIND,
			CLOSESTFRONT, RANDOM, };

	/**
	 * A public read-only list of all the '<em><b>Door Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoorSelectionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Door Selection Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSelectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorSelectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Selection Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSelectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoorSelectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Door Selection Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DoorSelectionType get(int value) {
		switch (value) {
		case CLOSEST_VALUE:
			return CLOSEST;
		case CLOSESTBEHIND_VALUE:
			return CLOSESTBEHIND;
		case CLOSESTFRONT_VALUE:
			return CLOSESTFRONT;
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
	private DoorSelectionType(int value, String name, String literal) {
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

} //DoorSelectionType
