/*
p226
*차이머함수 : 콜백함수 만들어져 있는 내장함수[ 콜백함수 ]
setTimeout ( 함수 , 시간(밀리초) ) : 시간이후에 한번 함수 실행
	clearsetTimeout(함수변수) 타이머 종료됨
setInterval ( 함수, 시간(밀리초) ) : 매 시간마다 함수 실행
	clearsetInterval( 함수변수 ) : 타이머 종료됨
1초는 1000분의1
1*1000*60*60*24
	  1분 1시간 하루
 */
 
 setTimeout(()=>{console.log ('1초 후에 실행됩니다.') ,1*1000})
 
 let count = 0
 let 타이머 = setInterval(()=>{
	console.log ('1초마다 실행됩니다.${count}')
	count++
	if( count == 5){
		alert('5초 지남')
	}
} , 1*1000)
 
