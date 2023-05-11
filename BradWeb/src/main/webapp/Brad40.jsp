<%@page import="tw.brad.classes.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Bike b1 = (Bike)request.getAttribute("bike1");
	b1.upSpeed();
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		I am 40<hr />
		<%= b1 %>
		<br>
		<%out.print(b1); %><%out.print(b1); %>
		sssss <br>
	</body>
</html>