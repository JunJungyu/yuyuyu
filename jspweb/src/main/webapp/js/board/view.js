/*
	value : input , select , tectarea 등
		<tag value 여기 >
	innerHTML : div , table , span , tectare 등
		<tag> 여기 </tag>
*/

bview()	// 게시물 상세페이지가 열렸을때 실행되는 함수

// 1. 해당 게시물 출력
function bview(){
	$.ajax({
		url : "http://localhost:8080/jspweb/board/view" ,
		async : false ,				// 동기식 / 우선순위 제어 
		success : function( re ){
			let board = JSON.parse( re )
			console.log( board );
			document.querySelector('.bno').innerHTML = board.bno;
			document.querySelector('.btitle').innerHTML = board.btitle;
			document.querySelector('.bcontent').innerHTML = board.bcontent;
			document.querySelector('.mid').innerHTML = board.mid;
			//document.querySelector('bfile').innerHTML = board.bfile;
		
		// 절대경로 : http://localhost:8080/jspweb/filedown
		// 상대경로 : 현재 위치 기준 [ http:/localhost:8080/jspweb/js/view.js ]
		// 												../board.filedown
			
		// <a href="URL?변수명=데이터">	: get메소드로 해당 URL로 데이터 전송가능 
		// '<a href="URL?변수명='+변수+'">'
		if( board.bfile !== null ){		// null , undefined , 0 , false 널이 아닌 경우
			let filelink = '<a href="http://localhost:8080/jspweb/board/filedown?bfile='+board.bfile+'">'+board.bfile+'</a>'
				// ' ' : 전체 문자열 처리
				// " " : 전체 문자열내 문자열 구분
			document.querySelector('.bfile').innerHTML = filelink;		// bfile에 html a를 넣어주는데...
			
		}
		
		let btnbox = document.querySelector('.btnbox')
		
		// 삭제 버튼 활성화
		if( board.btnaction === true ){		//  본인 글
			let deletbtn = '<button onclick="bdelete('+board.bno+')">삭제</button>'
			btnbox.innerHTML += deletbtn;
			// 수정버튼 활성화
			let updatebtn = '<button><a href="http://localhost:8080/jspweb/board/update.jsp">수정</a></button>'
			btnbox.innerHTML += updatebtn;
			}
		}
		
		
	})
	// 댓글 출력	
	rlist()
}

// 2. 게시물 삭제 함수
function bdelete( bno ){// 삭제 버튼 클릭 시 삭제할 번호를 인수 [식별]
	
	$.ajax({
		url : "http://localhost:8080/jspweb/board/bdelete" ,
		data : { "bno" : bno }	, // 삭제할 게시물의 식별번호 [ pk -> bno ]
		success : function( re ){
			if( re === 'true' ){
				alert('글 삭제 성공');
				location.href="http://localhost:8080/jspweb/board/list.jsp"
			}
			else{alert('글 삭제 실패');}
		}
	})
	
}

// 3. 댓글 작성함수
function rwrite(){
	let rcontent = document.querySelector('.rcoment').value;
	
	$.ajax({
		url : "http://localhost:8080/jspweb/reply/rwrite" ,
		data : { "rcontent" : rcontent , "type" : "reply" } ,					// 맞고
		type : "POST" ,															// http 메소드
		success : function( re ){
			alert( re )														
			if( re == 1 ){														// 성공
				location.reload();
			}else if( re == 0 ){												// DB 오류
				rlist()
			}else{											
				location.href = '../member/login.jsp'
			}
		}
	})
}

