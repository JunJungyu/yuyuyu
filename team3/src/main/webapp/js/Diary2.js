function 버튼클릭(){
	
	alert('클릭')
	let 꾸미기 = '';
	
	꾸미기 += '<img src="/team3/img/사랑.png" style="width: 50px">'
	document.getElementById('calendar').innerHTML += 꾸미기;
	
	// 해당 날짜로 가게 연결... 그리고 감정마다 만들기 번거로우니 이름을 숫자로 맞춰서 반복문을 하던 매개변수를 하던 바꾸기~
}