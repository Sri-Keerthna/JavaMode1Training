<%@page import="com.hcl.beans.Login"%>
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
int name=Integer.parseInt(request.getParameter("emp_Id"));
String pwd=request.getParameter("secretCode");
boolean result=Login.authenticate(name, pwd);
String user="";
user+=name;
session.setAttribute("user", user);
if(result==true) {
%>
<jsp:forward page="menu.jsp" />
<%
} else {
%>
<jsp:include page="login.jsp" /><br/><br/>
<center><b><p>Invalid Credentials...Pls re-enter</p></b></center>
<%
}
%>
</body>
</html>