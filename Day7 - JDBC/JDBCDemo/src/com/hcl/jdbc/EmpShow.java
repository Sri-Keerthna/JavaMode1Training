package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpShow {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
		//System.out.println("Connected");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from Emp");
		while(rs.next()){
			System.out.println(" ");
			System.out.println("Emp no "+rs.getInt("empno"));
			System.out.println("Emp name "+rs.getString("ename"));
			System.out.println("JOB "+rs.getString("job"));
			System.out.println("MGR "+rs.getInt("mgr"));
			System.out.println("HIRE DATE "+rs.getDate("hiredate"));
			System.out.println("SALARY "+rs.getInt("sal"));
			System.out.println("COMM "+rs.getInt("comm"));
			System.out.println("DEPARTMENT NO "+rs.getInt("deptno"));
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
