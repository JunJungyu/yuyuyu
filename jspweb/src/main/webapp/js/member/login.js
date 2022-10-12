
//	자바스크립트에서 서블릿으로 통신하기
 	
// 0. 로그인 버튼 눌렀을 때 [ 여러번 실행 --> 함수 ]
 	// 1. 함수정의 [ function 함수명 (매개변수) {} ]


function login(){
 // 1. html 입력된 데이터 가져오기 [ DOM 객체 ]
 	// 1. document.querySelector('#ID')
 	// 2. document.getElementById("id") 
 
	let mid = document.querySelector('#mid').value
	let mpassword = document.querySelector('#mpassword').value
	let loginconfirmbox = document.querySelector('#loginconfirmbox')
		
	
	// 2. 변수 두개를 서블릿으로 보내자 [ JQUERY : JS ]
		// 1. JQUERY 라이브러리 포함
		// 2. AJAX
	
//	$.ajax({ 속성명 = 값 },{ 속성명 = 값 })
	// url : '통신경로'
	// data : 전송할 데이터 { '키' : 값 , '키' : 값 } ,
	
	// success : function( 매개변수 ){ }
	
	$.ajax({
		url : "/jspweb/member/login" ,
			// 데이터 변수명 
		data : { "mid" : mid , "mpassword" : mpassword } ,
		success : function( re ){
			alert(re)
			if( re === '1' ){ location.href="/jspweb/index.jsp"; }  // javascript 하이퍼링크
			else if( re === '2' ){loginconfirmbox.innerHTML = '패스워드가 다릅니다.'}
			else if( re === '3' ){loginconfirmbox.innerHTML = '데이터베이스 오류[관리자에게 문의]'}
			else if( re === '0' ){loginconfirmbox.innerHTML = '존재하지 않는 아이디입니다.'}
		}
	});




}

/*---------------------------------- 회원정보 호출 ----------------------------------*/
function getmember(){
	$.ajax({
		url : "/jspweb/member/info" , 	// 서블릿 URL
	 	success : function( result ) {
			// HTTP 스트림( 바이트단위 ) json형식의 문자열 타입을 JSON 타입으로 형변환 
			let member = JSON.parse( result )
			document.querySelector("#mno").innerHTML = member.mno
			document.querySelector("#mid").innerHTML = member.mid
			document.querySelector("#mname").innerHTML = member.mname
			document.querySelector("#mphone").innerHTML = member.mphone
			document.querySelector("#memail").innerHTML = member.memail
			document.querySelector("#maddress").innerHTML = member.maddress
			document.querySelector("#mdate").innerHTML = member.mdate
			document.querySelector("#mpoint").innerHTML = member.mpoint
			
			document.querySelector
			getmemberlist(); // 모든 회원 함수 호출
		}
	});
}
 

	 