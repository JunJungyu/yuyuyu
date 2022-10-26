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
	<%String mid = (String)session.getAttribute("mid"); %>	
	<h5><%=mid %>님 페이지</h5>
	<table>
		<tr>
			<th colspan="3">		<!-- 첫줄 -->
				<ul class="c_편의">	<!-- 제작동안 편의를 위해 남겨둠 -->
					<li> <a href="/team3/view/signup.jsp">회원가입페이지</a></li>
					<li> <a href="/team3/view/login.jsp">로그인페이지</a></li>
					<li> <a href="/team3/view/main.jsp">메인페이지</a></li>
					<li> <a href="/team3/view/findid.jsp">아이디찾기</a></li>
					<li> <a href="/team3/view/findps.jsp">비밀번호 찾기</a></li>
					<li> <a href="/team3/view/writer.jsp">글쓰기</a></li>
				</ul>
				<div class="c_header">
					<h3><%=mid %>개인페이지</h3>
				</div>
			</th>
		</tr>
		
		
		<tr>						<!-- 두번째 줄 -->
			<td>
			<div>
		
				<div class="c_prfile">
					<img class="proimg" alt="프로필 이미지" src="../img/프로필.jpg">
					<h3>닉네임</h3>
					<h4>간단한 자기소개 글
						간단한 자기소개 글
						간단한 자기소개 글
					</h4>
					<div class="c_btnbox">
						<div>친구추가</div> <div>뭐더라</div>
					</div>
				</div>
			</div>
			</td>
			
			<td class="c_postbox"  colspan="2" rowspan="2" style="width: 90%;">
					<div class="c_post_img_list">	<!-- 최신글 미리보기 이미지 출력할 박스 -->
						미리보기 이미지 9개 출력
					</div>
			</td>
		</tr>
		
		<tr>						<!-- 세번째 줄 -->
			<td>
				<div class="c_visitbox">
					<div class="c_today c_visit">
						<h3>today : 0</h3>	<!-- 왜 div안에 안들어오지 -->
							
					</div>
					<div class="c_total c_visit">
						<h3>total : 0</h3>		
					</div>
				</div>
			</td>
		</tr>
		
		<tr>
		</tr>
	</table>

	
	
	<!-- JQUERY 자바를 편하게  사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 내 js 연결 -->
	<script src="../js/list.js" type="text/javascript"></script>
	
</body>
</html>