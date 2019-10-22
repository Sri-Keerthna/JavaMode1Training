package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployShow {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlpractice","root","root");
		//System.out.println("Connected");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select *from Employ");
		while(rs.next()){
			System.out.println(" ");
			System.out.println("Emp no "+rs.getInt("empno"));
			System.out.println("Emp name "+rs.getString("name"));
			System.out.println("Department "+rs.getString("dept"));
			System.out.println("Designation "+rs.getString("desig"));
			System.out.println("Basic "+rs.getInt("basic"));
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
