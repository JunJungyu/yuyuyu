// 1. 등록버튼을 눌렀을때
function regist(){ 
	/* 첨부파일이 포함되어 있을 경우 */
	let form = document.querySelector('form')
	let formdata = new FormData( form )
	
	$.ajax({
		url : "/jspweb/admin/regist" ,
		data: formdata ,
		/* form 전송이 첨부파일 경우 [ 아래 3가지 필수 ] write.js 참고 */
		type : "POST" ,
		processData : false ,
		contentType : false ,
		success : function( re ){
			if( re == 'true' ){
				alert('제품 등록 성공');
			}else{ alert('제품 등록 실패'); }
		}
	})
}

// 2. 첨부파일 등록(변경)했을때 [사진]미리보기
let pimg = document.querySelector('#pimg')
pimg.addEventListener( 'change' , function(e){ // e : 첨부파일 change 이벤트 e : event 객체 ( 이벤트정보[ target , data 등 ] )
	// 1. js 파일 클래스 [ FileReader() ]
	let file = new FileReader()				// 객체 생성
		//console.log( file )					// 이벤트 발생 
		//console.log( e )					// 이벤트 객체
		//console.log( e.target )				// 이벤트 발생 시킨 태그 <input type="">
		//console.log( e.target.files[0] )	// 해당 태그
	// 2. 해당 첨부된 파일 경로 알기 [ .readAsArrayBuffer( 파일 ) ]
	file.readAsDataURL( e.target.files[0] ) // e : 로드된 file의 이벤트
	// 3. 이미지 태그에 첨부된 이미지 대입
	file.onload = function( e ){
		document.querySelector('#pimgpre').src = e.target.result	// 서버는 [사용자의 c드라이브 경로 요청X] 서버와 관련없음
	}
})

// 3. 카테고리 추가 버튼을 눌렀을때 이벤트
function pcategoryview(){

	document.querySelector('.pcategoryaddbox').innerHTML
	= '<input type="text" id="pcname">'+
			'<button type="button" onclick="setpcategoryadd()">카테고리 등록</button>';
}

// 4. 
function setpcategoryadd(){

	$.ajax({
		url : "/jspweb/admin/pcategory" ,
		type : "post" ,
		data : { "pcname" : document.querySelector('#pcname').value } ,
		success : function(re){
			if( re == 'true' ){
				alert('카테고리 등록')
				document.querySelector('.pcategoryaddbox').innerHTML = '';
				getpcategory();	// 카테고리 호출 메소드 재실행
			}else{
				alert('카테고리 실패')	
			}
		}
	})
}

// pcategorybox
// 5. 카테고리 호출 메소드 [ 실행조건 : 페이지 열렸을때 ]
getpcategory()
function getpcategory(){
	
	$.ajax({
		url : "/jspweb/admin/pcategory" ,
		type : "get" ,
		success : function(re){
			let json = JSON.parse( re )
			let html = ''
			for( let i = 0; i<json.length; i++ ){
				let category = json[i];
				html += '<input type="radio" name="pcno" value='+category.pcno+'>'+category.pcname;
			}
			
			document.querySelector('.pcategorybox').innerHTML = html;
		}
	})
}

































