package serverclient;
// Client2 class that
// sends data and receives also
  
import java.io.*;
import java.net.*;

import GraphicalUI.clientui;
  
public class client {
  
    public static void main(String[]args) throws Exception
    {
    	clientui cli = new clientui();
    	cli.setVisible(true);
    	cli.setLocationRelativeTo(null);
    	
    	cli.addText("Client started.");
    	
    	try(
        // Create client socket
        Socket s = new Socket("localhost", 8003);
    	Socket s2 = new Socket("localhost", 8004);
  
        // to send data to the server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    			
    	// to send data to the server2
    	DataOutputStream dos2 = new DataOutputStream(s2.getOutputStream());
  
        // to read data coming from the server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    	
    	// to read data coming from the server2
    	BufferedReader br2 = new BufferedReader(new InputStreamReader(s2.getInputStream()));
    	    	
    	){
        // to read data from the keyboard
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
       
        String str, str1, str2;
  
        // repeat as long as exit
        // is not typed at client
        while (!(str = kb.readLine()).equals("exit")) {
  
            // send to the server
            dos.writeBytes("Client sending to order server : " +str + "\n");
            // send to the server
            dos2.writeBytes("Client sending to server 2 : " +str + "\n");
  
            // receive from the server
            str1 = br.readLine();
            str2 = br2.readLine();
  
            cli.addText("Server receiving data from OrderServer : " +str1);
            cli.addText("Server2 receiving data from CCVSERVER : " +str2);
        }
    	
        
        // close connection.
        dos.close();
        br.close();
        kb.close();
        s.close();
    	}
    }
}