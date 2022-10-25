function findps(){	
	let nname = document.querySelector('#nname').value;
	let id = document.querySelector('#id').value;
	
		$.ajax({
		url : "/team3/findps" ,
		type : "POST" ,
		data : { "nname" : nname , "id" : id } ,
		success : function( re ){
			result = JSON.parse( re )
			alert( result + "삐용" )	// 왜? 안되지? 서블릿에선 정상적으로 받아오는데..
		}
	})
}