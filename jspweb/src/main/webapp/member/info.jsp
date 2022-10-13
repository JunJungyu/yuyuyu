<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

	.signupform{ /* form */
		width: 800px;	/* 가로사이즈 */
		margin: 0 auto;	/* 박스권 가운데정렬 */
	}
	.pagetitle{ /* 페이지 대 제목 */
		text-align: center; /* 텍스트 가운데정렬 */
		margin-top: 100px;
	}
	.signuptable{ /*  table */
		width: 100%;
		border-top: black 2px solid; border-collapse: collapse;
	}
	.signuptable input{ /*  table 안에 있는 input */
		width: 100%; height: 35px; 
		border: #d8d8d8 1px solid; padding-left: 15px;
	}
	.signuptable td{ /*  table td  */
		border-bottom: #d8d8d8 1px solid;
		padding: 15px;
	}
	.parttitle{ /*  페이지 소 제목  */
		margin-top: 50px; padding-bottom: 10px;
		border-bottom: black 2px solid;
	}
	/* table 열 사이즈 */
	.col1{ width: 20%; background-color: #eaeaea; }
	.col2{ width: 50%; }
	.col3{ width: 30%; }
	
	.col2 span{
		display: flex;
		margin-bottom: 10px;
	}
	
	/* 회원가입 버튼 구역*/
	.signupbtnbox{
		display: flex;
		justify-content: center;
		padding: 20px;
	}
	
	/* 회원가입 버튼 */
	.signupbtnbox button{
		width: 150px;
		margin : 100px 10px;
		padding: 10px;
		border: none;
		color: white;
	}
	
	.signupbtnbox button:nth-child(1){
		background-color: gray;
	}

	.signupbtnbox button:nth-child(2){
		background-color: black;
	}
	
	.findaddr{
		text-align: center;
		margin: 0 auto;
		padding: 0;
	}
	
	textarea{
		width: 100%; resize: none;
		height: 200px;
	}
	
	.confirmbox input{
		zoom:1.5; /* 체크박스의 크기[배율] */
		margin-bottom: 20px;
	}
	
	.confirmbox span{ font-size: 15px; }
	
</style>
</head>
<body>

	<!-- 헤더 페이지 호출  -->
	<%@include file = "../Header.jsp" %>
	<!-- 세션을 이용한 페이지 제어  -->
	<%
		// header.jsp 파일의 변수 호출 
		if( loginid == null ){  response.sendRedirect("login.jsp"); }
	%>
	
	<div class="webbox">
		<form class="signupform" action="/jspweb/member/signup" method="post">
		<h2 class="pagetitle"> 회원정보 </h2>
		<h3 class="parttitle"> 기본정보 </h3>
		<table class="signuptable">
			<tr>
				<td class="col1" > 회원번호  </td>
				<td  class="col2" id="mno"> </td>
			</tr>
			<tr>
				<td class="col1" > 가입일  </td>
				<td class="col2" id="mdate"></td>
			</tr>
			<tr>
				<td class="col1" > 포인트  </td>
				<td class="col2" id="mpoint"> </td>
			</tr>
			<tr>
				<td class="col1" > 아이디  </td>
				<td class="col2" id="mid" ></td>
			</tr>
			<tr>
				<td class="col1" > 비밀번호  </td>
				<td class="col2"> <input readonly="readonly" type="password" 	name="mpassword" 		id="mpassword" 			> </td>
				<td class="col3"> <button type="button" > 수정 </button></td>
			</tr>
			<tr>
				<td class="col1" > 이름  </td>
				<td class="col2"><input readonly="readonly" type="text" 		name="mname" 			id="mname" 				> </td>
				<td class="col3"><button type="button" onclick="updateaction()"> 수정 </button></td>
			</tr>
			<tr>
				<td class="col1" > 전화번호  </td>
				<td class="col2"> <input readonly="readonly" type="text" 		name="mphone" 			id="mphone" 			> </td>
				<td class="col3"><button type="button"> 수정 </button></td>
			</tr>
			<tr>
				<td class="col1" > 이메일  </td>
				<td class="col2"> <input readonly="readonly" type="text" 		name="memail" 			id="memail" 			> </td>
				<td class="col3"><button type="button"> 수정 </button></td>
			</tr>
			<tr>
				<td rowspan="2" class="col1" > 주소  </td>
				<td colspan="2" class="col2"> 
					<span>
						<input readonly="readonly" type="text" id="sample4_postcode" placeholder="우편번호" name="maddress1">
						<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
					</span>
					<span>
						<input readonly="readonly" type="text" id="sample4_roadAddress" placeholder="도로명주소" name="maddress2">
						<input readonly="readonly" type="text" id="sample4_jibunAddress" placeholder="지번주소" name="maddress3">
					</span>
				</td>
			</tr>
			<tr>
				<td class="col2"> <input readonly="readonly" type="text" id="sample4_detailAddress" placeholder="상세주소" name="maddress4"> </td>
				<td class="col3"><button type="button"> 수정 </button> </td>
			</tr>
		</table>
	
		<div class="signupbtnbox">
			<button type="button" onclick="formsubmit()">회원탈퇴</button>
		</div>
		</form>
	</div>
	
	<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	
	<!-- <div class="webbox">
		<h3> 회원 목록 </h3>
		<table id="memeberlisttable">
			
		</table>
	</div> -->

	<!-- JS -->
	<script type="text/javascript" src="../js/member/info.js"></script>

</body>
</html>