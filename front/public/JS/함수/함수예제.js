/**
 * 
 */
 
 	/*
 		함수 : 미리 정의하는 코드의 집합 / 미리 정의하는 이유는 급할 때 빨리 쓰려고
 		alert(), prompt() -> js 내장함수
 	
 	 function 함수명 ( 매개변수1, 매개변수2 ~~ )
 	 
 	 function 함수명 ( 매개변수1, 매개변수2 ~~ {
	실행코드
	return 리턴값
	}

	함수 호출
		js : 함수명 (매개변수1, 매개변수2 ~~)
		html : 이벤트속성 ->
		
		onclick: 클릭했을 때
		onclick = "함수명 (매개변수1 매개변수2)"

*/
//1. 매개변수x 리턴값x 함수정의
function 함수1() alert*('함수1실행'){	// f s
	alert(함수1실행)
}	// f e
//. 2. 매개변수o 리턴값x 함수 정의
function 함수2( value){	// f s
	alert('함수2실행 매개변수:'+value)
}	// f e
//매개변수o리턴값o 함수정의
function 함수3 (value1 , value2){		//f  s
	return value1 , value2
	alert('함수2실행 매개변수:'+value1+value12)
}	//f  e

//4. 매개변수x 리턴값o 함수정의
function 함수4(){		//f s
	return 10
}	//f e


//호출
함수1()	//js에서 정의된 함수 호츨
함수2( 50 )		함수 호출 시 매개변수 전달
let result = 함수3( 3 , 5 )	//2개의 매개변수 전달
let result2 = 함수4()

// p.

function min ( array ){
	let output = array[0]	//array에서 0번 인덱스 호출해서 output 대입
	for(const item of array){
		//배열에 요소를 하나씩 item에 대입 반복
			//for(변수 in 배열) : 배열 내 인덱스를 하나씩 대입반복
			//for(변수 of 배열) : 배열 내 요소의 값을 하나씩 대입반복
		if(output > array){	//해당 값이 output보다 작으면
		(output = item)	//output 해당 값으로 보냄?
				
			
		}	//
	}
	return output	//함수가 종료되면서 함수호출했던 곳으로ㅓ 반환[리턴]
}

const testArray = [52,273,32,103,275,24,57]
console.log(`${testArray}중에서`)		//배열 출력
console.log(`최솟값 = ${min(testArray)}`)		// 함수 결과를 출력
	//console.log( ) : js 내장 함수 [콘솔에 메시지를 출력하는 함수]










































