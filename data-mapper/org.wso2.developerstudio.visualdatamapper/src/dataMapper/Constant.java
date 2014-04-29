/**
 */
package dataMapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dataMapper.Constant#getConstantValue <em>Constant Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see dataMapper.DataMapperPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Operator {

	/**
	 * Returns the value of the '<em><b>Constant Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Value</em>' attribute.
	 * @see #setConstantValue(String)
	 * @see dataMapper.DataMapperPackage#getConstant_ConstantValue()
	 * @model
	 * @generated
	 */
	String getConstantValue();

	/**
	 * Sets the value of the '{@link dataMapper.Constant#getConstantValue <em>Constant Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Value</em>' attribute.
	 * @see #getConstantValue()
	 * @generated
	 */
	void setConstantValue(String value);
} // Constant
