/* 썸머노트 실행 */
$(document).ready(function() {

  $('#summernote').summernote( {
	
	placeholder : '내용을 입력해주세요' ,  
  	maxHeight : null ,
  	minHeight : 300 ,
  	lang : 'ko-KR'					// default : 'en-'
	
	} );

});

function bwrite(){
	
	let form = document.querySelector('form')	// 1. form 태그

	let formdata = new FormData ( form )		// 2. 객체화된 form 정보 [ form 정보 호출 ]
												// [ form안에 입력받은 데이터 input ]
	console.log( formdata );
	console.log( form );
	$.ajax({									// ajax 통신 : 전송타입 : 문자열
		url : "http://localhost:8080/jspweb/board/write" ,		// 서블릿주소 주소가 없어도 된다...?
		data : formdata ,						// ajax 기본값으로 form 전송 불가능
		
		// 첨부파일 전송시 : 아래 코드 추가 [ 1. post 방식 ( get방식 불가 ) ]
		contentType : false ,					// 기본값이 char? contentRtpe 전송할 데이터의 타입 - 문자열 아님!
		// application x-www form-urlencoded; charest = UTF-8 : 기본값 첨부파일 지원X
		// vs false : multypart.form-data 첨부파일 지원O
		
		processData : false ,					// 전송시 사용되는 타입 - 문자열 안쓰겠다?
		// 기본값 : 										
		type : 'POST' ,							// http메소드 method ( get / post ) 첨부파일은 get가 안되기 때문
		success : function( re ){
			if( re === 'true' ){ location.href="http://localhost:8080/jspweb/board/list.jsp" }else{alert('글등록실패~');}
		}
	})
	
}


/*
form 없는 버전
function bwrite(){
	
		let inputs = document.querySelectorAll('input')
		let data = {	
		btitle : inputs[1].value ,						// 위에서 let으로 선언한 inputs와 이름 맞춰야됨
		bcontent : inputs[2].value
	}

	$.ajax({
		url : "http://localhost:8080/jspweb/board/write.jsp" ,
		data : data ,
		success : function ( re ){ 
			if( re === 'true' ){ alert('글등록'); location.href="http://localhost:8080/jspweb/board/list.jsp" }
			else{ alert('글 등록 실패') }
		 }
	})
	
	
	
		// let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~ }
	
	 
}
*/	
