package ui;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;

import ui.objectStore;


public class testingui implements Serializable{
	//static String creditCard_1;
	
	
	public static void main(String[] args) throws  UnknownHostException, IOException, InterruptedException, SQLException, ClassNotFoundException{
		
		FirstInterface start = new FirstInterface();
		start.setVisible(true);
		
		Socket socketToServer = new Socket("localhost",9999);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true)
		{
			System.out.print("Sampai sini saja ku disini 0");
			String cc = start.getCreditCard();
			String price =start.getTotalPrice();
			int[] qty = start.getQty();
			int[] item = start.getID();
			String mode = start.getMode();
			int intcc = start.getIntCreditCard();
			
			objectStore objc = new objectStore(cc, price, qty, item, mode, intcc);
			System.out.print("Sampai sini saja ku disini");
			
			ArrayList<objectStore> capsulator = new ArrayList<objectStore>();
			capsulator.add(objc);
			
			ObjectOutputStream oosc = new ObjectOutputStream(socketToServer.getOutputStream());
			oosc.writeObject(capsulator);
			System.out.print("Sampai sini saja ku disini 1");
			
			if(start.getTotalPrice() == ("exit")){
				break;
			}
			
		}
		socketToServer.close();
		
	
		
	}

}
