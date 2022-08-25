/*
	[호출]
	객체명.textContent
	객체명.innerHTML
	객체명.value	[input , option 입력상자 등 /div span p X]
 
 	[저장 = 대입]
	객체명.textContent = 값
	객체명.innerHTML = 값
	객체명.value = 값 
	
 */
 

 
 
 
 
 
 // 1. HTML 요소 가져오기
const  input = document.querySelector('#inchbox')
const  button = document.querySelector('#inchbtn')
const  p = document.querySelector('#inchp')

/*
const  p = document.querySelector('#inchp') 도 가능하고
const  p = document.querySelector('p') 도 가능
   
아이디로 가져와도 되고 그냥 가져와도 된다고
*/

   
  // 2. 버튼을 눌렀을때 
 button.addEventListener( 'click' , () => {
	
		const inch = Number( input.value )	//Number(문자) : 문자열을 숫자로 바꿔줌
		
		//isNaN(데이터) : 숫자가 아니면 ture / 숫자이면 false
		if( isNaN( inch ) ){		//입력값이 숫자가 아니면
			p.textContent = '숫자를 입력해주세요'
			return
		}
		//입력값이 숫자이면
		const cm = inch * 2.54
		p.textContent = `${cm} cm`
} )


// p. 341
// 1. HTML 요소 가져오기
const email_box = document.querySelector('#email_box')
const email_p = document.querySelector('#email_p')		//지역변수는 밖으로 못나감

//이메일 검증 확인 함수	[ 익명함수 ]
const ismail = ( value ) => {							//뒷부분
	return ( value.indexOf('@') > 1 ) && (value.split('@')[1].indexOf(".") > 1 )
			//입력데이터에 @가 있는지     이면서    입력데이터의 @ 뒤문자
}			//									qweqwe@naver.com
			//										   naver.com -> . 이 있는지
			//	그니깐 골뱅이가 있고 && 점이 있는~


// 다른 방법 [ 기본함수 ]
/*
function 함수(){
	return ( value.indexOf('@') > 1 ) && (value.split('@')[1].indexOf(".") > 1 )
}			
*/

//이메일 입력상자에서 키보드를 입력할때마다 이벤트 발생
email_box.addEventListener('keyup' , (event) => {
	const value = event.currentTarget.value		//★event.currentTarget : 현재 이벤트중인 객체를 불러내는 방법★뭐가 틀렸을까★
	if(ismail(value)){
		p.style.color = 'green'
		p.textContent = `이메일 형식입니다 : ${value}`		//백틱을 안쓰고 따옴표를 썻기 때문이였다.. 달러 들어가면 무조건 백틱
	}else{
		p.style.color = 'red'
		p.textContent = `이메일 형식이 아닙니다 : ${value}`	//★★왜 값이 아니라 문자 그대로 나오지? 오타가 있나★★
	}
})


/*
	배열명.indexOf('검색데이터') : 배열 내 해당 데이터의 인덱스 번호 찾기
	문자열.indexOf('@') : 문자열내 @ 의 인덱스 번호 찾기
		만약에 0보다 작으면 못찾았다~ [ 인덱스란 : 저장 순서 번호 = 0번 시작 ]
	문자열.split('기준문자') : 문자열내 기준문자 기준으로 분리[자르기]
					
					[  0     1      2     3]
		예시) 문자열 = 유재석/강호동/신동엽/하하
		문자열.split("/") 쉼표 기준으로 잘라서 인덱스..
		문자열.split("/")[0] : 유재석	/0번째 인덱스니까
		문자열.split("/")[3] : 하하	/3번째 인덱스니까
*/

// p. 343
// html 요소 가져오기
const selectbox = document.querySelector('#selectbox')
const selectp = document.querySelector('#selectp')

// 2. Contentbox 의 데이터가 변경될때마다 실행되는 이벤트 [ change ]
selectbox.addEventListener('change' , (event) => {
	
	// selectbox의 모든 opttion호출 [ select객체.opttions ] = 배열
	const opttion = event.currentTarget.options
	//옵션 중에서 [사용자]선택된 번호 호출
	const index = event.currentTarget.SelectedIndex
	//
	selectp.textContent = `선택 : ${opttion[index].textContent}`
})								//옵션목록[ 선택한 목록 번호 ].내용물 텍스트 호출


//p. 344
let 현재값			/* input 입력된 데이터를 저장하는 변수 */
let 변환상수 = 10		/* select에서 선택된 단위별 값 저장하는 변수 */

// 0. HTML 요소 가져오기
const selectbox2 = document.querySelector('#selectbox2')
const selectp2 = document.querySelector('#selectp2')

