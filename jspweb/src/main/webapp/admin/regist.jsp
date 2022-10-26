<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container"> <!-- b: container -->
		<h3>제품등록</h3><br>
		<form>
			제품명 : <input type="text" name="pname"><br>
			설명 : <textarea rows="" cols="" name="pcomment"></textarea><br>
			가격 : <input type="text" name="pprice"><br>
			할인율 : <input type="text" name="pdiscount"><br>
			카테고리 : <button type="button" onclick="pcategoryview()">카테고리 추가</button> <br>
				<span class="pcategoryaddbox">	<!-- 카테고리 추가 구역 -->

				</span>
				<div class="pcategorybox">	<!-- 카테고리 목록 구역 -->
					<input type="radio" name="pcno">
					<select name="pcno">
						<option></option>
					</select>
				</div>
			
			첨부파일 : <input type="file" id="pimg" name="pimg"><br>
			<button type="reset">취소</button>
			<button onclick="regist()" type="button">등록</button>
		</form>
		
		<div>
			<img alt="미리보기 이미지" src="" id="pimgpre">
		</div>
		
	</div>
	
		<!-- JQUERY 자바를 편하게 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>	
	<script src="../js/admin/regist.js" type="text/javascript"></script>

</body>
</html>