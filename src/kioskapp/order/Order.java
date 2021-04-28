package kioskapp.order;

import java.io.Serializable;
import java.util.ArrayList;

import kioskapp.ordereditem.OrderedItem;

/**
 * This class represent order made by a customer
 * 
 * @author emalianakasmuri
 *
 */

@SuppressWarnings("serial")
public class Order implements Serializable {
	// Declaration of attributes
	
	private int orderId;
	private static String orderMode;
	
	// Implementation of 1:M
	private ArrayList<OrderedItem> orderedItems;
	private Double totalAmount;
	private int orderReferenceNumber;
	
	
	/**
	 * to specify Eat in or Take Away
	 */
	public void setOrderMode(String makanMana) {
		this.orderMode = makanMana;
	}
	
	public String getOrderMode() {
		return orderMode;
	}
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	/**
	 * @return the orderedItems
	 */
	public ArrayList<OrderedItem> getOrderedItems() {
		return orderedItems;
	}
	
	/**
	 * @param orderedItems the orderedItems to set
	 */
	public void setOrderedItems(ArrayList<OrderedItem> orderedItems) {
		this.orderedItems = orderedItems;
	}
	
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	
	/**
	 * @param double1 the totalAmount to set
	 */
	public void setTotalAmount(Double double1) {
		this.totalAmount = double1;
	}
	
	/**
	 * @return the orderReferenceNumber
	 */
	public int getOrderReferenceNumber() {
		return orderReferenceNumber;
	}
	
	/**
	 * @param orderReferenceNumber the orderReferenceNumber to set
	 */
	public void setOrderReferenceNumber(int orderReferenceNumber) {
		this.orderReferenceNumber = orderReferenceNumber;
	}
	

}
