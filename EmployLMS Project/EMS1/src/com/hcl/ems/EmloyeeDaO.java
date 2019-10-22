package com.hcl.ems;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmloyeeDaO {
	
	public Employee showEmployee(int emp_id) {
		Connection con = DaoConnection.getConnection();
		Employee obj = null;
		String cmd = "select * from employee where emp_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, emp_id);
			ResultSet rs = pst.executeQuery();
			rs.next();
			obj = new Employee();
			obj.setEmp_id(rs.getInt("emp_id"));
			obj.setEmp_name(rs.getString("emp_name"));
			obj.setEmp_email(rs.getString("emp_email"));
			obj.setEmp_mob_no(rs.getLong("emp_mob_no"));
			obj.setEmp_dpt_name(rs.getString("emp_dpt_name"));
			obj.setEmp_date_joined(rs.getDate("emp_date_joined"));
			obj.setEmp_mgr_id(rs.getInt("emp_mgr_id"));
			obj.setEmp_leave_balance(rs.getInt("emp_leave_balance"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
	
	public LeaveHistory leaveDao(int emp_id) {
		Connection con = DaoConnection.getConnection();
		LeaveHistory obj = null;
		String cmd = "select * from LEAVE_HISTORY where emp_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setInt(1, emp_id);
			ResultSet rs = pst.executeQuery();
			rs.next();
			obj.setLEA_ID(rs.getInt("LEA_ID"));
			obj.setLEA_NO_OF_DAYS(rs.getInt("LEA_NO_OF_DAYS"));
			obj.setLEA_START_DATE(rs.getDate("LEA_START_DATE"));
			obj.setLEA_END_DATE(rs.getDate("LEA_END_DATE"));
			obj.setLEA_TYPE(rs.getString("LEA_TYPE"));
			obj.setLEA_STATUS(rs.getString("LEA_STATUS"));
			obj.setLEA_REASON(rs.getString("LEA_REASON"));
			obj.setLEA_APPLIED_ON(rs.getDate("LEA_APPLIED_ON"));
			obj.setLEA_MGR_COMMENTS(rs.getString("LEA_MGR_COMMENTS"));
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return obj;
	
	}

}
