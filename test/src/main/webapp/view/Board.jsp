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
		<h3>글 목록</h3>
		
	</div>
</body>
</html>