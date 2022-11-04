/*
document.querySelector('tag명')
document.querySelector('#id명')
document.querySelector('.class명') 
여러개 [배열] - document.querySelectorAll('tag명')
-- 속성

	js 반복문
		1. for ( let i = 0; 배열명/lemgth; i++ )
			i : 반복변수[ 인덱스용 ]
		
		2. 배열명.forEach( 함수( i ) ) 	// 함수에 i를 넣으면서 함수가 계속 돈다
		2. 배열명.foeEach( 함수( value , index ) ) 가능
		2. 배열명.forEach( ( value , index , array ) => { } )
			value : 배열내 데이터 반복변수
			index : 인덱스
			array : 배열
			
		3. for( value of 배열명 ){ }
			// 배열에서 순서대로 데이터 반복변수에 대입
			
		4. for( index in 배열명 ){ }
			// 배열에서 순서대로 인덱스 반복변수에 대입
	
	// 1. 배열[객체]에 객체 추가
	배열[객체].push( 객체 )
		
	// 2. 배열에 객체 삭제
	배열.splice( 인덱스 , 1 )
*/


// 공통변수 // 전역변수 [ 여러 함수에서 공유해서 사용하기 위한 목적 ]
let stock = null				 // 재고목록
let shtml = null; 				 // 제품 
let product = null;				 // 선택된 색상
let productlist = []; 			 // 선택된 제품옵션 [색상,사이즈,개수] 리스트/목록 선언
let psale = 0;					 // 실제 할인율이 들어간 판매가

// 1. 현재 페이지 내 제품번호[ a href="링크?pno=제품번호" ]를 가지고 와서 ajax로 해당 제품번호의 모든 제품정보를 가져오자
let pno = document.querySelector('.pno').value
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////// 이벤트 /////////////////////////////////////////////////
// **색상 select 박스를 체인지 했을때 이벤트
document.querySelector('.cselect').addEventListener( 'change' , (e)=>{
	color = e.currentTarget.value				// 이벤트를 발생한 객체[cselect]의 담겨져 있는 값
	// 8. 선택된 색상의 사이즈 selct 구성	
	let shtml = '<option>[필수] 사이즈 선택</option>'
	stock.forEach( s => {
		if( s.pcolor == color ){					// 재고목록중 
			shtml += '<option value='+s.psize+'>'+s.psize+'</option>'
		}
	})
	document.querySelector('.sselect').innerHTML = shtml
} )

// 사이즈 select 박스를 change 했을때 이벤트
document.querySelector('.sselect').addEventListener( 'change' , (e) => {
	let size = e.currentTarget.value
	
	// 1. 사이즈 선택시 안내문구 클릭하면 함수 종료
	if( size == '[필수] 사이즈 선택' ){ return; }
	
	// 2. 이미 존재한 옵션을 클릭했을때 해당 옵션의 수량 재고만 1증가한다.
	for( p of productlist ){
		if( p.pcolor == color && 
			p.psize == size ){
			p.amount++;	
			alert("중복! 현재 선택한 수량 :"+p.amount)	// 엥? 값은 제대로 들어옴.. 
			print();
			return;	
		}	
	}
	
	// 선택된 제품정보와 옵션을 리스트에 객체로 담는다.
	let sproduct = {
		pcolor : color ,	// 색상
		psize : size ,		// 사이즈
		amount : 1			// 수량	있는데 왜이러지??
	}
	// 리스트에 담는다.
	productlist.push( sproduct ) // 리스트에 담는다.
	// 리스트에 존재하는 객체를 출력한다.
	print()
} )

let btnlike = document.querySelector('.btnlike');
document.querySelector('.btnlike').addEventListener( 'click' , (e)=>{
	// 1. 로그인 유무 판단 [ 1. ajax 통신해서 세션 유무 확인한다. 2. jsp에서 가져온다. ]
	let mid = document.querySelector('.mid').value
	if( mid == 'null' ){
		alert('로그인후 이용가능한 기능입니다.')
		return;
	}
	// 2. 찜하기 등록 혹은 취소 처리
	$.ajax({
		url : "/jspweb/product/plike" ,
		type : "post" ,
		data : { "pno" : pno } ,
		success : function(re){
			if( re == "1" ){
				alert('찜하기 취소')
				btnlike.innerHTML = '찜하기 ♡'
			}else if( re == "2" ){
				alert('찜하기 성공♥')
				btnlike.innerHTML = '찜하기 ♥'
			}else{
				alert('db오류 [ 관리자 문의 ]')
			}
		}
	})
} )

