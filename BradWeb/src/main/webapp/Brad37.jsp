<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int lottery1 = (int)(Math.random()*49+1);
	int lottery2 = (int)(Math.random()*49+1);
	
	request.setAttribute("lottery1", lottery1);
	request.setAttribute("lottery2", lottery2);
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Brad Big Company</title>
	</head>
	<body>
		<h1>Brad</h1>
		<hr />
		<jsp:include page="Brad38.jsp">
			<jsp:param value="100" name="x"/>
			<jsp:param value="200" name="y"/>
		</jsp:include>
		<hr />
		<jsp:include page="Brad41.jsp"></jsp:include>
		OK	
	</body>
</html>
<!-- JSP 檔案中傳遞參數的標籤，可以將參數值傳遞給另一個 JSP 頁面或 Servlet。 -->