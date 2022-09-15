package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 티키태키톡 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] 게임판 = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]" };
		boolean game = true;
		int 승리 = 0;
		
		  while(game) {
			  for( int i = 0 ; i < 게임판.length; i++ ) {
				 if( i % 3 == 0 ) {
					 System.out.println();
				 }
				  System.out.print(게임판[i]);
			  }
				  while (true) {
				  System.out.println("\n돌을 놓을 곳을 입력해주세요.");	 	int 돌 = scanner.nextInt();
					  if( 돌>=0 || 돌<9 ) {
						  if( 게임판[돌].equals("[ ]") ) {
							  게임판[돌] = "[●]";
							  승리++;
							  break;  
						  }else {System.out.println("이미 돌이 존재하는 자리입니다.");}
						  
					  }
					  else {System.out.println("0~8 사이의 숫자를 입력해주세요.");}
				  }
				 
				  while (true) {
				  Random 백 = new Random();
				  int 랜덤 = 백.nextInt(9);
				  if( 게임판[랜덤].equals("[ ]") ) {
					  if( 게임판[랜덤].equals("[ ]") ) {
						  게임판[랜덤] = "[○]";
						  승리++;
						  break;					  
					  }
	
				  }
				  
				  
				  }
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  if( 승리 == 9 ) {
	   			   System.out.println("무승부입니다.");
	   			   return;
			  }
			  
			  for( int j = 0; j < 7 ; j += 3 ) {//012 345 678  
				   if( 게임판[j].equals(게임판[j+1]) && 게임판[j+1].equals(게임판[j+2]) && !게임판[j].equals("[ ]") && !게임판[j+1].equals("[ ]") && !게임판[j+2].equals("[ ]") ) {
					   if( 승리 % 2 == 1 ) {
						   System.out.println("백돌 승리입니다.");
					   }else {System.out.println("흑돌 승리입니다.");}
					   
					return;
				   }
			  }
				   
			   for( int y = 0; y < 2 ; y++ ) {//036 147 258
				   if( 게임판[y].equals(게임판[y+3]) && 게임판[y+3].equals(게임판[y+6]) && !게임판[y].equals("[ ]") && !게임판[y+3].equals("[ ]") && !게임판[y+6].equals("[ ]") ) {
					   if( 승리 % 2 == 1 ) {
						   System.out.println("백돌 승리입니다.");
					   }else {System.out.println("흑돌 승리입니다.");}	
					   return;
				   }
			   }

			   if( 게임판[0].equals(게임판[4]) && 게임판[4].equals(게임판[8]) && !게임판[0].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[8].equals("[ ]") ) {//048
				   if( 승리 % 2 == 1 ) {
					   System.out.println("백돌 승리입니다.");
				   }else {System.out.println("흑돌 승리입니다.");}  
				   return;
			   }
			
			   if( 게임판[2].equals(게임판[4]) && 게임판[4].equals(게임판[6]) && !게임판[2].equals("[ ]") && !게임판[4].equals("[ ]") && !게임판[6].equals("[ ]") ) {//048 246
				   if( 승리 % 2 == 1 ) {
					   System.out.println("백돌 승리입니다.");
				   }else {System.out.println("흑돌 승리입니다.");}	  
				   return;
			   }		
			     
		  }
		
	}//main e
}//class e
