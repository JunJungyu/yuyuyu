package java1.ch12스레드;

public class Music extends Thread {
	
	// on/off 저장하는 변수 // run 메소드의 무한루프 제어하는 변수
	private boolean stop = true;	// run 메소드의 무한루프 제어하는 변수
	
	public void setStop( boolean stop ) {
		this.stop = stop;
	}
	
	@Override
	public void run() {
		
		while ( stop ) {
		System.out.println("음악재생중~");
			try {
					Thread.sleep(1000);
			} catch (Exception e) {}
		}
		
	}
	
	
}
