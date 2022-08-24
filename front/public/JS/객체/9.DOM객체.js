/*
 */
 
 // p.320
 // 1. JS <h1> 태그 생성 -> 객체 대입
 const header = document.createElement('h1')
 
 // 2. 텍스트 조작
 header.textContent = 'js에서 만든 태그'
 header.style.color = 'white'
 header.style.backgroundColor = 'black'
 
 // 3. 해당 태그에 하위태그로 객체를 추가
 document.body.appendChild(header)
 
 
 // p.321
const dlvA = document.querySelector('#first')
const dlvB = document.querySelector('#second')
const h1 = document.createElement('h1')	//2. 태그(요소) 만들기
h1.textContent = '이동하는 h1 태그'	//3. js 만든 태그(요소)에 텍스트 넣기

const tofirst = () => {
	divA.appendChild(h1)	// 4. 첫번쩨 div에 js 만든 태그 추가
	setTimeout( toSecond , 2000 )	//5. 1초 뒤에 다른 함수 [toscend] 실행
}

const toSecond = () => {
	divA.appendChild(h1)	// 4. 첫번쩨 div에 js 만든 태그 추가
	setTimeout( tofirst , 2000 )	//5. 1초 뒤에 다른 함수 [toscend] 실행
}

/*
// 1. 기본 함수 / 원형	/ 123다 같은 함수
function 함수 (){
	divB.appendChild(divA)
}


// 2. 익명 함수 / 혼자 쓰이는게 아니라 변수에 넣거나 해서 사용
const 익명함수 = () => {
	divB.appendChild(divA)
}

// 3. 화살표 함수
const 화살표함수 = ( ) => { divB.appendChild(divA) }

// 4. 콜백함수	/	함수안에 함수가 들어감
//함수명 ( 함수명 )

// 3. 타이머함수( 콜백 함수() , 밀리초(1000/1초) )
 setTimeout( tosecond , 3000 )
 
 */
 
 // p.322 객체 제거
 
 const h2 = document.querySelector('h1'){
	
	 // 1. 타이머함수 : setTimeout( 함수 , 밀리초 )
	 // 2. 문서객체.removeChild( 자식 객체 )
	 // 3. 부모객체 찾기 : 문서객체.perentNodo( 부모 객체 )
}
 
// 2. 
const 익명함수 = () => {  h2.perentNode.removeChiled(h2) }
setTimeout( 익명함수 , 3000 )
 
 function 함수 () {
	 h2.perentNode.removeChiled(h2)
}
setTimeout( 익명함수 , 3000 )
 

 
 setTimeout( () => {} , 3000 )	// 3초 후 실행되는 코드
 h2.perentNode.removeChiled(h2)
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 