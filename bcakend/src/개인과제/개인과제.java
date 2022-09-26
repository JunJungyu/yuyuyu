package 개인과제;

import java.time.LocalDateTime;
import java.util.Scanner;

public class 개인과제 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level2_8 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
	
		/* 문제풀이 위치 */
		
		String 네모 = "■ ";
		int 박 = scanner.nextInt();
		for( int i = 1 ; i <= 박; i++) {
			System.out.print( 네모 );
		}
		while( true ) {
			int 박스 = scanner.nextInt();
			System.out.print("input : ");
			for( int i = 1; i <= 박+박스;  i++ ) {
				if( i > 0 ) {
					System.out.print( 네모 );
					
				}
			}
		박+=박스;
		}
		
		/* ----------- */

	}
}
/* 
	[문제] 그림과 같이 계속입력한 수에 따라 누적으로 저장되어 저장된 수 만큼 ■ 를 출력하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 만약에 누적값이 0 보다 작으면 종료됩니다.
*/