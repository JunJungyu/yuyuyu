/*
 */
 
 /*
 function 함수(){
	document.getElement('h1')
}
*/
 
 
						 //함수( 이벤트 , 콜백함수 (인수)=>{ 를 여기에 넣어서 결과를 낸다. }	 )
						 //DOMContentLoaded 이벤트 : 문서를 모두 실행 후에 이벤트
 document.addEventListener('DOMContentLoaded' , ()=>{
	
		//	변수(객체) = h1 태그 이름으로 요소(태그) 선택 [ 태그를 js 객체로 가져오기 ]
		const header = document.querySelector('h1')
 		//querySelector : 요소 1개 가져오기
 		//querySelectorAll : 요소 여러개 가져오기
 		
 		console.log ( header )
 		console.log (typeof( header ))
 		
 		
 		//	typeof( ) : 자료형 [스트링 블룸 넘버 오브젝트(배열, 함수 , 돔 등)] 확인
 		
 		// 텍스트 외 스타일 변경
 		header.textContent = '안녕~~'
 		header.style.color = 'white' // css 조작 [ DOM 객체명 . style . 속성명 = 값 ]
 		header.style.backgroundColor = 'black'	//css 조작
		header.style.padding = '10px'	//css 조작
 })		//addEventListener end
 					
 		
 document.addEventListener('DOMcontentLoaded' , ()=>{
	const headers = document.querySelectorAll('h1')
	console.log(headers)
	console.log(typeof(headers))
	//배열 내 데이터를 하나씩 꺼내는 방법
	// 1.
	for(let i=0; i<headers.length; i++){
		headers[i].textContent = '안녕'+i
	}
})
 	// 2. 인덱스를 하나씩 넣어줌
 	for( let object in ){		//0부터 마지막 인덱스까지 하나씩 대입반복
		headers[i].textContent = '안녕'+index
	}
	// 3. 
	for( let object of headers ){		//배열에서 0번째 인덱스의 요소를 대입하는..하나씩 대입반복 / 0번째 인덱스의 데이터를 마지막 인덱스의 데이터를 하나씩 대입반복
		headers[i].textContent = '안녕'
	} 		
 	// 4. 
 	headers.forEach( (object) => { object.textContent='안녕~~' } )	
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		
 		