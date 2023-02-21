<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.naver.dcancer.webmessager.messageDAO"%>
<%@ page import="com.naver.dcancer.webmessager.messageDTO" %>
<%
String id=(String)session.getAttribute("id");
messageDAO dao= new messageDAO();

