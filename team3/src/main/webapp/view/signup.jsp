<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<form action="http://localhost:8080/team3/signup" method="get">
		<h3>회원 가입</h3>
		Id : <input type="text" id="id" name="id" onkeyup="idchack()"><h2 class="check">1</h2><br>
		Password : <input type="text" id="id" name="password" onkeyup="pscheck()" ><h2 class="check">2</h2><br>
		NickName : <input type="text" name="name" name="nickname" onkeyup="nncheck()"><h2 class="check">3</h2>
		<button>가입하기</button>
		</form>
	</div>

<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>