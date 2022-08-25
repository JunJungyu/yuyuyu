/*

	1. DOM : 문서 객체 모델 [ js에 원래 있던 미리 만들어진 객체/메소드 ]
		
		*식별자[ js , css 동일 ]
			teg , class [ . ] , id[ # ]
		
		1. HTML에 요소를 객체로 호출
			1.querySelector('식별자명')		/하나
			2.querySelectorAll('식별자명')	/여러개
		
		1. 문서객체.addEventListener	( '이벤트명', ( ) => { } )		//화살표함수말고 그냥 일반함수해도 되고 함수 호출해도 됨
			1. 이벤트 종류
				1. 'click' : 해당 객체를 클릭했을 때 함수가 실행됨
				2. 'keyup' : 해당 객체에서 키[키보드]에서 손이 올라올때 함수가 실행됨
 */
 	// p.331
 		// 1. HTML태그를 문서객체화

 	const 긴글상자 = document.querySelector('textarea')
 	const 헤더텍스트 = document.querySelector('h1')


// 이 방법은 호출할 수 없음 	화살표함수 = 람다 = 1회용
 	//긴글상자를	꾸며줄건데		키업하면    인수		결과?
 	긴글상자.addEventListener( 'keyup' , () => {		//괄호 미리 잘 닫아두기
	//길이를 구할거니까 긴글상자 값 길이
	const 길이 = 긴글상자.value.length
	//
	헤더텍스트.textContent = `글자수 : ${길이}`
})

// 이 방법은 호출할 수 있음
function 글자수(){
	const 길이 = 긴글상자.value.length
	헤더텍스트.textContent = '글자수 : ${길이}'
}


//긴글상자.onkeyup =  ( ) => { }			/이런 방법도 있다고 쓴듯?

// p.333
	//HTML 이벤트 속성 [ event ]
	//keyup 이벤트 -> 속성 인수 전달 [ 알트키, 컨트롤키, 시프트키 등등 ]
const h2 = document.querySelector('h2')
const print = ( event ) => {		//event말고 아무말이나 써도 됨
	
	let output = ''					//output말고 아무말이나 써도 됨
	output += `alt : ${ event.altKey }<br>`		//단어 뒤에 또 단어가 올 땐 첫글자 대문자로 써야됨
	output += `ctrl : ${ event.ctrlKey }<br>`
	output += `shift : ${ event.shiftKey }<br>`
	output += `code : ${typeof(event.code) != 'undefined' ?
		event.code : event.keyCode}<br>`
		
		h2.innerHTML = output
		
	}
	
document.addEventListener( 'keyup' , print )





























