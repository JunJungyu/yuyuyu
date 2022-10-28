getactive1()
function getactive1(){
	$.ajax({
		url : "/jspweb/admin/regist" ,
		data : { "type" : 1 , "option" : "pactive1" } ,
		success : function( re ){
			let json = JSON.parse( re )
			let html = '';
			let dis_price;
			for( let i = 0 ; i < json.length ; i++ ){
				console.log(json[i].pprice.toLocaleString('ko-KR')) 
				dis_price = json[i].pprice-(json[i].pprice*json[i].pdiscount)
				
				html +=  '<div class="item">'+
							'<a href="*">'+
								'<img alt="제품이미지" src="/jspweb/admin/pimg/'+json[i].pimg+'">'+
							'</a>'+
							'<div class="item_info">'+
								'<div class="item_title">'+json[i].pname+'</div>'+
									'<div class="item_size">'+json[i].pcoment+'</div>'+
								'</div>'+
								'<div class="item_price">'+(json[i].pprice.toLocaleString('ko-KR'))+'</div>'+
									'<div>'+
										'<span class="item_sale">'+(dis_price.toLocaleString('ko-KR'))+'</span>'+
										'<span class="item_discount">'+(json[i].pdiscount)*100+'%</span>'+
									'</div>'+
									'<div class="item_review"> 찜32 리뷰수 128 </div>'+
									'<div>'+
										'<span class="badge text-bg-warning">주문폭주</span>'+
										'<span class="badge text-bg-danger">1+1</span>'+
									'</div>'+
							'</div>';
							}
		document.querySelector('.itemlist').innerHTML += html
		}
	})	
}
