package com.hcl.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
	 public boolean loginCheck(String username, String password){
	        String Username, Password;
	        boolean login = false;
	        Connection con=DaoConnection.getConnection();
	        try {
	           Statement stmt = (Statement) con.createStatement();
	            String cmd = "SELECT Username, Password FROM LibUsers;";
	            stmt.executeQuery(cmd);
	            PreparedStatement pst=con.prepareStatement(cmd);
	            ResultSet rs = stmt.getResultSet();

	            while(rs.next()){
	                Username = rs.getString("username");
	                Password = rs.getString("password");

	                if(Username.equals(username) && Password.equals(password)){
	                    System.out.println("OK");
	                    login = true;
	                }
	                System.out.println(username + password + " " + Username + Password);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return login;
	    }
}
