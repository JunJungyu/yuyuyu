package java1.ch8인터페이스;

public class EX1_실행 {

	public static void main(String[] args) {	
		Rmotecontrol rc;
		
		// 1. 객체 [ 인터페이스X ]
		Television tv = new Television();
		
		// 2. 인터페이스 구현 객체
		// 인터페이스 변수명 = bew 구현클래스();

		
		// 2. 인터페이스 변수에 구현객체 대입
		rc = new Television();	// 리모콘에 텔레비전 기능 탑재
		
		// 2. 메소드 실행
			rc.turnOn();
			rc.setVOLUME();
			rc.turnOFf();
			
			System.out.println("TV에서 Audio로 변경");
			
		// 3. 인터페이스 변수에 구현객체 변경
			rc = new Audio();		// 리모콘에 오디오 기능 변ㅅ경
			
		// 
			rc.turnOn();
			rc.setVOLUME(7);
			rc.turnOn();
			
		System.out.println("오디오 -> 스마트티비");
			
		SmartTelevision stv = new SmartTelevision();
		
		rc.turnOn();
		rc.setVOLUME(5);
		rc.turnOFf();
		Searchable sc = stv;
		sc.search("11번");
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
