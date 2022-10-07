package java1.ch8인터페이스;

import java.util.Scanner;
import javax.swing.text.GapContent;

public class EX2_실행 {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		게임패드 gpad;											// 인터페이스 변수 선언
		while ( true ) {
			System.out.println("1. 축구 2. 비행기 : ");
			int ch = scanner.nextInt();
			if( ch == 1 ) {
				gpad = new 축구게임();							// 2. 인터페이스변수에 구현객체 주소 대입	
				게임스타트(gpad);
			}else if( ch == 2 ) {
				// 스택     힙
				// 게임패드에 비행기게임의 주소값이 들어감
				gpad = new 비행기게임();
				게임스타트(gpad);
			}
		
		}
		
		// 닌텐도 기기가 인터페이스고 칩이 구현객체.. 를 메소드로 전달해서↓
	}
	public static void 게임스타트( 게임패드 gpad랑달라도됨 ) {
		while( true ) {
			char 버튼 = scanner.next().charAt(0);
			if( 버튼 == 'A' ) { gpad랑달라도됨.A버튼(); }
			if( 버튼 == 'B' ) { gpad랑달라도됨.B버튼(); }
			if( 버튼 == 'C' ) { gpad랑달라도됨.C버튼(); }
			if( 버튼 == 'E' ) { return; }
		}
	}
	
}
