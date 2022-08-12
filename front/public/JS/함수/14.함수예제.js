// p .203 윤년인지 확인하는 함수
function isleepYear ( year ){
	// isleepYear 이라는 함수명으로 year 매개변수로 받는다.
		// 매개변수는 함수 호출 시 외부에서 들어오는 값[데이터]
	return (year%4==0) && (year%100 != 0 )	\\ (year % 400 == 0)
			//4의 배수 $$ 이면서 100배수가 아닌
			
}	// f end
				// ' : 문자열 ` : 
				
				//변수와 문자열 같이 출력하는 방법
				//1. '문자열' + 변수명
				//2. ` 문자열 ${변수명/함수()} `
				
console.log (`2020년은 윤년일끼? === ${isleepYear(2020)}`)
console.log (`2020년은 윤년일끼? === ${isleepYear(2010)}`)
console.log (`2020년은 윤년일끼? === ${isleepYear(2000)}`)
console.log (`2020년은 윤년일끼? === ${isleepYear(1900)}`)

function 윤년_버튼_함수 ( 매개변수 ){
	// 윤년_버튼_함수 라는 변수명으로 매개변수가 없는 함수
	alert('버튼이 눌렸다.')
	}
	
	let 연도 = Number( prompt ('연도를 입력: '))
	
	let 결과 = isleepYear( 연도 )	// 함수 호출 : 함수명(매개변수)

	document.getElementById('resultbox').innerHTML = '결과:'+결과
		//document : 문서(html)
			//get: 가져오기	
			 //Element : 요소 ( 태그 )
			// Id : 식별자 이름	
			//innerHTM : html 작성
	}