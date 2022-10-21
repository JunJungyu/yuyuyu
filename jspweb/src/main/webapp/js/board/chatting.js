// 1. 로그인제 [ 로그인된 경우에만 실행 하겠다.[ 세션호출: jsp vs ajax ]  ]
let mid = document.querySelector('.mid').value;

// 2. 웹소켓 선언
let websocket = null;

// 3. 접속제어
if( mid !== 'null' ){
	
	// 1. JS에서 지원하는 클라이언트(사용자) 웹소캣 클래스 [ new WebSocket("ws://ip:port/프로젝트/서버소켓엔드포인트/"+변수) ]
		websocket = new WebSocket("ws://localhost:8080/jspweb/chatting/"+mid);
		websocket.onopen = function(e){onopen(e)}			// 내가 만든??
		websocket.onclose = function(e){onclose(e)}
		websocket.onmessage = function(e){onmessage(e)}
		websocket.onerror = function(e){ onerror(e) }
	}else{ alert('로그인하고 오세요~'); location.href="../member/login.jsp"; }
	// 2. 메소드 구현 [ 1. 접속했을때 2. 나갔을때 3. 메시지 보내기 4. 메시지 받았을때 ]
	function onopen(e){}			// e  : 이벤트
	function onclose(e){}		// 이건 내가 만든거

// 3. 메세지 전송
function send (){
	// 1. 입력상자에 입력된 데이터 가져온다
	// 1. 보낼 데이터 객체 구성
	let msg = {	// 데이티 객체
		type : "msg" ,
		content : document.querySelector('.msgbox').value ,
		mid : mid ,
		date : new Date().toLocaleTimeString() ,	// 보낸시간
		img : '프사.png'								// 사진
	}
	websocket.send( JSON.stringify(msg) )
	document.querySelector('.msgbox').value = ''

}	
	
// 이모티콘 전송
function emosend( i ){
	let msg = {
		type : "emo" ,								// 이모티콘
		content : i , 								// 이미지 번호
		mid : mid ,									// 보낸사람
		date : new Date().toLocaleTimeString() ,	// 날짜
		img : '프사.png'								// 프로필 이미지
	}
	websocket.send( JSON.stringify(msg) )
}
	
	
//자바스크립트 : FS할때마다 [ 새로 열릴때마다 ] 메모리 초기화
function enterkey(){
	if( window.event.keyCode == 13 ){ // window.event.keyCode : 키보드의 입력도니 데이터를 숫자표현
		send();
	}
}
// 메시지 받았을때
function onmessage(e){	// e : 서버소캐승로부터 받은 정보 담겨져있는 친구 / 이름 암거나 됨 	
	let msg = JSON.parse( e.data )	// 받은 데이터 객체
	
	// 1. 전송타입
	if( msg.type == "msg" ){		// 만약 전송타입이 메세지이면
		// 본인 글이면
		if( msg.mid == mid ){	// 본인 글이면 = 보낸사람 아이디와 접속된 아이디가 동일하면
			let html = document.querySelector('.contentbox').innerHTML
			
			html += '<div class="secontent my-3">'+
					'<span class="date">'+msg.date+'</span>	'+
					'<span class="content">'+msg.content+'</span>'+
					'</div>';
			document.querySelector('.contentbox').innerHTML = html;
		}else{// 본인 글이 아니면
			let html = document.querySelector('.contentbox').innerHTML
			html += '<div class="row g-0 my-3"> '+
						'<div class="col-sm-1 mx-2">'+
							'<img width="100%"; class="rounded-circle" alt="프로필사진" src="../CSS/img/프사.png">'+
						'</div>	'+
						'<div class="col-sm-9">'+
							'<div class="recontent">'+
								'<div class="name">'+msg.mid+'</div>'+
								'<span class="content">'+msg.content+'</span>'+
								'<span class="date">'+msg.date+'</span>'+
							'</div>'+
						'</div>'+
					'</div>';
			document.querySelector('.contentbox').innerHTML = html;
		}
}else if( msg.type == "emo" ){	// 만약 전송타입이 이모티콘이면
	if( msg.mid == mid ){
		let html = document.querySelector('.contentbox').innerHTML;
		html += '<div class="secontent my-3">'+
					'<span class="date">'+msg.date+'</span>	'+
					'<img src="/jspweb/CSS/img/emo'+msg.content+'.gif" width="90px">'+
				'</div>';
		document.querySelector('.contentbox').innerHTML = html;
		
	}else if( msg.mid != mid ){
			let html = document.querySelector('.contentbox').innerHTML
			html += '<div class="row g-0 my-3"> '+
						'<div class="col-sm-1 mx-2">'+
							'<img width="100%"; class="rounded-circle" alt="프로필사진" src="../CSS/img/'+msg.img+'">'+
						'</div>	'+
						'<div class="col-sm-9">'+
							'<div class="recontent">'+
								'<div class="name">'+msg.mid+'</div>'+
								'<img src="/jspweb/CSS/img/emo'+msg.content+'.gif" width="90px">'+
								'<span class="date">'+msg.date+'</span>'+
							'</div>'+
						'</div>'+
					'</div>';
			document.querySelector('.contentbox').innerHTML = html;
	}
		
		
	}else if( msg.type == 'alarm' ){	// 타입이 알람일때
		let html = document.querySelector('.contentbox').innerHTML;
		html += '<div class="alarm">						'+
					'<span>'+msg.content+'</span>'+
				'</div';
			document.querySelector('.contentbox').innerHTML = html;
	}
	
	// ----------------------------------- 스크롤 하단으로 내리기 ----------------------------------- 
	let top = document.querySelector('.contentbox').scrollTop;
	let height = document.querySelector('.contentbox').scrollHeight;
	
	document.querySelector('.contentbox').scrollTop =
		document.querySelector('.contentbox').scrollHeight;
		
		console.log( top );
		console.log( height );
	
	}	
function onerror(e){ 	alert(e) }

// 이모티콘 호출
emoview()
function emoview(){
	let html = '';
	for( let i = 1; i<=45; i++ ){
		html += '<img onclick="emosend('+i+')" width="70px" src="/jspweb/CSS/img/emo'+i+'.gif">';
	}
	document.querySelector('.dropdown-menu').innerHTML = html;
}

