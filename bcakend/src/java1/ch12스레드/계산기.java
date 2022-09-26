package java1.ch12스레드;

public class 계산기 {

	private int 저장소;
	
	public int get저장소() { return 저장소; }

	public synchronized void set저장소( int 저장 ) {	//  synchronized : 동기화 / 웨이팅 생기게 만들어서 / 대기중에 다른 사람이 계산기 못쓰게 막아줌
		this.저장소 = 저장;
		// 1. 스레드에 시간차 두기
		try { Thread.sleep(2000);		
		} catch (Exception e) {}
		System.out.println( Thread.currentThread().getName()+" : " + this.저장소 );
	}









}
