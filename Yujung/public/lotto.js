/**
 * 
 */
 
 for( i = 1; i >=45 ; i++ ){
	내번호[i] == null
}
 
 let 내번호 = [];
 
 function 버튼출력(){
	//1부터 45의 버튼 저장할 변수
	let btnlist = ''
	//45개 만들거니까 1부터 45까지 1씩 커지게
	for( let i = 1; i<=45; i++ ){
		//버튼에 숫자 i 넣고			//${} 안에 변수나 변수나 연산 등 삽입
		btnlist += `<button onclick="버튼클릭(${i}); 값출력(${i});">${i}</button>`
		//5의 배수마다 줄바꿈
		if( i % 5 == 0 ){ btnlist +=`<br>` }
	}
	//현재 문서의 btnbox라는 id 갖는 태그 호출해서 html 변수에 대입
	document.getElementById('btnbox').innerHTML = btnlist;
}

function 버튼클릭(i){
	
	if( 내번호[i] == null ){
		내번호[i] = i
		alert(' '+i+'번 버튼 클릭하셨습니다.')
	}else{
		alert('이미 선택한 번호입니다.')
		내번호[i] == null
	}
}

function 값출력(i){
	if( 내번호[i] == i ){
		document.getElementById('내박스').innerHTML += i + ', '
	}
}

function btn_click(i){
	// 배열 내 존재하는 숫자인지 확인
	let index = select_number.indexOf(i)
	if( index >= 0 ){// 선택한 수가 배열 내 존재하면
	// 배열명.indexOf( 데이터 ) : 배열내 해당데이터의 인덱스 검색
		// 해당 데이터가 존재하면 찾은 인덱스 출력 // 해당 데이터가 존재하지 않으면 -1 출력
		alert('이미 선택한 번호입니다. [취소합니다.]')
		select_numbers.splice( index, 1 )	//배열명.splice( 삭제할 인덱스, 개수 )
	}else{ // 선택한 수가 배열 내 존재하지 않으면
		   // 배열 내 개수 체크
		   if( select_numbers.length == 6 ){//만약에 배열 내 숫자가 6개이면
				alert('더 이상 선택할 수 없습니다.')
				return //함수 종료[ 아래 코드 실행X ]
		   }
		   // 선택한 번호 배열 저장
		   select_numbers.push( i ) //배열명.push( 데이터 ) : 배열에 데이터 추가
	}
	// 내가 선택한 번호를 해당 id 태그에 출력
	document.getElementById('selectbox').innerHTML = select_numbers
}

function 당첨번호(){
	let 당첨번호 = Math.floor(Math.random()*46)
			document.getElementById('당첨번호').innerHTML += 당첨번호+' ,'
}



