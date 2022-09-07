package java1;

import java.util.Random;
import java.util.Scanner;

public class EX3_틱택토게임 {//class s

	public static void main(String[] args) {//main s
		Scanner scanner = new Scanner(System.in);   
	      
	      String[] 게임판 = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]" };
	      boolean game = true;
	         while(game) {
	                     // 1. 게임판 출력 - 배열내 모든 데이터 출력 
	               for( int i=0; i<게임판.length; i++ ) {
	                  if( i%3==0 ) {
	                     
	                     System.out.println();
	                  }
	                  System.out.print(게임판[i]);
	               }
	               System.out.println("\n안내) 플레이어(흑돌) 위치를 입력해주세요."); int 흑돌 = scanner.nextInt();
	             
	               // 2. 사용자 에게 위치 입력받기 
	               if( 흑돌>=0 || 흑돌<=8 ) {
	                  for( int i=0; i<게임판.length; i++ ) {
	                     if( i == 흑돌 ) {
	                        게임판[흑돌] = "[●]";                  
	                Random random = new Random();
	                        int 백돌 = random.nextInt(9);
	                        게임판[백돌] = "[○]";	            	   
	                   }if( 흑돌 < 0 || 흑돌 >=9 ) {
	                           System.out.println("안내) 0~8 범위내의 숫자를 입력해주세요."); //왜 반복되지..? 여기 아니면 어디두지
	                     
	                     }//while e     
	                        // 3. 컴퓨터 에게 위치 난수 생성
	                     
	                        

	                        
	                    }//if e
	         
	                  }//for e

	                  }//if e
	               
	   
	                  // 4. 승리 판단 [ 과제 ] 
	                  
	            
	         

	      
	      
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
	      
	   }//main e

	}//calss e