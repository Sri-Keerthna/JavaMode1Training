package com.hcl.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	static List<Customer> lstcustomer=null;
	static {
		lstcustomer=new ArrayList<Customer>();
	}
	
	public String addCustomerDAO(Customer c) {
		lstcustomer.add(c);
		return "customer created successfully";
	}
	public Customer searchCustomerDAO(int custid) {
		Customer objcustomer = null;
		for(Customer c:lstcustomer) {
			if(c.getCustId()==custid) {
				objcustomer=c;
			}
		}
		return objcustomer;
	}
	public List<Customer> showCustomerDAO() {
		return lstcustomer;
	}
	public String updateCustomerDAO(Customer obj) {
		Customer c=searchCustomerDAO(obj.getCustId());
		if(c!=null){
			for (Customer c1 : lstcustomer) {
				if(c1.getCustId()==obj.getCustId()){
					c1.setCustName(obj.getCustName());
					c1.setAnnualPremium(obj.getAnnualPremium());
					c1.setModalPremium(obj.getModalPremium());
					c1.setPaymentMode(obj.getPaymentMode());
				}
			}
			return "records update";
		} else {
			return "customer no not found";
		}
	}
	
	public String deleteCustomerDAO(int CustId){
		Customer customer=searchCustomerDAO(CustId);
		if(customer!=null) {
			lstcustomer.remove(customer);
			return "customer remove";
		} else {
			return "customer no not found";
		}
	}
	public void writeCustomerFileDao() {
		try {
			FileOutputStream fout=new FileOutputStream("c:/Files/customer.txt");
			ObjectOutputStream objout=new ObjectOutputStream(fout);
			objout.writeObject(lstcustomer);
			System.out.println("written successfully");
			objout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void readCustomerFileDao() {
		try {
			FileInputStream fin=new FileInputStream("c:/Files/customer.txt");
			ObjectInputStream objin=new ObjectInputStream(fin);
			lstcustomer =(List<Customer>)objin.readObject();
			System.out.println(lstcustomer);
			objin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
