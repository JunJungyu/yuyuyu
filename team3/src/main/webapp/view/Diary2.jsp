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
		
		table{
			width: 600px;
			height: 250px;
		}
		
		.calendar{
			width: 30%;
		}
		
		.diary{
			width: 65%;
		}
		
		.pencil{
			width: 5%;
		}
		
	</style>
</head>
<body>

	<table>
		<th class="calendar"> 달력 </th>	<th rowspan="2" class="diary"> 본문 </th>	<th rowspan="2" class="pencil"> 연필 </th>
		<tr> <td> 감정박스 </td> </tr> 
		
	</table>

	<script src="/team3/js/Diary2.js" type="text/javascript"></script>
</body>
</html>