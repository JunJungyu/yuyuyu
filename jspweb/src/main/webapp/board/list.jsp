<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="../Header.jsp" %>

	<div class="webbox">
		<a href="writer.jsp"></a>
		
	<%--
	
	 <table>
		<tr>
			<th>번호</th>		<th>제목</th>		<th>작성자</th>
			<th>작성일</th>	<th>조회수</th>
		</tr>
	
	<% // 스크립트 태그 : html에 java 작성할 수 있는 공간
	
	ArrayList<BoardDto> list
		= BoardDao.getinstance().getlist();
	
	for( int  i = 0; i<list.size(); i++ ){
	%>	
		<tr>
			<td> <%=list.get(i).getBno() %> </td>
			<td> <%=list.get(i).getBtitle() %> </td>
			<td> <%=list.get(i).getMno() %> </td>
		</tr>
	<%
		}		// 표현식 <%= (호출)
	%>
	</table> 
	
	--%>

	<table class="btable table">
		<tr>
			<th>번호</th>		<th>제목</th>		<th>작성자</th>
			<th>작성일</th>	<th>조회수</th>	
		</tr>
		<a style="float: right;" style="text-decoration: none;" href="/jspweb/board/write.jsp">글쓰기</a>		
	</table>
	<div class="pagebox" ></div>
	</div>
	
	<div><!-- 검색처리 -->
	
		<div>게시물 수 : <span class="totalsize"></span></div>
		
		<div>
			<select class="listsize" onchange="blistsize()">
				<option value="5" >5</option>
				<option value="10" >10</option>
				<option value="15" >15</option>
				<option value="20" >20</option>
				<option value="25" >25</option>
			</select>
		</div>	
			
	
		<select class="key">
			<option value="b.btitle">제목</option>	<!-- sql문에 들어갈 이름이기에 그냥 title같은거 안됨 -->
			<option value="b.content">내용</option>
			<option value="m.mid">작성자</option>
		</select>
		
		<input class="keyword" type="text" placeholder="검색어"><button onclick="bsearch()" type="button">검색</button>
	
	</div>
	
	<script src="../js/board/list.js" type="text/javascript"></script>

</body>
</html>