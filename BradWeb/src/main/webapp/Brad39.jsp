<%@page import="tw.brad.classes.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Bike b1 = new Bike();
	b1.upSpeed(); b1.upSpeed();b1.upSpeed();b1.upSpeed();
	request.setAttribute("bike1", b1);
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		I am Brad39.jsp<br />
		<jsp:forward page="Brad40.jsp"></jsp:forward>  <!-- 會蓋掉本頁面 -->
	</body>
</html>