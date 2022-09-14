package EX7비회원제게시판;

import java.util.Scanner;

public class asd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		캐릭터 전사 = new 캐릭터();
		
		while( true) {
			전사.상태();
			System.out.println(" A공격 ");
			String ch = scanner.next();
			if( ch.equals("A") ) { 전사.공격(); }
		}
		
		
	}

}
