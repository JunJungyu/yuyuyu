/*
	익명함수 = 람다
	*자바  :함수도 자료이다. 
	매개변수에 함수 전달이 가능하다.
	매개변수 : 자료형 [넘버,스트링,블룬,오브젝트(중에서도어레이 배열, 함수)]
	함수호출(변수/상수)
	함수호출(변수)
	함수호출(배열)
	함수호출(함수)
	함수호출(function){})
 */
 
 function callThreeTiems ( callback ){
	for( let i = 0 ; i<3 ; i++ ){
		callback(i)
	}
}

function print(i){
	console.log ( `${i}번째 함수 호출` )
}

//함수호출
allThreeTiems( print )

//익명 콜백 함수 정의 [ p. 222 ]
callThreeTiems2( function(i){
	console.log(`${i}번째 함수 호출`)
	} 
)
//함수호출callThreeTiems2 끝


//배열의 forEach() 함수 메소드 [ p.233 ]
	//forEach( ) : 내장함수
number.forEach( function( value , index , array ){
	console.log( `${번째 요소} ${value}` )
} )

// * forEach() 사용 안할때

function for_print ( numbers ){
	for ( let i = 0 ; i<numbes.lenght ; i++ ){
		console.log( `${i}번째 요소 ${numbes[i]}` )
	}
}

for_print( numbers )


// 4. 배열의  map( ) 함수 [ p.223 ]
numbers = numbers.map ( function( value , index , array ) ){
	return vlaue * vlaue
} )
console.log(' map 실행결과 '+ numbers )
numbers.forEach( console.log )


// 5. 배열의 filter( ) [ p. 224]
const evenNumber = numbers.filter(function(value){
	return value % 2 == 0 	//짝수 공식	
})
console.log( '원래 배열' + numbers )
console.log( '짝수 배열' + numbers )

//자동완성이 안되고있다!!


























