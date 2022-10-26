
getproduct()
function getproduct(){
	$.ajax({
		url : "/jspweb/admin/regist" ,
		type : "get" ,
		success : function( re ){
			console.log( re )
			let json = JSON.parse( re )
			let img = '/jspweb.admin/pimg/'+json[0].pimg
			let html = '<img src="'+img+'">'
			document.querySelector('table').innerHTML = html;
		}
	})
}