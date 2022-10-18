<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<!-- 썸머노트 API css -->
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
	<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="../Header.jsp" %>
	
	<!-- 회원일 경우에만 페이지 로드 -->
	
	<% if( loginid == null ) response.sendRedirect("http://localhost:8080/jspweb/member/login.jsp"); %>
	
	<div class="webbox">
		
		<h3>글쓰기</h3>

		<form>
				제목 : <input type="text" name="btitle" class="btitle"><br>
				<textarea id="summernote" name="bcontent" class="bcontent"></textarea><br>			
				첨부파일 : <input type="file" name="bfile" class="bfile"><br>	 <!-- 새로넣을지말지 파일 -->
				<!-- 기존 첨부파일 이름과 삭제버튼 표시 구역 -->
				<div class="oldbfilebox" id="oldbfilebox"></div><br>	 <!-- 기존 파일 -->
				
				
				
				<button type="button" onclick="update()">수정</button>		
		</form>
	</div>
	
<!-- 썸머노트 API js -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	
	<script src="lang/summernote-ko-KR.js"></script>
	
	<script src="../js/board/update.js" type="text/javascript"></script>	
	
</body>
</html>
