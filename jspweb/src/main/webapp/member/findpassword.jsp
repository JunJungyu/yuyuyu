<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../Header.jsp"%>
	<div class="webbox">							<!-- 여기는 왜 form안쓰지? 그럼 method는 어떡하지..? -->
		<h3>비밀번호 찾기</h3>
		아이디 : <input type="text" id="mid"><br>
		이메일 : <input type="text" id="memail"><br>
		<div id="findpsconfirmbox"></div>	<!-- 결과 메시지 출력 박스 resultbox는 왜 또 만들지? 그냥 바로 여기다 하면 안되나-->
			<button type="button" onclick="findpassword()">비밀번호 찾기</button>
	</div>
	
	<!-- 경로 문제가 아니라 스크립트 문제였다 오타 -->
	<script src="find.js"  type="text/javascript"></script>
</body>
</html>