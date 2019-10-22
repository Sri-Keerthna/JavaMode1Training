package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int deptno;
		String dname,loc,head;
		System.out.println("enter department no ");
		deptno=sc.nextInt();
		System.out.println("enter department name ");
		dname=sc.next();
		System.out.println("enter location ");
		loc=sc.next();
		System.out.println("enter head ");
		head=sc.next();
		String cmd="update Department set dname=?,loc=?,head=? WHERE deptno=?";
		Connection con=DaoConnection.getConnection(); 
			try {
				PreparedStatement pst = con.prepareStatement(cmd);
				pst.setString(1, dname);
				pst.setString(2, loc);
				pst.setString(3, head);
				pst.setInt(4, deptno);
				pst.executeUpdate();
				System.out.println("**record updated**");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	}
}
