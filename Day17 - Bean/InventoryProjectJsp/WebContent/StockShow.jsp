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
<body>
<table border="3">
<tr>
<th>Stock Id</th>
<th>ItemName</th>
<th>Price</th>
<th>Q.Avail</th>
<th>Place Order</th>
</tr>
<%
Connection con=DaoConnection.getConnection();
String cmd="select *from stock";
PreparedStatement pst=con.prepareStatement(cmd);
ResultSet rs=pst.executeQuery();
while(rs.next()){
	%>	
<tr>
<td><%=rs.getString("stockid") %></td>
<td><%=rs.getString("ItemName") %></td>
<td><%=rs.getInt("Price") %></td>
<td><%=rs.getInt("QuantityAvail") %></td>
<td><a href="PlaceOrder.jsp?stockid=<%=rs.getString("stockid") %>">Place Order</a></td>
</tr>
<%
}
%>
</table><br/><br/>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="AddStock.jsp">Add Stock</a>
</body>
</html>