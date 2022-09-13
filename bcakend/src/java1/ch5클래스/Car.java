package java1.ch5클래스;

public class Car {
	// 맴버
	// 1. 필드 : 데이터를 저장하는 곳
		// 1. 기본자료형의 변수 , 객체 , 배열 , 인터페이스 등
		// 2. 초기화 : 선언과 동시에 처음값 대입
			/*
			 	정수형 : 0
			 	실수형 : 0.0
			 	논리 : false
			 	참조[ 객체/배열/인터페이스 ] : null
			 
			 */
	String company = "현대자동차";		// String은 new 생략 가능
	String model = "그렌저";			// 객체
	String color = "검정";
	int maxSpeed = 350;				// 변수
	int speed;						// 변수 : 0
}
