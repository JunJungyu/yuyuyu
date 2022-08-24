/**
 * 
 */
 
 //객체명.addEventListener('이벤트명',콜백함수)
	//해당 객체의 이벤트 발생했을 때 콜백함수 실행된다!
 
 let counter = 0	//클릭 수를 저장하는 변수
 let isConnect = false	//연결 상태를 저장하는 변수
 
 //요소 객체 들
 const h1 = document.querySelector('h1')	//요소 가져오기
 const p = document.querySelector('p')	//요소 가져오기
 const connectBtn = document.querySelector('connect')	//요소 가져오기
 const disconnectBtn = document.querySelector('disconect')	//요소 가져오기
 //  출력하는 함수
 const listener = () => { h1.textContent = `클릭횟수 : ${counter++}` }
 // 1. 연결버튼을 클릭했을 때 
connectBtn.addEventListener('click' , () => {
	if( isConnect == false ){// 만약 연결이 안되어 있으면
		h1.addEventListener('click' , listener)	// h1태그에 클릭 이벤트 추가
		p.textContent = '이벤트 연결 상태 : 연결'	// p 태그에 내용넣기
		isConnect = ture	// 연겨 됐다는 의미로 연결상태 변수에 ture 로 변환
	}	
})

// 2. 연결해제 버튼을 클릭했을 때 
disconnectBtn.addEventListener('click' , () => {
	if( isConnect == ture ){	// 만약에 연결이 되어 있으면
	h1.removeEventListener('click','listener')	//h1태그에 클릭 이벤트 제거
	p.tectConnect = '이벤트 연결 상태 : 해제'
	isConnect = false
	
	}
}) 
 
 // 증가버튼 눌렀을 때
 function up(){
	counter++ // 변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`
}
 
 //감소버튼 눌렀을 때
 function down(){
	counter-- // 변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`
}
 
 
// 2. html 에서 클릭이벤트 속성 이용한다.
function 함수(){
	counter++ // 변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`
}
 
 
 
 /*
 //객체명 .addEventListener ( '이벤트명' , 콜백함수 )
 	// 해당 객체의 이벤트 발생했을때 콜백함수 실행 된다~
 	
 h1.addEventListener( 'click' , (event) => {
	counter++	//변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`	
})	//이벤트 함수 end

// 1. 

// 2. html에서 클릭이벤트 속성 이용한다.
function 함수(){
	counter++	//변수에 1증가
	h1.textContent = `클릭횟수 : ${counter}`
}

*/
































/*
// 2. 
h1.addEventListener( 'click' , 함수 )

function 함수(){
	
}
*/

