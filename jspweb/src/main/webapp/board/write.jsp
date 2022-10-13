<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  <title>Insert title here</title> 필요없음 -->
</head>
<body>

	<%@include file="../Header.jsp" %>
	
	<!-- 회원일 경우에만 페이지 로드 -->
	
	<% if( loginid == null ) response.sendRedirect("http://localhost:8080/jspweb/member/login.jsp"); %>
	
	<div class="webbox">
		
		<h3>글쓰기</h3>
		
		<!-- 1. form=동기식만[페이지전환 가능] 2. ajax=비동기/동기[페이지전환 없이 구현 가능] 선택 
		
	     1. 폼 전송방식
	 	<form method="get" action="/jspweb/board/write"> method에는 구현할(?) 서블릿 주소
			제목 : <input type="text" name="btitle"><br>
			내용 : <input type="text" name="bcontent">
			<button type="submit">쓰기</button>
		</form>
		
	--> 	
	<!-- 2.  -->
			제목 : <input ty0pe="text" name="btitle"><br>
			내용 : <input type="text" name="bcontent">
			첨부파일 : <input type="file">
			<!-- js에 있는걸 가져오는거 -->
			<button onclick="bwrite()">쓰기</button>
	
	</div>

	<script src="../js/board/write.js" type="text/javascript"></script>

</body>
</html>