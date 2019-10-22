package com.hcl.inventory;

public class CreateInventory {
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
	
	public String createInventory() {
		Inventory objInventory=new Inventory();
		String stockid=InventoryBAL.generateInventoryBal();
		objInventory.setStockid(stockid);
		objInventory.setItemname(itemname);
		objInventory.setPrice(price);
		objInventory.setQuantityavail(quantityavail);
		return InventoryBAL.createInventoryBal(objInventory);
	}

}
