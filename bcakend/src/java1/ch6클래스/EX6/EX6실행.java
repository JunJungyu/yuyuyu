package java1.ch6클래스.EX6;

import java.util.Scanner;

public class EX6실행 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[][] Memberarray = new 
		
		while ( true ) {
			System.out.println("1. 회원가입 2. 로그인");
			int ch = scanner.nextInt();
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				System.out.println("아이디 : ");  	String id = scanner.next();
				System.out.println("비밀번호 : ");	String password = scanner.next();
				System.out.println("이름 : ");	    String name = scanner.next();
				// 객체 선언
				Member signupinfo = new Member ( id , password , name , 1000 );
				int index = 0;
				for( Member temp : MemberObject ) {
					index++;		// 1씩 증가
					if( temp == null ) {	// 만약에 해당 객체가 비어 있으면
						// temp = signupinfo; // 임시변수 수정
						MemberObect[ index ] = signupinfo; // 원본에 수정 [ 주소값 대입 ]
						break;
					}
				}
				
			}else if( ch == 2 ) {
				System.out.println("아이디 : ");  	String id = scanner.next();
				System.out.println("비밀번호 : ");	String password = scanner.next();
				// 객체 선언
				Member loginInfo = new Member( id , password );
				
				for( Member temp : MemberObject ) {
					if( temp != null && temp ) {
						
					}
				}
			}
		}
			
		
		
	}
	
}
