/*
 */
 
 //1. html 읽어온 후 이벤트 처리 함수
 document.addEventListener('DOMcontentLoaded' , () => {
	
	// 1. p.314 텍스트 조작
	
	const a = document.querySelector('#a')		//1개 요소 / 해당 아이디의 요소 가져오기
	const b = document.querySelector('#b')		//해당 id의 요소 가져오기
 
 a.textcontent = '<h1> 텍스트 그대로 넣기 </h1>'
 b.innerHTML = '<h1> html 형식으로 넣기 </h1>'
 
 // 2. p.315 속성 조작
 const rects = document.querySelectorAll('.rect')	//해당 class의 모든 요소 가져오기
	
// 3. 
for( let i = 0 ; i <rects.length ; i++ ){
	const wodth = ( i +1 ) *100
	const src = `http://placekitten.com/${width}/250`
	// const src = `../img/사진명.확장자`
	rects[i].setAttribute('src' , src )
	// rects.src = src
	//배열 내 해당 i번째 인덱스의 태그의 속성을 추가[ 이미지 경로 ]
	
	}
	
//3. P.318 스타일 조작
	const divs = document.querySelectorAll('#divbox div')
										//상위태그 > 하위태그
										//상위태그 하위태그
	divs.forEach( (div,index) => {
		///					[ 콜백함수 ]
		//배열명.forEah[ 콜백함수 ] ( 요소명 , 인덱스 , 배열명 ) => { } )
			// - 배열에 있는 요소들을 하나씩 반복변수에 저장 대입
			// - 배열에 인덱스들을 하나씩 인덱스 변수에 저장 대입
			// - 함수 내에서 사용할 배열명 대입
		//배열명.forEah ( 요소명 ) => { } )
			// - 
		//배열명.forEach( 요소명 , 인덱스 ) => { } )
		console.log( div,index )	//	인덱스*10
		const val = index *10		// 높이
		div.style.heiget = `10px`
		div.style.backgroundColor = `rgba(${val},${val},${val})`
		
	})
	
})