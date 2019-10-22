<%@page import="com.hcl.hib.Department"%>
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
<%
		int deptno=Integer.parseInt(request.getParameter("deptno"));
		DeprtCrud crud=new DeprtCrud();
		Department e=crud.searchDepartment(deptno);
		if(e!=null) {
			out.println("Name " +e.getDname() +"<br/>");
			out.println("Location " +e.getLoc() +"<br/>");
			out.println("Head "+e.getHead()+"<br/>");
		} else {
			out.println("Not Found");
		}
	%>
</body>
</html>