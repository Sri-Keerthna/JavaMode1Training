package com.hcl.beans;

public class CreateStock {
	private String itemname;
	private int price;
	private int quantityavail;
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantityavail() {
		return quantityavail;
	}
	public void setQuantityavail(int quantityavail) {
		this.quantityavail = quantityavail;
	}
	
	public String createStock() {
		Stock objstock=new Stock();
		String stockid=StockBAL.generateStockBal();
		objstock.setStockid(stockid);
		objstock.setItemName(itemname);
		objstock.setPrice(price);
		objstock.setQuantityAvail(quantityavail);
		return StockBAL.createstockBal(objstock);
	}

}
