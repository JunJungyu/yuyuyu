/*
	* 함수 : 1.정의[만들기] 2.호출[ 불러내기 ]
		-특징
			1. 함수 안에서 할당된 메모리는 함수 종료시 초기화[사라짐]
			
	* 학생 점수 프로그램
		1. 학생 객체 설계
		2. 점수 등록 버튼을 눌렀을때
			1. 해당 js 함수 호출하기 
			<button onclick="함수명() ">
			
			2. HTML에서 입력받은 데이터를 js객체에 저장 
			* 학생 이름 중복체크 함수
				-
			- 함수 등록 함수 사용 
			- document.getElementById('id명').value;
			
			3. 여러개의 객체를 저장 ----> 배열 
				- 배열은 다른 함수에서도 사용할 예정 [ 함수 밖에서 선언 ]
			
			4. HTML 초기화
		3. 학생 점수출력
			1. js 처음 열렸을때 1번		/2. 학생등록 할때마다
				
*/
// 

let studentlist = [ ]	// *여러개 학생 객체를 저장하는 배열 [ 함수 밖에 선언한 이유 : 여러 함수들에서 사용하기 위해서]
학생출력()


function 점수등록(){ // 2. 점수 등록 버튼을 눌렀을때
	// 1. 학생 객체 : HTML 입력받은 데이터로 선언
		//document.getElementById('kor').value : input에 입력된 무조건 (문자열) 가져오기
		//Number(document.getElementById('kor').value) : input에 입력된 문자열을 숫자열 변환해서 가져오기
	const student = {
		name : (document.getElementById('name').value) ,		/* 이름 속성[키:값] 얘는 숫자 아니니까 넘버 안써줘도 됨*/
		kor : Number(document.getElementById('kor').value) ,		/* 국어 속성 */
		eng : Number(document.getElementById('eng').value) ,		/* 영어 속성 */
		mat : Number(document.getElementById('mat').value)		/* 수학 속성 */
	}
	
	//똑같은 + 여도 문자랑 있을땐 연결	 /  숫자랑 있을땐 계산
	
	//* 배열에 저장하기 전 [ 학생 등록 전 ] 중복체크!
	if(이름중복체크( student.name )) {	//이름중복체크// 이름중복체크 함수에서 결과[return]가 true 이면
		return // return 함수 종료하는 의미로 리턴될 경우에는 아래코드는 실행되지 않는다.
	}
	
	// 2. 객체를 배열에 담기 
	studentlist.push( student ) // 배열명.push( 데이터 ) : 배열에 데이터 추가 
	// 3. 알림/확인 
	alert('학생 점수 등록이 되었습니다.')
	console.log( studentlist )
	// 4. HTML에 입력된 내용 지우기
	document.getElementById('name').value = ''
	document.getElementById('kor').value = ''
	document.getElementById('eng').value = ''
	document.getElementById('mat').value = ''
	//5.
	학생출력()
}

function 이름중복체크( name ) {	//f s	/	학생 이름 중복채크 함수
	for( let i = 0 ; i<studentlist.length ; i++ ){
		
		// 만약에 객체가 3개 있을 경우 길이 : 1~3	인덱스: 0~2 이하(<=)로 하지 말고 미만(<)으로 해야됨 아님 이하로 하고 -1하거나
		//i는 0부터 i는 배열의 길이 (요소의 갯수, 객체 수) 미만까지 1씩 증가반복
		if(studentlist[i].name === name){
			//배열 내 i번째 인덱스의 객체 내 이름이 새로 입력받은 이름과 같으면
			alert('이미 존재하는 학생명입니다.')
			return ture
		}	//	if e
	}	//	for end
	return false // 배열 내 name과 동일한 이름이 없다
}	//f e

function 학생출력(){	//f s
	//1. 변수에 html 태그[문자열]을 저장하기	/	★여기는 선언이니까 = 이거고
	let html = '<tr><th>등수</th><th>학생명</th><th>국어</th><th>영어</th><th>수학</th><th>총점</th><th>평균</th><th>비고</th><tr>'
			   
	//*** 배열 내 데이터를 하나씩 꺼내기 -> 객체 정보를 html 화 시켜야됨
	for(let i = 0; i<studentlist.length; i++){
		//i는 0부터 배열 내 마지막 인덱스까지 [배열의 길이-1] 1씩 증가반복
		//객체에 들어있는 데이터를 html로 출력	/	★여기는 누적더하기니까 += 이거고
		let sum = studentlist[i].kor + studentlist[i].eng +studentlist[i].mat	//합계
		let avg = sum / 3	//평균
		html += '<tr>'+
						'<th>등수</th>'+
						'<th>'+studentlist[i].name+'</th>'+
						'<th>'+studentlist[i].kor+'</th>'+
						'<th>'+studentlist[i].eng+'</th>'+
						'<th>'+studentlist[i].mat+'</th>'+
						'<th>'+sum+'</th>'+
						'<th>'+avg+'</th>'+
						'<th><button onclick="학생삭제('+i+')">삭제</button></th>'
			   //등록할때마다 등록 최신화/재호출
			   //변수는 문자처리X 미리 앞전에 정의된 코드이기때문에 컴퓨터가 알고 있는 키워드임 그래서 문자처리하면 못알아듣나봄?
	}	   //for e
			   
	//2. 해당 변수를 html에 출력하기
	document.getElementById('listtable').innerHTML = html

}	//f e

//
function 학생삭제( i ) {	// 학생 삭제하는 함수 [매개변수 : 삭제할 식별번호 (배열 내 저장된 순서번호=인덱스)]
	alert( studentlist[i].name + '의 점수를 삭제 합니다.')
	studentlist.splice( i , 1 )		//i번째 인덱스 객체 1개 삭제
	//5.
	학생출력()
}

/*
let 1등 = 'tmp'
let tmp = 0 
		if( 학생1 < 학생2 )	{
			tmp = 학생1
			학생1 = 학생2
			학생2 = tmp
					    	}
		if( 학생1 < 학생3 )	{
			tmp = 학생1
			학생1 = 학생3
			학생3 = tmp
							}
		if(학생2 < 학생3)		{
			tmp = 학생2
			학생2 = 학생3
			학생3 = tmp
							}
		테이블값에 넣기(학생1 + " " + 학생2 + " " + 학생3 )
		값을 넘버로? 숫자로 받아서 교환하나? 근데 학생이 100명이면 어쩌지
		순서를 -1 이런식으로 되나? 우선순위,,
		
		

*/


if( i = 0; i < 배열수; i++ ){
	if( 학생1 < 학생2 )	{
			tmp = 학생1
			학생1 = 학생2
			학생2 = tmp
					    	}
		if( 학생1 < 학생3 )	{
			tmp = 학생1
			학생1 = 학생3
			학생3 = tmp
							}
		if(학생2 < 학생3)		{
			tmp = 학생2
			학생2 = 학생3
			학생3 = tmp
							}
							
		html += (<tr>학생1</tr>
				<tr>학생2</tr>
				<tr>학생3</tr>)
}


















