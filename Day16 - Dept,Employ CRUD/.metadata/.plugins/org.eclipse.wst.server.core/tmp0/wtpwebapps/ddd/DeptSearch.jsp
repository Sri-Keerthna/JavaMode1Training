<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hcl.jsp.DaoConnection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="DeptSearch.jsp">
<center>
Dept No :
<input type="text" name="deptno"/><br/><br/>
<input type="submit" value="Search"/>
</center>
</form>
<%
if(request.getParameter("deptno")!=null){
	Connection con=DaoConnection.getConnection();
	String cmd="Select * from department where deptno=?";
	int empno=Integer.parseInt(request.getParameter("deptno"));
	PreparedStatement pst=con.prepareStatement(cmd);
	pst.setInt(1, empno);
	ResultSet rs=pst.executeQuery();
	if(rs.next()){
		out.println("Department Name "+rs.getString("dname")+"<br/>");
		out.println("Location "+rs.getString("loc")+"<br/>");
		out.println("Head "+rs.getString("head")+"<br/>");
	}else{
		out.println("**Record not found**");
	}	
}
%>
</body>
</html>