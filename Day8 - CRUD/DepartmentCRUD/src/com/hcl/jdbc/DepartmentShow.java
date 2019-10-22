package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DepartmentShow {
	public static void main(String[] args) {
		Connection con=DaoConnection.getConnection();
		String cmd="select *from Department";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			ResultSet rs=pst.executeQuery();
			 while(rs.next()){
			    	System.out.println(" ");
			    	System.out.println("Dept no "+rs.getInt("deptno"));
					System.out.println("Dept name "+rs.getString("dname"));
					System.out.println("location "+rs.getString("loc"));
					System.out.println("head "+rs.getString("head"));
					System.out.println("-------------------------");
			    }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
