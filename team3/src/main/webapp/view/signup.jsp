<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
<link rel="stylesheet" href="https://unpkg.com/destyle.css@1.0.5/destyle.css">
	*{
		box-sizing: border-box;
	}
	
	div{
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
	
	.col1{
		text-align: left;
		padding-left: 70px;
	}
	
	.button{
		border: none;
		background-color: blue;
		color: white;
	}
</style>
</head>
<body>
<%@include file="mainhead.jsp" %>
	<div>
			<table>
				<tr><th colspan="3"><h3>회원가입</h3></th>
				<tr>
					<td class="col1">Id :</td> 
					<td><input type="text" id="id" name="id" onkeyup="idchack()"></td>
					<td><h2 class="check">1</h2></td>
				</tr>
				<tr>
					<td class="col1">Password : </td> 
					<td><input type="text" id="password" name="password" onkeyup="pscheck()" ></td>
					<td><h2 class="check">2</h2></td>
				</tr>
				
				<tr>
					<td class="col1">NickName : </td>
					<td><input type="text" id="nickname"  name="nickname" onkeyup="nncheck3()"></td>
					<td><h2 class="check">3</h2></td>
				</tr>
				<tr>
					<td><button type="button" onclick="signup()">가입하기</button>
					</td>
				</tr>
			</table>
	</div>
	

<script src="../js/signup.js" type="text/javascript"></script>
</body>
</html>