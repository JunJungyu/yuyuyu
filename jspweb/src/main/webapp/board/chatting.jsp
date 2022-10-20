<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	span{
		padding: 5px;
	}

</style>
</head>
<body>

	<%@include file="../Header.jsp" %>
	
	<!-- 로그인 회원 아이디 숨기기 -->
	<input type="hidden" class="mid" value="<%=loginid%>">
	
	<div class="webbox">
		<h3>채팅</h3>	
		<div class="contentbox">			<!-- 받은메시지 출력 구역 -->
		</div>
		
		<textarea onkeyup="enterkey()" class="msgbox"></textarea>
		<button onclick="send()" type="button">보내기</button>
	</div>
	
	
	<script src="../js/board/chatting.js" type="text/javascript"></script>
</body>
</html>