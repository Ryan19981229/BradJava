<!-- 老師喜歡用這個 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="member" class="tw.brad.classes.Member"></jsp:useBean>
<jsp:setProperty property="account" value="${param.account }" name="member"/>
<jsp:setProperty property="email" value="${param.email }" name="member"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
	</head>
	<body>
		HelloV2, ${member.account }
		<hr />
		${member.email }	
		<hr />
		${member }
	</body>
</html>
<!-- 表達式語言（Expression language）是一種簡化Java Servlet和JavaServer Pages (JSP)中動態內容開發的技術。
它提供了一種簡單的方式來訪問JavaBean組件中的屬性，並且還支援運算符、函數和表示式的語法，可以輕鬆地將動態值插入到JSP頁面中。 -->
