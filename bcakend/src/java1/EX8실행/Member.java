package java1.EX8실행;

import java.util.Scanner;

// 1. 클래스 선언
public class Member {

	// 0. 입력 객체
	Scanner scanner = new Scanner(System.in);
		// scanner.next(); 객체명.메소드명()		[O]
		// scanner.next(); 클래스명.메소드명()	[X]
	
	
	// 맴버
	// 1. 필드
	String id;
	String password;
	String name;
	// 2. 생성자 : 객체 생성시 초기값[ 필드의 처음값 설정 ]
		// * : 클래스명 이름 동일
		// * : 매개변수 개수에 따라 오버로딩 [ 여러개 사용 가능 ]
	// 1. 빈 생성자
	public Member() { }
	
	
	// 2. 매개변수 1개인 생성자
	Member( String id ){ this.id = id; }
	
	// 3. 매개변수 2개인 생성자
	Member( String id, String password ){
		this.id = id;
		this.password = password;
	}
	
	// 4. 플 생성자 [ 매개변수 3개인 생성자 ]
	Member( String id , String password , String name ){
		this.id  = id;
		this.password = password;
		this.name = name;

		/*
		 빈공간에 우클릭 소스 - 제너레이트 콘스어쩌고 아래서부터 3번째 누르면 만들어짐
		 
		public Member(String id, String password, String name) {
			super();
			this.id = id;
			this.password = password;
			this.name = name;
		}
		*/

	
	}
	
	// 3. 메소드
	
}
