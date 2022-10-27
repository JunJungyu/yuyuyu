


bview()
function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" , 
		success : function( re ){
			let board = JSON.parse( re )
			console.log(board)
		
			document.querySelector('.btitle').vlaue = board.btitle;
			// 썸머노트는 내용 저장시 html 형식으로 저장하기 때문에
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			
			if( board.bfile !== null ){ // 첨부파일 존재하면	
											// type="button" 안쓰면 폼자체가 전송됨
				let filedelete = board.bfile+'<button type="button" oncilck="bfiledelete()">첨부파일 삭제</button>'	// 여기서 구성된 html
				document.querySelector('.oldbfilebox').innerHTML = filedelete; // 여기에
			}
			/* 썸머노트 실행 */
	$(document).ready(function() {
	
	  $('#summernote').summernote( {
		
		placeholder : '내용을 입력해주세요' ,  
	  	maxHeight : null ,
	  	minHeight : 300 ,
	  	lang : 'ko-KR'					// default : 'en-'
		
		} );
	
	});
			
			
			
			
		}
	})	
}


// 첨부파일 삭제 버튼을 눌렀을때 ( 1. 통신경로 2. 보낼데이터 3. 받을데이터 )
function bfiledelete(){
	
	// 1. 삭제 하기전에 확인
	confirm('삭제 하시겠습니까?');{	// 만약에 confirm [ 확인 true/취소 flase ]
		$.ajax({
	url : "http://localhost:8080/jspweb/board/bfiledelete" ,
	success : function( re ){ 
		alert(re);
		if( re === 'true' ){
			alert("첨부파일 삭제");
			// * 현재페이지 새로고침 : location.reload();
			// location.reload();
			// 특정태그만 새로고침 : JQUERY ( $ ) 제공
			document.querySelector('.oldbfilebox').innerHTML = '';
								// 띄어쓰기 안하면 안먹힘↓
			$("#oldbfilebox").load( location.href+' #oldbfilebox')
			
		}else{
			alert("첨부파일 삭제 실패");
		}
	}
})
	}
	

}

function bupdate(){
	
	let form = document.querySelector('form');
	let formdata = new FormData( form );
	console.log( formdata )
	
	$.ajax({
		url : "/jspweb/board/bupdate" ,
		data : formdata ,
		
		// 첨부파일시
		type : "POST" ,
		contentType : false ,
		processData : false ,
		
		// 성공시
		success : function( re ){ 
			if( re === 'true' ){
				location.href='view.jsp'
			}else{
				alert('수정실패');
			}
		}
		
	})
	
}
































