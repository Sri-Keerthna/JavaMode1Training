package com.hcl.beans;

public class Stock {
private String stockid;
private String ItemName;
private int Price;
private int QuantityAvail;

public String getStockid() {
	return stockid;
}
public void setStockid(String stockid) {
	this.stockid = stockid;
}
public String getItemName() {
	return ItemName;
}
public void setItemName(String itemName) {
	ItemName = itemName;
}
public int getPrice() {
	return Price;
}
public void setPrice(int price) {
	Price = price;
}
public int getQuantityAvail() {
	return QuantityAvail;
}
public void setQuantityAvail(int quantityAvail) {
	QuantityAvail = quantityAvail;
}
}
