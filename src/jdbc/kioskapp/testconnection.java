package jdbc.kioskapp;
import java.sql.Connection;
public class testconnection {
	
	public static void main(String args[])
	{
		DBController dbCtrl = new DBController();
		
		try {
			Connection connection = dbCtrl.getConnection();
			System.out.println("Connection..........estabished");
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
