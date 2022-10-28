<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
	<link href="/jspweb/CSS/dashboard.css" rel="stylesheet">
</head>
<body>

	<!-- 관리자 페이지 -->
	<!-- 만약에 세션이 없거나 관리자가 아니면 -->
	<%
		String mid = (String)session.getAttribute("mid");
		if( mid == null || !mid.equals("admin") ){
			response.sendRedirect("../member/login.jsp");}
	%>
	<!-- marquee : 텍스트 슬라이드( 전광판 ) 텍스트말고 이미지도 됨 숫자가 클수록 빠르다-->
	<marquee scrollamount="10"> 공지사항 표시되는 위치 </marquee>	

	<!-- 사이드바 -->
	<div class="sidebar">
		<h1>관리자 메뉴</h1>
		<ul class="side_menu">
			<li class="side_item"><a onclick="pagechange('regist.jsp')">제품등록</a></li>
			<li class="side_item"><a onclick="pagechange('list.jsp')">제품목록</a></li>
			<li class="side_item"><a href="#">재고관리</a></li>
			<li class="side_item"><a href="#">주문관리</a></li>
			<li class="side_item"><a href="#">매출관리</a></li>
			<li class="side_item"><a href="#">회원목록</a></li>
			<li class="side_item"><a href="#">베송관리</a></li>
			<li class="side_item"><a href="http://localhost:8080/jspweb/index.jsp">로그아웃</a></li>
			<li><a class="nav-link" href="/jspweb/member/finid.jsp">아이디 찾기</a></li>
			<li><a class="nav-link" href="member/findpassword.jsp">비밀번호 찾기</a></li>
		</ul>
	</div>
	
	<!-- 본문 페이지가 보이는 div입니다 -->
	<div id="mainbox">
		<!-- 사이드바에서 메뉴 클릭 시 jsp가 표시되는 구역 -->
	</div>
	
	<!-- JQUERY 자바를 편하세 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 부트스트랩 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>	
	<!-- js 연결 스크립트 -->
	<script src="../js/admin/dashboard.js" type="text/javascript"></script>
</body>
</html>