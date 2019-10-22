<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.hcl.beans.DaoConnection"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function cancel(){
	document.getElementById('user').value="";
	document.getElementById('password').value="";
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<h1><b>Login Screen</b></h1>
<center>
Employee ID 
<input type="text" name="EMP_ID"/><br/><br/>
Password &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="password" name="secretCode"/><br/><br/><br/>
<input type="submit" value="Login"/>
&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Cancel"/>
</form>
<%
		String EMP_ID = (String)request.getParameter("EMP_ID");
		String password = (String)request.getParameter("secretCode");
		session.setAttribute("EMP_ID", EMP_ID);
	if(request.getParameter("EMP_ID") != null) {
		Connection con = DaoConnection.getConnection();
		String cmd = "Select SecretCode from EmployLogin where EMP_ID = ?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, Integer.parseInt(EMP_ID));
		ResultSet rs = pst.executeQuery();
		if(rs.next()){
			if(rs.getString("secretCode").equals(password)){
				%> <jsp:forward page="MyDetails.jsp"></jsp:forward> <% 
			} else {%>
						 <a style="color:red">Wrong Password</a>
			<%}
		}else {%>
		 <a style="color:red">Employ does exist not </a>
	<%  }
	}
	%>
	</center>
</body>
</html>