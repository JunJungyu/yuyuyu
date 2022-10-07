package java1.ch8인터페이스;

public class KumgoTire implements Tire{
	@Override
	public void roll() {						// (2) 각자 roll이 뭔지 기능 부여하고
		System.out.println("금호타이어가 굴러갑니다.");	
	}
}
