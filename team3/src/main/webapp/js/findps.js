function findps(){

let findps = {
	id : id ,
	nname : nname
}
	
	let password = document.querySelector('.password').value;
	
		$.ajax({
		url : "http://localhost:8080/team3/findps" ,
		type : "POST" ,
		data : { "password" : password } ,
		success : function( re ){
			let findps = JSON.parse( re )		// 아닌가..? 왜 안되는거야.. 
			
			alert('입력하신 정보의 비밀번호는'+findps+'입니다.')
		}
	})
}