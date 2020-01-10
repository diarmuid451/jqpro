<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/mystyle.css">
<title>Insert title here</title>
<style>
	span{
		color: darkred;
	}
</style>
</head>
<body>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name");
	String text = request.getParameter("area");
	text = text.replaceAll("\\r\\n", "<br>");
	
%>
<h1>처리결과</h1>
<pre>textarea에 입력한 내용 중에는 enter기호('\r\n')가 삽입되어 있다.<br>
enter기호를 줄바꿈태그 &lt;br&gt;로 변환(변경, replaceAll)해서 출력한다.<br>
 text = text.replaceAll("\\r\\n", "&lt;br&gt;");
 </pre>
<div>
이름 : <%= name %><br>
<span>고객님의 잡소리</span><br>
	<div>
	<%= text %>
	</div>
</div>
</body>
</html>