<%@page import="java.util.List"%>
<%@page import="com.jsp.trailExpressionLanguage.Customer" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${cus}</h1>
<%List<Customer> clist=(List)session.getAttribute("clist"); %>
<%for(Customer c:clist){%>
	<%=c%>
	<%} %>

</body>
</html>