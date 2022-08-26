

document.addEventListener('DOMContentLoaded',() => {		//2html에 이벤트 추가(1다 읽으면)
	const input = document.querySelector('#todo')			//매번 길게 적을 수 없으니 상수 선언
	const todoList = document.querySelector('#todo_list')	//아이디니까 앞에 # 붙이고
	const addbutton = document.querySelector('#add_button') // const 상수이름 = 하나 선택해서 가져오기 뭐를? ('여기에 있는것을')
	
	let keyCount = 0	//뭘 센다는건진 모르겠지만 세는거니까 0부터 시작 let이니까 얘는 변수선언이고 값이 바뀔 수 있음
	
	const addTodo = () => {				//상수 addTodo(이름)을 선언할건데 얘는 중괄호 안의 내용을 실행할거다.
		if (input.value.trim() === '') {//만약 소괄호 내용이 맞으면 중괄호 내용을 진행할건데
			alert('할 일을 선택해주세요')		//소괄호 = 입력받은 값이 trim-공백제거? 가 ''이거랑 같으면 할일 선택해달라고 알람이 뜬다
			return						//만약 if 소괄호 안의 조건이 틀리면 return된다
			
			//만약 (입력받은 값에서 공백을 제거한것이 === 공백이면 => 이 말은, 아무것도 안썼단말 만약 "학 교" 입력하고
			//공백을 제거했다면 "학교" = '' 이 아니니까 조건불충족이고 " "를 입력하면 " " = '' 니까~!)
			
		} // if end 
		const item = document.createElement('div')			//상수 아이템 선언 이거는 div 박스 만들기
		const checkbox = document.createElement('input')	//상수 체크박스 선언 이거는 input박스 만들기
		const text = document.createElement('span')			//상수 텍스트 선언 이거는 <span> 만들기
		const button = document.createElement('button')		//상수 버튼 선언 이거는 <button>만들기
		
		const key = keyCount	//아까 선언한 키카운트 = 0을 key에 대입 앞으로 key는 keyCount 곧 0이다..
		// 이후에 removeTodo() 함수에서 문서객체를 쉽게 제거하기 위한 용도로 만든 변수...
		//key가 값이니까 getAttribute(key)가 key를 불러올때 필요함
		//F12누르면 번호 다 먹여져있음
		
		keyCount += 1		//키카운트에 일씩 더할거다
		
		item.setAttribute('data_key' , key)	//아이템에 데이타키랑 키를 넣는다.. 
		item.appendChild(checkbox)			//html 삽입 item = 상위객체	checked는 하위객체
		item.appendChild(text)				//html 삽입 item = 상위객체	text는 하위객체
		item.appendChild(button)			//html 삽입 item = 상위객체	button는 하위객체
		todoList.appendChild(item)				//html 삽입 item = 상위객체	item는 하위객체
		
		checkbox.type = 'checkbox'			//checkbox속성 부여 네모난거 체크하는거
		checkbox.addEventListener('change' , (event) => {	//체크박스에 이벤트 추가( '클릭을 하면' (이벤트가 추가됨?) )
			item.style.textDecoration						//마찬가지로 소괄호 조건이 충족되면 중괄호에 있는거 실행
			= event.target.checked ? 'line-through' : ''	//아이템을 꾸며줄건데 조건이 참이면 가운데 줄 그어주고 거짓이면 암것도 안해줌
		})
		
		text.textContent = input.value						//text(span)에 입력받은 값을 넣어줌
		
		button.textContent = '제거하기'						//버튼 글씨칸에 '제거하기'라는 문구를 넣어주고 (기존에 추가하기 글은 사라짐)
		button.addEventListener('click' , () => {			//버튼에 이벤트를 추가하건데 ( 클릭')된다는 조건하에
			removeTodo(key)									//{키 제거? 아까 0부터 세던거}★
		}) // button.addEventListener end 
		
		input.value = ''									//입력받은 값을 공백으로 바꿔주고
	} // addTodo end 
	const removeTodo = (key) => {					//removeTodo에 
			const item = document.querySelector(`[data_key="${key}"]`) // ??
			todoList.removeChild(item)									//todoList에 ${key} 제거
	}// 변수 선언 끝?
	addbutton.addEventListener('click',addTodo)							//
		input.addEventListener('keyup' , (event) => {					//
			
			const ENTER = 13											//엔터키 키코드
			if (event.keyCode === ENTER ){								//엔터를 눌렀으면
				addTodo()												//addTodo 실행
			}//if end
		
	})//input.addEventListener end
}) // DOMContentLoaded end 