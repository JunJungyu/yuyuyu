function findid(){
	alert("파인드아이디들어옴");
	$.ajax({
		url : "http://localhost:8080/team3/findid" ,
		type : "POST" ,
		success : function( re ){
			alert("서블릿 연결됨");
			alert( re );
		}
	})
}