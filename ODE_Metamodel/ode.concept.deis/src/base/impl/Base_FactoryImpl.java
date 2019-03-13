/**
 */
package base.impl;

import base.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Base_FactoryImpl extends EFactoryImpl implements Base_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Base_Factory init() {
		try {
			Base_Factory theBase_Factory = (Base_Factory)EPackage.Registry.INSTANCE.getEFactory(Base_Package.eNS_URI);
			if (theBase_Factory != null) {
				return theBase_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Base_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Base_Package.LANG_STRING: return createLangString();
			case Base_Package.EXPRESSION_LANG_STRING: return createExpressionLangString();
			case Base_Package.MULTI_LANG_STRING: return createMultiLangString();
			case Base_Package.DESCRIPTION: return createDescription();
			case Base_Package.IMPLEMENTATION_CONSTRAINT: return createImplementationConstraint();
			case Base_Package.NOTE: return createNote();
			case Base_Package.TAGGED_VALUE: return createTaggedValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangString createLangString() {
		LangStringImpl langString = new LangStringImpl();
		return langString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionLangString createExpressionLangString() {
		ExpressionLangStringImpl expressionLangString = new ExpressionLangStringImpl();
		return expressionLangString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiLangString createMultiLangString() {
		MultiLangStringImpl multiLangString = new MultiLangStringImpl();
		return multiLangString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description createDescription() {
		DescriptionImpl description = new DescriptionImpl();
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationConstraint createImplementationConstraint() {
		ImplementationConstraintImpl implementationConstraint = new ImplementationConstraintImpl();
		return implementationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Note createNote() {
		NoteImpl note = new NoteImpl();
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaggedValue createTaggedValue() {
		TaggedValueImpl taggedValue = new TaggedValueImpl();
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Base_Package getBase_Package() {
		return (Base_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Base_Package getPackage() {
		return Base_Package.eINSTANCE;
	}

} //Base_FactoryImpl
