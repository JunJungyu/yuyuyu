package java1.ch_2연산자;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class EX2_String메소드 {

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		//scanner.next().charAt(0);					// 스캐너엔 char이 없어서 이렇게 하면 하나 가져올 수 있음
		
		// 1. 문자열.CharAt( 인덱스 ) : 해당 인덱스의 문자 추출★
		String ssn = "010624-1230123";				// 문자열
		char sex = ssn.charAt(7);					// 1
			System.out.println( sex ); 				// 7 나옴
		
		switch ( sex ) {
		case '1' :
		case '3' :
			System.out.println("남자입니다.");
			break;
		case '2' : 
		case '4' : 
			System.out.println("여자입니다.");
			break;
		}
	
		// 2. .equals(문자열2) : 두 문자열 비교
		String strVar1 = new String("신문철");
		String strVar2 = "신문철";					// String은 객체인데 돼 new 안쓰나요? "" : String 뜻함
		// 정수 기본형은 int / 실수는 double / 문자열 String 이기 때문에? 자동완성도 뜨고 new도 안써도 됨
		
		if( strVar1 == strVar2 ) {
			System.out.println("( 스택값이 같다. )같은 String 객체를 참조합니다.");						// 주소값이 같은 경우는 없어?
		}else {System.out.println("( 스택값이 다르다. )다른 String 객체를 참조합니다.");}
	
		if( strVar1.equals(strVar2) ) {
			System.out.println("( 힙 값이 같다. )같은 문자열을 가짐.");
		}else {System.out.println("( 힙 값이 다르다. )다른 문자열을 가짐.");}
	
		// 3. getByte ( 인코딩타입 ) : 
		String str = "안녕하세요";
		byte[] bytes1 = str.getBytes();						// 인코딩타입 생략시 : 1. java버전 2. 프로젝트 설정
		System.out.println("길이 : "+bytes1.length);			// 한글자당 3바이트니까
		String str1 = new String(bytes1);
		System.out.println("바이트열 -> 문자열 : "+str1);
		
		try {
			// EUC-KR : 한글/영문 지원	영문 1바이트 한글 2바이트
			byte[] bytes2 = str.getBytes("EUC-KR");
			
			System.out.println( "문자열 -> 바이트열(EUC-KR)" + bytes2.length );
			String str2 = new String( bytes2 , "EUC-KR" );
			
			// UTF-8	: 전세계언어 지원	영문 1바이트 한글 3바이트
			byte[] bytes3 = str.getBytes("UTF-8");
				System.out.println(" 문자열 -> 바이트열(UTF-8) : "+bytes3.length);
			String str3 = new String( bytes3 , "UTF-8" );
				System.out.println(" 바이트열 -> 문자열 : " + bytes3 );
			
			} catch (UnsupportedEncodingException e) {e.printStackTrace();}
		
		// 4. indexOf( 문자 ) : 해당 인덱스의 문자 인덱스 찾기
		//                0123				// 공백도 쳐줌
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		
		System.out.println( subject.indexOf("프로그래밍") );		// 3나옴 문자열 시작(프) 가 3번 인덱스니까
		
		if( location != -1 ) {									// 인덱스는 0부터 커지니까 마이너스는 존재하지 않음
			System.out.println("찾았다!");
		}else { System.out.println("못찾았다.."); }
	
		// 5. length() : 문자열 길이
		String ssn2 = "123456789123456789";
		int length = ssn2.length();
		
		if( length == 13 ) {
			System.out.println("주민번호 자리수가 맞습니다.");
		}else {System.out.println("주민번호 자리수가 틀립니다.");}
		
		
		// 6. replace() : 치환 컨트롤에프같넹
		String oldStr = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		
		// 2. 여기에 저장 / 1. 치환하고
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		// 7. 대소문자 변환
		String str2 = "Java Programing";
		
		// toLowerCase() : 소문자 변환 / toUpperCase() : 대문자 변환
		
		System.out.println( "모두 소문자 변환"+str2.toLowerCase() ); 			// 다 소문자로 변환시켜줌
		System.out.println( "모두 대문자 변환" + str2.toUpperCase() );			// 다 대문자로 변환시켜줌
		
		// 8. trim() - 사이공백은 안지우고 양쪽 끝 공백만 지워줌
		String tel1 = "       2           ";
		String tel2 = "  1  2      3      ";
		String tel3 = "        1 2 3      ";
		System.out.println( tel1.trim() );
		System.out.println( tel2.trim() );
		System.out.println( tel3.trim() );
	
		// 9. valueOf() : 다른 자료형 --> 문자열( String ) 변환
		System.out.println( 10+"" );	 				// 정수형 10 -> 문자열 10 출력
		System.out.println( String.valueOf(10.5)  );	// 정수형 10.5 -> 문자열 10.5 변환
		System.out.println( String.valueOf(true) );		// 논리형 true -> 문자열 true 변환
		
		// 10. substring( [ 시작 인덱스(포함) ] , [ 끝 인덱스(제외) ] ) : 문자열 자르기
		String ssn3 = "880815-1234567";
			// 0번 : 8	6번 : ~
		String filstNum = ssn3.substring( 0 , 6 );		// 0번째부터 6번째까지
		System.out.println( filstNum );					// 880815 나옴
			// 7번 : 1	생략 : 끝까지 1234567
		String secondNum = ssn3.substring(7);
		System.out.println(secondNum);
		
		// 11. split( "자르기 기준 문자" )					split(문자기준)자르고자하는 문자가 정확하면 이걸 쓰고 아니면 substring(위치기준)
		String[] result = ssn3.split("-");
			// "-" 기준으로 잘랐기 때문에 String 2개니까 배열에 담아서 출력하는거임
		System.out.println( result[0] );
		System.out.println( result[1] );
		
		"ASD".contains("A"); 	//포함되어있으면
		
		
		
		
		
		
		
		
		
		
	}
}
