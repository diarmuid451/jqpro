<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    span{
    	color: red;
    	font-size: 1.5em;
    }
</style>
</head>
<body>
    <h1>JSP : Java Server Page</h1>
    <p>클라이언트에서 요청이 발생하면 값을 전달 받아서 처리하는 페이지</p>
    <p>자바문장을 사용 할 수 있다.</p>
    <p>자바 문장을 이용해서 처리 할때는 &lt;%  %&gt; 기호 사이에 기술한다.</p>
    <p>자바 변수를 출력 할 때는 &lt;%=  %&gt; 사이에 기술한다.</p>
    <%
    	request.setCharacterEncoding("UTF-8");
    
    
    	String name = request.getParameter("name");
    	String pass = request.getParameter("pass");
    
    %>
    <%= name %> 님 <span>환영합니다. </span><br>
    당신의 번호는 <%= pass %> 입니다. <br>
    <span>즐거운 시간 보내시길 바랍니다.</span>
    
</body>
</html>