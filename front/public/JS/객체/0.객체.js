

/*
	번수/상수 : 데이터(메모리) 한개
	배열 : 변수 여러개 저장하는 객체
	함수 : 미리 정의된 코드
	객체 [object] : 실제로 존재하는 사물?
	인스턴스 [instens] : ?
	객체 지향 [OOt] : 왜?
 	산업혁명 : 사람 일X -> 컴퓨터O []
 
 객체 : 메모리(변수,배열 등)와 함수들의 모임
 */
 
 //p. 246
 //1. 객체 생성
 //const/let 객체명 = { 키 : 값 , }
 const product = {// , 쉼표로 구분
	제품명 = '7D 건조 망고',
	유형 = '당절임', 
	성분 = '망고 , 설탕 , 메타중아황산나트륨 , 치자황색소',
	원산지 = '필리핀'		//마지막엔 점 안찍음
 }
 
 // 2. 객체확인
 	//1. [객체호출] : 객체명
 	//2. [객체 내 값 호출] : 객체명[키]
 console.log( ' 객체호출 : ' + product )
 console.log('객체 내 속성 호출 : ' + product['제품명'])
 console.log('객체 내 속성 호출 : ' + product['유형'])		//[]로 불러도 됨
 console.log('객체 내 속성 호출 : ' + product.제품명)		//괄호 안치고 점 찍어도 됨

 
 // p.248
 //객체 생성
 const object = {		//따로 따로 들고 다니기 어려우니까 한 가방에 드는 방법?
	number : 273 , 
	string : '구름' , 
	boolean : ture , 
	array : [52,273,102,52],
	method : function(){console.log('함수실행') }
	
}

// 2. 객체 내 속성과 메소드=함수 호출
console.log ('객체 내 메소드 호출' + object.method())




