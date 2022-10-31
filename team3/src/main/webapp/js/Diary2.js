function 버튼클릭(){				// [ 미완 ]
	alert("감정선택")
	let 꾸미기 = '';
	꾸미기 += '<img id="day21" src="/team3/img/사랑.png" style="z-index: 2; width: 40px">';
	document.getElementById('day21').innerHTML += 꾸미기;
	// 왜 안될까??? console보면 변경은 되는데? 왜? 안
	// 해당 날짜로 가게 연결... 그리고 감정마다 만들기 번거로우니 이름을 숫자로 맞춰서 반복문을 하던 매개변수를 하던 바꾸기~
}

function writediary(){			// 다이어리 작성 함수 [ 완 ]
	
	let content = document.querySelector('.content').value
	$.ajax({
		url : "/team3/Diary" ,
		data : { "content" : content } ,
		success : function( re ){
			if( re == 'true' ){
				alert('다이어리 작성 완료')
			}else{ alert('다이어리 작성 실패 [ 관리자 문의 ]') }
			
		}
	})
}

calendar_day()
function calendar_day(){
	let html = '';
	for( let i = 0; i<31; i++ ){
		if( i % 7 == 0 ){
			html += '<br>'	
		}
		html += '<img src="/team3/img/패닉.png" style="width: 40px" id="day'+i+'" style="border-radius: 50%; width: 10px; height: 10px; background-color: #eeeeee;"></img>';
	}
	document.querySelector('.calendar_day').innerHTML = html
}

let year = date.getFullYear;
alert( year )

function loaddiary(){
	$.ajax({
		url : "" ,
		success : function( re ){
			alert( re )
		}
	})
}
