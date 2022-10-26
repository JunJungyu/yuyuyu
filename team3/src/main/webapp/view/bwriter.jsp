<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>게시물 작성 페이지</h3>
	제목 : <input id="btitle" type="text" name="btitle"><br>
	내용 : <textarea id="bcontent" name="bcontent" style="resize: none;" rows="20" cols="50"></textarea><br>
	파일첨부 : <input id="bfile" name="bfile" type="file"><br>
	<div onclick="bwriter()">글 작성하기</div>
	
		
	<!-- JQUERY 자바를 편하게  사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 내 js 연결 -->
	<script src="../js/writer.js" type="text/javascript"></script>
</body>
</html>