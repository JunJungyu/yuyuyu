package java1.ch8인터페이스;

public class EX3_실행 {
	
	public static void main(String[] args) {
	
		Car myCar = new Car();		// (3) 여기서 객체 선언을 하면?
	
		myCar.run();				// (4) class Car를 실행할건데
		
		// (5) 여기서 Car 객체의 구성을 바꿔주고..? 
		// 구현객체 교체									// 원래는 한국타이어였는데
		myCar.frontleftTire = new KumgoTire();			// 여기서 자동 형변환?
		myCar.frontrightTire = new KumgoTire();			// 동일한 인터페이스..?
		
		
		myCar.run();
	}

	
}
