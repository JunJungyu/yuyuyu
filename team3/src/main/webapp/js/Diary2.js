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
					if( json[0].di_date == today ){
						if(confirm("오늘은 이미 작성한 일기가 있어요\n수정할까요?")){ // 왜 적용이 안될까?
							document.getElementById('content').value = json[0].di_content;			// 이전 내용 불러오기
							document.getElementById('content').readOnly=false;						// 글 수정 가능
							document.querySelector('.diary_img').src = "/team3/img/일기장.png"		// 다른 이미지로 보여주기
							
							// 아~ 이미 날짜를 선택해서 오늘 일기를 못불러오는구나 맞나? 왜??
						}else{
							alert('아니요') // 오늘 일기 열람만 가능
								document.getElementById('content').value = json[0].di_content;			// 이전 내용 불러오기
								document.getElementById('content').readOnly=true;						// 글 수정 불가
								document.querySelector('.diary_img').src = "/team3/img/일기장완료.png"		// 완료 이미지로 보여주기
						}
						
						
						
						loadtoday();
						}else{
								document.querySelector('.todaydate').value = date						// 선택한 날짜 보이도록
								document.getElementById('content').value = '';							// 일기장 비워주기
								document.getElementById('content').value = json[0].di_content;			// 이전 내용 불러오기
								document.getElementById('content').readOnly=true;						// 글 수정 불가
								document.querySelector('.diary_img').src = "/team3/img/일기장완료.png"		// 완료 이미지로 보여주기
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
				html += '<tr onmouseover="hovercss('+i+')"><td onclick="choiceemono('+json[i].emo_no+'); emojiclick('+i+');" class="emo_img'+i+'"><img class="emoji emoji'+json[i].emo_no+'" src="/team3/img/'+json[i].emo_img+'"></td> <td><input ondblclick="updateemotion('+i+')" class="emotioninput" readonly type="text" value="'+json[i].emotion+'"></td></tr>'
			}
			document.querySelector('.c_emobox').innerHTML = html
		}
	})
	
	
}

function choiceemono(no){				// [ 미완 ] 
	emo_no = no;
	let emo = sessionStorage.setItem("emono" , no );	// 선택한 감정의 db 번호를 가져옴
}

let emo_no = -1;

function emojiclick(no){
	emo = sessionStorage.getItem("emono")
	for(let i = 1; i<6; i++){
		document.querySelector('.emoji'+i+'').style.transform="scale(1.0)";
		if( emo == no ){						// 만약 가져온 번호가 일치하면 ( 클릭한 번호에 )
		document.querySelector('.emoji'+no+'').style.transform="scale(1.2)";	// 왜 이건 for문에만 넣으면 안되지?
		document.querySelector('.emoji'+no+'').style.transition="transform .2s";		
		emo = sessionStorage.removeItem("emono");	// 비워줌
		}
	}
}



function writediary(){			// 다이어리 작성 함수 [ 완 ] 
	let content = document.querySelector('#content').value

	if( emo_no == -1 ){ alert('이모티콘을 선택해주세요'); return; }
	
	$.ajax({
		url : "/team3/Diary" ,
		data : { "content" : content  , "emono" : emo_no  } ,
		success : function( re ){
			if( re == 'true' ){
				alert('다이어리 작성 완료🤗')
			}else if( re == null ){
				alert('다이어리 내용을 입력해주세요')
			}else{
				alert('다이어리 작성 실패😅 \n [관리자 문의]')
			}
		}
	})
}

function updateemotion(i){	// 더블클릭하면 감정설명 수정하게 해주는 메소드
	let emonolist = document.querySelectorAll('.emotioninput')	
	let emotionlist = document.querySelectorAll('.emotioninput')
	
	emotionlist[i].readOnly=false;
	emotionlist[i].style.color="#656565";	
	emotionlist[i].value = '';
	alert('글 수정 가능✍️')
	document.addEventListener("keyup", function(e) {
	    if (e.keyCode === 13) {
			emotionlist[i].readOnly=true;
			emotionlist[i].style.color="black";
			let emotion = emotionlist[i].value;
			let emono = i+1;		// DB 번호 수정되면 안됨!
			alert(emono)
	        	$.ajax({
					url : "/team3/emotion" ,
					type : "post" ,
					data : { "emono" : emono , "emotion" : emotion } ,
					success : function(re){
			    		if( re == 'true' ){
							alert('감정 수정 완료🤗')
						}else{
							alert('감정 수정 실패😅 \n [관리자 문의]')
						}
			   		 }
			});
		}
	})
}

function hovercss(i){
	let emoimglist = document.querySelectorAll('.emoji')
	let emotextlist = document.querySelectorAll('.emotioninput')
	
	let emoimg = emoimglist[i];
	let emotext = emotextlist[i];
	

}






























