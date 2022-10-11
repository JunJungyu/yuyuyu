<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
		<%@include file="../Header.jsp"%>
<body>

	<div class="webbox">
		<h3> 회원가입 페이지 </h3>
		<form action="/jspweb/member/signup" method="post">
			아이디 : 		<input type="text" 		name="mid">					<br>
			비밀번호 : 	<input type="password" 	name="mpassword">			<br>
			비밀번호확인 : <input type="password" 	name="mpasswordconfirm">	<br>
			이름 : 		<input type="text" 		name="mname">				<br>
			전화번호 : 	<input type="text" 		name="mphone">				<br>
			이메일 : 		<input type="text" 		name="memail">				<br>
			
			<!-- 카카오 우편 API -->
			
	    // 	이건뭐지 :	<input type="text" 		name="maddress">			<br>
				<input type="text" id="sample4_postcode" placeholder="우편번호" name="maddress1">
				<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" name="maddress2"><br>
				<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name="maddress3">
				<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name="maddress4">
				<span id="guide" style="color:#999;display:none" name="maddress5"></span>
				<input type="text" id="sample4_detailAddress" placeholder="상세주소" name="maddress6">
			
		<input type="submit" value="회원가입">
		</form>	
	</div>	
	
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script type="text/javascript" src="../js/member/signup.js"></script>


</body>
</html>