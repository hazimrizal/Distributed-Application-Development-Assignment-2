package jdbc.kioskapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBController {
	
	private String databaseName = "kioskappdb_dev";
	private String username = "root";
	private String password = "";
	
	private String connectionPath = "jdbc:mysql://localhost/" + databaseName + "?" +
            "user=" + username + "&password=" + password;
	
	//jdbc:mysql://localhost/kioskappdb
	/**
	 * This method establish connection to RDBMS
	 * @return connection object
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		
		// Load database driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// Get connection object from the database
		Connection connection = DriverManager.getConnection(connectionPath);
		DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
		return connection;
		
	}

}

















