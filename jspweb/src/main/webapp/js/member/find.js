
/* 아이디 찾기 */
function findid(){
	// 1. 해당 아이디의 인ㅂ풋 벨류 외 디아이브이 호출
	let mname = document.querySelector("#mname").value
	let memail = document.querySelector("#memail").value
	let findidconfirmbox =
		document.querySelector("#findidconfirmbox")

	// 2. 서블릿에게 데이터 보내기
	$.ajax({
		url :"/jspweb/member/finid",	/*통신경로 : 서블릿url*/
		data : { "mname" : mname , "memail" : memail } ,
		success : function( 받은데이터 ){
			if( 받은데이터 !== 'null' ){
				findidconfirmbox.innerHTML = '회원아이디 : '+ 받은데이터;
			}else{
				findidconfirmbox.innerHTML = '동일한 회원정보가 없습니다.';
			}
		} 
	})
	}
/* 비밀번호 찾기 */
function findpassword(){

	let mid = document.querySelector("#mid").value			// JSP파일의 id="mid"를 변수 mid에 저장
	let memail = document.querySelector("#memail").value
	let resultbox = document.querySelector("#findpsconfirmbox")
	// 2. ajax
	$.ajax({
		url : "http://localhost:8080/jspweb/member/findpasword" , 			/* 호출 */
		data : { "mid" : mid , "memail" : memail },			// 아마 여기서 디비 mid랑 여기서 선언한 변수 mid랑 비교하는거 아닐까
		success : function( result ){						// 근데 만약 값이
	 	console.log( "나와라 : "+result );
			if( result === '' ){resultbox.innerHTML = '동일한 회원정보가 없습니다.';}
			else{ resultbox.innerHTML = '임시비밀번호 : '+ result; }
		}
	})

}
/*
비밀번호 찾기 하면 비밀번호가 안뜨고 안바뀜
그리고 비밀번호 찾기 창이 하나 더 뜨고 제대로 동작은 안함
result를 출력하니 비밀번호 찾기 jsp 창이 통째로 출력됨!
 */