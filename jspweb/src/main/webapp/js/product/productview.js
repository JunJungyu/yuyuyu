// 1. 현재 페이지 내 제품번호[ a href="링크?pno=제품번호" ]를 가지고 와서 ajax로 해당 제품번호의 모든 제품정보를 가져오자

let pno = document.querySelector('.pno').value

$.ajax({
	url : "/jspweb/admin/regist" ,
	type : "get" ,
	data : { "pno" : pno , "type" : 2 } ,
	success : re => {
		let json = JSON.parse( re )
		console.log( json )
	}
})