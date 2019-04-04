/**
 * generated by Xtext 2.17.0
 */
package pucrs.lp.scheme.scheme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pucrs.lp.scheme.scheme.SchemeFactory
 * @model kind="package"
 * @generated
 */
public interface SchemePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "scheme";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lp.pucrs/scheme/Scheme";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "scheme";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SchemePackage eINSTANCE = pucrs.lp.scheme.scheme.impl.SchemePackageImpl.init();

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.ModelImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.CommandImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ATOM = 0;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.OperationImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 2;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ATOM = COMMAND__ATOM;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__OPERATOR = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Simple Operation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__SIMPLE_OPERATION = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atom2</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__ATOM2 = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.SimpleOperationImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getSimpleOperation()
   * @generated
   */
  int SIMPLE_OPERATION = 3;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OPERATION__OPERATOR = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OPERATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Simple Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_OPERATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.DefineImpl <em>Define</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.DefineImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getDefine()
   * @generated
   */
  int DEFINE = 4;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__ATOM = COMMAND__ATOM;

  /**
   * The feature id for the '<em><b>Name1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__NAME1 = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__PARAMETERS = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE__COMMAND = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Define</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINE_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.ConditionalImpl <em>Conditional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.ConditionalImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getConditional()
   * @generated
   */
  int CONDITIONAL = 5;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__ATOM = COMMAND__ATOM;

  /**
   * The feature id for the '<em><b>At</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__AT = COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__VALUE2 = COMMAND_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL__COMMANDS = COMMAND_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link pucrs.lp.scheme.scheme.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see pucrs.lp.scheme.scheme.impl.ParameterImpl
   * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 6;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ATOM = COMMAND__ATOM;

  /**
   * The feature id for the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__N = COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = COMMAND_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see pucrs.lp.scheme.scheme.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link pucrs.lp.scheme.scheme.Model#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see pucrs.lp.scheme.scheme.Model#getCommands()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Commands();

  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see pucrs.lp.scheme.scheme.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the attribute '{@link pucrs.lp.scheme.scheme.Command#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atom</em>'.
   * @see pucrs.lp.scheme.scheme.Command#getAtom()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_Atom();

  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see pucrs.lp.scheme.scheme.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the attribute list '{@link pucrs.lp.scheme.scheme.Operation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see pucrs.lp.scheme.scheme.Operation#getOperator()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Operator();

  /**
   * Returns the meta object for the containment reference list '{@link pucrs.lp.scheme.scheme.Operation#getSimpleOperation <em>Simple Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Simple Operation</em>'.
   * @see pucrs.lp.scheme.scheme.Operation#getSimpleOperation()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_SimpleOperation();

  /**
   * Returns the meta object for the attribute list '{@link pucrs.lp.scheme.scheme.Operation#getAtom2 <em>Atom2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Atom2</em>'.
   * @see pucrs.lp.scheme.scheme.Operation#getAtom2()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_Atom2();

  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.SimpleOperation <em>Simple Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Operation</em>'.
   * @see pucrs.lp.scheme.scheme.SimpleOperation
   * @generated
   */
  EClass getSimpleOperation();

  /**
   * Returns the meta object for the attribute list '{@link pucrs.lp.scheme.scheme.SimpleOperation#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Operator</em>'.
   * @see pucrs.lp.scheme.scheme.SimpleOperation#getOperator()
   * @see #getSimpleOperation()
   * @generated
   */
  EAttribute getSimpleOperation_Operator();

  /**
   * Returns the meta object for the attribute list '{@link pucrs.lp.scheme.scheme.SimpleOperation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see pucrs.lp.scheme.scheme.SimpleOperation#getValue()
   * @see #getSimpleOperation()
   * @generated
   */
  EAttribute getSimpleOperation_Value();

  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.Define <em>Define</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Define</em>'.
   * @see pucrs.lp.scheme.scheme.Define
   * @generated
   */
  EClass getDefine();

  /**
   * Returns the meta object for the attribute '{@link pucrs.lp.scheme.scheme.Define#getName1 <em>Name1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name1</em>'.
   * @see pucrs.lp.scheme.scheme.Define#getName1()
   * @see #getDefine()
   * @generated
   */
  EAttribute getDefine_Name1();

  /**
   * Returns the meta object for the containment reference list '{@link pucrs.lp.scheme.scheme.Define#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see pucrs.lp.scheme.scheme.Define#getParameters()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link pucrs.lp.scheme.scheme.Define#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command</em>'.
   * @see pucrs.lp.scheme.scheme.Define#getCommand()
   * @see #getDefine()
   * @generated
   */
  EReference getDefine_Command();

  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.Conditional <em>Conditional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional</em>'.
   * @see pucrs.lp.scheme.scheme.Conditional
   * @generated
   */
  EClass getConditional();

  /**
   * Returns the meta object for the attribute list '{@link pucrs.lp.scheme.scheme.Conditional#getAt <em>At</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>At</em>'.
   * @see pucrs.lp.scheme.scheme.Conditional#getAt()
   * @see #getConditional()
   * @generated
   */
  EAttribute getConditional_At();

  /**
   * Returns the meta object for the attribute '{@link pucrs.lp.scheme.scheme.Conditional#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see pucrs.lp.scheme.scheme.Conditional#getValue2()
   * @see #getConditional()
   * @generated
   */
  EAttribute getConditional_Value2();

  /**
   * Returns the meta object for the containment reference list '{@link pucrs.lp.scheme.scheme.Conditional#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see pucrs.lp.scheme.scheme.Conditional#getCommands()
   * @see #getConditional()
   * @generated
   */
  EReference getConditional_Commands();

  /**
   * Returns the meta object for class '{@link pucrs.lp.scheme.scheme.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see pucrs.lp.scheme.scheme.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link pucrs.lp.scheme.scheme.Parameter#getN <em>N</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>N</em>'.
   * @see pucrs.lp.scheme.scheme.Parameter#getN()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_N();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SchemeFactory getSchemeFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.ModelImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.CommandImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__ATOM = eINSTANCE.getCommand_Atom();

    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.OperationImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__OPERATOR = eINSTANCE.getOperation_Operator();

    /**
     * The meta object literal for the '<em><b>Simple Operation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__SIMPLE_OPERATION = eINSTANCE.getOperation_SimpleOperation();

    /**
     * The meta object literal for the '<em><b>Atom2</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__ATOM2 = eINSTANCE.getOperation_Atom2();

    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.SimpleOperationImpl <em>Simple Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.SimpleOperationImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getSimpleOperation()
     * @generated
     */
    EClass SIMPLE_OPERATION = eINSTANCE.getSimpleOperation();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_OPERATION__OPERATOR = eINSTANCE.getSimpleOperation_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_OPERATION__VALUE = eINSTANCE.getSimpleOperation_Value();

    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.DefineImpl <em>Define</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.DefineImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getDefine()
     * @generated
     */
    EClass DEFINE = eINSTANCE.getDefine();

    /**
     * The meta object literal for the '<em><b>Name1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINE__NAME1 = eINSTANCE.getDefine_Name1();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__PARAMETERS = eINSTANCE.getDefine_Parameters();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINE__COMMAND = eINSTANCE.getDefine_Command();

    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.ConditionalImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getConditional()
     * @generated
     */
    EClass CONDITIONAL = eINSTANCE.getConditional();

    /**
     * The meta object literal for the '<em><b>At</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL__AT = eINSTANCE.getConditional_At();

    /**
     * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONDITIONAL__VALUE2 = eINSTANCE.getConditional_Value2();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL__COMMANDS = eINSTANCE.getConditional_Commands();

    /**
     * The meta object literal for the '{@link pucrs.lp.scheme.scheme.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see pucrs.lp.scheme.scheme.impl.ParameterImpl
     * @see pucrs.lp.scheme.scheme.impl.SchemePackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>N</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__N = eINSTANCE.getParameter_N();

  }

} //SchemePackage
