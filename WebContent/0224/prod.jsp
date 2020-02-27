<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.prod.vo.ProdVO"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

[
<%
	// 2. mapper파일의 namespace이름과 id이름을 이용하여 sql문 실행
	List<ProdVO> list = (List<ProdVO>) request.getAttribute("listProd");
	
	
	for(int i = 0; i<list.size(); i++){
		ProdVO vo = list.get(i);
		if(i>0) out.print(",");	//자바문 안에서 출력하려면 out.print사용
%>
		{   
			"id" : "<%= vo.getProd_id() %>", 
			"nm" : "<%= vo.getProd_name() %>"
		}
<% 		
	}
	// 처리결과를 가지고 응답데이터(json배열)을 만든다
%>
]


