
function postwriter(){
	let btitle = document.querySelector('#btitle').value;
	let bcontent = document.querySelector('#bcontent').value;
	let bwriter = document.querySelector('#bwriter').value;
	
	$.ajax({
		url : "" ,
		success : function( re ){
			alert( re )
		}
	})
	
}