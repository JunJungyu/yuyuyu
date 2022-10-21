let check = document.querySelectorAll('.check')

// 아이디 유효성 검사
function idchack(){											
	let id = document.querySelector('#id').value;
	let idcheck = /^[a-zA-Z0-9]{5,20}$/
	
	if( idcheck.test(id) ){
		$.ajax({
			url : "http://localhost:8080/team3/idcheck" ,
			data : { "id" : id } ,							// 매개변수로 쓸 id를 줘야되니까 쓰는..건가..?
			success : function( re ){
				if( re === 'true' ){ check[0].innerHTML = "정상" }
				else{ check[0].innerHTML = '이미 존재' }
			}
		})
	}else{
		check[0].innerHTML = "비정상 아이디";
	}
}

// 비밀번호 유효성 검사
function pscheck(){
	let ps = document.querySelector('#password').value;
	let pscheck = /^[a-zA-Z0-9]{5,20}$/
	
	if( pscheck.test(ps) ){					
		check[1].innerHTML = '정상';
	}
	if( !pscheck.test(ps) ){ check[1].innerHTML = '비정상 비밀번호'; }
	
}

// 닉네임 유효성 검사
function nncheck3(){
	let nickname = document.querySelector('#nickname').value
	let nncheck = /^[a-zA-Z0-9가-힣]{2,20}$/
	if( nncheck.test(nickname) ){										// 유효성 검사 충족
		$.ajax({
			url : "http://localhost:8080/team3/nncheck" ,
			data : { "nickname" : nickname } ,				
			success : function( re ){
				if( re === 'true' ){ check[2].innerHTML = "정상"; }
				else{ check[2].innerHTML = '이미 존재'; }
				}
		})
	}else{
		check[2].innerHTML = "비정상 닉네임";
	}
}
// 회원가입 조건 모두 충족하는지 검사
function signup(){
	for( let i = 0; i < check.length ; i++ ){
		if( check[i].innerHTML != '정상' ){
			return false;
		}
	}
	
	//
	document.querySelector('form').submit()
}







