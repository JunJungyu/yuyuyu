/*

	객체지향 프로그래밍
	객체 [object]
	클래스 [ 객체 설계도 ]
	객체 맴버
		1. 변수(데이터 1개) , 상수(데이터 1개) , (object) = 배열[object] , 함수[function]
	예)
		자동차 = 객체				붕어빵 틀 = 설계도
			핸들 = 객체				붕어빵 = 객체
			의자 = 객체				
			엔진 - 객체

 */
 
 /* p. 291   */
 /*
 1. 객체 선언
 	//객체명 ={
	속성1 key : valye  ,
	속성2 key : valye  ,
	속성3 key : array
	메소드 : 	function(){}
	}
	
	*/
	
const object = {
	name : '혼자 공부하는 파이썬',
	price : 18000 , 
	publisher : '한빛미디어'
}

// 2. 속성 확인하는 방법 [ . 연산자 ]
	//객체명.key
	// 객체명.메소드()		: 메소드이기 때문에 매개변수(인수) () 필요
if( object.name !== undefined ){	//만약 객체 내 name 속서잉 있는지
	console.log('name 속성이 있습니다')
}else{
	console.log('name 속성이 없습니다')
}
///////////
if( object.name !== undefined ){	//만약 객체 내 name 속성이 있는지
	console.log('author 속성이 있습니다')
}else{
	console.log('author 속성이 없습니다')
}


// p.293
	// 상항 (항이 3개) 연산자
		// 조건(논리) ? 참 : 거짓

object.name = object.name == undefined ? '제목 미정' : object.name
			//1항 조건 object.name !== undefined			//name 속성이 없으면
			//[참] '제목미정'
			//[거짓] object.name // 기존 그대로  //위에는 삼항연산자 아래는 if
/*

	if(object.name === undefined){
	   object.name = '제목미정'	
	}else{
		object.name = object.name
	}

*/


object.author = object.author !== undefined ? object.author : '저자 미정'

//객체 출력
console.log( object )

// p.294

/*
let array = [ 1 , 2 , 3 ]	// 배열의 원형 

let [ a , b ] = [ 1 , 2 ]	// 배열의 다중 할당 
	
		a = 1
		b = 2
	

	
console.log ( a )
console.log ( b )
//
[a , b] = [b , a]

*/


let arrayA = [1, 2, 3, 4, 5]
const [a, b, c] = arrayA
console.log (a,b,c)

// p.295
const {name,price} = object
	//object 객체 내 속성 꺼내기 -> 변수에 저장
console.log( name )
console.log( price )

const {n = name, p = price} = object	//요고ㅜㅡ   랑
console.log( name )
console.log( price )

//	
let n2 = object.name					//요고랑 같음















