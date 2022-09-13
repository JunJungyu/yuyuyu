package java1.EX4;

public class EX4실행 {

	public static void main(String[] args) {
		
		// 1. 객체 선언 [ 오류 발생 : 생성자에 매개변수 생략 ]
		Car myCar = new Car();	 // 기본 생성자가 없기 때문에
		
		myCar.color = "검정";
		myCar.cc = 3000;
		
		// 2. 객체 선언
		Car myCar2 = new Car( "검정" , 3000 );
		
	}
	
}
