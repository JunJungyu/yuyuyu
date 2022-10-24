
function write(){
	alert("1");
	let btitle = document.querySelector('#btitle');
	let bcontent = document.querySelector('#bcontent');
	let bwriter = document.querySelector('#bwriter');
	let bpassword = document.querySelector('#bpassword');
	alert("2");
	alert( btitle + bcontent + bwriter + bpassword )
		$.ajax({
			url : "http://localhost:8080/tetest/board/write" , 
			data : { "btitle" : btitle,
					 "bcontent" : bcontent ,
					 "bwriter" : bwriter ,
					 "bpassword" : bpassword
					 } ,
			success : function( re ){
				if( re ){
					alert("글 작성 완료");
				}
				
					
			}
		})
	alert("3"); 
}