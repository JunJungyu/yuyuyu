getlistimg()			// 글 출력 함수 자동 실행
function getlistimg(){
	$.ajax({
		url : "http://localhost:8080/team3/list" ,
		success : function( re ){
			
			let json = parse( re );
			
			let html = '<table><tr>'
			
			for( int = 0 ; i < 3 ; i++ ){					// 3*3형식으로 호출할거니까 맨 윗줄 3번 반복 0~8반복
				html += '<th id="imgbox">'+json[i].bfile+'</th>';
			}
			html += '</tr><tr>'
			
			for( int = 3 ; i < 6 ; i++ ){					// 3번씩 반복하는데 반복할때마다 <tr>을 닫아버리면 행이 3개씩 만들어지니까
				html += '<td id="imgbox">'+json[i].bfile+'</td>';
			}
			html += '</tr><tr>'
			
			for( int = 6 ; i < 9 ; i++ ){				
				html += '<td id="imgbox">'+json[i].bfile+'</td>';
			}
			html += '</tr></table>'						
			document.querySelector('.c_post_img_list').innerHTML = html
		}
	})
}