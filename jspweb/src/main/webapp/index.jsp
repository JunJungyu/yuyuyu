<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="/jspweb/CSS/main.css" rel="stylesheet">
<title>Insert title here</title>
</head>
	<%@include file="Header.jsp"%>
<body>

	<!-- 대문 [ 이미지 슬라이드 - 캐러샐 ] -->				<!-- carousel-fade : 덮어씌우기 -->						<!-- data-bs-interval="1000" : 자동 넘기기 -->
<div id="carouselExampleControls" class="carousel slide carousel-fade" data-bs-ride="carousel" data-bs-interval="1000">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/jspweb/admin/pimg/m1.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/jspweb/admin/pimg/m2.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="/jspweb/admin/pimg/m3.jpg" class="d-block w-100" alt="...">
    </div>
  </div>
	  <!-- 왼쪽 버튼 -->
	  <button class="carousel-control-prev" type="button" data-bs-target="#maincarousel" data-bs-slide="prev">
	    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Previous</span>
	  </button>
	  <!-- 오른쪽 버튼 -->
	  <button class="carousel-control-next" type="button" data-bs-target="#maincarousel" data-bs-slide="next">
	    <span class="carousel-control-next-icon" aria-hidden="true"></span>
	    <span class="visually-hidden">Next</span>
	  </button>
	</div>
	
	<!-- 제품 출력 -->
	<div class="container">							<!-- 전체 박스권 -->
		<h6 class="box_title"> BEST ITEM </h6>
		<div class="itemlist">										<!-- 일정 구역 -->
	
		</div>
	</div>
	
	<!-- JQUERY 자바를 편하세 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/jspweb/js/admin/index.js" type="text/javascript"></script>
	
</body>
</html>

