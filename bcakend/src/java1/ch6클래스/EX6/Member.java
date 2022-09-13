package java1.ch6클래스.EX6;

public class Member {

	// 1. 필드
	String id;
	String password;
	String name;
	int point;
	
	// 2. 생성자
		// 1. 빈생성자
	public Member() {}
		// 회원가입시 사용되는 생성자
	Member( String id , String password , String name , int point ){
		this.id = id;
		this.password = password;
		this.name = name;
		this.point = point;
	}
	
		// 3. 회원정보에서 비밀번호와 이름 변경 시 사용되는 생성자
	Member( String password ){
		this.password = password;

		
		// 4. 로그인 [ 아이디, 비밀번호 ] 시 사용되는 생성자
	Member( String id , String password ){
		this.id = id;
		this.password = password;
	}
		
	}
	
	
}
