package com.hcl.inventory;

import java.util.Scanner;

public class CreateStockMain {
	public static void main(String[] args) {
		String stid=StockBAL.generateStockBal();
		//System.out.println(stid);
		Stock objstock=new Stock();
		objstock.setStockid(stid);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Stock id ");
		objstock.setStockid(sc.nextLine());
		System.out.println("Enter the ItemName ");
		objstock.setItemName(sc.nextLine());
		System.out.println("Enter the price ");
		objstock.setPrice(sc.nextInt());
		System.out.println("Enter the quantity available ");
		objstock.setQuantityAvail(sc.nextInt());
		System.out.println(StockBAL.createstockBal(objstock));
	}
}
