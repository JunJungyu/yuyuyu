function findid(){

	let nname = document.querySelector('.nname').value
	alert( nname );

	$.ajax({
		url : "http://localhost:8080/team3/findid" ,
		type : "POST" ,
		data : { "nname" : nname } ,
		success : function( re ){
			alert('흠내링');
			nname = JSON.parse( re );
			
			
			alert('입력하신 닉네임의 아이디는'+nname+'입니다.')
			alert('입력하신 닉네임의 아이디는'+re+'입니다.')
		}
	})
	alert( nname );
}

