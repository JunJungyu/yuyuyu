/*
document.querySelector('tag명')
document.querySelector('#id명')
document.querySelector('.class명') 
여러개 [배열] - document.querySelectorAll('tag명')
-- 속성

*/
// 1. 현재 페이지 내 제품번호[ a href="링크?pno=제품번호" ]를 가지고 와서 ajax로 해당 제품번호의 모든 제품정보를 가져오자


let stock = null;
let shtml = null;
let pno = document.querySelector('.pno').value

$.ajax({
	url : "/jspweb/admin/regist" ,
	type : "get" ,
	data : { "pno" : pno , "type" : 2 } ,
	success : re => {
		let product = JSON.parse( re )
		
		console.log( product )
		
		// 1. 제품사진 대입
		document.querySelector('.pimg').src='/jspweb/admin/pimg/'+product.pimg
		// 2. 제품명 대입
		document.querySelector('.pname').innerHTML = product.pname
		// 3. 세품설명 대입
		document.querySelector('.pcomment').innerHTML = product.pcoment
		// 4. 가격 대입 
			let phtml = ''
			if( product.pdiscount == 0 ){	// 2. 할인이 없을 때
				phtml += '<span class="psale">'+product.pprice.toLocaleString()+'원</span>	'
			}else{						// 1. 할인이 있을 때
				phtml = '<span class="pdiscount">'+Math.round(product.pdiscount * 100 )+'%</span>'+
						'<span class="pprice">'+(product.pprice.toLocaleString())+'원</span>'+
						'<span class="psale">'+(product.pprice-(product.pprice*product.pdiscount)).toLocaleString()+'원</span>'	
			}
			document.querySelector('.pricebox').innerHTML = phtml
			
			// 5. 해당 제품의 재고목록 호출
			$.ajax({
				url : "/jspweb/admin/stock" ,
				type : "get" ,
				data : { "pno" : pno } ,
				success : (re) => {  
				stock = JSON.parse(re)
				console.log( stock )		// 재고 목록
				
				// java set VS js set [ 컬렉션 : 수집 // 프레임워크 : 미리 만들어진 클래스 ]
					// 사이즈 목록 중복제거
						// 1. 사이즈 목록
					let sizelist = [ ]						// 1. 중복이 있는 사이즈 배열 선언
					stock.forEach( s =>{					// 2. 리스트에 담기
						sizelist.push( s.psize ) })			
							// 2. 사이즈목록 중복재거
						let sizeset = new Set( sizelist )
							// 3. 확인
						console.log( sizeset )
				
					// 6. 사이즈 종류
					shtml = '<span>  [';
					stock.forEach( s => {
						shtml += "  "+s.psize+"  "	
					})
					shtml += ']  </span>'

					document.querySelector('.sizebox').innerHTML = shtml	
					
					// 7. 색상 select 구성
					// 색상 목록 중복제거
						// 1. 색상 목록
					let colorlist = [ ]
					stock.forEach( s =>{
						colorlist.push( s.pcolor ) })
							// 2. 색상목록 중복재거
						let colorset = new Set( colorlist )
							// 3. 확인
						console.log( colorset )
						
						let chtml = '<option>[필수] 색상선택</option>';
						colorset.forEach( c => {
							chtml += '<option value="'+c+'">'+c+'</option>'
						})
						
					document.querySelector('.cselect').innerHTML = chtml
					
												
				
				}
			})
	}
})

let color = null;			// 선택된 색상
let sproductlist = [];		// 선택된 제품 옵션[색상,사이즈,개수] 리스트 선언
document.querySelector('.cselect').addEventListener( 'change' , (e)=>{
	color = e.currentTarget.value				// 이벤트를 발생한 객체[cselect]의 담겨져 있는 값
	// 8. 선택된 색상의 사이즈 selct 구성	
	let shtml = '<option> [필수] 사이즈 선택</option>'
	stock.forEach( s => {
		if( s.pcolor == color ){					// 재고목록중 
			shtml += '<option value='+s.psize+'>'+s.psize+'</option>'
		}
	})
	document.querySelector('.sselect').innerHTML = shtml
} )

// 사이즈 select 박스를 change
document.querySelector('.sselect').addEventListener( 'change' , (e) => {
	let size = e.currentTarget.value
	// 선택된 제품정보와 옵션을 리스트에 객체로 담는다.
	let sproduct = {
		pcolor : color ,	// 색상
		psize : size ,		// 사이즈
		amount : 1			// 수량
	}
	// 리스트에 담는다.
	sproductlist.push( sproduct )
	console.log( sproductlist + "웅" )
	sproductlist.push( sproduct ) // 리스트에 담는다.
	// 리스트에 존재하는 객체를 출력한다.
	print()
} )

// 2. 선택된 제품옵션 리스트를 출력하는 함수 [ 1. 사이즈를 선택 했을때 2. 옵션 제거했을 때 마다 실행 ]
function print(){
	let ohtml = '<tr>'+
                    '<th width="55%"> 상품명/옵션 </th>'+
                    '<th width="30%">수량</th>'+
                    '<th width="15%">가격</th>'+
                 '</tr>';
                 
	sproductlist.forEach( p => {
		ohtml +=  '<tr>'+
                                 '<td>'+
                                 '	<span> 제품명 </span><br>'+
                                 '	<span> - 골드 / 9호</span>'+
                                 '</td>'+
                                 '<td>'+
                                 '	<div class="row g-0">'+
                                 '		<div class="col-md-5">'+
                                 '			<input value="1" class="form-control">'+
                                 '		</div>'+
                                 '		<div class="col-md-4">'+
                                 '			<button class="amount_btn">▲</button>'+
                                 '			<button class="amount_btn">▼</button>'+
                                 '		</div>'+
                                 '		<div class="col-md-1">'+
                                 '			<button class="cancel_btn">X</button>'+
                                 '		</div>'+
                                 '	</div>'+
                                 '</td>'+
                                 '<td>'+
                                 '	<span> 20,000원 </span><br>'+
                                 '	<span class="pointbox"> (포인트)2000 </span>'+
                                 '</td>'+
					'</tr>';
	})
	document.querySelector('.select_t').innerHTML = ohtml
}































































