getlist()
function getlist(){
	alert('1');
	$.ajax({
		url : "http://localhost:8080/tetest/board/list" ,
		success : function( re ){
			let boards = JSON.parse(re)
			console.log( boards );

			// 1. Object 내 게시물 리스트 먼저 호출
			let boardlist = boards.data
			
			console.log( boardlist )					// 출력을 하려면 객체가 있어야됨
			let html =  '<tr>'+	
							'<th name="bno">no</td>'+
							'<th name="btitle">title</td>'+
                            '<th name="bcontent">content</td>'+
                            '<th name="bwriter">writer</td>'+
                            '<th name="bpassword">password</td>'+
                            '<th name="bdate">date</td>'+
                            '<th name="bview">view</td>'+
                         '</tr>';
			
			for( let i = 0; i < boardlist.length ; i++ ){
				// 1. i번째 객체 호출
				let board = boardlist[i]
				// 2. i번째 객체의 정보를 html 형식으로 변환해서 문자열에 저장
				html += 
						'<tr>'+
							'<td>'+board.bno+'</td>'+								
							'<td>'+board.btitle+'</td>'+
							'<td>'+board.bcontent+'</td>'+
							'<td>'+board.bwriter+'</td>'+
							'<td>'+board.bpassword+'</td>'+
							'<td>'+board.bdate+'</td>'+
							'<td>'+board.bview+'</td>'+
						'</tr>'
			}//FOR END
			alert(html);
			document.querySelector('table').innerHTML += html	// 누적더하기 안하면 헤더 사라지나봄?	
		}
	})
	alert('2');
}