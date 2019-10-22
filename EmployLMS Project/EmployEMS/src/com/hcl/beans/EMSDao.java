package com.hcl.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EMSDao {
	
public Employee EmployeeDetails(int EMP_ID){
Connection con=DaoConnection.getConnection();
String cmd="select * from Employee where EMP_ID=?";
Employee obj=null;
try {
	PreparedStatement pst = con.prepareStatement(cmd);
	pst.setInt(1, EMP_ID);
	ResultSet rs=pst.executeQuery();
	if(rs.next()) {
		obj=new Employee();
		obj.setEMP_ID(EMP_ID);
		obj.setEMP_NAME(rs.getString("EMP_NAME"));
		obj.setEMP_DPT_NAME(rs.getString("EMP_DPT_NAME"));
		obj.setEMP_EMAIL(rs.getString("EMP_EMAIL"));
		obj.setEMP_DATE_JOINED(rs.getDate("EMP_DATE_JOINED"));
		obj.setEMP_MGR_ID(rs.getInt("EMP_MGR_ID"));
		obj.setEMP_MOB_NO(rs.getString("EMP_MOB_NO"));
		obj.setEMP_LEAVE_BALANCE(rs.getInt("EMP_LEAVE_BALANCE"));
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return obj;
}
}
