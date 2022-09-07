package java1;

import java.util.Random;
import java.util.Scanner;

public class ya {



		public static void main(String[] args) {//main s
			Scanner scanner = new Scanner(System.in);   
		      
		      String[] 게임판 = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]" };
		      boolean game = true;
	          while(game) {//while s
	                     // 1. 게임판 출력 - 배열내 모든 데이터 출력 
	               for( int i=0; i<9; i++ ) {//for s
	                      System.out.print(게임판[i]);
	                      if( i%3==2 ) {//if s
	                    	  System.out.println();
	                      }//if e
		           }//for e
	               
		           while (true) {//while 2 s
					   System.out.println("안내) 돌 위치를 선택해주세요.");	//돌 위치 입력받아서
					   int 위치 = scanner.nextInt();  	//입력받은걸 위치에 저장
					   	if( 위치<0 || 위치>8 ) {//if s	//근데 만약 위치가 0보다 작거나 8보다 크면 정상범위가 아니니까
						   System.out.println("안내) 0~8 사이의 숫자를 입력해주세요.");	//숫자 다시 입력하럭ㅎ
						   }//if e
		           
					   	
					   	if( 게임판[위치].equals("[ ]") ) {//if 2 s
						   게임판[위치] = "[●]";
						   break;
					   	}else{//else s
				           System.out.println("안내) 이미 돌이 있는 자리입니다.");
				           
			             }////else e
					   	
					   	
		          }//while 2 e
		           
		           while (true) {
		        	   	
		        	   	Random 백 = new Random();
		        	   	int 백돌 = 백.nextInt(9);
                       if( 게임판[백돌].equals("[ ]") ) {//if s
                    	  게임판[백돌] = "[○]"; 
                    	  System.out.println("멍멍");
                    	  break;
				}
		           
                   	  
                    	  
                       }                          	   
				
					  //승부 012 345 678
                
                      for( int i = 0; i <= 6 ; i += 3 ) {
                    	  if(!게임판[i].equals("[ ]") && 게임판[i].equals(게임판[i+1]) && 게임판[i+1].equals(게임판[i+2]) ) {
		                    	  System.out.println("안내) 가로 승리입니다.");
		                    	  game = false; //게임이 끝나야 하니까 반복문 종료 시켜줌 
							  }
                      
		      }                    	   
                       

					
					  //승부 036 147 258
                      for( int i = 0; i <= 2 ; i++ ) {
                    	  if( !게임판[i].equals("[ ]") && 게임판[i].equals(게임판[i+3]) && 게임판[i+3].equals(게임판[i+6]) ){
                    		  System.out.println("안내) 세로 승리입니다."); game = false; //게임이 끝나야 하니까 반복문 종료 시켜줌 }
                    	  }					  
					  }
					  
					   
					  //대각선 승부 048 246
  
                     if( 게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8]) && !게임판[0].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[8].equals("[ ]") ) {
                     System.out.println("대각선 승리입니다.");
                     game = false;
                     }
                     
                     if( 게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6]) && !게임판[2].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[6].equals("[ ]") ) {
                     System.out.println("대각선 승리입니다.");
                     game = false;
                     }                     
		           
	      }
	}
}
		      
		       