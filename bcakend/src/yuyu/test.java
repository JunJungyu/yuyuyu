package yuyu;

import java.time.LocalDateTime;
import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		
		/* 문제풀이 위치 */
		System.out.println("친구목록 수 : " );
		int no = scanner.nextInt();								// 친구 수 입력받고
		String[] freinds = new String[no];						// 배열 길이 입력받은 수로 선언하고
		int count = 0;											// 친구 등록이 될때마다 증가할 수
		while( count>no ) {
			for( int i = 0; i<count; i++ ) {
				System.out.println("친구이름 : ");
				String mem = scanner.next();
				if( mem.equals(freinds[i]) ) {
					System.out.println("중복");
				}if( ) {
					
				}
			}
		}
						
				

	
		/* ----------- */
		
		}
}
/* 
	[문제] Level3_2 이어서 작성합니다. 중복체크를 진행합니다.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 만일 배열에 null 존재할경우 출력하지 않습니다.
		3. [ 중복체크 ] 입력한 데이터가 이미 배열에 존재할 경우 다시 입력받습니다.
*/