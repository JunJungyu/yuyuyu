getproduct()
function getproduct(){
	$.ajax({
		url : "/jspweb/admin/regist" ,
		data : { "type" : 1 } ,			// type이 1이면 모든 제품 호출
		type : "get" ,
		success : function( re ){
			
			let html = '<tr>'+
							'<th>이미지</th><th>번호</th><th>카테고리</th><th>상품명</th><th>제품가격</th>'+
							'<th>할인율</th><th>판매가</th><th>판매상태</th><th>날짜</th><th>비고</th>'+
					  '</tr>';
			let json = JSON.parse( re )
						
			for( let i = 0; i<json.length ; i++ ){
				 
				 html += '<tr>'+ // 여기서 이미지 경로는 내 이클립스 파일이 아니라 깃 경로임 / 서버가 아니라 내 개인컴
							'<td><img width="100%" src="/jspweb/admin/pimg/'+json[i].pimg+'"></td><td>'+json[i].pno+'</td><td>'+json[i].pcno+'</td><td>'+json[i].pname+'</td><td>'+json[i].pprice+'</td>'+
							'<td>'+json[i].pdiscount+'</td><td>'+(json[i].pprice-(json[i].pdiscount*json[i].pprice) )+'</td><td>'+json[i].pactive+'</td><td>'+json[i].pdate+'</td>'+
					     '<td>'+
					     	'<button onclick="updatemodal('+json[i].pno+')" type="button">수정</button>'+
					     	'<button onclick="deleteproduct('+json[i].pno+')" type="button">삭제</button>'+
					     '</td></tr>';
			}
			document.querySelector('table').innerHTML = html;
		}
	})
}

	// 2. 수정 메소드
	
	// 3. 삭제 메소드
	function deleteproduct( pno ){
		alert( pno + "선택" )
		if(confirm("삭제하시겠습니까?")){ // 확인 버튼을 눌렀을때
			$.ajax({
				url : "/jspweb/admin/regist" ,
				data : { "pno" : pno } ,	// 톰캣 서버의 기본설정값은 get , post 형식만 객체[ body ] 전송
				type : "delete" ,			// 해당 서블릿 주소의  delete메소드와 통신
				success : function( re ){	
					if( re === 'true' ){
						alert('삭제성공');
						pagechange('list.jsp');	// 그냥 리로드하면 대시보드가 리로드됨
		/*
			pagechange() 호출이 가능하다 대시보드jsp에 대시보드js가 포함되어 있기 때문에
			대시보드.jsp에 리스트.jsp가 포함되어 있으니
			
		*/
					}else{ alert("삭제 실패") }
				}
			})
			
		}
	}
	
	function updatemodal( pno ){
		// 1. 해당 모달을 알려주는 버튼에 강제클릭 실행
		document.querySelector(".updatwmodalbtn").click()	// 해당 클래스를 강제클릭하게 만듬 
		
		// 2. 해당 모달에 기존 내용물 넣기
			// 2-1 : 해당 pno의 제품정보 호출
		$.ajax({
			url : "/jspweb/admin/regist" ,
			data : { "type" : 2  , "pno" : pno } ,			// 타입이 2면 개별호출
			type : "get" ,
			success : function( re ){
				let json = JSON.parse( re )
				
				document.querySelector('.pno').value = json.pno;
				document.querySelector('.pname').value = json.pname;
				document.querySelector('.pcomment').value = json.pcoment;
				document.querySelector('.pprice').value = json.pprice;
				document.querySelector('.pdiscount').value = json.pdiscount;
				
			}
		})
	}
	
	// 2-2 수정 처리 메소드
	function updateproduct( ){ // 매개변수에 pmo를 안넣었는데 어떻게 구별되지??
		// 1. 수정할 정보
		let form = document.querySelector('.updateform')
		let formdata = new FormData( form )
			// formdata 속성 추가
			 	//formdata.set( '속성명' : 데이터 )
				//formdata.set( 'pno' : pno ) 도 가능
		// 2. 수정할 대상

		$.ajax({
			url : "/jspweb/admin/regist" ,
			type : "put" ,
			data : formdata ,
			processData : false , 
			contentType : false , 
			success : function( re ){
				alert( re )
				if( re == 'true' ){
					alert("수정완료")
					document.querySelector('.modalclosebtn').click()	// 닫기 버튼 자동 선택
					pagechange('list.jsp');								// 새로고침
				}else{
					alert("수정실패")
					document.querySelector('.modalclosebtn').click()	// 닫기 버튼 자동 선택
					pagechange('list.jsp');								// 새로고침
				}
			}
		})
	}
	
	
	
	
	
	
getpcategory()
function getpcategory(){
	
	$.ajax({
		url : "/jspweb/admin/pcategory" ,
		type : "get" ,
		success : function(re){
			let json = JSON.parse( re )
			let html = ''
			for( let i = 0; i<json.length; i++ ){
				let category = json[i];
				html += '<input type="radio" name="pcno" value='+category.pcno+'>'+category.pcname;
			}
			
			document.querySelector('.pcategorybox').innerHTML = html;
		}
	})
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	