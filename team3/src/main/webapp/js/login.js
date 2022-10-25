function login(){
	let id = document.querySelector('#id').value;
	let password = document.querySelector('#password').value;
	$.ajax({
		url : "http://localhost:8080/team3/login" ,
		data : { "id" : id , "password" : password } ,
		type : "POST" ,
		success : function(re){
			alert( id )
			alert( password )
		if( re == '0' ) {
				alert( re );
				 location.href="http://localhost:8080/team3/view/login.jsp";
		}else if( re == '1' ) {
				alert( re );
				 location.href="http://localhost:8080/team3/view/login.jsp";
		}else if( re == '2' ) {
				alert( re );
				location.href="http://localhost:8080/team3/view/login.jsp";
		}
		}
	})	
}