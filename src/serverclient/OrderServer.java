package serverclient;

import java.awt.EventQueue;

import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import GraphicalUI.OrderServerUI;
import jdbc.kioskapp.jdbcmanager;
import kioskapp.itemproduct.ItemProduct;
import kioskapp.order.Order;
import kioskapp.ordereditem.OrderedItem;
import kioskapp.ordertransaction.OrderTransaction;
import ui.objectStore;


//server read
@SuppressWarnings("serial")
public class OrderServer implements Serializable{

	@SuppressWarnings({ "unchecked", "null" })
	public static void main(String[] args) throws Exception
	{  
		//port number for Order Server : 9999
		OrderServerUI frame = new OrderServerUI();
		frame.setVisible(true);
		
		int intport = 9999;
		ServerSocket serversocket = new ServerSocket(intport); 
		
		Socket socket = serversocket.accept(); 		 
		Socket kitchenSocket = serversocket.accept(); //accept to send to kitchen
		
		
		frame.addText("Order Server: Connection Established");
		
		ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
		
		Socket transactionSocket = new Socket(InetAddress.getLocalHost(),9998);
		DataOutputStream dout = new DataOutputStream(transactionSocket.getOutputStream());
		
		
		@SuppressWarnings("unused")
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		jdbcmanager db = new jdbcmanager(); Random rand = new Random();
		
		Order order = new Order();
		
		OrderedItem oi = new OrderedItem();
		ItemProduct ip = new ItemProduct();
		OrderTransaction ot = new OrderTransaction();
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		 LocalDateTime now = LocalDateTime.now();  
		 System.out.println(dtf.format(now));  
		
		while (true)
		{	
			//receive from client
			ArrayList<objectStore> dummy = new ArrayList<objectStore>();
			dummy = (ArrayList<objectStore>)ois.readObject();
//			objs = (objectStore)ois.readObject();
			System.out.println("sampai sini adhwa");
//			System.out.print(("server received objs: " + objs.getcreditCard()));

			objectStore objs = new objectStore();
			objs = dummy.get(0);
			
			String strcc = objs.getcreditCard();
			String strNew = strcc.replace("-", "");
			
			double totalprice = Double.valueOf(objs.getTotalPrice());
			frame.addText("Getting credit card number from kiosk");
			frame.addText(objs.getcreditCard());
			//sending to credit card server
			ObjectOutputStream oos = new ObjectOutputStream(transactionSocket.getOutputStream());
			frame.addText("Sending credit card number to the Credit Card Server");
			oos.writeObject(objs.getcreditCard());
			
			System.out.print("Sampai ke sini tak(1.1)");
			
			//receiving response from credit card server
			DataInputStream ccdis = new DataInputStream(transactionSocket.getInputStream());
			frame.addText("Receiving validation from Credit Card Server");
			boolean isValid = ccdis.readBoolean();
			ArrayList<Integer> oilist = new ArrayList<Integer>();
			//if the credit card is accepted
			if(isValid) {
				//message for validation
				frame.addText("Card validated. Accepted");
				
				//setting Order class
				order.setOrderId(rand.nextInt(1000));
				order.setOrderMode(objs.getMode());
				order.setOrderReferenceNumber(rand.nextInt(2000));
				order.setTotalAmount(totalprice);
				
				db.addOrder(order);
				
				//setting ItemProduct and OrderedItems' arrayLists
				int[] qty = objs.getArrayQty();
				for(int i = 0; i < objs.getArrayID().length ; i++) {
					if(qty[i] != 0) {
						ip.setItemProduct(i+1);
						ip.setName(db.selectItemAll(i+1).getName());
						ip.setPrice(db.selectItem(i+1));
						
						oi.setItemProduct(ip);
						oi.setOrderedItem(rand.nextInt(3000));
						
						oi.setQuantity(qty[i]);
						oi.setSubTotalAmount(ip.getPrice()*qty[i]);
						
//						adding to the OrderedItem table
						//oilist.add(ip.getItemProduct());
						
						db.addOrderedItems(oi, order);
					}
				}
				oilist = db.selectOrderedItem(order.getOrderId());
				for(int o : oilist) {
				System.out.println("------ : " + o);
				}
				
				DataOutputStream kdin = new DataOutputStream(kitchenSocket.getOutputStream());
				kdin.writeUTF(order.getOrderMode());
				kdin.flush();
				kdin.writeInt(order.getOrderId());
				
				ObjectOutputStream kois = new ObjectOutputStream(kitchenSocket.getOutputStream());
				kois.writeObject(oilist);
				kois.reset(); 
				kois.flush();
			}
			//if the credit card is rejected
			else {
				//message for validation
				frame.addText("Card validated. Rejected");
			}
			
			//setting orderTransaction
			ot.setAmountCharged(totalprice);
			ot.setOrder(order);
			ot.setOrderMode(objs.getMode());
			
			String str = "";
			for(int i = 12; i < objs.getcreditCard().length(); i++) {
				str = str + objs.getcreditCard().charAt(i);
			}
			System.out.println(str);
			ot.setLast4Digits(str);
			ot.setOrderTransactionId(rand.nextInt(4000));
			ot.setTransactioDate(dtf.format(now));
			ot.setTransactionStatus(isValid);
			ot.setOrderMode(objs.getMode());
			
			System.out.print(ot.getOrderMode());
			
			//addding to the OrderTransaction table
			db.addOrderTransaction(ot);
			
			//message to the server
			frame.addText("kioskappdb_dev database updated");
			
			//writing receipt into txt file
				Writer w = new FileWriter("Receipt"+order.getOrderId()+".txt");
				
				String resit = writeReceipt(order, ot, oilist);
				w.write(resit);
				w.close();
				
				System.out.println(resit);
				
			frame.addText("Receipt printed");
			
			
			if(objs.getcreditCard().equals(-1))
			{
				break;
			}
			
		}
		socket.close();
		serversocket.close();
	}
	
