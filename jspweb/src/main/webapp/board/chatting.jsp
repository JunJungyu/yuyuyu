<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="../CSS/chatting.css">

</head>
<body>

	<%@include file="../Header.jsp" %>
	
	<!-- 채팅에 접속한 로그인 회원 아이디 숨기기 -->
	<input type="hidden" class="mid" value="<%=loginid%>">
	<div class="container">	<!-- 부트스트랩 css는 미리 만들어진 클래스 사용 -->
	
		<div class="col-sm-6 offset-3 chattingbox">
		<div class="row">
			<div class="com-sm-4">	<!-- 접속회원목록 -->
				
			</div>
			<div class="com-sm-8">	<!-- 채팅창 -->
				<div class="contentbox my-3">	<!-- 채팅구역 s -->

	
				</div>
				<!-- 채팅입력창 -->
				<textarea onkeyup="enterkey()" class="form-control msgbox"></textarea>
				<!-- 이모티콘 , 보내기 -->
				<div class="row">
					<div class="col-sm-2">
						<button class="dropdown-toggle" type="button" id="emobutton" data-bs-toggle="dropdown">
						이모티콘
						</button>
							<ul style="width: 400px; height: 200px;"  aria-labelledby="emobutton" class="dropdown-menu">
								<!-- 이모티콘 호출 구역 -->
							</ul>
					</div>
					<div class="col-sm-3 offset-7">
						<button class="form-control" onclick="send()" type="button">보내기</button>
					</div>
				</div>
								
			</div>

		</div>	<!-- 채팅구역 e -->
		</div>	
	</div>	<!-- container end -->
	

	<script src="../js/board/chatting.js" type="text/javascript"></script>
</body>
</html>