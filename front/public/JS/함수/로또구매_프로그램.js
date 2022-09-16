/*

	로또 구매
		1. 여섯개의 버튼을 선택한다.
			조건 : 한번 클릭(선택)
				  한번더 클릭(배제)
			
			중복 배제
			최대 여섯개
		2. 컴퓨터 추첨번호[1~45난수] 생성
		3. 사용자 추첨번호 비교 결과
		
 변수는 지역변수라는 특징을 가지고 있음
 중괄호 안으로는 들어가는데 밖으로는 못감
 
 */
 
 let select_numbers = []	//여러함수에서 사용될 예정 / 내가 선택한 번호 리스트
 let lotto_numbers = []	//컴퓨터 난수 번호 저장
 
 //1. 버튼 만들기함수
function btn_print(){
	let btnlist=''	//45개의 버튼을 저장하는 변수
	for( let i = 1 ; i <= 45 ; i++){	//for s
		//i가 5배수이면 줄바꿈
		btnlist += `<button id=${i} onclick=btn_click(${i})>${i}</button>`
		//변수 i가 5의 배수이면 줄바꿈 처리
		if( i % 5 == 0 ){ btnlist += '<br>'}
	}	//for e
	//현재 문서의 btnbox라는 id값을 갖는 함수를 호출해서 html에 변수 대입
	document.getElementById('btnbox').innerHTML = btnlist;
}
	//2. 버튼 눌렀을때 함수 [ 매개변수 : i -> 내가 클릭한 버튼의 순서 ]
	function btn_click( i ){
	//현재 배열 내 존재하나 숫자인지 숫자 확인
	let index = select_numbers.indexOf( i )
	if ( index >= 0){
	//배열명..indexOf(데이터) : 배열내 데이터의 인덱스 겁색
	//해당 데이터를 찾았으면 찾은 인덱스 출력 0 
	//해당 데이터를 못찾았으면 / 존재하면 찾은 인덱스 출력 /-1 일반적으로 -1을 fulse로 취급함
		alert ('이미 선택한 수입니다.[취소합니다]')
		select_numbers.splice( index,1 )
	} else {
			//배열내 개수 체크
		if (select_numbers.length == 6){
			alert ('더이상 선택할 수 없습니다.')
			return	//함수 종료[]
	}
	select_numbers.push( i )	//배열명.push (데이터) : 배열에 데이터 추가
	//선택한 번호 배열 저장	
	document.getElementById('selectbox').innerHTML + select_numbers	
}
	alert(select_numbers)
}

//3. 추첨번호 생성 함수 - 결과
function lotto_number(){
	if(select_numbers.length != 6){
		alert('6개 수를 모두 입력 후 추첨 해주세요')
		return
	}
	//난수 생성 (1~45)
	while(ture){
		let land = Math.floor( (Math.random()*45)+1)	//0부터 1사이의 실수 생성
		let index = lotto_numbers.indexOf (rand)
		if(index >= 0){
				break	//가장 가까운 반복문 탈출
			}else{
				lotto_numbers.push(rand)
			}
		}
		//html 태그에 배열 출력
		document.getElementById.innerHTML = lotto_numbers
		lotto_result()
			
		}




//4. 추첨번호 비교 결과 함수
function lotto_result(){
	let ciunt = 0;
	let result_numbers = select_numbers.filter
}

