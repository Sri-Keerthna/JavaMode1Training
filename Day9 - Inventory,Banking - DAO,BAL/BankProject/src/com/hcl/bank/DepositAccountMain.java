package com.hcl.bank;

import java.util.Scanner;

public class DepositAccountMain {
public static void main(String[] args) {
	int accountNo,depositAmount;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter AccountNo ");
	accountNo=sc.nextInt();
	System.out.println("Enter Deposit Amount ");
	depositAmount=sc.nextInt();
	System.out.println(AccountBAL.depositAccountBal(accountNo,depositAmount));
}
}
