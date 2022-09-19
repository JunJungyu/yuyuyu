package java1.EX15_정적맴버;

public class 실행 {

		public static void main(String[] args) {
			
			// 정적 맴버 호출
			 	// 클래스명.정적맴버
			double result1 = Calculator.pi2;
			Calculator.plus2( 10 , 5 );			// 정적 맴버에서는 인스턴스 못씀
			Calculator.minus2( 10 , 5 );
			
			// 주의할점 : static 맴버( 필드 , 메소드 )에서 static 아닌 맴버 호출X
			// 해결방법 : static 맴버( 필드 , 메소드 )에서 static 아닌 맴버 호출할때 모든 함수에서 같이 
			
			// 인스턴스 맴버 호출
				// 객체생성
			Calculator c = new Calculator();
			double result2 = c.pi2;
			c.plus1(10, 5);
			c.plus2(10, 5);
			
		}
	
}
