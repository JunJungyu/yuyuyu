package java1.ch7상속.타이어;


public class EX5_실행 {

	public static void main(String[] args) {
		
		// 1. 자동차 생성
		Car car = new Car();	// tire 객체가 4개
		 
		// 2. 자동차 5번 회전
		for( int i = 1 ; i <= 3; i++ ) {
			
			boolean[] result = car.run();
			
			// 만약에 펑크이면 타이어 교체
			if( !result[0] ) {
				System.out.println("앞왼쪽 현대타이어로 교체");
				car.frontLefttire = new HankookTire( 15 , "앞왼쪽" );
			}if( !result[1] ) {
				System.out.println("앞오른쪽 현대타이어로 교체");
				car.frontRightire = new HankookTire( 13 , "앞오른쪽" );
			}if( !result[2] ) {
				System.out.println("뒤 왼쪽 금호 타이어로 교체");
				car.backLefttire = new KumhoTire( 14 , "뒤왼쪽" );
			}if( !result[3] ) {
				System.out.println("뒤 오른쪽 금호 타이어로 교체");
				car.backRighttire = new KumhoTire( 17 , "뒤오른쪽" );
			}
			System.out.println("---------------------------------------------------");
		}
	}
	
}
