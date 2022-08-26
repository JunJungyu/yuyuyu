

let 상태 = false	/* 체크박스 체크 여부 저장 변수 */

const 체크박스 = document.querySelector('input')

// 체크박스에서 체크가 변경이 있을 때 이벤트 실행
체크박스.addEventListener( 'change' , (아무거나됨) => {
	상태 = 아무거나됨.currentTarget.checked
})

const 링크 = document.querySelector('a')		//<a>이거 불러온단 소리

링크.addEventListener( 'click' , (아무거나됨) => {
	if( !상태 ){		//느낌표가 뭐냐면.. ! 논리반대 : true -> false	//	false -> true
	
		아무거나됨.preventDefault()
	}
})

/*
if( !상태 )	이거랑
if( 상태 != true )		이거랑
if( 상태 == false )		이거랑 다 같음

다 이 소리
	만약애 상태가 false이면 [ 체크가 안되어 있으면 ]
*/





 
 //1. 모든 사진들의 요소 호출
 const imgs = document.querySelectorAll('img')
 //사진 하나니까 All써도 됨 / All 여러개니까 배열, 그냥 셀렉트로 하나면 객체 하지만 배열도 결국 객체
 
 
 //2. 첫번째 방법 이게 모든 언어의 기본.. 모양이여서 이건 꼭 알고 있기
for( let i = 0 ; i <imgs.lenght; i++){
		imgs[i].addEventListener( 'contextmenu' , (event) => {			//contextmenu -> 오른쪽 클릭했을 때.. 라는 뜻
			event.preventDefault()
		} )
	}
	
	
// 3. 
for( let i in imgs){		//마지막 인덱스는 제외시켜줘야 오류 안남
	if (imgs.length-1 == i){break}
	imgs[i].addEventListener('contextmenu' , (event) =>{
		event.preventDefault									//★★★★수정하기★★★★★
	})
	})
}


// 4.
for( let i of imgs){
	i.addEventListener( 'contextmenu' , (event) => {	
			event.preventDefault()
	})
}


// 5. 
imgs.forEach( (img) => {
	img.addEventListener( 'contextmenu' , (event) => {
		event.preventDefault()
	})
}































 