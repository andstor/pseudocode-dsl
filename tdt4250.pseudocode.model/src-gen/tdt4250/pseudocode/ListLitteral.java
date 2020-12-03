/**
 */
package tdt4250.pseudocode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Litteral</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.pseudocode.ListLitteral#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see tdt4250.pseudocode.PseudocodePackage#getListLitteral()
 * @model
 * @generated
 */
public interface ListLitteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.pseudocode.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see tdt4250.pseudocode.PseudocodePackage#getListLitteral_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getElements();

} // ListLitteral