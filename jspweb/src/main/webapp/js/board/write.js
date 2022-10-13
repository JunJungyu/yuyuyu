

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
	
	/*
	
		let 객체 = { 속성명 : 데이터 , 속성명 : 데이터 ~ }
	
	 */
}
	