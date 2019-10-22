package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int empno,basic;
	String name,dept,desig;
	System.out.println("enter employ no ");
	empno=sc.nextInt();
	System.out.println("enter designation ");
	desig=sc.next();
	System.out.println("enter basic ");
	basic=sc.nextInt();
	String cmd="update Employ set desig=?,basic=? WHERE empno=?";
	Connection con=DaoConnection.getConnection(); 
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, desig);
			pst.setInt(2, basic);
			pst.setInt(3, empno);
			pst.executeUpdate();
			System.out.println("**record updated**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
}
}
