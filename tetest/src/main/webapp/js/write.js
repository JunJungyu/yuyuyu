
function write(){
	alert("1");
	let inputs = document.querySelector('input');

	alert("2");
	alert( btitle + bcontent + bwriter + bpassword )
		$.ajax({
			url : "http://localhost:8080/tetest/board/write" , 
			data : { inputs } ,
			success : function( re ){				
					alert('2-2');
			}
		})
	alert("3"); 
}