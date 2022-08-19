/**
 * 
 */
 
 
 	/*
 	 function earnings( name )
 	 wege = 8590
 	 hours = 40
 	 
 	 이것도 같음
 	*/
 
 
 
 
 function earnings( name , wege = 8590 , hours = 40 ){
	//디폴트값 정하기
 	console.log(`${name}`)
 	console.log(` - 시급 : ${wege}원 `)
 	console.log(` - 근무시간 : ${hours}`)
 	console.log(` - 급여 : ${wege*hours}`)
 	}
 	
 	
 // 2. 함수호출
 earnings('구름')
 // 2. 함수호출 [ 인수 : 별 , 10000 ]
 earnings('별' , 10000)
 // 3. 함수호출 [ 인수 : 인성 , 10000 , 52 ]
 earnings('인성' , 10000 , 52)
 