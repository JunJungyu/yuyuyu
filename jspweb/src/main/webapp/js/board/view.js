/*
	value : input , select , tectarea 등
		<tag value 여기 >
	innerHTML : div , table , span , tectare 등
		<tag> 여기 </tag>
*/

function rwrite(){
	let rcoment = document.querySelector('.rcoment').value;
	
	$.ajax({
		url : "http://localhost:8080/jspweb/reply/rwrite" ,
		data : { "rcoment" : rcoment } ,
		type : "POST" ,					// http 메소드
		success : function( re ){
			if( re == 1 ){
				alert("굿");
			}else if( re == 0 ){
				alert("로긴해")
			}else{
				alert("땡")
			}
		}
	})
}





















bview()

function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" ,
		success : function( re ){
			let board = JSON.parse( re )
			console.log( board );
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.mid').innerHTML = board.mid;
			document.querySelector('.bdate').innerHTML = board.bdate;
			//document.querySelector('bfile').innerHTML = board.bfile;
		
		// 절대경로 : http://localhost:8080/jspweb/filedown
		// 상대경로 : 현재 위치 기준 [ http:/localhost:8080/jspweb/js/view.js ]
		// 												../board.filedown
		
		
		
		// <a href="URL?변수명=데이터">	: get메소드로 해당 URL로 데이터 전송가능 
		// '<a href="URL?변수명='+변수+'">'
		if( board.bfile !== null ){		// null , undefined , 0 , false 널이 아닌 경우
			let filelink = '<a href="http://localhost:8080/jspweb/board/filedown?bfile='+board.bfile+'">'+board.bfile+'</a>'
				// ' ' : 전체 문자열 처리
				// " " : 전체 문자열내 문자열 구분
			document.querySelector('.bfile').innerHTML = filelink;		// bfile에 html a를 넣어주는데...
			
		}
		
		let btnbox = document.querySelector('.btnbox')
		
		// 삭제 버튼 활성화
		if( board.btnaction === true ){		//  본인 글
			let deletbtn = '<button onclick="bdelete('+board.bno+')">삭제</button>'
			btnbox.innerHTML += deletbtn;
			// 수정버튼 활성화
			let updatebtn = '<button><a href="http://localhost:8080/jspweb/board/update.jsp">수정</a></button>'
			btnbox.innerHTML += updatebtn;
		}
			
		

		}
		
	})
}

function bdelete( bno ){	// 삭제 버튼 클릭 시 삭제할 번호를 인수 [식별]
	
	$.ajax({
		url : "http://localhost:8080/jspweb/board/bdelete" ,
		data : { "bno" : bno }	, // 삭제할 게시물의 식별번호 [ pk -> bno ]
		success : function( re ){
			if( re === 'true' ){
				alert('글 삭제 성공');
				location.href="http://localhost:8080/jspweb/board/list.jsp"
			}
			else{alert('글 삭제 실패');}
		}
	})
	
}