let check = document.querySelectorAll('.check')

function idchack(){
	let id = document.querySelector('#id').value;
	let idcheck = /^[a-zA-Z0-9]{5,20}$/
	
	if( idcheck.test(id) ){
		check[0].innerHTML = "정상";
	}
	if( !idcheck.test(id) ){check[0].innerHTML = "비정상 아이디";}	

	
}

function pscheck(){
	let ps = document.querySelector('#password').value;
	let pscheck = /^[a-zA-Z0-9]{5,20}$/
	
	if( pscheck.test(ps) ){					
		check[1].innerHTML = '정상';
	}
	if( !pscheck.test(ps) ){ check[1].innerHTML = '비정상 비밀번호'; }
	
}

function nncheck(){
	let nn = document.querySelector('#nickname').value
	let nncheck = /^[a-zA-Z0-9가-힣]{1,20}$/
	
	if( nncheck.test(nn) ){
		check[2].innerHTML = '정상';
	}
	if( !nncheck.test(nn) ){ check[2].innerHTML = '비정상 닉네임'; }
}

function signup(){
	for( let i = 0; i < check.length ; i++ ){
		if( check[i].innerHTML === '정상' ){
			return true;
		}
		if( check[i].innerHTML !== '정상' ){
			return false;					// false면 뭐..?
		}
	}
}