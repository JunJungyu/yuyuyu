package java1.ch7상속.타이어;

public class Car {

	// 1. 필드 [ 변수 , 객체 , 상수 , 배열 , 리스트 등 = 메모리 ]  / 타이어를 4개 꽃는 개념..?
	Tire frontLefttire = new Tire( 6 , "앞왼쪽" );
	Tire frontRightire = new Tire( 2, "앞오른쪽" );
	Tire backLefttire = new Tire( 3, "뒷왼쪽" );
	Tire backRighttire = new Tire( 4, "뒷오른쪽" );
	
	// 2. 생성자
	
	// 3. 메소드
	boolean[] run() {
		System.out.println("[자동차가 달립니다.]");
		boolean[] tirestate = new boolean[4];
		tirestate[0] = frontLefttire.roll();
		tirestate[1] = frontRightire.roll();
		tirestate[2] = backLefttire.roll();
		tirestate[3] = backRighttire.roll();
		for( boolean b : tirestate ) {
			if( b == false ) {stop(); break; }
		}
			return tirestate;
		}
		
	
	void stop() { System.out.println("[자동차가 멈춥니다.]"); }
}
