package java1ch4_배열;

import java.util.Random;
import java.util.Scanner;
/*
 
 	로또 판별기
 		1. 구매번호 : 사용자에게 6개 수 입력 -> 배열저장
 			1. 1~45 사이만 입력받기 아니면 재입력
 			2. 중복 X
 			
 		2. 추첨번호 : 컴퓨터 난수 6개 생성 -> 배열저장
 			1. 1~45 사이 난수
 		3. 구매번호와 추첨번호와 동일한 수의 개수
 			
 */
	
public class EX2_로또판별기 {//class s

	public static void main(String[] args) {//main s
		
	
			// 0. 메모리[변수/배열] 선언
		Scanner scanner = new Scanner(System.in);
		int[] 구매번호 = new int[6];	// int형 변수 6개를 저장할 수 있는 공간
		int[] 추첨번호 = new int[6];	// int형 변수 6개를 저장할 수 있는 공간
		
		// ------------------ 1. 사용자에게 입력받는다. [6번] ------------------ 
		for( int i = 0; i<6; i++ ) { // i = 인덱스
			System.out.println("안내) " + (i+1) + "번째 번호 선택 : ");
			구매번호[i] = scanner.nextInt(); // 입력받은 값을 i번째 인덱스에 저장한다.
			// [조건1] 1~45 사이 입력받기
			if ( 구매번호[i] <= 0 || 구매번호[i] > 45 ) { // 만약에 입력값이 1보다 작거나 45보다 크면 재입력
				System.err.println("안내) 선택할 수 없는 번호입니다.");
				i--; // 현재 i값 무효화
				continue; // 다시 반복문 실행 --> 증감식 이동
			}// if e
			
			
			
			// [조건2] 배열 내 입력된 데이터 확인 [ 중복확인 ]
			boolean 중복체크 = false; // 중복여부를 저장하는 변수
			// [ 조건2 ] 배열 내 입력된 데이터 확인 [ 중복 확인 ]
			for( int j = 0; j<i ; j++ ) {
				if( 구매번호[j] == 구매번호[i] ) { // 만약에 j번째 인덱스의 값과 i번째 인덱스의 값이 같으면
					System.out.println("안내) 이미 선택된 번호 입니다.");
					중복체크 = true;
				}//if e
			}//for2 end
			//for2 가 끝났을 때  true이면 재입력
			if( 중복체크 == true ) { i--; continue; }
			
			//[조건1/조건2] 모두 통과 후 코드
			System.out.println("숫자 "+구매번호[i]+"번 선택하셨습니다.");
			
		} // for end
		// 2. 컴퓨터 난수 받는다.
		for( int i = 0; i<6 ; i++ ) {//for 3 s
			
			Random random = new Random();	// 랜덤과 관련된 메소드 제공
			추첨번호[i] = random.nextInt(45)+1;	// random.nextInt( 수 );  // 0 ~ 수 전까지 난수 발생 / +1 하는 이유는 나수가 0부터 만들어지니까? 시작번호~끝번호 까지 난수 발생 (끝번호)+시작번호
			// [ 조건1 ] 중복체크
			for( int j=0; j<i; j++ ) {// for4 s
				if( 추첨번호[j] == 추첨번호[i] ) { i--; }
			}// for4 e
		}//for 3 e
		
		// 구매번호 , 추첨번호 출력
		for ( int value : 구매번호 ) {
			System.out.print("나의 구매번호");
			System.out.printf("%2d\t" , value);
		}
		System.out.println();
		for ( int value : 추첨번호 ) {
			System.out.print("로또 당첨번호");
			System.out.printf("%2d\t" , value);
		}
		System.out.println();
		
		int 당첨개수 = 0;
		for( int i = 0; i<구매번호.length ; i++) {
			for( int j=0; j<추첨번호.length ; j++ ) {
				if( 구매번호[i] == 추첨번호[j] ) {당첨개수++;}
			}
		}
		System.out.println("총 당첨개수 "+당첨개수+"개");
	
	
	}//main e
}//class e
