
getcart()	// 여기서 버튼을 만드니까 버튼을 만든 후에[1]

let checkbtnlist = document.querySelectorAll('checkbtn')	// 1. 모든 체크박스 호출
checkbtn[0].addEventListener('click' , c => {	// 버튼 호출이 말이 됨[2] // 2. 만약에 첫번째 체크박스가 체크되어 있으면
	
	// 첫번째 체크박스에 체크가 되어 있는경우 모든 체크박스에 체크
		// e.currentTarget : 이벤트를 발생시킨 대상의 이벤트 정보
			// checked : 속성 [ 체크 여부 ]
	alert('첫번째 체ㅐ크박스클릭~!')
	if( e.currentTarget.checked == true ){ c.checked = true; // 3. 모든 체크박스에 체크
	} 
	else // 아니면 모든 체크박스 제거
	{ checkbtnlist.forEach( c => { c.checked = false ; } ) }
	
}

)


let checkplist = [] // 장바구니에서 체크도니 제품만 저장하는 리스트
// 2. 장바구니에서 체크된 제품만 결제 페이지로 이동
function payload(){ // 결제 버튼 누르면 실행됨
	
	checkbtnlist.forEach( ( c , i ) => { // forEach( ( value , index ) => {} )
		if( i != c.checked == true ){ // 체크가 되어 있는 경우에
			checkplist.push( cartlist[i-1] ) // 전체선택 하는 첫번째 박스 한개는 빼줌
		}
	})
	// 만일 1개도 체크된 제품이 없으면
	if( checkplist.length == 0 ){ alert('1개 이상 선택해주세요'); return; }
	// 저장소 초기화
	localStorage.removeItem('checkplist')	
	// 저장소 생성 ['checkplist'라는 이름으로 checkplist 객체 저장]세션에 저장
	localStorage.setItem( 'checkplist' , JSON.stringify(checkplist) );
	// 페이지 이동
	location.href='/jspweb/product/pay.jsp';	
}

// 장바구니 리스트
let cartlist = null;	// 
let totalprice = 0;		// 총 주문금액


function getcart(){
	
	$.ajax({
		url : "/jspweb/product/cart" , 
		type : "get" ,
		async : false ,		// 결과가 있을때까지 대기상태
		success : function( re ){
			cartlist = JSON.parse( re )
			let html = '<tr> <th width="5%"> <input type="checkbox" class="checkbtn"></th> <th width="20%">이미지</th>	<th width="50%">상품정보</th>	<th width="15">수량</th> <th width="15">가격</th>	<th width="5">비고</th> </tr>'
			for( let i = 0; i<cartlist.length; i++ ){
				let c = cartlist[i]
				html +=  '	<tr>'+
								'<td> <input type="checkbox" class="checkbtn"> </td>'+
								'<td> <img width="80%" alt="제품이미지" src="/jspweb/admin/pimg/'+c.pimg+'"> </td>'+
								'<td> '+c.pname+' <br> - '+c.pcolor+' / '+c.psize+' </td>'+
								'<td> '+c.amount+' </td>'+
								'<td> '+c.amount * (c.pprice - ( c.pprice * c.pdiscount ) )+' </td>'+
								'<td> <button>삭제</button> </td>'+
							'</tr>';
					// 담은거 다 누적더하기
					totalprice += cartlist[i].amount*cartlist[i].pprice - ( cartlist[i].pprice*cartlist[i].pdiscount )			
			} 
			document.querySelector('.cart_t').innerHTML = html
		}
	})
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    