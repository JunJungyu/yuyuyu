package java1.ch5클래스.EX5.EX9;

import java.util.Scanner;

public class EX9실행 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 1. 객체 생성
		Calculator myCalc = new Calculator();
		
		// 2. 메소드 호출( 매개변수X 반환값X ) [ 객체명.메소드명(); ]
		myCalc.powerOn();
		
		// 3. 메소드 호출 ( 매개변수 2개 , 반환값 1개 )
		myCalc.plus( 5 , 6 );
		int result1 = myCalc.plus( 5, 6 );
		
		System.out.println("result : " + result1);
		
		// 3. 
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide( x , y );
		System.out.println("result2 : " + result2);
		
		// 4. 
		myCalc.powerOff();
		
	}
}
