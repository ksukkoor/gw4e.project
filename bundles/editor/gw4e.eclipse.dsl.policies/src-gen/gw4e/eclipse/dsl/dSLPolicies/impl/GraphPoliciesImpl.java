/**
 * generated by Xtext 2.12.0
 */
package gw4e.eclipse.dsl.dSLPolicies.impl;

import gw4e.eclipse.dsl.dSLPolicies.DSLPoliciesPackage;
import gw4e.eclipse.dsl.dSLPolicies.GraphPolicies;
import gw4e.eclipse.dsl.dSLPolicies.Policies;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph Policies</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gw4e.eclipse.dsl.dSLPolicies.impl.GraphPoliciesImpl#getGraphModelPolicies <em>Graph Model Policies</em>}</li>
 *   <li>{@link gw4e.eclipse.dsl.dSLPolicies.impl.GraphPoliciesImpl#getPolicies <em>Policies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphPoliciesImpl extends MinimalEObjectImpl.Container implements GraphPolicies
{
  /**
   * The default value of the '{@link #getGraphModelPolicies() <em>Graph Model Policies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphModelPolicies()
   * @generated
   * @ordered
   */
  protected static final String GRAPH_MODEL_POLICIES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGraphModelPolicies() <em>Graph Model Policies</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGraphModelPolicies()
   * @generated
   * @ordered
   */
  protected String graphModelPolicies = GRAPH_MODEL_POLICIES_EDEFAULT;

  /**
   * The cached value of the '{@link #getPolicies() <em>Policies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPolicies()
   * @generated
   * @ordered
   */
  protected EList<Policies> policies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GraphPoliciesImpl()
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
    return DSLPoliciesPackage.Literals.GRAPH_POLICIES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGraphModelPolicies()
  {
    return graphModelPolicies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGraphModelPolicies(String newGraphModelPolicies)
  {
    String oldGraphModelPolicies = graphModelPolicies;
    graphModelPolicies = newGraphModelPolicies;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPoliciesPackage.GRAPH_POLICIES__GRAPH_MODEL_POLICIES, oldGraphModelPolicies, graphModelPolicies));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Policies> getPolicies()
  {
    if (policies == null)
    {
      policies = new EObjectContainmentEList<Policies>(Policies.class, this, DSLPoliciesPackage.GRAPH_POLICIES__POLICIES);
    }
    return policies;
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
      case DSLPoliciesPackage.GRAPH_POLICIES__POLICIES:
        return ((InternalEList<?>)getPolicies()).basicRemove(otherEnd, msgs);
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
      case DSLPoliciesPackage.GRAPH_POLICIES__GRAPH_MODEL_POLICIES:
        return getGraphModelPolicies();
      case DSLPoliciesPackage.GRAPH_POLICIES__POLICIES:
        return getPolicies();
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
      case DSLPoliciesPackage.GRAPH_POLICIES__GRAPH_MODEL_POLICIES:
        setGraphModelPolicies((String)newValue);
        return;
      case DSLPoliciesPackage.GRAPH_POLICIES__POLICIES:
        getPolicies().clear();
        getPolicies().addAll((Collection<? extends Policies>)newValue);
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
      case DSLPoliciesPackage.GRAPH_POLICIES__GRAPH_MODEL_POLICIES:
        setGraphModelPolicies(GRAPH_MODEL_POLICIES_EDEFAULT);
        return;
      case DSLPoliciesPackage.GRAPH_POLICIES__POLICIES:
        getPolicies().clear();
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
      case DSLPoliciesPackage.GRAPH_POLICIES__GRAPH_MODEL_POLICIES:
        return GRAPH_MODEL_POLICIES_EDEFAULT == null ? graphModelPolicies != null : !GRAPH_MODEL_POLICIES_EDEFAULT.equals(graphModelPolicies);
      case DSLPoliciesPackage.GRAPH_POLICIES__POLICIES:
        return policies != null && !policies.isEmpty();
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (graphModelPolicies: ");
    result.append(graphModelPolicies);
    result.append(')');
    return result.toString();
  }

} //GraphPoliciesImpl