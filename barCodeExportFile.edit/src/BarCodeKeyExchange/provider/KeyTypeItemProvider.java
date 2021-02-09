/**
 */
package BarCodeKeyExchange.provider;


import BarCodeKeyExchange.BarCodeKeyExchangeFactory;
import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.KeyType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BarCodeKeyExchange.KeyType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class KeyTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyTypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIssuerNamePropertyDescriptor(object);
			addIssuerCodePropertyDescriptor(object);
			addVersionTypePropertyDescriptor(object);
			addSignatureAlgorithmPropertyDescriptor(object);
			addSignatureAlgorithmOidPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addPublicKeyPropertyDescriptor(object);
			addBarcodeVersionPropertyDescriptor(object);
			addStartDatePropertyDescriptor(object);
			addEndDatePropertyDescriptor(object);
			addBarcodeXsdPropertyDescriptor(object);
			addLastDayOfSalePropertyDescriptor(object);
			addKeyForgedPropertyDescriptor(object);
			addCommentForEncryptionTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Issuer Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_issuerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_issuerName_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__ISSUER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issuer Code feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuerCodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_issuerCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_issuerCode_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__ISSUER_CODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_versionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_versionType_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__VERSION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signature Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignatureAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_signatureAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_signatureAlgorithm_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__SIGNATURE_ALGORITHM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Signature Algorithm Oid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignatureAlgorithmOidPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_signatureAlgorithmOid_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_signatureAlgorithmOid_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__SIGNATURE_ALGORITHM_OID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_id_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublicKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_publicKey_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_publicKey_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__PUBLIC_KEY,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Barcode Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarcodeVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_barcodeVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_barcodeVersion_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__BARCODE_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Start Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStartDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_startDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_startDate_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__START_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd")));
	}

	/**
	 * This adds a property descriptor for the End Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_endDate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_endDate_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__END_DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd")));
	}

	/**
	 * This adds a property descriptor for the Barcode Xsd feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBarcodeXsdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_barcodeXsd_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_barcodeXsd_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__BARCODE_XSD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Last Day Of Sale feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastDayOfSalePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_lastDayOfSale_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_lastDayOfSale_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__LAST_DAY_OF_SALE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null,
				 URI.createURI("editor://org.eclipse.nebula.widgets.cdatetime/yyyy-MM-dd")));
	}

	/**
	 * This adds a property descriptor for the Key Forged feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyForgedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_keyForged_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_keyForged_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__KEY_FORGED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment For Encryption Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentForEncryptionTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_KeyType_commentForEncryptionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_KeyType_commentForEncryptionType_feature", "_UI_KeyType_type"),
				 BarCodeKeyExchangePackage.Literals.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BarCodeKeyExchangePackage.Literals.KEY_TYPE__PUBLIC_KEY);
			childrenFeatures.add(BarCodeKeyExchangePackage.Literals.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES);
			childrenFeatures.add(BarCodeKeyExchangePackage.Literals.KEY_TYPE__TESTBARCODE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns KeyType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/KeyType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		StringBuffer bf = new StringBuffer();
		bf.append(getString("_UI_KeyType_type")).append(": ");
		if (((KeyType)object).getIssuerName() != null) {
			bf.append(((KeyType)object).getIssuerName()).append(" - ");
			bf.append("Type: ").append(((KeyType)object).getVersionType()).append(" - ");
			bf.append("Id: ").append(((KeyType)object).getId());
		} else {
			bf.append("?");
		}
		
		return bf.toString();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(KeyType.class)) {
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_NAME:
			case BarCodeKeyExchangePackage.KEY_TYPE__ISSUER_CODE:
			case BarCodeKeyExchangePackage.KEY_TYPE__VERSION_TYPE:
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM:
			case BarCodeKeyExchangePackage.KEY_TYPE__SIGNATURE_ALGORITHM_OID:
			case BarCodeKeyExchangePackage.KEY_TYPE__ID:
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_VERSION:
			case BarCodeKeyExchangePackage.KEY_TYPE__START_DATE:
			case BarCodeKeyExchangePackage.KEY_TYPE__END_DATE:
			case BarCodeKeyExchangePackage.KEY_TYPE__BARCODE_XSD:
			case BarCodeKeyExchangePackage.KEY_TYPE__LAST_DAY_OF_SALE:
			case BarCodeKeyExchangePackage.KEY_TYPE__KEY_FORGED:
			case BarCodeKeyExchangePackage.KEY_TYPE__COMMENT_FOR_ENCRYPTION_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BarCodeKeyExchangePackage.KEY_TYPE__PUBLIC_KEY:
			case BarCodeKeyExchangePackage.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES:
			case BarCodeKeyExchangePackage.KEY_TYPE__TESTBARCODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BarCodeKeyExchangePackage.Literals.KEY_TYPE__PUBLIC_KEY,
				 BarCodeKeyExchangeFactory.eINSTANCE.createPublicKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(BarCodeKeyExchangePackage.Literals.KEY_TYPE__ALLOWED_PRODUCT_OWNER_CODES,
				 BarCodeKeyExchangeFactory.eINSTANCE.createAllowedProductOwnerCodesType()));

		newChildDescriptors.add
			(createChildParameter
				(BarCodeKeyExchangePackage.Literals.KEY_TYPE__TESTBARCODE,
				 BarCodeKeyExchangeFactory.eINSTANCE.createTestbarcodeType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BarCodeKeyExchangeEditPlugin.INSTANCE;
	}

}
