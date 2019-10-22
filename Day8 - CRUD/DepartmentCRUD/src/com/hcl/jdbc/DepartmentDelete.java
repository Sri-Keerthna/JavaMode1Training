package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentDelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int deptno;
		String dname,loc,head;
		System.out.println("enter department no ");
		deptno=sc.nextInt();
		String cmd="delete from Department where deptno=?";
		Connection con=DaoConnection.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, deptno);
			pst.executeUpdate();
			System.out.println("**record deleted**");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
