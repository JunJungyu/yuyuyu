// ------------------------------------- 사이드바 ------------------------------------- //
// 해당 사이드바 태그 호출
let sidebar = document.querySelector('.sidebar')
let mainbox = document.querySelector('#mainbox')
 
// 2. 해당 사이드바 태그를 클릭했을때 이벤트 [ 사이드바 열기 ]
sidebar.addEventListener( 'click' , function(){
	// 해당 사이드바 css 변경 [ left 속성을 0으로 변경 ]
	sidebar.style.left = 0;
})

// 메인박스를 클릭했을때 사이드바 다시 숨겨줌 [ 사이드바 접기 ]
mainbox.addEventListener( 'click' , function(){
	sidebar.style.left = 170;
})

// 본문전환 이벤트
function pagechange( page ){
	// 특정 태그에 해당 파일 로드 [ jqurre ]
	$('#mainbox').load( page )
}
