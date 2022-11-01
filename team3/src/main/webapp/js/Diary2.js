alert('하루에 한번만 작성 가능한 일기장입니다.☝️ \n모두 작성한 후에는 연필을 클릭해주세요.✍️')

function load_diary(){			// [ 완 ] - 선택한 날짜의 일기 불러오기
	
	let date = document.getElementById('date').value
	document.getElementById('date').innerText = date;
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
			}else{alert('일기를 작성하지 않은 날이에요') 
				document.getElementById('content').value = '';
				document.querySelector('.diary_img').src='/team3/img/일기장.png'
			}
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



getemotiontable()
function getemotiontable(){		// [ 완 ] 감정 테이블 나타내기
	
	let html = '';
	$.ajax({
		url : "/team3/emotion" ,
		success : function(re){
			let json = JSON.parse(re)
			for( let i = 0 ; i <json.length; i++ ){
				html += '<tr><td onclick="choiceemono()" class=" emo_img'+i+'"><img class="emoji" src="/team3/img/'+json[i].emo_img+'"></td> <td>'+json[i].emotion+'</td> <input type="hidden" class="emo'+i+'no"> </tr>'
			}
			document.querySelector('.c_emobox').innerHTML = html

		}
	})
}

function choiceemono(){				// [ 완 ] 감정 선택하기
	let html = '';
	$.ajax({
		url : "/team3/emotion" ,
		success : function(re){
			let json = JSON.parse(re)
			for( let i = 0 ; i <json.length; i++ ){
				html += '<input class="emono" value="'+json[i].emo_no+'" type="hidden">'
				document.querySelector('.emo'+i+'no').innerHTML = html
			}
		}
	})
}

function writediary(){			// 다이어리 작성 함수 [ 완 ] - 근데 감정도 data로 보내게 수정해야될듯?
	let content = document.querySelector('#content').value
	let emono = document.querySelector('.emono').value

	$.ajax({
		url : "/team3/Diary" ,
		data : { "content" : content  , "emono" : emono } ,
		success : function( re ){
			if( re == 'true' ){
				alert('다이어리 작성 완료')
			}else if( re == null ){
				alert('다이어리 내용을 입력해주세요')
			}else if( emono == 0 ){
				alert('감정을 선택한 후 눌러주세요.')
			}else{
				alert('다이어리 작성 실패 [관리자 문의]')
			}
		}
	})
}