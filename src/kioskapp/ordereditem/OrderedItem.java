package kioskapp.ordereditem;
import java.io.Serializable;

import kioskapp.itemproduct.ItemProduct;

/**
 * 
 * This class represent an item product ordered by a customer.
 * 
 * @author emalianakasmuri
 *
 */

@SuppressWarnings("serial")
public class OrderedItem implements Serializable {
	
	// Declaration of attributes
	private int orderedItem;	
	
	// Implementation of 1:1
	private ItemProduct itemProduct;
	
	private int quantity;
	private float subTotalAmount;
	
	/**
	 * @return the orderedItem
	 */
	public int getOrderedItem() {
		return orderedItem;
	}
	
	/**
	 * @param orderedItem the orderedItem to set
	 */
	public void setOrderedItem(int orderedItem) {
		this.orderedItem = orderedItem;
	}
	
	/**
	 * @return the itemProduct
	 */
	public int getItemProduct() {
		return itemProduct.getItemProduct();
	}
//	
//	public void setip(int itemid) {
//		this.
//	}
	
	public ItemProduct getIP() {
		return itemProduct;
	}
	
	/**
	 * @param itemProduct the itemProduct to set
	 */
	public void setItemProduct(ItemProduct itemProduct) {
		this.itemProduct = itemProduct;
	}
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * @return the subTotalAmount
	 */
	public float getSubTotalAmount() {
		return subTotalAmount;
	}
	
	/**
	 * @param subTotalAmount the subTotalAmount to set
	 */
	public void setSubTotalAmount(float subTotalAmount) {
		this.subTotalAmount = subTotalAmount;
	}
	
	
	
	
	
	
	
	

}
