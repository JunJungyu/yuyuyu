
getproduct()
function getproduct(){
	$.ajax({
		url : "/jspweb/admin/regist" ,
		type : "get" ,
		success : function( re ){
			
			let html = '<tr>'+
							'<th>이미지</th><th>번호</th><th>카테고리</th><th>상품명</th><th>제품가격</th>'+
							'<th>할인율</th><th>판매가</th><th>판매상태</th><th>날짜</th>'+
					  '</tr>';
			let json = JSON.parse( re )
			// let img = '<img src="/jspweb/admin/pimg/'+json[i].pimg+'">'
			
			for( let i = 0; i<json.length ; i++ ){
				 
				 html += '<tr>'+
							'<td><img src="/jspweb/admin/pimg/'+json[i].pimg+'"></td><td>'+json[i].pno+'</td><td>'+json[i].pcno+'</td><td>'+json[i].pname+'</td><td>'+json[i].pprice+'</td>'+
							'<td>'+json[i].pdiscount+'</td><td>'+(json[i].pprice-(json[i].pdiscount*json[i].pprice) )+'</td><td>'+json[i].pactive+'</td><td>'+json[i].pdate+'</td>'+
					  '</tr>';
			}
			document.querySelector('table').innerHTML = html;
		}
	})
}