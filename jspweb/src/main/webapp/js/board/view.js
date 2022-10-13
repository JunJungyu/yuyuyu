bview()

function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" ,
		success : function( re ){
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('btitle').innerHTML = board.btitle;
			document.querySelector('bcontent').innerHTML = board.bcontent;
			document.querySelector('.mno').innerHTML = board.mno;
		}
		
	})
}