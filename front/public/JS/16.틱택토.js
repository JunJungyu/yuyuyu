	/*
		틱택토( 삼목 )
			1. 게임판 구현
			2. 버튼 눌림 기능
			3. 사용자(선택) va 컴퓨터(랜덤)
			4. 승리자 판단
	함수는
	function 함수명 ( 매개변수 , 매개변수2 ) {코드}
	
	
	
	*/
	/*
	게임판그리기()
	// 1. 게임판 출력하는 함수
	function 게임판그리기(){
		//function 함수 만들기 키워드
			//게임판 그리기 이름으로 함수 선언 [ 매개변수 x 리턴값 x ]
	
		let 게임판 =''	// 여러개 버튼(태그)을 저장하는 변수
		for( let i = 0 ; i<9 ; i++){	//i는 0부터 8까지 1씩 증가
			게임판 += `<button id=${i} onclick=버튼선택(${i})>${i}</button>`
			// 게임판 변수에 버튼(tag)을 누적 더하기
			if( i % 3 == 2 ){ 게임판 += '<br>' }
			// \ 2 5 8일때 줄바꿈
		}
		//문서(html)의 id가 gameboard의 
		document.getElementById('gameboard').innerHTML = 게임판
	}
	// 2. 버튼 선택 함수
	function 버튼선택 ( i ){
		alert( i + '버튼눌림')
		//사용자가 선택한 버튼의 id의 html -> o변경
		document.getElementById( i ).innerHTML = 'o'
		// [ 컴퓨터 ] 난수 발생
			//Meth	// Meth : 수학 관련 메소드 제공하는 클래스
			//random()	//Meth.random() : 0~1 사이의 난수 발생
	//	Math			//Math.random() * 끝번호-1
						//Math.random() * 9 ) + 1 : 1~10 사이의 난수 발생
	let rand = Math.floor(Math.random() * 9	)//0~8
	//Math.floor	// 가장 가까운 정수로
	//내림 Meth.round() 반올림 Math.cell() 올림
	alert('난수: ' + rand)
	document.getElementById( rand ).innerHTML = 'X'
	
		
		}
		
	// 3. 게임 상태(상황) 함수
	function 상황출력 (){}
	// 4. 게임 결과 함수
	function 게임결과 (){}
	*/
	
	/*
	1. 9개의 버튼 생성
	2. 버튼 클릭하면 모양 변경
	3. 근접한 버튼의 모양이 3개 모두 동일하면 승리
	
	
	*/
	
	/*
	
	let 게임상황 = []	//현재 알을 둔 상황을 저장하는 배열
	let 승리 = ''		//이긴 알을 저장하는 변수
	
	//1. 게임판 버튼을 만들어주는 함수
	function 게임판그리기(){
		승리 = ''		//승리변수를 공백으로 초기화
		게임상황 =[null,null,null,null,null,null,null,null,null]	//배열에 9개를 null로 초기화
		let 게임판 = ''	// 반 변수 선언
		
		
		
		foe( let i = 0 ; i<9 ; i++ ){
			//i는 0부터 9미만 까지 1씩 증가 [8회 반복]
			게임판 += `<button>${i}</button>`
			if(i % 3 == 2){게임판 +=`<br>`}
	
	}// f end
	//html 호출
	document.getElementById('gameboard'),innerHTML = 게임판
	
	// 2. 버튼을 눌렀을때 이벤트 함수 [ 매개변수 : i = 선택한 버튼 번호 ]
	function 버튼선택( i ){
		//선택한 번호의 모양 변경
		document.getElementById( i ),innerHTML = '○'
			//2. 해당 알을 배열에 저장
			게임상황[i] = '○'
			if(중복검사(i)){return}	//3. 함수 호출해서 해당 위치에 알이 있으면 함수 종료(return)
			
	if(게임결과()) {//게임결과 함수에서 ture가 리턴되면
		alert('게임 종료 승리:')
		
		
	}		
	
	
	
			
		// 2. 난수 발생[Math.floor(실수):소수점 버림 / Math.random() : 0~1사이의 실수 난수 발생]
		while(ture){//무한루프 : 랜덤위치에 알을 두었을 때 반복종료
			
		}
		let rand = Math.floor(Math.random()*9)		//0~8사이의 난수 발생
		if(중복검사(rand))
		document.getElementById(rand).innerHTML = 'X'
		게임상황	
	}
// 3. 현재 위치에 알이 있는지 검사하는 함수()
function 중복검사(i){
	if(게임상황 [val] != null){//배열은 모두 null로 초기화했기 때문에 null 아니면 o또는 x가 존재하는 의미 [ 알이 있다. ]
		return true // 알이 있다.	
	}else{
		return false	//알이 없다.
	}
}
	
	// 4. 현재 상황에 게임결과 판단하는 함수
function 게임결과(){
	
	//1. 가로로 이기는 수 [012 , 345 , 678]
	for( i = 0 ; i<=6 ; i+=3){
		//i는 0부터 6까지 3씩 증가반복 [3회 반복 0 3 6]
		if(게임상황[i] !=null 게임상황[i] == 게임상황[i+1] && 게임상황 [i+1] 게임상황 [i+2])
		// && 이면서 면서 모두 그리고
			// 0 == 1 == 2	// 3 == 4  == 5  // 6 == 7 == 8
		승리 = 게임상황[i]
		return ture // 가로로 승리가 나왔을때 경우 함수 경로
	}
	//2. 세로로 이기는 수 [036 , 147 , 258]
	for( let i = 0 ; i <= 2 ; i++ ){
		if(게임상황[i] !=null && 게임상황[i] == 게임상황[i+3] && 게임상황[i+6])
	}
	
	
	//3. 대각선으로 이기는 수 [048 , 246]
	//4. 무승부 [위 상황이 아니면서 알이 9개이면]
	
}	

*/
	/*
	1. 9개 버튼 생성 [ 게임판 변수에 모든 버튼를 저장한다. ]
		1. 3개마다 줄바꿈처리  2 5 8 일때 
	2. 버튼 클릭하면 모양 변경 
		1. 선택한 버튼의 모양 변경 [ O ]
		2. [컴퓨터]난수 발생 모양 변경 [ X ]
	3. 근접한 버튼의 모양이 3개 모두 동일하면 승리  
*/

