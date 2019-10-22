package com.hcl.inventory;

import java.util.Scanner;

public class PlaceOrderMain {
	public static void main(String[] args) {
		int  QtyOrd;
		String stockid;
		int OrderId=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stockid ");
		stockid=sc.nextLine();
		System.out.println("Enter Quantity needed ");
		 QtyOrd=sc.nextInt();
		System.out.println(StockBAL.PlaceOrderBal(stockid, QtyOrd));
	}
}
