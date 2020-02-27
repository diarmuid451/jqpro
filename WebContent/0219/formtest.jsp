<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
p{
	font-size: 2.0em;
}
span{
	background: black;
	color: yellow;
}
</style>
<%  
	// 클라이언트 요청시 전달 되는 값을 받는다.
	
	// 처리(CRUD)
	// 처리결과를 가지고 응답데이터(text)를 만든다.
	request.setCharacterEncoding("UTF-8");
	String vName = request.getParameter("name");
	String vAge = request.getParameter("age");
%>

당신의 이름은 <%= vName %> 이고 <br>
나이는 <%= vAge %> 입니다. <br>
<p> <%= vName %>님 <span>환영합니다.</span> </p>