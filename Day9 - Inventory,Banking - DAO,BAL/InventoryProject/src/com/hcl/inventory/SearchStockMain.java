package com.hcl.inventory;

import java.util.Scanner;

public class SearchStockMain {
	public static void main(String[] args) {
		String stockid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stockid ");
		stockid=sc.nextLine();
		Stock objstock=StockBAL.searchStockBal(stockid);
		if(objstock!=null){
			System.out.println("First Name "+objstock.getStockid());
			System.out.println("Last Name "+objstock.getItemName());
			System.out.println("Price "+objstock.getPrice());
			System.out.println("Quantity Available "+objstock.getQuantityAvail());
		}else{
			System.out.println("stock not found");
	}
}
}
