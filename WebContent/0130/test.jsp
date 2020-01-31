<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function historyGo(num) {
	history.go(num);
}
</script>
</head>
<body>
<h1>JSP</h1>
<h2>Java Server Page</h2>
<br>
되돌아가기 (go || historyGo)
<br>
<a href="location_test.html">go</a>
<a href="#" onclick="historyGo(-1)">historyGo</a>
</body>
</html>