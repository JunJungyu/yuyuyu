function bwriter(){
	
	let btitle = document.querySelector('#btitle').value;
	let bcontent = document.querySelector('#bcontent').value;
	let bfile = document.querySelector('#bfile').value;
	
	$.ajax({
		url : "/team3/writer" ,
		data : { "btitle" : btitle , "bcontent" : bcontent , "bfile" : bfile } ,	// 이걸 보내야 서블릿에서 받는구나..
		success : function( re ){
			if( re == 'true' ){
				alert('글 작성 완료')
				location.reload(true)
			}else{ alert('글 작성 실패') }
		}
	})
}