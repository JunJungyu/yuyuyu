package java1.ch12스레드;

import java.awt.Toolkit;

public class EX1_스레드 {

	public static void main(String[] args) {
		// 스레드 : 한가닥 실 의미 [ 코드 읽는 하나의 흐름 ]
		// 멀티스레드 : 코드 읽는 여러개의 흐름
		// main 스레드 : main함수 시작될대 실행 --> 
		
	
	System.out.println("싱글스레드 시작");
	// 싱글스레드 : 소리가 5번 출력되고 문자열 5번 출력된다 동시X
	// 3. p.525 Toolkit 8버전에만 있음?
	Toolkit toolkit = Toolkit.getDefaultToolkit();				    // Toolkit : console ui 제공 new를 안쓰고 메모리할당하면 static임 소리내줌
	
	for( int i = 0 ; i<5; i++ ) {
		toolkit.beep();											    // 비프음 소리 함수	
	try {
		Thread.sleep(500);											// 밀리초 : 1000/1초
	}catch (Exception e) {  }										// Thread : 현재 스레드			.sleep : 스레드 일시정지 [ 무조건 예외처리 발생 ]
	}																// 그냥 반복문만 쓰면 소리가 나는 속도보다 반복문 도는 속도가 더 빨라서 한번만 소리들림 
	
		for( int i = 0; i<5; i++ ){
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// 2. p526
		System.out.println("멀티스레드 시작");
		Runnable beepTask = new BeepTask();		// 구현객체
		Thread tread = new Thread(beepTask);	// tread 여기에 넣고 돌림
		tread.start();						// run 메소드 간접 호출
		
		// main 스레드 생성된 스레드 실행 후 다음코드 실행
		
		for( int i = 0; i<5; i++ ){
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		}
		
		// 3. p.527 : 익명구현 객체 - 1회용 [ 이름 없으니까 다른곳에 호출 불가능 ]
		System.out.println("익명 구현객체 이용한 스레드");
		Thread tr2 = new Thread( new Runnable() {				// 다른 클래스에서 만든 런너블 가져오고?
			@Override
			public void run() {									// 아닌가..?
				Toolkit toolkit = Toolkit.getDefaultToolkit();				  
				for( int i = 0 ; i<5; i++ ) {
					toolkit.beep();											   
				try {
					Thread.sleep(500);										
				}catch (Exception e) {  }										
				}	
				
			}
		} );
		tr2.start();
		for( int i = 0; i<5; i++ ){
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		}
		
		// 4. p529 : Thread 클래스 객체
		System.out.println("Thread 클래스");
		BeepThread thread3 = new BeepThread();
		thread3.start();
		
		for( int i = 0; i<5; i++ ){
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		}
		
		// 5. p.530 : 클래스명 객체명 = new 생성자(){ 맴버 재정의 }; 
		System.out.println("클래스를 이용한 익명 자식객체");
		Thread thread4 = new Thread();	// 객체 생성
		Thread thread5 = new Thread() {
				@Override
				public void run() {
					Toolkit toolkit = Toolkit.getDefaultToolkit();				  
					for( int i = 0 ; i<5; i++ ) {
						toolkit.beep();											   
					try {
						Thread.sleep(500);										
					}catch (Exception e) {  }										
					}	
					
				}
		};
		thread5.start();
		
		for( int i = 0; i<5; i++ ){
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {}
		}
		
		
		
		return; //메인함수 종료되는 시점
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	/* 											
	 컴퓨터는 멀티가 절대 안됨 / 스레드는 병렬처리를 위한 길의 갯수 , 코어는 실제 일을 하는 사람의 수.. 뇌 3개.. 코어가 많을수록 좋다
	 			
	 			
	 				관리자			노동자
	  				[스케쥴링]		여러개를 동작			프로그램 하나를 여러개 돌리는거( 메모장 3개 )
	  							[ 멀티태스킹 ]		[ 멀티프로세스 ]
	  	
	  											--> 프로세스			--> 스레드		[ 싱글 스레드 ]
	  											
	 						프로그램 [ 애플리케이션 ] --> 프로세스			--> 스레드1		[ 멀티 스레드 ]
	 																--> 스레드1		동시에 뭐파일 전송하고 채팅치고
	 											--> 프로세스			
	 			  [윈도우]	
 하드웨어[ 주기억장치 ]*운영체제*   프로그램 [ 애플리케이션 ] --> 프로세스			--> main 스레드	[ 싱글스레드 ]
	 						자바가 제어X 약간 우선순위를 줄 순 있음
	 																--> 스레드1 생성
	 																--> 스레드2 생성
	 						프로그램 [ 애플리케이션 ]
	 						
	운영체제 : 하드웨어 기계와 사람 사이의 중간다리
----------------------------------------------------------------------------------------------------
멀티스레드[ 병렬 처리 ] 호출단위
											이 순서는 내가 아니라 운영체제가 할당한 메모리 순서대로 처리해주는거고 우리가 조작못함 순파적으로 하는건데 넘 빨라서 동시처럼 느껴지느것뿐 동시는 아님
					1. main 스레드 처리
					2. 스레드2 처리
					3. 스레드1 처리
					4. 스레드2 처리
					5. main 스레드 처리		

										main 스레드
											|
											|
											|---------- 스레드 생성1
											|				|
						  스레드2생성----------|				|
							|				|				|
							|				|				|
	 */
	

