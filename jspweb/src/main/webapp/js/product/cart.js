// 장바구니 리스트
let cartlist = null;	// 
let totalprice = 0;		// 총 주문금액

getcart()
function getcart(){
	$.ajax({
		url : "/jspweb/product/cart" , 
		type : "get" ,
		success : function( re ){
			cartlist = JSON.parse( re )
			let html = '<tr> <th width="5%"></th> <th width="20%">이미지</th>	<th width="50%">상품정보</th>	<th width="15">수량</th> <th width="15">가격</th>	<th width="5">비고</th> </tr>'
			for( let i = 0; i<cartlist.length; i++ ){
				let c = cartlist[i]
				html +=  '	<tr>'+
								'<td> <input type="checkbox"> </td>'+
								'<td> <img width="80%" alt="" src="/jspweb/admin/pimg/'+c.pimg+'"> </td>'+
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

let member = null;

getmember()
function getmember(){
	$.ajax({
		url : "/jspweb/member/info" ,
		success : re => { member = JSON.parse( re ) }
	})
}

 /* 아임포트 [ 결제 api ]*/
 function requestPay() {
	var IMP = window.IMP;   								// 생략 가능
	IMP.init("imp14103839"); 								// 왜 안되지?! 따옴표를 써야해~
    IMP.request_pay({ 
          pg: "kcp",							 			// pg카트
          pay_method: "card",
          merchant_uid:  "",   //주문번호 [ 1.자동번호 2.직접( 날짜+시간+mid+난수 ) ]
          name: cartlist[0].pname + "외 "+cartlist.length ,	// 제품명[ 장바구니 ]
          amount: totalprice ,                       	    // 숫자타입
          buyer_email: member.memail,
          buyer_name: member.mname ,
          buyer_tel: member.mphon,
          buyer_addr: member.maddress ,
          buyer_postcode: "01181"
      }, function (rsp) { // callback
          if (rsp.success) { // 결제 성공 시 로직
             
          } else { // 결제 실패 시 로직 - 실제 결제하면 안되니까 여기가 성공으로 치고 하기~
             alert('결제 성공~')
          }
      });
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    