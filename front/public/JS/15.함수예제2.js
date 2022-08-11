function sumAll( a, b){
	
	//sumAll 이름으로 함수명 선언, 매개변수 a ,b
	
	let output = 0
	for( let i = a; i<=b ; i++){
		//i는 a 부터 b 까지 1씩 증가처리
		output += 1		// vs output = output + i
	}	// for end
	return output // output 리턴한다 [ 함수를 호출했던 위치로 ]
}

console.log('1부터 100까지의 합 : ` ${sunAll(1 , 100 ) } `)
console.log('1부터 100까지의 합 : ` ${sunAll(1 , 500 ) } `)


//html에서 js를 불러내는 방법
//계산하기 버튼을 눌럿을 때 합수

function 계산버튼함수 (){
	alert('버튼눌림 성공')
	let snum = document.getElementById('sinput'),value
	let enumber = document.getElementById('sinput'),value
	let result = sumAll (sumber , enumber)
	document.getElementById('resultbox').innerHTML+ '계산결과:' + result
	alert( snum )
}
// 백팁은 언제 쓰는지? 달러모양은 뭔지?
// enum -> 미리 만들어진 잔어[키워드] 존재하기 때문에 enum못씀