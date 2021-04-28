package test;

import kioskapp.ordereditem.OrderedItem;

public class testreceipt {

	public static void main(String[] args) {
		
		String receipt =  "                MCDey RECEIPT\n"
				+ "------------------------------------------------\n"
				+ "               SALES RECEIPT    \n"
				+ "-------------------------------------------------\n"
				+ ""+ "ot.getOrderTransactionId()"+"                    "+ "ot.getTransactioDate()"
				+ "------------------------------------------------\n"
				+ "Qty	Item			Price(RM)\n"
				+ "------------------------------------------------\n";
//		for(OrderedItem oi : oiList) {
//		receipt	+= oi.getQuantity() + " " + String.format("%4.2f",oi.getSubTotalAmount()) + "\n";
//		}
		receipt += 		  "------------------------------------------------\n"
				+ "Order mode: "+"ot.getOrderMode()"+"\n"
				
				+ "------------------------------------------------\n"
				+ "TOTAL:			      "+ "total amount "+"\n"
				+ "------------------------------------------------\n"
				+ "paid with:\n"
				+ "**** **** **** "+ "ot.getLast4Digits()" +"\n"
				+ "TRANSACTION STATUS: "+ "ot.isTransactionStatus()" +"\n"
				+ "------------------------------------------------\n"
				+ "------------------------------------------------\n"
				+ "                    THANK YOU         \n"
				+ "\n"
				+ "\n";
		
			System.out.print(receipt);
	}

}
