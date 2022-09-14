package java1.ch5클래스.EX5.EX10;

public class Car { // 클래스 [ 설계도 : 변수 서언 , 메소드 선언 ]
	// 1. 필드
	int gas;	// gas 수량을 저장하는 int형 필드[변수]
	// 2. 생성자
	// 3. 메소드
	
	// 1. 반환값X 매개변수 1개
	void setGas( int gas ) { this.gas = gas; return; }
	
	// 2. 반환값 boolean 매개변수X
	
		// 1. 현재 동일한 클래스의 메소드 호출 [ 내부 메소드 호출 ]
		setGas(5);
		// 2. 서로 다른 클래스이 메소드 호출 [ 외부 메소드 호출 ]
		Car car - new Car();
		car.setGas( 5 );	// 객체명.메소드명()
	
	boolean isLeftGas() {
		if( gas == 0 ) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	// 3. 반환값X 매개변수X
	void run() {
		while( true ) { // 무한반복
			if( gas > 0 ) { // 만일 가스 변수가 0보다 크면
				System.out.println("달립니다.[gas잔량"+gas+"]");
				gas -= 1; // 가스 1 감소
			}else {
				System.out.println("멈춥니다.[gas잔량"+gas+"]");
				return; // 함수 종료 // 무한루프 종료
				
			}
		}//w e  / /while문 이후에 코드가 존재하지 않기 때문에 return과 break문이 차이가 없다.
	}//m e
	
}
