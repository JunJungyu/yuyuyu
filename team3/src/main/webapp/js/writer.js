function bwriter(){
	
	let btitle = document.querySelector('#btitle').value;
	let bcontent = document.querySelector('#bcontent').value;
	let bfile = document.querySelector('#bfile').value;
	
	// 서블릿에서는 null 인데 여긴 또 잘 나오고..
	console.log( btitle + bcontent + bfile )
	
	$.ajax({
		url : "/team3/writer" ,
		success : function( re ){
			if( re == 'true' ){
				alert('글 작성 완료')
			}else{ alert('글 작성 실패') }
		}
	})
}