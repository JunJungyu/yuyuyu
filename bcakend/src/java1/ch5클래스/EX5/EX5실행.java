package java1.ch5클래스.EX5;

public class EX5실행 {

	private void name() {
		
		// 1. 객체 선언 : 빈생성자
		Car car1 = new Car();
		
		// 2. 객체 선언 : 매개변수가 1개인 생성자
		Car car2 = new Car( "자가용" );
		
		// 3. 객체 선언 : 매개변수가 2개인 생성자  
		Car car3 = new Car( "자가용" , "빨강" );
		
		// 4. 객체 선언 : 매개변수가 3개인 생성자  
		Car car4 = new Car( "택시" , "검정" , 200 ); 
		
		
	}
}
