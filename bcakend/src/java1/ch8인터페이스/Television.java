package java1.ch8인터페이스;

public class Television implements Rmotecontrol {
						// [ implements 인터페이스 ] : 구현하다. ( 추상을 구현 )
						// [ extends 클래스 ] : 연장하다 ( 상속 )
	// 1. 필드
	public int volume;
	// 2. 생성자
	// 3. 메소드
	// rmotecontrol 인터페이스의 추상메솓를 구현하자
	@Override			// 지워도 상관없음
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	@Override
	public void turnOFf() {
		System.out.println("TV를 끕니다");
	}
	public void setVOLUME( int volume ) {
		if( volume > Rmotecontrol.MAX_VOLUME ) {
			this.volume = Rmotecontrol.MAX_VOLUME;
		}else if( volume < Rmotecontrol.MIN_VOLUME ) {
			this.volume = Rmotecontrol.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
			
	}
	
}
