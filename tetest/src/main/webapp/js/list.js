getlist()
function getlist(){
	$.ajax({
		url : "/tetest/board/list" ,
		success : function( re ){
			let boards = JSON.parse(re)
			alert('보드0')
			alert( boards[0] )			
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
				let board = boardlist[i]
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
			}
			alert('하세요');
			document.querySelector('#table').innerHTML += html	
		}
	})
}