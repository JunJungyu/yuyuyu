/* 썸머노트 실행 */
$(document).ready(function() {
  $('#summernote').summernote();
});



function bwriter(){
	alert('작성 클릭')
	let info = {
		bcontent : document.querySelector('.bcontent').value ,
		btitle : document.querySelector('.btitle').value
	}
	$.ajax({
		url : "/team3/writer" ,
		data : info ,
		type : "POST" ,
		success : function( re ){
			if( re == 'true' ){
				alert('글 작성 완료')
				location.reload(true)
			}else{ alert('글 작성 실패') }
		}
	})
}