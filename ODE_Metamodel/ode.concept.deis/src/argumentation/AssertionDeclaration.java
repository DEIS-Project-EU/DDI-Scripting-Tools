/**
 */
package argumentation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Assertion Declaration</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see argumentation.Argumentation_Package#getAssertionDeclaration()
 * @model
 * @generated
 */
public enum AssertionDeclaration implements Enumerator {
	/**
	 * The '<em><b>Asserted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSERTED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSERTED(1, "asserted", "asserted"),

	/**
	 * The '<em><b>Needs Support</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEEDS_SUPPORT_VALUE
	 * @generated
	 * @ordered
	 */
	NEEDS_SUPPORT(2, "needsSupport", "needsSupport"),

	/**
	 * The '<em><b>Assumed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSUMED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSUMED(3, "assumed", "assumed"),

	/**
	 * The '<em><b>Axiomatic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AXIOMATIC_VALUE
	 * @generated
	 * @ordered
	 */
	AXIOMATIC(4, "axiomatic", "axiomatic"),

	/**
	 * The '<em><b>Defeated</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFEATED_VALUE
	 * @generated
	 * @ordered
	 */
	DEFEATED(5, "defeated", "defeated"),

	/**
	 * The '<em><b>As Cited</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AS_CITED_VALUE
	 * @generated
	 * @ordered
	 */
	AS_CITED(6, "asCited", "asCited");

	/**
	 * The '<em><b>Asserted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asserted</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSERTED
	 * @model name="asserted"
	 * @generated
	 * @ordered
	 */
	public static final int ASSERTED_VALUE = 1;

	/**
	 * The '<em><b>Needs Support</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Needs Support</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEEDS_SUPPORT
	 * @model name="needsSupport"
	 * @generated
	 * @ordered
	 */
	public static final int NEEDS_SUPPORT_VALUE = 2;

	/**
	 * The '<em><b>Assumed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Assumed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSUMED
	 * @model name="assumed"
	 * @generated
	 * @ordered
	 */
	public static final int ASSUMED_VALUE = 3;

	/**
	 * The '<em><b>Axiomatic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Axiomatic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AXIOMATIC
	 * @model name="axiomatic"
	 * @generated
	 * @ordered
	 */
	public static final int AXIOMATIC_VALUE = 4;

	/**
	 * The '<em><b>Defeated</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Defeated</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFEATED
	 * @model name="defeated"
	 * @generated
	 * @ordered
	 */
	public static final int DEFEATED_VALUE = 5;

	/**
	 * The '<em><b>As Cited</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>As Cited</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AS_CITED
	 * @model name="asCited"
	 * @generated
	 * @ordered
	 */
	public static final int AS_CITED_VALUE = 6;

	/**
	 * An array of all the '<em><b>Assertion Declaration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssertionDeclaration[] VALUES_ARRAY =
		new AssertionDeclaration[] {
			ASSERTED,
			NEEDS_SUPPORT,
			ASSUMED,
			AXIOMATIC,
			DEFEATED,
			AS_CITED,
		};

	/**
	 * A public read-only list of all the '<em><b>Assertion Declaration</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssertionDeclaration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Assertion Declaration</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionDeclaration get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionDeclaration result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Declaration</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionDeclaration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssertionDeclaration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Assertion Declaration</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AssertionDeclaration get(int value) {
		switch (value) {
			case ASSERTED_VALUE: return ASSERTED;
			case NEEDS_SUPPORT_VALUE: return NEEDS_SUPPORT;
			case ASSUMED_VALUE: return ASSUMED;
			case AXIOMATIC_VALUE: return AXIOMATIC;
			case DEFEATED_VALUE: return DEFEATED;
			case AS_CITED_VALUE: return AS_CITED;
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
	private AssertionDeclaration(int value, String name, String literal) {
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
	
} //AssertionDeclaration
