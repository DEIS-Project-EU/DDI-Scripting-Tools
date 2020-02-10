/**
 */
package top.argumentation.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import top.argumentation.ArgumentationPackage;
import top.argumentation.ArtifactReference;

import top.base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.argumentation.impl.ArtifactReferenceImpl#getReferencedArtifactElement <em>Referenced Artifact Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactReferenceImpl extends ArgumentAssetImpl implements ArtifactReference {
	/**
	 * The cached value of the '{@link #getReferencedArtifactElement() <em>Referenced Artifact Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedArtifactElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactElement> referencedArtifactElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArgumentationPackage.Literals.ARTIFACT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ArtifactElement> getReferencedArtifactElement() {
		if (referencedArtifactElement == null) {
			referencedArtifactElement = new EObjectResolvingEList<ArtifactElement>(ArtifactElement.class, this, ArgumentationPackage.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT);
		}
		return referencedArtifactElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ArgumentationPackage.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT:
				return getReferencedArtifactElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ArgumentationPackage.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT:
				getReferencedArtifactElement().clear();
				getReferencedArtifactElement().addAll((Collection<? extends ArtifactElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ArgumentationPackage.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT:
				getReferencedArtifactElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ArgumentationPackage.ARTIFACT_REFERENCE__REFERENCED_ARTIFACT_ELEMENT:
				return referencedArtifactElement != null && !referencedArtifactElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArtifactReferenceImpl
