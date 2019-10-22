<%@page import="com.hcl.hib.DeprtCrud"%>
<%@page import="com.hcl.hib.Department"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.hib.DeprtCrud"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="3">
	<tr>
		<th>DeptNo</th>
		<th>Dname</th>
		<th>Loc</th>
		<th>Head</th>
	</tr>
	<%
		DeprtCrud obj=new DeprtCrud();
		List<Department> lstDepartment=obj.showDepartment();
		for(Department e : lstDepartment) {
	%>
	<tr>
		<td><%=e.getDeptno() %></td>
		<td><%=e.getDname() %></td>
		<td><%=e.getLoc() %></td>
		<td><%=e.getHead() %></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>