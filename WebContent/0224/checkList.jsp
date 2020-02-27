<%@page import="kr.or.ddit.buyer.vo.BuyerVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BuyerVO vo = (BuyerVO)request.getAttribute("buyerVO");
%>
{	
	"add1" : "<%= vo.getBuyer_add1() %>",	
	"add2" : "<%= vo.getBuyer_add2() %>",	
	"bank" : "<%= vo.getBuyer_bank() %>",	
	"bankname" : "<%= vo.getBuyer_bankname() %>",	
	"bankno" : "<%= vo.getBuyer_bankno() %>",	
	"charger" : "<%= vo.getBuyer_charger() %>",	
	"comtel" : "<%= vo.getBuyer_comtel() %>",	
	"fax" : "<%= vo.getBuyer_fax() %>",	
	"id" : "<%= vo.getBuyer_id() %>",	
	"lgu" : "<%= vo.getBuyer_lgu() %>",	
	"mail" : "<%= vo.getBuyer_mail() %>",	
	"name" : "<%= vo.getBuyer_name() %>",	
	"telext" : "<%= vo.getBuyer_telext() %>",	
	"zip" : "<%= vo.getBuyer_zip() %>"	
}