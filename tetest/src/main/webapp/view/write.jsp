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
			제목 : <input type="text" id="btitle" name="btitle"><br>
			내용 : <input type="text" id="bcontent" name="bcontent"><br>
			작성자 : <input type="text" id="bwriter" name="bwriter"><br>
			비밀번호 : <input type="password" id="bpassword" name="bpassword"><br>
			<button type="button" onclick="bwrite()">작성하기</button>
	</div>
	
	<!-- ajax 사용할려면 제이쿼리가 꼭 필요!! -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/write.js" type="text/javascript"></script>
</body>
</html>