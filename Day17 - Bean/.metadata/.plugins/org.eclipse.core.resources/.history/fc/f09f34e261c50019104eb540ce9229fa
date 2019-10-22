package com.hcl.beans;

public class StockBAL {
	
	public static int generateOrderIdBal(int orderid){
		return new StockDAO().generateOrderIdDao();
	}
	
	public static String PlaceOrderBal(String stockid,int  QtyOrd){
		return new StockDAO().PlaceOrderDao(stockid, QtyOrd);
	}
	
	public static Stock searchStockBal(String stockid){
		return new StockDAO().searchStockDao(stockid);
	}
	
	public static String createstockBal(Stock objstock){
		return new StockDAO().createStockDao(objstock);
	}
	
	public static String generateStockBal(){
		return new StockDAO().generateStockidDao();
	}
}
