/**
 */
package paxelerate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Seat Type Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage#getSeatTypeType()
 * @model extendedMetaData="name='seatTypeType'"
 * @generated
 */
public enum SeatTypeType implements Enumerator {
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
	 * The '<em><b>SIDEWAYSFOLDABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDEWAYSFOLDABLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIDEWAYSFOLDABLE(1, "SIDEWAYSFOLDABLE", "SIDEWAYS_FOLDABLE"),

	/**
	 * The '<em><b>LIFTINGSEATPAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFTINGSEATPAN_VALUE
	 * @generated
	 * @ordered
	 */
	LIFTINGSEATPAN(2, "LIFTINGSEATPAN", "LIFTING_SEAT_PAN"),

	/**
	 * The '<em><b>BRINGYOUROWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRINGYOUROWN_VALUE
	 * @generated
	 * @ordered
	 */
	BRINGYOUROWN(3, "BRINGYOUROWN", "BRING_YOUR_OWN");

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
	 * The '<em><b>SIDEWAYSFOLDABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIDEWAYSFOLDABLE
	 * @model literal="SIDEWAYS_FOLDABLE"
	 * @generated
	 * @ordered
	 */
	public static final int SIDEWAYSFOLDABLE_VALUE = 1;

	/**
	 * The '<em><b>LIFTINGSEATPAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIFTINGSEATPAN
	 * @model literal="LIFTING_SEAT_PAN"
	 * @generated
	 * @ordered
	 */
	public static final int LIFTINGSEATPAN_VALUE = 2;

	/**
	 * The '<em><b>BRINGYOUROWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRINGYOUROWN
	 * @model literal="BRING_YOUR_OWN"
	 * @generated
	 * @ordered
	 */
	public static final int BRINGYOUROWN_VALUE = 3;

	/**
	 * An array of all the '<em><b>Seat Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SeatTypeType[] VALUES_ARRAY = new SeatTypeType[] { DEFAULT, SIDEWAYSFOLDABLE, LIFTINGSEATPAN,
			BRINGYOUROWN, };

	/**
	 * A public read-only list of all the '<em><b>Seat Type Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SeatTypeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Seat Type Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatTypeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeatTypeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seat Type Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatTypeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SeatTypeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Seat Type Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SeatTypeType get(int value) {
		switch (value) {
		case DEFAULT_VALUE:
			return DEFAULT;
		case SIDEWAYSFOLDABLE_VALUE:
			return SIDEWAYSFOLDABLE;
		case LIFTINGSEATPAN_VALUE:
			return LIFTINGSEATPAN;
		case BRINGYOUROWN_VALUE:
			return BRINGYOUROWN;
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
	private SeatTypeType(int value, String name, String literal) {
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

} //SeatTypeType
