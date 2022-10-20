let websocket = null;

// 1. JS에서 지원하는 클라이언트(사용자) 웹소캣 클래스 [ new WebSocket() ]
let mid = document.querySelector('.mid').value

// 2. 만약 로그인이 되어 있는 경우애만 소겟 사용
if( mid !== null ){ let websocket = new WebSocket("ws://localhost:8080/jspweb/chatting/"+mid); }

		// 서블릿으로 이동

// 2. 메소드 구현 [ 1. 접속했을때 2. 나갔을때 3. 메시지 보내기 4. 메시지 받았을때 ]

function onopen(e){alert('채팅방에 들어왔습니다'+e)}		// e  : 이벤트
function onclose(e){alert('채팅방에서 나갔습니다'+e)}		// 이건 내가 만든거
function send (){
	

	// 1. 입력상자에 입력된 데이터 가져온다
	let msg = document.querySelector('.msgbox').value
	// 메시지 전송
	websocket.send(msg)	
}

// 메시지 받았을때
function onmessage(e){ 
	let contentbox = document.querySelector('.contentbox')
	
	// 2. 받은 메세지를 html 꾸미기
	let html = '<div>'+e.data+'</div>';
	
	// 받은 메시지를 html에 저장
	contentbox.innerHTML += e.data
	
}


// 3. 2번에서 구현된 메소드를 클라이언트소캣에 대입
if( mid != null )
websocket.onopen = function(e){onopen(e)}			// 내가 만든??
websocket.onclose = function(e){onclose(e)}
websocket.onmessage = function(e){onmessage(e)}
// 서블릿 이동 변수.2번 메소드 = 뭐지 이건