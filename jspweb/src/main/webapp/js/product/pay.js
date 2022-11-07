/*
	 	oname
		ophone 
	    oaddress 
	    orequest 
	    oamount
	    odate
	    mno
 */
// js 저장소에 있는 'checkplist'
let checkplist
 = JSON.parse( localStorage.getItem('checkplist') )

let checkbtn = document.querySelector('.checkbtn')

alert(checkplist) // 왜 널이야

// 로그인된 회원호출
checkbtn.addEventListener( 'click' , (e)=>{
	// 1. 체크박스 체크 했을때
	if( e.currentTarget.checked == true ){
		document.querySelector('.oname').value = member.mname;
		document.querySelector('.ophone').value = member.mphone;
		document.querySelector('.oaddress').value = member.maddress;
	}else{
		document.querySelector('.oname').value = '';
		document.querySelector('.ophone').value = '';
		document.querySelector('.oaddress').value = '';
	}
} )

let member = null;

getmember()
function getmember(){
	$.ajax({
		url : "/jspweb/member/info" ,
		success : re => { member = JSON.parse( re ) }
	})
}

let method = null;
function requestPay( payM ){ method = payM; alert( pmethod ) }

/* 아임포트 [ 결제 API ] */
 function requestPay( payM ) {
	var IMP = window.IMP;   								// 생략 가능
	IMP.init("imp14103839"); 								// 왜 안되지?! 따옴표를 써야해~
    IMP.request_pay({ 
          pg: "kcp",							 			// pg카트
          pay_method: pmethod ,
          merchant_uid:  "" ,   //주문번호 [ 1.자동번호 2.직접( 날짜+시간+mid+난수 ) ]
          name: checkplist[0].pname + "외 "+checkplist.length ,	// 제품명[ 장바구니 ]
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
             setoeder();
          }
      });
    }
    
function setoeder(){

	let oinfo = {
		oname : document.querySelector('.oname').value = member.value ,
		ophone : document.querySelector('.ophone').value = member.value ,
		oaddress : document.querySelector('.oaddress').value = member.value
	}

	$.ajax({
		url : "" ,
		data : { "data" : JSON.stringify(checkplist) , "orderinfo" : JSON.stringify(orderinfo) } , 
		type : "post" , 
		success : (re) => {
			if( re == 'true' ){
				alert('주문완료'); location.href='/jspweb/ordersuccess.jsp'
				localStorage.removeItem('cheeckplist');	// 저장소 제거
			}else{ alert('주문실패\n[관리자 문의]') }
		}
		
	})
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    