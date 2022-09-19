package java1.ch5.EX14_인스턴스맴버;

public class Car {

	// 클래스의 맴버구성
	// 1. 필드
	String model;
	int speed;
	
	// 2. 생성자
		// 객체 선언 시 객체 필드의 초기값 설정
		// 클래스명 객체명 = new 생성자();
	
	Car(String model) {
		// 생성자명( 인수 ){ 필드 초기화 } 
		//model = model; // [X] 현재클래스의 model 필드명과 매개변수명 동일할 경우 식별 불가능 - this가 내꺼라는걸 알리기위한..? 그런것..
		this.model = model;
		//this 키워드 : 자신(나)
			// this.필드명  		: 현재 클래스의 필드 호출
			// this.메소드명		: 현재 클래스의 메소드 호출
			// this(  )			: 현재 클래스의 생성자 호출
	}
	
	// 3. 메소드
	void setSpeed( int speed ) { // 매개변수 speed
		this.speed = speed; }
	
	void run(
			for ( int i = 10; i<=50; i++ ) {
				this.setSpeed(i);
				System.out.println( this.model + "가 달립니다.(시속 : " +this.speed+ "km/h)");
			})
	
}
