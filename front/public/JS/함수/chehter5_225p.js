


/*

	함수 : 미리 정의된 코드
			기본형태 : 매개변수 2. 정의코드 3. 반환값
		1. 함수의 사용목적
			: 1. 재활용 2. 메모리 효율성 3. 매개변수에 따른 서로 다른 리턴값
 			모양 : function 함수명( 매개변수~ ){ 정의코드 return값 }
 				매개변수(인수) : 함수 안으로 들어오는 수[데이터, 배열, 코드..] (선택사항)
 				- 변수, 상수, 배열, 함수 자료형임 자료형이면 됨?
 				
 				리턴값(반환) : 함수 밖으로 나가는 수 (선택사항)
		함수도 오브젝트에 속해있는 자료형이다!
		[ Object -> 1. array 2. function ]
				
				
 	1. 익명함수 : 이름이 없는 함수
 		function (){ }
 	2. 선언적 함수 : 일반적인 함수
 		function 함수명(){ }
    3. 나머지 매개변수 : 매개변수가 고정적이지 않는 함수 배열로 받음
    	function 함수명(...매개변수){ }
    4. 기본매개변수 : 매개변수의 defailt 초기값 설정	
 		function 함수명( 매개변수=값 ){ }
 	5. 콜백함수 :  함수도 자료형이기 때문에 매개변수로 전달이 가능하다.
 		function 함수명( 매개변수 ){
	
		 }
		 function 함수명2 ( ){ }
		 함수명( 함수명2 )
		 
		 * 미리 만들어진 콜백 사용하는 배열 내 함수들
		 	forEach() : 반복문
		 	map() : 새로운 배열 생성 [ 리턴값을 새로운 배열에 저장 ]
		 	filiter() : 새로운 배열 생성 [ 리턴된 값이 트루일 경우에만 값을 새로운 배열 저장 ]
		 	
	6. 화살표 함수 : function 생략
		( 매개변수 ) => 결과
 */
 
 
 //226p 화살표 함수

//메소드 체이닝을 사용할 때 (체인 하나하나~)
/* 
 
 let numbers = [ 0,1,2,3,4,5,6,7,8,9 ]
numbers.filter(function(value){
	return value % 2 == 0	
}) 
 
 */
 /*
 numbers.filter( (value)=> value%2 == 0 )
 	.map( (value) => value*value )
 	.forEach( (value)=>console.log(value))
 	
 numbers.filter( function(value){
	return value * value	
}) .forEach (function(value){
	console.log(value)
	})
 */
 
 //메소드 체이닝을 사용하지 않을 때
 let array1 = numbers.filter((value)=>value % 2 == 0)
 	console.log('짝수배열: '+arrary1)
 let array2 = arrau1.map( (value) => value*value)
 array2forEach( (value)=> console.log(value))
 
 /*
 화살표 함수를 사용했을 때
 메소드 체이닝(결과연결) 사용하지 않을 때 
 	배열명.메소드1().메소드2() : 메소드1 결과를 가지고 메소드2 실행
 */

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 