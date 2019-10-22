package com.hcl.project;

import java.util.List;
import java.util.Scanner;
import java.util.ResourceBundle;
import java.util.Scanner;
public class CustomerMain {
	 	public static void deleteCustomer() { 
	 		int CustId; 
	 		Scanner sc=new Scanner(System.in); 
	 		System.out.println("Enter Customer No  "); 
			CustId=sc.nextInt(); 
	 		CustomerBAL obj=new CustomerBAL(); 
	 		String res=obj.deleteCustomerBAL(CustId); 
	 		System.out.println(res); 
	 	} 
 	public static void updateCustomer() { 
 		Customer objcustomer=new Customer(); 
		Scanner sc=new Scanner(System.in); 
	System.out.println("Enter CustomerNo  "); 
	 		objcustomer.setCustId(Integer.parseInt(sc.nextLine())); 
			System.out.println("Enter Customer Name  "); 
			objcustomer.setCustName(sc.nextLine()); 
	 		System.out.println("Enter Customer Annual Premium  "); 
	 		objcustomer.setAnnualPremium(Double.parseDouble(sc.nextLine())); 
	 		System.out.println("Enter Customer Modal Premium  "); 
	 		objcustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
			System.out.println("Enter payment Mode  "); 
		objcustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
	 		CustomerBAL obj=new CustomerBAL(); 
			String res=obj.updateCustomerBAL(objcustomer); 
	 		System.out.println(res); 
	 	} 
	 	public static void showCustomer() { //displays
	 		CustomerBAL obj=new CustomerBAL(); 
	 		List<Customer> lstcustomer=obj.showCustomerBAL(); 
 		for (Customer customer : lstcustomer) { 
 			System.out.println(customer); 
	 		} 
 	} 
 	public static void searchCustomer() { 
 		int CustId; 
	 		System.out.println("Enter customer No  "); 
 		Scanner sc=new Scanner(System.in); 
 		CustId=sc.nextInt(); 
		CustomerBAL obj=new CustomerBAL();  
			Customer objcustomer=obj.searchCustomerBAL(CustId); 
		if(objcustomer!=null) { 
	 			System.out.println(objcustomer); 
			} else { 
	 			System.out.println("Record not found..."); 
 		} 
 		 
 	} 
 	public static void writeCustomerFile() {
		new CustomerBAL().writeCustomerFileBal();
	}
	
	public static void readCustomerFile() {
		new CustomerBAL().readCustomerFileBal();
	}
 	public static void addCustomer() { 
 		Customer objcustomer=new Customer(); 
			Scanner sc=new Scanner(System.in); 
			System.out.println("Enter CustomerNo  "); 
 		objcustomer.setCustId(Integer.parseInt(sc.nextLine())); 
	 		System.out.println("Enter Customer Name  "); 
 		objcustomer.setCustName(sc.nextLine()); 
	 		System.out.println("Enter annual premium  "); 
	 		objcustomer.setAnnualPremium(Double.parseDouble(sc.nextLine())); 
	 		System.out.println("Enter modal premium  ");
 		objcustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
 		System.out.println("Enter  paymentmode  "); 
 		objcustomer.setPaymentMode(sc.nextInt()); 
		CustomerBAL obj=new CustomerBAL(); 
	 		try { 
	 			boolean res=obj.addCustomerBAL(objcustomer);
				if(res==true) { 
					System.out.println("Customer Record Added"); 
	 			} 
	 		} catch (CustomerException e) { 
			System.out.println(e.getMessage()); 
		} 
	} 
		public static void main(String[] args) { 
 		int ch; 
		Scanner sc=new Scanner(System.in); 
		do { 
 			System.out.println("Options"); 
			System.out.println("---------"); 
		System.out.println("1. Add Customer"); 
 			System.out.println("2. Show customer"); 
			System.out.println("3. Search customer"); 
				System.out.println("4. Update customer"); 
 			System.out.println("5. Delete customer"); 
 			System.out.println("6. Write Customer File");
			System.out.println("7. Read Customer File");
	 			System.out.println("8. Exit"); 
				System.out.println("Enter Ur Choice  "); 
			ch=sc.nextInt(); 
 			switch(ch) { 
			case 1 :  
				addCustomer(); 
					break; 
			case 2 : 
					showCustomer(); 
					break; 
				case 3 : 
					searchCustomer(); 
	 				break; 
				case 4 :  
					updateCustomer(); 
				break; 
	 			case 5 :  
	 				deleteCustomer(); 
			break; 
	 			case 6 : 
					writeCustomerFile();
					break;
				case 7 : 
					readCustomerFile();
					break;
 			case 8 :  
 				return; 
			default :  
				System.out.println("Invalid Choice"); 
 			} 
 		} while(ch!=8); 
 	} 
}
