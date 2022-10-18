<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		box-sizing: border-box;
	}
	
	div{
		width: 1200px;
		margin: 0 auto;
		
	}
	
	form{
		width: 600px;
		text-align: center;
		margin: 0 auto;
		border: solid 1px gray;
		margin-top: 20%;
	}
	
	table{
		text-align: center;
		margin: 0 auto;
	}
	
	td{
		width: 200px;
	}
	
</style>
</head>
<body>

	<div>
		<form action="http://localhost:8080/team3/signup" method="get">
			<table>
				<tr><th colspan="3"><h3>회원가입</h3></th>
				
				<tr>
					<td>Id :</td> 
					<td><input type="text" id="id" name="id" onkeyup="idchack()"></td>
					<td><h2 class="check">1</h2></td>
				</tr>
				<tr>
					<td>Password : </td> 
					<td><input type="text" id="password" name="password" onkeyup="pscheck()" ></td>
					<td><h2 class="check">2</h2></td>
				</tr>
				
				<tr>
					<td>NickName : </td>
					<td><input type="text" id="nickname" name="name" name="nickname" onkeyup="nncheck()"></td>
					<td><h2 class="check">3</h2></td>
				</tr>
				<tr>
					<td><a href="/main"><button onclick="signup()">가입하기</button><button>메인페이지</button></a></td>
				</tr>
				
			</table>
		
		
		
		
		
		</form>
	</div>

<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>