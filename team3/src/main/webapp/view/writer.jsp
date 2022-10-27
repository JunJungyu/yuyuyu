<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="mainhead.jsp" %>

	<div>
			제목 : <input type="text" id="btitle" name="btitle"><br>
			내용 : <input type="text" id="bcontent" name="bcontent"><br>
			작성자 : <input type="text" id="bwriter" name="bwriter"><br>
			<button type="button" onclick="postwriter()">작성하기</button>
	</div>
	<script src="../js/writer.js" type="text/javascript"></script>
</body>
</html>