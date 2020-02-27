<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String checkId = (String)request.getAttribute("checkId");
	String myId = (String)request.getAttribute("myId");

	if(checkId == null) {
	// 사용 가능
%>
	{
		"sw" : "<%= myId%>(은)는 사용 가능합니다."
	}
		
<%	} else {
	// 사용 불가
%>

	{
		"sw" : "<%= myId%>(은)는 이미 사용자가 있습니다."
	}
<%	
	}
%>