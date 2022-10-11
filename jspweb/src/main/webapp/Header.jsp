<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최유정 이젠 쇼핑몰</title>

<!-- font Awesome -->
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">

<!-- view port -->
<meta name="viewport" content="width=device-width , inital-scale = 1.0">

<!-- 사용자 정의 css 호출 -->
<link rel="stylesheet" href="/jspweb/CSS/Header.css">
</head>
<body>

	<div class="webbox">  						<!-- 전체 박스권 -->
		<div class="hd_top">					<!-- 상단 헤더 -->
			<div> <!-- 로고 -->
				<span class="hd_title">
					<a href="/jspweb/index.jsp">Ezen Shop</a>
				</span>
			</div>
			
			<!-- 세션 호출 [ jsp방식 = 템플릿마다 다름 ( jsp vs 리액트 ) ] -->
			
			<%
				// JSP 스크립트 태그 ( 태그안에 java 문법 작성 가능 )
					// jsp 세션객체 제공
				String loginid = (String)session.getAttribute("mid");
								// 형변환 : 세션자료형 = object
				
			%>
			
			<ul class="hd_sub">	<!-- 상단메뉴 -->
			<% 	if( loginid == null ){// 세션이 없다 --> 로그인 안했음 %>		<!-- java end -->
				<!-- 비로그인 메뉴 -->
				<li><a href="/jspweb/member/login.jsp">로그인</a></li>
				<li><a href="/jspweb/member/signup.jsp">회원가입</a></li>
				<!-- 로그인 메뉴 -->
			<% }else{//세션이 존재한다. --> 로그인 했다 %>
				<li> <%=loginid %>님 안녕하세요 </li>
				<li><a href="/jspweb/member/logout.jsp">로그아웃</a></li>			
			<%}%>
			<!-- 로그인 하던 안하던 공통메뉴 -->
				<li><a href="/jspweb/member/info.jsp">마이쇼핑</a></li>
				<li><a href="">고객센터</a></li>
			</ul>
		</div>
			<ul class="hd_menu">								<!-- 하단 헤더 -->
				<li><a href="#">가을준비</a></li>
				<li><a href="#">아우터</a></li>
				<li><a href="#">상의</a></li>
				<li><a href="#">하의</a></li>
				<li><a href="#">원피스</a></li>
				<li><a href="#">세트코디</a></li>
				<li><a href="#">악세사리</a></li>
				<li><a href="#">신발</a></li>
				<li><a href="#">BIG SIZE</a></li>
				<li><a href="#">1+1  이벤트</a></li>
				<li><a href="#">파격세일</a></li>
				
				<li class="sersh_box">
					<span>
						<input>
						<i class="fas fa-search"></i>
					</span>						
						<i class="fas fa-shopping-cart"></i>
				</li>
			</ul>
		
	</div>
	
	<!-- JQUERY 자바를 편하세 사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>

</body>
</html>
	<!--

		 <div> :  block [한줄차지] 기능없는 레이아웃 잡는 박스권 
	 		vs
	 	<span> : inline [ 사이즈 안먹 ]
	 
	 -->