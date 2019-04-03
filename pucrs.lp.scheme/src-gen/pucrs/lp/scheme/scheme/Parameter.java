/**
 * generated by Xtext 2.15.0
 */
package pucrs.lp.scheme.scheme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pucrs.lp.scheme.scheme.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link pucrs.lp.scheme.scheme.Parameter#getAtom <em>Atom</em>}</li>
 * </ul>
 *
 * @see pucrs.lp.scheme.scheme.SchemePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Command
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see pucrs.lp.scheme.scheme.SchemePackage#getParameter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link pucrs.lp.scheme.scheme.Parameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atom</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' attribute.
   * @see #setAtom(String)
   * @see pucrs.lp.scheme.scheme.SchemePackage#getParameter_Atom()
   * @model
   * @generated
   */
  String getAtom();

  /**
   * Sets the value of the '{@link pucrs.lp.scheme.scheme.Parameter#getAtom <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' attribute.
   * @see #getAtom()
   * @generated
   */
  void setAtom(String value);

} // Parameter