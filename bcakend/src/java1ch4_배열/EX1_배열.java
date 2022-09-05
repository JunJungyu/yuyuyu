package java1ch4_배열;

public class EX1_배열 {
	
	public static void main(String[] args) {

		// 예1) p. 180
		
		// 1. 배열 선언
		int [] scores = { 83, 90, 87 };		// int형 배열 선언, 3개 값 초기화 , 인덱스 0~2
		// 2. 배열 호출
		System.out.println("배열[0] : " + scores[0] );  // 배열 내 0번 인덱스 호출 -> 83
		System.out.println("배열[0] : " + scores[1] );  // 배열 내 0번 인덱스 호출 -> 90
		System.out.println("배열[0] : " + scores[2] );  // 배열 내 0번 인덱스 호출 -> 87
		System.out.println("배열 : " + scores); 		   // 배열명을 쓰면 16진수 주소값이 출력됨
		// 3. 배열 반복문 활용
		int sum = 0;
		for( int i=0; i<scores.length ; i++ ) {// i 는 0부터 배열의 길이 전까지 1씩 증가
			sum += scores[i]; // i번째 인덱스의 값 호출해서 sum 변수에 누적 더하기
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum/3)); // 3이 아니라 3.0으로 쓰면 더블로 인식돼서(?) 소수점까지 나옴
										// 1. sum/3	     ->      int/int		-> int
										// 2. sum/3.0    ->     int/double		-> double 
	// 예2
	// 1. new 연산자를 이용한 선언
		int[] 배열 = new int[3]; 	// new 연산자를 이용한 선언 // int형 3개를 저장할 수 있는 배열 [ 고정길이 ]
	// 2. 배열 호출
		for( int i=0; i<배열.length ; i++ ) {
			System.out.println("배열호출" + 배열[i]);
		}
		
	// 3. 배열에 데이터 넣기
		배열[0] = 100;
		배열[1] = 93;
		배열[2] = 20;
		
	// 4. for문 배열 내 모든 인덱스 호출
		for( int i=0; i<배열.length ; i++ ) {
			System.out.println("값 넣어준 후 배열호출" + 배열[i]);}
	
	// 5. 향상된 for 문
		for ( int temp : 배열 ) { // 증감식, 초기값 생략
			// for( 반복변수 : 배열명 )
			// 배열내 첫번째 인댁스부터 마지막인덱스까지 반복변수 예
			System.err.println(temp);
			}
		
		}//main e
	}//class e
		
		
		
		
		
	
	
/*
 
 	변수 : 데이터 1개 저장
 	배열
 		1. 같은 타입 [ 자료형/클래스 ]의 데이터를 연속된 공간에 나열
 		2. 인덱스 : 저장되는 순서번호
 		3. [ ]
 		4. 제공받는 메소드 X --> Array라는 클래스가 있긴 함..
 			push splice 이런걸 만듬? 기본적으로 제공 안함
 		
 		배열 선언
 			1. 타입[] 배열명;
 			2. 타입 배열명[];
 		배열 생성
 			1. 타입[] 배열명 = { 값0 , 값1 , 값2 ~~ }	: 배열선언과 동시에 값 대입
 			2. 타입[] 배열명 = new 타입 [ 길이 ]			: 배열의 길이만큼 선언[ 초기값 ]
				* 배열의 길이를 미리 설정할 때
 													정수 : 0 실수 :0.0 클래스:null
 		배열의 길이
 		배열명.length
 		
 		반복문 활용
 			for( 자료형 변수명 : 배열명 ){
 			
 			}
 		
 		배열 호출
 			배열명 : 배열의 메모리 주소(번지)
 			1. 배열명[인덱스번호]
 */

