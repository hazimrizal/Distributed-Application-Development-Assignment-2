package serverclient;

import java.io.BufferedReader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JOptionPane;

import GraphicalUI.creditCardServerUI;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class creditCardServer {
	
	public static void main(String[] args) throws Exception
	{
		creditCardServerUI creditServer = new creditCardServerUI();
		creditServer.setVisible(true);
		
		int ccport = 9998;
		ServerSocket serversocket = new ServerSocket(ccport);
		Socket socket = serversocket.accept();
		creditServer.addText("Credit card server: Connection Established");
		DataInputStream din = new DataInputStream(socket.getInputStream());
		
		Socket ssocket = new Socket(InetAddress.getLocalHost(),9999);
		//DataOutputStream dout = new DataOutputStream(ssocket.getOutputStream());
		@SuppressWarnings("unused")
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("sampai2");
		
		while (true)
		{
			boolean isValid = true;
			
			ObjectInputStream discc = new ObjectInputStream(socket.getInputStream());
			String creditCardNum = (String)discc.readObject();
			System.out.print(creditCardNum);
			creditServer.addText(creditCardNum);
			
			if(creditCardNum.length() == 16) {
				creditServer.addText("Credit card valid. Transaction accepted");
				JOptionPane.showMessageDialog(creditServer, "Credit card valid. Transaction accepted");
				isValid = true;
			}
			else {
				creditServer.addText("Credit card invalid.Transaction rejected");
				JOptionPane.showMessageDialog(creditServer, "Credit card invalid. Transaction rejected");
				isValid = false;
			}
			
			DataOutputStream doscc = new DataOutputStream(socket.getOutputStream());
			creditServer.addText("Sending response from Credit Card Server");
			doscc.writeBoolean(isValid);
			
			if(creditCardNum.equalsIgnoreCase("0"))
					break;
		}
		socket.close();
		serversocket.close();
	}
}