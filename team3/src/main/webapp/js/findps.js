function findps(){	
	let nname = document.querySelector('.nname').value;
	let id = document.querySelector('.id').value;
	
		$.ajax({
		url : "http://localhost:8080/team3/findps" ,
		type : "POST" ,
		data : { "nname" : nname , "id" : id } ,
		success : function( re ){
			// result = JSON.stringify( re );
			alert( result )
			if( re !== 'null' ){
				alert('입력하신 정보의 패스워드는 '+re+'입니다.');
			}
		}
	})
}