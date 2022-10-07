package java1.ch8인터페이스;

public class Bus implements Vehicle{
	
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
	public void checkFare() {				// 본인꺼?
		System.out.println("승차요금 체크합니다.");
	}
}
