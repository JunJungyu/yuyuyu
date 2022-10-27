<%@page import="model.dto.ProductDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	table tr th{
		width: 200px;
		border: solid 1px #eeeeee;
		margin: 0 auto;
	}
	
	table{
		border: solid 2px gray;
	}
	
	</style>
</head>
<body>

	<div class="container">
		<table>

		
		</table>
	</div>	

<!-- 부트스트랩 모달 -->
<!-- Button trigger modal -->
<button style="display: none;" type="button" class="updatwmodalbtn btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
  Launch static backdrop modal
</button>

<!-- Modal -->
<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered">
    <div class="modal-content">		<!-- 모달 내용 -->
    
      <div class="modal-header">	<!-- 모달 타이틀 -->
        <h1 class="modal-title fs-5" id="staticBackdropLabel">Modal title</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      
      <div class="modal-body">	<!--  모달 본문 -->
        <!-- fegist.jsp 폼 사용 -->
        <form>
			제품명 : <input type="text" name="pname"><br>
			설명 : <textarea rows="" cols="" name="pcomment"></textarea><br>
			가격 : <input type="text" name="pprice"><br>
			할인율 : <input type="text" name="pdiscount"><br>
			카테고리 : <button type="button" onclick="pcategoryview()">카테고리 추가</button> <br>
			제품상태 : <br>
			상품대표 이미지 : <input type="text" name="pimg"><br>
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
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
        <button onclick="regist()" type="button" class="btn btn-primary">수정</button>
      </div>
    </div>
  </div>
</div>
	
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	<!-- JQUERY 자바를 편하세 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/admin/list.js" type="text/javascript"></script>
	

</body>
</html>