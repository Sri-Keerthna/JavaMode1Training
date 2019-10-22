package com.hcl.project;

import java.util.List;

public class CustomerBAL {
	StringBuilder sb=new StringBuilder();
	
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	public boolean addCustomerBAL(Customer objcustomer) throws CustomerException {
		boolean isAdded=true;
		
		if(objcustomer.getCustId()<=0) {
			sb.append("customer no cannot be zero or negative \r\n");
			isAdded=false;
		}
		if(objcustomer.getCustName().length()<=5) {
			sb.append("customer name shd be more than 5 chars \r\n");
			isAdded=false;
		}
		if(objcustomer.getAnnualPremium() < 20000) {
			sb.append("it shd not less than  20000  \r\n");
			isAdded=false;
		}
		if(objcustomer.getAnnualPremium()>1000000) {
			sb.append("it shd not greater than 100000  \r\n");
			isAdded=false;
		}
		if(objcustomer.getModalPremium()<1000) {
			sb.append(" it shd not less than 1000 \r\n");
			isAdded=false;
		}
		if(objcustomer.getModalPremium()>50000) {
			sb.append(" it shd not greater than 50000 \r\n");
			isAdded=false;
		}
		if(objcustomer.getPaymentMode()<0) {
			sb.append("payment shd be 1 or2,3 \r\n");
			isAdded=false;
		}
		if(objcustomer.getPaymentMode()>3) {
			sb.append("payment shd be 1 or2,3 \r\n");
			isAdded=false;
		}
		
		if(isAdded==false) {
			throw new CustomerException(sb.toString());
		} else {
			new CustomerDAO().addCustomerDAO(objcustomer);
			}
		return isAdded;
	}
	public Customer searchCustomerBAL(int CustId) {
		return new CustomerDAO().searchCustomerDAO(CustId);
		}
	public List<Customer> showCustomerBAL() {
		return new CustomerDAO().showCustomerDAO();
	}
	public String updateCustomerBAL(Customer objcustomer) {
		return new CustomerDAO().updateCustomerDAO(objcustomer);
		}
	public String deleteCustomerBAL(int CustId) {
		return new CustomerDAO().deleteCustomerDAO(CustId);
		}
}
