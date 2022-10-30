<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://unpkg.com/destyle.css@1.0.5/destyle.css">
<style type="text/css">
	
	*{
		border: solid 1px olive;
	}
	
	table{
		width: 70%;
	}
	
	.emoji{
		width: 100%;
	}

	.emoji:hover{
		background-color: white;
		opacity: 0.7;
	}

	textarea{
		width: 100%;
		resize: none;
		text-align: center;
		padding: 10%;
		background-image: url("/team3/img/일기장임시배경.jpg");	/* 늘려도 자연스러운 이미지로 바꾸거나 딱 맞게 늘리는 방법 찾기 */
		background-repeat: no-repeat;
		line-height: 1.8;
		background-size: cover;
		background-position: top;
	}
	
</style>
</head>
<body>

	<table>
		<tr> <th> <img class="emoji" alt="사랑" src="/team3/img/사랑.png">
		<th> <img class="emoji" alt="슬픔" src="/team3/img/슬픔.png"> </th>
		<th> <img class="emoji" alt="패닉" src="/team3/img/패닉.png"> </th>
		<th> <img class="emoji" alt="사랑" src="/team3/img/사랑.png"> </th>
		<th> <img class="emoji" alt="슬픔" src="/team3/img/슬픔.png"> </th>
		<th> <img class="emoji" alt="패닉" src="/team3/img/패닉.png"> </th> </th>
		
		<tr> <td rowspan="3"> 달력 넣을 자리 </td> </tr>
		
		<tr> <td colspan="6" > <textarea rows="70" cols="100"></textarea> </td> </tr>
		<tr> <td colspan="6" > <button> 오늘의 일기 작성 완료 </button> </td> </tr>
	</table>
		
	

</body>
</html>