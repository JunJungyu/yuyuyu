/*


	자바 메모리 저장하는 방법
	1. 변수 : 메모리를 1개 저장할 수 있는 공간 [ 수정가능 ]	let		하나씩 선언 안하고 배열에 다 묶어도 됨 / 대신 인덱스 알아야됨(순서로 구별)
	2. 상수 : 메모리를 1개 저장할 수 있는 공간 [ 수정불가 ] const
	3. 배열 : 메모리를 여러개 저장할 수 있는 공간 [ 저장 순서가 존재해서 반복문 활용 가능 ] 배열은 객체
	4. 객체 : 여거래 메모리들을 하나의 메모리에서 관리 / 모임,,처럼
		DOM 객체 => 미리 만들어진 객체들
			1. 이벤트
				1.D[document]O[object]M[model]ContentLoaded 이벤트 : html 모두 호출된 후 실행되는 이벤트
				// 미사용시 [ js파일은 body 가장 하단에 배치 ]
			2. click : 해당 문서 객체를 클릭했을 때 발생하는 이벤트	[  ]
			3. change : 해당 문서객체를 변경되었을 때 발생하는 이벤트	 [ 모든 입력 후 커서 변경이 있을 때 이벤트 발생 ]
			4. keyup : 해당 문서객체에서 키보드를 눌렀을 때 발생하는 이벤트 [ 입력하면서 계속적인 이벤트 발생 ]
 
			2. 메소드
				1. let 객체명 = document.querySelector('식별자')
				2. let 객체명[배열] = document.querySelectorAll('식별자')
					0. 값 조작하기
						1. [호출]객체명.value		[저장] 객체명.value = 값		/input , textarer같은애드이 가지고 있고
						2. [호출]객체명.checked									/chakbox , option 이 갖고있고
						3. [호출]객체명.options		객체명.options.seletedIndex	/select
					1. 글자 조작하기
						1. 문서객체명.textContent	[저장]객체명.textContent = 값  		/ div , p , span이 갖고 있음
						2. 문서객체명.innerHTML		[저장]객체명.innerHTML	= 값 
					2. 속성 조작하기
						1.객체명.setAttribute( 속성이름, 값 ) --> 객체명,속성명 = 값
						2.객체명.setAttribute( 속성이름 )
					3. 스타일 조작하기
						1. 객체명.style.css속성명 color같은~
					4. 문서 객체 생성/제거
						1. [생성]document.createElement('태그명')
						2. [html 삽입]상위문서객체.appendChild (하위문서객체)
						3. [삭제] 상위문서객체.removeChild (하위문서객체)
						4. [상위문서 객체찾기] 문서객체.parentNode
						
			*문서객체에 이벤트 추가
				객체명.addEventListener( '이벤트', 함수명 )
				객체명.addEventListener( '이벤트', ( ) => { } )			
				객체명.removeEventListener( '이벤트' , 함수명 )	//이름이 없는 함수라 제거가 안됨? 그래서 화살표함수 쓰지 말고 코드식별위해 익명말고 이름을 줘야됨
 */