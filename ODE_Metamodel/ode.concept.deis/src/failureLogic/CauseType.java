/**
 */
package failureLogic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cause Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see failureLogic.FailureLogic_Package#getCauseType()
 * @model
 * @generated
 */
public enum CauseType implements Enumerator {
	/**
	 * The '<em><b>Input Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_EVENT(0, "InputEvent", "InputEvent"),

	/**
	 * The '<em><b>Output Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_EVENT(1, "OutputEvent", "OutputEvent"),

	/**
	 * The '<em><b>Basic Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIC_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	BASIC_EVENT(2, "BasicEvent", "BasicEvent"),

	/**
	 * The '<em><b>Gate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GATE_VALUE
	 * @generated
	 * @ordered
	 */
	GATE(3, "Gate", "Gate");

	/**
	 * The '<em><b>Input Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Input Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INPUT_EVENT
	 * @model name="InputEvent"
	 * @generated
	 * @ordered
	 */
	public static final int INPUT_EVENT_VALUE = 0;

	/**
	 * The '<em><b>Output Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Output Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_EVENT
	 * @model name="OutputEvent"
	 * @generated
	 * @ordered
	 */
	public static final int OUTPUT_EVENT_VALUE = 1;

	/**
	 * The '<em><b>Basic Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basic Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIC_EVENT
	 * @model name="BasicEvent"
	 * @generated
	 * @ordered
	 */
	public static final int BASIC_EVENT_VALUE = 2;

	/**
	 * The '<em><b>Gate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GATE
	 * @model name="Gate"
	 * @generated
	 * @ordered
	 */
	public static final int GATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cause Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CauseType[] VALUES_ARRAY =
		new CauseType[] {
			INPUT_EVENT,
			OUTPUT_EVENT,
			BASIC_EVENT,
			GATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Cause Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CauseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cause Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CauseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CauseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cause Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CauseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CauseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cause Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CauseType get(int value) {
		switch (value) {
			case INPUT_EVENT_VALUE: return INPUT_EVENT;
			case OUTPUT_EVENT_VALUE: return OUTPUT_EVENT;
			case BASIC_EVENT_VALUE: return BASIC_EVENT;
			case GATE_VALUE: return GATE;
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
	private CauseType(int value, String name, String literal) {
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
	
} //CauseType
