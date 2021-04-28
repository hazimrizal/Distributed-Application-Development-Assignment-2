package kioskapp.ordertransaction;

import java.io.Serializable;
import java.sql.Date;

import kioskapp.order.Order;

/**
 * 
 * This class represent the payment made on the placed order by the customer
 * 
 * 
 * @author emalianakasmuri
 *
 */

@SuppressWarnings("serial")
public class OrderTransaction implements Serializable {
	
	// Declaration of attributes
	
	private int orderTransactionId;
	private String transactioDate;
	private double amountCharged;
	private boolean transactionStatus;
	private String last4Digits;
	private String orderMode;
	
	/* Implementation of 1:1 */
	private Order order;

	/**
	 * @return the orderTransactionId
	 */
	public int getOrderTransactionId() {
		return orderTransactionId;
	}

	/**
	 * @param orderTransactionId the orderTransactionId to set
	 */
	public void setOrderTransactionId(int orderTransactionId) {
		this.orderTransactionId = orderTransactionId;
	}

	/**
	 * @return the transactioDate
	 */
	public String getTransactioDate() {
		return transactioDate;
	}

	/**
	 * @param string the transactioDate to set
	 */
	public void setTransactioDate(String string) {
		this.transactioDate = string;
	}

	/**
	 * @return the amountCharged
	 */
	public double getAmountCharged() {
		return amountCharged;
	}

	/**
	 * @param d the amountCharged to set
	 */
	public void setAmountCharged(double d) {
		this.amountCharged = d;
	}

	/**
	 * @return the transactionStatus
	 */
	public boolean isTransactionStatus() {
		return transactionStatus;
	}

	/**
	 * @param transactionStatus the transactionStatus to set
	 */
	public void setTransactionStatus(boolean transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	/**
	 * @return the last4Digits
	 */
	public String getLast4Digits() {
		return last4Digits;
	}

	/**
	 * @param string the last4Digits to set
	 */
	public void setLast4Digits(String string) {
		this.last4Digits = string;
	}

	/**
	 * @return the order
	 */
	public int getOrder() {
		return order.getOrderId();
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the orderMode
	 */
	public String getOrderMode() {
		return orderMode;
	}
	


	/**
	 * @param orderMode the orderMode to set
	 */
	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	

}
