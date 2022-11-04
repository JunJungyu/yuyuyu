<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
	.table2 td,tr{
		border: solid 3px #eeeeee;
		text-align: center;
	}
	
	.table2 th:nth-child(odd){
		background-color: gray;
	}
	</style>
</head>
<body>

	<%@include file="../Header.jsp" %>

	<div class=container">	<!-- b:container 부트스트랩 -->



		<!-- 3. 9월 전국 아파트 실거래가 테이블 -->
		<h3>아파트입니다</h3>
		<table class="table2">
		</table>
	
		<!-- 지도를 표시할 div 입니다 -->
		<div id="map" style="width:100%;height:350px;"></div>	

		<!-- 2. 약국 상세 정보 div입니다 -->
		<div class="datailbox">

		</div>
		
		<div class="row">
			<div class="col-sm-3">								<!-- b:row -->
				<input type="text" class="form-control addrinput" >
			</div>
			<div class="col-sm-1">
				<button onclick="addrsearch()" type="button" class="btn">검색</button>
			</div>
		</div>
		<table class="table">
			
		</table>
	</div>
	
		<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=b65cd71207a6f5a976f685d77da0a2c9&libraries=services"></script>
		<script src="../js/board/api.js" type="text/javascript"></script>
	

	
</body>
</html>
<!-- 

	css
	1. 순위 style=""
	2. !important api보다 우선으로 먹힘 ( css 페이지에 쓰면 됨 )
	3. id / class
	4. api 인듯?
	
 -->