<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.box{
		width: 30%;
		padding: 20px;
	}
	
	body{
		display: flex;
	}
		
</style>
</head>
<body>

	<div class="box">
		<h3>비동기 회원게시판</h3>
		<form action="http://localhost:8080/test/w" method="get">
			<H6>번호</H6>
			제목 : <input type="text" name="btitle"><br>
			내용 : <input type="text" name="bcontent"><br>
			작성자 : <input type="text" name="bwriter"><br>
			비밀번호 : <input type="password" name="bpassword"><br>
			<h6>작성일 :</h6>
			<h6>조회수 :</h6>
			<button type="submit">작성하기</button>
		</form>
	</div>
	<div>
		<h3 onclick="gettext()">글 목록</h3><br>
		<h6 name="bbno">int bbno</h6><br>
		<h6 name="bbtitle">bbtitle</h6><br>
	    <h6 name="bbcontent">bbcontent</h6><br>
	    <h6 name="bbwriter">bbwriter</h6><br>
	    <h6 name="bbpassword">bbpassword</h6><br>
	    <h6 name="bbdate">bbdate</h6><br>
	    <h6 name="bbview">bbview</h6><br>
	</div>
</body>
</html>

<script src="../js/board.js"  type="text/javascript"></script>