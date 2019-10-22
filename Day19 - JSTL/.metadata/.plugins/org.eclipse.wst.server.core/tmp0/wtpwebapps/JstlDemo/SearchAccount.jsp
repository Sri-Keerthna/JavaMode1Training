<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="conn"
driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost:3306/banking"
user="root"
password="root"
/>
<sql:query var="accQuery" dataSource="${conn}">
select *from Accounts where accountNo=?
<sql:param value="${param.accountNo}"/>
</sql:query>
<c:set var="flag" value="0"/>
<c:forEach var="a" items="${accQuery.rows}">
First Name :
<c:out value="${a.firstName}"/><br/><br/>
Last Name :
<c:out value="${a.lastName}"/><br/><br/>
City :
<c:out value="${a.city}"/><br/><br/>
State :
<c:out value="${a.state}"/><br/><br/>
Amount :
<c:out value="${a.amount}"/><br/><br/>
CheqFacil :
<c:out value="${a.cheqFacil}"/><br/><br/>
Account Type :
<c:out value="${a.accountType}"/><br/><br/>
<c:set var="flag" value="1"/>
</c:forEach>
<c:if test="${flag==0}">
<c:out value="Account No not found"/>
</c:if>
</body>
</html>