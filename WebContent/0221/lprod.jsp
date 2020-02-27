<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.lprod.vo.LprodVO"%>
<%@page import="kr.or.ddit.ibatis.config.SqlMapClientFactory"%>
<%@page import="com.ibatis.sqlmap.client.SqlMapClient"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

[
<%
	// 클라이언트 요청시 전달 되는 값을 받는다 : 없다
	
	// 처리(CRUD)한다
	// 1. SqlMapClient객체 얻어오기
	SqlMapClient client = SqlMapClientFactory.getSMClient();
	
	// 2. mapper파일의 namespace이름과 id이름을 이용하여 sql문 실행
	List<LprodVO> list = client.queryForList("lprod.listLprod");
	
	// 3. 수행결과 list에서 한줄씩 꺼내서 json object배열을 만든다
	for(int i = 0; i<list.size(); i++){
		LprodVO vo = list.get(i);
		if(i>0) out.print(",");	//자바문 안에서 출력하려면 out.print사용
%>
		{   "id" : "<%= vo.getLprod_id() %>",
			"gu" : "<%= vo.getLprod_gu() %>", 
			"nm" : "<%= vo.getLprod_nm() %>"
		}
<% 		
	}
	// 처리결과를 가지고 응답데이터(json배열)을 만든다
%>
]