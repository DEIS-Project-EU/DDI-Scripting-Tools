/**
 */
package top.failureLogic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see top.failureLogic.FailureLogic_Package#getGateType()
 * @model
 * @generated
 */
public enum GateType implements Enumerator {
	/**
	 * The '<em><b>OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_VALUE
	 * @generated
	 * @ordered
	 */
	OR(0, "OR", "OR"),

	/**
	 * The '<em><b>AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_VALUE
	 * @generated
	 * @ordered
	 */
	AND(1, "AND", "AND"),

	/**
	 * The '<em><b>NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_VALUE
	 * @generated
	 * @ordered
	 */
	NOT(2, "NOT", "NOT"),

	/**
	 * The '<em><b>XOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XOR_VALUE
	 * @generated
	 * @ordered
	 */
	XOR(3, "XOR", "XOR"),

	/**
	 * The '<em><b>VOTE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VOTE_VALUE
	 * @generated
	 * @ordered
	 */
	VOTE(4, "VOTE", "VOTE"),

	/**
	 * The '<em><b>PAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAND_VALUE
	 * @generated
	 * @ordered
	 */
	PAND(5, "PAND", "PAND"),

	/**
	 * The '<em><b>POR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POR_VALUE
	 * @generated
	 * @ordered
	 */
	POR(6, "POR", "POR"),

	/**
	 * The '<em><b>SAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAND_VALUE
	 * @generated
	 * @ordered
	 */
	SAND(7, "SAND", "SAND"),

	/**
	 * The '<em><b>Input Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INPUT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	INPUT_EVENT(8, "InputEvent", "InputEvent"),

	/**
	 * The '<em><b>Output Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUTPUT_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	OUTPUT_EVENT(9, "OutputEvent", "OutputEvent");

	/**
	 * The '<em><b>OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OR_VALUE = 0;

	/**
	 * The '<em><b>AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AND_VALUE = 1;

	/**
	 * The '<em><b>NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_VALUE = 2;

	/**
	 * The '<em><b>XOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int XOR_VALUE = 3;

	/**
	 * The '<em><b>VOTE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VOTE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VOTE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VOTE_VALUE = 4;

	/**
	 * The '<em><b>PAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAND_VALUE = 5;

	/**
	 * The '<em><b>POR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POR_VALUE = 6;

	/**
	 * The '<em><b>SAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAND_VALUE = 7;

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
	public static final int INPUT_EVENT_VALUE = 8;

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
	public static final int OUTPUT_EVENT_VALUE = 9;

	/**
	 * An array of all the '<em><b>Gate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GateType[] VALUES_ARRAY =
		new GateType[] {
			OR,
			AND,
			NOT,
			XOR,
			VOTE,
			PAND,
			POR,
			SAND,
			INPUT_EVENT,
			OUTPUT_EVENT,
		};

	/**
	 * A public read-only list of all the '<em><b>Gate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GateType get(int value) {
		switch (value) {
			case OR_VALUE: return OR;
			case AND_VALUE: return AND;
			case NOT_VALUE: return NOT;
			case XOR_VALUE: return XOR;
			case VOTE_VALUE: return VOTE;
			case PAND_VALUE: return PAND;
			case POR_VALUE: return POR;
			case SAND_VALUE: return SAND;
			case INPUT_EVENT_VALUE: return INPUT_EVENT;
			case OUTPUT_EVENT_VALUE: return OUTPUT_EVENT;
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
	private GateType(int value, String name, String literal) {
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
	
} //GateType
