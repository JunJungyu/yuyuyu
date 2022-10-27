<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- 썸머노트 API -->
	<!-- include libraries(jQuery, bootstrap) -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">


<title>Insert title here</title>
</head>
<body>
	<h3>게시물 작성 페이지</h3>
	<form>
		제목 : <input class="btitle" type="text" name="btitle"><br>
		<!-- 썸머노트 -->
	  	<textarea class="bcontent bfile" id="summernote" name="editordata"></textarea>	<!-- 사진이랑 텍스트를 어떻게 구별하고 디비에 넣어주지?! -->
	</form>
	<div style="background-color: red; width: 100px; height: 40px;" onclick="bwriter()">글 작성하기</div>	
	
		

	<!-- 썸머노트 -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
	
	<!-- 내 js 연결 -->
	<script src="../js/writer.js" type="text/javascript"></script>
	
</body>
</html>