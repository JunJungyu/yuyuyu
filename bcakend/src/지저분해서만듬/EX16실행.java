package 지저분해서만듬;

public class EX16실행 {

	public static void main(String[] args) {
	
		// 객체 선언 [ 클래스명 객체명 = new 셍성자(); ]
		//
		//Singleten s1 = new Singleten();	// 오류 : 생성자 private
		//Singleten s2 = new Singleten();	// 오류 : 생성자 private
		
		//Singleten.s1;					// 오류 : s1 객체 private
		Singleten s3 = Singleten.getInstance();
		Singleten s4 =  Singleten.getInstance();
		//s3 과 s4는 객체는 같다
		if( s3 == s4 ) {// == 스택값 비교 .equals() : 힙값 비교
			System.out.println("주소값이 같다");
		}else {
				System.out.println("다르다.");
		}
	
	}
}
