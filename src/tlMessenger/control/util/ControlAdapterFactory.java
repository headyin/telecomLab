/**
 */
package tlMessenger.control.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tlMessenger.control.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tlMessenger.control.ControlPackage
 * @generated
 */
public class ControlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ControlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ControlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlSwitch<Adapter> modelSwitch =
		new ControlSwitch<Adapter>() {
			@Override
			public Adapter caseCommandHandler(CommandHandler object) {
				return createCommandHandlerAdapter();
			}
			@Override
			public Adapter casecommand(command object) {
				return createcommandAdapter();
			}
			@Override
			public Adapter caseCexit(Cexit object) {
				return createCexitAdapter();
			}
			@Override
			public Adapter caseCecho(Cecho object) {
				return createCechoAdapter();
			}
			@Override
			public Adapter caseClogin(Clogin object) {
				return createCloginAdapter();
			}
			@Override
			public Adapter caseClogoff(Clogoff object) {
				return createClogoffAdapter();
			}
			@Override
			public Adapter caseCcreateUser(CcreateUser object) {
				return createCcreateUserAdapter();
			}
			@Override
			public Adapter caseCdeleteUser(CdeleteUser object) {
				return createCdeleteUserAdapter();
			}
			@Override
			public Adapter caseCcreateStore(CcreateStore object) {
				return createCcreateStoreAdapter();
			}
			@Override
			public Adapter caseCsendMessage(CsendMessage object) {
				return createCsendMessageAdapter();
			}
			@Override
			public Adapter caseCqueryMessages(CqueryMessages object) {
				return createCqueryMessagesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.CommandHandler <em>Command Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.CommandHandler
	 * @generated
	 */
	public Adapter createCommandHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.command <em>command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.command
	 * @generated
	 */
	public Adapter createcommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.Cexit <em>Cexit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.Cexit
	 * @generated
	 */
	public Adapter createCexitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.Cecho <em>Cecho</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.Cecho
	 * @generated
	 */
	public Adapter createCechoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.Clogin <em>Clogin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.Clogin
	 * @generated
	 */
	public Adapter createCloginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.Clogoff <em>Clogoff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.Clogoff
	 * @generated
	 */
	public Adapter createClogoffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.CcreateUser <em>Ccreate User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.CcreateUser
	 * @generated
	 */
	public Adapter createCcreateUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.CdeleteUser <em>Cdelete User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.CdeleteUser
	 * @generated
	 */
	public Adapter createCdeleteUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.CcreateStore <em>Ccreate Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.CcreateStore
	 * @generated
	 */
	public Adapter createCcreateStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.CsendMessage <em>Csend Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.CsendMessage
	 * @generated
	 */
	public Adapter createCsendMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link tlMessenger.control.CqueryMessages <em>Cquery Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see tlMessenger.control.CqueryMessages
	 * @generated
	 */
	public Adapter createCqueryMessagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ControlAdapterFactory
