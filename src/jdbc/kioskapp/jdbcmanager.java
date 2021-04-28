package jdbc.kioskapp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kioskapp.itemproduct.ItemProduct;
import kioskapp.order.Order;
import kioskapp.ordereditem.OrderedItem;
import kioskapp.ordertransaction.OrderTransaction;


public class jdbcmanager {
	
	private DBController dbCtrl;
	
	public void manager() {
		dbCtrl = new DBController();
	}
	
	public int addOrder(Order order) {
		String sqlstmt = "insert into `order`(`OrderId`,`TotalAmount`,`OrderReferenceNumber`) "
				+ "values (?,?,?)";
		
		int row = 0;
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			
			PreparedStatement ps = conn.prepareStatement(sqlstmt);
			ps.setInt(1,order.getOrderId());
			ps.setDouble(2, order.getTotalAmount());
			ps.setInt(3, order.getOrderReferenceNumber());
			
			row = ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return row;
	}
	
	
	public float selectItem(int ItemID) {
		String sql = "SELECT * FROM `itemproduct` WHERE `ItemProduct` = ?";
		ItemProduct item = new ItemProduct();
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			Statement stmt = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ItemID);
			
			
			ResultSet rs = ps.executeQuery();
		
			if (rs.next()) {
				item.setPrice(rs.getFloat(3));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return item.getPrice();
	}
	
	
	
	public int addOrderedItems(OrderedItem ordered, Order order) {
		String sqlstmt = "INSERT INTO `ordereditem` (`OrderedItemId`, `ItemProduct`, `Quantity`, `SubTotalAmount`, `Order`)"
				+ "VALUES (?,?,?,?,?)";
		
		int row = 0;
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			
			PreparedStatement ps = conn.prepareStatement(sqlstmt);
			ps.setInt(1,ordered.getOrderedItem());
			ps.setInt(2, ordered.getItemProduct());
			ps.setInt(3, ordered.getQuantity());
			ps.setFloat(4, ordered.getSubTotalAmount());
			ps.setInt(5, order.getOrderId());
			
			row = ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return row;
	}
	
	public int addOrderTransaction(OrderTransaction transaction) {
		String sqlstmt = "INSERT INTO `ordertransaction` (`OrderTransactionId`, `TransactionDate`,`Order`, `AmountCharged`, `TransactionStatus`, `Last4Digits`, `OrderMode`)"
				+ "VALUES (?,?,?,?,?,?,?)";
		
		int row = 0;
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			
			PreparedStatement ps = conn.prepareStatement(sqlstmt);
			ps.setInt(1,transaction.getOrderTransactionId());
			ps.setString(2, transaction.getTransactioDate());
			ps.setInt(3, transaction.getOrder());
			ps.setDouble(4, transaction.getAmountCharged());
			ps.setBoolean(5, transaction.isTransactionStatus());
			ps.setString(6, transaction.getLast4Digits());
			ps.setString(7, transaction.getOrderMode());
			
			row = ps.executeUpdate();
			
			ps.close();
			conn.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return row;
	}
	
	public ItemProduct selectItemAll(int ItemID) {
		String sql = "SELECT * FROM `itemproduct` WHERE `ItemProduct` = ?";
		ItemProduct item = new ItemProduct();
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			Statement stmt = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ItemID);
			
			
			ResultSet rs = ps.executeQuery();
		
			if (rs.next()) {
				item.setItemProduct(rs.getInt(1));
				item.setName(rs.getString(2));
				item.setPrice(rs.getFloat(3));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return item;
	}
	
	public ArrayList<Integer> selectOrderedItem(int ItemID) {
		String sql = "SELECT * FROM `ordereditem` WHERE `Order` = ?";
		OrderedItem oiDB = new OrderedItem();
		ArrayList<Integer> oiList = new ArrayList<Integer>();
		
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			Statement stmt = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ItemID);
			
			ResultSet rs = ps.executeQuery();
		int i = 0;
			while (rs.next()) {
				oiDB.setQuantity(rs.getInt(3));
				oiDB.setSubTotalAmount(rs.getFloat(4));
				oiDB.setOrderedItem(rs.getInt(2));
				
				System.out.println(i); i++;
				System.out.println(oiDB.getOrderedItem());
				System.out.println(oiDB.getQuantity());
				System.out.println(oiDB.getSubTotalAmount());
				oiList.add(rs.getInt(2));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return oiList;
	}
	
	public OrderedItem selectOrderedItemAll(int ItemID, int orderID) {
		String sql = "SELECT * FROM `ordereditem` WHERE `ItemProduct`= ? && `Order` = ?";
		OrderedItem oiDB = new OrderedItem();
		
		
		try {
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kioskappdb_dev?user=root&password=");
			Statement stmt = conn.createStatement();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, ItemID);
			ps.setInt(2, orderID);
			
			ResultSet rs = ps.executeQuery();
		int i = 0;
			while (rs.next()) {
				oiDB.setQuantity(rs.getInt(3));
				oiDB.setSubTotalAmount(rs.getFloat(4));
				oiDB.setOrderedItem(rs.getInt(2));
			}
			
			rs.close();
			stmt.close();
			conn.close();
			
			} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return oiDB;
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

