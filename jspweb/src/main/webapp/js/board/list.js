let pageinfo = {	// js 객체 선언
	listsize : 5 ,			// 한페이지당 게시물 표시 개수
	page : 1 , 				// 현재 페이지 정보
	key : '' ,				// 검색 키 
	keyword : '' ,			// 검색 키워드
}

// 화면에 표시할 게시물 개수
function blistsize(){
	pageinfo.listsize = document.querySelector('.listsize').value
	alert( pageinfo.listsize )
	list( 1 )
}

// 4. 검색처리 함수
function bsearch(){
	
	let key = document.querySelector('.key').value
	let keyword = document.querySelector('.keyword').value
	
	pageinfo.key = key
	pageinfo.keyword = keyword
	list( 1 )
	
}

list( 1 )				// 2. 실행 - 스크립트 실행 시 자동 실행 뭐 onclick에 넣으면 클릭 했을때 실행되는거고~

function list( page ){	// 1. 정의하고
	
	pageinfo.page = page;	// 객체 정보 변경
	console.log( pageinfo );

	$.ajax({
		
		url : "http://localhost:8080/jspweb/board/list" , 
		data : pageinfo ,		// 페이지 정보 객체 전달
		success : function(re){
			
			let boards = JSON.parse(re)
			console.log( boards );

			// 1. Object 내 게시물 리스트 먼저 호출
			let boardlist = boards.data
			
			console.log( boardlist )					// 출력을 하려면 객체가 있어야됨
			let html = ""
			
			for( let i = 0; i < boardlist.length ; i++ ){
				// 1. i번째 객체 호출
				let board = boardlist[i]
				// 2. i번째 객체의 정보를 html 형식으로 변환해서 문자열에 저장
				html += 
						'<tr>'+
				'<td>'+board.bno+'</td>'+								// 내가 클릭한 보드 넘버 변수로 줌 변수는 ''이고 링크는 ""니까  '"로 끝남
				//'<td><a htef="http://localhost:8080/jspweb/js/board/view.jsp?bno='+b.bno+'">'+board.btitle+'</td>'+
				'<td onclick="viewload('+board.bno+')">'+board.btitle+'</td>'+
				'<td>'+board.mid+'</td>'+
				'<td>'+board.bdate+'</td>'+
				'<td>'+board.bview+'</td>'+
				'		</tr>'
			}//FOR END	
				console.log( html )						// 중간중간 console.log 찍어서 확인해보기
				
			document.querySelector('.btable').innerHTML = html	// 누적더하기 안하면 헤더 사라지나봄?	
			
			
			// 1. 페이징 html 구성
			let pagehtml = '';
			
				// 2. 이전 버튼
				if( page <= 1 ){
					pagehtml += '<button onclick="list('+(page)+')">이전</button>';
				}else{pagehtml += '<button onclick="list('+(page-1)+')">이전</button>';}
				
				
				// 4. 페이지번호 버튼
				for( let page = boards.startbtn ; page <= boards.endbtn; page++ ){
					pagehtml += '<button type="button" onclick="list('+page+')">'+page+'</button>';
				}
				
				// 3. 다음 버튼
				if( page >= boards.totalpage ){
					pagehtml += '<button onclick="list('+page+')">다음</button>'
				}else{pagehtml += '<button onclick="list('+(page+1)+')">다음</button>';}
				
				
				
				document.querySelector('.pagebox').innerHTML = pagehtml
				
				document.querySelector('.totalsoze').innerHTML = boards.totalsize;
		}
		
	})
	
}

// 상세페이지로 이동
function viewload( bno ){			
	$.ajax({
		url : "http://localhost:8080/jspweb/board/viewload" ,
		data : { "bno" : bno },
		success : function( re ){
			location.href = "http://localhost:8080/jspweb/board/view.jsp"
		}
	})
}


