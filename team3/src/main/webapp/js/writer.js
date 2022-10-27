/* 썸머노트 실행 */
$(document).ready(function() {
  $('#summernote').summernote();
});



function bwriter(){
	alert('작성 클릭')

	let bcontent = document.querySelector('.bcontent').value
	let btitle = document.querySelector('.btitle').value
	let bfile = document.querySelector('.bfile').value

	let form = document.querySelector('form')
	let formdata = new FormData( form )
	
	$.ajax({
		url : "/team3/writer" ,
		data : formdata ,
		type : "POST" ,
		contentType : false ,		
		processData : false ,
		success : function( re ){
			if( re == 'true' ){
				alert('글 작성 완료')
				location.reload(true)
			}else{ alert('글 작성 실패') }
		}
	})
}