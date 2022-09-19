package java1.ch5.EX14_인스턴스맴버;

public class EX14실행 {

	public static void main(String[] args) {
		
		// 1. 객체 선언
		// 클래스명 변수명 객체명 = new 생성자
		
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
	}
	
}
