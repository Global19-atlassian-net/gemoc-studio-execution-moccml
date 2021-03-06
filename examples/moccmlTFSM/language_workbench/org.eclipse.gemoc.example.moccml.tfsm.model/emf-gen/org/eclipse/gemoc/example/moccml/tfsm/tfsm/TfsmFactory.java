/**
 */
package org.eclipse.gemoc.example.moccml.tfsm.tfsm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.gemoc.example.moccml.tfsm.tfsm.TfsmPackage
 * @generated
 */
public interface TfsmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TfsmFactory eINSTANCE = org.eclipse.gemoc.example.moccml.tfsm.tfsm.impl.TfsmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>TFSM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TFSM</em>'.
	 * @generated
	 */
	TFSM createTFSM();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Temporal Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temporal Guard</em>'.
	 * @generated
	 */
	TemporalGuard createTemporalGuard();

	/**
	 * Returns a new object of class '<em>Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Guard</em>'.
	 * @generated
	 */
	EventGuard createEventGuard();

	/**
	 * Returns a new object of class '<em>FSM Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Event</em>'.
	 * @generated
	 */
	FSMEvent createFSMEvent();

	/**
	 * Returns a new object of class '<em>FSM Clock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FSM Clock</em>'.
	 * @generated
	 */
	FSMClock createFSMClock();

	/**
	 * Returns a new object of class '<em>Timed System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timed System</em>'.
	 * @generated
	 */
	TimedSystem createTimedSystem();

	/**
	 * Returns a new object of class '<em>Evaluate Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluate Guard</em>'.
	 * @generated
	 */
	EvaluateGuard createEvaluateGuard();

	/**
	 * Returns a new object of class '<em>Integer Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Variable</em>'.
	 * @generated
	 */
	IntegerVariable createIntegerVariable();

	/**
	 * Returns a new object of class '<em>Boolean Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Variable</em>'.
	 * @generated
	 */
	BooleanVariable createBooleanVariable();

	/**
	 * Returns a new object of class '<em>Opaque Boolean Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Boolean Expression</em>'.
	 * @generated
	 */
	OpaqueBooleanExpression createOpaqueBooleanExpression();

	/**
	 * Returns a new object of class '<em>Opaque Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Opaque Integer Expression</em>'.
	 * @generated
	 */
	OpaqueIntegerExpression createOpaqueIntegerExpression();

	/**
	 * Returns a new object of class '<em>Integer Calculation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Calculation Expression</em>'.
	 * @generated
	 */
	IntegerCalculationExpression createIntegerCalculationExpression();

	/**
	 * Returns a new object of class '<em>Integer Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Integer Comparison Expression</em>'.
	 * @generated
	 */
	IntegerComparisonExpression createIntegerComparisonExpression();

	/**
	 * Returns a new object of class '<em>Boolean Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Unary Expression</em>'.
	 * @generated
	 */
	BooleanUnaryExpression createBooleanUnaryExpression();

	/**
	 * Returns a new object of class '<em>Boolean Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Binary Expression</em>'.
	 * @generated
	 */
	BooleanBinaryExpression createBooleanBinaryExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TfsmPackage getTfsmPackage();

} //TfsmFactory
