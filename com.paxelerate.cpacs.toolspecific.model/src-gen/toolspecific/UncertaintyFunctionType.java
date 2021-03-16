/**
 */
package toolspecific;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Uncertainty Function Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see toolspecific.ToolspecificPackage#getUncertaintyFunctionType()
 * @model extendedMetaData="name='uncertaintyFunctionType'"
 * @generated
 */
public enum UncertaintyFunctionType implements Enumerator {
	/**
	 * The '<em><b>Gaussian Normal Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAUSSIAN_NORMAL_DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	GAUSSIAN_NORMAL_DISTRIBUTION(0, "GaussianNormalDistribution", "GaussianNormalDistribution"),

	/**
	 * The '<em><b>Exponential Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL_DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPONENTIAL_DISTRIBUTION(1, "ExponentialDistribution", "ExponentialDistribution");

	/**
	 * The '<em><b>Gaussian Normal Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GAUSSIAN_NORMAL_DISTRIBUTION
	 * @model name="GaussianNormalDistribution"
	 * @generated
	 * @ordered
	 */
	public static final int GAUSSIAN_NORMAL_DISTRIBUTION_VALUE = 0;

	/**
	 * The '<em><b>Exponential Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPONENTIAL_DISTRIBUTION
	 * @model name="ExponentialDistribution"
	 * @generated
	 * @ordered
	 */
	public static final int EXPONENTIAL_DISTRIBUTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>Uncertainty Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UncertaintyFunctionType[] VALUES_ARRAY = new UncertaintyFunctionType[] {
			GAUSSIAN_NORMAL_DISTRIBUTION, EXPONENTIAL_DISTRIBUTION, };

	/**
	 * A public read-only list of all the '<em><b>Uncertainty Function Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UncertaintyFunctionType> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Uncertainty Function Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UncertaintyFunctionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UncertaintyFunctionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uncertainty Function Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UncertaintyFunctionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UncertaintyFunctionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Uncertainty Function Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static UncertaintyFunctionType get(int value) {
		switch (value) {
		case GAUSSIAN_NORMAL_DISTRIBUTION_VALUE:
			return GAUSSIAN_NORMAL_DISTRIBUTION;
		case EXPONENTIAL_DISTRIBUTION_VALUE:
			return EXPONENTIAL_DISTRIBUTION;
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
	private UncertaintyFunctionType(int value, String name, String literal) {
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

} //UncertaintyFunctionType
