package java1.ch12스레드;

import java.awt.Toolkit;
			// 이 클래스가			// 인터페이스
public class BeepTask implements Runnable{ // implements : 도구 , 구현하다 인터페이스 구현할 때 사용
										   // Runnable : 스레드 인터페이스
	// 1. 필드
	
	// 2. 생성자
	
	// 3. 메소드 [ 스레드(멀티)를 제공하는 함수 = run ]
	@Override				// 정해진 문법이라 다른 이름 안되고 무조건 run~~ 이건 Runnable이 제공해줌
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();				  
		
		for( int i = 0 ; i<5; i++ ) {
			toolkit.beep();											   
		try {
			Thread.sleep(500);										
		}catch (Exception e) {  }										
		}																
	}
}
