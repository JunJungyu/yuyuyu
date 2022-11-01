<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link href="/jspweb/CSS/productview.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	
	<%@include file="../Header.jsp" %>
	
	<% // 자바를 작성할 수 있는 공간[서블릿] 
		// 1. 경로에 있는 pno request 요청
		// 2. 만약에 요청변수가 없을 경우					// ↓페이지 이동
		if( request.getParameter("pno") == null ){ response.sendRedirect("/jspweb/index.jsp"); }
		int pno = Integer.parseInt( request.getParameter("pno") );
		
	%>
	<input type="hidden" value="<%=pno%>" class="pno">	
	<div class="container">		<!-- b: container -->
						
		<div class="row"> 	
			<div class="col-md-6">	<!-- 대표이미지 - 12그리드중 반 근데 이미지가 삐져나온다~ -->
				<img alt="대표이미지" src="/jspweb/admin/pimg/mainimg.png">
			</div>
			
			<div class="col-md-6">											<!-- 상품 정보 - 12그리드중 반-->
				<div class="infobox">
					<h4 class="pname">PETIT CD 팔찌</h4>							<!-- 상품명 -->
					<div class="pcomment">심플하고 우아한 미학이 느껴지는 Petit CD 팔찌입니다.</div>	<!-- 상품설명 -->
					<div class="pricebox">									<!-- 할인율이 있을 경우 -->
						<span class="pdixcount"> 30% </span>									<!-- 할인율 -->
						<span class="pprice"> 20,000원 </span>								<!-- 원가 -->
						<span class="psale"> 16,000원 </span>								<!-- 할인이 적용된 가격 -->
					</div>
					<div class="pricebox">									<!-- 할인율이 없을 경우 -->
						<span> 30,000원 </span>								<!-- 할인율 -->
					</div>
					<div class="sizebox">									<!-- 사이즈 박스 -->
						<span> [ free , s , m , l ] </span>
					</div>
					<table class="table infotable">									<!-- 제품 옵션 -->
						<tr> <td>배송비</td><td>2,500원 ( 70,000원 이상 구매시 무료) </td> </tr>
						<tr> <td>카드혜택</td><td> 무이자 할부 </td> </tr>
						<tr> <td>적립혜택</td><td> 3000(1%) </td> </tr>
						<tr> <td>색상</td>
						
						<td>
							<select>
								<option>[필수] 색상선택</option>
								<option>골드</option>
								<option>실버</option>
								<option>로즈골드</option>
							</select>
						</td> 
						
						
						</tr>
						
						<tr> <td>사이즈</td>
							 <td>
							 	<select>
							 		<option>[필수] 사이즈 선택</option>
							 		<option>9호</option>
							 		<option>10호</option>
							 		<option>11호</option>
							 	</select>
							 </td> 
						</tr>
					</table>
					<table class="table select_t">														<!-- 선택된 제품 목록 -->
						<tr>
							<th width="55%"> 상품명/옵션 </th>
							<th width="30%">수량</th>
							<th width="15%">가격</th>
						</tr>
						
						<tr>
							<td>
								<span>PETIT CD 팔찌</span><br>
								<span> - 골드 / 9호</span>
							</td>
							<td>	<!-- 옵션 수량 구역 -->
								<div class="row g-0">	<!-- b : g-0 -->
									<div class="col-md-5">
										<input value="1" class="form-control">
									</div>
									<div class="col-md-4">
										<button class="amount_btn">▲</button>
										<button class="amount_btn">▼</button>
									</div>
									<div class="col-md-1">
										<button class="cancel_btn">X</button>
									</div>
								</div>
							</td>
							<td>
								<span> 20,000원 </span><br>
								<span class="pointbox"> (포인트)2000 </span>
							</td>
						</tr>
					</table>
					<div class="row">														<!-- 선택된 제품들의 총 가격 -->
						<div class="col-md-6"> 총 상품금액 </div>
						<div class="col-md-6 totalprice"> 40,000원 </div>
					</div>
					<div class="btnbox">														<!-- 버튼 -->
						<button class="btn">바로 구매</button>
						<button class="btn">장바구니</button>
						<button class="btn">찜하기♡</button>	<!-- 로그인된 회원이 찜하기 X -->
						<!-- <button>찜하기♥</button>	 로그인된 회원이 찜하기 O -->
					</div>
				</div>
			</div>
		</div>																	<!-- row -->
	</div>																		<!-- b:contanier -->
	
	<script src="/jspweb/js/product/productview.js" type="text/javascript"></script>
	
</body>
</html>