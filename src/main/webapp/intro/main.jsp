<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.naver.dcancer.webmessager.messageDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form action="sendmsg.jsp?name=type" method="post" onkeyup="if(window.event.keyCode==13){commit()">
	<ul>
		<div id="content"></div>
		<div id="messagebox"><intput type="text" id="text" name="text"></intput></div>
	</ul>
	</form>
</body>

<script>
	function sendmsg(){
		
	}	
</script>
</html>