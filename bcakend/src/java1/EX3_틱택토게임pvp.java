package java1;

import java.util.Random;
import java.util.Scanner;

public class EX3_틱택토게임pvp {//class s

	public static void main(String[] args) {//main s
		Scanner scanner = new Scanner(System.in);   
	      
	      String[] 게임판 = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]" };
	      boolean game = true;
         while(game) {
        	 
        	 	
        	 int 승리 = 0; 
			   for( int j = 0; j < 7 ; j += 3 ) {//012 345 678
				   if( 게임판[j].equals(게임판[j+1]) && 게임판[j+1].equals(게임판[j+2]) && !게임판[j].equals("[ ]") && !게임판[j+1].equals("[ ]") && !게임판[j+2].equals("[ ]") ) {
					  if( 승리 == 0 ) {
					   System.out.println("흑돌 승리입니다.");
					   return; 
					  }else if( 승리 == 1 ){System.out.println("백돌 승리입니다.");}
					  
				   }
			  }
				   
			   for( int y = 0; y < 2 ; y++ ) {//036 147 258
				   if( 게임판[y].equals(게임판[y+3]) && 게임판[y+3].equals(게임판[y+6]) && !게임판[y].equals("[ ]") && !게임판[y+3].equals("[ ]") && !게임판[y+6].equals("[ ]") ) {
						  if( 승리 == 0 ) {
							   System.out.println("흑돌 승리입니다.");
							   return; 
							  }else if( 승리 == 1 ){System.out.println("백돌 승리입니다.");}
					   return;
				   }
			   }

			   if( 게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8]) && !게임판[0].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[8].equals("[ ]") ) {//048
					  if( 승리 == 0 ) {
						   System.out.println("흑돌 승리입니다.");
						   return; 
						  }else if( 승리 == 1 ){System.out.println("백돌 승리입니다.");}
				   return;
			   }
			
			   if( 게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6]) && !게임판[2].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[6].equals("[ ]") ) {//048 246
					  if( 승리 == 0 ) {
						   System.out.println("흑돌 승리입니다.");
						   return; 
						  }else if( 승리 == 1 ){System.out.println("백돌 승리입니다.");}
				   return;
			   }			   
			   
				   
				   
                     // 1. 게임판 출력 - 배열내 모든 데이터 출력 
               for( int i=0; i<9; i++ ) {
                      System.out.print(게임판[i]);
                      if( i%3==2 ) {
                    	  System.out.println();
                      }
	           }
	           while (true) {
				   System.out.println("흑돌 위치를 선택해주세요."); 
				   int 흑돌 = scanner.nextInt();   
				   if( 게임판[흑돌].equals("[ ]") && !게임판[흑돌].equals("[○]") && !게임판[흑돌].equals("[●]") ) {
				   게임판[흑돌] = "[●]";
				   }
				   ++승리;
				   
			
				
				   
				   System.out.println("백돌 위치를 선택해주세요.");
				   int 백돌 = scanner.nextInt();
				   if( 게임판[백돌].equals("[ ]") && !게임판[백돌].equals("[●]") && !게임판[백돌].equals("[○]") ) {
					   게임판[백돌] = "[○]";
					   --승리;
					   break;  
				   }else{System.out.println("이미 돌이 존재하는 자리입니다.");
					   break;
				   }
				

	           
			  }//while e   
	     }//while e
	}//main e
}//calss e
	      
	      
	         /*
	             틱택토 게임 설계
	                [ 조건 ]
	                1. 게임판 9칸 사용 -> 배열[0~8] 
	                   1. String 배열      클래스는 비교연산자 불가능
	                      ==  <---> 문자열1.equals(문자열2)
	                      !=  <---> !문자열1.equals(문자열2)
	                2. 사용자[O]가 알을 두고자 하는 흑돌[인덱스] 입력[0~8]
	                   1. 선택된 위치가 이미 다른 알이 존재하면 재입력 [중복제거]
	                3. 컴퓨터[X]가 난수생성[0~8]
	                   1. 난수의 위치가 이미 다르 알이 존재하면 재생성 [ 중복제거 ]
	                4. 승리자 판단 [ 1.가로로 이기는수 2. 세로로 이기는수 3. 대각선으로 이기는수 4.무승부 ]
	                [ 출력 ] 게임판 출력 예시 
	                   [ ] [ ] [ ] 
	                   [ ] [ ] [ ] 
	                   [ ] [ ] [ ] 
	          */
	      
