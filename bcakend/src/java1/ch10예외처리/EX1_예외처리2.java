package java1.ch10예외처리;

public class EX1_예외처리2 {

	// 필드
	
	// 생성자
	
		
	public static void main(String[] args) { // 클래스에서 기본 메소드를 찾을 수 없습니다. 다음 형식으로 기본 메소드를 정의하십시오. public static void main(String[] args)	args 지우면 이렇게 뜸
		
		// 0. 
		try {
			Class clazz = Class.forName("java.leng.String2");			
		} catch (Exception 변수명아무거나 ) { System.out.println( "클래스가 존재하지 않습니다." + 변수명아무거나); }
		finally {
			System.out.println("\n\t클래스를 찾던 안찾던 무조건 등장!\n");
		}

		
		
		//1. NullPointer
		
		try {
			String data = null;	// 쓰레기~ 
			System.out.println( data.toString() );	// "toString" 메서드는 객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메소드 / 근데 이건 null이라 주소가 겂으니까 안됨 / 객체가 없는데 객체값 부르니까
		} catch ( NullPointerException e) { System.out.println( "객체의 내용이 없습니다. [ 참조없다 ]" + e ); }
		

		
		
		// 2. ArrayIndexOutOfBounds
		
		try {
			System.out.println( args );		// [Ljava.lang.String;@3d012ddd 배열이 들어있음
			 String data1 = args[0];		// 오류가 뜸 / 인덱스 길이가 0이기 때문에
			 String data2 = args[1];		// 하지만 run con~ a~ 에서 값을 넣어주면? 디폴트값이 설정돼서 출력됨
			 System.out.println( "아" + data1 );
			 System.out.println( data2 );
		} catch ( ArrayIndexOutOfBoundsException e) {System.out.println("배열의 인덱스가 없습니다" + e );}

		
		try {
			int[] 정수배열 = new int[3];
			for( int i = 0 ; i <정수배열.length; i++ ) {		//	조건문  i <정수배열.length; 이거나  i <=정수배열.length -1; 로 해야됨 / 인덱스는 0 1 2 니까 / 길이는 하나 둘 세개
				System.out.println( 정수배열[i] );}
		} catch ( ArrayIndexOutOfBoundsException e) { System.out.println("배열에 없는 인덱스입니다" + e ); }

			
			
		
		
			// 3. NumberFormat		// 자료형 입력 안했을때 기본적으로 설정되는 자료형
									// 문자열 100 / 큰따옴표안에 있으면 기본 자료형이 String임
			// int 정수 = 123;			// int에 저장되기 전 123은 무슨 자료형? 정수는 int	 / 실수 3.3은 Double  / 'A' <- char
		
		try {
		String data1 = "100";
		String data2 = "a100";
		
			// 메소드 호출 방법 중 하나 : static 메소드는 : 힙 없이 클래스명.메소드명()
		int values1 = Integer.parseInt(data1);	//	"100" --> 100
		int values2 = Integer.parseInt(data2);	// "a100" --> x
		
		int result3 = values1 + values2;		// 안됨
		System.out.println( (data1 + data2) +"="+ result3 );
		}catch ( NumberFormatException e) {System.out.println("정수형으로 변환 실패 : " + e);}
	
		
		try {
		// 1. 자식 객체 선언
		Dog dog = new Dog();
		changeDog( dog );
		
		// 2. 자식 객체 선언
		Cat cat = new Cat();	//	위는 정상 실행
		changeDog( cat ); 	// 예외가 발생한 시점부터 chach로 이동		// main밖에 Dog dog = (Dog)animal; 로 되어있어서 캣이랑 도그 관련 없응께 안됨 오류~!
		}catch ( ClassCastException e) {System.out.println("클래스형 변환 실패 : " + e);}
		
	}// main end
	
	public static void changeDog( Animal animal ) {
		if( animal instanceof Dog ) {
			Dog dog = (Dog)animal;
			System.out.println("개로 변환");
		}
		System.out.println("고양이는 물기 변환?");
	}
	
	
}
/*
		스택						        	힙	

		지역변수-함수안에서만 씀/주소값 가짐			객체
		(메소드)

*/