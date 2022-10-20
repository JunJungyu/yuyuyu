function login(){
	$.ajax({
		url : "http://localhost:8080/team3/login" ,
		type : "POST" ,
		success : function(re){
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
	alert("d");
	
}