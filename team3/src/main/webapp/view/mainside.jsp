<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>	

</head>
<body>


<%@include file="mainhead.jsp" %>
	<table>
		<tr>						<!-- 두번째 줄 -->
			<td>
			<div>
		
				<div class="c_prfile">
					<img class="proimg" alt="프로필 이미지" src="/team3/img/프로필.jpg">
					<h3 onclick="changepage()">닉네임</h3>
					<h4>간단한 자기소개 글
						간단한 자기소개 글
						간단한 자기소개 글
					</h4>
					<div class="c_btnbox">
						<div>친구추가</div> <div><a href="bwriter.jsp">글쓰기</a></div>
					</div>
				</div>
			</div>
			</td>
			
			<td class="c_postbox"  colspan="2" rowspan="2" style="width: 87%;">
					<div class="c_post_img_list">	<!-- 최신글 미리보기 이미지 출력할 박스 -->
						미리보기 테이블로 이미지 9개 출력할 공간
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
	</table>
	
	
	
	<!-- JQUERY 자바를 편하게  사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<!-- 내 js 연결 -->
	<script src="../js/list.js" type="text/javascript"></script>

	
</body>
</html>