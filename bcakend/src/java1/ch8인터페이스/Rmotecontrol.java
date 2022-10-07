package java1.ch8인터페이스;

// 클래스 선언 : 접근 제한자 class 명 클래스명 { }
// 인터페이스 선언 : 접근제한자 interface명 인터페이스명 { }

public interface Rmotecontrol {													// 여러개의 클래스를 동일한 목적으로 묶어서 하나로 조작 = 인터페이스

	// 변수( 변하는 수 ) vs 상수( 고정된 수 )
	// 1. static final 안써도 생략되어 있는거임 항상 상수 : 상수 키워드 생략 시 자동으로 상수 선언
	// 2. 초기값( 선언 시 대입되는 값 ) 필수
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;				// static final 안써도 됨 / 초기값은 필수
	
	// 추상 메소드 abstract	
	// 마찬가지로 abstract 생략되어 있음 / 추상 키워드 생략 시 자동으로 추상 선언
	// 선언만 하자 !! ----> 각 클래스에서 정의하자 [ 구현객체 ]
	public abstract void turnOn();					// 여기선 선언만 하고 
	public void turnOFf();
	public void setVOLUME();
	








}
