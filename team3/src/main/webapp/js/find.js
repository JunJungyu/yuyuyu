function findid(){
	
	let nname = document.querySelector('.nname').value;
	let type = document.querySelector('h3').value;
	
	alert( nname );
	alert( type )
	
	$.ajax({
		url : "http://localhost:8080/team3/find" ,
		type : "POST" ,
		data : { "type" : id , "nname" : nname } ,
		success : function( re ){
			alert('입력하신 닉네임의 아이디는'+re+'입니다.')
		}
	})
	alert('안  녕');
}

function findps(){
		$.ajax({
		url : "http://localhost:8080/team3/find" ,
		type : "POST" ,
		data : { "type" : passeord , "password" : password } ,
		success : function( re ){
			alert('입력하신 정보의 비밀번호는'+re+'입니다.')
		}
	})
}