	//function to print receipt
	public static String writeReceipt(Order order, OrderTransaction ot, ArrayList<Integer> oilist2 ) throws IOException {
		jdbcmanager db2 = new jdbcmanager();
		int oid = order.getOrderId();
		ItemProduct ip = new ItemProduct();
		String receipt =  
				"                       MCDey\n"
				+ "------------------------------------------------\n"
				+ "\n"
				+ "-------------------------------------------------\n"
				+ "Tax Invoice: "+ ot.getOrderTransactionId()+"\n "
				+ "Date: "+ ot.getTransactioDate() + "\n"
				+ "------------------------------------------------\n"
				+ "			-----" + ot.getOrderMode()+"----- \n"
				+ "Qty	Item			Price(RM)\n"
				+ "------------------------------------------------\n";
		for(int oi : oilist2) {
			OrderedItem itemordered = new OrderedItem() ;
			itemordered = db2.selectOrderedItemAll(oi, oid);
			ip = db2.selectItemAll(oi);
		receipt	+=  itemordered.getQuantity()+ "  " + ip.getName() + " " + String.format("%4.2f",itemordered.getSubTotalAmount()) + "\n";
		}
	receipt +=    "------------------------------------------------\n"
				
				+ "TOTAL:				"+String.format("%4.2f",order.getTotalAmount()) +"\n"
				+ "------------------------------------------------\n"
				+ "PAYMENT:				"
				+ "" + String.format("%4.2f",order.getTotalAmount()) +"\n"
				+ "------------------------------------------------\n"
				+ "************************************************\n"
				+ "				Share your experience at\n"
				+ "					www.mcdey.com.sg	\n"		
				+ "				within the next 5 days \n\n"
				+ "                    THANK YOU         \n";
		
		return receipt;
	}
	

	

}