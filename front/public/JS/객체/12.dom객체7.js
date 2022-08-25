
/* 

	왼쪽 방향키 : 37

 */
 /*
 
 이렇게 하나씩 선언해도 되고
const left = 37
const up = 38
const right = 39
const down = 40

이렇게 한번에 선언해도 됨 똑같음
const = [ left , up , right , down ] = [ 37 , 38 , 39 , 40 ]
*/

//별의 초기설정

const star = document.querySelector('h1')
star.style.position = 'absolute'	/* css조작 = 포지션 : 절대위치 */

let [ x , y ] = [ 0 , 0 ]	/* 키보드 이동 값 */

/*
이거나 저거나 같은말임
let x = 0	/ left 위치 저장하는 변수
let y = 0	/ yop 위치 저장하는 변수 
*/

const block = 20	/* 이동단위 */
const print = () => {
	star.style.left = `${x*block}px`
	star.style.top = `${y*block}px`
}

print()

const [ left , up , right , down ] = [ 37 , 38 , 39 , 40 ]

document.body.addEventListener('keydown' , (event) => { 
	
	
	//if : 논리제어
	//switch : 값 제어 [ 정해진 경우의 수 ]
	
/*
	switch( event.keyCode ){
		case left:
			x -= 1
			break
		case up:
			y -= 1
			break
		case right : 
			x += 1
			break
		case down :
			y += 1
									//마지막은 break안써도 됨
	}	//switch end
	print ()	//x와y 변경 후 함수 호출
})	//키보드 이벤트 함수 end
*/



















