package java1.ch12스레드.타이머스레드;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Ex_실행 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Timer timer = new Timer();							// 호출 / 따로 스레드 진행됨?
		boolean timerstate = false;							// 타이머가 켜져있는지 아닌지 확인용

		while ( true ) {
			System.out.println("1. 타이머 2. 리셋 3. 저장[db]");
			int ch = scanner.nextInt();
			
			if( ch == 1 && timerstate == false && waitstate == true ) {
				timer.start();  timerstate = true; 
				timerstate = true;
			}else if( ch == 1 && timerstate == true waitstate == true ) {	// 켜져있을 때 누르면 일시정지
				timer.setWait(false);  timerstate = false; 
			}
			if( ch == 2 ) {
				//timer.stop();		// 메소드를 중지시키는게 아니라 아예 종료를 시켜버림 -- 비권장
				timer.setStop( false );
				timerstate = false;  timerstate = true; 
				timer = new Timer(); 		// 그러니 여기서 다시 불러와줌
			}
			
		}
		

		
	}
	
}

/*
	멀티스레드
		1. Tread 클래스 상속
		2. Runnable 인터페이스 구현
		
		* run 메소드 구현
		
*/