package com.hcl.beans;

public class CloseAccount {
private int accountNo;

public int getAccountNo() {
	return accountNo;
}

public void setAccountNo(int accountNo) {
	this.accountNo = accountNo;
}
public String closeAccount(){
	return AccountBAL.closeAccountBal(accountNo);
}
}
