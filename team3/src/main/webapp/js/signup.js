let check = document.querySelectorAll('.check')

function idchack(){
	let id = document.querySelector('#id').value;
	let idcheck = /^[a-zA-Z0-9]{5,20}%/
	//console.log( id )
	if( idcheck.test(id) ){
		
		$.ajax({
		url : "http://localhost:8080/team3/idcheck" ,
		data : { "id" : id } ,
		success : function ( re ){
		alert( mid );
		alert( "rere" );
		if( re === 'true' ){
			check[0].innerHTML = "굿";
		}else if( re == 'false' ){
			check[0].innerHTML = "밷";
		}
		}		
		
	})
	}else{check[0].innerHTML = "안맞아";}	

	
}

function pscheck(){
	// alert("2");
}

function nncheck(){
	// alert("3");
}