package com.hcl.inventory;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class StockTestCase{
	@Test
	public void testPlaceOrder() {
		assertEquals("Order placed", StockBAL.PlaceOrderBal("S003", 2));
		assertEquals("Insufficient order", StockBAL.PlaceOrderBal("S003", 23));
		assertEquals("Stockid not found", StockBAL.PlaceOrderBal("A001", 1));
	}
	@Test
	public void testSearchStockId() {
		assertNotNull(StockBAL.searchStockBal("S003"));
		assertNull(StockBAL.searchStockBal("A002"));
	}
	@Test
	public void testCreateStockId() {
		Stock objStock = new Stock();
		String stockid= StockBAL.generateStockBal() ;
		objStock.setStockid(stockid);
		objStock.setItemName("keyboard");
		objStock.setPrice(535);
		objStock.setQuantityAvail(23);
		assertEquals("Account created successfully..", StockBAL.createstockBal(objStock));
	}
	@Test
	public void testGenerateOrderId() {
		Connection con = DaoConnection.getConnection();
		int orid = 0;
		String cmd = "select case when max(orderid) IS NULL " 
		               + "THEN 1 else MAX(orderid)+1 END orid from orders";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			orid = rs.getInt("orid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(orid, StockBAL.generateOrderIdBal(orid));
	}
	@Test
	public void testDaoConnection() {
		assertNotNull(DaoConnection.getConnection());
	}
	@Test
	public void generateStockId() {
		String stid = null;
		Connection con = DaoConnection.getConnection();
		String cmd = " select max(stockid) sid from stock";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			ResultSet rs = pst.executeQuery();
			rs.next();
			
			stid = rs.getString("sid");
			int id = Integer.parseInt(stid.substring(1));
			id++;
			String formatted = String.format("%03d", id);
			stid = "S"+formatted;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(stid,StockBAL.generateStockBal());
	}
	@Test
	public void testGettersSetters() {
		Stock objstock = new Stock();
		objstock.setStockid("S001");
		objstock.setItemName("Speakers");
		objstock.setPrice(55677);
		objstock.setQuantityAvail(21);
		
		assertEquals("S001", objstock.getStockid());
		assertEquals("Speakers", objstock.getItemName());
		assertEquals(55677, objstock.getPrice(),0.00);
		assertEquals(21, objstock.getQuantityAvail());
	}

}
