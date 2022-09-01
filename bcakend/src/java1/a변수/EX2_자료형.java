package java1.a변수;

import javax.naming.ldap.SortControl;

//1. 모든 코드는 클래스 안에서 작성
public class EX2_자료형 {//class s

	//2. 실행할 코드는 main 메소드 안에서 작성
	public static void main(String[] args) {//main s
		
		// p.61
		// 정수 타입
		// 1. byte +- 128정도
		byte 바이트변수1 = -128; System.err.println( "바이트변수1 :" + 바이트변수1 );
		byte 바이트변수2 = 127; System.err.println( "바이트변수2 :" + 바이트변수2 );
		//byte 바이트변수3 = 128; System.err.println( "바이트변수3 :" + 바이트변수3 );	오류발생 : 저장 범위 초과	128은 안됨 127까지 됨.
		
		// 2. char [ 한글자 ] : 유니코드
			// 문자[1개 ] 입력시 : ' ' 작은 따옴표
			// 문자열[여러개] 입력시 : " " 큰따옴표
		char 문자변수1 = 65; 		System.out.println("문자변수1 :" + 문자변수1);
		//아스키코드로 a가 65임 그냥 약속
		char 문자변수2 = 'A';		System.out.println("문자변수2 :" + 문자변수2);
		int 문자변수3 = 'A'; System.out.println("문자변수3 :" + 문자변수3);
		char 문자변수4 = '가'; System.out.println("문자변수4 :" + 문자변수4);
			int 문자변수5 = '가'; System.out.println("문자변수5 :" + 문자변수5);
		
		// 3. short [ 10진수 ] : +-3만 정도
			short 쇼트변수1 = 30000;	System.out.println("쇼트변수1 :" + 쇼트변수1);
				//short 쇼트번수2 = 40000; System.out.println("쇼트면수2: " + 쇼트변수2);
			
		// 4. int [ * 정수 기본 자료형 ] : +-20억 정도
			int 인트변수1 = 1000000000; System.out.println("인트변수1 :" + 인트변수1);
				// int 인트변수2 = 3000000000; System.out.println("인트변수2 :" + 인트변수2);
		// 5. long[ - 입력숫자뒤에 L ] : int 이상
			long 롱변수1 = 1000000000; System.out.println("롱변수1 :" + 롱변수1);
			long 롱변수2 = 1000000000L; System.out.println("롱변수1 :" + 롱변수2);

		// 실수타입
			// 1.float		[소수점 7자리]
			// 2.double 	[ *실수 기본 자료형 ]	[소수점 15자리]
			float 실수1 = 3.14F; System.out.println("실수1 :" + 실수1); //기본형이 double이니까 뒤에 f 써주기
			double 실수2 = 3.14; System.out.println("실수2 : " + 실수2);
			
			double 실수3 = 0.523456225568923898745623365879854654;
			System.out.println("실수3 :" + 실수3);
			float 실수4 = 0.4657855125441255744125454549F;
			System.out.println("실수4 :" + 실수4);
			
			//논리 타입
				// 1. bolean " ture 혹은 false
			boolean 논리변수1 = ture; System.out.println("논리변수1 : " + 논리변수1);
			//boolean 논리변수1 = 10;	/오류발생 [  ]
			
			
			
			
		int var1 = 0b1011; //2진수 [ 0B : 2진수 작성 가능 ]
		System.out.println("2진수 [1011 int(10진수)--> 11] :" + var1);
		int var2 = 0206;	//8진수 [ 0 : 8진수 작성 가능 ]
		System.out.println("8진수 [206 int(10진수)--> 134] :" + var2);
		int var3 = 365;
		System.out.println("10진수 [365 int(10진수)--> 365] : " + var3);
		int var4 = 0xb3;
		System.out.println("16진수 [b3 --int(10진수)--> 179] : " + var4);
		
		
		
	}//main e
	
}//class e

/*
 	진수
 		*이진수를 다른 진수로 변환해서 다양한 표현 단위 사용할 수 있다.
 		2진수			0,1	[ 기계어 , 이진코드 ] 문제 : 표현단위 적다  -> 8진수 , 10진수 , 16진수 많은 단위 표현 가능
 		8진수			0,1,2,3,4,5,6,7
 		10진수		0,1,2,3,4,5,6,7,8,9		[ 사람이 사용하는 일상 숫자단위 ]
 		16진수		0,1,2,3,4,5,6,7,8,9,a(10),b(11),c(12),d(13),e(14),f(15)
 					10 ---> 16
 
 	용량
 		bit : 0 혹은 1				[ 1bit -> 0 혹은 1 ] 
 		byte " bit의 8자리 -> 1byte	[ 1byte -> 01010101 -> 8bit ]
 		Kbrte : 1024byte -> 1kbyte
 		Mbyte : 1024kb -> 1mb
 		GB : 1024MB -> 1GB
 	
 	자료형
 		* 미리 만들어진 변수의 크기[상자]
 		* * 효율적으로 저장할 데이터의 변수크기 선택해서 사용하기
 		1. 정수타입
 			1. byte		1바이트	+-100정도
 			2. char		2바이트	유니코드 [영/한글] 한문자
 			3. short	2바이트	+-3만 정도
 			4. int		4바이트	+-20억 정도
 			5. long		8바이트	+-20억 이상 정도
 		2. 실수타입
 			1. float	소수점 8자리 표현
 			2. double	소수점 15자리 표현
 		3. 논리타입
 			1. boolean	true.false
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */