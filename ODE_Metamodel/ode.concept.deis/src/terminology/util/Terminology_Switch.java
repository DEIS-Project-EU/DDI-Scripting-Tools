/**
 */
package terminology.util;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;
import base.SACMElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import terminology.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see terminology.Terminology_Package
 * @generated
 */
public class Terminology_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Terminology_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology_Switch() {
		if (modelPackage == null) {
			modelPackage = Terminology_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Terminology_Package.TERMINOLOGY_ELEMENT: {
				TerminologyElement terminologyElement = (TerminologyElement)theEObject;
				T result = caseTerminologyElement(terminologyElement);
				if (result == null) result = caseArtifactElement(terminologyElement);
				if (result == null) result = caseModelElement(terminologyElement);
				if (result == null) result = caseSACMElement(terminologyElement);
				if (result == null) result = caseElement(terminologyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_GROUP: {
				TerminologyGroup terminologyGroup = (TerminologyGroup)theEObject;
				T result = caseTerminologyGroup(terminologyGroup);
				if (result == null) result = caseTerminologyElement(terminologyGroup);
				if (result == null) result = caseArtifactElement(terminologyGroup);
				if (result == null) result = caseModelElement(terminologyGroup);
				if (result == null) result = caseSACMElement(terminologyGroup);
				if (result == null) result = caseElement(terminologyGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_PACKAGE: {
				TerminologyPackage terminologyPackage = (TerminologyPackage)theEObject;
				T result = caseTerminologyPackage(terminologyPackage);
				if (result == null) result = caseTerminologyElement(terminologyPackage);
				if (result == null) result = caseArtifactElement(terminologyPackage);
				if (result == null) result = caseModelElement(terminologyPackage);
				if (result == null) result = caseSACMElement(terminologyPackage);
				if (result == null) result = caseElement(terminologyPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_PACKAGE_BINDING: {
				TerminologyPackageBinding terminologyPackageBinding = (TerminologyPackageBinding)theEObject;
				T result = caseTerminologyPackageBinding(terminologyPackageBinding);
				if (result == null) result = caseTerminologyPackage(terminologyPackageBinding);
				if (result == null) result = caseTerminologyElement(terminologyPackageBinding);
				if (result == null) result = caseArtifactElement(terminologyPackageBinding);
				if (result == null) result = caseModelElement(terminologyPackageBinding);
				if (result == null) result = caseSACMElement(terminologyPackageBinding);
				if (result == null) result = caseElement(terminologyPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_PACKAGE_INTERFACE: {
				TerminologyPackageInterface terminologyPackageInterface = (TerminologyPackageInterface)theEObject;
				T result = caseTerminologyPackageInterface(terminologyPackageInterface);
				if (result == null) result = caseTerminologyPackage(terminologyPackageInterface);
				if (result == null) result = caseTerminologyElement(terminologyPackageInterface);
				if (result == null) result = caseArtifactElement(terminologyPackageInterface);
				if (result == null) result = caseModelElement(terminologyPackageInterface);
				if (result == null) result = caseSACMElement(terminologyPackageInterface);
				if (result == null) result = caseElement(terminologyPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_ASSET: {
				TerminologyAsset terminologyAsset = (TerminologyAsset)theEObject;
				T result = caseTerminologyAsset(terminologyAsset);
				if (result == null) result = caseTerminologyElement(terminologyAsset);
				if (result == null) result = caseArtifactElement(terminologyAsset);
				if (result == null) result = caseModelElement(terminologyAsset);
				if (result == null) result = caseSACMElement(terminologyAsset);
				if (result == null) result = caseElement(terminologyAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseTerminologyAsset(category);
				if (result == null) result = caseTerminologyElement(category);
				if (result == null) result = caseArtifactElement(category);
				if (result == null) result = caseModelElement(category);
				if (result == null) result = caseSACMElement(category);
				if (result == null) result = caseElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.EXPRESSION_ELEMENT: {
				ExpressionElement expressionElement = (ExpressionElement)theEObject;
				T result = caseExpressionElement(expressionElement);
				if (result == null) result = caseTerminologyAsset(expressionElement);
				if (result == null) result = caseTerminologyElement(expressionElement);
				if (result == null) result = caseArtifactElement(expressionElement);
				if (result == null) result = caseModelElement(expressionElement);
				if (result == null) result = caseSACMElement(expressionElement);
				if (result == null) result = caseElement(expressionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseExpressionElement(expression);
				if (result == null) result = caseTerminologyAsset(expression);
				if (result == null) result = caseTerminologyElement(expression);
				if (result == null) result = caseArtifactElement(expression);
				if (result == null) result = caseModelElement(expression);
				if (result == null) result = caseSACMElement(expression);
				if (result == null) result = caseElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERM: {
				Term term = (Term)theEObject;
				T result = caseTerm(term);
				if (result == null) result = caseExpressionElement(term);
				if (result == null) result = caseTerminologyAsset(term);
				if (result == null) result = caseTerminologyElement(term);
				if (result == null) result = caseArtifactElement(term);
				if (result == null) result = caseModelElement(term);
				if (result == null) result = caseSACMElement(term);
				if (result == null) result = caseElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyElement(TerminologyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyGroup(TerminologyGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackage(TerminologyPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackageBinding(TerminologyPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackageInterface(TerminologyPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyAsset(TerminologyAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionElement(ExpressionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerm(Term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SACM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSACMElement(SACMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Terminology_Switch
