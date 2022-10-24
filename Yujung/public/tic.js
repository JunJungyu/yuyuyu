/**
 * 
 */
 
 let 게임상황 = []	//현대 알을 저장하는 배열
 let 승리 = '' //이긴 알을 저장하는 변수
 
function 게임버튼(){
	let 승리 = ''
	let 게임상황 = [ null ,null ,null ,null ,null ,null ,null ,null ,null ]
	let 게임버튼 = ''
	for( let i = 0; i<9; i++ ){
		게임버튼 += `<button id=${i} onclick="흑돌(${i})">${i}</button>`
		if( i % 3 == 2 ){
			게임버튼 += `<br>`
		}
	}
	document.getElementById('bigbox').innerHTML = 게임버튼;
	
}

function 흑돌(i){
	if( 중복검사(i) ){
		 alert('이미 둔 자리입니다.')
		 return 	 
	}
	 
	document.getElementById(i).innerHTML = '●';
	게임상황[i] = '●';	
	if( 게임결과() ){
		alert(승리+'승리입니다.')
	}	
	


	
	while( true ){
	let 랜덤 = Math.floor(Math.random()*9)
	if( !중복검사(랜덤) ){
	document.getElementById(랜덤).innerHTML = '○';
	게임상황[랜덤] = '○';
	break;		
	}
	}	
}


function 중복검사(i){
	if( 게임상황[i] != null ){
		return true	// 알이 있다.
	}else{
		return false // 알이 없다.
	}
}

function 게임결과( ){
	//1. 가로로 이기는 수 012 345 678
	for( let i = 0 ; i <=6 ; i += 3 ){
		// i는 0부터 6까지 3씩 증가
		if( 게임상황 != null && 게임상황[i] == 게임상황[i+1] && 게임상황[i+1] == 게임상황[i+2] ){
			승리 = 게임상황[i]
			return true
		}
	}
	
	//2. 세로로 이기는 수 036 147 258
	//3. 대각선으로 이기는 수	048 246
	//4. 무승부 - 위 상황이 아니면서 알이 9개
}



