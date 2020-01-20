<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
	
	String username = request.getParameter("name");
	String useraddr = request.getParameter("addr");
	%>
	
	<%= username %><br>님 환영합니다.<br>
	<%= useraddr %>
</body>
</html>