alert('하루에 한번만 작성 가능한 일기장입니다.☝️ \n모두 작성한 후에는 연필을 클릭해주세요.✍️')

let date = null;
let today = null;

getToday()
function getToday(){		// 오늘 날짜 가져오는 함수
    let date = new Date();
    let year = date.getFullYear();
    let month = ("0" + (1 + date.getMonth())).slice(-2);
    let day = ("0" + date.getDate()).slice(-2);
    today = year + "-" + month + "-" + day;
    document.querySelector('.todaydate').innerText = today;
    return year + "-" + month + "-" + day;
}
function loadtoday(){
	document.querySelector('.todaydate').value = today					// 오늘 날짜 보이도록
	document.getElementById('content').value = ''						// 일기장 비워주기
	document.getElementById('content').readOnly=false;						// 글 수정 가능
	document.querySelector('.diary_img').src = "/team3/img/일기장.png"		// 다른 이미지로 보여주기
}


function load_diary(){			// [ 미완 ] - 선택한 날짜의 일기 불러오기

getToday()
	document.getElementById('content').value = '';						// 일기장 비워주기
	date = document.getElementById('date').value
	document.getElementById('date').innerText = date;
	document.querySelector('.todaydate').innerText = date
	
	$.ajax({
		url : "/team3/Diary" ,
		type : "post" ,
		data : { "date" : date } ,
		success : function(re){
			let json = JSON.parse( re )	
			if( re != 'null' ){
					if( json[0].di_date == today ){ // today 전역변수로 어떻게 설정하지?
						loadtoday();
						}else{
								document.querySelector('.todaydate').value = date					// 선택한 날짜 보이도록
								document.getElementById('content').value = '';							// 일기장 비워주기
								document.getElementById('content').value = json[0].di_content;			// 이전 내용 불러오기
								document.getElementById('content').readOnly=true;						// 글 수정 불가
								document.querySelector('.diary_img').src = "/team3/img/일기장완료.png"		// 기존 이미지로 보여주기
						}
			}else if(  re == 'null'  ){alert('일기를 쓰지 않은 날이에요')	// 만약 일기가 존재하지 않는다면 오늘로 이동
				loadtoday()	
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
				html += '<tr><td onclick="choiceemono('+json[i].emo_no+')" class=" emo_img'+i+'"><img class="emoji" src="/team3/img/'+json[i].emo_img+'"></td> <td>'+json[i].emotion+'</td></tr>'
			}
			document.querySelector('.c_emobox').innerHTML = html
		}
	})
}

function choiceemono(no){				// [ 미완 ] 감정 선택하기 - 왜 자꾸 첫번째값만 넘어오고 다른걸 눌러도 적용이 안되지?
	emo_no = no;
}

let emo_no = -1;

function writediary(){			// 다이어리 작성 함수 [ 완 ] - 근데 감정도 data로 보내게 수정해야될듯?
	let content = document.querySelector('#content').value
	
	if( emo_no == -1 ){ alert('이모티콘 선택해'); return; }
	
	$.ajax({
		url : "/team3/Diary" ,
		data : { "content" : content  , "emono" : emo_no  } ,
		success : function( re ){
			if( re == 'true' ){
				alert('다이어리 작성 완료')
			}else if( re == null ){
				alert('다이어리 내용을 입력해주세요')
			}else if( emono == undefined ){
				alert('감정을 선택한 후 눌러주세요.')		// 이걸 뜨게 하고싶다
			}else{
				alert('다이어리 작성 실패 [관리자 문의]')
			}
		}
	})
}


































