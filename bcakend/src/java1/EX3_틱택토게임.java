package java1;

import java.util.*;
import java.util.Scanner;

public class EX3_틱택토게임 {//class s

	public static void main(String[] args) {//main s
		Scanner scanner = new Scanner(System.in);   
	      
	      String[] 게임판 = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]" };
	      boolean game = true;
         while(game) {
                     // 1. 게임판 출력 - 배열내 모든 데이터 출력 
               for( int i=0; i<9; i++ ) {
                      System.out.print(게임판[i]);
                      if( i%3==2 ) {
                    	  System.out.println();
                      }
	           }
	           while (true) {
				   System.out.println("돌 위치를 선택해주세요."); 
				   int 위치 = scanner.nextInt();   
				   if( 게임판[위치].equals("[ ]") ) {
				   게임판[위치] = "[●]";
		           }
		           else {
		           System.out.println("이미 돌이 있는 자리입니다.");
		           }
			  }   
	     }  
	}//main e
}//calss e
	      
	      
	         /*
	             틱택토 게임 설계
	                [ 조건 ]
	                1. 게임판 9칸 사용 -> 배열[0~8] 
	                   1. String 배열      클래스는 비교연산자 불가능
	                      ==  <---> 문자열1.equals(문자열2)
	                      !=  <---> !문자열1.equals(문자열2)
	                2. 사용자[O]가 알을 두고자 하는 위치[인덱스] 입력[0~8]
	                   1. 선택된 위치가 이미 다른 알이 존재하면 재입력 [중복제거]
	                3. 컴퓨터[X]가 난수생성[0~8]
	                   1. 난수의 위치가 이미 다르 알이 존재하면 재생성 [ 중복제거 ]
	                4. 승리자 판단 [ 1.가로로 이기는수 2. 세로로 이기는수 3. 대각선으로 이기는수 4.무승부 ]
	                [ 출력 ] 게임판 출력 예시 
	                   [ ] [ ] [ ] 
	                   [ ] [ ] [ ] 
	                   [ ] [ ] [ ] 
	          */
	      
