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
		<h3>비동기 비회원 회원게시판</h3>
		<form>
			제목 : <input onkeyup="write() " type="text" name="btitle"><br>
			내용 : <input type="text" name="bcontent"><br>
			작성자 : <input type="text" name="bwriter"><br>
			비밀번호 : <input type="password" name="bpassword"><br>
			<button >작성하기</button>
		</form>
	</div>
	<div>
		
		<h3 onclick="gettext()">글 목록</h3><br>
		<h6 name="bbno" class="bbno">no</h6><br>
		<h6 name="bbtitle">bbtitle</h6><br>
	    <h6 name="bbcontent">bbcontent</h6><br>
	    <h6 name="bbwriter">bbwriter</h6><br>
	    <h6 name="bbpassword">bbpassword</h6><br>
	    <h6 name="bbdate">bbdate</h6><br>
	    <h6 name="bbview">bbview</h6><br>
	</div>
</body>
</html>

<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="../js/board.js"  type="text/javascript"></script>