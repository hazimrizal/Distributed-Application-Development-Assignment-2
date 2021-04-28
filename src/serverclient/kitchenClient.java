package serverclient;
// Client2 class that
// sends data and receives also
  
import java.io.*;

import java.net.*;
import java.util.ArrayList;

import GraphicalUI.kitchenUI;
import jdbc.kioskapp.jdbcmanager;
import kioskapp.itemproduct.ItemProduct;
import kioskapp.ordereditem.OrderedItem;
import ui.objectStore;
  
public class kitchenClient {
  
	public static void main(String[]args) throws UnknownHostException, IOException, ClassNotFoundException
    {
		kitchenUI k = new kitchenUI();
		k.setVisible(true);
		k.setLocationRelativeTo(null);
		
        // Create server socket
        Socket s = new Socket("localhost", 9999);
        jdbcmanager db = new jdbcmanager();
        
        // to read data coming from the server
        // repeat as long as exit
        
        while (true) {
        	
        	s.setKeepAlive(true);
        	
        	k.addTextlbl("Server is running...");
            // send to the server
             DataInputStream dink = new DataInputStream(s.getInputStream());
             String modek = dink.readUTF();
             System.out.println("sampai sini mode: " + modek);
             
             DataInputStream dinkint = new DataInputStream(s.getInputStream());
             int idk = dinkint.readInt();
             System.out.println("sampai sini int: " + idk);
             
        	 ObjectInputStream oisk = new ObjectInputStream(s.getInputStream());
        	 ArrayList<Integer> objk = new ArrayList<Integer>();
             objk = (ArrayList<Integer>) oisk.readObject();
             
             
             
             String orderDetails = "";
             for(int o : objk) {
            	 ItemProduct ip = new ItemProduct();
     			 ip = db.selectItemAll(o);
            	 OrderedItem oi = new OrderedItem();
            	 oi = db.selectOrderedItemAll(o, idk);
            	 orderDetails += oi.getQuantity() + "x "+ ip.getName() + "\n";
             }
             
             System.out.println(orderDetails);
            
             
             if(modek.equalsIgnoreCase("Eat In")) {
            	 System.out.println("makan dalam");
            	 k.addTextDine(orderDetails);
             }
             else {
            	 System.out.println("makan luar");
            	 k.addTextTake(orderDetails);
             }
            	
            
             
             if(modek.equalsIgnoreCase("0")) {
            	 break;
             }
             
        }
  
        // close connection.
        s.close();
    	}
    }
