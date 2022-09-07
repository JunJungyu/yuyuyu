package java1ch4_배열;

import java.util.Scanner;

public class A과제_도서대여 {//class s

	public static void main(String[] args) {//main s
		 Scanner scanner = new Scanner(System.in);
		boolean 유정 = true;
		
		String[][] 회원 = new String[50][2];
		String[][] 도서 = new String[100][3];	
		
		
		while(유정) {
			System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
			System.out.println("\t1.회원가입\t\t2.로그인");	int 선택 = scanner.nextInt();
			System.out.println("\t\t.......................\n");
			if( 선택 == 1 ) {
				System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
				System.out.println("안내) 회원가입 페이지입니다.");
				System.out.println("아이디를 입력해주세요. :");		String 아이디 = scanner.next();
				System.out.println("비밀번호를 입력해주세요. :");		String 비밀번호 = scanner.next();
				
				for( int i = 0; i <= 회원.length; i++ ) {
					if( 회원[i][0] == null ) {
						회원[i][0] = 아이디;
						회원[i][1] = 비밀번호;
						System.out.println("회원가입 성공");
						break;
					}else{
						System.out.println("이미 존재하는 아이디입니다.");
					}
				}
				
				
				
				
				System.out.println("\t\t.......................\n");
			}else if( 선택 == 2 ) {
				System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
				System.out.println("안내) 로그인 페이지입니다.");
				System.out.println("아이디를 입력해주세요. :");		String 아이디 = scanner.next();
				System.out.println("비밀번호를 입력해주세요. :");		String 비밀번호 = scanner.next();	
				
				for( int i = 0; i <= 회원.length; i++ ) {
					if( 회원[i][0].equals(아이디) && 회원[i][1].equals(비밀번호) ) {
						회원[i][0] = 아이디;
						회원[i][1] = 비밀번호;
						System.out.println("로그인 성공");
						System.out.println("1. 도서검색 2. 도서목록 3. 도서삭제 4. 로그아웃");	int 선택 = scanner.nextInt();
						if( 선택 == 1 ) {
							System.out.println("도서검색 페이지입니다.");
						}else if( 선택 == 2 ) {
							System.out.println("도서목록 페이지입니다.");
						}else if( 선택 == 3 ) {
							System.out.println("도서목록 페이지입니다.");
						}else if( 선택 == 4 ) {
							System.out.println("도서목록 페이지입니다.");
						}else {System.out.println("안내) 보기에 존재하는 숫자를 입력해주세요.");}
						
						break;
					}else if( !회원[i][0].equals(아이디) ){
						System.out.println("없는 아이디입니다.");
						유정 = false;
					}else {System.out.println("비밀번호가 틀렸습니다.");}
					유정 = false;
				}				
				
				System.out.println("\t\t.......................\n");
			}else {
				System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
				System.out.println("안내) 보기에 존재하는 숫자를 입력해주세요."); }
				System.out.println("\t\t.......................\n");
			
		}//아무망
		
	}//main e
	
}//class e
