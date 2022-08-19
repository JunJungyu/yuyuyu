/*

 	CSS : class명
 	js : 
 	1. HTML input태그에 입력된 데이터 호출
 	2. 객체에 담기
    3. 글 등록 버튼을 눌렀을때[마다->함수] 1/2 실행한다.
    4. 게시물 객체 여러개 저장할 공간 = 배열 사용
    5. 글 등록이 완료될때마다 board 객체를 배열에 저장한다.
    6. 글 등록했으면 기존 내용 지우기 -> 
 
 [출력]
 // js 시작될때 / 1. 새로운 글이 등록될때마다 [게시물 출력]
 [보기]
 //1.게시물 출력해서 제목을 클릭 할때마다 [ 게시물보기 ]
 	//1. 내가 클릭한 게시물이 뭔지를 식별하기 위해 매개변수를 전달해야함 [클릭한 게시물의 번호(중복이 없는 속성으로 해야 식별 가능)]
 
 4. 여러개 board 객체를 저장할 배열 선언
 */	
 let boardlist = [ ]
 
 //js가 실행될때 함수 실행
 게시물출력()
 
 //3. 함수선언 [ 글 등록 버튼을 클릭할때마다 ]
 function 글등록(){
	//1. HTML에서 입력된 데이터 가져와서 변수에 담기
	 
	 let bwriter = document.getElementById('bwriter').value	/*innerHTML아님*/
	 let bpassword = document.getElementById('bpassword').value
	 let btitle = document.getElementById('btitle').value
	 let bcontent = document.getElementById('bcontent').value
	 //2. 객체에 담기 가방,,,
	 	
	 let board = {
		작성자 : bwriter,
		비밀번호 : bpassword,
		제목 : btitle,
		내용 : bcontent
		}
	
	//5. 객체를 배열에 저장한다.
	boardlist.push( board )	//배열명.push(데이터) : 배열에 데이터 추가 함수
	alert('[안내] 글 등록이 되었습니다.')
	//6. input에 공백 넣기
	document.getElementById('bwriter').value=''
	document.getElementById('bpassword').value=''
	document.getElementById('btitle').value=''
	document.getElementById('bcontent').value=''
	// 7. 글 등록 시 
	게시물출력()
}//글 등록함수 end

//1.
function 게시물출력(){
	let html = '<tr> <th>번호</th> <th>제목</th> <th>작성자</th> </tr>' 
	
	// 1. 반복문
	for(let i = 0 ; i<boardlist.length ; i++){
		// i는 0부터 배열의길이 까지 1씩 증가 			// 배열내 i번째 객체내 '제목' 키 호출 -> 값 이 나옴
		html += '<tr>'+
					'<td> '+i+' </td> '+
					'<td><a href="#" onclick="게시물보기('+i+')">'+boardlist[i].제목+'</a></td>'+ 
					'<td>'+boardlist[i].작성자+'</td> '+
				'</tr>'
											// " " : 문자처리   ' ' : 문자처리  vs `${ }`
											// js에서 html 작성시 문자처리 : '<태그명 onclick="함수()">'
	}
	document.getElementById('boardlist').innerHTML = html
} // 게시물출력 함수 end 

function 게시물보기( i ){
	document.getElementById('viewtitle').innerHTML =  boardlist[i].제목
	document.getElementById('viewwriter').innerHTML =  boardlist[i].작성자
	document.getElementById('viewcontent').innerHTML =  boardlist[i].내용
} // 게시물보기 함수 end 

















 
 