let 게임상황 = []	// 현재 알을 둔 상황을 저장하는 배열
let 승리 = ''	// 이긴 알을 저장하는 변수 

// 1. 게임판 버튼을 만들어주는 함수 
function 게임판그리기(){ 
	
	승리 = '' // 승리 변수를 공백으로 초기화
	게임상황 = [null,null,null,null,null,null,null,null,null] // 배열에 9개 null로 초기화 
	let 게임판 = '' // 빈 변수 선언 
	
	for( let i = 0 ; i<9 ; i++ ){
		// i는 0부터 9미만 까지 1씩증가 [ 8회 반복 ]
		게임판 += `<button id=${i} onclick="버튼선택(${i})">${i}</button>`
		if( i % 3 == 2 ){ 게임판 +=`<br>` }
	} // for end 
	// html 태그 호출 
	document.getElementById('gameboard').innerHTML = 게임판
} // f end

// 2. 버튼을 눌렀을때 이벤트 함수 [ 매개변수 : i = 선택한 버튼 번호 ] 
function 버튼선택( i ){
	
	if( 중복검사(i) ){  // 3. 함수호출해서 해당 위치에 알이 있으면 함수 종료(return)
		alert('안내) 이미 둔 자리 입니다.') 
		return // 현 위치에서 함수 종료  [ 아래 코드가 실행X]
	}// if end 
	document.getElementById( i ).innerHTML = 'O' // 1.선택한 번호의 버튼 모양 변경 
	게임상황[i] = 'O' // 2. 해당 알을 배열에 저장 
	
	
	if( 게임결과( ) ) { // 게임결과 함수에서 true가 리턴되면 
		alert('게임종료 승리 : ' + 승리 )
		return // 함수 강제 종료 
	}
	
	// 2.난수 발생 [ Math.floor(실수) : 소수점 버림 / Math.random() : 0~1 사이의 실수 난수 발생  ]
	while( true ){ // while(true) : 무한루프[ 종료조건 : 랜덤위치에 알을 두었을때 반복종료 ]
		let rand = Math.floor( Math.random()*9 )	// 0~8 사이의 난수 발생 
		if( !중복검사(rand) ){ // 해당 위치에 알이 없으면
			document.getElementById( rand ).innerHTML ='X' // 버튼 모양 변경  
			게임상황[rand] ='X'// 해당 알을 배열에 저장 
			break // while 탈출
		}// if end 
	} // while end 
	
	
	if( 게임결과( ) ) { // 게임결과 함수에서 true가 리턴되면 
		alert('게임종료 승리 : ' + 승리 )
		return // 함수 강제 종료 
	}
	
	
	
} // f end 
// 3. 현재 위치에 알이 있는지 검사 함수 [중복검사]
function 중복검사(  i  ){
	if( 게임상황[i] != null ){ // 배열은 모두 null로 초기화했기때문에 null 아니면 'O'또는'X'가 존재하는 의미 [ 알이 있다. ]
		return true // 알이 있다.  null 이 아니면 
	}else{
		return false // 알이 없다.  null 이면 
	} 
}
// 4. 현재 상황에 게임결과 판단하는 함수
function 게임결과(){
	// 1. 가로로 이기는 수 [ 0 1 2 , 3 4 5 , 6 7 8 ]
	for( let i = 0 ; i<=6 ; i+=3 ){
		// i는 0부터 6까지 3씩 증가반복 [ 3회 : 0 3 6 ]
		if( 게임상황[i] !=null && 게임상황[i] == 게임상황[i+1] && 게임상황[i+1] == 게임상황[i+2] ){
			// && 이면서 면서 이고 모두 그리고
			// i가 0일떄 0 == 1 == 2    // i가 3일떄  3 == 4 == 5  // i가 6일때  6 == 7 == 8 
			승리 = 게임상황[i] // 승리 변수에 i번째 알 저장 
			return true // 가로로 승리가 나왔을때 경우 함수 종료 
		}
	}
	// 2. 세로로 이기는 수 [ 0 3 6 , 1 4 7 , 2 5 8 ]
	for( let i = 0 ; i<=2 ; i++ ){
		// i는 0부터 2까지 1씩 증가반복 [ 3회 : 0 1 2 ]
		if( 게임상황[i] !=null && 게임상황[i] == 게임상황[i+3] && 게임상황[i+3] == 게임상황[i+6] ){
			승리 = 게임상황[i] // 승리 변수에 i번째 알 저장 
			return true // 가로로 승리가 나왔을때 경우 함수 종료 
		}
	}
	// 3. 대각선으로 이기는 수 [ 0 4 8 , 2 4 6 ]
	// 4. 무승부 [ 위 상황이 아니면서 알이 9개 이면 ]
}
