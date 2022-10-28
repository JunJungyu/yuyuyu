getlistimg()			// 글 출력 함수 자동 실행
function getlistimg(){
	$.ajax({
		url : "http://localhost:8080/team3/list" ,
		success : function( re ){
			let json = JSON.parse( re )
			let html = '<table><tr>';
			
			let i = 0;
			
				for( int = 0 ; i < 3 ; i++ ){										// 3*3형식으로 호출할거니까 맨 윗줄 3번 반복 총 0~8반복
					html += '<th onclick="detaleboard()" id="imgbox"><h3>'+json[i].bcontent+'</h3></th>';		
				}
				html += '</tr><tr>'
				
				for( int = 3 ; i < 6 ; i++ ){										// 3번씩 반복하는데 반복할때마다 <tr>을 닫아버리면 행이 3개씩 만들어지니까
					html += '<td onclick="detaleboard()" id="imgbox">'+json[i].bcontent+'</td>';
				}
				html += '</tr><tr>'
				
				for( int = 6 ; i < 9 ; i++ ){				
					html += '<td onclick="detaleboard()" id="imgbox">'+json[i].bcontent+'</td>';
				}
				html += '</tr></table>'						
				document.querySelector('.c_post_img_list').innerHTML = html				
			
		}
	})
}

function detaleboard(){ // 어떻게 연결해야 여기가 아닌 js에서 getlistimg()랑 연결하지? js를 두개 연결하기에는 list가 자동실행이라 지저분하다
	alert('글 클릭 근데 번호를 어떻게 받아오나')
	$.ajax({
		url : "" ,
		type : "POST" ,
		success : function( re ){
			alert( re )
		}  
	})
	
}