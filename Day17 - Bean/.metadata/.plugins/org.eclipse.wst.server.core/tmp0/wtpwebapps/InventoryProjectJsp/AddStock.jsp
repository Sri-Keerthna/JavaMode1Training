<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.beans.DaoConnection"%>
<%@page import="java.sql.Connection"%>
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
Connection con=DaoConnection.getConnection();
String cmd="select max(stockid) sid from stock";
PreparedStatement pst=con.prepareStatement(cmd);
ResultSet rs=pst.executeQuery();
rs.next();
String stockid=rs.getString("stockid");
%>
<form method="get" action="AddStock.jsp">
<center>
Stock ID :
<input type="text" value="<%=stockid %>" readonly="readonly" name="stockid"/><br/><br/>
ItemName :
<input type="text" name="ItemName"/><br/><br/>
Price :
<input type="text" name="Price"/><br/><br/>
QuantityAvail :
<input type="text" name="QuantityAvail"/><br/><br/>
<input type="submit" value="Add"/>
</center>
</form>
<%
if(request.getParameter("stockid")!=null){
	cmd="insert into stock(stockid,ItemName,Price,QuantityAvail) values(?,?,?,?)";
	pst=con.prepareStatement(cmd);
	pst.setInt(1, Integer.parseInt(request.getParameter("stockid")));
	pst.setString(2,request.getParameter("ItemName") );
	pst.setString(3, request.getParameter("Price"));
	pst.setString(4,request.getParameter("QuantityAvail"));
	pst.executeUpdate();
	%>
	<jsp:forward page="StockShow.jsp"/>
	<% 
	}	
%>
</body>
</html>