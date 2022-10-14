list()				// 2. 실행 - 스크립트 실행 시 자동 실행 뭐 onclick에 넣으면 클릭 했을때 실행되는거고~

function list(){	// 1. 정의하고
	
	$.ajax({
		
		url : "http://localhost:8080/jspweb/board/list" , 
		success : function(re){
			let boardlist = JSON.parse( re )
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
				
			document.querySelector('.btable').innerHTML += html	// 누적더하기 안하면 헤더 사라지나봄?	
		}
		
	})
	
}

function viewload( bno ){			// 상세페이지로 이동
	$.ajax({
		url : "http://localhost:8080/jspweb/board/viewload" ,
		data : { "bno" : bno },
		success : function( re ){
			location.href = "http://localhost:8080/jspweb/board/view.jsp"
		}
	})
}