// 4. 댓글 출력 함수
function rlist(){
	$.ajax({ // 댓글 호출 ajax
		url : "http://localhost:8080/jspweb/reply/rlist" ,
		data : { "type" : "reply" } ,						// type : reply    댓글용 이 이름은 아무거나 주고싶은거 주면 됨~
		success : function ( re ){							// 서블릿에서 준 값 ♥2♥ array였던것
			
			let replylist = JSON.parse(re);					// JSON.parse = JSON을 객체로 바꿔줌 하지만 json도 뭔지 모르고 객체도 뭔지 잘 모르겠다
			
			
			let html = '';									// 누적더하기(+=) 해주기 위해 공백으로 먼저 선언하고
			for( let i = 0; i<replylist.length; i++ ){		// 댓글마다 돌아갈 반복문	replylist 댓글모둠인가??? 뭘까
				let reply = replylist[i]					// 댓글로 보이는 변수 reply에 순서대로 다 넣어줌
				
				
				// 대댓글 호출 = rno ----> rindex
				$.ajax({
					url : "http://localhost:8080/jspweb/reply/rlist" ,					// 조작해올 링크
					data : { "type" : "rereply" , "rno" : reply.rno } ,					// type에 rereply 을 줘서 대댓글용으로 점찍고 ( 서블릿에서 rereply면 댓글리스트 다오 값 가져오게 돼있기때문 )
					async : false , // 동기식												// 저걸 해줘야 결과값이 나온담에 실행됨( 아니면 결과 나오기 전에 다른거랑 동시실행되거나 뒤죽박죽되니까 )		
					success : function( re ){											// 서블릿에서 받아온 값 ♥2♥ array = BoardDao.getinstance().getrlist(bno);
						let rereplylist = JSON.parse( re )								// parse로 객체화 시켜주고 ( re ) 는 왜 넣어주는걸까?
						// 상위댓글 html 구성
						html += '<div>'+												// 댓긓 = 댓글내용 / 작성날찌 / 작성자 / 대댓글 작성버튼 이 뜨도록 
									'<span>'+reply.rcontent+'</span>'+					// html에 대입해주고 버튼에는 oncilck으로 이벤트 부여
									'<span>'+reply.rdate+'</span>'+						// 온클릭하면 대댓글 보여주는 함수가 실행됨
									'<span>'+reply.mid+'</span>'+
									'<button onclick="rereplyview('+reply.rno+')" type="button">답글</button>'+	// 그 함수는 매개변수로 지금 댓글 고유번호 받음
								'<div class="reply'+reply.rno+'"></div>';		// 댓글마자 사용되는 구역				뭐야 근데 왜 위에 div안닫지? 왜냐면 대댓글있으면 그거까지 다 보여주고 맨밑에서 닫기 때문]
							
							// 대댓글 html 구성
							for( let j = 0; j<rereplylist.length ; j++ ){				// 대댓글 수만큼 반복
								let rereply = rereplylist[j]							// rereply 대댓글모둠?에 현재 게시물 모든 대댓글 담아줌
								html += '<div style="margin : 20px;">'+					// 만약 대댓글 있으면 실행되고 아니면 실행안됨~ 원댓과 구별 위해 마진 줬음 
											'<span>'+rereply.rcontent+'</span>'+		// 위랑 똑같이 순서대로 쭉쭉
											'<span>'+rereply.rdate+'</span>'+
											'<span>'+rereply.mid+'</span>'+
										'</div>';
							}// 대댓글 반복문
							// 마지막 담기	html 구성		
						html += '</div>';												// 원댓에서 안닫은 <div> 닫아주고
					}
				})
				
			}// 댓글 반복문 end
			document.querySelector('.replylist').innerHTML = html;						// 열심히 담음 html replylist에 담아줌 근데 이건 어디있는 누구지?
		}
	})
}


// 5. 대댓글[답글] 작성 구역 표시 함수			
function rereplyview( rno ){																		// 그저 댓글 식별만을 위한 함수~
	let replydiv = document.querySelector('.reply'+rno)
	replydiv.innerHTML = 
			'<input type="text" class="rerecontent'+rno+'">'+										// 원댓글 번호로 class 부여
			'<button onclick="rereplywrite('+rno+')">답글작성</button>';								// 매개변수로 원댓글번호 받음
}

// 6. 대댓글[답글] 작성 함수 
function rereplywrite( rno ){
	let rcontent = document.querySelector('.rerecontent'+rno).value									// 위애서 부여한 클래스의 값을 저장해서
	$.ajax({
		url : "/jspweb/reply/rwrite" ,
		data : { "rcontent" :  rcontent , "rno" : rno , "type" : "rereply" } ,						// 값을 지정..? 하고 
		type : "POST" , 
		success : function( re ){																	// 서블릿에서 pront해준 값 
			if( re == 1 ){ alert('답글 작성'); rlist() }
			else if( re == 0){ alert('로그인후 작성가능합니다.'); location.href='../member/login.jsp' }
			else{ alert('답글 실패') }
		 }
	});
}






