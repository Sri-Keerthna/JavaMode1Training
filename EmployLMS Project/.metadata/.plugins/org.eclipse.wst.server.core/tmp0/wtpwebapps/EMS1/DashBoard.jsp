<%@page import="com.hcl.ems.LeaveHistory"%>
<%@page import="com.hcl.ems.EmployeeBaL"%>
<%@page import="com.hcl.ems.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >
.green { 
        top: 200px; 
        left: 15px; 
        background-color: #8ebf00; 
        }
</style>
</head>
<body>


<div id="MyDetails" class="green">
<%
	String emp_id =(String) session.getAttribute("EMP_ID");
	Employee obj = EmployeeBaL.showEmployeeBal(Integer.parseInt(emp_id));
%>
<table bgcolor="yellow" ><tr><td>
	Employ ID :</td><td>
	<%=obj.getEmp_id() %></td><td></td><td>
	Mobile Number :</td><td>	
	<%=obj.getEmp_mob_no() %></td></tr>
	<tr><td>
	Full Name :</td><td>
	<%=obj.getEmp_name() %></td><td></td><td>
	Date Joined :</td><td>
	<%=obj.getEmp_date_joined() %></td></tr>
	<tr><td>
	Email Address :</td><td>
	<%=obj.getEmp_email() %></td><td></td><td>
	Department :</td><td>
	<%=obj.getEmp_dpt_name() %></td></tr>
	<tr ><td colspan="4"><center>
	Available leave Balance :
	<%=obj.getEmp_leave_balance() %></center></td></tr>
</table>
</div>



<div id="MyManager" style="width: 500px" >
	<%
	int emp_id1 = obj.getEmp_mgr_id();
	Employee obj1 = EmployeeBaL.showEmployeeBal(emp_id1);
	if (obj1.getEmp_name()==null) {
	%><center ><%="No manager" %></center>
	<%
	} else {
	%> <table bgcolor="cyan"><tr><td>
	Manager Id :</td><td>
	<%=obj1.getEmp_id() %></td></tr>
	<tr><td>
	Full Name :</td><td>
	<%=obj1.getEmp_name() %></td></tr>
	<tr><td>
	Email Address :</td><td>
	<%=obj1.getEmp_email() %></td></tr>
	<tr><td>
	Mobile Number :</td><td>
	<%=obj1.getEmp_mob_no() %></td></tr>
	<%
	}
	%>
	</table>
</div>

<div >
	<%
	LeaveHistory leave = EmployeeBaL.leaveBal(Integer.parseInt(emp_id));
	%><table bgcolor="orange"><tr><td>Leave ID</td><td>Number of Days</td><td>Start Date</td><td>End Date</td><td>LeaveType</td>
		<td>Status</td><td>Reason</td><td>Applied On</td><td>Manager Comments</td></tr>
		
	<%
	%>
	</table>
</div>
</body>
</html>