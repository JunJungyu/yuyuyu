<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		
		*{
			border: solid 1px olive;
		}
		
		.mainbox{
			width: 1200px;
			height: 600px;
		}
		
		#calendar{
			width: 30%;
		}
		
		.diary{
			width: 65%;
		}
		
		.pencil{
			width: 5%;
		}
		
		textarea{
			width: auto;
			height: auto;
			resize: none;
			text-align: center;
			padding: 10%;
			background-image: url("/team3/img/일기장임시배경.jpg");	/* 늘려도 자연스러운 이미지로 바꾸거나 딱 맞게 늘리는 방법 찾기 */
			background-repeat: no-repeat;
			line-height: 1.8;
			background-size: cover;
			background-position: top; 
			font-size: 5%;
			overflow: hidden;
			
		}
		
	</style>
</head>
<body>

	<table class="mainbox">
		<th id="calendar"> 달력 </th>	<th rowspan="2" class="diary"> <textarea></textarea> </th>	<th rowspan="2" class="pencil"> 연필 </th>
		<tr> <td> <!-- 감정박스 -->
			
			<table>
				<th class=""> 감정컬러 </th> <th> 감정 이름 </th>
				<tr> <td onclick="버튼클릭()"> 감정컬러 </td> <td> 감정 이름 </td> </tr>
				<tr> <td class="emo_img"> 감정컬러 </td> <td> 감정 이름 </td> </tr>
				<tr> <td class="emo_img"> 감정컬러 </td> <td> 감정 이름 </td> </tr>
				<tr> <td class="emo_img"> 감정컬러 </td> <td> 감정 이름 </td> </tr>
			</table>
		
		 </td> </tr> 
		
	</table>

	<script src="/team3/js/Diary2.js" type="text/javascript"></script>
</body>
</html>