// 장바구니 버튼을 눌렀을 때
document.querySelector('.btncart').addEventListener('click' , (e)=>{
	
	// 1. 만약에 선택한 제품이 없으면
	if( productlist.length == 0 ){alert('최소 1개 이상 옵션을 선택해주세요'); return; }
	// 2. 로그인 유무
	if( document.querySelector('.mid').value == 'null' ){alert('로그인 먼저 해주세요'); return;}

	$.ajax({ // 전송타입은 문자열객체 형식 // 첨부파일
		url : "/jspweb/product/cart" ,
		type : "post" ,
		data : { "data" : JSON.stringify(productlist) , "pno" : pno } ,
		//JSON.stringify(제이슨) - 제이슨을 문자열로 변환 객체 타입 -> 문자열 타입
		success : re => {
			
			if( re == 'true' ){
				
				if(confirm('장바구니에 담았습니다. 장바구니 페이지로 이동할까요?')){
					location.href='/jspweb/admin/cart.jsp';
				}
			}else{
				alert('장바구니 담기 실패 [관리자 문의]')
			}
		}
	})
})



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// js 열람시 최초로 함수 1번 실행 

getproduct( pno ) 	// 제품 정보 호출 [ pno ]
getstock( pno )		// 제품 재고 호출 [ pno ]
sethtmlprint()		// *위 메소드 안에 있는 ajax가 모두 실행된 후에 print 실행

// 1. 해당 제품 번호의 제품정보 호출
function getproduct( pno ){
$.ajax({				// 결과와 상관없이 다음코드가 진행 [ async : true 결과를 대기X VS async : false 결과를 대기O ]
	url : "/jspweb/admin/regist" ,
	type : "get" ,
	async : false ,	// 결과가 있을때까지 대기상태 / 스레드에 웨이팅이 생김?
	data : { "pno" : pno , "type" : 2 } ,
	success : re => {
		product = JSON.parse( re ); }
	})
}		
	
// 2. 해당 제품의 전보를 HTML 대입 메소드
function sethtmlprint(){
	document.querySelector('.pimg').src='/jspweb/admin/pimg/'+product.pimg// 1. 제품사진 대입
	document.querySelector('.pname').innerHTML = product.pname			  // 2. 제품명 대입
	document.querySelector('.pcomment').innerHTML = product.pcoment       // 3. 제품설명 대입 과연 내가 여기서 m을 하나했을까 두개 했을까
	let phtml = ''														  // 4. 가격 대입 
	if( product.pdiscount == 0 ){	// 2. 할인이 없을 때
		
		psale = product.pprice
		phtml += '<span class="psale">'+psale.toLocaleString()+'원</span>	'
	}else{						// 1. 할인이 있을 때
		psale = product.pprice - ( product.pprice*product.pdiscount )
		phtml = '<span class="pdiscount">'+ Math.round( product.pdiscount * 100 )+'%</span>'+
				'<span class="pprice">'+( product.pprice.toLocaleString() )+'원</span>'+
				'<span class="psale">'+ psale.toLocaleString() +'원</span>'	
	}
	document.querySelector('.pricebox').innerHTML = phtml
		
		let sizelist = [ ]						// 1. 중복이 있는 사이즈 배열 선언
		stock.forEach( s => {  sizelist.push( s.psize ) })	// 2.리스트에 담기 
		let sizeset = new Set( sizelist ) 		// 2. 사이즈 리스트 => set 목록 변경 [중복제거]
			console.log( sizeset ) 				// 3. 확인
		
			// 중복이 없는 사이즈목록 html 구성
		let shtml = '<span> [ '
		sizeset.forEach( s => { 
			shtml += " " + s +" "
		})
		shtml += ' ] </span>'
		
		document.querySelector('.sizebox').innerHTML = shtml
		
		// 7. 색상 select 구성  // 색상 목록 중복제거	[ set , includes , filter 등 ]
		let colorlist = []
		stock.forEach( s => {  colorlist.push( s.pcolor ) })
		let colorset = new Set( colorlist )
			console.log( colorset )			// 3. 확인
		
		let chtml = '<option>-[필수] 색상 선택</option>'
		colorset.forEach( c => { 
			chtml += '<option value='+c+'>'+c+'</option>'
		})
		document.querySelector('.cselect').innerHTML = chtml
}
		
