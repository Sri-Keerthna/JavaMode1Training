<%@page import="com.hcl.hib.Dept"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.hib.DeptCrud"%>
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
		<th>Empno</th>
		<th>Name</th>
		<th>Dept</th>
		<th>Desig</th>
		<th>Basic</th>
	</tr>
	<%
		DeptCrud obj=new DeptCrud();
		List<Dept> lstDept=obj.showDept();
		for(Dept e : lstDept) {
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
</body>
</html>