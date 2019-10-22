<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.beans.Stock"%>
<%@page import="com.hcl.beans.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hcl.beans.StockBAL"%>
<%@page import="com.hcl.beans.StockDAO"%>
<%@page import="java.io.PrintWriter"%>
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
String result="";
Stock objstock=searchStockDao(stockid);
if(objstock!=null){
	int QuantityAvail=objstock.getQuantityAvail();
	if(QuantityAvail- QtyOrd>=0){
		String cmd="Update Stock set QuantityAvail=QuantityAvail-? where Stockid=?";
		try {
			PreparedStatement pst=con.prepareStatement(cmd);
			pst.setInt(1,  QtyOrd);
			pst.setString(2, stockid);
			pst.executeUpdate();
			int OrderId=generateOrderIdDao();
			cmd="insert into Orders(OrderId, QtyOrd,stockid,"+ "billAmt)values(?,?,?,?)";
			pst=con.prepareStatement(cmd);
			pst.setInt(1,OrderId);
			pst.setInt(2,  QtyOrd);
			pst.setString(3, stockid);
			double total= QtyOrd*objstock.getPrice();
			pst.setDouble(4, total);
			pst.executeUpdate();
			cmd="update amount set gamt= gamt+?";
					pst=con.prepareStatement(cmd);
					pst.setDouble(1, total);
					pst.executeUpdate();
			result="Order placed";
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
	}else{
		result="Insufficient product";
	}
}else{
	result="stockid not found";
}
%>
</body>
</html>