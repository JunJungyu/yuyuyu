
/*
	왼쪽 방향키 = 37 위쪽 방향키 = 38 오른쪽 방향키 = 39 아래쪽 방향키 = 40
*/

//별의 초기 설정

const star = document.querySelector('h1')	//문서객체 가져오기
star.style.position="absolute"		//css 조작 = 포지션 : 절대위치

//별의 이동을 출력하는 기능
let [ x , y ] = [ 0 , 0 ]
const block = 10	//이동단위
const print = () => {
	star.style.left = `${x*block}px`
	star.style.top = `${y*block}px`
	
}

print()

const [ left , up , right , down ] = [ 37 , 38 , 39 , 40 ]

document.body.addEventListener( 'keydown' , (event) => {
	switch( event.keyCode ){
		case left :
			x -= 1
			break
		case up :
			y -= 1
			break
		case left :
			x += 1
			break
		case left :
			y += 1
			break
	}
	print()
})