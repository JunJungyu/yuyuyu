package java1.ch12스레드.타이머스레드;



public class Timer extends Thread {
							// A클래스 extends B클래스 : 상속 [ 연장 ]
							// A클래스 = 자식클래스	B클래스 = 자식클래스	
							// A클래스는 B클래스의 맴버(필드 , 생성자 , 메소드) 접근할 수 있다.
	
	private Boolean stop = true;	// 
	private boolean wait = true;
		
	public void setStop(boolean stop) { this.stop = stop; }
	public void setWait(boolean wait) { this.wait = wait; }

	@Override				// 부모클래스의 이미 존재하는 메소드 재정의한다.
public void run() {		// 무조건 run main처럼 함수를 켜주는 역할
			초단위();
	}
	
	
	public void 초단위() {
		int i = 1 ;			// i는 1인데
		while( stop ) {				// 외부에서 start변수를 조작해서  
			if( wait ) {
			System.out.println(i+"초");	// 출력
			try {
			Thread.sleep(1000);			// 1초
			
			} catch (Exception e) {}
			i++;						// i가 1씩 커짐
			}
		}
	}
	
}
