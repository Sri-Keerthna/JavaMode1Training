package com.hcl.bank;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

public class AccountTestCase {
	
	@Test
	public void testWithdrawAccount(){
		assertEquals("Amount Debited", AccountBAL.withdrawAccountBal(3,	3000));
		assertEquals("Insufficient funds", AccountBAL.withdrawAccountBal(3,	300000));
		assertEquals("Account number not found", AccountBAL.withdrawAccountBal(-3,	300000));
		assertEquals("Account closed", AccountBAL.withdrawAccountBal(2,	300));	
	}
	
	@Test
	public void testDepositAccount(){
		assertEquals("Amount credited", AccountBAL.depositAccountBal(3,3000));
		assertEquals("Account no not found", AccountBAL.depositAccountBal(-3,3000));
		assertEquals("Account closed", AccountBAL.depositAccountBal(2,3000));
	}
	
	@Test
	public void testCloseAccount(){
		assertEquals("Account closed", AccountBAL.closeAccountBal(4));
		assertEquals("Account no not found", AccountBAL.closeAccountBal(-4));
	}
	
	@Test
	public void testUpdateAccount(){
		assertEquals("Account Updated", AccountBAL.updateAccountBal(1, "Chennai", "TamilNadu"));
		assertEquals("Account no not found", AccountBAL.updateAccountBal(-2, "Chennai", "TamilNadu"));
		assertEquals("Account closed already", AccountBAL.updateAccountBal(2, "Chennai", "TamilNadu"));
	}
	
	@Test
	public void testSearchAccount(){
		assertNotNull(AccountBAL.searchAccountBal(1));
		assertNull(AccountBAL.searchAccountBal(-1));
	}
	
	@Test
	public void testCreateAccount(){
		Accounts objAccounts=new Accounts();
		int accno=AccountBAL.generateAccountBal();
		objAccounts.setAccountNo(accno);
		objAccounts.setFirstName("Sri");
		objAccounts.setLastName("Keerthna");
		objAccounts.setCity("Bangalore");
		objAccounts.setState("karnataka");
		objAccounts.setAmount(76576);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		assertEquals("Account created successfully", AccountBAL.createAccountBal(objAccounts));
	}
	
	@Test
	public void testDaoConnection(){
		assertNotNull(DaoConnection.getConnection());
	}
	
	@Test
	public void testGenerateAccountNo(){
		int accno=0;
		Connection con=DaoConnection.getConnection();
		String cmd="select max(accountNo)+1 accno from Accounts";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			rs.next();
			accno=rs.getInt("accno");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(accno, AccountBAL.generateAccountBal());
	}
	
	@Test
	public void testGettersandSetters() {
		Accounts objAccounts=new Accounts();
		objAccounts.setAccountNo(1);
		objAccounts.setFirstName("Sai");
		objAccounts.setLastName("krishna");
		objAccounts.setCity("Bangalore");
		objAccounts.setState("karnataka");
		objAccounts.setAmount(26376);
		objAccounts.setCheqFacil("yes");
		objAccounts.setAccountType("savings");
		objAccounts.setStatus("active");
		
		assertEquals(1, objAccounts.getAccountNo());
		assertEquals("Sai", objAccounts.getFirstName());
		assertEquals("krishna", objAccounts.getLastName());
		assertEquals("Bangalore", objAccounts.getCity());
		assertEquals("karnataka", objAccounts.getState());
		assertEquals(26376, objAccounts.getAmount());
		assertEquals("yes", objAccounts.getCheqFacil());
		assertEquals("savings", objAccounts.getAccountType());
		assertEquals("active", objAccounts.getStatus());
	}

}
