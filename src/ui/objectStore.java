package ui;

import java.io.Serializable;
import java.util.ArrayList;

import kioskapp.ordereditem.OrderedItem;

@SuppressWarnings("serial")
public class objectStore implements Serializable{
		String creditCardNum;
		String totalPrice;
		int[] arrayID ;
		int[] arrayQty;
		String mode;
		int num;
		OrderedItem oi;
		public objectStore(String ccn, String totalprice, int[] array, int[] array2 , String ordermode, int ccint) {
			this.creditCardNum = ccn;
			this.totalPrice = totalprice;
			this.arrayQty = array;
			this.arrayID = array2;
			this.mode = ordermode;
			this.num = ccint;
		}
		
		public objectStore(String ordermode, OrderedItem oifrom) {
			this.mode = ordermode;
			this.oi = oifrom;
		}
		
		public objectStore() {};
		
		public void setOrderedItem(OrderedItem oifrom) {
			this.oi = oifrom;
		}
		
		public OrderedItem getOrderedItem() {
			return oi;
		}
		
		public void setcreditCard(String ccn) {
			this.creditCardNum = ccn;
		}
		
		public void setTotalPrice(String totalprice) {
			this.totalPrice = totalprice;
		}
		
		public void setArrayQty(int[] array) {
			this.arrayID = array;
		}
		
		
		public void setArray(int[] array) {
			this.arrayID = array;
		}
		
		public String getcreditCard() {
			return creditCardNum;
		}
		
		public String getTotalPrice() {
			return totalPrice;
		}
		
		public int[] getArrayID(){
			return arrayID;
		}
		
		public int[] getArrayQty(){
			return arrayQty;
		}
		
		public String getMode() {
			return mode;
		}
		
	

		public int getIntCC() {
			// TODO Auto-generated method stub
			return num;
		}
		
	}

