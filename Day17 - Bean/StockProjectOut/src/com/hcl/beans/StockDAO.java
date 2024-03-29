package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {
	PreparedStatement pst;
	Connection con;
	
	public int generateOrderIdDao() {
		con=DaoConnection.getConnection();
		int OrderId=0;
		String cmd="select case when max(OrderId) is null then 1 else max(OrderId)+1 end OrderId from Orders";
		try {
			pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			OrderId=rs.getInt("OrderId");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return OrderId;
	}
	
	public String PlaceOrderDao(String stockid,int  QtyOrd){
		con=DaoConnection.getConnection();
		String result="";
		Stock objstock=searchStockDao(stockid);
		if(objstock!=null){
			int QuantityAvail=objstock.getQuantityAvail();
			if(QuantityAvail- QtyOrd>=0){
				String cmd="Update Stock set QuantityAvail=QuantityAvail-? where Stockid=?";
				try {
					pst=con.prepareStatement(cmd);
					pst.setInt(1,  QtyOrd);
					pst.setString(2, stockid);
					pst.executeUpdate();
					int OrderId=generateOrderIdDao();
					cmd="insert into Orders(OrderId, QtyOrd,stockid,billAmt) values(?,?,?,?)";
					pst=con.prepareStatement(cmd);
					pst.setInt(1,OrderId);
					pst.setInt(2,  QtyOrd);
					pst.setString(3, stockid);
					double total= QtyOrd*objstock.getPrice();
					pst.setDouble(4, total);
					pst.executeUpdate();
					cmd="update amount set gamt= gamt+?";
							pst=con.prepareStatement(cmd);
							pst.setDouble(1, total);
							pst.executeUpdate();
					result="Order placed";
				}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					result=e.getMessage();
				}
			}else{
				result="Insufficient product";
			}
		}else{
			result="stockid not found";
		}
		return result;
		}

	
	public Stock searchStockDao(String stockid){
		con=DaoConnection.getConnection();
		String cmd="select *from stock where stockid=?";
		Stock objstock=null;
		try {
			pst=con.prepareStatement(cmd);
			pst.setString(1, stockid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()){
				objstock=new Stock();
				objstock.setStockid(rs.getString("stockid"));
				objstock.setItemName(rs.getString("ItemName"));
				objstock.setPrice(rs.getInt("Price"));
				objstock.setQuantityAvail(rs.getInt("QuantityAvail"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objstock;
	}
	
	public String createStockDao(Stock objstock){
		con=DaoConnection.getConnection();
		String cmd="insert into stock(stockid,ItemName,Price,QuantityAvail) "
				+"values(?,?,?,?)";
	String result=" ";
	try {
		pst=con.prepareStatement(cmd);
		pst.setString(1,objstock.getStockid());
		pst.setString(2, objstock.getItemName());
		pst.setInt(3, objstock.getPrice());
		pst.setInt(4, objstock.getQuantityAvail());
		pst.executeUpdate();
		result="Stock created successfully";
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		result=e.getMessage();
	}
	return result;
	}
	
	public String generateStockidDao(){
		con=DaoConnection.getConnection();
		String stockid;
		String cmd="select max(stockid) sid from stock";
		String stid="";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			stid=rs.getString("sid");
			int id=Integer.parseInt(stid.substring(1));
			id++;
			if(id>=1 && id<=9){
				stid="S00"+id;
			}
			if(id>=10 &&id<=99){
				stid="S0"+id;
			}
			if(id>=100 && id<=999){
				stid="S"+id;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stid;
	}
}