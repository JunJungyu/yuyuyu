package java1.ch7상속;

// 상위[부모] 클래스로 사용할 목적
public class CellPhone {
	// 1. 필드
	String model;		// private추가하면 연결안되고 빨간줄뜸
	String color;
	
	// 2. 생성자
	

	
	// 3. 메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice( String message ) {System.out.println("자기 " + message );}
	void receiveVoice( String message ) {System.out.println("상대방 " + message );}
	void hangUp() {System.out.println("전화를 끊습니다.");}
}
