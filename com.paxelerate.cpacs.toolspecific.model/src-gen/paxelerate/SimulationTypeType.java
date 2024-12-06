/**
 */
package paxelerate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Simulation Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage#getSimulationTypeType()
 * @model extendedMetaData="name='simulationTypeType'"
 * @generated
 */
public enum SimulationTypeType implements Enumerator {
	/**
	 * The '<em><b>BOARDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDING_VALUE
	 * @generated
	 * @ordered
	 */
	BOARDING(0, "BOARDING", "BOARDING"),

	/**
	 * The '<em><b>DEBOARDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBOARDING_VALUE
	 * @generated
	 * @ordered
	 */
	DEBOARDING(1, "DEBOARDING", "DEBOARDING"),

	/**
	 * The '<em><b>EMERGENCY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY_VALUE
	 * @generated
	 * @ordered
	 */
	EMERGENCY(2, "EMERGENCY", "EMERGENCY");

	/**
	 * The '<em><b>BOARDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOARDING_VALUE = 0;

	/**
	 * The '<em><b>DEBOARDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEBOARDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEBOARDING_VALUE = 1;

	/**
	 * The '<em><b>EMERGENCY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMERGENCY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMERGENCY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Simulation Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SimulationTypeType[] VALUES_ARRAY = new SimulationTypeType[] { BOARDING, DEBOARDING,
			EMERGENCY, };

	/**
	 * A public read-only list of all the '<em><b>Simulation Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SimulationTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Simulation Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimulationTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimulationTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Simulation Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimulationTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimulationTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Simulation Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SimulationTypeType get(int value) {
		switch (value) {
		case BOARDING_VALUE:
			return BOARDING;
		case DEBOARDING_VALUE:
			return DEBOARDING;
		case EMERGENCY_VALUE:
			return EMERGENCY;
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
	private SimulationTypeType(int value, String name, String literal) {
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

} //SimulationTypeType
