
//선언/전역변수로 쓰기 위해////////////////////////////////////
let datalist = null;									
//함수호출/////////////////////////////////////////////////
getdata()
//공공데이터 api 호출///////////////////////////////////////
// 1. 공공데이터 호출 함수
function getdata(){
	$.ajax({
		url : "/jspweb/board/api" , 
		success: function( re ){
			let json = JSON.parse(re)										 
			datalist = json.data 							// datalist : 객체중에 data 속성[키,필드] 호출 // 약국 리스트 여기서 대입해주고														
			dataprint()										// 검색이 없을 때 모든 약국 호출 json.data 약국 리스트
		}
	})
}

// 2. 검색 버튼을 눌렀을때 함수
function addrsearch(){
	let addr = document.querySelector('.addrinput').value
	dataprint( addr )										// 검색이 있을 경우 검색어 전달 [ search : addr ]
}

// 3. html에 약국리스트 출력 함수
function dataprint( search ){								// 검색이 있을경우 검색어 전달

	console.log( "타입 확인 : "+typeof(search) )
		// undefined vs "undefined"							// null , "null"
	if( search !== undefined ){								// 검색이 있을 경우
		let searchlist = []									// [검색된]약국리스트 선언
		for( let i = 0 ; i<datalist.length ; i++ ){
			let addr = datalist[i].주소
			if( addr.indexOf(search) !== -1 ){				// 입력한 검색어가 포함되어 있으면
				searchlist.push( datalist[i] )				// 리스트 추가
			}
		}
		datalist = searchlist;								// 약국리스크를 [검색된] 약국리스트 대입
		if( search === '' ){ getdata(); }					// 아무것도 입력하지 않으면 
	}
	
	
	
	let html = '<tr> <th> 약국명 </th> <th> 전화번호 </th> <th> 주소 </th> </tr>';
	
	for( let i = 0 ; i<datalist.length ; i++){		// 약국 하나씩 호출 
		let data = datalist[i]						// i번째 약국 임시 변수 
		html += '<tr onclick="mapview('+i+')">'+	// 해당 행 클릭 시 map 메소드 실행 [ 클릭한 인덱스 매개변수 전달 ]
					'<td>'+data.약국명+'</td><td>'+data.대표전화+'</td><td>'+data.주소+'</td>'+
				'<tr>';
	} // for end 
	document.querySelector('.table').innerHTML = html	
}

////////////////////////////////////////
getdata2();													// 조건없이 실행할거니까 호출해줌
function getdata2(){
	
	$.ajax({
		url : "/jspweb/api2" ,
		success : function( re ){
			let json = JSON.parse( re )						// 깨지지않게 바꿔주고?? 근데 re 그대로 호출해도 안깨지던데.. 과연 내가 이헤한게 맞는지?
			let html = ''; 									// html 담을거 미리 선언해주고
		 	html = '<tr>'+									// 넣어줌 여기서 선언해도 상관없음
							'<th>시군구</th>'+
							 '<th>번지 / 본번 / 부번</th>'+
							 '<th>단지명</th>'+
							 '<th>전용면적</th>'+
							 '<th>계약년월</th>'+
							 '<th>계약일</th>'+
							 '<th>거래금액(만원)</th>'+
							 '<th>층</th>'+
							 '<th>건축년도</th>'+
							 '<th>도로명</th>'+
							 '<th>해제사유발생일</th>'+
							 '<th>거래유형</th>'+
							 '<th>중개사소재지</th>'+
						'</tr>';
				for( let i = 0 ; i<json.length ; i++){		// 하나하나 넣어줄거니까 for문 사용			
					html += '<tr>'+	
								'<td>'+json[i].시군구+'</td><td>'+json[i].번지본번부번+'</td>'+													// Dao랑 이름 맞춰여됨~~
								'<td>'+json[i].단지명+'</td><td>'+json[i].전용면적+'</td><td>'+json[i].계약년월+'</td><td>'+json[i].계약일+'</td>'+
								'<td>'+json[i].거래금액+'</td>'+'<td>'+json[i].층+'</td><td>'+json[i].건축년도+'</td><td>'+json[i].도로명+'</td>'+
								'<td>'+json[i].해제사유발생일+'</td><td>'+json[i].거래유형+'</td><td>'+json[i].중개사소재지+'</td>'+
							'</tr>';
				} // for end 
				document.querySelector('.table2').innerHTML += html	
			 }
	})
}


////////////////////////////////////////

// 주소-좌표 변환 객체를 생성합니다
var geocoder = new kakao.maps.services.Geocoder();		// 주소를 객체로 변환해주는 객체

function mapview( i ){
	
	/* 카카오 지도 API */
	
	// 2. 지도 옵션 
	var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
	    mapOption = { 
	        center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
	        level: 3 // 지도의 확대 레벨 [ 1[확대] ~ 14[축소] ]
	    };
	
	// 3. 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
	var map = new kakao.maps.Map(mapContainer, mapOption); 
	
	// 주소로 좌표를 검색합니다.	( ↓클릭한 i번째의 약국의 주소 )
	geocoder.addressSearch( datalist[i].주소 , function(result, status) {
	    // 정상적으로 검색이 완료됐으면 
	     if (status === kakao.maps.services.Status.OK) {
			// 주소로 검색된 좌표 생성 객체
	        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);

		    // 결과값으로 받은 위치를 마커로 표시합니다
	        var marker = new kakao.maps.Marker({
	            map: map,
	            position: coords});
	            
	        // 마커에 클릭이벤트를 등록합니다
				kakao.maps.event.addListener(marker, 'click', function() {
					detailview( i )
				});
	            
	        
	        // 인포윈도우로 장소에 대한 설명을 표시합니다
	        var infowindow = new kakao.maps.InfoWindow({
	            content: '<div style="width:150px;text-align:center;padding:6px 0;">'+datalist[i].약국명+'</div>'});
	        
	        infowindow.open(map, marker);
	        
	        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
        	map.setCenter(coords);
		}
	})
}

function detailview( i ){
	let html = '<div>'+datalist[i].약국명+'</div>'+
			'<div>'+datalist[i].주소+'</div>'+
			'<div>'+datalist[i].대표전화+'</div>'+
			'<div><button>평점주기</button></div>'+
			'<div><button>문의하기</button></div>';
	document.querySelector('.datailbox').innerHTML = html;
}

