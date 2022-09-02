package java1.b연산자;

public class EX3_for {//class s

	public static void main(String[] args) {//main s
		
		//p.150 1~10까지 출력
			// 1. 반복문이 없을 때 10개 복붙
				System.out.println("1");	System.out.println("2");
				System.out.println("3");	System.out.println("4");
				System.out.println("5");	System.out.println("5");
				System.out.println("7");	System.out.println("8");
				System.out.println("9");	System.out.println("10");
		
			// 2. for문을 사용했을 때 
		for ( int i = 1; i <= 10; i++ ) {	// 초기값; 조건문; 증감식
			//i는 1부터 10이하까지 1씩 증가
			System.out.println(i);
		}
		
		// 3. while 문
		
		int i = 1;						// 1. 초기값
		while( i <= 10 ) {				// 2. 조건문
			System.out.println( i );	// 3. 실행문
				i++;					// 4. 증감식
		}
		
		
		// p.151 1~10까지 누적합계
		
		int 합계1 = 1;
		합계1 += 0;
		합계1 += 1;
		합계1 += 2;
		합계1 += 3;	//쭉쭉쭉 10까지 하면 됨
		
		
		// 2. for
		int 합계2 = 0;
		for( int j = 1; j <=10; j++ ) {
			합계2 += j;
		}
		
		// 3. while
		int 합계3 = 0;
		int h = 1;
		while( h<=10 ) {
			합계3 = h;
			h++;
		}
		
		System.out.println("1결과 : " + 합계1);
		System.out.println("2결과 : " + 합계2);
		System.out.println("3결과 : " + 합계3);
		
		//----------------------------------------------------------------------
		
		// 예3) 1부터 100까지의 7배수의 누적합계
		
		int 예제3합계 = 0;
		for( int x = 1; x>100; x++ ) {
			if( x % 7 == 0 )예제3합계 += x;
		}
		System.out.println("예제 3 결과 : " + 예제3합계);
		
		//2.
		int 예제3합계2 = 0;
		for( int x = 0; x<=100; x+=7 ) {
			예제3합계2 += x;
		}
		
		System.out.println("예제3결과 :" + 예제3합계2);
		
		//----------------------------------------------------------------------
		
		//예4) 2단의 구구단 출력
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		System.out.println("2 x 4 = 8");
		System.out.println("2 x 5 = 10");
		System.out.println("2 x 6 = 12");
		System.out.println("2 x 7 = 14");
		System.out.println("2 x 8 = 16");
		System.out.println("2 x 9 = 18");
		
		// 2.
		for ( int 곱 = 1; 곱<=9; 곱++ ) {
			int 연산결과 = 2*곱;
			System.out.println("2 x "+곱+" = "+연산결과);
		}
		
		// 3. 
		int 곱2  = 1;										
		while( 곱2 <= 9 ) {									//초기값
			int 연산결과 = 2 * 곱2;								//조건문
			System.out.println("2 x "+곱2+" = "+연산결과);		//실행문
			곱2++;											//증감식
		}
		
		// 1. 구구단
		/*
		  	단 : 2부터 9까지 1씩 증가 -> 8번
		  	곱 : 1부터 9까지 1씩 증가 -> 9번
		  	--단 1번 당 곱은 모두(9번) 실행 -- 단 마다 곱은 9개 존재 -- 단 이 곱을 포함하고 있다.
		  
		 */
		
		int 실행횟수 = 0;
		for( int 단 = 2; 단 <=9; 단++ ) {	// 단2~9							[ 8회 ]
			//단은 2부터 9까지 1씩 증가				
			for( int 곱 = 1; 곱<=9; 곱++ ) {//곱 1~9						[ 9회 ] 단 1회마다 곱 모두()
				System.out.printf(" %2d X %2d = %2d \n" , 단 , 곱 ,(단*곱));
			
					실행횟수++;
			}
			
		}
		
		System.out.println("총 반복 횟수 : " + 실행횟수);
		
		
		
		// 2. 무한루프 = 무한루프
		
		//for( int y = 0; true; y++ ) {
		//	System.out.println("무한으로 실행~");
		//}
		
		
		
		
		
		
		
		
		
	}//main e
	
}//class e

/*

	 반복문 : 조건이 참이면 실행문 반복
	 
	 	조건반복 - for 사용     	/		  무한 반복 = while 사용
	 	1. for ( 1. 초기값 ; 2. 조건문 ; 3. 증감식 ){ 실행문 }
	 	2.
	 		초기값
	 		while( 조건문 ){
	 			실행문
	 			증감식
	 		}

*/