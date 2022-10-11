/*

	자료 : 데이터(정보/값)
	자료형 : 데이터 타입 
		1. 숫자number 2. 문자열string 3. 불boolean 
	1. 숫자 : 소수점이 있는 숫자와 없는 숫자를 모두 같은 자료형
	   숫자 연산자 : + - * /
	
	2.
	문자열 : ' ' or " " ( java는 " "만 됨 )
	문자열 연결 연산자 : +
	문자열 길이 : 문자열.length
	
	3. 
		불 : true 혹은 false만 저장
		불 연산자 : === 같다 !== 같지않다 >초과  <미만 >=이상 <=이하
		논리 연산자 : && ||
	
	자료형 검사 : tyepOf( 데이터 ) : 해당 데이터의 자료형 확인
	
	- 연산자
		1. 산술연산자 : +더하기 -빼기 /나누기 *곱하기
		2. 비교연산자 : 초과> 미만< 이상>= 이하<= === 같다 !== 같지않다
		3. 논리연산자 : && and || or | 부정?
		4. 대입연산자 : = 대입 += 더한후에 대입 -= 뺀 후 대입 *= 곱하고 대입 /=나누고 대입
		5. 증감연산자 : ++ --
	
	자료형 변환
		Number(데이터) : 숫자형 변환
		string( 데이터 ) : 문자열형 변환
		Boolean( 데이터 ) : 불형 변환
	- 입력메세지 : prompt("메세지");
	- 확인취소 메세지 : confirm("메세지");
		
 */
 
console.log("하마");					// 자바와 동일
console.log("는 입이커");
console.log("하마"+"는 입이커");		// 자바와 동일
console.log("하마는 입이커".length);	// 자바와 동일 문자열의 길이가 콘솔창에 뜬다.

console.log( 123 );
console.log( 123.456 );
 
/*
	상수 : 고정된 값 [ 항상 같은 수 ]			const
	변수 : 변하는 값 [ 변할 수 있는 수 ]		let
	undefined 값이 없거나 변수가 없거나
*/

const pi = 3.141592;
console.log(pi);

let pi2 = 3.141592;
pi2 = 4.14;
// pi = 4.14;  pi는 상수여서 변경되지 않아 오류가 발생한다
console.log(pi)
console.log(pi2)

confirm("배고프면 야옹해");

/* 문제1 : 지폐세기 
	조건 : 금액 입력받아
	출력 : console.log에 아래와 같이 출력
			십만원 3장
			만원 2장
			천원 1장
			백원 0개
*/


const 금액 = Number(prompt("금액을 입력해주세요"));
console.log("입력받은 금액 : " + 금액);

let 십만원 = parseInt(금액/100000);
console.log("십만원 : "+십만원);

금액 -= 십만원*100000;
let 만원 = parseInt(금액/10000);
console.log("만원 : "+만원);

금액 -= 만원*10000;
let 천원 = parseInt(금액/1000);
console.log("천원 : "+천원);

금액 -= 천원*1000;
let 백원 = parseInt(금액/100);
console.log("백원 : "+백원);


console.log("십만원"+(금액/100000)+"장");
console.log("만원"+금액/10000+"장");
console.log("천원"+금액/1000+"장");
console.log("백원"+금액/100+"개");