// 옵션목록 = selectbox2 모든 옵션 호출
selectbox2.addEventListener( 'change' , (event) => {
	//선택된 옵션들의 저장하는 배열 선언
	const options = event.currentTarget.options
	//
	const list = [ ]
	
	for( const option of options ){
		//배열 [옵션목록]중 하나씩 option 대입 반복
		if( option.selected){	//만약에 해당 옵션에 selected[선택된 상자]옵션이 있으면
			list.push( option.textContent )
		//만약에 선택이 되어 있으면 배열에 선택된 옵션의 텍스트를 추가
		}
	}
	
	selectp2.textContent = `선택 : ${list.join(',')}`
	//배열명.join('연결문자')	: 배열 내 모든 요소들을 연결문자 기준으로 하나의 문자열로 변환
		//배열명 = [ '유재석' , '강호동' , '신동엽' ]
} )		//배열명.join('<->')
		//유재석<->강호동<->신동엽

// p.345~346


const cminout = document.querySelector('#cminout');
const cmspan = document.querySelector('#cmspan');
const cmselect = document.querySelector('#cmselect');

//3.
cmselect.addEventListener('change' , (event) => {
	// 1. 목록상자[currentTarget]에서 모든 option 호출
	const options = event.currentTarget.option
	// 2. 목록상자 [currentTarget]에서 선택된 인덱스 번호 호출
	const index = event.currentTarget.option.selectedIndex
	// 3. 목록상자에서 선택된 인덱스 번호의 value호출해서 변환상수에 대입
	변환상수 = Number(option[index].value)
	calculate()	//함수실행
})


//2. 
const calculate = () => {
	cmspan.textContent = (현재값*변환상수).toFixed(2)
}



// 1.input 입력할때마다 현재값 변수를 값으로 변환해주는 이벤트
cminout.addEventListener('keyup' , (event) => {
	현재값 = Number( event.currentTarget.value )
	calculate()
})




// p. 347

let timer = 0	// 타이머 시간(초)를 저장하는 변수
let timerId = 0	// 타이머함수 [setInterval] 함수 저장하는 익명함수

const timerinput = document.querySelector('#timerinput')	//아이디니까 # 잊지말고 쓰기~
const timerh1 = document.querySelector('#timerh1')
// 1. 만약에 체크박스 상태가 변경되었을때
timerinput.addEventListener( 'change' , (event) => {
	// 1. 체크박스의 checked 이지 확인
	if( event.currentTarget.checked ){	//체크가 되어 있는 상태
	    //setInterval( 함수명 , 초[밀리초=1000/1초])
	    //timerId=setInterval(()=>{} . 1000)
		timerId = setInterval(()=>{
			timer += 1		//타이머 시간 변수 1씩 증가
			timerh1.textContent = `${timer}초`	//span 태그에 변수 출력
		} , 1000 )
	}else{	//체크가 안되어 있는 상태
		clearInterval( timerId )
	}
})


// p.349
/*
	tag  => 'tag'				[복수]	querySelector('h1')
	clss => '.class명'			[복수]	querySelector('.클래스명')
	id   => '#id명'				[단일]	querySelector('#아이디명')
	name => '[name=name명]'		[복수]	querySelector('[name=네임명]')

	*식별자
		<h1 id="" class="" name=""></h1>	도 가능
	*js
	
*/
//const 뒤에 오는 것에 따라 문자열 숫자열 블룸 나뉨.. 

//1. HTML 요소
const radios = document.querySelectorAll('[name=pet]')	//여러갠데 자동으로 배열로 인식됨
const output = document.querySelector('output')		//자동으로.. 인식되나봄...

// 2. radios [배열] 반복문
	// 배열명 forEach( ( 반복변수 ) => { } )
		/*
		 배열명, 동물목록 = [ 강아지 . 고양이 , 햄스터 , 기타 ]
		
		1. for( let i in 동물목록 ){
			i = 0 i = 1 i = 2 i = 3
			
		2. foe( let i of 배열명, 동물목록 ){}
			i = 강아지 ~~
			
		3. 배열명.forEach( ( i ,j ) => {alert( i , j ) })
			i = 강아지	등등등
			j = 0		123
		
		*/
		
		
radios.forEach( ( i )=>{
	//어디에 저장할지↑ 아무거나 써도 됨
	radios.addEventListener('chage' , (event) => {
		const current = event.currentTarget
		if( current.checked ){
			output.textContent = `좋아하는 애완동물은 ${current.value}이시군요!`
		}	//if end
	})	//event end
})	//forEach end




















































