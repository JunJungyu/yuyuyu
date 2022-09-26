package java1.ch1_String;

public class EX1_String {

	public static void main(String[] args) {
		
		// 기본자료형으로는 문자열 저장 X -> String 클래스 사용
		// byte -> 문자	 byte[] -> 문자열
		// 키보드 입력 -- 스트림(byte) --> 컴퓨터
		// byte ----> string 생성자
		
		byte b = 72;		// [숫자]
		char c = (char)b;	// 강제형변환
		System.out.println( c ); 	// 결과 : H
		// [ char 기능 = ( 자바기준 )유니코드 변환 ] 72 -> H
		// 컴퓨터는 기본적으로 아스키코드를 사용하고 아스키코드에서 72 = H임
						// h   e    l      l     o    공백  j    a     v   a
		byte[] bytes = { 72 , 101 , 108 , 108 , 111 , 32, 74 , 97 , 118 , 97 };
		char[] chars = new char[10];
		// char[] 문자열 = 이 방법은 귀찮으니까
		
		// for 사용하는 방법
			System.out.println("1번");
			for( int i = 0; i<bytes.length; i++ ) {
				System.out.print( (char)bytes[i]);
			}
			
		// 강제형변환??
			System.out.println("\n2번");
			for( int i = 0; i<chars.length; i++ ) {
				System.out.print( chars[i] );
			}
			
		// 뭔소리고.. 여튼 이렇게하면 편하다
			String str1 = new String( bytes );	System.out.println( "\n" + str1 );   
			
		// 여섯번째부터 4개
			String str2 = new String( bytes , 6 , 4 );	System.out.println( str2 );  
			
		// 2. 
		byte[] bytes2 = new byte[100];
		
		System.out.println(" 입력 : ");
		
		try { int readByteNo = System.in.read( bytes2 ); 				// System.in.read 무조건 예외처리 뜨니까 try쓰고 ( bytes2 ) 입력받은걸 여기에 저장
		
		//for( int i = 0; i <=bytes2.length; i++ ) {					// readByteNo : 읽어온 바이트수 저장하는 변수
		//	System.out.println( bytes2[i] );}
		
		String str3 = new String( bytes2 , 0 , readByteNo-2 );			// bytes2 인데 0번째부터 readByteNo에서 -2한 순서까지 넣는다..!
		System.out.println( str3 );
		System.out.println("----------------------");
		
		}
		catch( Exception e ){}
		
			
			
			
			
			
			
			
			
	}
}
