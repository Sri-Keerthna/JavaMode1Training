<%@page import="com.hcl.beans.EMSDao"%>
<%@page import="com.hcl.beans.Employee"%>
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
int EMP_ID=Integer.parseInt((String)session.getAttribute("user"));
EMSDao dao=new EMSDao();
Employee obj=dao.EmployeeDetails(EMP_ID); 
int MGR_ID=obj.getEMP_MGR_ID();
if(MGR_ID==0) {
	out.println("NO MANAGER...");
} else {
	Employee mgrdet=dao.EmployeeDetails(MGR_ID);
	out.println("Employee Id : " +mgrdet.getEMP_ID()+"<br/><br/>"); 
	out.println("Full Name : " +mgrdet.getEMP_NAME()+"<br/><br/>");
	out.println("Email : " +mgrdet.getEMP_EMAIL()+"<br/><br/>");
}
%>
</body>
</html>