package test;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JSpinner;

import jdbc.kioskapp.jdbcmanager;
import kioskapp.itemproduct.ItemProduct;
import kioskapp.order.Order;
import kioskapp.ordereditem.OrderedItem;
import kioskapp.ordertransaction.OrderTransaction;

public class testjdbc {
	public static void main(String[] args) throws SQLException, IOException{
		
		jdbcmanager db = new jdbcmanager();
		 ArrayList<Integer> objk = new ArrayList<Integer>();
		objk = db.selectOrderedItem(714);
		
		System.out.println("first arraylist : " + objk.get(0));
		
		System.out.print("2nd arraylist : " + objk.get(1));
	
	}
}
