<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>	
	<!-- css 초기화 -->
	<link rel="stylesheet" href="https://unpkg.com/destyle.css@1.0.5/destyle.css">
	<link href="../css/main.css" rel="stylesheet">
</head>
<body>

	<!-- 이게 테이블로 짜서 다 깨짐.. 일단은 제이쿼리때매 냅두고 나중에 수정하기~ -->

	<table>
		<tr>
			<th colspan="3">		<!-- 첫줄 -->
				<ul class="c_편의">	<!-- 제작동안 편의를 위해 남겨둠 -->
					<li> <a href="/team3/view/signup.jsp">회원가입페이지</a></li>
					<li> <a href="/team3/view/login.jsp">로그인페이지</a></li>
					<li> <a href="/team3/view/mainside.jsp">메인페이지</a></li>
					<li> <a href="/team3/view/findid.jsp">아이디찾기</a></li>
					<li> <a href="/team3/view/findps.jsp">비밀번호 찾기</a></li>
					<li> <a href="/team3/view/writer.jsp">글쓰기</a></li>
				</ul>
				<div class="c_header">
				</div>
			</th>
		</tr>
	</table>
	
	
	<marquee class="c_friends_box" direction="right" scrollamount="8" >
		친구목록박스 친구목록 누구 아무개 홍길동 짱많음 클릭하 면친구 블로그 로이동 함구현 근데친 구가많 아야볼 만하겠
	</marquee>	


	
	
	<!-- JQUERY 자바를 편하게  사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 내 js 연결 -->
	<script src="../js/list.js" type="text/javascript"></script>
	
</body>
</html>