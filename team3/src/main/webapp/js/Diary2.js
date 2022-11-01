alert('하루에 한번만 작성 가능한 일기장입니다.☝️ \n모두 작성한 후에는 연필을 클릭해주세요.✍️')

function writediary(){			// 다이어리 작성 함수 [ 완 ] - 근데 감정도 data로 보내게 수정해야될듯?
	let content = document.querySelector('#content').value
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

function load_diary(){			// [ 완 ] - 선택한 날짜의 일기 불러오기
	
	let date = document.getElementById('date').value
	document.querySelector('.todaydate').innerText = date
	
	$.ajax({
		url : "/team3/Diary" ,
		type : "post" ,
		data : { "date" : date } ,
		success : function(re){
			if( re != 'null' ){
				let html = re ;
				document.getElementById('content').value = html	
				document.querySelector('.diary_img').src='/team3/img/일기장임시배경.jpg'
			}else{alert('일기를 작성하지 않은 날이에요')}
		}
	})
}

//calendar_day()
function calendar_day(){				// [ 미완 ] - 어차피 이 방법으론 안쓸듯
	let html = '';
	for( let i = 0; i<31; i++ ){
		if( i % 7 == 0 ){
			html += '<br>'	
		}
		html += '<img src="/team3/img/패닉.png" style="width: 40px" id="day'+i+'" style="border-radius: 50%; width: 10px; height: 10px; background-color: #eeeeee;"></img>';
	}
	document.querySelector('.calendar_day').innerHTML = html
}

function 버튼클릭(){				// [ 미완 ] - 어차피 이 방법으론 안쓸듯
	// document.getElementById('day21').src='/team3/img/사랑.png'
		let html = '';
	$.ajax({
		url : "/team3/emotion" ,
		success : function(re){
			let json = JSON.parse(re)
			alert(json.emono) // 이제 이걸 글스기 메소드에 넣고 그걸 또 수정해주고.. 이거 선택 안하면 일기 못쓰게하기..
		}
})
}

감정테이블만들기()
function 감정테이블만들기(){		// [ 미완 ] - dao에서 한번만 돌아서 다 안가져옴
	
	let html = '';
	$.ajax({
		url : "/team3/emotion" ,
		success : function(re){
			alert(re)
			let json = JSON.parse(re)
			alert( json )
			//for( let i = 0 ; i <json.length; i++ ){
			//	html += '<tr> <td onclick="버튼클릭()" class="emo_img'+i+'"><img src="/team3/img/'+json[i].emoimg+'" style="width: 40px"></td> <td>'+json[i].emotion+'</td> </tr>'
			//}
				
			//document.querySelector('.c_emobox').innerHTML = html
		}
	})
	alert('왜안 됑')
}

 function updateemotion(){
	alert('수정버튼클릭')
}
