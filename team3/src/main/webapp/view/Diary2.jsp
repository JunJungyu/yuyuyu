<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://unpkg.com/destyle.css@1.0.5/destyle.css">
	<style type="text/css">
		@font-face {
	    font-family: 'Humanbumsuk';
	    src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2210-2@1.0/Humanbumsuk.woff2') format('woff2');
	    font-weight: normal;
	    font-style: normal;
		}
		
		*{
			box-sizing: border-box;
			font-family: 'Humanbumsuk'; 
		}
		
		.mainbox{
			width: 1200px;
			height: 600px;
		}
		
		#calendar{
			width: 30%;
		}
		
		.diary{
			width: 60%;
			position: relative;
		}
		
		
		textarea{	/* textarea에 안쪽 여백 padding왜 안돼?! */
			z-index: 2;
			position: absolute;
			top: 20%;
			left: 10.2%;
		
			width: 80%;
			height: 70%;
												/* 텍스트 넘어가면 줄 넘어가게 */
			resize: none;
			
			line-height: 1.8;
			 
			font-size: 30px;
												
			color: #3D3C39;
			flex-wrap: wrap;
			border: none;
			text-align: center;
			
			overflow: hidden;									/* 스크롤 숨기기 */
		}
		
		.diary_img{
			z-index: 1;
			position: absolute;
			top: 0px;
			
			width: 100%;
			height: 100%;
			background-repeat: no-repeat;
			background-size: contain;
			background-position: top;
		}
		
		.emotableimg{
			z-index: 0;
			position: absolute;
			bottom: 0px;
			margin: 0% 5%;
			width: 90%;
			background-repeat: no-repeat;
			background-size: contain;
			background-position: top;
			
		}
		
		.todaydate{
			z-index: 2;
			position: absolute;
			top: 70px;
			right: 100px;
			font-size: 35px;
		}
		
		.clickbtn{
			resize: none;
			background-repeat: no-repeat;
			width: 70%;										
			float: right;
			margin-top: 30%;
			
		}
				
		.c_emotion_t{
			position: relative;
			background-color: red; // 왜 작아졌지..?
		}		
				
		.c_emotion_t tr{
			width: 100%;
		}
		
		.c_emotion_t table{
			width: 70%;
			position: absolute;
			left: 15%;
			bottom: 8%;
		}

		.c_emotion_t td:nth-child(1) {
			width: 30%;
			text-align: center;
		}
		
		.c_emotion_t td:nth-child(2) {
			width: 70%;
		}
		
		.emoji{
			width: 45px;
			height: 45px;
		}
		
		.c_emobox td{
			font-size: 25px;
			vertical-align: middle;
			text-align: center;
			z-index: 1;
		}		
		
		.emoji:hover{
			transform: rotate( -20deg );
			transition: all ease 0.3s;
		}
		
		.emotioninput{
			margin-left: 5%;
		}
		
	</style>
</head>
<body>

	<table class="mainbox">
		<th id="calendar">
			<input id="date" type="date" onchange="load_diary()">
			<div class="calendar_day">
			</div>
			
		</th>
		
		<th rowspan="2" class="diary">
			<img class="diary_img" src="/team3/img/일기장.png">
			<h3 class="todaydate"></h3>
			<textarea id="content"></textarea> 
		</th>
		
		<th rowspan="2" class="pencil"> <img onclick="writediary()" class="clickbtn" src="/team3/img/연필.png"> </th>
		
		
		<tr> <td class="c_emotion_t"> <!-- 감정박스 -->
			<img class="emotableimg" alt="감정테이블배경" src="/team3/img/체크박스.png">	<!-- 사이즈 조절하기 -->
			<table class="c_emobox">
			</table>
		 </td> </tr> 
		
	</table>
	
	<!-- JQUERY 자바를 편하게  사용하기 위한 라이브러리 -->
	<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="/team3/js/Diary2.js" type="text/javascript"></script>
</body>
</html>