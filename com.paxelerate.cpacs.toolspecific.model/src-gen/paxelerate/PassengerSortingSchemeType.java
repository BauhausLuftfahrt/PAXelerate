/**
 */
package paxelerate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Passenger Sorting Scheme Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see paxelerate.PaxeleratePackage#getPassengerSortingSchemeType()
 * @model extendedMetaData="name='passengerSortingScheme_._type'"
 * @generated
 */
public enum PassengerSortingSchemeType implements Enumerator {
	/**
	 * The '<em><b>RANDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(0, "RANDOM", "RANDOM"),

	/**
	 * The '<em><b>RTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTF_VALUE
	 * @generated
	 * @ordered
	 */
	RTF(1, "RTF", "RTF"),

	/**
	 * The '<em><b>FTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTR_VALUE
	 * @generated
	 * @ordered
	 */
	FTR(2, "FTR", "FTR"),

	/**
	 * The '<em><b>WTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA_VALUE
	 * @generated
	 * @ordered
	 */
	WTA(3, "WTA", "WTA"),

	/**
	 * The '<em><b>WTARTF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTARTF_VALUE
	 * @generated
	 * @ordered
	 */
	WTARTF(4, "WTARTF", "WTA_RTF"),

	/**
	 * The '<em><b>WTAFTR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTAFTR_VALUE
	 * @generated
	 * @ordered
	 */
	WTAFTR(5, "WTAFTR", "WTA_FTR"),

	/**
	 * The '<em><b>BLOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK_VALUE
	 * @generated
	 * @ordered
	 */
	BLOCK(6, "BLOCK", "BLOCK"),

	/**
	 * The '<em><b>BOARDINGCLASSRANDOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDINGCLASSRANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOARDINGCLASSRANDOM(7, "BOARDINGCLASSRANDOM", "BOARDING_CLASS_RANDOM"),

	/**
	 * The '<em><b>STEFFEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEFFEN_VALUE
	 * @generated
	 * @ordered
	 */
	STEFFEN(8, "STEFFEN", "STEFFEN"),

	/**
	 * The '<em><b>MILNEKELLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILNEKELLY_VALUE
	 * @generated
	 * @ordered
	 */
	MILNEKELLY(9, "MILNEKELLY", "MILNE_KELLY"),

	/**
	 * The '<em><b>BIGBAGSAFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGBAGSAFT_VALUE
	 * @generated
	 * @ordered
	 */
	BIGBAGSAFT(10, "BIGBAGSAFT", "BIG_BAGS_AFT"),

	/**
	 * The '<em><b>BIGBAGSFRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGBAGSFRONT_VALUE
	 * @generated
	 * @ordered
	 */
	BIGBAGSFRONT(11, "BIGBAGSFRONT", "BIG_BAGS_FRONT"),

	/**
	 * The '<em><b>MAXBAGSAFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXBAGSAFT_VALUE
	 * @generated
	 * @ordered
	 */
	MAXBAGSAFT(12, "MAXBAGSAFT", "MAX_BAGS_AFT"),

	/**
	 * The '<em><b>MAXBAGSFRONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXBAGSFRONT_VALUE
	 * @generated
	 * @ordered
	 */
	MAXBAGSFRONT(13, "MAXBAGSFRONT", "MAX_BAGS_FRONT");

	/**
	 * The '<em><b>RANDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 0;

	/**
	 * The '<em><b>RTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RTF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RTF_VALUE = 1;

	/**
	 * The '<em><b>FTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FTR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FTR_VALUE = 2;

	/**
	 * The '<em><b>WTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WTA_VALUE = 3;

	/**
	 * The '<em><b>WTARTF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTARTF
	 * @model literal="WTA_RTF"
	 * @generated
	 * @ordered
	 */
	public static final int WTARTF_VALUE = 4;

	/**
	 * The '<em><b>WTAFTR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WTAFTR
	 * @model literal="WTA_FTR"
	 * @generated
	 * @ordered
	 */
	public static final int WTAFTR_VALUE = 5;

	/**
	 * The '<em><b>BLOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BLOCK_VALUE = 6;

	/**
	 * The '<em><b>BOARDINGCLASSRANDOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOARDINGCLASSRANDOM
	 * @model literal="BOARDING_CLASS_RANDOM"
	 * @generated
	 * @ordered
	 */
	public static final int BOARDINGCLASSRANDOM_VALUE = 7;

	/**
	 * The '<em><b>STEFFEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEFFEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEFFEN_VALUE = 8;

	/**
	 * The '<em><b>MILNEKELLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILNEKELLY
	 * @model literal="MILNE_KELLY"
	 * @generated
	 * @ordered
	 */
	public static final int MILNEKELLY_VALUE = 9;

	/**
	 * The '<em><b>BIGBAGSAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGBAGSAFT
	 * @model literal="BIG_BAGS_AFT"
	 * @generated
	 * @ordered
	 */
	public static final int BIGBAGSAFT_VALUE = 10;

	/**
	 * The '<em><b>BIGBAGSFRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIGBAGSFRONT
	 * @model literal="BIG_BAGS_FRONT"
	 * @generated
	 * @ordered
	 */
	public static final int BIGBAGSFRONT_VALUE = 11;

	/**
	 * The '<em><b>MAXBAGSAFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXBAGSAFT
	 * @model literal="MAX_BAGS_AFT"
	 * @generated
	 * @ordered
	 */
	public static final int MAXBAGSAFT_VALUE = 12;

	/**
	 * The '<em><b>MAXBAGSFRONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXBAGSFRONT
	 * @model literal="MAX_BAGS_FRONT"
	 * @generated
	 * @ordered
	 */
	public static final int MAXBAGSFRONT_VALUE = 13;

	/**
	 * An array of all the '<em><b>Passenger Sorting Scheme Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PassengerSortingSchemeType[] VALUES_ARRAY = new PassengerSortingSchemeType[] { RANDOM, RTF,
			FTR, WTA, WTARTF, WTAFTR, BLOCK, BOARDINGCLASSRANDOM, STEFFEN, MILNEKELLY, BIGBAGSAFT, BIGBAGSFRONT,
			MAXBAGSAFT, MAXBAGSFRONT, };

	/**
	 * A public read-only list of all the '<em><b>Passenger Sorting Scheme Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PassengerSortingSchemeType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Passenger Sorting Scheme Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerSortingSchemeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassengerSortingSchemeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passenger Sorting Scheme Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerSortingSchemeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PassengerSortingSchemeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Passenger Sorting Scheme Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PassengerSortingSchemeType get(int value) {
		switch (value) {
		case RANDOM_VALUE:
			return RANDOM;
		case RTF_VALUE:
			return RTF;
		case FTR_VALUE:
			return FTR;
		case WTA_VALUE:
			return WTA;
		case WTARTF_VALUE:
			return WTARTF;
		case WTAFTR_VALUE:
			return WTAFTR;
		case BLOCK_VALUE:
			return BLOCK;
		case BOARDINGCLASSRANDOM_VALUE:
			return BOARDINGCLASSRANDOM;
		case STEFFEN_VALUE:
			return STEFFEN;
		case MILNEKELLY_VALUE:
			return MILNEKELLY;
		case BIGBAGSAFT_VALUE:
			return BIGBAGSAFT;
		case BIGBAGSFRONT_VALUE:
			return BIGBAGSFRONT;
		case MAXBAGSAFT_VALUE:
			return MAXBAGSAFT;
		case MAXBAGSFRONT_VALUE:
			return MAXBAGSFRONT;
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
	private PassengerSortingSchemeType(int value, String name, String literal) {
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

} //PassengerSortingSchemeType
