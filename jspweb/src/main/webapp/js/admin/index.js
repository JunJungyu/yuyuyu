getactive1()
function getactive1(){
	alert("getactive1 실행됨")
	$.ajax({
		url : "/jspweb/admin/regist" ,
		data : { "type" : 1 , "option" : "pactine1" } ,
		success : function( re ){
			let json = JSON.parse( re )
			console.log( typeof json )
			let html = '';
			let count = 0;
			for( let i = 0 ; i < 5 ; i++ ){
				html +=  '<div class="item">	'+
							'<a href="*">'+
								'<img alt="제품이미지" src="/jspweb/admin/pimg/pro_img_1.jpg">'+
							'</a>'+
							'<div class="item_info">'+
								'<div class="item_title">제품이름</div>'+
									'<div class="item_size"> 배송비 무료 </div>'+
								'</div>'+
								'<div class="item_price"> 200,000원 </div>'+
									'<div>'+
										'<span class="item_sale"> 20,000원 </span>'+
										'<span class="item_discount"> 90% </span>'+
									'</div>'+
									'<div class="item_review"> 찜32 리뷰수 128 </div>'+
									'<div>								'+
										'<span class="badge text-bg-warning">주문폭주</span>'+
										'<span class="badge text-bg-danger">1+1</span>'+
									'</div>'+
							'</div>';
							count++;
							}
		
		document.querySelector('.itemlist').innerHTML += html
		console.log( html )
		console.log( count )
		}
	})	
}
