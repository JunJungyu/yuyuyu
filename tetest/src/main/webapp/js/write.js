

// 1. 작성하기 버튼을 눌렀을대 실행되는 메소드
function bwrite(){ // 일반적으로 write 이름은 사용하시면 안됩니다.. js 에 이미 존재하는 메소드명이라서요

	// 1. 모든 input에 입력된 데이터 배열로 가져오기 
	let inputs = document.querySelectorAll('input');
					// input을 한번에 여러개 가져올려면 querySelectorAll 사용해야됨 전체 다 가져오는거니까
	
	// 2. 가여온 배열 input에서 각각 데이터 호출해서 객체화 하기 
	let info = {
		btitle : inputs[0].value ,
		bcontent : inputs[1].value ,
		bwriter : inputs[2].value ,
		bpassword : inputs[3].value 
	}

	// 3. ajax 이용한 객체 전송
	$.ajax({
		url : "http://localhost:8080/tetest/board/write" , 
		data : info,
		success : function( re ){				
				if( re ){
					alert('글 작성 완료');
				}
		}
	})
		
}