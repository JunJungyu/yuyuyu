/* chatlist.js 이용한 차트 구현 
	
	변수 = 값
	배열 = [ 값1, 값2 ]
	객체 = { 키1값, 키2값2 }



*/

let 지원자리스트 = [ ]		/* 지원자 객체물을 담을 배열 선언 */

/* 파이차트[원형자료 = 백분율] 데이터 객체 선언 */
let pieData = {
	/* 항목의 이름 */
	labels : ['웹디자이너','웹개발자','서버 엔지니어','영업직'],
	/* 항목의 값 */
	series : [ 14, 9, 8, 6 ]
}

let pieOptions = {
	width : '100%',		/* 쉼표쓰기.. */
	height: '440px'
}

/* list가 아니라 ist... */
/* 차트 적용하기 new Chartist.Pie('표시할 식별자' , 데이터객체 , 옵션객체 */
/* Chartist.Pie 클래스 [ 미리 만들어진 클래스 ] */
new Chartist.Pie ('.pie_chart', pieData , pieOptions)

/* 막대차트 구현 */
let barData = {		
	labels : ['2018년', '2019년', '2020년'] ,
	series : [ [10,16,29] ]
}

let barOptions = {
	//y 축
	axisY : {									//	* let 객체명 = { 키 : { } }
		offset : 60,							 // 1. 
		scaleMinSpace : 50,						 // 2. 선 간격 [px]
		labelInterpolationFnc : function(value) {// 3. Y축 눈금 표시
			return value + '명'
		}	
	} ,
	width : '100%' ,
	height : '400px;'
}
//
new Chartist.Bar('.bar_chart' , barData , barOptions)



//순서도
/*
1. 등록버튼 클릭
2. 클릭 이벤트 발생	[onclick]
3. 사건 반복 여부 / 반복적이면 함수 만들기
	*함수호출 : 함수명(){ }		/문법이니까 외우세요
	--------------테스트--------------
4. 차트 그리기[앞전 코드 복사 = 식별자만 변경]
5. html 입력된 데이터 -> js 이동
document.getElementById('아이디이름').value;
6. 객체 내 속성에 데이터 추가하기
	1. [객체 속성 호출]
	2. [배열에 데이터 추가] 배열명.push
	
	뭔지 몰라도 그냥 그대로 복붙하고 검색해서 써먹으면 됨~ 코드 외울 생각하지말고 검색하는 법 익히기 처음보는 코드도 쓸 수 있게
	
*/


	let barData2 = {		//객체 선언	[ 매번 선언 시 초기화 ]
	/* 항목 */
	labels : [ ] ,
	/* 값 */
	series : [ [ ] ]	// 배열 = [ ]		//배열 [ [ ], [ ], [ ] ]	이것도 인덱스 순서대로 계열수대로 대괄호가 있음 여기선 급여만 했으니까 안에 하나만
	//
}

function 차트그리기(){

let barOptions2 = {
	//y 축
	axisY : {									//	* let 객체명 = { 키 : { } }
		offset : 60,							 // 1. 
		scaleMinSpace : 50,						 // 2. 선 간격 [px]
		labelInterpolationFnc : function(value) {// 3. Y축 눈금 표시
			return value + '원'
		}	
	} ,
	width : '100%' ,
	height : '400px;'
	
}

const name = document.getElementById('name').value;
const money = document.getElementById('money').value;

barData2.labels.push(name)
barData2.series[0].push(money)
//
new Chartist.Bar('.bar_chart2' , barData2 , barOptions2)

}

/*
1. 전송버튼을 눌렀을때(클릭) 이벤트함수[정의] 실행

2. HTML에서 입력도니 데이터 JS가져와서 변수/객체 저장 -> 확인
   documaent.querySelector( ) : 1개 요소 호출
   documaent.querySelectorAll( ) : 여러개 요소 호출
   documaent.getElementById( ) : 1개 요소
   2-2 : 문서객체내 내용물 호출 [ value 속성 ]
   		*체크박스 여부 확인
   2-3 : 모든 내용물 객체에 저장
   2-4 : 생성된 객채를 배열에 저장
 3. 배열 내 존재하는 모든 객체들을 출력
*/


//1.
function 지원자등록(){
	//1번 테스트
	console.log('지원자 함수 실행')		
	let 입력리스트 = document.querySelectorAll('input')		/*인풋은 여러개니까 all 8개*/
	let 목록상자 = document.querySelectorAll('select')
	let 긴글상자 = document.querySelectorAll('textarea')
	
	//2-1번 테스트
	console.log(입력리스트)
	console.log(목록상자)
	console.log(긴글상자)
	
	//2-3 : 모든 내용물 객체에 저장
	let 지원자 = {
		성명 : 입력리스트[0].value, 
		영문명 : 입력리스트[1].value ,
		메일주소 : 입력리스트[2].value ,
		포트폴리오 : 입력리스트[3].value ,
		희망근무지 : 입력리스트[4].value ,			/* 4~6 체크박스 */
		현재상태 : 목록상자[0].value ,
		자기소개 : 긴글상자[0].value
	}
		//2-3 : 테스트
		console.log( 지원자 )
		//2-4 : 생성된 객체를 배열에 저장
		지원자리스트.push( 지원자 )
		console.log( 지원리스트 )
}













