<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="main.jsp" %>
<h3 hidden="id"></h3>
	<div>
		<form action="http://localhost:8080/team3/find" method="post">	
			<table>
				<tr><th colspan="3"><h3>아이디 찾기</h3></th>
				<tr>
					<td class="col1">Nickname :</td> 
					<td><input type="text" name="nname"></td>
				</tr>
				<tr>
					<td><button onclick="findid()">아이디 찾기</button></td>
				</tr>
			</table>
		</form>
	</div>
	
	<script src="../js/find.js" type="text/javascript"></script>
</body>
</html>