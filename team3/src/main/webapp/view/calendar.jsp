<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.calendar {width: 400px; padding: 5px 20px 20px 20px; box-sizing: border-box; border: 1px solid;}
.calendar > .header {text-align: center;}
.calendar > .header > .title {width:50%; display: inline-block;}
.calendar > .header > .calendar_btn {
	width: 30px;
	height: 30px;
	border: none;
	padding: 0;
	background-color: #ffffff;
	vertical-align: middle;
	color: black;
}
.calendar > .day {width:100%; display: table; table-layout: fixed;}
.calendar > .day > div {display: table-cell; text-align: center; height: 50px; vertical-align: middle;}
.calendar > .day > div:first-child {color: red;}
.calendar > .day > div:last-of-type {color: blue;}
.calendar > .dates {display: flex; flex-wrap: wrap; width: 100%;}
.calendar > .dates > .date {text-align: center; width: calc(100%/7); height: 50px; box-sizing: border-box;line-height: 3; border-radius: 3px;} 
.calendar > .dates > .date:nth-child(7n){color: blue;}
.calendar > .dates > .date:nth-child(7n+1){color: red;}
.calendar > .dates > .last {color: #c8c8c8 !important;}
.calendar > .dates > .next {color: #c8c8c8 !important;}
</style>
</head>
<body>

	<h3>달력 만들기</h3>
	<div class="calendar">
	<div class="header">
		<button class="calendar_btn" onclick="prevCal();">&lt;</button>
		<div class="title"><span class="year"></span><span class="month"></span></div>
		<button class="calendar_btn" onclick="nextCal();">&gt;</button>
	</div>
	<div class="day">
		<div>S</div>
		<div>M</div>
		<div>T</div>
		<div>W</div>
		<div>T</div>
		<div>F</div>
		<div>S</div>
	</div>
	<div class="dates"></div>
</div>
<input type="text" id="period_1"> ~ <input type="text" id="period_2">
	
<script src="/team3/js/calendar.js" type="text/javascript"></script>
</body>
</html>