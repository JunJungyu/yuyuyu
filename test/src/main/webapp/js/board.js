gettext()
function gettext(){
	$.ajax({
		url : "http://localhost:8080/test/board" , 
		success : function( re ){
			let bod = JSON.parse
			console.log( bod )
			if( re === 'true' ){
				document.querySelector('.bbno').innerHTML = '<button>dd</button>';
			}
		}
		
	})
	
}