package com.hcl.ems;

public class EmployeeBaL {
	public static Employee showEmployeeBal(int emp_id) {
		return new EmloyeeDaO().showEmployee(emp_id);
	}
	public static LeaveHistory leaveBal(int emp_id) {
		return new EmloyeeDaO().leaveDao(emp_id);
	}
}
