/**
 */
package BarCodeKeyExchange.provider;


import BarCodeKeyExchange.BarCodeKeyExchangePackage;
import BarCodeKeyExchange.BarcodeStructureType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemFontProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link BarCodeKeyExchange.BarcodeStructureType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BarcodeStructureTypeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource,
		IItemFontProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarcodeStructureTypeItemProvider(AdapterFactory adapterFactory) {
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
			addIdPropertyDescriptor(object);
			addBarcodeVersionPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
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
				 getString("_UI_BarcodeStructureType_issuerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BarcodeStructureType_issuerName_feature", "_UI_BarcodeStructureType_type"),
				 BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE__ISSUER_NAME,
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
				 getString("_UI_BarcodeStructureType_issuerCode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BarcodeStructureType_issuerCode_feature", "_UI_BarcodeStructureType_type"),
				 BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE__ISSUER_CODE,
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
				 getString("_UI_BarcodeStructureType_versionType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BarcodeStructureType_versionType_feature", "_UI_BarcodeStructureType_type"),
				 BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE__VERSION_TYPE,
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
				 getString("_UI_BarcodeStructureType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BarcodeStructureType_id_feature", "_UI_BarcodeStructureType_type"),
				 BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
				 getString("_UI_BarcodeStructureType_barcodeVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BarcodeStructureType_barcodeVersion_feature", "_UI_BarcodeStructureType_type"),
				 BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BarcodeStructureType_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BarcodeStructureType_description_feature", "_UI_BarcodeStructureType_type"),
				 BarCodeKeyExchangePackage.Literals.BARCODE_STRUCTURE_TYPE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BarcodeStructureType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BarcodeStructureType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BarcodeStructureType)object).getIssuerName();
		return label == null || label.length() == 0 ?
			getString("_UI_BarcodeStructureType_type") :
			getString("_UI_BarcodeStructureType_type") + " " + label;
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

		switch (notification.getFeatureID(BarcodeStructureType.class)) {
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_NAME:
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ISSUER_CODE:
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__VERSION_TYPE:
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__ID:
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__BARCODE_VERSION:
			case BarCodeKeyExchangePackage.BARCODE_STRUCTURE_TYPE__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
