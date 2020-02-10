/**
 */
package top.dependability;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operational Cost Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see top.dependability.Dependability_Package#getOperationalCostType()
 * @model
 * @generated
 */
public enum OperationalCostType implements Enumerator {
	/**
	 * The '<em><b>Workhours</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKHOURS_VALUE
	 * @generated
	 * @ordered
	 */
	WORKHOURS(0, "Workhours", "Workhours"),

	/**
	 * The '<em><b>Workdays</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKDAYS_VALUE
	 * @generated
	 * @ordered
	 */
	WORKDAYS(1, "Workdays", "Workdays"),

	/**
	 * The '<em><b>Workmonths</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKMONTHS_VALUE
	 * @generated
	 * @ordered
	 */
	WORKMONTHS(2, "Workmonths", "Workmonths");

	/**
	 * The '<em><b>Workhours</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workhours</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKHOURS
	 * @model name="Workhours"
	 * @generated
	 * @ordered
	 */
	public static final int WORKHOURS_VALUE = 0;

	/**
	 * The '<em><b>Workdays</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workdays</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKDAYS
	 * @model name="Workdays"
	 * @generated
	 * @ordered
	 */
	public static final int WORKDAYS_VALUE = 1;

	/**
	 * The '<em><b>Workmonths</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workmonths</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKMONTHS
	 * @model name="Workmonths"
	 * @generated
	 * @ordered
	 */
	public static final int WORKMONTHS_VALUE = 2;

	/**
	 * An array of all the '<em><b>Operational Cost Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationalCostType[] VALUES_ARRAY =
		new OperationalCostType[] {
			WORKHOURS,
			WORKDAYS,
			WORKMONTHS,
		};

	/**
	 * A public read-only list of all the '<em><b>Operational Cost Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationalCostType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operational Cost Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationalCostType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationalCostType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operational Cost Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationalCostType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationalCostType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operational Cost Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationalCostType get(int value) {
		switch (value) {
			case WORKHOURS_VALUE: return WORKHOURS;
			case WORKDAYS_VALUE: return WORKDAYS;
			case WORKMONTHS_VALUE: return WORKMONTHS;
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
	private OperationalCostType(int value, String name, String literal) {
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
	
} //OperationalCostType
