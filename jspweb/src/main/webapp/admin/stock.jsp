<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container"> 							<!-- b:contanier 박스권 -->
		<h3>재고관리</h3><br>
		<div class="row">								<!-- b:row 하위태그 가로배치 -->
			<div class="col-sm-4">						<!-- b:form-select 에 이미 너비 들어가서 박스에 넣어줌 -->
				<select class="cselect form-select">
					
				</select>			
			</div>
			<div class="col-sm-4">
				<select class="pselect form-select">
					<option> 제품명 선택 </option>
				</select>			
			</div>
		</div>
		<div class="row my-3">
			<div class="col-md-6">						<!-- b:col-sm-6 12그리드 중 숫자만큼 영역차지 -->
				<h3>재고등록</h3>
				<table class="table">					<!-- b:table 형식 -->
					<tr> <td style="width: 20%;"> 카테고리번호 </td> <td class="rows"></td> </tr>
					<tr> <td style="width: 20%;"> 제품번호 </td> <td class="rows"></td> </tr>
					<tr> <td style="width: 20%;"> 제품명 </td> <td class="rows"></td> </tr>
					<tr> <td style="width: 20%;"> 사이즈 </td> <td class="rows"> <input type="text" class="psize form-control"> </td> </tr>
					<tr> <td style="width: 20%;"> 색상 </td> <td class="rows"> <input type="text" class="pcolor form-control"> </td> </tr>
					<tr> <td style="width: 20%;"> 재고수량 </td> <td class="rows"> <input type="text" class="pstock form-control"> </td> </tr>
					<tr> <td colspan="2"><button type="button" class="form-control"> 등록 </button></td> <td class="rows"></td> </tr>
					
				</table>
			</div>
			<div class="col-sm-6">
				<h3>재고출력</h3>
				
			</div>
		</div>
		
	</div>
	
	<!-- JQUERY 자바를 편하게 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="../js/admin/stock.js" type="text/javascript"></script>
</body>
</html>