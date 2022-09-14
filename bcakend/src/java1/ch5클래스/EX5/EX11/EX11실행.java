package java1.ch5클래스.EX5.EX11;

public class EX11실행 {
			//정적필드?
	public static void main(String[] args) { // 코드를 읽어주는 [스레드] 포함된 함수
		
		// run메소드 호출 = 동일한 클래스에 존재
		// 1. 메소드 선언시 main 함수가 해당 메소드 먼저 읽기 static 사용
		run();
		
		//2. 객체 만들자
		EX11실행 ex11실행 = new EX11실행();
		ex11실행.run2();
	
		
	}//main e
	
	// 1. 함수 선언 [ 반환값X , 매개변수X ]
	static void run() {	// main을 읽고 나서 여기가 읽히기 때문에 static 넣어서 바로 읽힘?
		
		while(true) {
			System.out.println("1. 회원가입 2. 로그인 : ");
		}
	}
	
	void run2() {
		
		while(true) {
			System.out.println("1. 회원가입 2. 로그인 : ");
		}
	}
	
}
