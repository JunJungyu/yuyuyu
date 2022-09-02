package java1.c조건문반복문;

public class 유정 {

	public static void main(String[] args) {
		//1. 구구단
		/*
		 	단 : 2부터 9까지 1씩 증가 -> 8번
		 	곱 : 1부터 9까지 1씩 증가 -> 9번
		 	--단 1번당 곱은 모두 (9번 실행)-- 단 마다 곱은 9개 존재 -- 단 이 곱을 포함하고 있다.
		 */
		
		int 실행횟수 = 0;
		for( int 단 = 2; 단<=9; 단++ ) {//단 2~9
			for( int 곱 =1; 곱<=9; 곱++ ) {
				System.err.print("%2d X %2d = %2d \n",단,곱,(단*곱));
				
				실행횟수++;
			}
			
		}
	}
	
}