// 3. 재고 가져오는 함수 메소	
function getstock( pno ){ // 5. 현재 제품의 재고목록 호출 [ ajax ]
	$.ajax({
		url : "/jspweb/admin/stock" ,
		type : "get" , 
		async : false , 
		data : { "pno" : pno },
		success : (re) => { stock = JSON.parse( re ) }
	});
}

// 4. 선택된 제품옵션 리스트를 출력하는 함수 [ 1. 사이즈를 선택 했을때 2. 옵션 제거했을때 마다 실행 ]
function print(){
	let ohtml = '<tr>'+
                    '<th width="55%"> 상품명/옵션 </th>'+
                    '<th width="30%">수량</th>'+
                    '<th width="15%">가격</th>'+
                 '</tr>';
	
	let totalprice = 0;
	let totalamount = 0;
	
	productlist.forEach( ( p , i )=> {	
		let tsale = psale*p.amount	// 왜?! 서블릿에도 없고 어디서 가져오는거지?
		let tpoint = Math.round(tsale*0.01) 	// 할인이 적용된 가격의 포인트
	
		totalprice += tsale;
		totalamount += p.amount;
	
		ohtml +=  '<tr>'+
                                 '<td>'+
                                 '	<span>'+product.pname+'</span><br>'+
                                 '	<span>'+p.pcolor+' / '+p.psize+'</span>'+
                                 '</td>'+
                                 '<td>'+
                                 '	<div class="row g-0">'+
                                 '		<div class="col-md-4">'+
                                 '			<input readonly value="'+p.amount+'" class="form-control">'+
                                 '		</div>'+
                                 '		<div class="col-md-4">'+
                                 '			<button class="amount_btn" onclick="amountup('+i+')">▲</button>'+
                                 '			<button class="amount_btn" onclick="amountdown('+i+')">▼</button>'+
                                 '		</div>'+
                                 '		<div class="col-md-1">'+
                                 '			<button onclick="pcancle('+i+')" class="cancel_btn">X</button>'+
                                 '		</div>'+
                                 '	</div>'+
                                 '</td>'+
                                 '<td>'+
                                 '	<span>'+tsale.toLocaleString()+'원</span><br>'+
                                 '	<span class="pointbox"> (포인트)'+tpoint.toLocaleString()+'</span>'+
                                 '</td>'+
					'</tr>';
	})	// 반복문이 끝났을때	
	document.querySelector('.select_t').innerHTML = ohtml
	
	let thtml = totalprice.toLocaleString()+"원 ( "+totalamount+"개)";
	document.querySelector(".totalprice").innerHTML = thtml;
}

// 5. 수량 증가 버튼을 눌렀을때	[ 현재 옵션의 재고 ]
function amountup( i ){
	// 선택한 옵션의 재고 찾기
	let maxstock = 0;
	stock.forEach( s => {
		if( s.pcolor == productlist[i].pcolor &&
			s.psize == productlist[i].psize ){	// 재고목록에서 선택한 옵션과 일치하면
			maxstock = s.pstock					// 재고 대입
		}
	})
	if( productlist[i].amount >= maxstock ){
		alert('재고가 부족합니다')
		return;
	}
	productlist[i].amount++; print()
}

// 6. 수량 감소 버튼을 눌렀을때
function amountdown( i ){
	if( productlist[i].amount <= 1 ){
		alert('최소 구매 수량입니다')
		return;
	}
	productlist[i].amount--; print()
}

// 7. 선택된 제품 제거
function pcancle(){
	// 선택된 제품리스트에서 i번째부터 1개를 인덱스제거
	productlist.splice( i , 1 ); print();
}



























































