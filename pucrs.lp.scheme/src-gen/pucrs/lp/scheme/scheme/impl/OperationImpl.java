/**
 * generated by Xtext 2.17.0
 */
package pucrs.lp.scheme.scheme.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pucrs.lp.scheme.scheme.Operation;
import pucrs.lp.scheme.scheme.SchemePackage;
import pucrs.lp.scheme.scheme.SimpleOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pucrs.lp.scheme.scheme.impl.OperationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link pucrs.lp.scheme.scheme.impl.OperationImpl#getSimpleOperation <em>Simple Operation</em>}</li>
 *   <li>{@link pucrs.lp.scheme.scheme.impl.OperationImpl#getAtom2 <em>Atom2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends CommandImpl implements Operation
{
  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected EList<String> operator;

  /**
   * The cached value of the '{@link #getSimpleOperation() <em>Simple Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleOperation()
   * @generated
   * @ordered
   */
  protected EList<SimpleOperation> simpleOperation;

  /**
   * The cached value of the '{@link #getAtom2() <em>Atom2</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtom2()
   * @generated
   * @ordered
   */
  protected EList<String> atom2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SchemePackage.Literals.OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOperator()
  {
    if (operator == null)
    {
      operator = new EDataTypeEList<String>(String.class, this, SchemePackage.OPERATION__OPERATOR);
    }
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SimpleOperation> getSimpleOperation()
  {
    if (simpleOperation == null)
    {
      simpleOperation = new EObjectContainmentEList<SimpleOperation>(SimpleOperation.class, this, SchemePackage.OPERATION__SIMPLE_OPERATION);
    }
    return simpleOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAtom2()
  {
    if (atom2 == null)
    {
      atom2 = new EDataTypeEList<String>(String.class, this, SchemePackage.OPERATION__ATOM2);
    }
    return atom2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SchemePackage.OPERATION__SIMPLE_OPERATION:
        return ((InternalEList<?>)getSimpleOperation()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SchemePackage.OPERATION__OPERATOR:
        return getOperator();
      case SchemePackage.OPERATION__SIMPLE_OPERATION:
        return getSimpleOperation();
      case SchemePackage.OPERATION__ATOM2:
        return getAtom2();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SchemePackage.OPERATION__OPERATOR:
        getOperator().clear();
        getOperator().addAll((Collection<? extends String>)newValue);
        return;
      case SchemePackage.OPERATION__SIMPLE_OPERATION:
        getSimpleOperation().clear();
        getSimpleOperation().addAll((Collection<? extends SimpleOperation>)newValue);
        return;
      case SchemePackage.OPERATION__ATOM2:
        getAtom2().clear();
        getAtom2().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SchemePackage.OPERATION__OPERATOR:
        getOperator().clear();
        return;
      case SchemePackage.OPERATION__SIMPLE_OPERATION:
        getSimpleOperation().clear();
        return;
      case SchemePackage.OPERATION__ATOM2:
        getAtom2().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SchemePackage.OPERATION__OPERATOR:
        return operator != null && !operator.isEmpty();
      case SchemePackage.OPERATION__SIMPLE_OPERATION:
        return simpleOperation != null && !simpleOperation.isEmpty();
      case SchemePackage.OPERATION__ATOM2:
        return atom2 != null && !atom2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(", atom2: ");
    result.append(atom2);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
