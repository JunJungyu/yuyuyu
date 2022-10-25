function findid(){

	let nname = document.querySelector('#nname').value
	$.ajax({
		url : "http://localhost:8080/team3/findid" ,
		type : "POST" ,
		data : { "nname" : nname } ,
		success : function( re ){
			let id = JSON.parse( re );
			if( id !== 'null' ){
				alert('입력하신 닉네임의 아이디는 '+id+'입니다.')		// 여기서 다 깨진다!! 
			}else{alert('없는 닉네임입니다.');}
		}
	})
}

