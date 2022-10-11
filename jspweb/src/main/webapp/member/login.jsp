<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<%@include file="../Header.jsp"%>
	<div class="webbox">	<!-- 박스권이 1200px 안으로 들어올 수 있개 헤더랑 동일한 class를 줌 -->
		<h3> 로그인 페이지[ form 전송 ] </h3>
		<form action="/jspweb/member/login" method="post">
			아이디 : <input type="text" name="mid">			<br>
			비밀번호 : <input type="text" name="mpassword">	<br>
			<input type="submit" value="로그인"> 
		</form>

		<h3> 로그인 페이지[ js ajax (비동기식) ] </h3>	<!-- 페이지전환 없음 -->
			아이디 : <input type="text" id="mid">			<br>
			비밀번호 : <input type="text" id="mpassword">	<br>
			<div id="loginconfirmbox"></div>
			<input type="submit" value="로그인" onclick="login()"> 
			
			<ul>
				<li><a href="signup.jsp">회원가입</a></li>
				<li><a href="findid.jsp">아이디 찾기</a></li>
				<li><a href="finpassword.jsp">비밀번호 찾기</a></li>
			</ul>
			
	</div>
	
	<script src="../js/member/login.js" type="text/javascript"></script>
	
</body>
</html>