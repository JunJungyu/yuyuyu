gettext()
function gettext(){
	alert("js됐디");
	$.ajax({
		url : "http://localhost:8080/test/board" , 
		success : function( re ){
			if( re === 'true' ){
				
			}
		}
		
	})
	
}