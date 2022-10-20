//자바스크립트 : FS할때마다 [ 새로 열릴때마다 ] 메모리 초기화

// 메시지 받았을때
function onmessage(e){	// e : 서버소캐승로부터 받은 정보 담겨져있는 친구 / 이름 암거나 됨 	
	let msg = JSON.parse( e.data )
	let html =
			   '<div>'+
			   '<span>'+msg.mid+' : </span>'+
			   '<span>'+msg.content+'</span>'+
			   '<span>['+msg.date+']</span>'+
				'<div>';
	// 1. 출력 구역 호출
	document.querySelector('.contentbox').innerHTML += html;
	
	// 2. 받은 메세지를 html 꾸미기

}

// 3. 메세지 보내기
function send (){
	// 1. 입력상자에 입력된 데이터 가져온다
	// 1. 보낼 데이터 객체 구성
	let msg = {
		content : document.querySelector('.msgbox').value ,
		mid : mid ,
		date : new Date().toLocaleTimeString()	// 보낸시간
	}
	websocket.send( JSON.stringify(msg) )
	document.querySelector('.msgbox').value = ''

}

function enterkey(){
	if( window.event.keyCode == 13 ){ // window.event.keyCode : 키보드의 입력도니 데이터를 숫자표현
		send();
	}
}

// 1. 전역변수
let websocket = null;		// 웹소캣 선언

// 2. 로그인 id 호출
let mid = document.querySelector('.mid').value;

// 2. 만약 로그인이 되어 있는 경우애만 소겟 사용
if( mid !== 'null' ){
	
	// 1. JS에서 지원하는 클라이언트(사용자) 웹소캣 클래스 [ new WebSocket("ws://ip:port/프로젝트/서버소켓엔드포인트/"+변수) ]
		websocket = new WebSocket("ws://localhost:8080/jspweb/chatting/"+mid);
		websocket.onopen = function(e){onopen(e)}			// 내가 만든??
		websocket.onclose = function(e){onclose(e)}
		websocket.onmessage = function(e){onmessage(e)}
		websocket.onerror = function(e){ onerror(e) }
	}else{ alert('로그인하고 오세요~'); location.href="../member/login.jsp"; }



// 2. 메소드 구현 [ 1. 접속했을때 2. 나갔을때 3. 메시지 보내기 4. 메시지 받았을때 ]
function onopen(e){alert('채팅방에 들어왔습니다'+e)}		// e  : 이벤트
function onclose(e){alert('채팅방에서 나갔습니다'+e)}		// 이건 내가 만든거





